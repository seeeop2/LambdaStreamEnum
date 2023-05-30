package enum1;

public class Sample01 {
    public static void main(String[] args){
        Color1 inputColor = Color1.RED;

        System.out.println(inputColor.equals(Color1.RED)?"RED":"NOT RED");
        System.out.println(inputColor.equals(Size1.MEDIUM)?"RED":"NOT RED");
    }
}

enum Color1{
    RED, BLUE, ORANGE;
}

enum Size1{
    SMALL, MEDIUM, LARGE;
}