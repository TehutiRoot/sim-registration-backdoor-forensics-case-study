package p000;

import com.google.android.gms.internal.clearcut.C6391j;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzck;
import com.google.android.gms.internal.clearcut.zzcv;
import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzdo;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: am2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19105am2 {

    /* renamed from: a */
    public static final Class f8510a = m65051C();

    /* renamed from: b */
    public static final Bn2 f8511b = m65000w(false);

    /* renamed from: c */
    public static final Bn2 f8512c = m65000w(true);

    /* renamed from: d */
    public static final Bn2 f8513d = new C6391j();

    /* renamed from: A */
    public static Bn2 m65053A() {
        return f8512c;
    }

    /* renamed from: B */
    public static Bn2 m65052B() {
        return f8513d;
    }

    /* renamed from: C */
    public static Class m65051C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class m65050D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static int m65049E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19090ah2) {
            C19090ah2 c19090ah2 = (C19090ah2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzs(c19090ah2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static void m65048F(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52037e(i, list, z);
        }
    }

    /* renamed from: G */
    public static int m65047G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19090ah2) {
            C19090ah2 c19090ah2 = (C19090ah2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzt(c19090ah2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zzt(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    public static void m65046H(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52022t(i, list, z);
        }
    }

    /* renamed from: I */
    public static void m65045I(Class cls) {
        Class cls2;
        if (!zzcg.class.isAssignableFrom(cls) && (cls2 = f8510a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static int m65044J(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19090ah2) {
            C19090ah2 c19090ah2 = (C19090ah2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzu(c19090ah2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: K */
    public static void m65043K(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52040b(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m65042L(List list) {
        return list.size() << 2;
    }

    /* renamed from: M */
    public static void m65041M(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52035g(i, list, z);
        }
    }

    /* renamed from: N */
    public static int m65040N(List list) {
        return list.size() << 3;
    }

    /* renamed from: O */
    public static void m65039O(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52039c(i, list, z);
        }
    }

    /* renamed from: P */
    public static int m65038P(List list) {
        return list.size();
    }

    /* renamed from: Q */
    public static void m65037Q(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52018x(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m65036R(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52031k(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m65035S(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52023s(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m65034T(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52026p(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m65033U(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52027o(i, list, z);
        }
    }

    /* renamed from: V */
    public static int m65032V(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m65027a(list) + (list.size() * zzbn.zzr(i));
    }

    /* renamed from: W */
    public static int m65031W(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m65013j(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: X */
    public static int m65030X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m65006q(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: Y */
    public static int m65029Y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m65001v(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: Z */
    public static int m65028Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m65049E(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: a */
    public static int m65027a(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18740Wi2) {
            C18740Wi2 c18740Wi2 = (C18740Wi2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zze(c18740Wi2.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zze(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a0 */
    public static int m65026a0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m65047G(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: b */
    public static Object m65025b(int i, int i2, Object obj, Bn2 bn2) {
        if (obj == null) {
            obj = bn2.mo48235f();
        }
        bn2.mo48240a(obj, i, i2);
        return obj;
    }

    /* renamed from: b0 */
    public static int m65024b0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m65044J(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: c */
    public static Object m65023c(int i, List list, zzck zzckVar, Object obj, Bn2 bn2) {
        if (zzckVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzckVar.zzb(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = m65025b(i, intValue, obj, bn2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (zzckVar.zzb(intValue2) == null) {
                    obj = m65025b(i, intValue2, obj, bn2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: c0 */
    public static int m65022c0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzj(i, 0);
    }

    /* renamed from: d */
    public static void m65021d(int i, List list, InterfaceC19122aq2 interfaceC19122aq2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52016z(i, list);
        }
    }

    /* renamed from: d0 */
    public static int m65020d0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzg(i, 0L);
    }

    /* renamed from: e */
    public static void m65019e(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, InterfaceC18489Sl2 interfaceC18489Sl2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52052F(i, list, interfaceC18489Sl2);
        }
    }

    /* renamed from: e0 */
    public static int m65018e0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzc(i, true);
    }

    /* renamed from: f */
    public static void m65017f(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52038d(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m65016g(AbstractC18016Lf2 abstractC18016Lf2, Object obj, Object obj2) {
        C20476ig2 mo48296b = abstractC18016Lf2.mo48296b(obj2);
        if (!mo48296b.m30942b()) {
            abstractC18016Lf2.mo48293e(obj).m30934j(mo48296b);
        }
    }

    /* renamed from: h */
    public static void m65015h(InterfaceC17508Dj2 interfaceC17508Dj2, Object obj, Object obj2, long j) {
        AbstractC22403to2.m1348i(obj, j, interfaceC17508Dj2.mo67685b(AbstractC22403to2.m1365M(obj, j), AbstractC22403to2.m1365M(obj2, j)));
    }

    /* renamed from: i */
    public static void m65014i(Bn2 bn2, Object obj, Object obj2) {
        bn2.mo48234g(obj, bn2.mo48232i(bn2.mo48230k(obj), bn2.mo48230k(obj2)));
    }

    /* renamed from: j */
    public static int m65013j(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18740Wi2) {
            C18740Wi2 c18740Wi2 = (C18740Wi2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzf(c18740Wi2.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zzf(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public static void m65012k(int i, List list, InterfaceC19122aq2 interfaceC19122aq2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52017y(i, list);
        }
    }

    /* renamed from: l */
    public static void m65011l(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, InterfaceC18489Sl2 interfaceC18489Sl2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52050H(i, list, interfaceC18489Sl2);
        }
    }

    /* renamed from: m */
    public static void m65010m(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52020v(i, list, z);
        }
    }

    /* renamed from: n */
    public static int m65009n(int i, Object obj, InterfaceC18489Sl2 interfaceC18489Sl2) {
        if (obj instanceof zzcv) {
            return zzbn.zza(i, (zzcv) obj);
        }
        return zzbn.m48176e(i, (zzdo) obj, interfaceC18489Sl2);
    }

    /* renamed from: o */
    public static int m65008o(int i, List list) {
        int zzh;
        int zzh2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzr = zzbn.zzr(i) * size;
        if (list instanceof zzcx) {
            zzcx zzcxVar = (zzcx) list;
            while (i2 < size) {
                Object raw = zzcxVar.getRaw(i2);
                if (raw instanceof zzbb) {
                    zzh2 = zzbn.zzb((zzbb) raw);
                } else {
                    zzh2 = zzbn.zzh((String) raw);
                }
                zzr += zzh2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzbb) {
                    zzh = zzbn.zzb((zzbb) obj);
                } else {
                    zzh = zzbn.zzh((String) obj);
                }
                zzr += zzh;
                i2++;
            }
        }
        return zzr;
    }

    /* renamed from: p */
    public static int m65007p(int i, List list, InterfaceC18489Sl2 interfaceC18489Sl2) {
        int m48175f;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzr = zzbn.zzr(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzcv) {
                m48175f = zzbn.zza((zzcv) obj);
            } else {
                m48175f = zzbn.m48175f((zzdo) obj, interfaceC18489Sl2);
            }
            zzr += m48175f;
        }
        return zzr;
    }

    /* renamed from: q */
    public static int m65006q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18740Wi2) {
            C18740Wi2 c18740Wi2 = (C18740Wi2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzg(c18740Wi2.getLong(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zzg(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: r */
    public static void m65005r(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52041a(i, list, z);
        }
    }

    /* renamed from: s */
    public static boolean m65004s(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = i2 - i;
        long j2 = i3;
        if (j + 10 <= (2 * j2) + 3 + ((j2 + 3) * 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static int m65003t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzr = size * zzbn.zzr(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzr += zzbn.zzb((zzbb) list.get(i2));
        }
        return zzr;
    }

    /* renamed from: u */
    public static int m65002u(int i, List list, InterfaceC18489Sl2 interfaceC18489Sl2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbn.m48174g(i, (zzdo) list.get(i3), interfaceC18489Sl2);
        }
        return i2;
    }

    /* renamed from: v */
    public static int m65001v(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19090ah2) {
            C19090ah2 c19090ah2 = (C19090ah2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzx(c19090ah2.getInt(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzbn.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: w */
    public static Bn2 m65000w(boolean z) {
        try {
            Class m65050D = m65050D();
            if (m65050D == null) {
                return null;
            }
            return (Bn2) m65050D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m64999x(int i, List list, InterfaceC19122aq2 interfaceC19122aq2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19122aq2.mo52021u(i, list, z);
        }
    }

    /* renamed from: y */
    public static boolean m64998y(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: z */
    public static Bn2 m64997z() {
        return f8511b;
    }
}