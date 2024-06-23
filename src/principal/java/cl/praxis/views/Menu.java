package cl.praxis.views;

import cl.praxis.model.CategoriaEnum;
import cl.praxis.model.Cliente;
import cl.praxis.service.*;
import cl.praxis.utulities.Mensaje;
import cl.praxis.utulities.Utilidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Mensaje mensaje = new Mensaje();
    private ClienteServicio clienteServicio = new ClienteServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();

    Utilidad utilidad = new Utilidad();

    Scanner sc = new Scanner(System.in);
    int op=0;

    public Menu() {

    }

    public void iniciarMenu(){
        utilidad.mostrarMensaje();
        utilidad.pausarPantalla();
        utilidad.limpiarPantalla();
        while (op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6){
        mensaje.mensajeMenu();
        op=sc.nextInt();}
        ArrayList<Cliente> listaClientes= (ArrayList<Cliente>) clienteServicio.getListaClientes();
        if(op==1){
            utilidad.limpiarPantalla();
            clienteServicio.listarClientes(listaClientes);
        }
        else  if(op==2){
            utilidad.limpiarPantalla();
            Cliente nuevoCliente= mensaje.mensajeCrearCLiente();
           clienteServicio.agregarCliente(listaClientes,nuevoCliente);
           ArrayList<Cliente> listaCLientes=(ArrayList<Cliente>) clienteServicio.getListaClientes();
            for (Cliente cliente:listaCLientes
                 ) {
                System.out.println(cliente.toString());
            }
        }
        else if(op==3){
            utilidad.limpiarPantalla();
            int op2=0;
            while (op2!=1 && op2!=2){
           mensaje.mensajeEditarCliente();
            op2= sc.nextInt();}
            if(op2==1) {
                clienteServicio.editarEstadoCliente();
            }
             else if(op2==2){
               clienteServicio.editarCliente();

            }

        } else if (op==4) {
            String ruta;
            ArrayList<Cliente>clientesImportados = new ArrayList<>();
            mensaje.mensajeRutaDBClientes();
            ruta=sc.nextLine();
            ruta=sc.next();
            clientesImportados=(ArrayList<Cliente>) archivoServicio.importarClientes(ruta);
            for (Cliente cliente:clientesImportados){
                System.out.println(cliente.toString());
            }

        } else if (op==5) {
            int op6=0;
            while (op6!=1 && op6!=2){
            mensaje.mensajeExportarClientes();
            op6= sc.nextInt();
            }
            if(op6==1){
                String ruta;
                String fileName="ClientesCsv";
                String formato="csv";
                mensaje.mensajeExportarLinuxMacWindows();
                ruta=sc.nextLine();
                ruta=sc.next();
                archivoServicio.exportarCsv(fileName,listaClientes,ruta);
                mensaje.mensajeExportadoExitoso(formato);

            } else if (op6==2) {
                String ruta;
                String fileName="ClientesTxt";
                String formato="txt";
                mensaje.mensajeExportarLinuxMacWindows();
                ruta=sc.nextLine();
                ruta=sc.next();
                archivoServicio.exportarTxt(fileName,listaClientes,ruta);
                mensaje.mensajeExportadoExitoso(formato);

            }
        } else if (op==6) {
            utilidad.pausarPantalla();
            System.out.println("Esta saliendo del sistema, hasta luego :)");
            System.exit(0);
        }
    }



}
