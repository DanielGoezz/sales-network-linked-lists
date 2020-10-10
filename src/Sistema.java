public class Sistema 
{
	ListaVendedor vendedorList;
	
	public Sistema() 
	{
		vendedorList = new ListaVendedor();
	}
	
	void agregarVendedor(vendedor vendedor)
	{
		vendedorList.insertar(vendedor);
	}
	
	int saldoMayor (ListaVendedor lista)
	{
		
		return 1;
	}
	
	ListaVendedor calcularSaldos (ListaVendedor lista)
	{
		NodoVendedor tmp = vendedorList.head;
		int i = tmp.vendedor.codigoAfiliador;
		int j = 0;
		double finish = 0;
		double tmpSaldo = 0;
		
		while(tmp != null) 
		{
			j = tmp.vendedor.codigoVendedor;
			
			if ( i != tmp.vendedor.codigoAfiliador && j == i)
			{
				finish += tmp.vendedor.saldo;
				
				if(tmp.vendedor.codigoAfiliador != 0)
				{
					tmp.vendedor.saldo = tmp.next.vendedor.saldo + tmp.vendedor.saldo;
					sumandoDatos(tmp.vendedor);
				}
				else
				{
					tmp.vendedor.saldo = finish;
					
					double numero = tmp.vendedor.saldo - sumandoDatos(tmp.vendedor).saldo;
					
					tmp.vendedor.saldo = numero + 20000;
				}
				
				i = tmp.vendedor.codigoAfiliador;
			}
			
				
			
			if (tmp.vendedor.saldo != 20000)
			{
				tmpSaldo += tmp.vendedor.saldo;
			}
			
			else if(i != tmp.vendedor.codigoAfiliador)
			{
				tmpSaldo = 0;
				i++;
			}
			
			/*
			if(tmp.vendedor.codigoVendedor == 3)
			{
				if (tmp.next.next.next == null)
				{
					finish = tmp.vendedor.saldo + tmp.next.vendedor.saldo;
				}
			}
			*/
			
			
			/* restaSaldo (tmp.vendedor);*/
			
			tmp = tmp.next;
		}
		return lista;
	}
	
	vendedor restaSaldo (vendedor v)
	{	
		double sald = v.saldo;
		
		if(v.codigoAfiliador > 0)
		{
			sald = v.saldo * 0.25;
			v.saldo = v.saldo - sald;
			
			return v;
		}
		else
			return v;
	}
	
	vendedor sumandoDatos (vendedor v)
	{
		double sald = v.saldo * 0.25;
		v.saldo = v.saldo - sald;
		
		return v;
		
	}
}
