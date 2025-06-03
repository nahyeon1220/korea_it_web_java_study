package _31_Generic.Product;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product<T> {

    private String productName;
    private T productInfo;

}
