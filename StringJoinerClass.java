import java.util.StringJoiner;

public class StringJoinerClass{
    public static void main(String[] args){
        StringJoiner sj =  new StringJoiner(",", ".",".");   // passing comma(,) and square-brackets as delimiter

        // Adding values to StringJoiner
        sj.add("shyam");
        sj.add("ram");
        sj.add("radha");
        sj.add("sita");

        System.out.println(sj);



    }
}