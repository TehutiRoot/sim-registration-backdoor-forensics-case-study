package p000;

import com.google.android.gms.internal.clearcut.zzcw;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Ph2 */
/* loaded from: classes3.dex */
public final class C18244Ph2 extends AbstractC20424ih2 {

    /* renamed from: c */
    public static final Class f4817c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C18244Ph2() {
        super();
    }

    /* renamed from: e */
    public static List m66759e(Object obj, long j) {
        return (List) AbstractC22850wn2.m701M(obj, j);
    }

    @Override // p000.AbstractC20424ih2
    /* renamed from: a */
    public final void mo30604a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) AbstractC22850wn2.m701M(obj, j);
        if (list instanceof zzcx) {
            unmodifiableList = ((zzcx) list).zzbu();
        } else if (f4817c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC22850wn2.m684i(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC20424ih2
    /* renamed from: b */
    public final void mo30603b(Object obj, Object obj2, long j) {
        zzcw zzcwVar;
        List m66759e = m66759e(obj2, j);
        int size = m66759e.size();
        List m66759e2 = m66759e(obj, j);
        if (m66759e2.isEmpty()) {
            if (m66759e2 instanceof zzcx) {
                m66759e2 = new zzcw(size);
            } else {
                m66759e2 = new ArrayList(size);
            }
            AbstractC22850wn2.m684i(obj, j, m66759e2);
        } else {
            if (f4817c.isAssignableFrom(m66759e2.getClass())) {
                ArrayList arrayList = new ArrayList(m66759e2.size() + size);
                arrayList.addAll(m66759e2);
                zzcwVar = arrayList;
            } else if (m66759e2 instanceof zzfa) {
                zzcw zzcwVar2 = new zzcw(m66759e2.size() + size);
                zzcwVar2.addAll((zzfa) m66759e2);
                zzcwVar = zzcwVar2;
            }
            AbstractC22850wn2.m684i(obj, j, zzcwVar);
            m66759e2 = zzcwVar;
        }
        int size2 = m66759e2.size();
        int size3 = m66759e.size();
        if (size2 > 0 && size3 > 0) {
            m66759e2.addAll(m66759e);
        }
        if (size2 > 0) {
            m66759e = m66759e2;
        }
        AbstractC22850wn2.m684i(obj, j, m66759e);
    }
}
