package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class HelloController {

	@Autowired
	ReviewDao dao;
	
	@RequestMapping("/")
	public String displayGreeting(HttpServletRequest request) {
		
		List<Review> reviewList = dao.getAllReviews();
		
		request.setAttribute("reviews", reviewList);
		
		return "greeting";
	}
	@RequestMapping(path="/", method=RequestMethod.POST)
	public String  displayGreetingResults(@RequestParam String title, @RequestParam String name, @RequestParam String rating ,@RequestParam String review) {
		
		Review post = new Review();
		
		post.setRating(Integer.parseInt(rating));
		post.setText(review);
		post.setTitle(title);
		post.setUsername(name);
		post.setDateSubmitted(LocalDateTime.now());
		
		dao.save(post);
		
		return "redirect:/";
	}
}
