package edu.note.spring.aop.aop;

// import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//切面类
//@Aspect
@Component
public class MyAspect6 {

    //@Pointcut("execution(public void note.spring.aop.controller.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    //@Pointcut("execution(void note.spring.aop.controller.service.impl.DeptServiceImpl.delete(java.lang.Integer))")
    //@Pointcut("execution(void delete(java.lang.Integer))") //包名.类名不建议省略
    //@Pointcut("execution(void note.spring.aop.controller.service.DeptService.delete(java.lang.Integer))")

    //@Pointcut("execution(void note.spring.aop.controller.service.DeptService.*(java.lang.Integer))")
    //@Pointcut("execution(* com.*.service.DeptService.*(*))")
    //@Pointcut("execution(* note.spring.aop.controller.service.*Service.delete*(*))")

    //@Pointcut("execution(* note.spring.aop.controller.service.DeptService.*(..))")
    //@Pointcut("execution(* com..DeptService.*(..))")
    //@Pointcut("execution(* com..*.*(..))")
    //@Pointcut("execution(* *(..))") //慎用 匹配所有

    @Pointcut("execution(* edu.note.spring.aop.controller.OrderController.list()) || " +
            "execution(* edu.note.spring.aop.controller.OrderController.delete(java.lang.Integer))")
    private void pt(){}

    @Before("pt()")
    public void before(){
        System.out.println("MyAspect6 ... before ...");
    }

}
