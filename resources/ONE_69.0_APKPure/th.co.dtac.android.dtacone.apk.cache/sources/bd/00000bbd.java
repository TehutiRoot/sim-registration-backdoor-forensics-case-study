package p000;

import com.google.android.gms.internal.firebase_ml.C6451a;
import com.google.android.gms.internal.firebase_ml.zzwd;
import com.google.android.gms.internal.firebase_ml.zzwq;
import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.internal.firebase_ml.zzxm;
import com.google.android.gms.internal.firebase_ml.zzyb;
import com.google.android.gms.internal.firebase_ml.zzyd;
import com.google.android.gms.internal.firebase_ml.zzys;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: MM2 */
/* loaded from: classes3.dex */
public abstract class MM2 {

    /* renamed from: a */
    public static final Class f3879a = m67397c0();

    /* renamed from: b */
    public static final AbstractC23229yb2 f3880b = m67387l(false);

    /* renamed from: c */
    public static final AbstractC23229yb2 f3881c = m67387l(true);

    /* renamed from: d */
    public static final AbstractC23229yb2 f3882d = new C6451a();

    /* renamed from: A */
    public static int m67428A(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20602jM2) {
            C20602jM2 c20602jM2 = (C20602jM2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzaa(c20602jM2.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzaa(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static void m67427B(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67821x(i, list, z);
        }
    }

    /* renamed from: C */
    public static int m67426C(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20602jM2) {
            C20602jM2 c20602jM2 = (C20602jM2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzab(c20602jM2.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzab(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: D */
    public static void m67425D(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67834k(i, list, z);
        }
    }

    /* renamed from: E */
    public static int m67424E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof WL2) {
            WL2 wl2 = (WL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdq(wl2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdq(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static void m67423F(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67826s(i, list, z);
        }
    }

    /* renamed from: G */
    public static int m67422G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof WL2) {
            WL2 wl2 = (WL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdl(wl2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdl(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static void m67421H(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67829p(i, list, z);
        }
    }

    /* renamed from: I */
    public static void m67420I(Class cls) {
        Class cls2;
        if (!zzxh.class.isAssignableFrom(cls) && (cls2 = f3879a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static int m67419J(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof WL2) {
            WL2 wl2 = (WL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdm(wl2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m67418K(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67830o(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m67417L(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m67374y(list) + (list.size() * zzwq.zzdk(i));
    }

    /* renamed from: M */
    public static int m67416M(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof WL2) {
            WL2 wl2 = (WL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdn(wl2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdn(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static int m67415N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67428A(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: O */
    public static int m67414O(List list) {
        return list.size() << 2;
    }

    /* renamed from: P */
    public static int m67413P(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67426C(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: Q */
    public static int m67412Q(List list) {
        return list.size() << 3;
    }

    /* renamed from: R */
    public static int m67411R(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67424E(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: S */
    public static int m67410S(List list) {
        return list.size();
    }

    /* renamed from: T */
    public static int m67409T(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67422G(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: U */
    public static int m67408U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67419J(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: V */
    public static int m67407V(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67416M(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: W */
    public static int m67406W(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzwq.zzo(i, 0);
    }

    /* renamed from: X */
    public static int m67405X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzwq.zzg(i, 0L);
    }

    /* renamed from: Y */
    public static AbstractC23229yb2 m67404Y() {
        return f3880b;
    }

    /* renamed from: Z */
    public static AbstractC23229yb2 m67403Z() {
        return f3881c;
    }

    /* renamed from: a */
    public static Object m67402a(int i, int i2, Object obj, AbstractC23229yb2 abstractC23229yb2) {
        if (obj == null) {
            obj = abstractC23229yb2.mo271l();
        }
        abstractC23229yb2.mo282a(obj, i, i2);
        return obj;
    }

    /* renamed from: a0 */
    public static AbstractC23229yb2 m67401a0() {
        return f3882d;
    }

    /* renamed from: b */
    public static Object m67400b(int i, List list, zzxm zzxmVar, Object obj, AbstractC23229yb2 abstractC23229yb2) {
        if (zzxmVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzxmVar.zzb(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = m67402a(i, intValue, obj, abstractC23229yb2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzxmVar.zzb(intValue2)) {
                    obj = m67402a(i, intValue2, obj, abstractC23229yb2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: b0 */
    public static int m67399b0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzwq.zzb(i, true);
    }

    /* renamed from: c */
    public static void m67398c(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67819z(i, list);
        }
    }

    /* renamed from: c0 */
    public static Class m67397c0() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m67396d(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, LM2 lm2) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67848M(i, list, lm2);
        }
    }

    /* renamed from: d0 */
    public static Class m67395d0() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m67394e(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67840d(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m67393f(AbstractC23229yb2 abstractC23229yb2, Object obj, Object obj2) {
        abstractC23229yb2.mo275h(obj, abstractC23229yb2.mo273j(abstractC23229yb2.mo278e(obj), abstractC23229yb2.mo278e(obj2)));
    }

    /* renamed from: g */
    public static void m67392g(KL2 kl2, Object obj, Object obj2) {
        LL2 mo48047e = kl2.mo48047e(obj2);
        if (!mo48047e.f3583a.isEmpty()) {
            kl2.mo48046f(obj).m67597j(mo48047e);
        }
    }

    /* renamed from: h */
    public static void m67391h(InterfaceC21813qM2 interfaceC21813qM2, Object obj, Object obj2, long j) {
        AbstractC17289Ab2.m69245g(obj, j, interfaceC21813qM2.mo23646h(AbstractC17289Ab2.m69226z(obj, j), AbstractC17289Ab2.m69226z(obj2, j)));
    }

    /* renamed from: i */
    public static void m67390i(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67820y(i, list);
        }
    }

    /* renamed from: j */
    public static void m67389j(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, LM2 lm2) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67847N(i, list, lm2);
        }
    }

    /* renamed from: k */
    public static void m67388k(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67823v(i, list, z);
        }
    }

    /* renamed from: l */
    public static AbstractC23229yb2 m67387l(boolean z) {
        try {
            Class m67395d0 = m67395d0();
            if (m67395d0 == null) {
                return null;
            }
            return (AbstractC23229yb2) m67395d0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static int m67386m(int i, Object obj, LM2 lm2) {
        if (obj instanceof zzyb) {
            return zzwq.zza(i, (zzyb) obj);
        }
        return zzwq.m47448e(i, (zzys) obj, lm2);
    }

    /* renamed from: n */
    public static int m67385n(int i, List list) {
        int zzcl;
        int zzcl2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzdk = zzwq.zzdk(i) * size;
        if (list instanceof zzyd) {
            zzyd zzydVar = (zzyd) list;
            while (i2 < size) {
                Object raw = zzydVar.getRaw(i2);
                if (raw instanceof zzwd) {
                    zzcl2 = zzwq.zzd((zzwd) raw);
                } else {
                    zzcl2 = zzwq.zzcl((String) raw);
                }
                zzdk += zzcl2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzwd) {
                    zzcl = zzwq.zzd((zzwd) obj);
                } else {
                    zzcl = zzwq.zzcl((String) obj);
                }
                zzdk += zzcl;
                i2++;
            }
        }
        return zzdk;
    }

    /* renamed from: o */
    public static int m67384o(int i, List list, LM2 lm2) {
        int m47451a;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzdk = zzwq.zzdk(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzyb) {
                m47451a = zzwq.zza((zzyb) obj);
            } else {
                m47451a = zzwq.m47451a((zzys) obj, lm2);
            }
            zzdk += m47451a;
        }
        return zzdk;
    }

    /* renamed from: p */
    public static void m67383p(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67843a(i, list, z);
        }
    }

    /* renamed from: q */
    public static int m67382q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzdk = size * zzwq.zzdk(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzdk += zzwq.zzd((zzwd) list.get(i2));
        }
        return zzdk;
    }

    /* renamed from: r */
    public static int m67381r(int i, List list, LM2 lm2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzwq.m47447f(i, (zzys) list.get(i3), lm2);
        }
        return i2;
    }

    /* renamed from: s */
    public static void m67380s(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67824u(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m67379t(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67839e(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m67378u(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67825t(i, list, z);
        }
    }

    /* renamed from: v */
    public static boolean m67377v(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: w */
    public static void m67376w(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67842b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m67375x(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67837g(i, list, z);
        }
    }

    /* renamed from: y */
    public static int m67374y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20602jM2) {
            C20602jM2 c20602jM2 = (C20602jM2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzz(c20602jM2.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzwq.zzz(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    public static void m67373z(int i, List list, InterfaceC17874Jb2 interfaceC17874Jb2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC17874Jb2.mo67841c(i, list, z);
        }
    }
}