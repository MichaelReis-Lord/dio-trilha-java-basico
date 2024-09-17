public class SmartTv {
    
    Boolean ligada=false;  
    int canal=1;
    int volume=25;

    // Função responsável por aumentar o canal
    public void aumentarCanal(){
        canal++;
    }

    // Função responsável por diminuir o canal
    public void diminuirCanal(){
        canal--;
    }

    // Função responsável por aumentar o volume
    public void aumentarVoulme(){
        volume++;
    }

    // Função responsável por dimniuir o volume
    public void diminuirVoulme(){
        volume--;
    }

    // Função responsável por ligar a TV
    public void ligar(){
        ligada=true;
    }

    // Função responsável por desligar a TV
    public void desligar(){
        ligada=false;
    }
    
}
