public interface NavegadorNaInternet {
    
    default void exibirPagina(){
        System.out.println("Página carregada.");
    }

    default void adicionarNovaAba(){
        System.out.println("Nova aba aberta.");
    }

    default void atualizarPagina(){
        System.out.println("Página atualizada.");
    }
}
