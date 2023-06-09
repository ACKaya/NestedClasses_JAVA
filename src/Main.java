public class Main {
    public static void main(String[] args) {
        Out o=new Out();
        Out.In in=o.new In();
        in.Run();
    }
}
