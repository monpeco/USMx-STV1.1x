package testjunit01;

public class TestJUnit01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
    }
    
    public String checkValidity(int num)
    {
        if (num == 0)
            return "invalid";
        else
            return "valid";
    }
}