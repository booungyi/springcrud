package tjoen.springcrud;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyRestController {


    @PostMapping("/products")
    String postproducts() {
        return "postproducts";
    }

    @GetMapping("/products")
    String getproducts() {
        return "getproducts";
    }

    @PutMapping("/products/{productId}")
    String update(@PathVariable(name = "productId") Long id) {
        return "상품 수정 ID: " + id;
    }

    @DeleteMapping("/products/125")
    String deletproducts() {
        return "상품 삭제";
    }


}
