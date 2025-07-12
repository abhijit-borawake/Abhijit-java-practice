package Interfaces;

public class C implements I{
        @Override
        public void fun1(){
            System.out.println("fun1() from I1 implemented in C");
        }

        @Override
        public void fun2(){
            System.out.println("fun2() from I2 implemented in C");
        }

        @Override
        public void fun(){
            System.out.println("shared fun() from I1 & I2 implemented in C");
        }

    //public class TestInterface {
        public static void main(String[] args) {
            C obj = new C();         // create instance of class C
            obj.fun1();              // call method from I1
            obj.fun2();              // call method from I2
            obj.fun();               // call shared method
        }
    }
