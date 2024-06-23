package cl.praxis.service;

import cl.praxis.model.Cliente;
import cl.praxis.model.CategoriaEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoServicio extends Exportador{
    ExportadorCsv exportadorCsv = new ExportadorCsv();
    ExportadorTxt exportadorTxt = new ExportadorTxt();

    public List<Cliente> importarClientes(String rutaArchivo) {
        List<Cliente> listaClientes = new ArrayList<>();
        String fileName1="DBClientes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo+'\\'+fileName1))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");


                if (datos.length == 5) {
                    String runCliente = datos[0];
                    String nombreCliente = datos[1];
                    String apellidoCliente = datos[2];
                    String  anioCliente = datos[3];
                    CategoriaEnum estado = CategoriaEnum.valueOf(datos[4]);

                    Cliente cliente = new Cliente(runCliente, nombreCliente, apellidoCliente, anioCliente, estado);
                    listaClientes.add(cliente);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato numérico: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Error en el valor del enum: " + e.getMessage());
            e.printStackTrace();
        }

        return listaClientes;
    }
    public void exportarCsv(String fileName, List<Cliente> listaClientes, String ruta){
        exportadorCsv.exportar( fileName, listaClientes, ruta);
    }

    public void exportarTxt(String fileName, List<Cliente> listaClientes, String ruta){
        exportadorTxt.exportar( fileName, listaClientes, ruta);
    }
}
