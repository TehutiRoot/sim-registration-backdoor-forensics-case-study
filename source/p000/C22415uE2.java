package p000;

import com.google.android.gms.internal.vision.zziw;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: uE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C22415uE2 extends AbstractC23275zE2 {
    public C22415uE2(int i) {
        super(i, null);
    }

    @Override // p000.AbstractC23275zE2
    /* renamed from: f */
    public final void mo113f() {
        if (!m109j()) {
            for (int i = 0; i < m108k(); i++) {
                Map.Entry m110i = m110i(i);
                if (((zziw) m110i.getKey()).zzd()) {
                    m110i.setValue(Collections.unmodifiableList((List) m110i.getValue()));
                }
            }
            for (Map.Entry entry : m105n()) {
                if (((zziw) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo113f();
    }
}
