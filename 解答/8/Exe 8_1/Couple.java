public class Couple{
   private Man m;
   private Woman w;
   public Couple(Man m, Woman w){
     this.m = m;
     this.w = w;
   }

   public void changeMan(Man m){ this.m = m; }
   public Man getMan(){ return m; }
   public Woman getWoman(){ return w; }
   
   public String toString(){
    return w + " and  " + m + " are now in love";
   // or return getWoman() + " and  " + getMan() + " are now in love";
   }
}
   
