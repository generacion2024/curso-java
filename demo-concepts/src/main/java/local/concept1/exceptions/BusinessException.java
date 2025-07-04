package local.concept1.exceptions;


/// Checked Exception

public class BusinessException extends Exception{

    BusinessException(ErrorCodes code, String mesage) {
        super(message);
        this.code = code;

    }

    BusinessException(ErrorCodes code, string messge) {
        super(generateMessage(code, message));
        this.code = code;
    }
}


enum ErrorCodes {
    ERROR_EVEN("No se admiten numeros parres"),
    ERROR_NEGATIVE("No se admiten numeros negatvos")
}

