public class Main {
    public static void main(String[] args) {
        System.out.print("Завершение" + "\n" + "Периметр пятиугольника:");
        Shape firstCorner = new FifthCorner();//1
        firstCorner.getPerimeter();

        Shape secondCorner = new SecondCorner();//2
        secondCorner.getPerimeter();

        Shape thirdCorner = new ThirdCorner();//3
        thirdCorner.getPerimeter();

        Shape fourthCorner = new FourthCorner();//4
        fourthCorner.getPerimeter();

        Shape fifthCorner = new FifthCorner();//5
        fifthCorner.getPerimeter();

        System.out.println(
                firstCorner.getPerimeter() +
                        secondCorner.getPerimeter() +
                        thirdCorner.getPerimeter() +
                        fourthCorner.getPerimeter() +
                        fifthCorner.getPerimeter());
    }
}