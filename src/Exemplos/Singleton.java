package Exemplos;

//Classe Singleton garante que apenas uma instância exista em todo o aplicativo.
public final class Singleton {

 // Referência estática à instância singleton (inicialmente nula).
 private static Singleton instance;

 // Valor da string armazenado dentro do objeto singleton.
 public String value;

 // Construtor privado (Singleton(String value)):
 // Simula inicialização lenta pausando por 1 segundo usando Thread.sleep(1000).
 // Atribui o `value` fornecido à variável de membro `this.value`.
 private Singleton(String value) {
     try {
         Thread.sleep(1000); // Simula inicialização lenta (não relevante em cenários reais)
     } catch (InterruptedException ex) {
         ex.printStackTrace();
     }
     this.value = value;
 }

 // Método estático público (getInstance(String value)):
 // Verifica se o `instance` já foi criado (verificação nula).
 // Se não criado, cria uma nova instância `Singleton` com o `value` fornecido.
 // Retorna a instância `Singleton` existente ou recém-criada.
 public static Singleton getInstance(String value) {
     if (instance == null) {
         instance = new Singleton(value);
     }
     return instance;
 }
}
