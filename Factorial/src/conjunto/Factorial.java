package conjunto;

public class Factorial {
	
	public long factorial_multiplicacion(int num) {
		
		long resultado = 1;
		
			
		
		
		/* for(long i = num; i > 1; i--) {
			 
			 resultado = resultado *  (i -1);
			 
			 System.out.println(i);
			 
			 
         }*/
		
		for (int i = 1; i <= num; i++) {
			
            resultado = resultado * i; 
	    }
		return resultado;
	}

}
	
