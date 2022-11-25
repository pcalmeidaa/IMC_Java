import javax.swing.JOptionPane;

class Main {
	public static void main(String[] args) {

		//
		// Declaração de variáveis
		//

		float peso = 0;
		float altura = 0;
		String digitado = " ";
		Imc imc = new Imc(peso, altura);

		//
		// Mensagem bem vindo
		//

		JOptionPane.showMessageDialog(null,
				" Bem - Vindo ao calculo IMC",
				" ",
				JOptionPane.INFORMATION_MESSAGE);

		do {
			//
			// Entrada de dados
			//

			digitado = JOptionPane.showInputDialog(null,
					"Digite seu peso: ", JOptionPane.QUESTION_MESSAGE);
			peso = Float.parseFloat(digitado);
			imc.setPeso(peso);

			digitado = JOptionPane.showInputDialog(null,
					"Digite sua altura: ", JOptionPane.QUESTION_MESSAGE);
			altura = Float.parseFloat(digitado);
			imc.setAltura(altura);

			//
			// Calculo do IMC
			//

			JOptionPane.showMessageDialog(null,
					"O resultado do IMC: " + imc.calculaImc() + "\n" + Imc.result(imc.calculaImc()));

			//
			// Condição para permanecer ou não no laço
			//

			digitado = JOptionPane.showInputDialog(null,
					"Para sair do programa clique em {Cancel} ou para continuar pressione {Enter}: ",
					JOptionPane.QUESTION_MESSAGE);

		} while (digitado != null);
	}
}
