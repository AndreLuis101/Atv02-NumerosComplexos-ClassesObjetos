public class Main{
    public static void main(String[] args) {
        Complexo c1 = new Complexo (1, 2);
        Complexo c2 = new Complexo (3, 4);

        Complexo c3 = c1.adiciona(c2);
        Complexo c4 = c1.subtrai(c2);
        Complexo c5 = c1.multiplica(c2);
        Complexo c6 = c1.divide(c2);

        System.out.println(c3.converteParaString());
        System.out.println(c4.converteParaString());
        System.out.println(c5.converteParaString());
        System.out.println(c6.converteParaString());
    }
}