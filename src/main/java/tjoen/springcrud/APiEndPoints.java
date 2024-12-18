package tjoen.springcrud;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class APiEndPoints {

    @GetMapping("/time")
    LocalDateTime apicontrol() {
        return LocalDateTime.now();
    }

    @GetMapping("/lotto-number")
    public int getLottoNumber() {
        return new Random().nextInt(45) + 1;
    }

    @GetMapping("/lotto-numbers")
    List<Integer> getLottoNumberes() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add(getLottoNumber());
        }
        return list;
    }

    @GetMapping("/square")
    int calculateSquare(@RequestParam int numberToSquare) {
        return numberToSquare * numberToSquare;
    }

    @GetMapping("/fahrenheit")
    double celsius(@RequestParam double celsiusDegree) {
        return celsiusDegree * 1.8 + 32;
    }

    @GetMapping("/square/{numberToSquare}")
    int calculate(@PathVariable int numberToSquare) {
        return numberToSquare * numberToSquare;
    }

    @GetMapping("/fahrenheit/{celsiusDegree}")
    double celsiuspath(@PathVariable double celsiusDegree) { //생략하는게 안됨
        return celsiusDegree * 1.8 + 32;
    }

    @PostMapping("/square")
    int squareint(@RequestBody SquareDto numberToSquare) {
        return numberToSquare.getNumberToSquare() * numberToSquare.getNumberToSquare();
    }

    @PostMapping("/convert-c-to-f")
    double celsiuspost(@RequestBody SquareRequset celsius) {
        return celsius.celsius() * 1.8 + 32;
    }

    @PostMapping("/movies")
    void createMovie(@Valid @RequestBody CreateMovieRequeset requeset) {

        //@Valid = 검사하기 @RequestBody랑 한쌍
        System.out.println("**********************");
        System.out.println("creatMovie()함수 호출됨");
        System.out.println("**********************");
    }
}
