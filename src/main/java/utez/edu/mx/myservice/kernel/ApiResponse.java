package utez.edu.mx.myservice.kernel;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse {
    private String message;
    private Object data;
    private boolean error;
    private HttpStatus status;

    public ApiResponse() {
    }

    public ApiResponse(String message, Object data, boolean error, HttpStatus status) {
        this.message = message;
        this.data = data;
        this.error = error;
        this.status = status;
    }

    public ApiResponse(HttpStatus status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }
}
