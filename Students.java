class Students {
    int rollno;
    String name;
    static String college="Softwarica";

    Students(int r,String n){
        rollno=r;
        name=n;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
    
}
