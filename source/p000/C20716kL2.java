package p000;

import com.google.android.gms.internal.firebase_ml.zzaaj;
import com.google.android.gms.internal.firebase_ml.zzxt;
import com.google.android.gms.internal.firebase_ml.zzya;
import com.google.android.gms.internal.firebase_ml.zzyd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: kL2 */
/* loaded from: classes3.dex */
public final class C20716kL2 extends AbstractC20544jL2 {

    /* renamed from: c */
    public static final Class f67898c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C20716kL2() {
        super();
    }

    /* renamed from: e */
    public static List m28933e(Object obj, long j) {
        return (List) AbstractC17455Da2.m68611z(obj, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC20544jL2
    /* renamed from: a */
    public final void mo26136a(Object obj, Object obj2, long j) {
        zzya zzyaVar;
        List m28933e = m28933e(obj2, j);
        int size = m28933e.size();
        List m28933e2 = m28933e(obj, j);
        if (m28933e2.isEmpty()) {
            if (m28933e2 instanceof zzyd) {
                m28933e2 = new zzya(size);
            } else if ((m28933e2 instanceof KL2) && (m28933e2 instanceof zzxt)) {
                m28933e2 = ((zzxt) m28933e2).zzda(size);
            } else {
                m28933e2 = new ArrayList(size);
            }
            AbstractC17455Da2.m68630g(obj, j, m28933e2);
        } else {
            if (f67898c.isAssignableFrom(m28933e2.getClass())) {
                ArrayList arrayList = new ArrayList(m28933e2.size() + size);
                arrayList.addAll(m28933e2);
                AbstractC17455Da2.m68630g(obj, j, arrayList);
                zzyaVar = arrayList;
            } else if (m28933e2 instanceof zzaaj) {
                zzya zzyaVar2 = new zzya(m28933e2.size() + size);
                zzyaVar2.addAll((zzaaj) m28933e2);
                AbstractC17455Da2.m68630g(obj, j, zzyaVar2);
                zzyaVar = zzyaVar2;
            } else if ((m28933e2 instanceof KL2) && (m28933e2 instanceof zzxt)) {
                zzxt zzxtVar = (zzxt) m28933e2;
                if (!zzxtVar.zztx()) {
                    m28933e2 = zzxtVar.zzda(m28933e2.size() + size);
                    AbstractC17455Da2.m68630g(obj, j, m28933e2);
                }
            }
            m28933e2 = zzyaVar;
        }
        int size2 = m28933e2.size();
        int size3 = m28933e.size();
        if (size2 > 0 && size3 > 0) {
            m28933e2.addAll(m28933e);
        }
        if (size2 > 0) {
            m28933e = m28933e2;
        }
        AbstractC17455Da2.m68630g(obj, j, m28933e);
    }

    @Override // p000.AbstractC20544jL2
    /* renamed from: b */
    public final void mo26135b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) AbstractC17455Da2.m68611z(obj, j);
        if (list instanceof zzyd) {
            unmodifiableList = ((zzyd) list).zzwa();
        } else if (f67898c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof KL2) && (list instanceof zzxt)) {
                zzxt zzxtVar = (zzxt) list;
                if (zzxtVar.zztx()) {
                    zzxtVar.zzty();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC17455Da2.m68630g(obj, j, unmodifiableList);
    }
}
