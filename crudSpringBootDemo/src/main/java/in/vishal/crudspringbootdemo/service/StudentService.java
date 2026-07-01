package in.vishal.crudspringbootdemo.service;

import in.vishal.crudspringbootdemo.entity.Student;
import in.vishal.crudspringbootdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

        private StudentRepository studentRepository;
        public StudentService(StudentRepository studentRepository) {
                this.studentRepository = studentRepository;
        }

        public Student createStudent(Student student) {
                student.setDeleted(false);
                Student studentResponse = studentRepository.save(student);
                return studentResponse;
        }

        public Student getStudent(Long id) {

                Optional<Student> studentResponse =  studentRepository.findByIdAndDeletedIsFalse(id);
                if(studentResponse.isPresent()) {
                        return studentResponse.get();
                }
                 return  null;
        }

        public List<Student> getAllStudent() {
                return studentRepository.findByDeletedIsFalse();
        }

        public Student updateStudent(Long id, Student student) {
                Optional<Student> studentExist =  studentRepository.findByIdAndDeletedIsFalse(id);
                if(studentExist.isEmpty()) {
                        return null;
                }
                Student studentToSave = studentExist.get();
                studentToSave.setName(student.getName());
                studentToSave.setEmail(student.getEmail());
                studentToSave.setAge(student.getAge());
                studentToSave.setSubject(student.getSubject());
                studentToSave.setRoll(student.getRoll());
                studentToSave.setDeleted(false);

                return studentRepository.save(studentToSave);

        }

        public Boolean deleteStudent(Long id) {
                 Boolean isStudent = studentRepository.existsById(id);
                 if(!isStudent) {
                         return false;
                 }
                 studentRepository.deleteById(id);
                 return true;
        }

        public Boolean deleteStudentSoftly(Long id) {
                Optional<Student> studentExist = studentRepository.findByIdAndDeletedIsFalse(id);

                if(studentExist.isEmpty()) {
                        return false;
                }
                Student studentToSave=  studentExist.get();
                studentToSave.setDeleted(true);
                studentRepository.save(studentToSave);
                return true;

        }
}
