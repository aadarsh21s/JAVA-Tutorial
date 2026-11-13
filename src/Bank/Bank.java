package Bank;

class Account {
    public String name;         //Anyone can access it.
    protected String email;     //Only Account can access it.
    private String password;   //No one can access it.

    //getters and setters     //for accessing private
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    static void main() {
        Account a1 = new Account();
        a1.name = "Unik";
        a1.email = "unik@gmail.com";
        a1.setPassword("asdf");
        System.out.println(a1.getPassword() );

    }
}
