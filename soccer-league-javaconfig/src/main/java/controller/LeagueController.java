package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/league")
public class LeagueController {
	
	@RequestMapping(method =RequestMethod.GET,path="/showForm")
	public String showForm() {
		return "add-league";
	}
	@RequestMapping(path = "/processForm")
	public String processForm(@RequestParam("title") String title,@RequestParam("year") String year,@RequestParam("season") String season,Model theModel) {
		League league=new League(title,year,season);
		theModel.addAttribute("league",league);
		return "process-league";
	}
}
