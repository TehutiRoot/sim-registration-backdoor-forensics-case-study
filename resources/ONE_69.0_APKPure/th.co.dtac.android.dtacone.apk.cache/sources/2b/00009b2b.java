package com.google.android.gms.internal.tasks;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zza extends Handler {

    /* renamed from: a */
    public final Looper f47494a;

    public zza() {
        this.f47494a = Looper.getMainLooper();
    }

    public zza(Looper looper) {
        super(looper);
        this.f47494a = Looper.getMainLooper();
    }
}