public class SmartTv {
    
    boolean status=false;
    int canal, volume;

    public boolean ligarTv(){
        canal=4;
        volume=25;
        return true;
    }

    public boolean desligarTv(){
        canal=0;
        volume=0;
        return false;
    }

    public void trocarCanalUp(){
        canal++;
    }

    public void trocarCanalDown(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }
}
