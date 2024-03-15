package DIO_aulas;
public class DIO_A2_UsuarioSmartTV {
    public static void main(String[] args) {

        DIO_A2_SmartTV smartTV = new DIO_A2_SmartTV();

        System.out.println("TV Ligada?" + "  " + smartTV.ligado);
        System.out.println("Volume" + "  " + smartTV.volume);
        System.out.println("Canal" + "  " + smartTV.canal);

        smartTV.aumentarVolume(smartTV.volume);
        smartTV.diminuirVolume(smartTV.volume);

        smartTV.mudarCanal(32);

    }
}
