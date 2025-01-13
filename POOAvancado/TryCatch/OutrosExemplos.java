package TryCatch;

public class OutrosExemplos {
	public static void main(String[] args) {
		try {
			int[] meusNumeros = {0, 1, 2, 3};
			System.out.println(1);
			System.out.println(meusNumeros[10]);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println("algo está errado.");
		} finally {
			System.out.println("O try e catch acabou");
		}
	}
}
