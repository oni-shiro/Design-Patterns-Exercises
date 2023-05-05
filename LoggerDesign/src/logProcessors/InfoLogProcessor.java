package logProcessors;

public class InfoLogProcessor extends BaseLogProcessor{


    public InfoLogProcessor(BaseLogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String logLevel, String message) {
        if(LogLevels.INFO.toString().equals(logLevel)){
            System.out.println("info logging:"+ message);
        }else{
            super.log(logLevel, message);
        }

    }
}
