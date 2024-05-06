package loginSystem;

public class main {
    
    public static void main(String[] args) {

        IdandPassword  idandpassword = new IdandPassword();

        loginPage loginpage = new loginPage(idandpassword.getLoginInfo());
        
 
        
    }
  
}
