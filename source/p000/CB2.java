package p000;

import com.google.android.gms.internal.vision.zzjl;
import java.util.List;

/* renamed from: CB2 */
/* loaded from: classes3.dex */
public final class CB2 extends AbstractC19482dB2 {
    public CB2() {
        super();
    }

    /* renamed from: f */
    public static zzjl m68819f(Object obj, long j) {
        return (zzjl) AbstractC20013gG2.m31206F(obj, j);
    }

    @Override // p000.AbstractC19482dB2
    /* renamed from: a */
    public final List mo26376a(Object obj, long j) {
        int i;
        zzjl m68819f = m68819f(obj, j);
        if (!m68819f.zza()) {
            int size = m68819f.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            zzjl zza = m68819f.zza(i);
            AbstractC20013gG2.m31187j(obj, j, zza);
            return zza;
        }
        return m68819f;
    }

    @Override // p000.AbstractC19482dB2
    /* renamed from: c */
    public final void mo26375c(Object obj, Object obj2, long j) {
        zzjl m68819f = m68819f(obj, j);
        zzjl m68819f2 = m68819f(obj2, j);
        int size = m68819f.size();
        int size2 = m68819f2.size();
        if (size > 0 && size2 > 0) {
            if (!m68819f.zza()) {
                m68819f = m68819f.zza(size2 + size);
            }
            m68819f.addAll(m68819f2);
        }
        if (size > 0) {
            m68819f2 = m68819f;
        }
        AbstractC20013gG2.m31187j(obj, j, m68819f2);
    }

    @Override // p000.AbstractC19482dB2
    /* renamed from: e */
    public final void mo26374e(Object obj, long j) {
        m68819f(obj, j).zzb();
    }
}
