package libro.cap02.interfaces.criterios;

public class Util {
	public static void ordenar (Object arr[], Criterio cr)
	{
		boolean ordenado = false;
		while(!ordenado)
		{
			ordenado = true;
			for(int i=0; i<arr.length-1; i++)
			{
				// ahora la decision sobre quien precede a
				// quien la toma instancia de Criterio cr
				if(cr.comparar(arr[i+1], arr[i])<0)
				{
					Object aux = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = aux;
					ordenado = false;
				}
			}
		}
	}
	
	public static void imprimir(Object arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
