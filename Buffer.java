 class A extend Thread{
        public void run{
                for (int i = 0; i<=5; i++){
                        System.out.println("i am in thread A i =" + i );
                        System.out.println("Exit from thread");
                }
         }
        
 }
 class B extend Thread{
        public void run{
                for(int j = 0; j<=5; j++){
                        System.out.println(" i am in thread B j=" + j);
                        System.out.println("EXIT THE THREAD");
                }
         }
 }
 class Thread first{
        public static void main(String args[]){
                A obj1 = new A();
                obj.start();
                B obj2 = new B();
                obj.start()
        } 
 }