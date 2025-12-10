package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;

/* renamed from: z82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC23257z82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ A82 f108987a;

    public RunnableC23257z82(A82 a82) {
        this.f108987a = a82;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.f108987a.f28a;
        client = zabqVar.f44907b;
        client2 = zabqVar.f44907b;
        client.disconnect(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
