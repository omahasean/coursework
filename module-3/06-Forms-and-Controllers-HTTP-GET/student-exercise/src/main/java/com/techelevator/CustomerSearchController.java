package com.techelevator;

import com.techelevator.dao.CustomerDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    
    @RequestMapping("/")
    public String showCustomerSearchForm(HttpServletRequest request) {
    	return "customerList";
    }
    @RequestMapping("/customerSearchResults")
    public String showCustomerSearchFormResults(HttpServletRequest request) {
    	
    	String search = request.getParameter("nameSearch");
    	String sort = request.getParameter("sort");
    	
    	request.setAttribute("customers", customerDao.searchAndSortCustomers(search, sort));
    	
    	return "customerList";
    }
}