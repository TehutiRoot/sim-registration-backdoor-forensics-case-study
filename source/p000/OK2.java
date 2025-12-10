package p000;

import com.google.android.gms.internal.firebase_ml.zzaav;
import com.google.android.gms.internal.firebase_ml.zzaay;
import com.google.android.gms.internal.firebase_ml.zzwd;
import com.google.android.gms.internal.firebase_ml.zzwq;
import com.google.android.gms.internal.firebase_ml.zzxb;
import com.google.android.gms.internal.firebase_ml.zzxk;
import com.google.android.gms.internal.firebase_ml.zzxl;
import com.google.android.gms.internal.firebase_ml.zzxx;
import com.google.android.gms.internal.firebase_ml.zzys;
import com.google.android.gms.internal.firebase_ml.zzzb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: OK2 */
/* loaded from: classes3.dex */
public final class OK2 {

    /* renamed from: d */
    public static final OK2 f4376d = new OK2(true);

    /* renamed from: a */
    public final SL2 f4377a;

    /* renamed from: b */
    public boolean f4378b;

    /* renamed from: c */
    public boolean f4379c;

    public OK2() {
        this.f4377a = SL2.m66343j(16);
    }

    /* renamed from: e */
    public static int m67090e(zzaav zzaavVar, int i, Object obj) {
        int zzdk = zzwq.zzdk(i);
        if (zzaavVar == zzaav.zzcuq) {
            zzxl.m47418e((zzys) obj);
            zzdk <<= 1;
        }
        return zzdk + m67084k(zzaavVar, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase_ml.zzxk) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.firebase_ml.zzxx) == false) goto L3;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m67088g(com.google.android.gms.internal.firebase_ml.zzaav r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.firebase_ml.zzxl.m47422a(r3)
            int[] r0 = p000.WK2.f7198a
            com.google.android.gms.internal.firebase_ml.zzaay r2 = r2.zzxu()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L28;
                case 8: goto L1f;
                case 9: goto L16;
                default: goto L14;
            }
        L14:
            r0 = 0
            goto L42
        L16:
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzys
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzxx
            if (r2 == 0) goto L14
            goto L42
        L1f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzxk
            if (r2 == 0) goto L14
            goto L42
        L28:
            boolean r2 = r3 instanceof com.google.android.gms.internal.firebase_ml.zzwd
            if (r2 != 0) goto L42
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L14
            goto L42
        L31:
            boolean r0 = r3 instanceof java.lang.String
            goto L42
        L34:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r0 = r3 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L42
        L40:
            boolean r0 = r3 instanceof java.lang.Integer
        L42:
            if (r0 == 0) goto L45
            return
        L45:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.OK2.m67088g(com.google.android.gms.internal.firebase_ml.zzaav, java.lang.Object):void");
    }

    /* renamed from: h */
    public static void m67087h(zzwq zzwqVar, zzaav zzaavVar, int i, Object obj) {
        if (zzaavVar == zzaav.zzcuq) {
            zzys zzysVar = (zzys) obj;
            zzxl.m47418e(zzysVar);
            zzwqVar.writeTag(i, 3);
            zzysVar.zzb(zzwqVar);
            zzwqVar.writeTag(i, 4);
            return;
        }
        zzwqVar.writeTag(i, zzaavVar.zzxv());
        switch (WK2.f7199b[zzaavVar.ordinal()]) {
            case 1:
                zzwqVar.zzc(((Double) obj).doubleValue());
                return;
            case 2:
                zzwqVar.zzq(((Float) obj).floatValue());
                return;
            case 3:
                zzwqVar.zzw(((Long) obj).longValue());
                return;
            case 4:
                zzwqVar.zzw(((Long) obj).longValue());
                return;
            case 5:
                zzwqVar.zzdg(((Integer) obj).intValue());
                return;
            case 6:
                zzwqVar.zzy(((Long) obj).longValue());
                return;
            case 7:
                zzwqVar.zzdj(((Integer) obj).intValue());
                return;
            case 8:
                zzwqVar.zzax(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzys) obj).zzb(zzwqVar);
                return;
            case 10:
                zzwqVar.zzb((zzys) obj);
                return;
            case 11:
                if (obj instanceof zzwd) {
                    zzwqVar.zzc((zzwd) obj);
                    return;
                } else {
                    zzwqVar.zzck((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzwd) {
                    zzwqVar.zzc((zzwd) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzwqVar.mo47433i(bArr, 0, bArr.length);
                return;
            case 13:
                zzwqVar.zzdh(((Integer) obj).intValue());
                return;
            case 14:
                zzwqVar.zzdj(((Integer) obj).intValue());
                return;
            case 15:
                zzwqVar.zzy(((Long) obj).longValue());
                return;
            case 16:
                zzwqVar.zzdi(((Integer) obj).intValue());
                return;
            case 17:
                zzwqVar.zzx(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzxk) {
                    zzwqVar.zzdg(((zzxk) obj).zzd());
                    return;
                } else {
                    zzwqVar.zzdg(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: k */
    public static int m67084k(zzaav zzaavVar, Object obj) {
        switch (WK2.f7199b[zzaavVar.ordinal()]) {
            case 1:
                return zzwq.zzd(((Double) obj).doubleValue());
            case 2:
                return zzwq.zzr(((Float) obj).floatValue());
            case 3:
                return zzwq.zzz(((Long) obj).longValue());
            case 4:
                return zzwq.zzaa(((Long) obj).longValue());
            case 5:
                return zzwq.zzdl(((Integer) obj).intValue());
            case 6:
                return zzwq.zzac(((Long) obj).longValue());
            case 7:
                return zzwq.zzdo(((Integer) obj).intValue());
            case 8:
                return zzwq.zzay(((Boolean) obj).booleanValue());
            case 9:
                return zzwq.zzd((zzys) obj);
            case 10:
                if (obj instanceof zzxx) {
                    return zzwq.zza((zzxx) obj);
                }
                return zzwq.zzc((zzys) obj);
            case 11:
                if (obj instanceof zzwd) {
                    return zzwq.zzd((zzwd) obj);
                }
                return zzwq.zzcl((String) obj);
            case 12:
                if (obj instanceof zzwd) {
                    return zzwq.zzd((zzwd) obj);
                }
                return zzwq.zzh((byte[]) obj);
            case 13:
                return zzwq.zzdm(((Integer) obj).intValue());
            case 14:
                return zzwq.zzdp(((Integer) obj).intValue());
            case 15:
                return zzwq.zzad(((Long) obj).longValue());
            case 16:
                return zzwq.zzdn(((Integer) obj).intValue());
            case 17:
                return zzwq.zzab(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzxk) {
                    return zzwq.zzdq(((zzxk) obj).zzd());
                }
                return zzwq.zzdq(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: l */
    public static int m67083l(zzxb zzxbVar, Object obj) {
        zzaav zzuu = zzxbVar.zzuu();
        int zzd = zzxbVar.zzd();
        if (zzxbVar.zzuw()) {
            int i = 0;
            if (zzxbVar.zzux()) {
                for (Object obj2 : (List) obj) {
                    i += m67084k(zzuu, obj2);
                }
                return zzwq.zzdk(zzd) + i + zzwq.zzdt(i);
            }
            for (Object obj3 : (List) obj) {
                i += m67090e(zzuu, zzd, obj3);
            }
            return i;
        }
        return m67090e(zzuu, zzd, obj);
    }

    /* renamed from: m */
    public static boolean m67082m(Map.Entry entry) {
        zzxb zzxbVar = (zzxb) entry.getKey();
        if (zzxbVar.zzuv() == zzaay.MESSAGE) {
            if (zzxbVar.zzuw()) {
                for (zzys zzysVar : (List) entry.getValue()) {
                    if (!zzysVar.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzys) {
                    if (!((zzys) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzxx) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: o */
    public static int m67080o(Map.Entry entry) {
        zzxb zzxbVar = (zzxb) entry.getKey();
        Object value = entry.getValue();
        if (zzxbVar.zzuv() == zzaay.MESSAGE && !zzxbVar.zzuw() && !zzxbVar.zzux()) {
            if (value instanceof zzxx) {
                return zzwq.zzb(((zzxb) entry.getKey()).zzd(), (zzxx) value);
            }
            return zzwq.zzb(((zzxb) entry.getKey()).zzd(), (zzys) value);
        }
        return m67083l(zzxbVar, value);
    }

    /* renamed from: p */
    public static Object m67079p(Object obj) {
        if (obj instanceof zzzb) {
            return ((zzzb) obj).zztu();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: r */
    public static OK2 m67077r() {
        return f4376d;
    }

    /* renamed from: a */
    public final Iterator m67094a() {
        if (this.f4379c) {
            return new C19168bL2(this.f4377a.m66337p().iterator());
        }
        return this.f4377a.m66337p().iterator();
    }

    /* renamed from: b */
    public final boolean m67093b() {
        return this.f4378b;
    }

    /* renamed from: c */
    public final boolean m67092c() {
        for (int i = 0; i < this.f4377a.m66339n(); i++) {
            if (!m67082m(this.f4377a.m66342k(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f4377a.m66338o()) {
            if (!m67082m(entry)) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object clone() {
        OK2 ok2 = new OK2();
        for (int i = 0; i < this.f4377a.m66339n(); i++) {
            Map.Entry m66342k = this.f4377a.m66342k(i);
            ok2.m67086i((zzxb) m66342k.getKey(), m66342k.getValue());
        }
        for (Map.Entry entry : this.f4377a.m66338o()) {
            ok2.m67086i((zzxb) entry.getKey(), entry.getValue());
        }
        ok2.f4379c = this.f4379c;
        return ok2;
    }

    /* renamed from: d */
    public final Iterator m67091d() {
        if (this.f4379c) {
            return new C19168bL2(this.f4377a.entrySet().iterator());
        }
        return this.f4377a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OK2)) {
            return false;
        }
        return this.f4377a.equals(((OK2) obj).f4377a);
    }

    /* renamed from: f */
    public final Object m67089f(zzxb zzxbVar) {
        Object obj = this.f4377a.get(zzxbVar);
        if (obj instanceof zzxx) {
            return zzxx.zzvx();
        }
        return obj;
    }

    public final int hashCode() {
        return this.f4377a.hashCode();
    }

    /* renamed from: i */
    public final void m67086i(zzxb zzxbVar, Object obj) {
        if (zzxbVar.zzuw()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m67088g(zzxbVar.zzuu(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m67088g(zzxbVar.zzuu(), obj);
        }
        if (obj instanceof zzxx) {
            this.f4379c = true;
        }
        this.f4377a.put(zzxbVar, obj);
    }

    /* renamed from: j */
    public final void m67085j(OK2 ok2) {
        for (int i = 0; i < ok2.f4377a.m66339n(); i++) {
            m67081n(ok2.f4377a.m66342k(i));
        }
        for (Map.Entry entry : ok2.f4377a.m66338o()) {
            m67081n(entry);
        }
    }

    /* renamed from: n */
    public final void m67081n(Map.Entry entry) {
        zzys zzvn;
        zzxb zzxbVar = (zzxb) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzxx) {
            value = zzxx.zzvx();
        }
        if (zzxbVar.zzuw()) {
            Object m67089f = m67089f(zzxbVar);
            if (m67089f == null) {
                m67089f = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m67089f).add(m67079p(obj));
            }
            this.f4377a.put(zzxbVar, m67089f);
        } else if (zzxbVar.zzuv() == zzaay.MESSAGE) {
            Object m67089f2 = m67089f(zzxbVar);
            if (m67089f2 == null) {
                this.f4377a.put(zzxbVar, m67079p(value));
                return;
            }
            if (m67089f2 instanceof zzzb) {
                zzvn = zzxbVar.zza((zzzb) m67089f2, (zzzb) value);
            } else {
                zzvn = zzxbVar.zza(((zzys) m67089f2).zzvf(), (zzys) value).zzvn();
            }
            this.f4377a.put(zzxbVar, zzvn);
        } else {
            this.f4377a.put(zzxbVar, m67079p(value));
        }
    }

    /* renamed from: q */
    public final void m67078q() {
        if (this.f4378b) {
            return;
        }
        this.f4377a.mo66340m();
        this.f4378b = true;
    }

    /* renamed from: s */
    public final int m67076s() {
        int i = 0;
        for (int i2 = 0; i2 < this.f4377a.m66339n(); i2++) {
            i += m67080o(this.f4377a.m66342k(i2));
        }
        for (Map.Entry entry : this.f4377a.m66338o()) {
            i += m67080o(entry);
        }
        return i;
    }

    public OK2(boolean z) {
        this(SL2.m66343j(0));
        m67078q();
    }

    public OK2(SL2 sl2) {
        this.f4377a = sl2;
        m67078q();
    }
}
