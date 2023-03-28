import model.*;

public class Main {
    public static void main(String[] args) {

        //upcast (implícitos)
        Funcionario A = new Gerente();
        Funcionario B = new Vendedor();
        Funcionario C = new Faxineiro();

        //Downcast (explícito)
        Gerente A_ = (Gerente) new Funcionario();


    }
}