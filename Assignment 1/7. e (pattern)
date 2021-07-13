public class karan {

    public static int ncr(int n, int r) {

        int ans = 1;

        for (int i = 1; i <= r; i++) {
            ans = ans * (n - i + 1) / i;
        }
        return ans;
    }

    public static void pattern1(int n) {

        int nst = 1;
        int id = 1;
        System.out.println("1");
        while (id <= n) {
            int cst = 0;
            while (cst <= nst) {
                System.out.print(ncr(id, cst) + " ");
                cst++;
            }
            nst++;
            System.out.println();
            id++;
        }

    }

    public static void main(String[] args) {
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);

    }
}


execution:

enter a number: 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
