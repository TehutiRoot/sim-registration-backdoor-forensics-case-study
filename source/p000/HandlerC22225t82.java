package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.internal.base.zau;

/* renamed from: t82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC22225t82 extends zau {

    /* renamed from: b */
    public final /* synthetic */ zabe f80018b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22225t82(zabe zabeVar, Looper looper) {
        super(looper);
        this.f80018b = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
                return;
            }
            zabe.m48515f(this.f80018b);
            return;
        }
        zabe.m48514g(this.f80018b);
    }
}
