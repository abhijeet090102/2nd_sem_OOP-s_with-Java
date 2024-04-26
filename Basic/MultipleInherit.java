interface temp {
    public int st = 20;
    // void add(){
    //     System.out.println("Addition of " + st + " itself is : "+st+st);
    // }
    
}

class AM {
    public int am;
    void st() {
        am = 16;
        System.out.println("Square of " + am + " is : "+am*am);
    }
}

class Ma extends AM implements temp {
    double l, b;
    
    double Quadri() {
        l = b = 20.0;
        System.out.println("A square ");
        return l;
    }
    void area(){
        System.out.println("Area of the figure " + l * b);
        System.out.println("Square of " + temp.st + " is : "+temp.st*temp.st); //invoking the interfaace variable but we can't inboke any method 
        System.out.println("Square of " + am + " is : "+am*am); // invoking the extend AM class variable am we can't invoke any of its method 
        // we can invoke the exteded class method by using super keyword
        super.st();

    }
    
}
class MultipleInherit{
    public static void main(String[] args) {
        Ma ob1 = new Ma();
        ob1.Quadri();
        ob1.area();
        AM s = new AM();
        // s.st();

    }
}
