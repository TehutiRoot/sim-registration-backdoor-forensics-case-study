package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import java.util.Map;

/* renamed from: kr2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20798kr2 extends AbstractC21661ps2 {
    public C20798kr2(int i) {
        super(i, null);
    }

    @Override // p000.AbstractC21661ps2
    /* renamed from: a */
    public final void mo23582a() {
        if (!m23573k()) {
            for (int i = 0; i < m23581b(); i++) {
                ((zzds) m23576h(i).getKey()).zzg();
            }
            for (Map.Entry entry : m23580c()) {
                ((zzds) entry.getKey()).zzg();
            }
        }
        super.mo23582a();
    }
}
