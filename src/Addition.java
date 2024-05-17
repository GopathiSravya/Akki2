package src;
    public class Addition {
        public int a;
        public int b;
        public Addition(int a,int b){
            this.a=a;
            this.b=b;
        }
        public int add(){
            Addition addition=new Addition(5,10);
            int total=a+b;
            int total1=a-b;
            System.out.println("sum" +total);
            return total;
        }
    }