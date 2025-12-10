package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import java.io.Closeable;

/* renamed from: com.google.android.datatransport.runtime.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6282f implements Closeable {

    /* renamed from: com.google.android.datatransport.runtime.f$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC6283a {
        /* renamed from: a */
        InterfaceC6283a mo49120a(Context context);

        AbstractC6282f build();
    }

    /* renamed from: b */
    public abstract EventStore mo49122b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo49122b().close();
    }

    /* renamed from: d */
    public abstract TransportRuntime mo49121d();
}
