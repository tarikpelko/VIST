package com.viber_bot.car_sharing.controller;

import com.viber_bot.car_sharing.model.Route;
import com.viber_bot.car_sharing.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RouteController {
    @Autowired
    private RouteService routeService;

    @RequestMapping(value = "/routes", method = RequestMethod.GET)
    public String getAllRoutes(Model model) {
        List<Route> rList = new ArrayList<>();
        //routeService.save(new Route("test","Test", null, null, 2));
        rList = routeService.findAll();
        model.addAttribute("routes",rList);
        return "Routes";
    }


    @RequestMapping(value = "/route/{id}", method = RequestMethod.GET)
    public String getRouteById(@PathVariable("id") long id, Model model) {
        Route rt;
        rt = routeService.findById(id);
        model.addAttribute("Routes",rt);
        return "Routes";
    }

/*

    @RequestMapping(value = "/routes{id}", method = RequestMethod.DELETE)
       public void deleteRoute(Route deletedRoute) {
        routeService.deleteById(deletedRoute.getId());
    }

*/
}
