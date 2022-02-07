public class TestScreen{
   public static void main(String [] abc){ 
//輪胎有兩種選擇，注意輪子皆是成雙。例如w1包含前後兩輪胎     
      Wheel w1 = new Wheel("16吋", 16, 2000);
      Wheel w2 = new Wheel("20吋", 20, 3000);

//車架有三種選擇     
      Frame f1 = new Frame("a牌經濟型", "iron", 2000);
      Frame f2 = new Frame("b牌都會型", "iron", 3000);
      Frame f3 = new Frame("c牌專業輕量型", "alloy", 5000);

//賣出(具體化)第一台，輪子為16吋、車架為"a牌經濟型" 的小摺

      Bicycle b1 = new Bicycle(w1, f1);
      System.out.println("第一台價格為：" + b1.getCost());

//賣出(具體化)第二台，輪子為20吋、車架為"a牌經濟型"的小摺    
      Bicycle b2 = new Bicycle(w2, f1);
      System.out.println("第二台價格為：" +b2.getCost());

//第一台皆換成20吋的輪子，並列印出更換後的車子價格
      b1.setWheel(w2);
      System.out.println("第一台換輪子後價格為：" + b1.getCost());

//系統列印目前售出的小摺總台數
      System.out.println("目前共組合了" + b1.getQuantity() + "台小摺。");
     }
}
