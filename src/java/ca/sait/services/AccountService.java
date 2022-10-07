/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.services;

import ca.servlets.models.User;

/**
 * A service provider for the account
 * @author jacke
 * pepega
 */
public class AccountService {
    public AccountService(){
    
}
    public User login(String username, String password){
        /*if (username == null)
            return null;
        
        
        if (username.equals("abe")){
            
        }
         */
        if("abe".equals(username) && "password".equals(password)){
            return new User(username, password);
            
        }else if("barb".equals(username) && "password".equals(password)){
            return new User(username, password);
            
        }else{
            return null;
        }
        
        
    }

    
}
