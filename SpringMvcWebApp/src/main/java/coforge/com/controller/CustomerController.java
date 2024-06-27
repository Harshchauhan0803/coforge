package coforge.com.controller;

import coforge.com.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller

@RequestMapping("/customer")

public class CustomerController {

 // @RequestMapping("/form")

 @GetMapping("/form")

 public ModelAndView form(ModelMap map) {
  Customer customer = new Customer();

  // customer.setId(10001);

  // customer.setName("ram kumar");

  // customer.setSalary(24000.0f);

  map.addAttribute("customer", customer);
  ModelAndView andView = new ModelAndView("CustomerForm", map);
  return andView;

 }

 // @RequestMapping("/customerAction")

 //@RequestMapping(value = "/customerAction", method = RequestMethod.POST)

 @PostMapping("/customerAction")

 public String customerFormProcess(@ModelAttribute("customer") @Valid Customer customer, BindingResult result) {

  if (result.hasErrors())
   return "CustomerForm";

  else
   return "CustomerResult";

 }

 @ModelAttribute("cities")

 public List<String> getCities() {

  List<String> cities = new ArrayList<String>();
  cities.add("delhi");
  cities.add("balia");
  cities.add("lucknow");
  cities.add("kolkatta");
  cities.add("mumbai");
  return cities;

 }

 @ModelAttribute("hobbies")

 public List<String> getHobbies() {

  List<String> hobbies = new ArrayList<String>();
  hobbies.add("missionary");
  hobbies.add("cowgirl");
  hobbies.add("doggy");
  hobbies.add("reverse");
  hobbies.add("69");
  return hobbies;

 }

 @ModelAttribute("gender")

 public List<String> getGender() {
	 
  List<String> gender = new ArrayList<String>();
  gender.add("male");
  gender.add("female");
  return gender;

 }

}