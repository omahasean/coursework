package com.techelevator;

import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/filmSearch")
    public String showFilmSearchForm(HttpServletRequest request) {
        return "filmList";
    }
    @RequestMapping("/filmSearchResults")
    public String searchFilms(HttpServletRequest request) {
    	String minString = request.getParameter("minRunTime");
    		if(minString.equals("")) {
    			minString="0";
    		}
    	String maxString = request.getParameter("maxRunTime");
	    	if(maxString.equals("")) {
				maxString="1000";
			}
		int minLength = Integer.parseInt(minString);
		int maxLength = Integer.parseInt(maxString);
		String categoryName = request.getParameter("categoryName");
		
		request.setAttribute("films", filmDao.getFilmsBetween(categoryName, minLength, maxLength));
		
        return "filmList";
    }

}