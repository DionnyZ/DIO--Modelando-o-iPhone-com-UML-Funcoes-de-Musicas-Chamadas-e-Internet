public interface AparelhoTelefonico {
    
    default void ligar(){
        System.out.println("Ligando...");
    }

    default void atender(){
        System.out.println("Atendido.");
    }

    default void iniciarCorreioVoz(){
        System.out.println("Diga uma mensagem após o sinal.");
    }
}
