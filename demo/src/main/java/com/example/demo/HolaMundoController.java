package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;

@RestController
public class HolaMundoController {
    private HolaService holaService = new HolaService();

    @GetMapping("/{nombre}")
    public Map<String, Object> hola(@PathVariable String nombre, @RequestParam(required = false, defaultValue = "34") Integer edad){
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Nombre", nombre);
        respuesta.put("Edad", edad);
        respuesta.put("Mensaje", holaService.hola());
        return respuesta;
    }
}
