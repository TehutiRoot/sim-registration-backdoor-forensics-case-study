package com.mobsandgeeks.saripaar.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.mobsandgeeks.saripaar.annotation.Or */
/* loaded from: classes5.dex */
public @interface InterfaceC9229Or {
    String message() default "One of the rules must be valid";

    int messageResId() default -1;
}
