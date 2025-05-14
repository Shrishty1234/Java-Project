package types.training.controlflow.iflese;

public class IFElseStatement {

    public static void main(String[] args) {
        String  userID ="shrishty" ;
        String password ="456789";

        if(userID.equals("shrishty")&&(password.equals("456"))){
            System.out.println("Welcome yo FB and loginPage");




        } else if (userID.equals("shrishty") && (password.equals("456789"))){
            System.out.println("Wrong Password");
        }
    }







}
