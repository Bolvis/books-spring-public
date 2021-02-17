package pl.bolvis.books.exceptin;

public class ValidException extends Exception{

    public ValidException(String errorMessage, Throwable err){
        super(errorMessage, err);
    }
}
