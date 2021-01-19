package study.sharding.springboot.shardingjdbc.support.hint;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class HintAspect {

    @Around("@annotation(master)")
    public Object around(ProceedingJoinPoint joinPoint, Master master) throws Throwable {
        //日志
        Signature signature = joinPoint.getSignature();
        signature.toLongString();
        signature.toString();

        String shortName = signature.toShortString();
        try {
            log.info("[{}] master route", shortName);
            HintManagers.setMasterRouteOnly();
            return joinPoint.proceed();
        } catch (Throwable ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}
