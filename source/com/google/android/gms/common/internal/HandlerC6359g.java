package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: com.google.android.gms.common.internal.g */
/* loaded from: classes3.dex */
public final class HandlerC6359g extends com.google.android.gms.internal.common.zzi {

    /* renamed from: b */
    public final /* synthetic */ BaseGmsClient f45138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6359g(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.f45138b = baseGmsClient;
    }

    /* renamed from: a */
    public static final void m48397a(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    /* renamed from: b */
    public static final boolean m48396b(Message message) {
        int i = message.what;
        if (i == 2 || i == 1 || i == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        boolean z;
        if (this.f45138b.zzd.get() != message.arg1) {
            if (m48396b(message)) {
                m48397a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i != 1 && i != 7 && ((i != 4 || this.f45138b.enableLocalFallback()) && message.what != 5)) || this.f45138b.isConnecting()) {
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                this.f45138b.f45047y = new ConnectionResult(message.arg2);
                if (BaseGmsClient.m48413m(this.f45138b)) {
                    BaseGmsClient baseGmsClient = this.f45138b;
                    z = baseGmsClient.f45048z;
                    if (!z) {
                        baseGmsClient.m48412n(3, null);
                        return;
                    }
                }
                BaseGmsClient baseGmsClient2 = this.f45138b;
                connectionResult3 = baseGmsClient2.f45047y;
                if (connectionResult3 != null) {
                    connectionResult4 = baseGmsClient2.f45047y;
                } else {
                    connectionResult4 = new ConnectionResult(8);
                }
                this.f45138b.zzc.onReportServiceBinding(connectionResult4);
                this.f45138b.onConnectionFailed(connectionResult4);
                return;
            } else if (i2 == 5) {
                BaseGmsClient baseGmsClient3 = this.f45138b;
                connectionResult = baseGmsClient3.f45047y;
                if (connectionResult != null) {
                    connectionResult2 = baseGmsClient3.f45047y;
                } else {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.f45138b.zzc.onReportServiceBinding(connectionResult2);
                this.f45138b.onConnectionFailed(connectionResult2);
                return;
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                this.f45138b.zzc.onReportServiceBinding(connectionResult5);
                this.f45138b.onConnectionFailed(connectionResult5);
                return;
            } else if (i2 == 6) {
                this.f45138b.m48412n(5, null);
                BaseGmsClient baseGmsClient4 = this.f45138b;
                baseConnectionCallbacks = baseGmsClient4.f45042t;
                if (baseConnectionCallbacks != null) {
                    baseConnectionCallbacks2 = baseGmsClient4.f45042t;
                    baseConnectionCallbacks2.onConnectionSuspended(message.arg2);
                }
                this.f45138b.onConnectionSuspended(message.arg2);
                BaseGmsClient.m48414l(this.f45138b, 5, 1, null);
                return;
            } else if (i2 == 2 && !this.f45138b.isConnected()) {
                m48397a(message);
                return;
            } else if (m48396b(message)) {
                ((zzc) message.obj).zze();
                return;
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder();
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                new Exception();
                return;
            }
        }
        m48397a(message);
    }
}
