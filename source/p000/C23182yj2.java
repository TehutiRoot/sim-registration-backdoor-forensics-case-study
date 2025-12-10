package p000;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcl;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdj;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzho;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

/* renamed from: yj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23182yj2 {

    /* renamed from: d */
    public static final C23182yj2 f108835d = new C23182yj2(true);

    /* renamed from: a */
    public final AbstractC21661ps2 f108836a = new C20798kr2(16);

    /* renamed from: b */
    public boolean f108837b;

    /* renamed from: c */
    public boolean f108838c;

    public C23182yj2() {
    }

    /* renamed from: a */
    public static int m204a(zzds zzdsVar, Object obj) {
        int zzd;
        int zzy;
        zzho zzd2 = zzdsVar.zzd();
        int zza = zzdsVar.zza();
        zzdsVar.zzg();
        int zzy2 = zzdj.zzy(zza << 3);
        if (zzd2 == zzho.zzj) {
            Charset charset = zzem.f46969a;
            if (!(((zzfo) obj) instanceof zzcl)) {
                zzy2 += zzy2;
            } else {
                throw null;
            }
        }
        zzhp zzhpVar = zzhp.INT;
        int i = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i = zzdj.zzz(((Long) obj).longValue());
                break;
            case 3:
                i = zzdj.zzz(((Long) obj).longValue());
                break;
            case 4:
                i = zzdj.zzu(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i = 1;
                break;
            case 8:
                if (obj instanceof zzdb) {
                    zzd = ((zzdb) obj).zzd();
                    zzy = zzdj.zzy(zzd);
                    i = zzy + zzd;
                    break;
                } else {
                    i = zzdj.zzx((String) obj);
                    break;
                }
            case 9:
                i = ((zzfo) obj).zzE();
                break;
            case 10:
                if (obj instanceof zzet) {
                    zzd = ((zzet) obj).zza();
                    zzy = zzdj.zzy(zzd);
                    i = zzy + zzd;
                    break;
                } else {
                    i = zzdj.zzv((zzfo) obj);
                    break;
                }
            case 11:
                if (obj instanceof zzdb) {
                    zzd = ((zzdb) obj).zzd();
                    zzy = zzdj.zzy(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzy = zzdj.zzy(zzd);
                }
                i = zzy + zzd;
                break;
            case 12:
                i = zzdj.zzy(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof zzef) {
                    i = zzdj.zzu(((zzef) obj).zza());
                    break;
                } else {
                    i = zzdj.zzu(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i = zzdj.zzy((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                i = zzdj.zzz((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzy2 + i;
    }

    /* renamed from: d */
    public static C23182yj2 m201d() {
        return f108835d;
    }

    /* renamed from: l */
    public static Object m193l(Object obj) {
        if (obj instanceof zzft) {
            return ((zzft) obj).zzc();
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return bArr2;
        }
        return obj;
    }

    /* renamed from: n */
    public static boolean m191n(Map.Entry entry) {
        zzds zzdsVar = (zzds) entry.getKey();
        if (zzdsVar.zze() != zzhp.MESSAGE) {
            return true;
        }
        zzdsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzfp) {
            return ((zzfp) value).zzac();
        }
        if (value instanceof zzet) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: o */
    public static final int m190o(Map.Entry entry) {
        zzds zzdsVar = (zzds) entry.getKey();
        Object value = entry.getValue();
        if (zzdsVar.zze() == zzhp.MESSAGE) {
            zzdsVar.zzg();
            zzdsVar.zzf();
            if (value instanceof zzet) {
                int zzy = zzdj.zzy(((zzds) entry.getKey()).zza());
                int zza = ((zzet) value).zza();
                int zzy2 = zzdj.zzy(zza) + zza;
                int zzy3 = zzdj.zzy(24);
                int zzy4 = zzdj.zzy(16);
                int zzy5 = zzdj.zzy(8);
                return zzy5 + zzy5 + zzy4 + zzy + zzy3 + zzy2;
            }
            int zzy6 = zzdj.zzy(((zzds) entry.getKey()).zza());
            int zzy7 = zzdj.zzy(24) + zzdj.zzv((zzfo) value);
            int zzy8 = zzdj.zzy(16);
            int zzy9 = zzdj.zzy(8);
            return zzy9 + zzy9 + zzy8 + zzy6 + zzy7;
        }
        return m204a(zzdsVar, value);
    }

    /* renamed from: b */
    public final int m203b() {
        int i = 0;
        for (int i2 = 0; i2 < this.f108836a.m23581b(); i2++) {
            i += m190o(this.f108836a.m23576h(i2));
        }
        for (Map.Entry entry : this.f108836a.m23580c()) {
            i += m190o(entry);
        }
        return i;
    }

    /* renamed from: c */
    public final C23182yj2 clone() {
        C23182yj2 c23182yj2 = new C23182yj2();
        for (int i = 0; i < this.f108836a.m23581b(); i++) {
            Map.Entry m23576h = this.f108836a.m23576h(i);
            c23182yj2.m196i((zzds) m23576h.getKey(), m23576h.getValue());
        }
        for (Map.Entry entry : this.f108836a.m23580c()) {
            c23182yj2.m196i((zzds) entry.getKey(), entry.getValue());
        }
        c23182yj2.f108838c = this.f108838c;
        return c23182yj2;
    }

    /* renamed from: e */
    public final Object m200e(zzds zzdsVar) {
        Object obj = this.f108836a.get(zzdsVar);
        if (!(obj instanceof zzet)) {
            return obj;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23182yj2)) {
            return false;
        }
        return this.f108836a.equals(((C23182yj2) obj).f108836a);
    }

    /* renamed from: f */
    public final Iterator m199f() {
        if (this.f108838c) {
            return new C19407cm2(this.f108836a.entrySet().iterator());
        }
        return this.f108836a.entrySet().iterator();
    }

    /* renamed from: g */
    public final void m198g() {
        if (!this.f108837b) {
            for (int i = 0; i < this.f108836a.m23581b(); i++) {
                Map.Entry m23576h = this.f108836a.m23576h(i);
                if (m23576h.getValue() instanceof zzed) {
                    ((zzed) m23576h.getValue()).zzS();
                }
            }
            this.f108836a.mo23582a();
            this.f108837b = true;
        }
    }

    /* renamed from: h */
    public final void m197h(C23182yj2 c23182yj2) {
        for (int i = 0; i < c23182yj2.f108836a.m23581b(); i++) {
            m192m(c23182yj2.f108836a.m23576h(i));
        }
        for (Map.Entry entry : c23182yj2.f108836a.m23580c()) {
            m192m(entry);
        }
    }

    public final int hashCode() {
        return this.f108836a.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        if ((r7 instanceof byte[]) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r1 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if ((r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m196i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r6.zzg()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzho r1 = r6.zzd()
            java.nio.charset.Charset r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem.f46969a
            r7.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzho r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzho.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp r1 = r1.zza()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L47;
                case 1: goto L44;
                case 2: goto L41;
                case 3: goto L3e;
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L2f;
                case 7: goto L26;
                case 8: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L57
        L1d:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet
            if (r1 == 0) goto L57
            goto L4b
        L26:
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzef
            if (r1 == 0) goto L57
            goto L4b
        L2f:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb
            if (r1 != 0) goto L4b
            boolean r1 = r7 instanceof byte[]
            if (r1 == 0) goto L57
            goto L4b
        L38:
            boolean r1 = r7 instanceof java.lang.String
            goto L49
        L3b:
            boolean r1 = r7 instanceof java.lang.Boolean
            goto L49
        L3e:
            boolean r1 = r7 instanceof java.lang.Double
            goto L49
        L41:
            boolean r1 = r7 instanceof java.lang.Float
            goto L49
        L44:
            boolean r1 = r7 instanceof java.lang.Long
            goto L49
        L47:
            boolean r1 = r7 instanceof java.lang.Integer
        L49:
            if (r1 == 0) goto L57
        L4b:
            boolean r1 = r7 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzet
            if (r1 == 0) goto L51
            r5.f108838c = r0
        L51:
            ps2 r0 = r5.f108836a
            r0.put(r6, r7)
            return
        L57:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r2 = r6.zza()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzho r6 = r6.zzd()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzhp r6 = r6.zza()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r3)
            r1.<init>(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C23182yj2.m196i(com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzds, java.lang.Object):void");
    }

    /* renamed from: j */
    public final boolean m195j() {
        return this.f108837b;
    }

    /* renamed from: k */
    public final boolean m194k() {
        for (int i = 0; i < this.f108836a.m23581b(); i++) {
            if (!m191n(this.f108836a.m23576h(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f108836a.m23580c()) {
            if (!m191n(entry)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final void m192m(Map.Entry entry) {
        zzfo zzj;
        zzds zzdsVar = (zzds) entry.getKey();
        Object value = entry.getValue();
        if (!(value instanceof zzet)) {
            zzdsVar.zzg();
            if (zzdsVar.zze() == zzhp.MESSAGE) {
                Object m200e = m200e(zzdsVar);
                if (m200e == null) {
                    this.f108836a.put(zzdsVar, m193l(value));
                    return;
                }
                if (m200e instanceof zzft) {
                    zzj = zzdsVar.zzc((zzft) m200e, (zzft) value);
                } else {
                    zzfn zzZ = ((zzfo) m200e).zzZ();
                    zzdsVar.zzb(zzZ, (zzfo) value);
                    zzj = zzZ.zzj();
                }
                this.f108836a.put(zzdsVar, zzj);
                return;
            }
            this.f108836a.put(zzdsVar, m193l(value));
            return;
        }
        throw null;
    }

    public C23182yj2(boolean z) {
        m198g();
        m198g();
    }
}
