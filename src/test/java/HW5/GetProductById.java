package HW5;

import HW5.api.ProductService;
import HW5.dto.Product;
import HW5.utils.RetrofitUtils;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductById {
    static ProductService productService;

    @BeforeAll

    static void beforeAll() throws IOException {
        productService = RetrofitUtils.getRetrofit()
                .create(ProductService.class);
    }
     @Test

    void getProductId () throws IOException {
         Response<Product> response = productService.getProductById(1).execute();

         assertThat(response.isSuccessful(), CoreMatchers.is(true));
         assertThat(response.body().getId(), equalTo(1));
         assertThat(response.body().getCategoryTitle(), equalTo("Food"));
         assertThat(response.body().getTitle(), equalTo("Milk"));
         assertThat(response.body().getPrice(), equalTo(95));

     }


}
