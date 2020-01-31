package comm.example.model;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class StudentController {

	@InitBinder
	public void InitBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmer);
	}

	@RequestMapping("/")
	public String showForm(Model model) {

		Student student = new Student();
		model.addAttribute("student", student);
		return "studentForm";

	}

	@RequestMapping(method = RequestMethod.POST, path = "/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {

		System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());

		if (result.hasErrors()) {
			return "studentForm";
		}
		return "confirmation";

	}
}
