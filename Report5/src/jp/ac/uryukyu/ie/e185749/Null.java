package jp.ac.uryukyu.ie.e185749;

public class Null{
    public static void main(String[] args){
        String str = null;
        try{
            
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが発生");
            System.out.println(e.getMessage());
        }    
    }
}

