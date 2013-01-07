/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coredev;

import com.mycompany.coredev.dao.ScreenDao;
import com.mycompany.coredev.model.Screen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScreenController {
    @Autowired
    private ScreenDao screenDao;
    
    @RequestMapping("/screen/{id}")
    public ModelAndView displayScreen(@PathVariable Long id) {
        Screen currentScreen = screenDao.getScreenById(id);
        
        ModelAndView modelAndView = new ModelAndView("screen");
        modelAndView.addObject("screen", currentScreen);
        return modelAndView;
    }
}
