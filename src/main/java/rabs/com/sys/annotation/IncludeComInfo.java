package rabs.com.sys.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) 
public @interface IncludeComInfo {
	String name() default "";		
	String listUrl() default "";	
	int order() default 0;		
	int level() default 5;	// 기본권한 5 일반사용자
}



