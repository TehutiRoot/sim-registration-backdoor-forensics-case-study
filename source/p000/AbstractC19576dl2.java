package p000;

import com.google.android.gms.internal.clearcut.C6402j;
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

/* renamed from: dl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19576dl2 {

    /* renamed from: a */
    public static final Class f61277a = m31784C();

    /* renamed from: b */
    public static final Em2 f61278b = m31733w(false);

    /* renamed from: c */
    public static final Em2 f61279c = m31733w(true);

    /* renamed from: d */
    public static final Em2 f61280d = new C6402j();

    /* renamed from: A */
    public static Em2 m31786A() {
        return f61279c;
    }

    /* renamed from: B */
    public static Em2 m31785B() {
        return f61280d;
    }

    /* renamed from: C */
    public static Class m31784C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class m31783D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static int m31782E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19561dg2) {
            C19561dg2 c19561dg2 = (C19561dg2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzs(c19561dg2.getInt(i2));
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
    public static void m31781F(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31654e(i, list, z);
        }
    }

    /* renamed from: G */
    public static int m31780G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19561dg2) {
            C19561dg2 c19561dg2 = (C19561dg2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzt(c19561dg2.getInt(i2));
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
    public static void m31779H(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31639t(i, list, z);
        }
    }

    /* renamed from: I */
    public static void m31778I(Class cls) {
        Class cls2;
        if (!zzcg.class.isAssignableFrom(cls) && (cls2 = f61277a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: J */
    public static int m31777J(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19561dg2) {
            C19561dg2 c19561dg2 = (C19561dg2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzu(c19561dg2.getInt(i2));
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
    public static void m31776K(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31657b(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m31775L(List list) {
        return list.size() << 2;
    }

    /* renamed from: M */
    public static void m31774M(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31652g(i, list, z);
        }
    }

    /* renamed from: N */
    public static int m31773N(List list) {
        return list.size() << 3;
    }

    /* renamed from: O */
    public static void m31772O(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31656c(i, list, z);
        }
    }

    /* renamed from: P */
    public static int m31771P(List list) {
        return list.size();
    }

    /* renamed from: Q */
    public static void m31770Q(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31635x(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m31769R(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31648k(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m31768S(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31640s(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m31767T(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31643p(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m31766U(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31644o(i, list, z);
        }
    }

    /* renamed from: V */
    public static int m31765V(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m31760a(list) + (list.size() * zzbn.zzr(i));
    }

    /* renamed from: W */
    public static int m31764W(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31746j(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: X */
    public static int m31763X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31739q(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: Y */
    public static int m31762Y(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31734v(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: Z */
    public static int m31761Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31782E(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: a */
    public static int m31760a(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18884Zh2) {
            C18884Zh2 c18884Zh2 = (C18884Zh2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zze(c18884Zh2.getLong(i2));
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
    public static int m31759a0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31780G(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: b */
    public static Object m31758b(int i, int i2, Object obj, Em2 em2) {
        if (obj == null) {
            obj = em2.mo48238f();
        }
        em2.mo48243a(obj, i, i2);
        return obj;
    }

    /* renamed from: b0 */
    public static int m31757b0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31777J(list) + (size * zzbn.zzr(i));
    }

    /* renamed from: c */
    public static Object m31756c(int i, List list, zzck zzckVar, Object obj, Em2 em2) {
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
                    obj = m31758b(i, intValue, obj, em2);
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
                    obj = m31758b(i, intValue2, obj, em2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: c0 */
    public static int m31755c0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzj(i, 0);
    }

    /* renamed from: d */
    public static void m31754d(int i, List list, InterfaceC19588dp2 interfaceC19588dp2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31633z(i, list);
        }
    }

    /* renamed from: d0 */
    public static int m31753d0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzg(i, 0L);
    }

    /* renamed from: e */
    public static void m31752e(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, InterfaceC18637Vk2 interfaceC18637Vk2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31669F(i, list, interfaceC18637Vk2);
        }
    }

    /* renamed from: e0 */
    public static int m31751e0(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.zzc(i, true);
    }

    /* renamed from: f */
    public static void m31750f(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31655d(i, list, z);
        }
    }

    /* renamed from: g */
    public static void m31749g(AbstractC18171Oe2 abstractC18171Oe2, Object obj, Object obj2) {
        C20934lf2 mo48299b = abstractC18171Oe2.mo48299b(obj2);
        if (!mo48299b.m26446b()) {
            abstractC18171Oe2.mo48296e(obj).m26438j(mo48299b);
        }
    }

    /* renamed from: h */
    public static void m31748h(InterfaceC17671Gi2 interfaceC17671Gi2, Object obj, Object obj2, long j) {
        AbstractC22850wn2.m684i(obj, j, interfaceC17671Gi2.mo67192b(AbstractC22850wn2.m701M(obj, j), AbstractC22850wn2.m701M(obj2, j)));
    }

    /* renamed from: i */
    public static void m31747i(Em2 em2, Object obj, Object obj2) {
        em2.mo48237g(obj, em2.mo48235i(em2.mo48233k(obj), em2.mo48233k(obj2)));
    }

    /* renamed from: j */
    public static int m31746j(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18884Zh2) {
            C18884Zh2 c18884Zh2 = (C18884Zh2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzf(c18884Zh2.getLong(i2));
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
    public static void m31745k(int i, List list, InterfaceC19588dp2 interfaceC19588dp2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31634y(i, list);
        }
    }

    /* renamed from: l */
    public static void m31744l(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, InterfaceC18637Vk2 interfaceC18637Vk2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31667H(i, list, interfaceC18637Vk2);
        }
    }

    /* renamed from: m */
    public static void m31743m(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31637v(i, list, z);
        }
    }

    /* renamed from: n */
    public static int m31742n(int i, Object obj, InterfaceC18637Vk2 interfaceC18637Vk2) {
        if (obj instanceof zzcv) {
            return zzbn.zza(i, (zzcv) obj);
        }
        return zzbn.m48179e(i, (zzdo) obj, interfaceC18637Vk2);
    }

    /* renamed from: o */
    public static int m31741o(int i, List list) {
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
    public static int m31740p(int i, List list, InterfaceC18637Vk2 interfaceC18637Vk2) {
        int m48178f;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzr = zzbn.zzr(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzcv) {
                m48178f = zzbn.zza((zzcv) obj);
            } else {
                m48178f = zzbn.m48178f((zzdo) obj, interfaceC18637Vk2);
            }
            zzr += m48178f;
        }
        return zzr;
    }

    /* renamed from: q */
    public static int m31739q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18884Zh2) {
            C18884Zh2 c18884Zh2 = (C18884Zh2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzg(c18884Zh2.getLong(i2));
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
    public static void m31738r(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31658a(i, list, z);
        }
    }

    /* renamed from: s */
    public static boolean m31737s(int i, int i2, int i3) {
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
    public static int m31736t(int i, List list) {
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
    public static int m31735u(int i, List list, InterfaceC18637Vk2 interfaceC18637Vk2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbn.m48177g(i, (zzdo) list.get(i3), interfaceC18637Vk2);
        }
        return i2;
    }

    /* renamed from: v */
    public static int m31734v(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19561dg2) {
            C19561dg2 c19561dg2 = (C19561dg2) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.zzx(c19561dg2.getInt(i2));
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
    public static Em2 m31733w(boolean z) {
        try {
            Class m31783D = m31783D();
            if (m31783D == null) {
                return null;
            }
            return (Em2) m31783D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: x */
    public static void m31732x(int i, List list, InterfaceC19588dp2 interfaceC19588dp2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19588dp2.mo31638u(i, list, z);
        }
    }

    /* renamed from: y */
    public static boolean m31731y(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: z */
    public static Em2 m31730z() {
        return f61278b;
    }
}
