import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList {

    public static void main (String[] args){
        /*List<MesesAno> mesesAno = new ArrayList<>(){{
            add(new MesesAno(1,"Janeiro",42.9));
            add(new MesesAno(2, "Fevereiro",40.1));
            add(new MesesAno(3,"Março",38.7));
            add(new MesesAno(4,"Abril",38.0));
            add(new MesesAno(5, "Maio",37d));
            add(new MesesAno(6,"Junho",29.9));
            add(new MesesAno(7,"Julho",30.1));
            add(new MesesAno(8,"Agosto",32.8));
            add(new MesesAno(9,"Setembro",35.0));
            add(new MesesAno(10,"Outubro",36.2));
            add(new MesesAno(11,"Novembro",37.5));
            add(new MesesAno(12,"Dezembro",38.5));
        }};
        //System.out.println(mesesAno);
        Double soma = 0.0;
        Double media = 0.0;
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 0; i < mesesAno.size(); i++){
            soma += mesesAno.get(i).getTempMediaMes();
        }
        media = soma/mesesAno.size();
        System.out.println("Média de temperatura semestral (JAN-JUN): " + df.format(media) + "ºC");

        for (int i = 0; i < mesesAno.size(); i++){
            if(mesesAno.get(i).getTempMediaMes() > media){
                System.out.println("Mês de " +
                        mesesAno.get(i).getNomeMes() +
                        " com temperatura de " + mesesAno.get(i).getTempMediaMes() +
                        "ºC, acima da média semestral de " + df.format(media) + "ºC");
            }
        }*/

        List<String> respostas = new ArrayList<>();
        Scanner respScanner = new Scanner(System.in);
        System.out.println("Telefonou para a vítima?");
        String resp = respScanner.next();
        respostas.add(resp);
        System.out.println("Esteve no local do crime?");
        resp = respScanner.next();
        respostas.add(resp);
        System.out.println("Mora perto da vítima?");
        resp = respScanner.next();
        respostas.add(resp);
        System.out.println("Devia para a vítima?");
        resp = respScanner.next();
        respostas.add(resp);
        System.out.println("Já trabalhou com a vítima?");
        resp = respScanner.next();
        respostas.add(resp);
        int sim = 0;
        int nao = 0;
        int semResp = 0;

        for(int i = 0; i < respostas.size(); i++){
            if(respostas.get(i).equals("sim")){
                sim++;
            }else if (respostas.get(i).equals("não")){
                nao++;
            }else {
                semResp++;
            }
        }
        System.out.println(respostas);
        System.out.println(sim + " - " + nao);
        switch (sim){
            case 2:
                System.out.println("SUSPEITA!!!");
                break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE!!!");
                break;
            case 5:
                System.out.println("ASSASSINA!!!");
                break;
            default:
                System.out.println("INOCENTE!!!");
        }

    }
}
