/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summonerinfinitysecret;

/**
 *
 * @author Christhian
 */
public class Player {
    public String username; 
    public String name;
    public String password;
    public int score;
    
    public Player (String user, String nam, String pass, int scor){
    this.username = user;
    this.name = nam;
    this.password = pass;
    this.score = scor;
    
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getName (){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public int getScore(){
        return score;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setScore(int score) {
        this.score = score;
    }
   
    
}
