package logProcessors;

public class DebugLogProcessor extends  BaseLogProcessor{
    public DebugLogProcessor(BaseLogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if(LogLevels.DEBUG.toString().equals(logLevel)){
            System.out.println("debug logging:"+ message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
