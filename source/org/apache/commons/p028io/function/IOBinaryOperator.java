package org.apache.commons.p028io.function;

import java.util.function.BinaryOperator;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOBinaryOperator */
/* loaded from: classes6.dex */
public interface IOBinaryOperator<T> extends IOBiFunction<T, T, T> {
    BinaryOperator<T> asBinaryOperator();
}
