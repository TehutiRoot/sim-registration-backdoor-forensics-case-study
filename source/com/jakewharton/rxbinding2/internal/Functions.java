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
    public static final CallableC9069a f58214a;

    /* renamed from: com.jakewharton.rxbinding2.internal.Functions$a */
    /* loaded from: classes5.dex */
    public static final class CallableC9069a implements Callable, Predicate {

        /* renamed from: a */
        public final Boolean f58215a;

        public CallableC9069a(Boolean bool) {
            this.f58215a = bool;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Boolean call() {
            return this.f58215a;
        }

        @Override // io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            return this.f58215a.booleanValue();
        }
    }

    static {
        CallableC9069a callableC9069a = new CallableC9069a(Boolean.TRUE);
        f58214a = callableC9069a;
        CALLABLE_ALWAYS_TRUE = callableC9069a;
        PREDICATE_ALWAYS_TRUE = callableC9069a;
    }
}
