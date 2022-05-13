/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaccion;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import static java.lang.System.out;

/**
 *
 * @author Perez
 */
@WebService(serviceName = "TransaccionCompra")
public class TransaccionCompra {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Pagar")
    public boolean Pagar(@WebParam(name = "numero_tarjeta") int numero_tarjeta, @WebParam(name = "monto") int monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "codigo_CVV") int codigo_CVV) {
         int fondo = 10000;
         
        if((Integer.toString(numero_tarjeta).length() != 9) || (monto > fondo) || (Integer.toString(codigo_CVV).length() != 3)){
           return false;
        }

        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Comprar")
    public boolean Comprar(@WebParam(name = "id_producto") int id_producto, @WebParam(name = "precio") int precio, @WebParam(name = "numero_productos") int numero_productos, @WebParam(name = "total") int total) {
        //TODO write your implementation code here:
        if(numero_productos == 0)
            return false;
        
        return true;
    }
}
