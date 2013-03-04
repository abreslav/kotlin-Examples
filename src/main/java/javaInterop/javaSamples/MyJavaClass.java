package javaInterop.javaSamples;

/*
 * a simple jaa class with a public getter and setter
 */
public class MyJavaClass {

    protected Integer i = 1;
    protected String str = null;
    public MyJavaClass(Integer i) {
        this.i = i;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void doIt(){
        System.out.println("in java.JavaClass.doIt()");

    }

    public static void main(String[] args){
        MyJavaClass j = new MyJavaClass(0);
                j.doIt();
    }

}
