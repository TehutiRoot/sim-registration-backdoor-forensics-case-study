package p000;

import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* renamed from: j82  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC20505j82 extends zac {

    /* renamed from: a */
    public final WeakReference f67180a;

    public BinderC20505j82(zaaw zaawVar) {
        this.f67180a = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(zak zakVar) {
        zabi zabiVar;
        zaaw zaawVar = (zaaw) this.f67180a.get();
        if (zaawVar != null) {
            zabiVar = zaawVar.f44843a;
            zabiVar.m48504f(new C20333i82(this, zaawVar, zaawVar, zakVar));
        }
    }
}
