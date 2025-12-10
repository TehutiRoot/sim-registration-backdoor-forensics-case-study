package p000;

import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;

/* renamed from: AK2 */
/* loaded from: classes3.dex */
public abstract class AK2 extends AbstractC21338nz2 {

    /* renamed from: c */
    public final CharSequence f78c;

    /* renamed from: d */
    public final zzo f79d;

    /* renamed from: e */
    public final boolean f80e;

    /* renamed from: f */
    public int f81f = 0;

    /* renamed from: g */
    public int f82g;

    public AK2(zzx zzxVar, CharSequence charSequence) {
        zzo zzoVar;
        boolean z;
        zzoVar = zzxVar.f45670a;
        this.f79d = zzoVar;
        z = zzxVar.f45671b;
        this.f80e = z;
        this.f82g = Integer.MAX_VALUE;
        this.f78c = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
        r3 = r5.f82g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r3 != 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        r1 = r5.f78c.length();
        r5.f81f = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 <= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r5.f78c.charAt(r1 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r5.f82g = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
        return r5.f78c.subSequence(r0, r1).toString();
     */
    @Override // p000.AbstractC21338nz2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object mo25980a() {
        /*
            r5 = this;
            int r0 = r5.f81f
        L2:
            int r1 = r5.f81f
            r2 = -1
            if (r1 == r2) goto L6c
            int r1 = r5.mo67402d(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.f78c
            int r1 = r1.length()
            r5.f81f = r2
            r3 = -1
            goto L1d
        L17:
            int r3 = r5.mo67403c(r1)
            r5.f81f = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.f81f = r3
            java.lang.CharSequence r1 = r5.f78c
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.f81f = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.f78c
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.f78c
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            boolean r3 = r5.f80e
            if (r3 == 0) goto L47
            if (r0 != r1) goto L47
            int r0 = r5.f81f
            goto L2
        L47:
            int r3 = r5.f82g
            r4 = 1
            if (r3 != r4) goto L5e
            java.lang.CharSequence r1 = r5.f78c
            int r1 = r1.length()
            r5.f81f = r2
            if (r1 <= r0) goto L61
            java.lang.CharSequence r2 = r5.f78c
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L61
        L5e:
            int r3 = r3 + r2
            r5.f82g = r3
        L61:
            java.lang.CharSequence r2 = r5.f78c
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L70
        L6c:
            r5.m25979b()
            r0 = 0
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AK2.mo25980a():java.lang.Object");
    }

    /* renamed from: c */
    public abstract int mo67403c(int i);

    /* renamed from: d */
    public abstract int mo67402d(int i);
}
