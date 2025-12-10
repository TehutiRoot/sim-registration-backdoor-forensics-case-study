package p000;

import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzca;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcj;
import com.google.android.gms.internal.clearcut.zzcr;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzdv;
import com.google.android.gms.internal.clearcut.zzfl;
import com.google.android.gms.internal.clearcut.zzfq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: lf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20934lf2 {

    /* renamed from: d */
    public static final C20934lf2 f71674d = new C20934lf2(true);

    /* renamed from: b */
    public boolean f71676b;

    /* renamed from: c */
    public boolean f71677c = false;

    /* renamed from: a */
    public final AbstractC20264hl2 f71675a = AbstractC20264hl2.m30761g(16);

    public C20934lf2() {
    }

    /* renamed from: f */
    public static int m26442f(zzfl zzflVar, int i, Object obj) {
        int zzr = zzbn.zzr(i);
        if (zzflVar == zzfl.zzql) {
            zzci.m48156e((zzdo) obj);
            zzr <<= 1;
        }
        return zzr + m26433o(zzflVar, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.zzcj) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
        if ((r3 instanceof byte[]) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.zzcr) == false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m26439i(com.google.android.gms.internal.clearcut.zzfl r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.clearcut.zzci.m48160a(r3)
            int[] r0 = p000.AbstractC21622pf2.f76644a
            com.google.android.gms.internal.clearcut.zzfq r2 = r2.zzek()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L42;
                case 2: goto L3f;
                case 3: goto L3c;
                case 4: goto L39;
                case 5: goto L36;
                case 6: goto L33;
                case 7: goto L2a;
                case 8: goto L1e;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L45
        L15:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzdo
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzcr
            if (r2 == 0) goto L27
            goto L28
        L1e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzcj
            if (r2 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            r1 = r0
            goto L45
        L2a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r2 != 0) goto L28
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L27
            goto L28
        L33:
            boolean r0 = r3 instanceof java.lang.String
            goto L28
        L36:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L28
        L39:
            boolean r0 = r3 instanceof java.lang.Double
            goto L28
        L3c:
            boolean r0 = r3 instanceof java.lang.Float
            goto L28
        L3f:
            boolean r0 = r3 instanceof java.lang.Long
            goto L28
        L42:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L28
        L45:
            if (r1 == 0) goto L48
            return
        L48:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C20934lf2.m26439i(com.google.android.gms.internal.clearcut.zzfl, java.lang.Object):void");
    }

    /* renamed from: k */
    public static C20934lf2 m26437k() {
        return f71674d;
    }

    /* renamed from: n */
    public static int m26434n(zzca zzcaVar, Object obj) {
        zzfl zzau = zzcaVar.zzau();
        int zzc = zzcaVar.zzc();
        if (zzcaVar.zzaw()) {
            int i = 0;
            List<Object> list = (List) obj;
            if (zzcaVar.zzax()) {
                for (Object obj2 : list) {
                    i += m26433o(zzau, obj2);
                }
                return zzbn.zzr(zzc) + i + zzbn.zzz(i);
            }
            for (Object obj3 : list) {
                i += m26442f(zzau, zzc, obj3);
            }
            return i;
        }
        return m26442f(zzau, zzc, obj);
    }

    /* renamed from: o */
    public static int m26433o(zzfl zzflVar, Object obj) {
        switch (AbstractC21622pf2.f76645b[zzflVar.ordinal()]) {
            case 1:
                return zzbn.zzb(((Double) obj).doubleValue());
            case 2:
                return zzbn.zzb(((Float) obj).floatValue());
            case 3:
                return zzbn.zze(((Long) obj).longValue());
            case 4:
                return zzbn.zzf(((Long) obj).longValue());
            case 5:
                return zzbn.zzs(((Integer) obj).intValue());
            case 6:
                return zzbn.zzh(((Long) obj).longValue());
            case 7:
                return zzbn.zzv(((Integer) obj).intValue());
            case 8:
                return zzbn.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.zzd((zzdo) obj);
            case 10:
                if (obj instanceof zzcr) {
                    return zzbn.zza((zzcr) obj);
                }
                return zzbn.zzc((zzdo) obj);
            case 11:
                if (obj instanceof zzbb) {
                    return zzbn.zzb((zzbb) obj);
                }
                return zzbn.zzh((String) obj);
            case 12:
                if (obj instanceof zzbb) {
                    return zzbn.zzb((zzbb) obj);
                }
                return zzbn.zzd((byte[]) obj);
            case 13:
                return zzbn.zzt(((Integer) obj).intValue());
            case 14:
                return zzbn.zzw(((Integer) obj).intValue());
            case 15:
                return zzbn.zzi(((Long) obj).longValue());
            case 16:
                return zzbn.zzu(((Integer) obj).intValue());
            case 17:
                return zzbn.zzg(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzcj) {
                    return zzbn.zzx(((zzcj) obj).zzc());
                }
                return zzbn.zzx(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: p */
    public static boolean m26432p(Map.Entry entry) {
        zzca zzcaVar = (zzca) entry.getKey();
        if (zzcaVar.zzav() == zzfq.MESSAGE) {
            boolean zzaw = zzcaVar.zzaw();
            Object value = entry.getValue();
            if (zzaw) {
                for (zzdo zzdoVar : (List) value) {
                    if (!zzdoVar.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof zzdo) {
                if (!((zzdo) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof zzcr) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: r */
    public static int m26430r(Map.Entry entry) {
        zzca zzcaVar = (zzca) entry.getKey();
        Object value = entry.getValue();
        if (zzcaVar.zzav() == zzfq.MESSAGE && !zzcaVar.zzaw() && !zzcaVar.zzax()) {
            boolean z = value instanceof zzcr;
            int zzc = ((zzca) entry.getKey()).zzc();
            if (z) {
                return zzbn.zzb(zzc, (zzcr) value);
            }
            return zzbn.zzd(zzc, (zzdo) value);
        }
        return m26434n(zzcaVar, value);
    }

    /* renamed from: s */
    public static Object m26429s(Object obj) {
        if (obj instanceof zzdv) {
            return ((zzdv) obj).zzci();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: a */
    public final Iterator m26447a() {
        if (this.f71677c) {
            return new C18753Xg2(this.f71675a.m30753o().iterator());
        }
        return this.f71675a.m30753o().iterator();
    }

    /* renamed from: b */
    public final boolean m26446b() {
        return this.f71675a.isEmpty();
    }

    /* renamed from: c */
    public final boolean m26445c() {
        return this.f71676b;
    }

    public final /* synthetic */ Object clone() {
        C20934lf2 c20934lf2 = new C20934lf2();
        for (int i = 0; i < this.f71675a.m30755m(); i++) {
            Map.Entry m30760h = this.f71675a.m30760h(i);
            c20934lf2.m26440h((zzca) m30760h.getKey(), m30760h.getValue());
        }
        for (Map.Entry entry : this.f71675a.m30754n()) {
            c20934lf2.m26440h((zzca) entry.getKey(), entry.getValue());
        }
        c20934lf2.f71677c = this.f71677c;
        return c20934lf2;
    }

    /* renamed from: d */
    public final boolean m26444d() {
        for (int i = 0; i < this.f71675a.m30755m(); i++) {
            if (!m26432p(this.f71675a.m30760h(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f71675a.m30754n()) {
            if (!m26432p(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final Iterator m26443e() {
        if (this.f71677c) {
            return new C18753Xg2(this.f71675a.entrySet().iterator());
        }
        return this.f71675a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20934lf2)) {
            return false;
        }
        return this.f71675a.equals(((C20934lf2) obj).f71675a);
    }

    /* renamed from: g */
    public final Object m26441g(zzca zzcaVar) {
        Object obj = this.f71675a.get(zzcaVar);
        if (obj instanceof zzcr) {
            return zzcr.zzbr();
        }
        return obj;
    }

    /* renamed from: h */
    public final void m26440h(zzca zzcaVar, Object obj) {
        if (zzcaVar.zzaw()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    m26439i(zzcaVar.zzau(), obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m26439i(zzcaVar.zzau(), obj);
        }
        if (obj instanceof zzcr) {
            this.f71677c = true;
        }
        this.f71675a.put(zzcaVar, obj);
    }

    public final int hashCode() {
        return this.f71675a.hashCode();
    }

    /* renamed from: j */
    public final void m26438j(C20934lf2 c20934lf2) {
        for (int i = 0; i < c20934lf2.f71675a.m30755m(); i++) {
            m26431q(c20934lf2.f71675a.m30760h(i));
        }
        for (Map.Entry entry : c20934lf2.f71675a.m30754n()) {
            m26431q(entry);
        }
    }

    /* renamed from: l */
    public final int m26436l() {
        int i = 0;
        for (int i2 = 0; i2 < this.f71675a.m30755m(); i2++) {
            Map.Entry m30760h = this.f71675a.m30760h(i2);
            i += m26434n((zzca) m30760h.getKey(), m30760h.getValue());
        }
        for (Map.Entry entry : this.f71675a.m30754n()) {
            i += m26434n((zzca) entry.getKey(), entry.getValue());
        }
        return i;
    }

    /* renamed from: m */
    public final int m26435m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f71675a.m30755m(); i2++) {
            i += m26430r(this.f71675a.m30760h(i2));
        }
        for (Map.Entry entry : this.f71675a.m30754n()) {
            i += m26430r(entry);
        }
        return i;
    }

    /* renamed from: q */
    public final void m26431q(Map.Entry entry) {
        zzdo zzbj;
        zzca zzcaVar = (zzca) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzcr) {
            value = zzcr.zzbr();
        }
        if (zzcaVar.zzaw()) {
            Object m26441g = m26441g(zzcaVar);
            if (m26441g == null) {
                m26441g = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) m26441g).add(m26429s(obj));
            }
            this.f71675a.put(zzcaVar, m26441g);
        } else if (zzcaVar.zzav() == zzfq.MESSAGE) {
            Object m26441g2 = m26441g(zzcaVar);
            if (m26441g2 == null) {
                this.f71675a.put(zzcaVar, m26429s(value));
                return;
            }
            if (m26441g2 instanceof zzdv) {
                zzbj = zzcaVar.zza((zzdv) m26441g2, (zzdv) value);
            } else {
                zzbj = zzcaVar.zza(((zzdo) m26441g2).zzbc(), (zzdo) value).zzbj();
            }
            this.f71675a.put(zzcaVar, zzbj);
        } else {
            this.f71675a.put(zzcaVar, m26429s(value));
        }
    }

    /* renamed from: t */
    public final void m26428t() {
        if (this.f71676b) {
            return;
        }
        this.f71675a.mo26417r();
        this.f71676b = true;
    }

    public C20934lf2(boolean z) {
        m26428t();
    }
}
