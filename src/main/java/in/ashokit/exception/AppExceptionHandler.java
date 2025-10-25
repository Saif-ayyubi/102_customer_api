package in.ashokit.exception;

import in.ashokit.response.ApiResponse;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class AppExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(AppExceptionHandler.class);

    public ResponseEntity<ApiResponse<String>> handleException(Exception e){
        ApiResponse<String> response = new ApiResponse<>();
        response.setStatus(500);
        response.setMsg(e.getMessage());
        response.setData(null);

        log.error(e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
