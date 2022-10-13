package md.ceiti.api;

import md.ceiti.util.NegativeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class DefaultExceptionHandlingController {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public NegativeResponse processExceptions(final IllegalArgumentException exception){
        return new NegativeResponse(exception.getMessage());
    }

}
