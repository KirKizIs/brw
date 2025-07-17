package me.wydentis.repo;

import lombok.NonNull;

import me.wydentis.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutesRepo extends JpaRepository<Route, String> {
    @Override
    boolean existsById(@NonNull String routeId);
}
