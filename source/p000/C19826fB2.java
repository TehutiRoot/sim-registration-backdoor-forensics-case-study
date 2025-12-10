package p000;

import com.google.android.gms.internal.measurement.zzju;
import com.google.android.gms.internal.measurement.zzkq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: fB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19826fB2 {

    /* renamed from: d */
    public static final C19826fB2 f61737d = new C19826fB2(true);

    /* renamed from: a */
    public final MG2 f61738a = new OF2(16);

    /* renamed from: b */
    public boolean f61739b;

    /* renamed from: c */
    public boolean f61740c;

    public C19826fB2() {
    }

    /* renamed from: a */
    public static C19826fB2 m31347a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m31344d(com.google.android.gms.internal.measurement.zzju r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.zznd r0 = r4.zzb()
            com.google.android.gms.internal.measurement.zzkm.m47152b(r5)
            com.google.android.gms.internal.measurement.zznd r1 = com.google.android.gms.internal.measurement.zznd.zza
            com.google.android.gms.internal.measurement.zzne r1 = com.google.android.gms.internal.measurement.zzne.INT
            com.google.android.gms.internal.measurement.zzne r0 = r0.zza()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L41;
                case 1: goto L3e;
                case 2: goto L3b;
                case 3: goto L38;
                case 4: goto L35;
                case 5: goto L32;
                case 6: goto L29;
                case 7: goto L20;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L46
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzll
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzkq
            if (r0 == 0) goto L46
            goto L45
        L20:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzkg
            if (r0 == 0) goto L46
            goto L45
        L29:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.zzjd
            if (r0 != 0) goto L45
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L46
            goto L45
        L32:
            boolean r0 = r5 instanceof java.lang.String
            goto L43
        L35:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L43
        L38:
            boolean r0 = r5 instanceof java.lang.Double
            goto L43
        L3b:
            boolean r0 = r5 instanceof java.lang.Float
            goto L43
        L3e:
            boolean r0 = r5 instanceof java.lang.Long
            goto L43
        L41:
            boolean r0 = r5 instanceof java.lang.Integer
        L43:
            if (r0 == 0) goto L46
        L45:
            return
        L46:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zznd r4 = r4.zzb()
            com.google.android.gms.internal.measurement.zzne r4 = r4.zza()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C19826fB2.m31344d(com.google.android.gms.internal.measurement.zzju, java.lang.Object):void");
    }

    /* renamed from: b */
    public final void m31346b() {
        if (this.f61739b) {
            return;
        }
        this.f61738a.mo67105a();
        this.f61739b = true;
    }

    /* renamed from: c */
    public final void m31345c(zzju zzjuVar, Object obj) {
        if (zzjuVar.zzc()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    m31344d(zzjuVar, arrayList.get(i));
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m31344d(zzjuVar, obj);
        }
        if (obj instanceof zzkq) {
            this.f61740c = true;
        }
        this.f61738a.put(zzjuVar, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C19826fB2 c19826fB2 = new C19826fB2();
        for (int i = 0; i < this.f61738a.m67418b(); i++) {
            Map.Entry m67413h = this.f61738a.m67413h(i);
            c19826fB2.m31345c((zzju) m67413h.getKey(), m67413h.getValue());
        }
        for (Map.Entry entry : this.f61738a.m67417c()) {
            c19826fB2.m31345c((zzju) entry.getKey(), entry.getValue());
        }
        c19826fB2.f61740c = this.f61740c;
        return c19826fB2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19826fB2)) {
            return false;
        }
        return this.f61738a.equals(((C19826fB2) obj).f61738a);
    }

    public final int hashCode() {
        return this.f61738a.hashCode();
    }

    public C19826fB2(boolean z) {
        m31346b();
        m31346b();
    }
}
