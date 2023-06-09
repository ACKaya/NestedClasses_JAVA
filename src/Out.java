public class Out {
    public int a=10;
        public class In{
            public int a=5;
            public void Run(){
                System.out.println("Calisti");
                int a=1;
                System.out.println(a);
                System.out.println(this.a);
                System.out.println(Out.this.a);
            }
        }
        public void Run(){
            In in = new In();
            in.Run();
        }

}
