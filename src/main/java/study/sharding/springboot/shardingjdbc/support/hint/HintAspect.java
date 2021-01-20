package study.sharding.springboot.shardingjdbc.support.hint;

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

        //public
        //study.sharding.springboot.shardingjdbc.dao.userbase.UserBaseEO
        //study.sharding.springboot.shardingjdbc.service.UserServiceImpl.get(java.lang.Long)
        String longStr = signature.toLongString();
        String str = signature.toString();
        log.info("111111{}", longStr);
        //UserServiceImpl.get(java.lang.Long)
        log.info("222222{}", str);

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
