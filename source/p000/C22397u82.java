package p000;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* renamed from: u82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22397u82 extends zabw {

    /* renamed from: a */
    public final WeakReference f107291a;

    public C22397u82(zabe zabeVar) {
        this.f107291a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void zaa() {
        zabe zabeVar = (zabe) this.f107291a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.m48515f(zabeVar);
    }
}
