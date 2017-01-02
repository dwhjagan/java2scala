package x.crazyjvm.adapter.j;
import java.util.logging.Level;

public final class Logger {
    void log(Level level, String message) { /* ... */ }
}

class LoggerToLogAdapter implements Log {
    private final Logger logger;

    public LoggerToLogAdapter(Logger logger)
    { this.logger = logger; }

    public void warning(String message) {
        logger.log(Level.WARNING, message);
    }

    public void severe(String message) {
        logger.log(Level.SEVERE, message);
    }
}

//Log log = new LoggerToLogAdapter(new Logger());


