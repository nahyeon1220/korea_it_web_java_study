package StreamApi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private String name;
    private int price;
}
