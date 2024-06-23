package cl.praxis.service;

import cl.praxis.model.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorCsv extends Exportador{

        public void exportar(String fileName, List<Cliente> listaClientes, String ruta) {
            String archivoCompleto = ruta + "/" + fileName + ".csv";

            try (FileWriter writer = new FileWriter(archivoCompleto)) {

                writer.append("ID,Nombre,Apellido,Año,Estado\n");


                for (Cliente cliente : listaClientes) {
                    writer.append(cliente.getRuncliente()).append(",");
                    writer.append(cliente.getNombreCliente()).append(",");
                    writer.append(cliente.getApellidoCliente()).append(",");
                    writer.append(cliente.getAnioCliente()).append(",");
                    writer.append(cliente.getEstado().toString()).append("\n");
                }

                System.out.println("Archivo CSV exportado exitosamente a: \n" + archivoCompleto);

            } catch (IOException e) {
                System.err.println("Error al exportar el archivo CSV: " + e.getMessage());
            }
        }
    }
