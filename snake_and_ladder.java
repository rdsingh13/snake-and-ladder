import java.util.*;
 class snake_and_ladder
{
public static void main(String arg[])
{
/*array first = new array(); 
array second = new array(); */
 int arr[][]=new int[10][10];
for(int i=0;i<10;i++)
{
    for(int j=0;j<10;j++)
    {
        if(i%2==0)
        {
            arr[i][j]=(10*i)+j+1;
        }
        else
        {
            arr[i][j]=(10*i)+(10-j);
        }
    }
}
System.out.println("");
for(int i=9;i>=0;i--)
{
    for(int j=0;j<10;j++)
    {
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
System.out.println();
int move=0,a=-1,b=-1,c,x=0,y=0,z=0,d=0,g=0;
Scanner rd = new Scanner(System.in);
while(a<100&&b<100)
{
    if(move%2==0)
    {
         System.out.println("player 1 turn");
         if(a==-1)
         {
             c=rd.nextInt();
             System.out.println("Dice value "+c);
             if(c==6)
             a=0;
         }
         else
         {
          c=rd.nextInt();
             System.out.println("Dice value "+c);
             a=a+c;
             if(a==1)
         {
             a=38;
            
         }
              if(a==4)
         {
             a=14;
            
         }
                if(a==8)
         {
             a=30;
             
         }
               if(a==21)
         {
             a=42;
             
         }
              if(a==28)
         {
             a=76;
             
         }
               if(a==50)
         {
             a=67;
           
         }
        if(a==71)
         {
             a=92;
            
         }
    if(a==80)
         {
             a=99;
             
         }
             if(a==97)
         {
             a=78;
           
         }
            if(a==95)
         {
             a=56;
           
         }
            if(a==88)
         {
             a=24;
          
         }
            if(a==62)
         {
             a=18;
             
         }
             if(a==48)
         {
             a=26;
             
         }
            if(a==36)
         {
             a=6;
            
         } 
            if(a==32)
         {
             a=10;
             
         }  
              if(a>100)
              {
                  a=a-c;
              }
              if(c==6)
              move--;
         }
         for(int i=9;i>=0;i--)
{
    for(int j=0;j<10;j++)
    {
        if(arr[i][j]==a)
        System.out.print("NO.1 ");
        else
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
            


   if(a==100)
{
System.out.println("player 1 winner");
break;
}          
        
         }
    
    else
    {
     System.out.println("player 2 turn");
         if(b==-1)
         {
             c=rd.nextInt();
             System.out.println("Dice value "+c);
             if(c==6)
             b=0;
         }
         else
         {
          c=rd.nextInt();
             System.out.println("Dice value "+c);
             b=b+c;
              if(b>100)
              {
                  b=b-c;
              }

                 if(a==1)
         {
             a=38;
            
         }
              if(a==4)
         {
             a=14;
           
         }
                if(a==8)
         {
             a=30;
           
         }
               if(a==21)
         {
             a=42;
            
         }
              if(a==28)
         {
             a=76;
            
         }
               if(a==50)
         {
             a=67;
             
         }
        if(a==71)
         {
             a=92;
            
         }
    if(a==80)
         {
             a=99;
             

         }
             if(a==97)
         {
             a=78;
             
         }
            if(a==95)
         {
             a=56;
             
         }
            if(a==88)
         {
             a=24;
             
         }
            if(a==62)
         {
             a=18;
             
         }
             if(a==48)
         {
             a=26;
             
         }
            if(a==36)
         {
             a=6;
             
         } 
            if(a==32)
         {
             a=10;
             
         } 
               if(c==6)
              move--;
         }
                 for(int i=9;i>=0;i--)
{
    for(int j=0;j<10;j++)
    {
        if(arr[i][j]==b)
        System.out.print("NO.2 ");
        else
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
if(b==100)
{
System.out.println("player 2 winner");
break;
}
    }
    move++;
}
}
}
/* class array
{ 
public static int getNum(){
    Random rand=new Random();
    int randomNum=rand.nextInt(6)+1;
    return randomNum;
}
}*/
