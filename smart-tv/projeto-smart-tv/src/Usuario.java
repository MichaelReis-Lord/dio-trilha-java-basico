public class Usuario {
    
    // Abre o chamado e mostra o status da tv, canais e volume
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

    }
}
