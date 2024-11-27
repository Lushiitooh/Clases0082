package main.java;

import main.java.conexion.conexion;

import java.sql.Connection;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       conexion.conexion();
       Connection conectar = conexion.conexion();
       System.out.println(conectar);
       conexion.closeConexion();
		
		//probar busqueda de 1 registro
	//	IProveedorDao proveedorDao = new ProveedorDaoImp(); 
	//	Proveedor proveedor = proveedorDao.findById(1);
	//	System.out.println(proveedor);
		
		//probar insercion de registro
	    // IProveedorDao proveedorDao = new ProveedorDaoImp(); 
		// Proveedor proveedor = new Proveedor(null, "Empresa de prueba 2", "2222222222", "los guindas 330", "hola@prueba2.cl","56985097099","Francisco Barrera Cornejo", "+56985097052");
		 
		// System.out.println(proveedorDao.create(proveedor));
		 
		 //Probar delete
	     //IProveedorDao proveedorDao = new ProveedorDaoImp(); 
	     //System.out.println(proveedorDao.delete(2));
	}

}
