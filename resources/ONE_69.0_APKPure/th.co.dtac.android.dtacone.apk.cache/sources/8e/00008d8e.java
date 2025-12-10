package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class zau extends Handler {

    /* renamed from: a */
    public final Looper f45474a;

    public zau() {
        this.f45474a = Looper.getMainLooper();
    }

    public zau(Looper looper) {
        super(looper);
        this.f45474a = Looper.getMainLooper();
    }

    public zau(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f45474a = Looper.getMainLooper();
    }
}