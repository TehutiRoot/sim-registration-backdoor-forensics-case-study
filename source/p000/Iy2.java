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

/* renamed from: Iy2 */
/* loaded from: classes3.dex */
public final class Iy2 {

    /* renamed from: d */
    public static final Iy2 f2656d = new Iy2(true);

    /* renamed from: a */
    public final AbstractC23275zE2 f2657a;

    /* renamed from: b */
    public boolean f2658b;

    /* renamed from: c */
    public boolean f2659c;

    public Iy2() {
        this.f2657a = AbstractC23275zE2.m114e(16);
    }

    /* renamed from: a */
    public static int m67835a(zzml zzmlVar, int i, Object obj) {
        int zze = zzii.zze(i);
        if (zzmlVar == zzml.zzj) {
            zzjf.m46418e((zzkk) obj);
            zze <<= 1;
        }
        return zze + m67834b(zzmlVar, obj);
    }

    /* renamed from: b */
    public static int m67834b(zzml zzmlVar, Object obj) {
        switch (Ay2.f264b[zzmlVar.ordinal()]) {
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
    public static Object m67832d(Object obj) {
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
    public static Iy2 m67831e() {
        return f2656d;
    }

    /* renamed from: h */
    public static boolean m67828h(Map.Entry entry) {
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
    public static int m67824l(zziw zziwVar, Object obj) {
        zzml zzb = zziwVar.zzb();
        int zza = zziwVar.zza();
        if (zziwVar.zzd()) {
            int i = 0;
            if (zziwVar.zze()) {
                for (Object obj2 : (List) obj) {
                    i += m67834b(zzb, obj2);
                }
                return zzii.zze(zza) + i + zzii.zzl(i);
            }
            for (Object obj3 : (List) obj) {
                i += m67835a(zzb, zza, obj3);
            }
            return i;
        }
        return m67835a(zzb, zza, obj);
    }

    /* renamed from: m */
    public static int m67823m(Map.Entry entry) {
        zziw zziwVar = (zziw) entry.getKey();
        Object value = entry.getValue();
        if (zziwVar.zzc() == zzmo.MESSAGE && !zziwVar.zzd() && !zziwVar.zze()) {
            if (value instanceof zzjp) {
                return zzii.zzb(((zziw) entry.getKey()).zza(), (zzjp) value);
            }
            return zzii.zzb(((zziw) entry.getKey()).zza(), (zzkk) value);
        }
        return m67824l(zziwVar, value);
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
    public static void m67820p(com.google.android.gms.internal.vision.zziw r5, java.lang.Object r6) {
        /*
            com.google.android.gms.internal.vision.zzml r0 = r5.zzb()
            com.google.android.gms.internal.vision.zzjf.m46421b(r6)
            int[] r1 = p000.Ay2.f263a
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
        throw new UnsupportedOperationException("Method not decompiled: p000.Iy2.m67820p(com.google.android.gms.internal.vision.zziw, java.lang.Object):void");
    }

    /* renamed from: c */
    public final Object m67833c(zziw zziwVar) {
        Object obj = this.f2657a.get(zziwVar);
        if (obj instanceof zzjp) {
            return zzjp.zza();
        }
        return obj;
    }

    public final /* synthetic */ Object clone() {
        Iy2 iy2 = new Iy2();
        for (int i = 0; i < this.f2657a.m108k(); i++) {
            Map.Entry m110i = this.f2657a.m110i(i);
            iy2.m67830f((zziw) m110i.getKey(), m110i.getValue());
        }
        for (Map.Entry entry : this.f2657a.m105n()) {
            iy2.m67830f((zziw) entry.getKey(), entry.getValue());
        }
        iy2.f2659c = this.f2659c;
        return iy2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Iy2)) {
            return false;
        }
        return this.f2657a.equals(((Iy2) obj).f2657a);
    }

    /* renamed from: f */
    public final void m67830f(zziw zziwVar, Object obj) {
        if (zziwVar.zzd()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m67820p(zziwVar, obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m67820p(zziwVar, obj);
        }
        if (obj instanceof zzjp) {
            this.f2659c = true;
        }
        this.f2657a.put(zziwVar, obj);
    }

    /* renamed from: g */
    public final void m67829g(Iy2 iy2) {
        for (int i = 0; i < iy2.f2657a.m108k(); i++) {
            m67825k(iy2.f2657a.m110i(i));
        }
        for (Map.Entry entry : iy2.f2657a.m105n()) {
            m67825k(entry);
        }
    }

    public final int hashCode() {
        return this.f2657a.hashCode();
    }

    /* renamed from: i */
    public final void m67827i() {
        if (this.f2658b) {
            return;
        }
        this.f2657a.mo113f();
        this.f2658b = true;
    }

    /* renamed from: j */
    public final void m67826j(zziw zziwVar, Object obj) {
        List list;
        if (zziwVar.zzd()) {
            m67820p(zziwVar, obj);
            Object m67833c = m67833c(zziwVar);
            if (m67833c == null) {
                list = new ArrayList();
                this.f2657a.put(zziwVar, list);
            } else {
                list = (List) m67833c;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: k */
    public final void m67825k(Map.Entry entry) {
        zzkk zzf;
        zziw zziwVar = (zziw) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzjp) {
            value = zzjp.zza();
        }
        if (zziwVar.zzd()) {
            Object m67833c = m67833c(zziwVar);
            if (m67833c == null) {
                m67833c = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m67833c).add(m67832d(obj));
            }
            this.f2657a.put(zziwVar, m67833c);
        } else if (zziwVar.zzc() == zzmo.MESSAGE) {
            Object m67833c2 = m67833c(zziwVar);
            if (m67833c2 == null) {
                this.f2657a.put(zziwVar, m67832d(value));
                return;
            }
            if (m67833c2 instanceof zzkt) {
                zzf = zziwVar.zza((zzkt) m67833c2, (zzkt) value);
            } else {
                zzf = zziwVar.zza(((zzkk) m67833c2).zzp(), (zzkk) value).zzf();
            }
            this.f2657a.put(zziwVar, zzf);
        } else {
            this.f2657a.put(zziwVar, m67832d(value));
        }
    }

    /* renamed from: n */
    public final boolean m67822n() {
        return this.f2658b;
    }

    /* renamed from: o */
    public final Iterator m67821o() {
        if (this.f2659c) {
            return new HA2(this.f2657a.entrySet().iterator());
        }
        return this.f2657a.entrySet().iterator();
    }

    /* renamed from: q */
    public final Iterator m67819q() {
        if (this.f2659c) {
            return new HA2(this.f2657a.m103p().iterator());
        }
        return this.f2657a.m103p().iterator();
    }

    /* renamed from: r */
    public final boolean m67818r() {
        for (int i = 0; i < this.f2657a.m108k(); i++) {
            if (!m67828h(this.f2657a.m110i(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f2657a.m105n()) {
            if (!m67828h(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public final int m67817s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f2657a.m108k(); i2++) {
            i += m67823m(this.f2657a.m110i(i2));
        }
        for (Map.Entry entry : this.f2657a.m105n()) {
            i += m67823m(entry);
        }
        return i;
    }

    public Iy2(boolean z) {
        this(AbstractC23275zE2.m114e(0));
        m67827i();
    }

    public Iy2(AbstractC23275zE2 abstractC23275zE2) {
        this.f2657a = abstractC23275zE2;
        m67827i();
    }
}
