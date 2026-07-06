import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen= sc.nextFloat();
        float eraser = sc.nextFloat();
        float amount= pencil+pen+eraser;
        float gst = 0.18f;
        float mamount = amount*gst;
        float bill = mamount+amount;
        System.out.println(mamount);
        System.out.println(bill);
        int $=24;
        System.out.println($);
    }
}
