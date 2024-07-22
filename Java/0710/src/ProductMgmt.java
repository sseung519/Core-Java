import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProductMgmt {
    public static void main(String[] args) throws IOException {
        Product[] products = new Product[7];
        Scanner sc = new Scanner(new File("src/product.dat"));
        Product product = new Product();

        for (int i = 0; i < 7 ; i++) {
            products[i] = new Product();
            String line = sc.nextLine();
            String[] array = line.split("\\s+");

            products[i].name = array[0];
            products[i].count = Integer.parseInt(array[1].trim());
            products[i].price = Integer.parseInt(array[2].trim());
            products[i].originalPrice = Integer.parseInt(array[3].trim());
            products[i].shippingPrice = Integer.parseInt(array[4].trim());
            int margin = (products[i].count * products[i].price) - (products[i].count * products[i].originalPrice + products[i].shippingPrice);
            int marginRate = margin / products[i].originalPrice * 100;
            products[i].setMargin(margin);
            products[i].setMarginRate(marginRate);
        }
        int j = 0;
        while(j < products.length) {
            System.out.println(products[j].name+ " " + products[j].count
            + " " + products[j].price +  " " + products[j].originalPrice+ " " + products[j].shippingPrice
            + " " + products[j].getMargin() + " " + products[j].getMarginRate());
            j++;
        }
    }
}
