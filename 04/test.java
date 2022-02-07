public class test
{
   // finds all the perfect numbers from 2 to 1000
   public static void main( String args[] )
   {
      for ( int number = 2; number <= 1000; number++ )
      {
         String result = isPerfect( number );

         if ( result != null )
            System.out.printf ( "%d is perfect!\n\tFactors: %s\n",
               number, result );
      } // end for
   } // end main

   // returns a string of factors if parameter is a
   // perfect number, or null if it isn't.
   public static String isPerfect( int value )
   {
      int factorSum = 1;
      String factors = "1 ";

      for ( int test = 2; test <= value / 2; test++ )
      {
         if ( value % test == 0 )
         {
            factorSum += test;
            factors += test + " ";
         } // end if
      } // end for

      if ( factorSum == value ){ return factors;}
      else { return null; }

   } // end method isPerfect
} // end class PerfectNumber

