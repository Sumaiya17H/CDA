package org.jsp.CDA.controller;
import org.jsp.CDA.entity.Department;
import org.jsp.CDA.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/department")
public class DepartmentController {

	
	 @Autowired
	    private DepartmentService departmentService;

	    @PostMapping
	    public ResponseEntity<?> saveUser( @RequestBody Department department) {
	        return departmentService.saveDepartment(department);
	    }

	    @GetMapping("/findall")
	    public ResponseEntity<?> findAlldepartment() {
	        return departmentService.findAllDepartment();
	    }

	    @GetMapping("/id/{id}")
	    public ResponseEntity<?> findDepartmentById(@PathVariable int id) {
	        return departmentService.findDepartmentById(id);
	    }

	 
	    
	  
	    
	    
	    
}
