import java.util.Optional;

public class Auto {
    public Optional<String> devolverCadena(String cadenita){
        if(cadenita.length()>8){
            return Optional.of(cadenita);
        }else{
            return Optional.empty();
        }
    }
}
