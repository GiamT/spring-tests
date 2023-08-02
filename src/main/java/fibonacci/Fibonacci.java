package fibonacci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class Fibonacci {

    public static void main(String[] args) {
        SpringApplication.run(Fibonacci.class, args);
    }

    @GetMapping("/fibonacci")
    public List<Integer> fibonacciSeries(@RequestParam(value = "n", defaultValue = "10") int n) {
        List<Integer> series = new ArrayList<>();
        int prev = 0;
        int curr = 1;

        for (int i = 0; i < n; i++) {
            series.add(prev);
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return series;
    }
}