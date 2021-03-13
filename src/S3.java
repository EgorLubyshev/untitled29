public class S3 {

    public static void quickSort(int[] a, int low, int high) {
        if (a.length == 0)
            return; //завершение выполнение алгоритма, если длина массива равна 0

        if (low >= high)
            return; //завершение выполнение алгоритма, если уже нечего делить

        // выбор опорного элемента
        int middle = low + (high - low) / 2;
        int op = a[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (a[i] < op) {
                i++;
            }
            while (a[j] > op) {
                j--;
            }

            if (i <= j) { //меняем элементы местами
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(a, low, j);

        if (high > i)
            quickSort(a, i, high);
    }


    public  static  void main(String[] kk){
            int[] a = new   int[10];
            for (int i = 0 ; i<a.length; i++){
                a[i]= (int) (Math.random()*1000);
                System.out.print(a[i]+" ");
            }
            quickSort(a, 0 , a.length-1);

        for (int i = 0 ; i<a.length; i++) System.out.println(a[i]+" ");

    }


}
