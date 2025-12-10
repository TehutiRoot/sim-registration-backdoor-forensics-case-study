package org.apache.commons.p028io.function;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.function.Supplier;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOSupplier */
/* loaded from: classes6.dex */
public interface IOSupplier<T> {
    Supplier<T> asSupplier();

    T get() throws IOException;

    T getUnchecked() throws UncheckedIOException;
}