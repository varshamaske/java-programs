
import java.util.*;

class StringX
{
  public String str;

  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter String");
    str = sobj.nextLine();
  }

  public void Display()
  {
    System.out.println("String is : "+str);
  }
}

class Marvellous extends StringX
{
  public boolean CheckPallindrome()
  {
     char Arr[] = str.toCharArray();
     int iStart = 0, iEnd = Arr.length-1;
     char Temp;

     while(iStart < iEnd)
     {
      Temp = Arr[iStart];
      Arr[iStart] = Arr[iEnd];
      Arr[iEnd] = Temp;
      
      iStart++;
      iEnd--;
     }
     
     String newstr = new String(Arr);
     boolean bRet = newstr.equals(str);
     return bRet;
  }

}

class Program156
{
  public static void main(String[] arg)
  {
     Marvellous mobj = new Marvellous();
    
     mobj.Accept();
     mobj.Display();
     boolean bRet = false;

     bRet = mobj.CheckPallindrome();

     if(bRet == true)
     {
        System.out.println("String is pallindrome");
     }
     else
     {
         System.out.println("String is not pallindrome");
     }
  }
}