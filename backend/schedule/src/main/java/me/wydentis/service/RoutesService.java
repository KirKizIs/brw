package me.wydentis.service;

import me.wydentis.model.Route;
import me.wydentis.repo.RoutesRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoutesService {

    private final RoutesRepo routesRepo;

    public RoutesService(RoutesRepo routesRepo) {
        this.routesRepo = routesRepo;
    }

    public ResponseEntity<Route> getRouteById(String id) {
        Route route = routesRepo.findById(id).orElse(null);
        if (route == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(route, HttpStatus.OK);
    }

    public ResponseEntity<Route> addRoute(Route route) {
        if (routesRepo.existsById(route.getRouteId())) {
            return new ResponseEntity<>(null, HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(routesRepo.save(route), HttpStatus.CREATED);
    }

}