package in.vishal.crudspringbootdemo.controller;

import in.vishal.crudspringbootdemo.entity.Student;
import in.vishal.crudspringbootdemo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

        private StudentService studentService;
        //Constructor
        public StudentController(StudentService studentService) {
                this.studentService = studentService;
        }

        // Create
        @PostMapping("/create")
        public ResponseEntity<Student> createStudent(@RequestBody Student student) {
                Student createdStudent =  studentService.createStudent(student);
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(createdStudent);
        }
        // Read one data
        @GetMapping("/get/{id}")
        public ResponseEntity<Student> getStudentById( @PathVariable Long id ) {
                Student studentResponse = studentService.getStudent(id);

                if(studentResponse == null) {
                        return ResponseEntity.notFound().build();
                }

                return ResponseEntity.ok(studentResponse);
        }


        // Read All data
        @GetMapping("/getAll")
        public ResponseEntity<List<Student>> getAllStudentById( ) {
                List<Student> studentList = studentService.getAllStudent();

                if(studentList == null) {
                        return ResponseEntity.notFound().build();
                }

                return ResponseEntity.ok(studentList);
        }

        //Update

        @PutMapping("/update/{id}")
        public ResponseEntity<Student> updateStudent( @PathVariable Long id,
                                                      @RequestBody Student student) {
                Student studentResponse = studentService.updateStudent(id, student);

                if(studentResponse == null) {
                        return ResponseEntity.notFound().build();
                }

                return ResponseEntity.ok(studentResponse);
        }

        // Delete

        @DeleteMapping("/delete/{id}")
        public ResponseEntity<String> deleteStudent( @PathVariable Long id) {
                Boolean isDeleted = studentService.deleteStudent(id);
                if(!isDeleted) {return ResponseEntity.notFound().build();}
                return ResponseEntity.ok("Record Deleted");
        }
}
