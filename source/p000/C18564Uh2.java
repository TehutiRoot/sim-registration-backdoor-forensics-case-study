package p000;

import com.google.android.gms.internal.clearcut.zzcn;

/* renamed from: Uh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18564Uh2 extends AbstractC20424ih2 {
    public C18564Uh2() {
        super();
    }

    /* renamed from: e */
    public static zzcn m65988e(Object obj, long j) {
        return (zzcn) AbstractC22850wn2.m701M(obj, j);
    }

    @Override // p000.AbstractC20424ih2
    /* renamed from: a */
    public final void mo30604a(Object obj, long j) {
        m65988e(obj, j).zzv();
    }

    @Override // p000.AbstractC20424ih2
    /* renamed from: b */
    public final void mo30603b(Object obj, Object obj2, long j) {
        zzcn m65988e = m65988e(obj, j);
        zzcn m65988e2 = m65988e(obj2, j);
        int size = m65988e.size();
        int size2 = m65988e2.size();
        if (size > 0 && size2 > 0) {
            if (!m65988e.zzu()) {
                m65988e = m65988e.zzi(size2 + size);
            }
            m65988e.addAll(m65988e2);
        }
        if (size > 0) {
            m65988e2 = m65988e;
        }
        AbstractC22850wn2.m684i(obj, j, m65988e2);
    }
}
