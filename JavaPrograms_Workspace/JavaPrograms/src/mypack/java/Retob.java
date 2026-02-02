package mypack.java;
class ObjectA
 {
   int a;

   ObjectA(int i)
    {
      a=i;
     }
    
    ObjectA multiply()
     {
       ObjectA temp = new ObjectA(a*10);
       return temp;
      }
   }

class Retob
 {
   public static void main(String ar[])
    {
       ObjectA ob1 = new ObjectA(2);
       ObjectA ob2;
       ob2 = ob1.multiply();
       System.out.println("ob1.a :" + ob1.a);
       System.out.println("ob2.a :" + ob2.a);
      }
   }

      