package p000;

import com.google.android.gms.internal.vision.zzjl;
import com.google.android.gms.internal.vision.zzjs;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzlz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: mB2 */
/* loaded from: classes3.dex */
public final class C21030mB2 extends AbstractC19482dB2 {

    /* renamed from: c */
    public static final Class f71837c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C21030mB2() {
        super();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static List m26373f(Object obj, long j, int i) {
        zzjs zzjsVar;
        List arrayList;
        List m26372g = m26372g(obj, j);
        if (m26372g.isEmpty()) {
            if (m26372g instanceof zzjv) {
                arrayList = new zzjs(i);
            } else if ((m26372g instanceof InterfaceC22756wD2) && (m26372g instanceof zzjl)) {
                arrayList = ((zzjl) m26372g).zza(i);
            } else {
                arrayList = new ArrayList(i);
            }
            AbstractC20013gG2.m31187j(obj, j, arrayList);
            return arrayList;
        }
        if (f71837c.isAssignableFrom(m26372g.getClass())) {
            ArrayList arrayList2 = new ArrayList(m26372g.size() + i);
            arrayList2.addAll(m26372g);
            AbstractC20013gG2.m31187j(obj, j, arrayList2);
            zzjsVar = arrayList2;
        } else if (m26372g instanceof zzlz) {
            zzjs zzjsVar2 = new zzjs(m26372g.size() + i);
            zzjsVar2.addAll((zzlz) m26372g);
            AbstractC20013gG2.m31187j(obj, j, zzjsVar2);
            zzjsVar = zzjsVar2;
        } else if ((m26372g instanceof InterfaceC22756wD2) && (m26372g instanceof zzjl)) {
            zzjl zzjlVar = (zzjl) m26372g;
            if (!zzjlVar.zza()) {
                zzjl zza = zzjlVar.zza(m26372g.size() + i);
                AbstractC20013gG2.m31187j(obj, j, zza);
                return zza;
            }
            return m26372g;
        } else {
            return m26372g;
        }
        return zzjsVar;
    }

    /* renamed from: g */
    public static List m26372g(Object obj, long j) {
        return (List) AbstractC20013gG2.m31206F(obj, j);
    }

    @Override // p000.AbstractC19482dB2
    /* renamed from: a */
    public final List mo26376a(Object obj, long j) {
        return m26373f(obj, j, 10);
    }

    @Override // p000.AbstractC19482dB2
    /* renamed from: c */
    public final void mo26375c(Object obj, Object obj2, long j) {
        List m26372g = m26372g(obj2, j);
        List m26373f = m26373f(obj, j, m26372g.size());
        int size = m26373f.size();
        int size2 = m26372g.size();
        if (size > 0 && size2 > 0) {
            m26373f.addAll(m26372g);
        }
        if (size > 0) {
            m26372g = m26373f;
        }
        AbstractC20013gG2.m31187j(obj, j, m26372g);
    }

    @Override // p000.AbstractC19482dB2
    /* renamed from: e */
    public final void mo26374e(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) AbstractC20013gG2.m31206F(obj, j);
        if (list instanceof zzjv) {
            unmodifiableList = ((zzjv) list).zze();
        } else if (f71837c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof InterfaceC22756wD2) && (list instanceof zzjl)) {
                zzjl zzjlVar = (zzjl) list;
                if (zzjlVar.zza()) {
                    zzjlVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        AbstractC20013gG2.m31187j(obj, j, unmodifiableList);
    }
}
