package DIO_aulas;
public class DIO_A2_SmartTV {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;


    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public int aumentarVolume(int volumeAtual){
        volume ++;
        System.out.println("volume atual é de: " + volume);
        return volume;
    }

    public int diminuirVolume(int volumeAtual){
        volume --;
        System.out.println("volume atual é de: " + volume);
        return volume;
    }

    public int mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("O canal foi alterado para: " + canal);
        return canal;
    }
}
