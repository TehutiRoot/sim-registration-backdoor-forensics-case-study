package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.LongSupplier;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOLongSupplier */
/* loaded from: classes6.dex */
public interface IOLongSupplier {
    LongSupplier asSupplier();

    long getAsLong() throws IOException;
}
