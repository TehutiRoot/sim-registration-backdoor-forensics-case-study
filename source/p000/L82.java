package p000;

import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.signin.internal.zak;

/* renamed from: L82 */
/* loaded from: classes3.dex */
public final class L82 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zak f3396a;

    /* renamed from: b */
    public final /* synthetic */ zact f3397b;

    public L82(zact zactVar, zak zakVar) {
        this.f3397b = zactVar;
        this.f3396a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.m48475b(this.f3397b, this.f3396a);
    }
}
