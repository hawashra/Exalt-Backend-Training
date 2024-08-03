//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ComputerBuilder b = new ComputerBuilder();
        director.buildGamingPC(b);
        System.out.println(b.build());

    }
}