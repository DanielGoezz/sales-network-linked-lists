
public class program 
{
	
	public static void main(String[] args) 
	{
		Sistema sys = new Sistema();
		
		ListaVendedor lista = new ListaVendedor();
		
		vendedor v7 = new vendedor();
		v7.nombre = "Sandra";
		v7.saldo = 20000;
		v7.codigoVendedor = 07;
		v7.codigoAfiliador = 03;
		sys.agregarVendedor(v7);
		
		vendedor v6 = new vendedor();
		v6.nombre = "Juanc";
		v6.saldo = 20000;
		v6.codigoVendedor = 06;
		v6.codigoAfiliador = 03;
		sys.agregarVendedor(v6);
		
		vendedor v3 = new vendedor();
		v3.nombre = "Samir";
		v3.saldo = 20000;
		v3.codigoVendedor = 03;
		v3.codigoAfiliador = 01;
		sys.agregarVendedor(v3);
		
		
		
		
		
		
		
		
		vendedor v5 = new vendedor();
		v5.nombre = "lechero";
		v5.saldo = 20000;
		v5.codigoVendedor = 05;
		v5.codigoAfiliador = 02;
		sys.agregarVendedor(v5);
		
		
		
		
		vendedor v9 = new vendedor();
		v9.nombre = "ari";
		v9.saldo = 20000;
		v9.codigoVendedor = 9;
		v9.codigoAfiliador = 04;
		sys.agregarVendedor(v9);
		
		vendedor v8 = new vendedor();
		v8.nombre = "kakao";
		v8.saldo = 20000;
		v8.codigoVendedor = 8;
		v8.codigoAfiliador = 04;
		sys.agregarVendedor(v8);
		
		vendedor v4 = new vendedor();
		v4.nombre = "damian";
		v4.saldo = 20000;
		v4.codigoVendedor = 04;
		v4.codigoAfiliador = 02;
		sys.agregarVendedor(v4);
		
		vendedor v2 = new vendedor();
		v2.nombre = "Camilo";
		v2.saldo = 20000;
		v2.codigoVendedor = 02;
		v2.codigoAfiliador = 01;
		sys.agregarVendedor(v2);
		
		
		
		
		
		vendedor v1 = new vendedor();
		v1.nombre = "Julian";
		v1.saldo = 20000;
		v1.codigoVendedor = 01;
		sys.agregarVendedor(v1);
		
		
		
		
		
		
		
		
		
		
		sys.calcularSaldos(lista);
	}

}
