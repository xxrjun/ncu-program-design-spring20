package EXE9_2;

public class Test {
    public static void main(String[] args){
        SuperA sa = new SuperA();
        SubB sb = new SubB();

        System.out.println(sb.getV1());

        sb.setV1("data from sub");
        sb.mb();
        System.out.println(sb.getV1());
        System.out.println(sa.getV1());
    }
}
