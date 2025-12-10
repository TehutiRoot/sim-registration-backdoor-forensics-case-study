package p000;

/* renamed from: Xi0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18757Xi0 {

    /* renamed from: a */
    public StringBuilder f7562a = new StringBuilder();

    /* renamed from: b */
    public boolean f7563b;

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m65445a(char[] r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f7563b
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r0 = r6.m65443c(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L53
            char r4 = r7[r0]
            if (r4 == r2) goto L46
            r5 = 13
            if (r4 == r5) goto L28
            goto L51
        L28:
            java.lang.StringBuilder r4 = r6.f7562a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f7563b = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L43
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            boolean r4 = r6.m65443c(r4)
            if (r4 == 0) goto L43
            r0 = r9
        L43:
            int r9 = r0 + 1
            goto L51
        L46:
            java.lang.StringBuilder r4 = r6.f7562a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.m65443c(r3)
            goto L43
        L51:
            int r0 = r0 + r3
            goto L1d
        L53:
            java.lang.StringBuilder r0 = r6.f7562a
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC18757Xi0.m65445a(char[], int, int):void");
    }

    /* renamed from: b */
    public void m65444b() {
        if (this.f7563b || this.f7562a.length() > 0) {
            m65443c(false);
        }
    }

    /* renamed from: c */
    public final boolean m65443c(boolean z) {
        String str;
        if (this.f7563b) {
            if (z) {
                str = "\r\n";
            } else {
                str = "\r";
            }
        } else if (z) {
            str = "\n";
        } else {
            str = "";
        }
        mo39977d(this.f7562a.toString(), str);
        this.f7562a = new StringBuilder();
        this.f7563b = false;
        return z;
    }

    /* renamed from: d */
    public abstract void mo39977d(String str, String str2);
}
