package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.internal.base.zau;

/* renamed from: t92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC22293t92 extends zau {

    /* renamed from: b */
    public final /* synthetic */ zabi f80102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22293t92(zabi zabiVar, Looper looper) {
        super(looper);
        this.f80102b = zabiVar;
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
        ((AbstractC22120s92) message.obj).m22859b(this.f80102b);
    }
}