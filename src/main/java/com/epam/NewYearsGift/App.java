package com.epam.NewYearsGift;
import java.util.*;
import sweets.*;

/**
 * Hello world!
 *
 */
public class App 
{
	static void sort(int[] Array,String[] Array2)
	{
		for(int i=0;i<4;i++)
    	{
    		int Max = i;
    		for(int j=i+1;j<5;j++)
    		{
    			if(Array[Max]<Array[j])
    			{
    				Max = j;
    			}
    		}
    		int temp1 = Array[Max];
    		String temp2 = Array2[Max];
    		Array[Max] = Array[i];
    		Array2[Max] = Array2[i];
    		Array[i] = temp1;
    		Array2[i] = temp2;
    	}
	}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Scanner sc = new Scanner(System.in);
    	int candy_weight=0,candyId=0,cookie_weight=0,cookieId=0,chocolate_weight=0,chocolateId=0,jellybean_weight=0,jellybeanId=0,marshmallow_weight=0,marshmallowId=0;
    	System.out.println("The different kinds of sweets presented for New Year are 'Candy','Chocolate','Cookie','JellyBean','Marshmallow'");
    	for(int i=0;i<5;i++)
    	{
    		if(i==0)
    		{
    			System.out.print("Enter the Weight of candy and candy id");
    			candy_weight = sc.nextInt();
    			candyId = sc.nextInt();
    			
    		}
    		else if(i==1)
    		{
    			System.out.print("Enter the Weight of cookie and cookie id");
    			cookie_weight = sc.nextInt();
    			cookieId = sc.nextInt();
    			
    		}
    		else if(i==2)
    		{
    			System.out.print("Enter the Weight of chocolate and chocolate id");
    			chocolate_weight = sc.nextInt();
    			chocolateId = sc.nextInt();
    		}
    		else if(i==3)
    		{
    			System.out.print("Enter the Weight of jellybean and jellybean id");
    			jellybean_weight = sc.nextInt();
    			jellybeanId = sc.nextInt();
    		}
    		else if(i==4)
    		{
    			System.out.print("Enter the Weight of marshmallow and marshmallow id");
    			marshmallow_weight = sc.nextInt();
    			marshmallowId = sc.nextInt();
    		}
    	}
    	sc.close();
    	Candy candy = new Candy(candy_weight,"CANDY",candyId);
    	Cookie cookie = new Cookie(cookie_weight,"COOKIE",cookieId);
    	Chocolate chocolate = new Chocolate(chocolate_weight,"CHOCOLATE",chocolateId);
    	JellyBean jellybean = new JellyBean(jellybean_weight,"JELLYBEAN",jellybeanId);
    	Marshmallow marshmallow = new Marshmallow(marshmallow_weight,"MARSHMALLOW",marshmallowId);
    	Sweets[] gift = {candy, cookie, jellybean, marshmallow, chocolate};
    	int[] Array = new int[5];
    	String[] Array2 = new String[5];
    	System.out.println("The Different Sweets with their ids and weights are");
    	for (Sweets Parameter : gift)
    	{
    		System.out.println(Parameter.toString());
    	}
    	for(int i=0;i<5;i++)
    	{
    		Array[i] = gift[i].getWeight();
    		Array2[i] = gift[i].toString();
    	}
    	sort(Array,Array2);
    	System.out.println("the Different Sweets after Getting Sorted W.R.T Weights are");
    	for(int i=0;i<5;i++)
    	{
    		System.out.println(Array2[i]);
    	}
    }
}
