package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class zzi extends Handler {

    /* renamed from: a */
    public final Looper f45669a;

    public zzi() {
        this.f45669a = Looper.getMainLooper();
    }

    public zzi(Looper looper) {
        super(looper);
        this.f45669a = Looper.getMainLooper();
    }

    public zzi(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f45669a = Looper.getMainLooper();
    }
}
