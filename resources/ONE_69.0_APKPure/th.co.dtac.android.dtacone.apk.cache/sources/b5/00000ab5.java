package p000;

import com.google.android.gms.internal.measurement.zzju;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: LG2 */
/* loaded from: classes3.dex */
public final class LG2 extends JH2 {
    public LG2(int i) {
        super(i, null);
    }

    @Override // p000.JH2
    /* renamed from: a */
    public final void mo67610a() {
        if (!m67904k()) {
            for (int i = 0; i < m67912b(); i++) {
                Map.Entry m67907h = m67907h(i);
                if (((zzju) m67907h.getKey()).zzc()) {
                    m67907h.setValue(Collections.unmodifiableList((List) m67907h.getValue()));
                }
            }
            for (Map.Entry entry : m67911c()) {
                if (((zzju) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo67610a();
    }
}