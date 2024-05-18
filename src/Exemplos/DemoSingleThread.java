package Exemplos;

//Classe DemoSingleThread demonstra o uso do Singleton em um ambiente de thread única.
public class DemoSingleThread {

 public static void main(String[] args) {
     // Imprime mensagem explicando o comportamento esperado com base na reutilização do singleton ou em várias instâncias.
     System.out.println("Se você vir o mesmo valor, então o singleton foi reutilizado (yay!)" + "\n" +
             "Se você vir valores diferentes, então 2 singletons foram criados (booo!!)" + "\n\n" +
             "RESULTADO:" + "\n");

     // Obtém uma instância Singleton usando getInstance("FOO") e a armazena na variável `singleton`.
     Singleton singleton = Singleton.getInstance("FOO");

     // Obtém outra instância Singleton usando getInstance("BAR") e a armazena na variável `anotherSingleton`.
     Singleton anotherSingleton = Singleton.getInstance("BAR");

     // Imprime o valor dos objetos `singleton` e `anotherSingleton`.
     System.out.println(singleton.value);
     System.out.println(anotherSingleton.value);
 }
}
