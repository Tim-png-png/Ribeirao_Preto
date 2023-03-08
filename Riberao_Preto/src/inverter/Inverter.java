package inverter;

public class Inverter {
	static int i = 0;

	// M�todo recursivo para reverter uma string em Java usando uma vari�vel
	// est�tica
	private static void inverte(char[] str, int k) {
		// se o final da string for atingido
		if (k == str.length) {
			return;
		}

		// recorre para o pr�ximo caractere
		inverte(str, k + 1);

		if (i <= k) {
			char temp = str[k];
			str[k] = str[i];
			str[i++] = temp;
		}
	}

	public static String inverte(String str) {
		// caso base: se a string for nula ou vazia
		if (str == null || str.equals("")) {
			return str;
		}

		// converte string em array de caracteres
		char[] A = str.toCharArray();
		// array de caracteres reverso
		inverte(A, 0);

		// converte a array de caracteres na string
		return String.copyValueOf(A);
	}

	public static void main(String[] args) {
		String str = "Job Rotation - Ribeir�o Preto - ATUALIZADO";

		// string � imut�vel
		str = inverte(str);

		System.out.println(str);
	}
}
