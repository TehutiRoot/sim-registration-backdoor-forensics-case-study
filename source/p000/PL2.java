package p000;

import com.google.android.gms.internal.firebase_ml.C6462a;
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

/* renamed from: PL2 */
/* loaded from: classes3.dex */
public abstract class PL2 {

    /* renamed from: a */
    public static final Class f4724a = m66827c0();

    /* renamed from: b */
    public static final AbstractC17327Ba2 f4725b = m66817l(false);

    /* renamed from: c */
    public static final AbstractC17327Ba2 f4726c = m66817l(true);

    /* renamed from: d */
    public static final AbstractC17327Ba2 f4727d = new C6462a();

    /* renamed from: A */
    public static int m66858A(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21060mL2) {
            C21060mL2 c21060mL2 = (C21060mL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzaa(c21060mL2.getLong(i2));
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
    public static void m66857B(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67327x(i, list, z);
        }
    }

    /* renamed from: C */
    public static int m66856C(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21060mL2) {
            C21060mL2 c21060mL2 = (C21060mL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzab(c21060mL2.getLong(i2));
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
    public static void m66855D(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67340k(i, list, z);
        }
    }

    /* renamed from: E */
    public static int m66854E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ZK2) {
            ZK2 zk2 = (ZK2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdq(zk2.getInt(i2));
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
    public static void m66853F(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67332s(i, list, z);
        }
    }

    /* renamed from: G */
    public static int m66852G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ZK2) {
            ZK2 zk2 = (ZK2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdl(zk2.getInt(i2));
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
    public static void m66851H(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67335p(i, list, z);
        }
    }

    /* renamed from: I */
    public static void m66850I(Class cls) {
        Class cls2;
        if (!zzxh.class.isAssignableFrom(cls) && (cls2 = f4724a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static int m66849J(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ZK2) {
            ZK2 zk2 = (ZK2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdm(zk2.getInt(i2));
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
    public static void m66848K(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67336o(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m66847L(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m66804y(list) + (list.size() * zzwq.zzdk(i));
    }

    /* renamed from: M */
    public static int m66846M(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ZK2) {
            ZK2 zk2 = (ZK2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzdn(zk2.getInt(i2));
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
    public static int m66845N(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m66858A(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: O */
    public static int m66844O(List list) {
        return list.size() << 2;
    }

    /* renamed from: P */
    public static int m66843P(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m66856C(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: Q */
    public static int m66842Q(List list) {
        return list.size() << 3;
    }

    /* renamed from: R */
    public static int m66841R(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m66854E(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: S */
    public static int m66840S(List list) {
        return list.size();
    }

    /* renamed from: T */
    public static int m66839T(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m66852G(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: U */
    public static int m66838U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m66849J(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: V */
    public static int m66837V(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m66846M(list) + (size * zzwq.zzdk(i));
    }

    /* renamed from: W */
    public static int m66836W(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzwq.zzo(i, 0);
    }

    /* renamed from: X */
    public static int m66835X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzwq.zzg(i, 0L);
    }

    /* renamed from: Y */
    public static AbstractC17327Ba2 m66834Y() {
        return f4725b;
    }

    /* renamed from: Z */
    public static AbstractC17327Ba2 m66833Z() {
        return f4726c;
    }

    /* renamed from: a */
    public static Object m66832a(int i, int i2, Object obj, AbstractC17327Ba2 abstractC17327Ba2) {
        if (obj == null) {
            obj = abstractC17327Ba2.mo47979l();
        }
        abstractC17327Ba2.mo47990a(obj, i, i2);
        return obj;
    }

    /* renamed from: a0 */
    public static AbstractC17327Ba2 m66831a0() {
        return f4727d;
    }

    /* renamed from: b */
    public static Object m66830b(int i, List list, zzxm zzxmVar, Object obj, AbstractC17327Ba2 abstractC17327Ba2) {
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
                    obj = m66832a(i, intValue, obj, abstractC17327Ba2);
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
                    obj = m66832a(i, intValue2, obj, abstractC17327Ba2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: b0 */
    public static int m66829b0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzwq.zzb(i, true);
    }

    /* renamed from: c */
    public static void m66828c(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67325z(i, list);
        }
    }

    /* renamed from: c0 */
    public static Class m66827c0() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m66826d(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, OL2 ol2) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67354M(i, list, ol2);
        }
    }

    /* renamed from: d0 */
    public static Class m66825d0() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m66824e(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67346d(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m66823f(AbstractC17327Ba2 abstractC17327Ba2, Object obj, Object obj2) {
        abstractC17327Ba2.mo47983h(obj, abstractC17327Ba2.mo47981j(abstractC17327Ba2.mo47986e(obj), abstractC17327Ba2.mo47986e(obj2)));
    }

    /* renamed from: g */
    public static void m66822g(NK2 nk2, Object obj, Object obj2) {
        OK2 mo48050e = nk2.mo48050e(obj2);
        if (!mo48050e.f4377a.isEmpty()) {
            nk2.mo48049f(obj).m67085j(mo48050e);
        }
    }

    /* renamed from: h */
    public static void m66821h(InterfaceC22264tL2 interfaceC22264tL2, Object obj, Object obj2, long j) {
        AbstractC17455Da2.m68630g(obj, j, interfaceC22264tL2.mo22448h(AbstractC17455Da2.m68611z(obj, j), AbstractC17455Da2.m68611z(obj2, j)));
    }

    /* renamed from: i */
    public static void m66820i(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67326y(i, list);
        }
    }

    /* renamed from: j */
    public static void m66819j(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, OL2 ol2) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67353N(i, list, ol2);
        }
    }

    /* renamed from: k */
    public static void m66818k(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67329v(i, list, z);
        }
    }

    /* renamed from: l */
    public static AbstractC17327Ba2 m66817l(boolean z) {
        try {
            Class m66825d0 = m66825d0();
            if (m66825d0 == null) {
                return null;
            }
            return (AbstractC17327Ba2) m66825d0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static int m66816m(int i, Object obj, OL2 ol2) {
        if (obj instanceof zzyb) {
            return zzwq.zza(i, (zzyb) obj);
        }
        return zzwq.m47439e(i, (zzys) obj, ol2);
    }

    /* renamed from: n */
    public static int m66815n(int i, List list) {
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
    public static int m66814o(int i, List list, OL2 ol2) {
        int m47442a;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzdk = zzwq.zzdk(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzyb) {
                m47442a = zzwq.zza((zzyb) obj);
            } else {
                m47442a = zzwq.m47442a((zzys) obj, ol2);
            }
            zzdk += m47442a;
        }
        return zzdk;
    }

    /* renamed from: p */
    public static void m66813p(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67349a(i, list, z);
        }
    }

    /* renamed from: q */
    public static int m66812q(int i, List list) {
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
    public static int m66811r(int i, List list, OL2 ol2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzwq.m47438f(i, (zzys) list.get(i3), ol2);
        }
        return i2;
    }

    /* renamed from: s */
    public static void m66810s(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67330u(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m66809t(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67345e(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m66808u(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67331t(i, list, z);
        }
    }

    /* renamed from: v */
    public static boolean m66807v(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: w */
    public static void m66806w(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67348b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m66805x(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67343g(i, list, z);
        }
    }

    /* renamed from: y */
    public static int m66804y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21060mL2) {
            C21060mL2 c21060mL2 = (C21060mL2) list;
            i = 0;
            while (i2 < size) {
                i += zzwq.zzz(c21060mL2.getLong(i2));
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
    public static void m66803z(int i, List list, InterfaceC18031Ma2 interfaceC18031Ma2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18031Ma2.mo67347c(i, list, z);
        }
    }
}
