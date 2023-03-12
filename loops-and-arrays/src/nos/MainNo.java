package nos;

public class MainNo {

    public static void main(String[] args) {

        No<Integer> no1 = new No<>(1);

        No<Integer> no2 = new No<>(2);

        No<Integer> no3 = new No<>(3);

        No<Integer> no4 = new No<>(4);

        //no1 -> no2 -> no3 -> no4 -> null
        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());


    }
}
