public class Usuario {
    public static void main(String[] args) {
        SmartTv tvSala = new SmartTv();

        System.out.println("Status da TV: " + tvSala.status);
        System.out.println("Canal da TV: " + tvSala.canal);
        System.out.println("Volume da TV: " + tvSala.volume);


        System.out.println("Status da TV: " + tvSala.ligarTv());
        System.out.println("Canal atual da TV: " + tvSala.canal);
        System.out.println("Volume atual da TV: " + tvSala.volume);
        //System.out.println("Volume da TV: " + tvSala.volume);
        //System.out.println("Volume da TV: " + tvSala.volume);


    }
}
