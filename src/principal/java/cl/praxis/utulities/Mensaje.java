package cl.praxis.utulities;

import cl.praxis.model.Cliente;

import java.util.Scanner;

import static cl.praxis.model.CategoriaEnum.Activo;

public class Mensaje {

    public void mensajeMenu(){
        System.out.println("-------------Menu gestion tienda-------------\n" +
                           "-------------1. Listar Clientes-------------\n" +
                           "-------------2. Agregar Cliente-------------\n" +
                           "-------------3. Editar Cliente-------------\n" +
                           "-------------4. Cargar Datos-------------\n" +
                           "-------------5. Exportar Datos-------------\n" +
                           "-------------6. Salir-------------\n" +
                           "-------------Ingrese una opción:-------------");
    }

    public void mensajeEditarCliente(){
        System.out.println("-------------Editar Cliente-------------\n" +
                "Seleccione qué desea hacer:\n" +
                "1.-Cambiar el estado del Cliente\n" +
                "2.-Editar los datos ingresados del Cliente\n" +
                "Ingrese opcion:\n" +
                "----------------------------------------\n");
    }

    public void mensajeActualizarEstadoCliente(Cliente cliente){
        System.out.println("-----Actualizando estado del Cliente----\n" +
                "El estado actual es: " +cliente.getEstado()+"\n" +
                "1.-Si desea cambiar el estado del cliente \n" +
                "2.-Si desea mantener el estado del cliente \n" +
                "Ingrese opcion:\n" +
                "----------------------------------------");
    }

    public Cliente mensajeCrearCLiente(){
        Scanner sc = new Scanner(System.in);
        String run;
        String nombre;
        String apellido;
        String anhio;
        System.out.println("-------------Crear Cliente-------------\n" +
                "Ingresa RUN del Cliente:\n");
        run= sc.next();
        System.out.println("Ingresa Nombre del Cliente:");
        nombre=sc.next();
        System.out.println("Ingresa Apellido del Cliente:\n");
        apellido=sc.next();
        System.out.println("Ingresa años como Cliente:\n" +
                "---------------------------------------");
        anhio=sc.next();

        return new Cliente(run,nombre,apellido,anhio,Activo);
    }

    public void mensajeActualizarDatosCliente(Cliente cliente){
        System.out.println("----Actualizando datos del Cliente-----\n" +
                "1.-El RUN del Cliente es: "+ cliente.getRuncliente() +"\n"+
                "2.-El Nombre del Cliente es: "+cliente.getNombreCliente() +"\n" +
                "3.-El Apellido del Cliente es: "+cliente.getApellidoCliente()+ "\n" +
                "4.-Los años como Cliente son: "+cliente.getAnioCliente()+ "\n" +
                "Ingrese opcion a editar de los datos del cliente:\n" +
                "----------------------------------------");
    }

    public void mensajeEleigirSO(){
        System.out.println("---------Cual es su SO? Linux, Mac o Windows-----------\n" +
                "1.- Soy Linux o Mac\n" +
                "2.- Soy Windows\n" +
                "Ingrese opcion:\n" +
                "-----------------------------------------------");
    }

    public void mensajeImportarLinuxMac(){
        System.out.println("---------Cargar Datos en Linux o Mac-----------\n" +
                "Ingresa la ruta en donde se encuentra el archivo DBClientes.csv:");
    }
    public void mensajeImportarWindows(){
        System.out.println("---------Cargar Datos en Windows---------------\n" +
                "Ingresa la ruta en donde se encuentra el archivo DBClientes.csv:");
    }
    public void mensajeExportarClientes(){
        System.out.println("---------Exportar Datos-----------\n" +
                "Seleccione el formato a exportar:\n" +
                "1.-Formato csv\n" +
                "2.-Formato txt\n" +
                "Ingrese una opción para exportar:\n" +
                "----------------------------------");
    }
    public void mensajeExportarLinuxMacWindows(){
        System.out.println("---------Exportar Datos en Linux o Mac-----------\n" +
                "Ingresa la ruta en donde desea exportar el archivo:\n" +
                "Ruta tipo: 'home/usuario/Desktop'\n" +
                "-----------------------------------------------\n" +
                "-----------Exportar Datos en Windows---------------\n" +
                "Ingresa la ruta en donde desea exportar el archivo:\n" +
                "Ruta tipo: 'C:\\\\usuario\\equipo\\Desktop'\n" +
                "-----------------------------------------------\n");
    }
    public void mensajeExportadoExitoso(String formato){
        System.out.printf("Datos de clientes exportados correctamente en formato %s.\n",formato);
    }

    public void mensajeRutaDBClientes(){
        System.out.println("======>** lA DB ClIENTES SE ENCUENTRA EN LA CARPETA ASSETS **<======\n" +
                        "---------Cargar Datos en Linux o Mac-----------\n" +
                "Ingresa la ruta en donde se encuentra el archivo DBClientes.csv:\n" +
                "Ruta tipo: 'home/usuario/Desktop'\n" +
                "-----------------------------------------------\n" +
                "---------Cargar Datos en Windows---------------\n" +
                "Ingresa la ruta en donde se encuentra el archivo DBClientes.csv:\n" +
                "Ruta tipo: 'C:\\\\usuario\\equipo\\Desktop'\n" +
                "-----------------------------------------------\n"
                );
    }
}
