import org.w3c.dom.ls.LSOutput;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;


public class example_code {

    Flux<String> flux = Flux.generate(
            () -> 0,
            (state, sink) -> {
                sink.next("3 * " + state + " = " + 3*state);
                if(state == 10) sink.complete();
                return state + 1;
            }
    );

    Flux<String> fluxString = Flux.just("1", "2", "3");

    List<String> list = Arrays.asList("1", "2", "3");
    Flux<String> fluxFromList = Flux.fromIterable(list);

}
