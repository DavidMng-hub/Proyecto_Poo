/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.ArrayList;

/**
 *
 * @author mbeat
 */
public class controladorMascotas {
    
 private ArrayList<cls_mascotas> listaMascotas;

    // Constructor
    public controladorMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    // Método para registrar una mascota
    public void registrarMascota(cls_mascotas nuevaMascota) {
        listaMascotas.add(nuevaMascota);
        System.out.println("Mascota registrada: " + nuevaMascota.getNombre());
    }

    // Método para obtener la lista de mascotas
    public ArrayList<cls_mascotas> getListaMascotas() {
        return listaMascotas;
    }

    // Método para buscar una mascota por ID
    public cls_mascotas buscarMascotaPorId(String id) {
        for (cls_mascotas mascota : listaMascotas) {
            if (mascota.getId().equals(id)) {
                return mascota;
            }
        }
        return null; // No encontrada
    }

    // Método para eliminar una mascota por ID
    public boolean eliminarMascotaPorId(String id) {
        cls_mascotas mascota = buscarMascotaPorId(id);
        if (mascota != null) {
            listaMascotas.remove(mascota);
            return true; // Eliminada con éxito
        }
        return false; // No encontrada
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
