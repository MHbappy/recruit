package com.job.controller;

import com.job.model.CallForWrittenExam;
import com.job.service.CallForWrittenExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by bappy on 5/21/17.
 */

@Controller
public class ACallForWrittenExamController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(AdminController.class);

    private CallForWrittenExamService callForWrittenExamService;

    @Autowired
    public void setCallForWrittenExamService(CallForWrittenExamService callForWrittenExamService) {
        this.callForWrittenExamService = callForWrittenExamService;
    }


    //tested
    @RequestMapping(value = "admin/adminWrittenNotificationList", method = RequestMethod.GET)
    public String list(Model model){

        logger.info("_____________"+callForWrittenExamService.listAllCallForWritten());

        model.addAttribute("callForWrittenExams", callForWrittenExamService.listAllCallForWritten());
        return "admin/callForWrittenExamAction/listOfCreatePost";
    }

    //tested
    @RequestMapping("admin/adminWrittenNotificationList/{id}")
    public String showProduct(@PathVariable Integer id, Model model){

        logger.info("id+++++++++"+id);
        model.addAttribute("callForWrittenExams", callForWrittenExamService.getCallForWrittenById(id));
        return "admin/callForWrittenExamAction/showOfCreatePosts";
    }

    //tested
    @RequestMapping("admin/adminWrittenNotificationDelete/{id}")
    public String delete(@PathVariable Integer id){

        logger.info("___________"+id);
        callForWrittenExamService.deleteCallForWritten(id);
        return "redirect:/admin/adminWrittenNotificationList";
    }

    @RequestMapping(value = "writtenNotification", method = RequestMethod.POST)
    public String saveProduct(CallForWrittenExam callForWrittenExam){

        logger.info("_______________________"+callForWrittenExam.toString());

        callForWrittenExamService.saveCallForWritten(callForWrittenExam);
        return "redirect:/admin/adminWrittenNotificationList";
    }


    @RequestMapping("admin/adminWrittenNotification/new")
    public String newProduct(Model model){
        model.addAttribute("callForWrittenExams", new CallForWrittenExam());

        return "admin/adminWrittenNotification";
    }


    @RequestMapping("admin/adminWrittenNotification/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("callForWrittenExams", callForWrittenExamService.getCallForWrittenById(id));
        return "admin/adminWrittenNotification";
    }

    @RequestMapping("admin/adminWrittenNotification/show/{id}")
    public String showPost(@PathVariable Integer id, Model model){
        model.addAttribute("callForWrittenExams", callForWrittenExamService.getCallForWrittenById(id));
        return "admin/callForWrittenExamAction/singleCreatePost";
    }

}
