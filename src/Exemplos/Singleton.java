package Exemplos;

//Classe Singleton garante que apenas uma inst�ncia exista em todo o aplicativo.
public final class Singleton {

 // Refer�ncia est�tica � inst�ncia singleton (inicialmente nula).
 private static Singleton instance;

 // Valor da string armazenado dentro do objeto singleton.
 public String value;

 // Construtor privado (Singleton(String value)):
 // Simula inicializa��o lenta pausando por 1 segundo usando Thread.sleep(1000).
 // Atribui o `value` fornecido � vari�vel de membro `this.value`.
 private Singleton(String value) {
     try {
         Thread.sleep(1000); // Simula inicializa��o lenta (n�o relevante em cen�rios reais)
     } catch (InterruptedException ex) {
         ex.printStackTrace();
     }
     this.value = value;
 }

 // M�todo est�tico p�blico (getInstance(String value)):
 // Verifica se o `instance` j� foi criado (verifica��o nula).
 // Se n�o criado, cria uma nova inst�ncia `Singleton` com o `value` fornecido.
 // Retorna a inst�ncia `Singleton` existente ou rec�m-criada.
 public static Singleton getInstance(String value) {
     if (instance == null) {
         instance = new Singleton(value);
     }
     return instance;
 }
}
