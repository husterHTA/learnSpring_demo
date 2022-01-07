package com.rikkei.mock_customers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rikkei.mock_customers.dto.CustomerDTO;
import com.rikkei.mock_customers.model.Customer;
import com.rikkei.mock_customers.service.CustomerService;


//tầng controller
@Controller
public class CustomerController {
	
	@Autowired		//Spring IOC tìm và tiêm Bean tương ứng trên thuộc tính chú thích
	private CustomerService service;
	
	//chức năng: hiển thị danh sách khách hàng
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Customer> listCustomers = service.listAll();
		model.addAttribute("listCustomers", listCustomers);
		
		return "index";
	}
	
	//thêm mới khách hàng
	@RequestMapping("/new")
	public String showNewCustomerPage(Model model) {
	    Customer customer = new Customer();
	    model.addAttribute("customer", customer);
	     
	    return "new_customer";
	}
	
	//lưu thông tin khách hàng
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
	    service.save(customer);
	     
	    return "redirect:/";
	}
	
	//chỉnh sửa thông tin khách hàng
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditCustomerPage(@PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("edit_customer");
	    Customer customer = service.get(id);
	    mav.addObject("customer", customer);
	     
	    return mav;
	}
	
	//xóa khách hàng
	@RequestMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable(name = "id") int id) {
	    service.delete(id);
	    return "redirect:/";       
	}
	
	@GetMapping("/getListCustomerDTO")
    public List<CustomerDTO> getListCustomerDTO() {
        return service.getListCustomerDTO();
    }
}

