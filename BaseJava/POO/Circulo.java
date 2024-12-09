package POO;

public class Circulo {
	double area;
	double perimetro;
	
	Circulo(){
		
	}
	Circulo(double raio){
		area = Math.PI * (raio*raio);
		System.out.println(area);
	}
	Circulo(double raio, String outro){
		perimetro = 2 * Math.PI * raio;
	}
	
	void Status() {
		System.out.println(area);
		System.out.println(perimetro);
	}
}
