package com.job.controller;


import com.job.model.CallForWrittenExam;
import com.job.model.SendAppointment;
import com.job.service.CallForWrittenExamService;
import com.job.service.SendAppointmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ASendAppointmentController {

    //sendAppointmentAction
    private static final Logger logger = (Logger) LoggerFactory.getLogger(AdminController.class);

    private SendAppointmentService sendAppointmentService;

    @Autowired
    public void setSendAppointmentService(SendAppointmentService sendAppointmentService) {
        this.sendAppointmentService = sendAppointmentService;
    }

    //tested
    @RequestMapping(value = "admin/adminSendAppointmentList", method = RequestMethod.GET)
    public String list(Model model){
        logger.info("_____________"+sendAppointmentService.listAllSendAppointment());
        model.addAttribute("sendAppointment", sendAppointmentService.listAllSendAppointment());
        return "admin/sendAppointmentAction/listOfCreatePost";
    }

    //tested
    @RequestMapping("admin/adminSendAppointmentList/{id}")
    public String showProduct(@PathVariable Integer id, Model model){
        logger.info("id+++++++++"+id);
        model.addAttribute("sendAppointment", sendAppointmentService.getSendAppointmentById(id));
        return "admin/sendAppointmentAction/showOfCreatePosts";
    }

    //tested
    @RequestMapping("admin/adminSendAppointmentDelete/{id}")
    public String delete(@PathVariable Integer id){
        logger.info("___________"+id);
        sendAppointmentService.deleteSendAppointment(id);
        return "redirect:/admin/adminSendAppointmentList";
    }

    @RequestMapping(value = "sendAppointments", method = RequestMethod.POST)
    public String saveProduct(SendAppointment sendAppointment){
        logger.info("_______________________"+sendAppointment.toString());
        sendAppointmentService.saveSendAppointment(sendAppointment);
        return "redirect:/admin/adminSendAppointmentList";
    }


    @RequestMapping("admin/adminSendAppointment/new")
    public String newProduct(Model model){
        model.addAttribute("sendAppointment", new SendAppointment());
        return "admin/adminAppintmentNotification";
    }


    @RequestMapping("admin/adminSendAppointment/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("sendAppointment", sendAppointmentService.getSendAppointmentById(id));
        return "admin/adminAppintmentNotification";
    }

    @RequestMapping("admin/adminSendAppointment/show/{id}")
    public String showPost(@PathVariable Integer id, Model model){
        model.addAttribute("sendAppointment", sendAppointmentService.getSendAppointmentById(id));
        return "admin/sendAppointmentAction/singleCreatePost";
    }

}
