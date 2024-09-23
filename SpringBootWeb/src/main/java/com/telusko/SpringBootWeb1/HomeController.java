package com.telusko.SpringBootWeb1;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


        @RequestMapping("/")
        public String home(){
            return "index";
        }

        @RequestMapping("add")
        public ModelAndView result(@RequestParam("num1") int num , @RequestParam("num2") int num2 , ModelAndView mv){
            int result = num + num2;

            mv.addObject("result",result);
            mv.setViewName("result");

            return mv;
        }
//        @RequestMapping("add")
//        public String result(HttpServletRequest req, HttpSession session){
//            int num1 = Integer.parseInt(req.getParameter("num1"));
//            int num2 = Integer.parseInt(req.getParameter("num2"));
//            int result = num1 + num2;
//
//            session.setAttribute("result",result);
//
//            return "result.jsp";
//
//        }

//    @RequestMapping("addAlien")
//    public ModelAndView result(@RequestParam("aid") int num , @RequestParam("aname") String num2 , ModelAndView mv){
//        Alien alien = new Alien();
//        alien.setId(num);
//        alien.setAname(num2);
//        mv.addObject("result",alien);
//        mv.setViewName("result");
//
//        return mv;
//    }
    @RequestMapping("addAlien")
    public String result(Alien alien){
            return "result";
    }
    @ModelAttribute("course")
    public String courses(){
            return "Java";
    }
}
