package p000;

import com.google.android.gms.internal.measurement.C6522g;
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

/* renamed from: FG2 */
/* loaded from: classes3.dex */
public abstract class FG2 {

    /* renamed from: a */
    public static final Class f1633a;

    /* renamed from: b */
    public static final XH2 f1634b;

    /* renamed from: c */
    public static final XH2 f1635c;

    /* renamed from: d */
    public static final XH2 f1636d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f1633a = cls;
        f1634b = m68495C(false);
        f1635c = m68495C(true);
        f1636d = new C6522g();
    }

    /* renamed from: A */
    public static int m68497A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m68496B(C22311tF2 c22311tF2, Object obj, Object obj2, long j) {
        AbstractC23185yI2.m346x(obj, j, C22311tF2.m22719b(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j)));
    }

    /* renamed from: C */
    public static XH2 m68495C(boolean z) {
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
            return (XH2) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m68494D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m68493E(int i, List list) {
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
    public static int m68492F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m68491G(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: G */
    public static int m68491G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20748kD2) {
            C20748kD2 c20748kD2 = (C20748kD2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzv(c20748kD2.m29269a(i2));
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
    public static int m68490H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i << 3) + 4);
    }

    /* renamed from: I */
    public static int m68489I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m68488J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjl.zzA(i << 3) + 8);
    }

    /* renamed from: K */
    public static int m68487K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m68486L(int i, List list, AG2 ag2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzjl.m47169c(i, (zzll) list.get(i3), ag2);
        }
        return i2;
    }

    /* renamed from: M */
    public static int m68485M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m68484N(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: N */
    public static int m68484N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20748kD2) {
            C20748kD2 c20748kD2 = (C20748kD2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzv(c20748kD2.m29269a(i2));
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
    public static int m68483O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m68482P(list) + (list.size() * zzjl.zzz(i));
    }

    /* renamed from: P */
    public static int m68482P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof VE2) {
            VE2 ve2 = (VE2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzB(ve2.zza(i2));
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
    public static int m68481Q(int i, Object obj, AG2 ag2) {
        if (obj instanceof zzkr) {
            int zzA = zzjl.zzA(i << 3);
            int zza = ((zzkr) obj).zza();
            return zzA + zzjl.zzA(zza) + zza;
        }
        return zzjl.zzA(i << 3) + zzjl.m47168d((zzll) obj, ag2);
    }

    /* renamed from: R */
    public static int m68480R(int i, List list, AG2 ag2) {
        int m47168d;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjl.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzkr) {
                m47168d = zzjl.zzw((zzkr) obj);
            } else {
                m47168d = zzjl.m47168d((zzll) obj, ag2);
            }
            zzz += m47168d;
        }
        return zzz;
    }

    /* renamed from: S */
    public static int m68479S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m68478T(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: T */
    public static int m68478T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20748kD2) {
            C20748kD2 c20748kD2 = (C20748kD2) list;
            i = 0;
            while (i2 < size) {
                int m29269a = c20748kD2.m29269a(i2);
                i += zzjl.zzA((m29269a >> 31) ^ (m29269a + m29269a));
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
    public static int m68477U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m68476V(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: V */
    public static int m68476V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof VE2) {
            VE2 ve2 = (VE2) list;
            i = 0;
            while (i2 < size) {
                long zza = ve2.zza(i2);
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
    public static int m68475W(int i, List list) {
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
    public static int m68474X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m68473Y(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: Y */
    public static int m68473Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C20748kD2) {
            C20748kD2 c20748kD2 = (C20748kD2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzA(c20748kD2.m29269a(i2));
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
    public static int m68472Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m68470a0(list) + (size * zzjl.zzz(i));
    }

    /* renamed from: a */
    public static XH2 m68471a() {
        return f1635c;
    }

    /* renamed from: a0 */
    public static int m68470a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof VE2) {
            VE2 ve2 = (VE2) list;
            i = 0;
            while (i2 < size) {
                i += zzjl.zzB(ve2.zza(i2));
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
    public static XH2 m68469b() {
        return f1636d;
    }

    /* renamed from: b0 */
    public static XH2 m68468b0() {
        return f1634b;
    }

    /* renamed from: c */
    public static Object m68467c(int i, List list, zzki zzkiVar, Object obj, XH2 xh2) {
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
                    obj = m68466d(i, intValue, obj, xh2);
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
                    obj = m68466d(i, intValue2, obj, xh2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m68466d(int i, int i2, Object obj, XH2 xh2) {
        if (obj == null) {
            obj = xh2.mo47362e();
        }
        xh2.mo47361f(obj, i, i2);
        return obj;
    }

    /* renamed from: e */
    public static void m68465e(HB2 hb2, Object obj, Object obj2) {
        hb2.mo47413a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m68464f(XH2 xh2, Object obj, Object obj2) {
        xh2.mo47359h(obj, xh2.mo47363d(xh2.mo47364c(obj), xh2.mo47364c(obj2)));
    }

    /* renamed from: g */
    public static void m68463g(Class cls) {
        Class cls2;
        if (!zzke.class.isAssignableFrom(cls) && (cls2 = f1633a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m68462h(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23905a(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m68461i(int i, List list, XI2 xi2) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23896j(i, list);
        }
    }

    /* renamed from: j */
    public static void m68460j(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23902d(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m68459k(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23903c(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m68458l(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23904b(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m68457m(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23901e(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m68456n(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23893m(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m68455o(int i, List list, XI2 xi2, AG2 ag2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C21607pB2) xi2).mo23912D(i, list.get(i2), ag2);
            }
        }
    }

    /* renamed from: p */
    public static void m68454p(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23894l(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m68453q(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23892n(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m68452r(int i, List list, XI2 xi2, AG2 ag2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C21607pB2) xi2).mo23881y(i, list.get(i2), ag2);
            }
        }
    }

    /* renamed from: s */
    public static void m68451s(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23907I(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m68450t(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23909G(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m68449u(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23915A(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m68448v(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23913C(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m68447w(int i, List list, XI2 xi2) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23880z(i, list);
        }
    }

    /* renamed from: x */
    public static void m68446x(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23882x(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m68445y(int i, List list, XI2 xi2, boolean z) {
        if (list != null && !list.isEmpty()) {
            xi2.mo23910F(i, list, z);
        }
    }

    /* renamed from: z */
    public static boolean m68444z(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }
}