package p000;

import com.google.android.gms.internal.clearcut.zzca;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: ll2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20952ll2 extends AbstractC20264hl2 {
    public C20952ll2(int i) {
        super(i, null);
    }

    @Override // p000.AbstractC20264hl2
    /* renamed from: r */
    public final void mo26417r() {
        if (!m30766a()) {
            for (int i = 0; i < m30755m(); i++) {
                Map.Entry m30760h = m30760h(i);
                if (((zzca) m30760h.getKey()).zzaw()) {
                    m30760h.setValue(Collections.unmodifiableList((List) m30760h.getValue()));
                }
            }
            for (Map.Entry entry : m30754n()) {
                if (((zzca) entry.getKey()).zzaw()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo26417r();
    }
}
