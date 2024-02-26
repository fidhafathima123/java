public class ArraySearchExample 
{
public static void main(String[] args) 
{
System.out.println("Fidha Fathima \n 23MCA027 \n 26-February-2024");
int array[] = { 1, 5, 9, 3, 4, 7 };
int target = 3;
boolean found = false;

for (int i = 0; i < array.length; i++) 
{
if (array[i] == target) 
{
found = true;
break;
}
}

if (found) {
System.out.println("Element " + target + " found in the array.");
} else {
System.out.println("Element " + target + " not found in the array.");
}
}
}
