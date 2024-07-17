package thymeleafdemo.mycontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping({ "/", "" })
	public String index(Model model) {
		System.out.println("**************** > Index Controller < ****************");
		List<String> mylist=new ArrayList<String>();
		mylist.add("Arav Aryan");
		mylist.add("Ravi Priy");
		mylist.add("Ravi");
		mylist.add("Priy");
		
		model.addAttribute("data",mylist);
		
		model.addAttribute("isActive",true);
		
		model.addAttribute("gender",'F');
		
		
		
		model.addAttribute("switchData","red");
		
			
		return "index";
	}
}
