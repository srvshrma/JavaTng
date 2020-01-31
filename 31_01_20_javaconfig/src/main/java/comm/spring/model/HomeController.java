package comm.spring.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("user", new User());
		return "home";

	}

	@RequestMapping(method = RequestMethod.POST, path = "/processLogin")
	public String processLogin(@ModelAttribute("user") User user) {
		if ((user.getEmail().equals("admin@email.com")) && (user.getPassword().equals("admin"))
				&& (user.getCountry().equals("india"))) {
			return "process";
		} else {
			return "error";
		}
	}

}
