package com.example.PruebaServicio.Controller;


import com.example.PruebaServicio.Models.Producto;
import com.example.PruebaServicio.Servicio.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService service;



    @GetMapping
    public List<Producto> listar() {
        return service.obtenerTodos();
    }


    @GetMapping("/{id}")
    public Producto buscar(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }
}
