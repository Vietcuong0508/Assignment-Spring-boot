package com.example.assignmentspringboot.controller;

import com.example.assignmentspringboot.entity.User;
import com.example.assignmentspringboot.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("admin/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    final UserService userService;

    @RequestMapping(path = "create", method = RequestMethod.GET)
    public String createUser(Model model) {
        model.addAttribute("user", new User());
//        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
//        model.addAttribute("listProfession", listProfession);
        return "views/users/create";
    }

    @RequestMapping(path = "create", method = RequestMethod.POST)
    public String processSaveUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("user", user);
            return "views/users/create";
        }
        userService.save(user);
        return "redirect:admin/users/list";
    }

    @RequestMapping(path = "list", method = RequestMethod.GET)
    public String fillAll(@RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "limit", defaultValue = "10") int limit, Model model) {
        model.addAttribute("userPageable", userService.findAll(page, limit));
        return "views/users/list";
    }
}
