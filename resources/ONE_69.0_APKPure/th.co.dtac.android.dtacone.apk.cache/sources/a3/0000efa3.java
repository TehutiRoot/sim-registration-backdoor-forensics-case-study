package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.IntSupplier;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOIntSupplier */
/* loaded from: classes6.dex */
public interface IOIntSupplier {
    IntSupplier asIntSupplier();

    int getAsInt() throws IOException;
}