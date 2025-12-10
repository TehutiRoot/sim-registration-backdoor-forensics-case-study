package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.Comparator;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOComparator */
/* loaded from: classes6.dex */
public interface IOComparator<T> {
    Comparator<T> asComparator();

    int compare(T t, T t2) throws IOException;
}
