package p000;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.internal.cloudmessaging.zzf;

/* renamed from: wb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC22814wb2 extends zzf {

    /* renamed from: b */
    public final /* synthetic */ Rpc f108064b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC22814wb2(Rpc rpc, Looper looper) {
        super(looper);
        this.f108064b = rpc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Rpc.m48677c(this.f108064b, message);
    }
}
