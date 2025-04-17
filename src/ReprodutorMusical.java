public interface ReprodutorMusical {
    
    default void tocar(){
        System.out.println("Tocando música.");
    }

    default void pausar(){
        System.out.println("Música pausada.");
    }

    default void selecionarMusica(){
        System.out.println("Selecione a música.");
    }
}
