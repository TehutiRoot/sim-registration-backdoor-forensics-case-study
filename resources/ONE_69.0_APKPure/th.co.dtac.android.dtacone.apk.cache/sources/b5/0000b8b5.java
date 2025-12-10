package com.jakewharton.rxbinding2.internal;

import androidx.annotation.RestrictTo;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class Functions {
    public static final Callable<Boolean> CALLABLE_ALWAYS_TRUE;
    public static final Predicate<Object> PREDICATE_ALWAYS_TRUE;

    /* renamed from: a */
    public static final CallableC9058a f58226a;

    /* renamed from: com.jakewharton.rxbinding2.internal.Functions$a */
    /* loaded from: classes5.dex */
    public static final class CallableC9058a implements Callable, Predicate {

        /* renamed from: a */
        public final Boolean f58227a;

        public CallableC9058a(Boolean bool) {
            this.f58227a = bool;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return this.f58227a;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return this.f58227a.booleanValue();
        }
    }

    static {
        CallableC9058a callableC9058a = new CallableC9058a(Boolean.TRUE);
        f58226a = callableC9058a;
        CALLABLE_ALWAYS_TRUE = callableC9058a;
        PREDICATE_ALWAYS_TRUE = callableC9058a;
    }
}