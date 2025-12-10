package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class zzjk implements zzjq {

    /* renamed from: a */
    public final zzjq f45940a;

    /* renamed from: b */
    public final int f45941b;

    /* renamed from: c */
    public final Level f45942c;

    /* renamed from: d */
    public final Logger f45943d;

    public zzjk(zzjq zzjqVar, Logger logger, Level level, int i) {
        this.f45940a = zzjqVar;
        this.f45943d = logger;
        this.f45942c = level;
        this.f45941b = i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjq
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzjl zzjlVar = new zzjl(outputStream, this.f45943d, this.f45942c, this.f45941b);
        try {
            this.f45940a.writeTo(zzjlVar);
            zzjlVar.zzil().close();
            outputStream.flush();
        } catch (Throwable th2) {
            zzjlVar.zzil().close();
            throw th2;
        }
    }
}