package p000;

import com.google.android.gms.internal.vision.C6620E;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjt;
import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzkk;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: mE2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21039mE2 {

    /* renamed from: a */
    public static final Class f71855a = m26361F();

    /* renamed from: b */
    public static final AbstractC22590vF2 f71856b = m26328i(false);

    /* renamed from: c */
    public static final AbstractC22590vF2 f71857c = m26328i(true);

    /* renamed from: d */
    public static final AbstractC22590vF2 f71858d = new C6620E();

    /* renamed from: A */
    public static int m26366A(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC22922xB2) {
            AbstractC22922xB2 abstractC22922xB2 = (AbstractC22922xB2) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzii.zzf(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: B */
    public static AbstractC22590vF2 m26365B() {
        return f71858d;
    }

    /* renamed from: C */
    public static void m26364C(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26300a(i, list, z);
        }
    }

    /* renamed from: D */
    public static int m26363D(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26362E(list) + (size * zzii.zze(i));
    }

    /* renamed from: E */
    public static int m26362E(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzk(oz2.m66937a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: F */
    public static Class m26361F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static void m26360G(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26280u(i, list, z);
        }
    }

    /* renamed from: H */
    public static int m26359H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26358I(list) + (size * zzii.zze(i));
    }

    /* renamed from: I */
    public static int m26358I(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzf(oz2.m66937a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzf(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: J */
    public static Class m26357J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: K */
    public static void m26356K(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26296e(i, list, z);
        }
    }

    /* renamed from: L */
    public static int m26355L(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26354M(list) + (size * zzii.zze(i));
    }

    /* renamed from: M */
    public static int m26354M(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzg(oz2.m66937a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: N */
    public static void m26353N(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26281t(i, list, z);
        }
    }

    /* renamed from: O */
    public static int m26352O(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26351P(list) + (size * zzii.zze(i));
    }

    /* renamed from: P */
    public static int m26351P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Oz2) {
            Oz2 oz2 = (Oz2) list;
            i = 0;
            while (i2 < size) {
                i += zzii.zzh(oz2.m66937a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzii.zzh(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static void m26350Q(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26299b(i, list, z);
        }
    }

    /* renamed from: R */
    public static int m26349R(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzi(i, 0);
    }

    /* renamed from: S */
    public static int m26348S(List list) {
        return list.size() << 2;
    }

    /* renamed from: T */
    public static void m26347T(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26294g(i, list, z);
        }
    }

    /* renamed from: U */
    public static int m26346U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzg(i, 0L);
    }

    /* renamed from: V */
    public static int m26345V(List list) {
        return list.size() << 3;
    }

    /* renamed from: W */
    public static void m26344W(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26298c(i, list, z);
        }
    }

    /* renamed from: X */
    public static int m26343X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.zzb(i, true);
    }

    /* renamed from: Y */
    public static int m26342Y(List list) {
        return list.size();
    }

    /* renamed from: Z */
    public static void m26341Z(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26277x(i, list, z);
        }
    }

    /* renamed from: a */
    public static int m26340a(int i, Object obj, InterfaceC19835fE2 interfaceC19835fE2) {
        if (obj instanceof zzjt) {
            return zzii.zza(i, (zzjt) obj);
        }
        return zzii.m46442d(i, (zzkk) obj, interfaceC19835fE2);
    }

    /* renamed from: a0 */
    public static void m26339a0(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26290k(i, list, z);
        }
    }

    /* renamed from: b */
    public static int m26338b(int i, List list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzii.zze(i) * size;
        if (list instanceof zzjv) {
            zzjv zzjvVar = (zzjv) list;
            while (i2 < size) {
                Object zzb3 = zzjvVar.zzb(i2);
                if (zzb3 instanceof zzht) {
                    zzb2 = zzii.zzb((zzht) zzb3);
                } else {
                    zzb2 = zzii.zzb((String) zzb3);
                }
                zze += zzb2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzht) {
                    zzb = zzii.zzb((zzht) obj);
                } else {
                    zzb = zzii.zzb((String) obj);
                }
                zze += zzb;
                i2++;
            }
        }
        return zze;
    }

    /* renamed from: b0 */
    public static void m26337b0(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26282s(i, list, z);
        }
    }

    /* renamed from: c */
    public static int m26336c(int i, List list, InterfaceC19835fE2 interfaceC19835fE2) {
        int m46444a;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzii.zze(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzjt) {
                m46444a = zzii.zza((zzjt) obj);
            } else {
                m46444a = zzii.m46444a((zzkk) obj, interfaceC19835fE2);
            }
            zze += m46444a;
        }
        return zze;
    }

    /* renamed from: c0 */
    public static void m26335c0(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26285p(i, list, z);
        }
    }

    /* renamed from: d */
    public static int m26334d(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m26332e(list) + (list.size() * zzii.zze(i));
    }

    /* renamed from: d0 */
    public static void m26333d0(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26286o(i, list, z);
        }
    }

    /* renamed from: e */
    public static int m26332e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC22922xB2) {
            AbstractC22922xB2 abstractC22922xB2 = (AbstractC22922xB2) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzii.zzd(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: f */
    public static Object m26331f(int i, int i2, Object obj, AbstractC22590vF2 abstractC22590vF2) {
        if (obj == null) {
            obj = abstractC22590vF2.mo1091a();
        }
        abstractC22590vF2.mo1088d(obj, i, i2);
        return obj;
    }

    /* renamed from: g */
    public static Object m26330g(int i, List list, zzjg zzjgVar, Object obj, AbstractC22590vF2 abstractC22590vF2) {
        if (zzjgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzjgVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = m26331f(i, intValue, obj, abstractC22590vF2);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzjgVar.zza(intValue2)) {
                    obj = m26331f(i, intValue2, obj, abstractC22590vF2);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: h */
    public static AbstractC22590vF2 m26329h() {
        return f71856b;
    }

    /* renamed from: i */
    public static AbstractC22590vF2 m26328i(boolean z) {
        try {
            Class m26357J = m26357J();
            if (m26357J == null) {
                return null;
            }
            return (AbstractC22590vF2) m26357J.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m26327j(int i, List list, InterfaceC21048mH2 interfaceC21048mH2) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26275z(i, list);
        }
    }

    /* renamed from: k */
    public static void m26326k(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, InterfaceC19835fE2 interfaceC19835fE2) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26301J(i, list, interfaceC19835fE2);
        }
    }

    /* renamed from: l */
    public static void m26325l(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26297d(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m26324m(Class cls) {
        Class cls2;
        if (!zzjb.class.isAssignableFrom(cls) && (cls2 = f71855a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: n */
    public static void m26323n(AbstractC20303hy2 abstractC20303hy2, Object obj, Object obj2) {
        Iy2 mo30693d = abstractC20303hy2.mo30693d(obj2);
        if (!mo30693d.f2657a.isEmpty()) {
            abstractC20303hy2.mo30688i(obj).m67829g(mo30693d);
        }
    }

    /* renamed from: o */
    public static void m26322o(InterfaceC22409uC2 interfaceC22409uC2, Object obj, Object obj2, long j) {
        AbstractC20013gG2.m31187j(obj, j, interfaceC22409uC2.zza(AbstractC20013gG2.m31206F(obj, j), AbstractC20013gG2.m31206F(obj2, j)));
    }

    /* renamed from: p */
    public static void m26321p(AbstractC22590vF2 abstractC22590vF2, Object obj, Object obj2) {
        abstractC22590vF2.mo1085g(obj, abstractC22590vF2.mo1076p(abstractC22590vF2.mo1081k(obj), abstractC22590vF2.mo1081k(obj2)));
    }

    /* renamed from: q */
    public static boolean m26320q(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: r */
    public static int m26319r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzii.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzii.zzb((zzht) list.get(i2));
        }
        return zze;
    }

    /* renamed from: s */
    public static int m26318s(int i, List list, InterfaceC19835fE2 interfaceC19835fE2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzii.m46441e(i, (zzkk) list.get(i3), interfaceC19835fE2);
        }
        return i2;
    }

    /* renamed from: t */
    public static int m26317t(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26316u(list) + (size * zzii.zze(i));
    }

    /* renamed from: u */
    public static int m26316u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC22922xB2) {
            AbstractC22922xB2 abstractC22922xB2 = (AbstractC22922xB2) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzii.zze(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: v */
    public static AbstractC22590vF2 m26315v() {
        return f71857c;
    }

    /* renamed from: w */
    public static void m26314w(int i, List list, InterfaceC21048mH2 interfaceC21048mH2) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26276y(i, list);
        }
    }

    /* renamed from: x */
    public static void m26313x(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, InterfaceC19835fE2 interfaceC19835fE2) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26302I(i, list, interfaceC19835fE2);
        }
    }

    /* renamed from: y */
    public static void m26312y(int i, List list, InterfaceC21048mH2 interfaceC21048mH2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC21048mH2.mo26279v(i, list, z);
        }
    }

    /* renamed from: z */
    public static int m26311z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26366A(list) + (size * zzii.zze(i));
    }
}
