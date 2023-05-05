package logProcessors;

public class ErrorLogProcessor extends BaseLogProcessor{
    public ErrorLogProcessor(BaseLogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    @Override
    public void log(String logLevel, String message) {
        if(LogLevels.ERROR.toString().equals(logLevel)){
            System.out.println("error logging:"+ message);
        }else{
            super.log(logLevel, message);
        }
    }
}
