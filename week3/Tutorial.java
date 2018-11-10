package testjunit01;

public class Tutorial {

    private int attInt;
    private String attStr;

    public Tutorial() {
        attInt = -1;
        attStr = "none";
    }


    public Tutorial (int num, String str){

        if (num < 0 || num > 5){
            throw new IllegalArgumentException("First parameter must be greater than 0 and less than 5");
        }else{
            if(str == "" || str == null){
                throw new IllegalArgumentException("Second parameter cannot be neither null or empty string");
            }
        }

        attInt = num;
        attStr = str;
    }

    public int getAttInt(){
        return attInt;
    }

    public String getAttStr(){
        return attStr;
    }

    public String concatLoop(){
        String result = "";

        while(attInt > 0){
            result = result + attStr + " ";
            attInt = attInt - 1;
        }

        return result;
    }

}
