package com.example.sampleproject.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Yun Yeji
 * @fileName : mainController
 * @description
 * @since : 2023-11-01
 */
@Controller
public class MainController {

    @GetMapping("/test")
    public ModelAndView testPage() {
        ModelAndView mav = new ModelAndView("folder/test");
        return mav;
    }

}
