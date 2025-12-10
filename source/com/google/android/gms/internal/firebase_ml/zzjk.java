package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzjk implements zzjq {

    /* renamed from: a */
    public final zzjq f45928a;

    /* renamed from: b */
    public final int f45929b;

    /* renamed from: c */
    public final Level f45930c;

    /* renamed from: d */
    public final Logger f45931d;

    public zzjk(zzjq zzjqVar, Logger logger, Level level, int i) {
        this.f45928a = zzjqVar;
        this.f45931d = logger;
        this.f45930c = level;
        this.f45929b = i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjq
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzjl zzjlVar = new zzjl(outputStream, this.f45931d, this.f45930c, this.f45929b);
        try {
            this.f45928a.writeTo(zzjlVar);
            zzjlVar.zzil().close();
            outputStream.flush();
        } catch (Throwable th2) {
            zzjlVar.zzil().close();
            throw th2;
        }
    }
}
