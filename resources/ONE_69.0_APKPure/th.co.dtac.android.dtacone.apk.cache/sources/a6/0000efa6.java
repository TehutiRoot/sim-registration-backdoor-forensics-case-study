package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.Predicate;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOPredicate */
/* loaded from: classes6.dex */
public interface IOPredicate<T> {
    IOPredicate<T> and(IOPredicate<? super T> iOPredicate);

    Predicate<T> asPredicate();

    IOPredicate<T> negate();

    /* renamed from: or */
    IOPredicate<T> mo501or(IOPredicate<? super T> iOPredicate);

    boolean test(T t) throws IOException;
}