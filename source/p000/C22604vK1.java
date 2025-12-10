package p000;

import androidx.compose.p003ui.tooling.data.SourceLocation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vK1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22604vK1 {

    /* renamed from: a */
    public final String f107648a;

    /* renamed from: b */
    public final String f107649b;

    /* renamed from: c */
    public final int f107650c;

    /* renamed from: d */
    public final List f107651d;

    /* renamed from: e */
    public final int f107652e;

    /* renamed from: f */
    public final List f107653f;

    /* renamed from: g */
    public final boolean f107654g;

    /* renamed from: h */
    public final boolean f107655h;

    /* renamed from: i */
    public int f107656i;

    public C22604vK1(String str, String str2, int i, List locations, int i2, List list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f107648a = str;
        this.f107649b = str2;
        this.f107650c = i;
        this.f107651d = locations;
        this.f107652e = i2;
        this.f107653f = list;
        this.f107654g = z;
        this.f107655h = z2;
    }

    /* renamed from: a */
    public final String m1057a() {
        return this.f107648a;
    }

    /* renamed from: b */
    public final int m1056b() {
        return this.f107650c;
    }

    /* renamed from: c */
    public final List m1055c() {
        return this.f107653f;
    }

    /* renamed from: d */
    public final String m1054d() {
        return this.f107649b;
    }

    /* renamed from: e */
    public final boolean m1053e() {
        return this.f107654g;
    }

    /* renamed from: f */
    public final boolean m1052f() {
        return this.f107655h;
    }

    /* renamed from: g */
    public final SourceLocation m1051g() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f107656i >= this.f107651d.size() && (i4 = this.f107652e) >= 0) {
            this.f107656i = i4;
        }
        if (this.f107656i < this.f107651d.size()) {
            List list = this.f107651d;
            int i5 = this.f107656i;
            this.f107656i = i5 + 1;
            C22776wK1 c22776wK1 = (C22776wK1) list.get(i5);
            Integer m864b = c22776wK1.m864b();
            if (m864b != null) {
                i = m864b.intValue();
            } else {
                i = -1;
            }
            Integer m863c = c22776wK1.m863c();
            if (m863c != null) {
                i2 = m863c.intValue();
            } else {
                i2 = -1;
            }
            Integer m865a = c22776wK1.m865a();
            if (m865a != null) {
                i3 = m865a.intValue();
            } else {
                i3 = -1;
            }
            return new SourceLocation(i, i2, i3, this.f107649b, this.f107650c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.p003ui.tooling.data.SourceLocation m1050h(int r9, p000.C22604vK1 r10) {
        /*
            r8 = this;
            java.util.List r0 = r8.f107651d
            int r0 = r0.size()
            if (r9 < r0) goto L22
            int r0 = r8.f107652e
            if (r0 < 0) goto L22
            java.util.List r1 = r8.f107651d
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            int r0 = r8.f107652e
            int r9 = r9 - r0
            java.util.List r0 = r8.f107651d
            int r0 = r0.size()
            int r1 = r8.f107652e
            int r0 = r0 - r1
            int r9 = r9 % r0
            int r9 = r9 + r1
        L22:
            java.util.List r0 = r8.f107651d
            int r0 = r0.size()
            r1 = 0
            if (r9 >= r0) goto L87
            java.util.List r0 = r8.f107651d
            java.lang.Object r9 = r0.get(r9)
            wK1 r9 = (p000.C22776wK1) r9
            androidx.compose.ui.tooling.data.SourceLocation r0 = new androidx.compose.ui.tooling.data.SourceLocation
            java.lang.Integer r2 = r9.m864b()
            r3 = -1
            if (r2 == 0) goto L42
            int r2 = r2.intValue()
            r4 = r2
            goto L43
        L42:
            r4 = -1
        L43:
            java.lang.Integer r2 = r9.m863c()
            if (r2 == 0) goto L4f
            int r2 = r2.intValue()
            r5 = r2
            goto L50
        L4f:
            r5 = -1
        L50:
            java.lang.Integer r9 = r9.m865a()
            if (r9 == 0) goto L5b
            int r9 = r9.intValue()
            goto L5c
        L5b:
            r9 = -1
        L5c:
            java.lang.String r2 = r8.f107649b
            if (r2 != 0) goto L67
            if (r10 == 0) goto L65
            java.lang.String r6 = r10.f107649b
            goto L68
        L65:
            r6 = r1
            goto L68
        L67:
            r6 = r2
        L68:
            if (r2 != 0) goto L73
            if (r10 == 0) goto L76
            int r10 = r10.f107650c
        L6e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L76
        L73:
            int r10 = r8.f107650c
            goto L6e
        L76:
            if (r1 == 0) goto L7e
            int r10 = r1.intValue()
            r7 = r10
            goto L7f
        L7e:
            r7 = -1
        L7f:
            r2 = r0
            r3 = r4
            r4 = r5
            r5 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C22604vK1.m1050h(int, vK1):androidx.compose.ui.tooling.data.SourceLocation");
    }
}
