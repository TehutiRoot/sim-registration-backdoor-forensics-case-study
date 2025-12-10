package p000;

import com.google.android.gms.internal.measurement.zzju;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: OF2 */
/* loaded from: classes3.dex */
public final class OF2 extends MG2 {
    public OF2(int i) {
        super(i, null);
    }

    @Override // p000.MG2
    /* renamed from: a */
    public final void mo67105a() {
        if (!m67410k()) {
            for (int i = 0; i < m67418b(); i++) {
                Map.Entry m67413h = m67413h(i);
                if (((zzju) m67413h.getKey()).zzc()) {
                    m67413h.setValue(Collections.unmodifiableList((List) m67413h.getValue()));
                }
            }
            for (Map.Entry entry : m67417c()) {
                if (((zzju) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo67105a();
    }
}
