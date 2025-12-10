package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zacp;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zau;

/* renamed from: K92 */
/* loaded from: classes3.dex */
public final class K92 extends zau {

    /* renamed from: b */
    public final /* synthetic */ zada f3238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K92(zada zadaVar, Looper looper) {
        super(looper);
        this.f3238b = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        zada zadaVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("TransformationResultHandler received unknown message type: ");
                sb.append(i);
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage()));
            throw runtimeException;
        }
        PendingResult pendingResult = (PendingResult) message.obj;
        obj = this.f3238b.f44949e;
        synchronized (obj) {
            try {
                zadaVar = this.f3238b.f44946b;
                zada zadaVar2 = (zada) Preconditions.checkNotNull(zadaVar);
                if (pendingResult == null) {
                    zadaVar2.m48463i(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacp) {
                    zadaVar2.m48463i(((zacp) pendingResult).m48474a());
                } else {
                    zadaVar2.zai(pendingResult);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}