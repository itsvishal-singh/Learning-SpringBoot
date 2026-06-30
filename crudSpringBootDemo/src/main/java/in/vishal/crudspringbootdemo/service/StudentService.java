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
                Student studentResponse = studentRepository.save(student);
                return studentResponse;
        }

        public Student getStudent(Long id) {
                Optional<Student> studentResponse =  studentRepository.findById(id);
                if(studentResponse.isPresent()) {
                        return studentResponse.get();
                }
                 return  null;
        }

        public List<Student> getAllStudent() {
                return studentRepository.findAll();
        }

        public Student updateStudent(Long id, Student student) {
                Optional<Student> studentExist =  studentRepository.findById(id);
                if(studentExist.isEmpty()) {
                        return null;
                }
                Student studentToSave = studentExist.get();
                studentToSave.setName(student.getName());
                studentToSave.setEmail(student.getEmail());
                studentToSave.setAge(student.getAge());
                studentToSave.setSubject(student.getSubject());
                studentToSave.setRoll(student.getRoll());

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
}
