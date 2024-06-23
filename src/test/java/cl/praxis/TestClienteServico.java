package cl.praxis;

import cl.praxis.model.CategoriaEnum;
import cl.praxis.model.Cliente;
import cl.praxis.service.ClienteServicio;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestClienteServico {
    ClienteServicio clienteServicio =  new ClienteServicio();
    Cliente newCliente = new Cliente("11.111.111-1","Fausto","Asprilla","6", CategoriaEnum.Activo);
    Cliente newClienteNull = new Cliente();
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    @Test
    public void agrearClienteTest(){
        clienteServicio.agregarCliente(listaClientes,newCliente);
        assertEquals(1,listaClientes.size());
        for (Cliente cliente:listaClientes
             ) {
            System.out.println(cliente.toString());
        }
    }
    @Test
    public void agrearClienteNullTest(){
        clienteServicio.agregarCliente(listaClientes,newClienteNull);
        assertEquals(1,listaClientes.size());
        for (Cliente cliente: listaClientes
             ) {
            System.out.println(cliente.toString());

        }
        System.out.println();
    }
    @Test
    public void listarClientesTest() {
        ArrayList<Cliente> listaClientesTest = new ArrayList<>();
        Cliente newCliente = new Cliente("11.111.111-1", "Fausto", "Asprilla", "6", CategoriaEnum.Activo);
        listaClientesTest.add(newCliente);

        ClienteServicio clienteServicio = new ClienteServicio();
        ByteArrayOutputStream salidaCapturada = new ByteArrayOutputStream();
        PrintStream salidaOriginal = System.out;
        System.setOut(new PrintStream(salidaCapturada));

        try {

            clienteServicio.listarClientes(listaClientesTest);
            String salidaReal = salidaCapturada.toString();

            String salidaEsperada = "-------------Datos del Cliente-------------\n" +
                    "Run del cliente: 11.111.111-1\n" +
                    "Nombre del cliente: Fausto\n" +
                    "Apellido del cliente: Asprilla\n" +
                    "Anhios como cliente: 6\n" +
                    "Categoria del cliente: Activo\n" +
                    "-------------------------------------------";


            assertEquals(salidaEsperada, salidaReal);

        } finally {
            System.setOut(salidaOriginal);
        }
    }

}
