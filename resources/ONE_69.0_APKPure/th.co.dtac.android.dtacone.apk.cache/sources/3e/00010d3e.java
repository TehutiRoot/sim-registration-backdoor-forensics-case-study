package p000;

import androidx.compose.p003ui.tooling.data.SourceLocation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sL1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C22155sL1 {

    /* renamed from: a */
    public final String f79862a;

    /* renamed from: b */
    public final String f79863b;

    /* renamed from: c */
    public final int f79864c;

    /* renamed from: d */
    public final List f79865d;

    /* renamed from: e */
    public final int f79866e;

    /* renamed from: f */
    public final List f79867f;

    /* renamed from: g */
    public final boolean f79868g;

    /* renamed from: h */
    public final boolean f79869h;

    /* renamed from: i */
    public int f79870i;

    public C22155sL1(String str, String str2, int i, List locations, int i2, List list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f79862a = str;
        this.f79863b = str2;
        this.f79864c = i;
        this.f79865d = locations;
        this.f79866e = i2;
        this.f79867f = list;
        this.f79868g = z;
        this.f79869h = z2;
    }

    /* renamed from: a */
    public final String m22829a() {
        return this.f79862a;
    }

    /* renamed from: b */
    public final int m22828b() {
        return this.f79864c;
    }

    /* renamed from: c */
    public final List m22827c() {
        return this.f79867f;
    }

    /* renamed from: d */
    public final String m22826d() {
        return this.f79863b;
    }

    /* renamed from: e */
    public final boolean m22825e() {
        return this.f79868g;
    }

    /* renamed from: f */
    public final boolean m22824f() {
        return this.f79869h;
    }

    /* renamed from: g */
    public final SourceLocation m22823g() {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f79870i >= this.f79865d.size() && (i4 = this.f79866e) >= 0) {
            this.f79870i = i4;
        }
        if (this.f79870i < this.f79865d.size()) {
            List list = this.f79865d;
            int i5 = this.f79870i;
            this.f79870i = i5 + 1;
            C22328tL1 c22328tL1 = (C22328tL1) list.get(i5);
            Integer m22699b = c22328tL1.m22699b();
            if (m22699b != null) {
                i = m22699b.intValue();
            } else {
                i = -1;
            }
            Integer m22698c = c22328tL1.m22698c();
            if (m22698c != null) {
                i2 = m22698c.intValue();
            } else {
                i2 = -1;
            }
            Integer m22700a = c22328tL1.m22700a();
            if (m22700a != null) {
                i3 = m22700a.intValue();
            } else {
                i3 = -1;
            }
            return new SourceLocation(i, i2, i3, this.f79863b, this.f79864c);
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
    public final androidx.compose.p003ui.tooling.data.SourceLocation m22822h(int r9, p000.C22155sL1 r10) {
        /*
            r8 = this;
            java.util.List r0 = r8.f79865d
            int r0 = r0.size()
            if (r9 < r0) goto L22
            int r0 = r8.f79866e
            if (r0 < 0) goto L22
            java.util.List r1 = r8.f79865d
            int r1 = r1.size()
            if (r0 >= r1) goto L22
            int r0 = r8.f79866e
            int r9 = r9 - r0
            java.util.List r0 = r8.f79865d
            int r0 = r0.size()
            int r1 = r8.f79866e
            int r0 = r0 - r1
            int r9 = r9 % r0
            int r9 = r9 + r1
        L22:
            java.util.List r0 = r8.f79865d
            int r0 = r0.size()
            r1 = 0
            if (r9 >= r0) goto L87
            java.util.List r0 = r8.f79865d
            java.lang.Object r9 = r0.get(r9)
            tL1 r9 = (p000.C22328tL1) r9
            androidx.compose.ui.tooling.data.SourceLocation r0 = new androidx.compose.ui.tooling.data.SourceLocation
            java.lang.Integer r2 = r9.m22699b()
            r3 = -1
            if (r2 == 0) goto L42
            int r2 = r2.intValue()
            r4 = r2
            goto L43
        L42:
            r4 = -1
        L43:
            java.lang.Integer r2 = r9.m22698c()
            if (r2 == 0) goto L4f
            int r2 = r2.intValue()
            r5 = r2
            goto L50
        L4f:
            r5 = -1
        L50:
            java.lang.Integer r9 = r9.m22700a()
            if (r9 == 0) goto L5b
            int r9 = r9.intValue()
            goto L5c
        L5b:
            r9 = -1
        L5c:
            java.lang.String r2 = r8.f79863b
            if (r2 != 0) goto L67
            if (r10 == 0) goto L65
            java.lang.String r6 = r10.f79863b
            goto L68
        L65:
            r6 = r1
            goto L68
        L67:
            r6 = r2
        L68:
            if (r2 != 0) goto L73
            if (r10 == 0) goto L76
            int r10 = r10.f79864c
        L6e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L76
        L73:
            int r10 = r8.f79864c
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C22155sL1.m22822h(int, sL1):androidx.compose.ui.tooling.data.SourceLocation");
    }
}