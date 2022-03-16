public class LogLevels {
    
    public static String message(String logLine) {
      String message = logLine.strip().substring(logLine.indexOf(":")+1).strip();
      return message;
    }

    public static String logLevel(String logLine) {
      String level = logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")).toLowerCase();
      return level;
    }

    public static String reformat(String logLine) {
      return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
