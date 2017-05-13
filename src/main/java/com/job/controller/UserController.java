package com.job.controller;

import com.job.model.EducationInformation;
import com.job.repository.EducationInformationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by bappy on 4/22/17.
 */

@Controller
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Qualifier("educationInformationRepository")
    @Autowired
    EducationInformationRepository educationInformationRepository;

    @RequestMapping(value="/user/home", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("/user/home");
        return modelAndView;
    }



    @RequestMapping(value="/user/userEducationInfo", method = RequestMethod.GET)
    public ModelAndView userEducationInfo(){

EducationInformation educationInformation = educationInformationRepository.findById(1);
logger.info(educationInformation.toString());

        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();


//		User user = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("user/userEducationInfo");
        return modelAndView;
    }

    @RequestMapping(value="/user/userExperience", method = RequestMethod.GET)
    public ModelAndView userExperience(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("user/userExperience");
        return modelAndView;
    }

    @RequestMapping(value="/user/userGeneralInfo", method = RequestMethod.GET)
    public ModelAndView userGeneralInfo(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("user/userGeneralInfo");
        return modelAndView;
    }

    @RequestMapping(value="/user/userTrainingInformation", method = RequestMethod.GET)
    public ModelAndView userTrainingInformation(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("user/userTrainingInformation");
        return modelAndView;
    }


    //test purpose



}
