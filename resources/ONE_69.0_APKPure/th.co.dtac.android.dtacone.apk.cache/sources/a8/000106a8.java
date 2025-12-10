package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.internal.base.zau;

/* renamed from: q92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC21774q92 extends zau {

    /* renamed from: b */
    public final /* synthetic */ zabe f77098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC21774q92(zabe zabeVar, Looper looper) {
        super(looper);
        this.f77098b = zabeVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.w("GoogleApiClientImpl", "Unknown message id: " + i);
                return;
            }
            zabe.m48512f(this.f77098b);
            return;
        }
        zabe.m48511g(this.f77098b);
    }
}