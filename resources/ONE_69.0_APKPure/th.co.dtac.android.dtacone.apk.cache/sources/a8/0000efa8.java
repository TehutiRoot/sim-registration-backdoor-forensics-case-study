package org.apache.commons.p028io.function;

import java.io.IOException;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IORunnable */
/* loaded from: classes6.dex */
public interface IORunnable {
    Runnable asRunnable();

    void run() throws IOException;
}