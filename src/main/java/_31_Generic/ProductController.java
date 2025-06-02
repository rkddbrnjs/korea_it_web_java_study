package _31_Generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductController<T> {
    private String product;
    private T data;

    @Override
    public String toString() {
        return product + data;
    }
}

