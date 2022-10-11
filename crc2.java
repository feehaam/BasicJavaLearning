import java.util.Scanner;

public class crc2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int divisor_b, divisor[], data_b, data[], z[], rem[], msb, i, j, k;

        System.out.print("ENTER NUMBER OF DATA BITS:\n");
        data_b = input.nextInt();
        System.out.print("ENTER NUMBER OF DIVISOR BITS:\n");
        divisor_b = input.nextInt();

        data = new int[data_b + divisor_b];

        divisor = new int[divisor_b];

        System.out.print("ENTER DATA BITS:\n");
        for (i = 0; i < data_b; i++) {
            data[i] = input.nextInt();
        }

        System.out.println("ENTER DIVISOR BITS:");
        for (j = 0; j < divisor_b; j++) {
            divisor[j] = input.nextInt();
        }

        for (i = 0; i < divisor_b - 1; i++) {
            data[data_b + i] = 0;
        }
        rem = new int[divisor_b + data_b];

        for (i = 0; i < divisor_b; i++) {
            rem[i] = data[i];
        }
        z = new int[divisor_b];

        for (i = 0; i < divisor_b; i++) {
            z[i] = 0;
        }

        for (i = 0; i < data_b; i++) {
            k = 0;
            msb = rem[i];
            for (j = i; j < divisor_b + i; j++) {
                if (msb == 0) {
                    rem[j] = xor(rem[j], z[k]);
                } else {
                    rem[j] = xor(rem[j], divisor[k]);
                }
                k++;
            }
            rem[divisor_b + i] = data[divisor_b + i];
        }

        System.out.print("\nTHE REMAINDER IS:");
        for (i = data_b; i < data_b + divisor_b - 1; i++) {
            data[i] = rem[i];
            System.out.print(data[i]);
        }
        System.out.println("");

        System.out.print("\nTHE CRC CODE IS:");
        for (i = 0; i < data_b + divisor_b - 1; i++) {
            System.out.print(data[i]);
        }
        System.out.println("");
    }

    public static int xor(int x, int y) {
        if (x == y) {
            return (0);
        } else {
            return (1);
        }
    }
}