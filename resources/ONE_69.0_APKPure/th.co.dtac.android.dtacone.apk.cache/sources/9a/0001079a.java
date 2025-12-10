package p000;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* renamed from: r92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21947r92 extends zabw {

    /* renamed from: a */
    public final WeakReference f77419a;

    public C21947r92(zabe zabeVar) {
        this.f77419a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = (zabe) this.f77419a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.m48512f(zabeVar);
    }
}