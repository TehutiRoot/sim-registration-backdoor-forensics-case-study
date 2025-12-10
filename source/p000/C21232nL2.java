package p000;

import com.google.android.gms.internal.firebase_ml.zzxt;

/* renamed from: nL2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21232nL2 extends AbstractC20544jL2 {
    public C21232nL2() {
        super();
    }

    /* renamed from: e */
    public static zzxt m26134e(Object obj, long j) {
        return (zzxt) AbstractC17455Da2.m68611z(obj, j);
    }

    @Override // p000.AbstractC20544jL2
    /* renamed from: a */
    public final void mo26136a(Object obj, Object obj2, long j) {
        zzxt m26134e = m26134e(obj, j);
        zzxt m26134e2 = m26134e(obj2, j);
        int size = m26134e.size();
        int size2 = m26134e2.size();
        if (size > 0 && size2 > 0) {
            if (!m26134e.zztx()) {
                m26134e = m26134e.zzda(size2 + size);
            }
            m26134e.addAll(m26134e2);
        }
        if (size > 0) {
            m26134e2 = m26134e;
        }
        AbstractC17455Da2.m68630g(obj, j, m26134e2);
    }

    @Override // p000.AbstractC20544jL2
    /* renamed from: b */
    public final void mo26135b(Object obj, long j) {
        m26134e(obj, j).zzty();
    }
}
