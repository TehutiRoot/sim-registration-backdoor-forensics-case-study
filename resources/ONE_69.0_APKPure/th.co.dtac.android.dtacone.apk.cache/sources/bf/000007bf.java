package p000;

import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.signin.internal.zak;

/* renamed from: I92 */
/* loaded from: classes3.dex */
public final class I92 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zak f2589a;

    /* renamed from: b */
    public final /* synthetic */ zact f2590b;

    public I92(zact zactVar, zak zakVar) {
        this.f2590b = zactVar;
        this.f2589a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.m48472b(this.f2590b, this.f2589a);
    }
}