package com.example.PruebaServicio.Servicio;

import com.example.PruebaServicio.Models.Producto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    private List<Producto> lista = new ArrayList<>();

    public ProductoService() {
        lista.add(new Producto(1L, "Laptop", 1200.0));
        lista.add(new Producto(2L, "Mouse", 25.0));
        lista.add(new Producto(3L, "Teclado", 45.0));
    }


    public List<Producto> obtenerTodos() {
        return lista;
    }


    public Producto obtenerPorId(Long id) {
        for (Producto p : lista) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
