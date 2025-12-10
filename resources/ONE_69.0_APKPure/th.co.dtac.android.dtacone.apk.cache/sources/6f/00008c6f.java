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
    public final int f45193a;

    /* renamed from: b */
    public final /* synthetic */ BaseGmsClient f45194b;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.f45194b = baseGmsClient;
        this.f45193a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        IGmsServiceBroker c6347f;
        BaseGmsClient baseGmsClient = this.f45194b;
        if (iBinder != null) {
            obj = baseGmsClient.f45048n;
            synchronized (obj) {
                try {
                    BaseGmsClient baseGmsClient2 = this.f45194b;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                        c6347f = (IGmsServiceBroker) queryLocalInterface;
                    } else {
                        c6347f = new C6347f(iBinder);
                    }
                    baseGmsClient2.f45049o = c6347f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f45194b.zzl(0, null, this.f45193a);
            return;
        }
        BaseGmsClient.m48413j(baseGmsClient, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f45194b.f45048n;
        synchronized (obj) {
            this.f45194b.f45049o = null;
        }
        BaseGmsClient baseGmsClient = this.f45194b;
        int i = this.f45193a;
        Handler handler = baseGmsClient.f45046l;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}