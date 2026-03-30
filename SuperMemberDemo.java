class A {

    int i = 33;

    void show() {
        System.out.println("inside A:i ="+ i);
    }
}

class B extends A {
    int i,k;
    B(int a, int b) {
        super.show();      // calling parent class method
        super.i = a;       // assigning value to parent variable
        this.i = b;        // assigning value to child variable
    }

    void show() {
        System.out.println("super.i = " + super.i);
        System.out.println("B.i = " + this.i);
    }
}

class SuperMemberDemo {

    public static void main(String[] args) {

        B b = new B(12, 56);
        b.show();
    }
}