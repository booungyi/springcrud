package tjoen.springcrud;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record CreateMovieRequeset(
        @Size(min = 1, max = 10) String title,

        @Min(1980)
        @Positive
        int year) {
}
