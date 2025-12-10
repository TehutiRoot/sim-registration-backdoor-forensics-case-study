package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zau;

/* renamed from: w82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC22741w82 extends zau {

    /* renamed from: b */
    public final /* synthetic */ zabi f107919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22741w82(zabi zabiVar, Looper looper) {
        super(looper);
        this.f107919b = zabiVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.w("GACStateManager", "Unknown message id: " + i);
                return;
            }
            throw ((RuntimeException) message.obj);
        }
        ((AbstractC22569v82) message.obj).m1104b(this.f107919b);
    }
}
