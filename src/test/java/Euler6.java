class Euler6{

    public static void main(String[] args) {


        Euler6 euler6 = new Euler6();
        System.out.println(euler6.difference(100));

    }

    public int difference(int numbers) {

        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i <numbers ; i++) {

            sum1 = sum2 + (int)Math.pow(i,2);
            sum2 = sum2 + i;

        }
        sum2 = (int)Math.pow(sum2,2);

        return sum2 - sum1;

    }
}
