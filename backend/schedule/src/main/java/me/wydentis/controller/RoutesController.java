package me.wydentis.controller;

import me.wydentis.model.Route;
import me.wydentis.service.RoutesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/routes")
public class RoutesController {

    private final RoutesService routesService;

    public RoutesController(RoutesService routesService) {
        this.routesService = routesService;
    }

    @GetMapping("/{routeId}")
    public ResponseEntity<Route> getRoute(@PathVariable String routeId) {
        return routesService.getRouteById(routeId);
    }

    @PostMapping("/add")
    public ResponseEntity<Route> addRoute(@RequestBody Route route) {
        return routesService.addRoute(route);
    }

}