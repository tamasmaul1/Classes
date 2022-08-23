public class App {
    int x = 3;
    int y = 2;
    public static void main(String[] args) throws Exception {
        Calculator myObj = new Calculator();
        App num = new App();
        System.out.println(myObj.multiply(num.x, num.y));
    }
}
