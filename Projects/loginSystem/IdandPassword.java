package loginSystem;

import java.util.HashMap;

public class IdandPassword {

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    

    IdandPassword(){
        loginInfo.put("Bip", "javaDevloper");
        loginInfo.put("Biplob","FrontendDevloper");
        loginInfo.put("Biplob Kafle", "ItStudent");
        
    }
    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
   
    
}
