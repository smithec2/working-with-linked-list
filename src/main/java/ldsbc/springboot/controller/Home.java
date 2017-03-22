package ldsbc.springboot.controller;

import javax.validation.Valid;

import ldsbc.springboot.form.Post;
import ldsbc.springboot.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedList;

@Controller
public class Home {
  
  @Autowired
  Service service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Post post) {
        return "index"; // index is the page name
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addNewPost(@Valid Post post, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        // do work here
        model.addAttribute("post", post);
        model.addAttribute("linkList", service.useLinkedList(post.getTextIn()));
        return "result";
    }
}
