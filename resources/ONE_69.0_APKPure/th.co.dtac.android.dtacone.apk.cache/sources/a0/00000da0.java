package p000;

import com.google.android.gms.internal.firebase_ml.zzxb;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: OM2 */
/* loaded from: classes3.dex */
public final class OM2 extends PM2 {
    public OM2(int i) {
        super(i, null);
    }

    @Override // p000.PM2
    /* renamed from: m */
    public final void mo66976m() {
        if (!m66987a()) {
            for (int i = 0; i < m66975n(); i++) {
                Map.Entry m66978k = m66978k(i);
                if (((zzxb) m66978k.getKey()).zzuw()) {
                    m66978k.setValue(Collections.unmodifiableList((List) m66978k.getValue()));
                }
            }
            for (Map.Entry entry : m66974o()) {
                if (((zzxb) entry.getKey()).zzuw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo66976m();
    }
}