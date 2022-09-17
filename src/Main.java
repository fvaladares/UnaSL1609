import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //region:: Declaração de variáveis
        int sexo;
        double pesoIdeal;
        double altura;
        String temp;
        //end region:: declaração de variáveis
        while (true) {
            temp = JOptionPane.showInputDialog(
                    "Por favor, informe a sua altura");
            altura = Double.parseDouble(temp);
            temp = JOptionPane.showInputDialog(
                    "Por favor informe o sexo\n"
                            + " 1 para Masculino\n2 para Feminino");
            sexo = Integer.parseInt(temp);
            // Se o sexo for masculino
            if (sexo == 1) {
                pesoIdeal = (72.7 * altura) - 58;
                temp = "Seu peso ideal é " + pesoIdeal + " Kg";
            } else if (sexo == 2) { // Se o sexo for feminino
                pesoIdeal = (62.1 * altura) - 44.7;
                temp = "Seu peso ideal é " + pesoIdeal + " Kg";
            } else { // Valor informado é inválido
                temp = "O valor informado para sexo" +
                        "não permite calcular o peso ideal";
            }
            JOptionPane.showMessageDialog(
                    null,
                    temp);
        }
    }
}