package org.apache.commons.p028io.function;

import java.util.function.UnaryOperator;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOUnaryOperator */
/* loaded from: classes6.dex */
public interface IOUnaryOperator<T> extends IOFunction<T, T> {
    UnaryOperator<T> asUnaryOperator();
}