package p000;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzt;

/* renamed from: iJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20366iJ2 extends AbstractC22430uJ2 {
    public C20366iJ2(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // p000.AbstractC22430uJ2
    /* renamed from: a */
    public final void mo1291a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            m1288d(null);
        } else {
            m1289c(new zzt(4, "Invalid response to one way request", null));
        }
    }

    @Override // p000.AbstractC22430uJ2
    /* renamed from: b */
    public final boolean mo1290b() {
        return true;
    }
}
