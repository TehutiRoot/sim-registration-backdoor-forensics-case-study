package p000;

import com.google.android.gms.internal.firebase_ml.zzxb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: RL2 */
/* loaded from: classes3.dex */
public final class RL2 extends SL2 {
    public RL2(int i) {
        super(i, null);
    }

    @Override // p000.SL2
    /* renamed from: m */
    public final void mo66340m() {
        if (!m66351a()) {
            for (int i = 0; i < m66339n(); i++) {
                Map.Entry m66342k = m66342k(i);
                if (((zzxb) m66342k.getKey()).zzuw()) {
                    m66342k.setValue(Collections.unmodifiableList((List) m66342k.getValue()));
                }
            }
            for (Map.Entry entry : m66338o()) {
                if (((zzxb) entry.getKey()).zzuw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo66340m();
    }
}
