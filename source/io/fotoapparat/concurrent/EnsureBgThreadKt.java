package io.fotoapparat.concurrent;

import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m28850d2 = {"ensureBackgroundThread", "", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class EnsureBgThreadKt {
    public static final void ensureBackgroundThread() {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        throw new IllegalThreadStateException("Operation should not run from main thread.");
    }
}
