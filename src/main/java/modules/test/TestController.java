package modules.test;

import kernel.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins = "*")

public class TestController {

    @GetMapping("")
    public ResponseEntity testApi() {
        ApiResponse body = new ApiResponse(
                HttpStatus.OK,
                null,
                "Api en funcionamiento"
        );
        return new ResponseEntity<>(body, body.getStatus());
    }
}