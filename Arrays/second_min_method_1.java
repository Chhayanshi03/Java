import java.util.*;
public class second_min_method_1 {
    public static int min_check(int a[],int n){
        int min=a[0];
        for(int i=0; i<n; i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }

    public static int search(int a[], int num){
        int f=-1;
        for(int i=0; i<a.length; i++){
            if(a[i]==num){
                f=i;
                break;
            }
        }
        return f;
    }

    public static int[] delete(int a[], int num){
        int idx = search(a,num);
        if(idx!=-1){
            for(int i=idx; i<a.length-1; i++){
                a[i]=a[i+1];
            }
        }
        return a;
    }

    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Enter "+i+" element: ");
            a[i]= sc.nextInt();
        }

        int min = min_check(a,n);
        System.out.println("The First min is "+min);
        delete(a, min);
        n--;
        System.out.println("After removing 1st min, new array will be: ");
        print(a);
        System.out.println("\nNow finding second min");
        min = min_check(a,n);
        System.out.println("The second min is "+min);

        sc.close();
    }
}
