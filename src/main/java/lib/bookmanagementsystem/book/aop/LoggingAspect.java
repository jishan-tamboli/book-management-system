package lib.bookmanagementsystem.book.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger log =
            LoggerFactory.getLogger(LoggingAspect.class);


    @Pointcut("execution(* lib.bookmanagementsystem.book.service.BookService.*(..))")
    public void bookServiceMethods() {}


    @Around("bookServiceMethods()")
    public Object logEverything(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.nanoTime();
        String methodName = joinPoint.getSignature().getName();

        log.info("Method started: {}", methodName);

        try {
            Object result = joinPoint.proceed();

            log.info(" Method returned: {}", methodName);
            return result;

        } catch (Throwable ex) {
            log.error(" Exception in {} : {}", methodName, ex.getMessage());
            throw ex;

        } finally {
            long timeTaken =
                    (System.nanoTime() - startTime) / 1_000_000;

            log.info(" Time taken by {} : {} ms", methodName, timeTaken);
            log.info(" Method finished: {}", methodName);
        }
    }
}
