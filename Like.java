import java.io.*;                           
public class Like {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); //標準入力の準備

        String s;
        String t;
        System.out.println("好きな食べ物は何ですか？");
        s = buf.readLine();
        System.out.println("その理由は何ですか？");
        t = buf.readLine();

    }
}
