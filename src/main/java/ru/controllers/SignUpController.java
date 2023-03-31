package ru.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dto.SignUpForm;
import ru.services.SignUpService;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/signUp")
public class SignUpController {

    private final SignUpService signUpService;

    @RequestMapping()
    public String getSignUpPage(Model model){
        model.addAttribute("signUpForm", new SignUpForm());
        return "signUp";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String signUp(Model model, @Valid SignUpForm form, BindingResult result){

        if(result.hasErrors()){
            model.addAttribute("signUpForm", form);
            return "signUp";
        }

        signUpService.signUp(form);
        return "redirect:/signIn";
    }

}
