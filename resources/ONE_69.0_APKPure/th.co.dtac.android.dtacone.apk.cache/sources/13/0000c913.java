package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import java.util.Map;

/* renamed from: hs2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20339hs2 extends AbstractC21207mt2 {
    public C20339hs2(int i) {
        super(i, null);
    }

    @Override // p000.AbstractC21207mt2
    /* renamed from: a */
    public final void mo26479a() {
        if (!m26470k()) {
            for (int i = 0; i < m26478b(); i++) {
                ((zzds) m26473h(i).getKey()).zzg();
            }
            for (Map.Entry entry : m26477c()) {
                ((zzds) entry.getKey()).zzg();
            }
        }
        super.mo26479a();
    }
}