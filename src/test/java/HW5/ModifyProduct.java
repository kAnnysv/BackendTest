package HW5;

import HW5.api.ProductService;
import HW5.dto.Product;
import HW5.utils.RetrofitUtils;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;

public class ModifyProduct {

    static ProductService productService;
    Product product = null;

    @BeforeAll

    static void beforeAll() throws IOException {
        productService = RetrofitUtils.getRetrofit()
                .create(ProductService.class);
    }

    @BeforeEach



    void setUp() {
        product = new Product()
                .withId(1)
                .withTitle("mILk")
                .withPrice(110)
                .withCategoryTitle("Food");

    }

    @Test
    void modifyProductTest() throws IOException {
        Response<Product> response = productService.modifyProduct(product)
                .execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }





}
