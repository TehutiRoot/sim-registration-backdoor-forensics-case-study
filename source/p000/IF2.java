package p000;

import com.google.android.gms.internal.measurement.C6533g;
import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzke;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.internal.measurement.zzkr;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzll;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: IF2 */
/* loaded from: classes3.dex */
public abstract class IF2 {

    /* renamed from: a */
    public static final Class f2457a;

    /* renamed from: b */
    public static final AbstractC18978aH2 f2458b;

    /* renamed from: c */
    public static final AbstractC18978aH2 f2459c;

    /* renamed from: d */
    public static final AbstractC18978aH2 f2460d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2457a = cls;
        f2458b = m67982C(false);
        f2459c = m67982C(true);
        f2460d = new C6533g();
    }

    /* renamed from: A */
    public static int m67984A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m67983B(C22759wE2 c22759wE2, Object obj, Object obj2, long j) {
        BH2.m68926x(obj, j, C22759wE2.m893b(BH2.m68939k(obj, j), BH2.m68939k(obj2, j)));
    }

    /* renamed from: C */
    public static AbstractC18978aH2 m67982C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC18978aH2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m67981D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m67980E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = size * zzjl.zzz(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzz += zzjl.zzt((zzjd) list.get(i2));
        }
        return zzz;
    }

    /* renamed from: F */
    public static int m67979F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67978G(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: G */
    public static int m67978G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21205nC2) {
            C21205nC2 c21205nC2 = (C21205nC2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzv(c21205nC2.m26154a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjl.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static int m67977H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m67976I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m67975J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m67974K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m67973L(int i, List list, DF2 df2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjl.m47160c(i, (zzll) list.get(i3), df2);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m67972M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67971N(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: N */
    public static int m67971N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21205nC2) {
            C21205nC2 c21205nC2 = (C21205nC2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzv(c21205nC2.m26154a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjl.zzv(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m67970O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m67969P(list) + (list.size() * zzjl.zzz(i));
    }

    /* renamed from: P */
    public static int m67969P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof YD2) {
            YD2 yd2 = (YD2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzB(yd2.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjl.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static int m67968Q(int i, Object obj, DF2 df2) {
        if (obj instanceof zzkr) {
            int zzA = zzjl.zzA(i << 3);
            int zza = ((zzkr) obj).zza();
            return zzA + zzjl.zzA(zza) + zza;
        }
        return zzjl.zzA(i << 3) + zzjl.m47159d((zzll) obj, df2);
    }

    /* renamed from: R */
    public static int m67967R(int i, List list, DF2 df2) {
        int m47159d;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjl.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkr) {
                m47159d = zzjl.zzw((zzkr) obj);
            } else {
                m47159d = zzjl.m47159d((zzll) obj, df2);
            }
            zzz += m47159d;
        }
        return zzz;
    }

    /* renamed from: S */
    public static int m67966S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67965T(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: T */
    public static int m67965T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21205nC2) {
            C21205nC2 c21205nC2 = (C21205nC2) list;
            i = 0;
            while (i2 < size) {
                int m26154a = c21205nC2.m26154a(i2);
                i += zzjl.zzA((m26154a >> 31) ^ (m26154a + m26154a));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzjl.zzA((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    public static int m67964U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67963V(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: V */
    public static int m67963V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof YD2) {
            YD2 yd2 = (YD2) list;
            i = 0;
            while (i2 < size) {
                long zza = yd2.zza(i2);
                i += zzjl.zzB((zza >> 63) ^ (zza + zza));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzjl.zzB((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    public static int m67962W(int i, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjl.zzz(i) * size;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            while (i2 < size) {
                Object zzf = zzktVar.zzf(i2);
                if (zzf instanceof zzjd) {
                    zzy2 = zzjl.zzt((zzjd) zzf);
                } else {
                    zzy2 = zzjl.zzy((String) zzf);
                }
                zzz += zzy2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzjd) {
                    zzy = zzjl.zzt((zzjd) obj);
                } else {
                    zzy = zzjl.zzy((String) obj);
                }
                zzz += zzy;
                i2++;
            }
        }
        return zzz;
    }

    /* renamed from: X */
    public static int m67961X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67960Y(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: Y */
    public static int m67960Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C21205nC2) {
            C21205nC2 c21205nC2 = (C21205nC2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzA(c21205nC2.m26154a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjl.zzA(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    public static int m67959Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m67957a0(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: a */
    public static AbstractC18978aH2 m67958a() {
        return f2459c;
    }

    /* renamed from: a0 */
    public static int m67957a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof YD2) {
            YD2 yd2 = (YD2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzB(yd2.zza(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjl.zzB(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static AbstractC18978aH2 m67956b() {
        return f2460d;
    }

    /* renamed from: b0 */
    public static AbstractC18978aH2 m67955b0() {
        return f2458b;
    }

    /* renamed from: c */
    public static Object m67954c(int i, List list, zzki zzkiVar, Object obj, AbstractC18978aH2 abstractC18978aH2) {
        if (zzkiVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzkiVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = m67953d(i, intValue, obj, abstractC18978aH2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkiVar.zza(intValue2)) {
                    obj = m67953d(i, intValue2, obj, abstractC18978aH2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m67953d(int i, int i2, Object obj, AbstractC18978aH2 abstractC18978aH2) {
        if (obj == null) {
            obj = abstractC18978aH2.mo47353e();
        }
        abstractC18978aH2.mo47352f(obj, i, i2);
        return obj;
    }

    /* renamed from: e */
    public static void m67952e(KA2 ka2, Object obj, Object obj2) {
        ka2.mo47404a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m67951f(AbstractC18978aH2 abstractC18978aH2, Object obj, Object obj2) {
        abstractC18978aH2.mo47350h(obj, abstractC18978aH2.mo47354d(abstractC18978aH2.mo47355c(obj), abstractC18978aH2.mo47355c(obj2)));
    }

    /* renamed from: g */
    public static void m67950g(Class cls) {
        Class cls2;
        if (!zzke.class.isAssignableFrom(cls) && (cls2 = f2457a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m67949h(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22683a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m67948i(int i, List list, InterfaceC18981aI2 interfaceC18981aI2) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22674j(i, list);
        }
    }

    /* renamed from: j */
    public static void m67947j(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22680d(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m67946k(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22681c(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m67945l(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22682b(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m67944m(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22679e(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m67943n(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22671m(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m67942o(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, DF2 df2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C22059sA2) interfaceC18981aI2).mo22690D(i, list.get(i2), df2);
            }
        }
    }

    /* renamed from: p */
    public static void m67941p(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22672l(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m67940q(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22670n(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m67939r(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, DF2 df2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C22059sA2) interfaceC18981aI2).mo22659y(i, list.get(i2), df2);
            }
        }
    }

    /* renamed from: s */
    public static void m67938s(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22685I(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m67937t(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22687G(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m67936u(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22693A(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m67935v(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22691C(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m67934w(int i, List list, InterfaceC18981aI2 interfaceC18981aI2) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22658z(i, list);
        }
    }

    /* renamed from: x */
    public static void m67933x(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22660x(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m67932y(int i, List list, InterfaceC18981aI2 interfaceC18981aI2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC18981aI2.mo22688F(i, list, z);
        }
    }

    /* renamed from: z */
    public static boolean m67931z(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}
