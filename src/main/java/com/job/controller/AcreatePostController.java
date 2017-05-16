package com.job.controller;

import com.job.model.CreatePost;
import com.job.service.CreatePostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AcreatePostController {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(AdminController.class);

    private CreatePostService createPostService;

    @Autowired
    public void setCreatePostService(CreatePostService createPostService) {
        this.createPostService = createPostService;
    }

    @RequestMapping(value="/admin/adminCreatePost", method = RequestMethod.GET)
    public ModelAndView adminCreatePost(){
        ModelAndView modelAndView = new ModelAndView();

//      logger.info("_____________"+createPostService.getCreatePostById(1).toString());

//      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		User user = userService.findUserByEmail(auth.getName());
//		modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
//		modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("admin/adminCreatePost");
        return modelAndView;
    }
//tested
    @RequestMapping(value = "admin/adminCreatePostList", method = RequestMethod.GET)
    public String list(Model model){

        logger.info("_____________"+createPostService.listAllProducts());

        model.addAttribute("createPosts", createPostService.listAllProducts());
        return "admin/action/listOfCreatePost";
    }
    //tested
    @RequestMapping("admin/adminCreatePostList/{id}")
    public String showProduct(@PathVariable Integer id, Model model){

        logger.info("id+++++++++"+id);
        model.addAttribute("createPosts", createPostService.getCreatePostById(id));
        return "admin/action/showOfCreatePosts";
    }

     //tested
    @RequestMapping("admin/adminCreatePostDelete/{id}")
    public String delete(@PathVariable Integer id){

        logger.info("___________"+id);
        createPostService.deleteCreatePost(id);
        return "redirect:/admin/adminCreatePostList";
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String saveProduct(CreatePost createPost){

        logger.info("_______________________");

        logger.info("+++++++++++++"+createPost.toString());

        createPostService.saveCreatePost(createPost);
        return "redirect:/admin/adminCreatePost";
    }


        @RequestMapping("admin/adminCreatePost/new")
    public String newProduct(Model model){
        model.addAttribute("createPosts", new CreatePost());
        return "admin/adminCreatePost";
    }


    @RequestMapping("product/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("createPosts", createPostService.getCreatePostById(id));
        return "admin/adminCreatePost";
    }


}
