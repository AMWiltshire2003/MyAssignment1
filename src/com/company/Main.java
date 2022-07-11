package com.company;
public class Main {

    public static void main(String[] args) {
	// write the in the void

       int character = 0;
       //if character is less than 5
       if (character < 5)
           System.out.println("Username successfully captured ");
       //if character is less than 8
       if (character < 8) {
           System.out.println("Password successfully captured ");
       //if character is not less than 5 and 8
       } else {
           System.out.println("Username or Password incorrect please try again ");
       }
       //create the string variable
       String massage = "True";
       if (massage == "True") {
           System.out.println("    Welcome    ");
       } //if the message is true it will print the above massage
       if (massage == "True") {
           System.out.println(" User first name ");
       } //if the message is true it will print the above message
       if (massage == "True") {
           System.out.println(" User last name ");
       } //if the massage is true it will print the above massage
       if (massage == "True") {
           System.out.println(" It is great to see you again ");
       } //if the massage is true it will print the above massage

       class login {
               public boolean checkUserName (Object obj){

                   return super.equals(obj);
               }
               public boolean checkPasswordComplexity (Object obj){
                   //print the system response
                       System.out.println("At least eight characters long");
                       //print the system response
                       System.out.println("Contain a capital letter");
                       //print the system response
                       System.out.println("Contain a number");
                       //print the system response
                       System.out.println("Contain a special character");
                       return super.equals(obj);
               }
               public String registerUser () {
                   //print the system response
                   System.out.println("The username is incorrectly formatted");
                   //print the system response
                   System.out.println("The password does not meet the complexity required");
                   //print the system response
                   System.out.println("The two above condition have been met and the user has been registered successfully");
                   return super.toString();
               }
               public boolean loginUser (Object obj){

                   return super.equals(obj);
               }
               public String returnLoginStatus () {
                   //print the system response
                   System.out.println("A successful login");
                   //print the system response
                   System.out.println("A failed login");
                   return super.toString();
               }
       }
    }

}

