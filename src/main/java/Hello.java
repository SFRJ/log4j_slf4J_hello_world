import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Hello.class);

        final String message = "hello";
        logger.trace(message);
        logger.debug(message);
        logger.info(message);
        logger.warn(message);
        logger.error(message);
    }
}
