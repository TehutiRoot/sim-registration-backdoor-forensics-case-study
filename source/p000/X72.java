package p000;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.zag;

/* renamed from: X72 */
/* loaded from: classes3.dex */
public final class X72 extends zag {

    /* renamed from: a */
    public final ListenerHolder f7391a;

    public X72(ListenerHolder listenerHolder) {
        this.f7391a = listenerHolder;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zah
    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.f7391a.notifyListener(new W72(this, moduleInstallStatusUpdate));
    }
}
