package p000;

import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzii;
import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzjp;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkt;
import com.google.android.gms.internal.vision.zzml;
import com.google.android.gms.internal.vision.zzmo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Fz2 */
/* loaded from: classes3.dex */
public final class Fz2 {

    /* renamed from: d */
    public static final Fz2 f1831d = new Fz2(true);

    /* renamed from: a */
    public final AbstractC22830wF2 f1832a;

    /* renamed from: b */
    public boolean f1833b;

    /* renamed from: c */
    public boolean f1834c;

    public Fz2() {
        this.f1832a = AbstractC22830wF2.m786e(16);
    }

    /* renamed from: a */
    public static int m68357a(zzml zzmlVar, int i, Object obj) {
        int zze = zzii.zze(i);
        if (zzmlVar == zzml.zzj) {
            zzjf.m46403e((zzkk) obj);
            zze <<= 1;
        }
        return zze + m68356b(zzmlVar, obj);
    }

    /* renamed from: b */
    public static int m68356b(zzml zzmlVar, Object obj) {
        switch (AbstractC23128xz2.f108917b[zzmlVar.ordinal()]) {
            case 1:
                return zzii.zzb(((Double) obj).doubleValue());
            case 2:
                return zzii.zzb(((Float) obj).floatValue());
            case 3:
                return zzii.zzd(((Long) obj).longValue());
            case 4:
                return zzii.zze(((Long) obj).longValue());
            case 5:
                return zzii.zzf(((Integer) obj).intValue());
            case 6:
                return zzii.zzg(((Long) obj).longValue());
            case 7:
                return zzii.zzi(((Integer) obj).intValue());
            case 8:
                return zzii.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzii.zzc((zzkk) obj);
            case 10:
                if (obj instanceof zzjp) {
                    return zzii.zza((zzjp) obj);
                }
                return zzii.zzb((zzkk) obj);
            case 11:
                if (obj instanceof zzht) {
                    return zzii.zzb((zzht) obj);
                }
                return zzii.zzb((String) obj);
            case 12:
                if (obj instanceof zzht) {
                    return zzii.zzb((zzht) obj);
                }
                return zzii.zzb((byte[]) obj);
            case 13:
                return zzii.zzg(((Integer) obj).intValue());
            case 14:
                return zzii.zzj(((Integer) obj).intValue());
            case 15:
                return zzii.zzh(((Long) obj).longValue());
            case 16:
                return zzii.zzh(((Integer) obj).intValue());
            case 17:
                return zzii.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzje) {
                    return zzii.zzk(((zzje) obj).zza());
                }
                return zzii.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static Object m68354d(Object obj) {
        if (obj instanceof zzkt) {
            return ((zzkt) obj).zza();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: e */
    public static Fz2 m68353e() {
        return f1831d;
    }

    /* renamed from: h */
    public static boolean m68350h(Map.Entry entry) {
        zziw zziwVar = (zziw) entry.getKey();
        if (zziwVar.zzc() == zzmo.MESSAGE) {
            if (zziwVar.zzd()) {
                for (zzkk zzkkVar : (List) entry.getValue()) {
                    if (!zzkkVar.zzk()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzkk) {
                    if (!((zzkk) value).zzk()) {
                        return false;
                    }
                } else if (value instanceof zzjp) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: l */
    public static int m68346l(zziw zziwVar, Object obj) {
        zzml zzb = zziwVar.zzb();
        int zza = zziwVar.zza();
        if (zziwVar.zzd()) {
            int i = 0;
            if (zziwVar.zze()) {
                for (Object obj2 : (List) obj) {
                    i += m68356b(zzb, obj2);
                }
                return zzii.zze(zza) + i + zzii.zzl(i);
            }
            for (Object obj3 : (List) obj) {
                i += m68357a(zzb, zza, obj3);
            }
            return i;
        }
        return m68357a(zzb, zza, obj);
    }

    /* renamed from: m */
    public static int m68345m(Map.Entry entry) {
        zziw zziwVar = (zziw) entry.getKey();
        Object value = entry.getValue();
        if (zziwVar.zzc() == zzmo.MESSAGE && !zziwVar.zzd() && !zziwVar.zze()) {
            if (value instanceof zzjp) {
                return zzii.zzb(((zziw) entry.getKey()).zza(), (zzjp) value);
            }
            return zzii.zzb(((zziw) entry.getKey()).zza(), (zzkk) value);
        }
        return m68346l(zziwVar, value);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r6 instanceof com.google.android.gms.internal.vision.zzje) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        if ((r6 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if ((r6 instanceof com.google.android.gms.internal.vision.zzjp) == false) goto L3;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m68342p(com.google.android.gms.internal.vision.zziw r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.vision.zzml r0 = r5.zzb()
            com.google.android.gms.internal.vision.zzjf.m46406b(r6)
            int[] r1 = p000.AbstractC23128xz2.f108916a
            com.google.android.gms.internal.vision.zzmo r0 = r0.zza()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L45;
                case 2: goto L42;
                case 3: goto L3f;
                case 4: goto L3c;
                case 5: goto L39;
                case 6: goto L36;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1a;
                default: goto L18;
            }
        L18:
            r0 = 0
            goto L47
        L1a:
            boolean r0 = r6 instanceof com.google.android.gms.internal.vision.zzkk
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.android.gms.internal.vision.zzjp
            if (r0 == 0) goto L18
        L22:
            r0 = 1
            goto L47
        L24:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof com.google.android.gms.internal.vision.zzje
            if (r0 == 0) goto L18
            goto L22
        L2d:
            boolean r0 = r6 instanceof com.google.android.gms.internal.vision.zzht
            if (r0 != 0) goto L22
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L18
            goto L22
        L36:
            boolean r0 = r6 instanceof java.lang.String
            goto L47
        L39:
            boolean r0 = r6 instanceof java.lang.Boolean
            goto L47
        L3c:
            boolean r0 = r6 instanceof java.lang.Double
            goto L47
        L3f:
            boolean r0 = r6 instanceof java.lang.Float
            goto L47
        L42:
            boolean r0 = r6 instanceof java.lang.Long
            goto L47
        L45:
            boolean r0 = r6 instanceof java.lang.Integer
        L47:
            if (r0 == 0) goto L4a
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r3 = r5.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.google.android.gms.internal.vision.zzml r5 = r5.zzb()
            com.google.android.gms.internal.vision.zzmo r5 = r5.zza()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r3
            r4[r1] = r5
            r5 = 2
            r4[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Fz2.m68342p(com.google.android.gms.internal.vision.zziw, java.lang.Object):void");
    }

    /* renamed from: c */
    public final Object m68355c(zziw zziwVar) {
        Object obj = this.f1832a.get(zziwVar);
        if (obj instanceof zzjp) {
            return zzjp.zza();
        }
        return obj;
    }

    public final /* synthetic */ Object clone() {
        Fz2 fz2 = new Fz2();
        for (int i = 0; i < this.f1832a.m780k(); i++) {
            Map.Entry m782i = this.f1832a.m782i(i);
            fz2.m68352f((zziw) m782i.getKey(), m782i.getValue());
        }
        for (Map.Entry entry : this.f1832a.m777n()) {
            fz2.m68352f((zziw) entry.getKey(), entry.getValue());
        }
        fz2.f1834c = this.f1834c;
        return fz2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fz2)) {
            return false;
        }
        return this.f1832a.equals(((Fz2) obj).f1832a);
    }

    /* renamed from: f */
    public final void m68352f(zziw zziwVar, Object obj) {
        if (zziwVar.zzd()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m68342p(zziwVar, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m68342p(zziwVar, obj);
        }
        if (obj instanceof zzjp) {
            this.f1834c = true;
        }
        this.f1832a.put(zziwVar, obj);
    }

    /* renamed from: g */
    public final void m68351g(Fz2 fz2) {
        for (int i = 0; i < fz2.f1832a.m780k(); i++) {
            m68347k(fz2.f1832a.m782i(i));
        }
        for (Map.Entry entry : fz2.f1832a.m777n()) {
            m68347k(entry);
        }
    }

    public final int hashCode() {
        return this.f1832a.hashCode();
    }

    /* renamed from: i */
    public final void m68349i() {
        if (this.f1833b) {
            return;
        }
        this.f1832a.mo785f();
        this.f1833b = true;
    }

    /* renamed from: j */
    public final void m68348j(zziw zziwVar, Object obj) {
        List list;
        if (zziwVar.zzd()) {
            m68342p(zziwVar, obj);
            Object m68355c = m68355c(zziwVar);
            if (m68355c == null) {
                list = new ArrayList();
                this.f1832a.put(zziwVar, list);
            } else {
                list = (List) m68355c;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public final void m68347k(Map.Entry entry) {
        zzkk zzf;
        zziw zziwVar = (zziw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzjp) {
            value = zzjp.zza();
        }
        if (zziwVar.zzd()) {
            Object m68355c = m68355c(zziwVar);
            if (m68355c == null) {
                m68355c = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m68355c).add(m68354d(obj));
            }
            this.f1832a.put(zziwVar, m68355c);
        } else if (zziwVar.zzc() == zzmo.MESSAGE) {
            Object m68355c2 = m68355c(zziwVar);
            if (m68355c2 == null) {
                this.f1832a.put(zziwVar, m68354d(value));
                return;
            }
            if (m68355c2 instanceof zzkt) {
                zzf = zziwVar.zza((zzkt) m68355c2, (zzkt) value);
            } else {
                zzf = zziwVar.zza(((zzkk) m68355c2).zzp(), (zzkk) value).zzf();
            }
            this.f1832a.put(zziwVar, zzf);
        } else {
            this.f1832a.put(zziwVar, m68354d(value));
        }
    }

    /* renamed from: n */
    public final boolean m68344n() {
        return this.f1833b;
    }

    /* renamed from: o */
    public final Iterator m68343o() {
        if (this.f1834c) {
            return new EB2(this.f1832a.entrySet().iterator());
        }
        return this.f1832a.entrySet().iterator();
    }

    /* renamed from: q */
    public final Iterator m68341q() {
        if (this.f1834c) {
            return new EB2(this.f1832a.m775p().iterator());
        }
        return this.f1832a.m775p().iterator();
    }

    /* renamed from: r */
    public final boolean m68340r() {
        for (int i = 0; i < this.f1832a.m780k(); i++) {
            if (!m68350h(this.f1832a.m782i(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f1832a.m777n()) {
            if (!m68350h(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final int m68339s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f1832a.m780k(); i2++) {
            i += m68345m(this.f1832a.m782i(i2));
        }
        for (Map.Entry entry : this.f1832a.m777n()) {
            i += m68345m(entry);
        }
        return i;
    }

    public Fz2(boolean z) {
        this(AbstractC22830wF2.m786e(0));
        m68349i();
    }

    public Fz2(AbstractC22830wF2 abstractC22830wF2) {
        this.f1832a = abstractC22830wF2;
        m68349i();
    }
}