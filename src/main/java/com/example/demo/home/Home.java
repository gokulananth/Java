package com.example.demo.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
//import java.util.HashSet;


@Controller
@SessionAttributes({"active"})
public class Home {
    @Autowired
    private HashMap<String, Object> hashmap;

    //@ExceptionHandler(value = ServletRequestBindingException.class)
    //public String exception(ServletRequestBindingException exception) {
    //    return "welcome";
    //}

    @ModelAttribute("user")
    public User user() {
        return new User();
    }

    @GetMapping("/")
    public String welcome(){
        return "welcome";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model){
        if(hashmap.containsKey(user.getUsername())){
            User hUser = ((User) hashmap.get(user.getUsername()));
            if(   hUser.getPassword().equals(user.getPassword()) && hUser.getUsername().equals(user.getUsername())){
                model.addAttribute("active",new String[]{user.getUsername(),"1"});
                ((User)hashmap.get(user.getUsername())).setStatus(1);
                System.out.println(hashmap);
                return "redirect:/home";
            }
            model.addAttribute("active",new String[]{null,"3"});
            System.out.println(hashmap);
            return "redirect:/home";
        }
        model.addAttribute("active",new String[]{null,"4"});
        System.out.println(hashmap);
        return "redirect:/home";
    }

    @GetMapping("/logout")
    public String logout(@SessionAttribute("active") String[] active){
        if(active[0]!=null && hashmap.size()!=0){
            ((User) hashmap.get(active[0])).setStatus(0);
            active[1]="0";
        }
        System.out.println(hashmap+"-----lo");
        return "redirect:/";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("user") User user, Model model){
        if(hashmap.size()!=0){
            if(hashmap.containsKey(user.getUsername())){
                User hUser = ((User) hashmap.get(user.getUsername()));
                if(   hUser.getPassword().equals(user.getPassword()) && hUser.getUsername().equals(user.getUsername())){
                    model.addAttribute("active",new String[]{user.getUsername(),"1"});
                    ((User)hashmap.get(user.getUsername())).setStatus(1);
                    System.out.println(hashmap);
                    return "redirect:/home";
                }
                model.addAttribute("active",new String[]{null,"2"});
                System.out.println(hashmap);
                return "redirect:/";
            }
            model.addAttribute("hashmap",hashmap);
            model.addAttribute("active",new String[]{user.getUsername(),"1"});
            model.addAttribute("user",user.getUsername());
            user.setStatus(1);
            hashmap.put(user.getUsername(),user);
            System.out.println(hashmap);
            return "redirect:/home";
        }
        model.addAttribute("hashmap",hashmap);
        model.addAttribute("active",new String[]{user.getUsername(),"1"});
        model.addAttribute("user",user.getUsername());
        user.setStatus(1);
        hashmap.put(user.getUsername(),user);
        System.out.println(hashmap);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String home(@SessionAttribute("active") String[] active, Model model, HttpServletResponse res){
        res.setHeader("Pragma", "No-cache");
        res.setHeader("Cache-Control", "no-store");
        model.addAttribute("active",active);
        if(active[1].equals("0")){
            return "redirect:/";
        }
        return "home";
    }

}
