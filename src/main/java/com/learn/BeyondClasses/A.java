package com.learn.BeyondClasses;

//Inner classes can have same variable name as outer classes,making scope a little tricky.

public class A {
    private int x =20;

    public class B{
        private int x = 10;

        public class C{
            private int x = 30;
            public void allTheX(){
                System.out.println(x);     //30
                System.out.println(this.x);//30
                System.out.println(B.this.x);//10
                System.out.println(A.this.x);//20
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();//we could also write only B as the type because it is member level of A
        A.B.C c = b.new C();//here it is necessary to write B.C because C is too deep for Java to know where to look.
        c.allTheX();
    }
}
