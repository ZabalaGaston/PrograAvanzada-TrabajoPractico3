package polinomioComplejidad;

import java.lang.Math;

import polinomioComplejidad.Polinomio;
import polinomioComplejidad.FuncionesGenerales;
public class BinomioNewton {

	private int a;
	private int b;
	private int n;
	
	public BinomioNewton(int a, int b, int n) {
		this.a = a;
		this.b = b;
		this.n = n;
	}

	public int coeficienteK(int k) {
		return (int) (MiMath.combinatoria(n, k) * Math.pow(a, k) * Math.pow(b, n - k));
	}

	public Polinomio formaPolinomica() {
		
		double[] coeficientes = new double[n + 1];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = MiMath.combinatoria(n, i);
		}
		return new Polinomio(coeficientes);
	}
	
	public Polinomio formaPolinomicaConTartaglia() {
		int[][] tartaglia = MiMath.trianguloDeTartaglia(this.n);
		double[] coeficientes = new double[n];
		for (int i = 0; i < coeficientes.length; i++) {
			coeficientes[i] = tartaglia[n - 1][i];
		}
		return new Polinomio(coeficientes);
	}
}