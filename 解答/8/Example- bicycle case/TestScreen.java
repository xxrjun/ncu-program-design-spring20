public class TestScreen{
   public static void main(String [] abc){ 
//���L����ؿ�ܡA�`�N���l�ҬO�����C�Ҧpw1�]�t�e�����L     
      Wheel w1 = new Wheel("16�T", 16, 2000);
      Wheel w2 = new Wheel("20�T", 20, 3000);

//���[���T�ؿ��     
      Frame f1 = new Frame("a�P�g�٫�", "iron", 2000);
      Frame f2 = new Frame("b�P���|��", "iron", 3000);
      Frame f3 = new Frame("c�P�M�~���q��", "alloy", 5000);

      //��X(�����)�Ĥ@�x�A���l��16�T�B���[��"a�P�g�٫�" ���p�P
      Bicycle b1 = new Bicycle(w1, f1);
      System.out.println("�Ĥ@�x���欰�G" + b1.getCost());

      //��X(�����)�ĤG�x�A���l��20�T�B���[��"a�P�g�٫�"���p�P    
      Bicycle b2 = new Bicycle(w2, f1);
      System.out.println("�ĤG�x���欰�G" +b2.getCost());

      //�Ĥ@�x�Ҵ���20�T�����l�A�æC�L�X�󴫫᪺���l����
      b1.setWheel(w2);
      System.out.println("�Ĥ@�x�����l����欰�G" + b1.getCost());
    }
}
