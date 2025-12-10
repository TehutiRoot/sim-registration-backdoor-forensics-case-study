package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.runtime.logging.Logging;

/* loaded from: classes3.dex */
public final class ForcedSender {
    @SuppressLint({"DiscouragedApi"})
    @WorkerThread
    public static void sendBlocking(Transport<?> transport, Priority priority) {
        if (transport instanceof C6281e) {
            TransportRuntime.getInstance().getUploader().logAndUpdateState(((C6281e) transport).m49124b().withPriority(priority), 1);
            return;
        }
        Logging.m49111w("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", transport);
    }
}
