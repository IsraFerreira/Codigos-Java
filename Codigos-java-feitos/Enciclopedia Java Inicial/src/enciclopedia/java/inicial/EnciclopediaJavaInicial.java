/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enciclopedia.java.inicial;

import java.util.Arrays;
import java.util.Scanner;     //Biblioteca importada
import javax.swing.JOptionPane;

public class EnciclopediaJavaInicial {

    public static void main(String[] args) {

 //                           CONCEITOS BASICOS
 
 
        System.out.println("Olá mundo");                                        //apresenta algo no sistema
        System.out.println("Estou aprendendo a programar em Java");
        
        int x1, y1;          //Declaração de variáveis tipo inteiro
        float z1;           //Declaração de variável ponto flutuante
        
        x1 = 5;             //atribuição na variável
        y1 = 2;
        z1 = x1 / y1;         //operação simples usando variáveis
        
        System.out.printf("%.2f", z1);   //Apresentação de variável formatada com 2 casas decimais
 
/* 
        Date relogio = new Date();                                             //Data e hora do sistema
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        System.out.println(" ");
        
        Locale idioma = Locale.getDefault();                               //Idioma
        String lang = idioma.getDisplayLanguage();
        String country = idioma.getDisplayCountry();
        System.out.print("Seu idioma é ");
        System.out.println(idioma.toString());
        System.out.println(" ");
        
        Toolkit tamanhoTela = Toolkit.getDefaultToolkit();                  //Resolução da tela
        Dimension d = tamanhoTela.getScreenSize();
        System.out.print("Sua resolução é " + d.width + " x " + d.height);
        System.out.println(" ");
     
*/        
  
        
        //x += 2 - x = x + 2
        //x -= 2 - x = x - 2
        //x *= 2 - x = x * 2
        //x /= 2 - x = x / 2
        //x %= 2 - x = x % 2
        
        
        double ale1 = Math.random();                                        //Numero randomico
        int n = (int) (15 + ale1 * (50-15));
        System.out.println(n);

 
        
        /*
        int num = Integer.parseInt(valor.getValue().toString());                  //Resto da divisao, cubo, raiz quadrada, raiz cubica, valor absoluto
        int resto = num % 2;
        int div = num / 2;
        double cub = Math.pow(num,3);
        double raiz2 = Math.sqrt(num);
        double raiz3 = Math.cbrt(num);
        double abs = Math.abs(num);
        esconder.setVisible(true);
        lblResto.setText("Resto da Divisão por 2: " + Integer.toString(resto));
        lblCubo.setText("Elevado ao Cubo: " + Double.toString(cub));
        lblRaizQuadrada.setText("Raiz Quadrada: " + String.format("%.2f", raiz2));
        lblRaizCubica.setText("Raiz Cubica: " + String.format("%.2f", raiz3));
        lblValorAbsoluto.setText("Valor Absoluto: " + Double.toString(abs)); */
        
        
        /*
        
        Scanner teclado = new Scanner(System.in);                      //Estrutura case
        System.out.print("Qual a quantidade de pernas? ");
        int perna = teclado.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo="ET";
                break;
        } 
        System.out.println(tipo);
        
        */
        
        
        
        
        /*int ano = Integer.parseInt(txtAno.getText());            if else if
        int i = 2021 - ano;
        if (i < 16){
            lblR.setText("Não vota!");
            lblIdade.setText("<html>Sua idade é: "+ i + "</html>");
        } 
        else if ((i>=16 && i < 18) || (i > 70)){
            lblR.setText("Voto opcional");
            lblIdade.setText("<html>Sua idade é: "+ i + "</html>");
            }
            else{
            lblR.setText("Voto obrigatório");
            lblIdade.setText("<html>Sua idade é: "+ i + "</html>");
            }*/
        
        
          
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //                    VETORES      
         
        
        int n3[] = {3,2,8,7,5,4};
        System.out.println("Total de casas de N é " + n3.length);      // .lenght busca tamanho do vetor
        
        Arrays.sort(n3); // deixa o vetor em ordem

        int pos = Arrays.binarySearch(n3, 5);            //procura posicao binaria
        System.out.println(pos);
        
        
        
        
        
        
        String mes[] = {"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
        int dias[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        for (int cont = 0; cont < mes.length; cont ++){
            System.out.println("O mês de " + mes[cont] + " tem " + dias[cont] + " dias");
        }
     
        
        
        
        
        int v [] = new int [20];
        
        Arrays.fill(v, 0);
        for (int valor:v){
            System.out.print(valor + " ");
        }
        
        
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //                    ESTRUTURAS DE REPETIÇÃO        
        
        int n1, s1 = 0;                                   //demonstração de laço enquanto-faça(confere laço no final)
        String resp;
        Scanner teclado = new Scanner(System.in);         //classe - nome do objeto = new classe() classe para gravar digitação do teclado
        do{
            System.out.print("Digite um numero: ");
            n1 = teclado.nextInt();                      //pegar próxima digitação no teclado
            s1 = s1 + n1;
            System.out.println("Quer continuar? [S/N]");
            resp = teclado.next();
        }while (resp.equals("S"));                      
        System.out.println("A soma de todos os valores é " + s1);
        
        
        
        
        
        
        
        for (int cc = 0; cc <= 100; cc+=10){                  //Repetição FOR com seus parametros
        System.out.println(cc);
        }
        
        
        
        
        
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //                MOSTRANDO TELA SEM SWING
 
        int n2 = 0, s = 0, par = 0, impar = 0, acima100 = 0, media, contadorn= 0;
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));  //JOptionPane mostra tela sem swing
        s = s + n;             //show input dialog mostra texto na tela criada (é necessário biblioteca)
        
        if(n % 2 == 0){
          par = par+1;  
        }
        else{
          impar = impar + 1;  
        }
        
        if(n > 100){
          acima100 = acima100 + 1;  
        }
        
       
        contadorn ++;
        }while (n2 != 0);
        media = s / (contadorn - 1);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" +       //mostra tela
                "<br>Total de valores: " + s +
                "<br>Total de Pares: " + (par - 1) +
                "<br>Total de Impares: " + impar + 
                "<br>Acima de 100: " + acima100 + 
                "<br>Média dos valores: " + media + 
                "</html>", "Resultado Final", JOptionPane.WARNING_MESSAGE);
        
        
      
        
        
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //--------------------------------------------------------------------------------------------------------------------------------------------------------       
 //                      COMANDOS SWING        
  /*      
        
    int an = Integer.parseInt(txtAN.getValue().toString());         pegar valor, passar para string e passar para int
    int id = 2021 - an;
    lblIdade.setText(Integer.toString(id));                         colocar texto numa label
  
    DefaultListModel lista = new DefaultListModel();                classe modelo de lista
    for (int inicio2 = inicio; inicio2 <= fim; inicio2 += intervalo){        
            lista.addElement(inicio2);                              adicionar elemento
    }
    txtArea.setModel(lista);                                        colocar lista no txt area
 
 
 
 */     
    }
    
}
