package p000;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzt;

/* renamed from: fK2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19904fK2 extends AbstractC21980rK2 {
    public C19904fK2(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // p000.AbstractC21980rK2
    /* renamed from: a */
    public final void mo23522a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m23519d(null);
        } else {
            m23520c(new zzt(4, "Invalid response to one way request", null));
        }
    }

    @Override // p000.AbstractC21980rK2
    /* renamed from: b */
    public final boolean mo23521b() {
        return true;
    }
}