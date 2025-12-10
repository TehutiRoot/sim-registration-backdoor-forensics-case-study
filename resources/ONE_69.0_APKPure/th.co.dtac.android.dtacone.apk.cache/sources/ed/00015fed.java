package p000;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.zabq;

/* renamed from: w92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC22812w92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22985x92 f108351a;

    public RunnableC22812w92(C22985x92 c22985x92) {
        this.f108351a = c22985x92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Api.Client client;
        Api.Client client2;
        zabq zabqVar = this.f108351a.f108661a;
        client = zabqVar.f44919b;
        client2 = zabqVar.f44919b;
        client.disconnect(client2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}