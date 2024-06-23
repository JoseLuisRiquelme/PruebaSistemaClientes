package cl.praxis.service;

import cl.praxis.model.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorTxt extends Exportador {
    public void exportar(String fileName, List<Cliente> listaClientes, String ruta) {
        String archivoCompleto = ruta + "/" + fileName + ".txt";

        try (FileWriter writer = new FileWriter(archivoCompleto)) {

            for (Cliente cliente : listaClientes) {
                writer.write(cliente.toString() + "\n");
            }

            System.out.println("Archivo TXT exportado exitosamente a: \n" + archivoCompleto);

        } catch (IOException e) {
            System.err.println("Error al exportar el archivo TXT: " + e.getMessage());
        }
    }
}
