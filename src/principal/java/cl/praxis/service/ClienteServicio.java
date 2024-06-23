package cl.praxis.service;

import cl.praxis.model.Cliente;
import cl.praxis.utulities.Mensaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static cl.praxis.model.CategoriaEnum.Activo;
import static cl.praxis.model.CategoriaEnum.Inactivo;


public class ClienteServicio {
    Mensaje mensaje = new Mensaje();
    Scanner sc = new Scanner(System.in);

    Cliente cliente=new Cliente();

    private List<Cliente> listaClientes = new ArrayList<>(
            List.of(new Cliente("123","pepe","gomez","8",Activo),
                    new Cliente("987","julio","suloeta","3",Inactivo),
                    new Cliente("045","amalia","montero","1",Activo))
    );



    public ClienteServicio() {

    }


    public void listarClientes(ArrayList<Cliente>listaClientes){
        for (Cliente cliente:listaClientes
             ) {
            System.out.println("-------------Datos del Cliente-------------\n"+
                    cliente.toString()+
                    "-------------------------------------------\n");
        }

    }

    public void agregarCliente(List<Cliente>listaClientes,Cliente cliente){
        listaClientes.add(cliente);
        setListaClientes(listaClientes);
    }
    public void editarCliente(){

        int op3;
        String run;
        System.out.println("Ingrese RUN del Cliente a editar:\n");
        run = sc.next();
        for (Cliente c:listaClientes) {
            if(run.equalsIgnoreCase(c.getRuncliente())){
                int indice = listaClientes.indexOf(c);
                mensaje.mensajeActualizarDatosCliente(c);
                System.out.println(c);
                op3=sc.nextInt();
                if(op3==1){
                    String newRun;
                    System.out.println("1\n" +
                            "----------------------------------------\n" +
                            "1.-Ingrese nuevo RUN del Cliente:\n" +
                            c.getRuncliente()+"\n"
                    );
                    newRun=sc.next();
                    c.setRuncliente(newRun);
                    System.out.println("----------------------------------------\n" +
                            "Datos cambiados con éxito");
                }else if(op3==2){
                    String newNombre;
                    System.out.println("1\n" +
                            "----------------------------------------\n" +
                            "1.-Ingrese nuevo Nombre del Cliente:\n" +
                            c.getNombreCliente()+"\n"
                    );
                    newNombre=sc.next();
                    c.setRuncliente(newNombre);
                    System.out.println("----------------------------------------\n" +
                            "Datos cambiados con éxito");
                }else if(op3==3){
                    String newApellido;
                    System.out.println("1\n" +
                            "----------------------------------------\n" +
                            "1.-Ingrese nuevo Apellido del Cliente:\n" +
                            c.getApellidoCliente()+"\n"
                    );
                    newApellido=sc.next();
                    c.setApellidoCliente(newApellido);
                    System.out.println("----------------------------------------\n" +
                            "Datos cambiados con éxito");
                }else if(op3==4){
                    String newAnhio;
                    System.out.println("1\n" +
                            "----------------------------------------\n" +
                            "1.-Ingrese nuevo Anhio como cliente del Cliente:\n" +
                            c.getAnioCliente()+" anhios"+"\n"
                    );
                    newAnhio=sc.next();
                    c.setAnioCliente(newAnhio);
                    System.out.println("----------------------------------------\n" +
                            "Datos cambiados con éxito");
                }}}
    }

    public void editarEstadoCliente(){

            int op3;
            String run;
            System.out.println("Ingrese RUN del Cliente a editar:\n");
            run = sc.next();
            for (Cliente cliente:listaClientes) {
                if(run.equalsIgnoreCase(cliente.getRuncliente())){
                    int indice = listaClientes.indexOf(cliente);
                    mensaje.mensajeActualizarEstadoCliente(cliente);
                    System.out.println(cliente);
                    op3=sc.nextInt();
                    if(op3==1){
                        if(cliente.getEstado()==Activo){
                            cliente.setEstado(Inactivo);
                        }else {
                            cliente.setEstado(Activo);
                        }
                        System.out.println("El estado actual de "+cliente.getNombreCliente()+ " es: "+cliente.getEstado());

                    }
                }
            }

        }


    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
