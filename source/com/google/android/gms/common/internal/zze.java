package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zze implements ServiceConnection {

    /* renamed from: a */
    public final int f45181a;

    /* renamed from: b */
    public final /* synthetic */ BaseGmsClient f45182b;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.f45182b = baseGmsClient;
        this.f45181a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        IGmsServiceBroker c6358f;
        BaseGmsClient baseGmsClient = this.f45182b;
        if (iBinder != null) {
            obj = baseGmsClient.f45036n;
            synchronized (obj) {
                try {
                    BaseGmsClient baseGmsClient2 = this.f45182b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                        c6358f = (IGmsServiceBroker) queryLocalInterface;
                    } else {
                        c6358f = new C6358f(iBinder);
                    }
                    baseGmsClient2.f45037o = c6358f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f45182b.zzl(0, null, this.f45181a);
            return;
        }
        BaseGmsClient.m48416j(baseGmsClient, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f45182b.f45036n;
        synchronized (obj) {
            this.f45182b.f45037o = null;
        }
        BaseGmsClient baseGmsClient = this.f45182b;
        int i = this.f45181a;
        Handler handler = baseGmsClient.f45034l;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
