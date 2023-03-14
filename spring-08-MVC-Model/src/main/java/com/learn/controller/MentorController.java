package com.learn.controller;

import com.learn.enums.Gender;
import com.learn.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String showTable(Model model){

        List <Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Mike", "Smith", 45,Gender.MALE));
        mentorList.add(new Mentor("Anna", "Arclean", 27, Gender.FEMALE));
        mentorList.add(new Mentor("Melissa", "Cphen", 32, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);

        return "mentor/mentor-list";

    }

}
