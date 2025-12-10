package com.google.android.gms.internal.cloudmessaging;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class zzf extends Handler {

    /* renamed from: a */
    public final Looper f45663a;

    public zzf() {
        this.f45663a = Looper.getMainLooper();
    }

    public zzf(Looper looper) {
        super(looper);
        this.f45663a = Looper.getMainLooper();
    }

    public zzf(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f45663a = Looper.getMainLooper();
    }
}
