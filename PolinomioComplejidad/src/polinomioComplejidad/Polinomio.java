package polinomioComplejidad;

public class Polinomio {
	private int grado ;
	private double [ ] coeficientes = new double [] {3.0,2.0,1.0};

	public Polinomio(double[] coeficientes) {
		this.grado = coeficientes.length - 1;
		this.coeficientes = coeficientes;
	}
	
	public double evaluarMsucesivas (double x ) {

		double termino;
		double acum = 0;
		for (int i = 0; i < coeficientes.length ; i++ ){
			 termino = x; 
			for (int j = grado -i ; j > 0 ; j --){
				termino*= x;
			}
			acum += (termino * coeficientes[i]);
		}
		return acum;
	}
	
	
    public double potenciaConRecursion (double m, int n) {
        if (n==0) { return 1;
        } else  { return m * potenciaConRecursion (m, n-1); }
    } 
    
	public double evaluarRecursiva (double x ) {
		double acum = 0;
		double termino = 0;
		
		for (int i = 0; i < coeficientes.length ; i++ ){
			termino = 0;
			termino += potenciaConRecursion(x,grado-i);
			acum+= (termino * coeficientes[i]);
		}
		return acum;
	}	
	
	public double evaluarRecursivaPar (double x ) {
		double acum = 0;
		double termino = 0;
		
		for (int i = 0; i < coeficientes.length ; i++ ){
			termino = 0;
			termino += potenciaConRecursion(x,grado-i);
			acum+= (termino * coeficientes[i]);
		}
		return acum;
	}

	public double evaluarRecursivaParImpar (double x ) {
		double acum = 0;
		double termino = 0;
		
		for (int i = 0; i < coeficientes.length ; i++ ){
			termino = 0;
			termino += potenciaConRecursionPar(x,grado-i);
			acum+= (termino * coeficientes[i]);
		}
		return acum;
	}	
	
    public double potenciaConRecursionPar (double m, int n) {
        if (n==0)  
        	return 1;
         else  { 
        	if (n%2 == 0)
        		return potenciaConRecursionPar (m *m , n/2); 
        	else
        		return m * potenciaConRecursionPar (m , n-1);
        }
    }
	
    public double evaluarProgDinamica(double x) {
    	double resultadox = 1;
    	double resultado = 0;
    	resultado = this.coeficientes[this.grado];
    	for (int i = this.grado - 1; i >= 0; i--) {
    		resultadox *= x;
    		resultado += resultadox * this.coeficientes[i];
    	}
    	return resultado;
    }
	
    public double evaluarMejorada(double x) {
    	double resultado = 0;
    	for (int i = 0; i < this.coeficientes.length; i++) {
    		resultado = resultado * x + this.coeficientes[i];
    	}
    	return resultado;
    }	
	
    public double evaluarPow(double x) {
    	double resultadoTermino = 0;
    	double resultado = 0;
    	for (int i = 0; i < this.grado + 1; i++) {
    		resultadoTermino = Math.pow(x, this.grado - i) * this.coeficientes[i];
    		resultado += resultadoTermino;
    	}
    	return resultado;

     }	
	
	public double evaluarHorner(double x) {
		Double resultado = this.coeficientes[0];
		for (int i = 1; i < this.coeficientes.length; i++) {
			resultado = (resultado * x) + this.coeficientes[i];
		}
		return resultado;
	}
	
}