package jp.ac.uryukyu.ie.e185749;

public class Null{
    public static void main(String[] args){
        String str = "壱百満";
        try{
            int value = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatExceptionが発生しました！");
            System.out.println(e.getMessage());
        }
    }
}
