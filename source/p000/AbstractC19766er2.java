package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6575i;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeu;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: er2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19766er2 {

    /* renamed from: a */
    public static final Class f61615a;

    /* renamed from: b */
    public static final Js2 f61616b;

    /* renamed from: c */
    public static final Js2 f61617c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Js2 js2 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f61615a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                js2 = (Js2) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f61616b = js2;
        f61617c = new C6575i();
    }

    /* renamed from: A */
    public static int m31487A(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18125Nk2) {
            C18125Nk2 c18125Nk2 = (C18125Nk2) list;
            i = 0;
            while (i2 < size) {
                i += zzdj.zzu(c18125Nk2.m67179a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdj.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: B */
    public static int m31486B(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdj.zzy(i << 3) + 4);
    }

    /* renamed from: C */
    public static int m31485C(List list) {
        return list.size() * 4;
    }

    /* renamed from: D */
    public static int m31484D(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdj.zzy(i << 3) + 8);
    }

    /* renamed from: E */
    public static int m31483E(List list) {
        return list.size() * 8;
    }

    /* renamed from: F */
    public static int m31482F(int i, List list, Rq2 rq2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzdj.m46885c(i, (zzfo) list.get(i3), rq2);
        }
        return i2;
    }

    /* renamed from: G */
    public static int m31481G(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31480H(list) + (size * zzdj.zzy(i << 3));
    }

    /* renamed from: H */
    public static int m31480H(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18125Nk2) {
            C18125Nk2 c18125Nk2 = (C18125Nk2) list;
            i = 0;
            while (i2 < size) {
                i += zzdj.zzu(c18125Nk2.m67179a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdj.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: I */
    public static int m31479I(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m31478J(list) + (list.size() * zzdj.zzy(i << 3));
    }

    /* renamed from: J */
    public static int m31478J(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC23366zn2) {
            AbstractC23366zn2 abstractC23366zn2 = (AbstractC23366zn2) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzdj.zzz(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: K */
    public static int m31477K(int i, Object obj, Rq2 rq2) {
        if (obj instanceof zzeu) {
            Logger logger = zzdj.f46959b;
            int zza = ((zzeu) obj).zza();
            return zzdj.zzy(i << 3) + zzdj.zzy(zza) + zza;
        }
        return zzdj.zzy(i << 3) + zzdj.m46884d((zzfo) obj, rq2);
    }

    /* renamed from: L */
    public static int m31476L(int i, List list, Rq2 rq2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = zzdj.zzy(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzeu) {
                int zza = ((zzeu) obj).zza();
                zzy += zzdj.zzy(zza) + zza;
            } else {
                zzy += zzdj.m46884d((zzfo) obj, rq2);
            }
        }
        return zzy;
    }

    /* renamed from: M */
    public static int m31475M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31474N(list) + (size * zzdj.zzy(i << 3));
    }

    /* renamed from: N */
    public static int m31474N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18125Nk2) {
            C18125Nk2 c18125Nk2 = (C18125Nk2) list;
            i = 0;
            while (i2 < size) {
                int m67179a = c18125Nk2.m67179a(i2);
                i += zzdj.zzy((m67179a >> 31) ^ (m67179a + m67179a));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzdj.zzy((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    public static int m31473O(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31472P(list) + (size * zzdj.zzy(i << 3));
    }

    /* renamed from: P */
    public static int m31472P(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC23366zn2) {
            AbstractC23366zn2 abstractC23366zn2 = (AbstractC23366zn2) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zzdj.zzz((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    /* renamed from: Q */
    public static int m31471Q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzew;
        int zzy = zzdj.zzy(i << 3) * size;
        if (z) {
            zzew zzewVar = (zzew) list;
            while (i2 < size) {
                Object zzf = zzewVar.zzf(i2);
                if (zzf instanceof zzdb) {
                    int zzd = ((zzdb) zzf).zzd();
                    zzy += zzdj.zzy(zzd) + zzd;
                } else {
                    zzy += zzdj.zzx((String) zzf);
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzdb) {
                    int zzd2 = ((zzdb) obj).zzd();
                    zzy += zzdj.zzy(zzd2) + zzd2;
                } else {
                    zzy += zzdj.zzx((String) obj);
                }
                i2++;
            }
        }
        return zzy;
    }

    /* renamed from: R */
    public static int m31470R(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31469S(list) + (size * zzdj.zzy(i << 3));
    }

    /* renamed from: S */
    public static int m31469S(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C18125Nk2) {
            C18125Nk2 c18125Nk2 = (C18125Nk2) list;
            i = 0;
            while (i2 < size) {
                i += zzdj.zzy(c18125Nk2.m67179a(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzdj.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: T */
    public static int m31468T(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31467U(list) + (size * zzdj.zzy(i << 3));
    }

    /* renamed from: U */
    public static int m31467U(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC23366zn2) {
            AbstractC23366zn2 abstractC23366zn2 = (AbstractC23366zn2) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zzdj.zzz(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* renamed from: V */
    public static Js2 m31466V() {
        return f61616b;
    }

    /* renamed from: W */
    public static Js2 m31465W() {
        return f61617c;
    }

    /* renamed from: a */
    public static Object m31464a(Object obj, int i, int i2, Object obj2, Js2 js2) {
        if (obj2 == null) {
            obj2 = js2.mo46911c(obj);
        }
        js2.mo46908f(obj2, i, i2);
        return obj2;
    }

    /* renamed from: b */
    public static void m31463b(AbstractC20602jj2 abstractC20602jj2, Object obj, Object obj2) {
        C23182yj2 mo29141b = abstractC20602jj2.mo29141b(obj2);
        if (!mo29141b.f108836a.isEmpty()) {
            abstractC20602jj2.mo29140c(obj).m197h(mo29141b);
        }
    }

    /* renamed from: c */
    public static void m31462c(Js2 js2, Object obj, Object obj2) {
        js2.mo46906h(obj, js2.mo46909e(js2.mo46910d(obj), js2.mo46910d(obj2)));
    }

    /* renamed from: d */
    public static void m31461d(Class cls) {
        Class cls2;
        if (!zzed.class.isAssignableFrom(cls) && (cls2 = f61615a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: e */
    public static void m31460e(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52106a(i, list, z);
        }
    }

    /* renamed from: f */
    public static void m31459f(int i, List list, InterfaceC19090av2 interfaceC19090av2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52097j(i, list);
        }
    }

    /* renamed from: g */
    public static void m31458g(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52103d(i, list, z);
        }
    }

    /* renamed from: h */
    public static void m31457h(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52104c(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m31456i(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52105b(i, list, z);
        }
    }

    /* renamed from: j */
    public static void m31455j(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52102e(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m31454k(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52094m(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m31453l(int i, List list, InterfaceC19090av2 interfaceC19090av2, Rq2 rq2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C17927Ki2) interfaceC19090av2).mo52083x(i, list.get(i2), rq2);
            }
        }
    }

    /* renamed from: m */
    public static void m31452m(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52095l(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m31451n(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52093n(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m31450o(int i, List list, InterfaceC19090av2 interfaceC19090av2, Rq2 rq2) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C17927Ki2) interfaceC19090av2).mo52087t(i, list.get(i2), rq2);
            }
        }
    }

    /* renamed from: p */
    public static void m31449p(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52108I(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m31448q(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52091p(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m31447r(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52116A(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m31446s(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52114C(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m31445t(int i, List list, InterfaceC19090av2 interfaceC19090av2) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52113D(i, list);
        }
    }

    /* renamed from: u */
    public static void m31444u(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52081z(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m31443v(int i, List list, InterfaceC19090av2 interfaceC19090av2, boolean z) {
        if (list != null && !list.isEmpty()) {
            interfaceC19090av2.mo52111F(i, list, z);
        }
    }

    /* renamed from: w */
    public static boolean m31442w(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static int m31441x(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzdj.zzy(i << 3) + 1);
    }

    /* renamed from: y */
    public static int m31440y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzy = size * zzdj.zzy(i << 3);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd = ((zzdb) list.get(i2)).zzd();
            zzy += zzdj.zzy(zzd) + zzd;
        }
        return zzy;
    }

    /* renamed from: z */
    public static int m31439z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m31487A(list) + (size * zzdj.zzy(i << 3));
    }
}
