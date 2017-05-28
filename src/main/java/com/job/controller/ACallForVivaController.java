package com.job.controller;

import com.job.model.CallForViva;
import com.job.service.CallForVivaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ACallForVivaController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(AdminController.class);

    private CallForVivaService callForVivaService;









    @Autowired
    public void setCallForVivaService(CallForVivaService callForVivaService) {
        this.callForVivaService = callForVivaService;
    }

    //tested
    @RequestMapping(value = "admin/adminCallForVivaList", method = RequestMethod.GET)
    public String list(Model model){

        logger.info("_____________"+callForVivaService.listAllCallForViva());

        model.addAttribute("callForViva", callForVivaService.listAllCallForViva());
        return "admin/callForVivaAction/listOfCreatePost";
    }

    //tested
    @RequestMapping("admin/adminCallForVivaList/{id}")
    public String showProduct(@PathVariable Integer id, Model model){

        logger.info("id+++++++++"+id);
        model.addAttribute("callForViva", callForVivaService.getCallForVivaById(id));
        return "admin/callForVivaAction/showOfCreatePosts";
    }

    //tested
    @RequestMapping("admin/adminCallForVivaDelete/{id}")
    public String delete(@PathVariable Integer id){

        logger.info("___________"+id);
        callForVivaService.deleteCallForViva(id);
        return "redirect:/admin/adminCallForVivaList";
    }

    @RequestMapping(value = "callForVivaa", method = RequestMethod.POST)
    public String saveProduct(CallForViva callForViva){
        logger.info("_______________________"+callForViva.toString());
        callForVivaService.saveCallForViva(callForViva);
        return "redirect:/admin/adminCallForVivaList";
    }

    @RequestMapping("admin/adminCallForViva/new")
    public String newProduct(Model model){
        model.addAttribute("callForViva", new CallForViva());
        return "admin/adminVivaNotification";
    }

    @RequestMapping("admin/adminCallForViva/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("callForViva", callForVivaService.getCallForVivaById(id));
        return "admin/adminVivaNotification";
    }

    @RequestMapping("admin/adminCallForViva/show/{id}")
    public String showPost(@PathVariable Integer id, Model model){
        model.addAttribute("callForViva", callForVivaService.getCallForVivaById(id));
        return "admin/callForVivaAction/singleCreatePost";
    }





}
