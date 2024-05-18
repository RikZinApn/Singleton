package Exemplos;

//Classe DemoSingleThread demonstra o uso do Singleton em um ambiente de thread �nica.
public class DemoSingleThread {

 public static void main(String[] args) {
     // Imprime mensagem explicando o comportamento esperado com base na reutiliza��o do singleton ou em v�rias inst�ncias.
     System.out.println("Se voc� vir o mesmo valor, ent�o o singleton foi reutilizado (yay!)" + "\n" +
             "Se voc� vir valores diferentes, ent�o 2 singletons foram criados (booo!!)" + "\n\n" +
             "RESULTADO:" + "\n");

     // Obt�m uma inst�ncia Singleton usando getInstance("FOO") e a armazena na vari�vel `singleton`.
     Singleton singleton = Singleton.getInstance("FOO");

     // Obt�m outra inst�ncia Singleton usando getInstance("BAR") e a armazena na vari�vel `anotherSingleton`.
     Singleton anotherSingleton = Singleton.getInstance("BAR");

     // Imprime o valor dos objetos `singleton` e `anotherSingleton`.
     System.out.println(singleton.value);
     System.out.println(anotherSingleton.value);
 }
}
