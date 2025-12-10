package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class zabx extends BroadcastReceiver {

    /* renamed from: a */
    public Context f44932a;

    /* renamed from: b */
    public final zabw f44933b;

    public zabx(zabw zabwVar) {
        this.f44933b = zabwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.f44933b.zaa();
            zab();
        }
    }

    public final void zaa(Context context) {
        this.f44932a = context;
    }

    public final synchronized void zab() {
        try {
            Context context = this.f44932a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f44932a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}