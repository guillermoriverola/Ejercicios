package constructores;

public class AppConstructors {
    public static void main(String[] args) {
        tree[] arboles = new tree[4];
        arboles[0] = new tree(4);
        arboles[1] = new tree("Roble");
        arboles[2] = new tree();
        arboles[3] = new tree(5, "Pino");

        for (tree t : arboles)
            System.out.println(t);
    }
}