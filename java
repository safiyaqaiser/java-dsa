 1/ 
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int n=4;
        int index=2;
        for(int i=n;i>index;i--){
            arr[i]=arr[i-1];
            arr[3]=33;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }


        } 

1. largest element

  public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }
        System.out.println(largest);
    }
}

2. sum of elements

  public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
            System.out.println(sum);
        }
    }
3. linear search

  public class Main {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int target = 30;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("element found");
                System.out.println(arr[i]);
            }
        }
    }
}
4. string linear search with input 
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String a[]={"aa","bb","cc"};
        Scanner s=new Scanner(System.in);
        System.out.println("enter your string ");
         String target=s.nextLine();

        for(int i=0;i<a.length;i++){
            if(target.equals(a[i]) ){
                System.out.println(i);
                System.out.println("target");
            }

            }

        }

    }
5 ARRAY SECOND LARESGT [use two variable]
 public class Main {
    public static void main(String[] args) {
        int a[]={10,20,30,50};
        int l=a[0];
        int sl=a[0];
        for(int i=1;i<a.length;i++){
        if(l<a[i]){
            sl=l;
            l=a[i];


        }



        }

        System.out.println("second largest"+sl);

    }

    }
6.two pointer 
 public class Main {
    public static void main(String[] args) {
     int a[]={10,20,30,40,50};
     int l=0;
     int r=a.length-1;
     while(l<r) {
         int empty=a[l];
         a[l]=a[r];
         a[r]=empty;
         l++;
         r--;
     }
     for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
     }
     }
    }
7 reversing and finding middle element [if u want divide like find the middle then   int m=a[a.length/2];]
 public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int l = 0;
        int r = a.length - 1;
        while (l < r) {
            int empty = a[l];
            a[l] = a[r];
            a[r] = empty;
            l++;
            r--;
        }
        int m=a[a.length/2];

            for (int i = 0; i < a.length; i++) {

                System.out.println(a[i]);




        }
        System.out.println(m);
    }
}
8 sum of array 
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }}
9.sum and avg
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int sum=0;
        int avg=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
             avg=sum/2;
        }
        System.out.println(sum);
        System.out.println(avg);
    }}
10 count even and odd 
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,5};
        int e=0;
        int odd=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e++;
            }
            else{
                odd++;
            }
        }
        System.out.println(e);
        System.out.println(odd);
    }}
11 find smallest and largest
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,5};
        int l=a[0];
        int s=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>l){
                l=a[i];
            }
            if(a[i]<s){
                s=a[i];
            }



        }
        System.out.println(l);
        System.out.println(s);
    }}
12 check if soretd or not 
 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 6, 4, 5, 3};


        for (int i = 1; i < a.length; i++) {

            if (a[i] > a[i - 1]) {
                System.out.println("not sorted");
                return;

            } else {
                System.out.println(" sorted");
            }
        }
    }}
13 public class Main {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int target = 4;
        int l = 0;
        int r = a.length - 1;


       while(l<=r){
           int mid = (l + r) / 2;
            if (target == a[mid]) {
                System.out.println("found"+mid);
               return;

            }

            if (target > a[mid]) {
               l= mid+1;



            }
            else{
               r= mid-1;
            }


        }
        System.out.println("target not found");


    }
❌ You compared target == mid.
✅ Then you changed it to target == a[mid].
❌ You used mid++.
✅ Then you changed it to mid + 1.
❌ You forgot to update mid.
✅ Then you moved mid inside the while.
 14 bubble sort (use j and j+1 because we r comapring the next adjacent element)
 public class Main {
    public static void main(String[] args) {
        int a[] = {3, 1, 4, 2};

        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {(till last element 1 and -i the last place is fixed now)
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;




                }
            }


        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
15 public class Main {
    public static void main(String[] args) {
        int a[] = {3, 1, 4, 2};

        int add = 6;
        int left = 0;
        int right = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]+a[j]==add) {
                    System.out.println("index"+i+"" +j);
                    System.out.println("values"+a[i]+a[j]);

                }
            }


        }

    }
}






































