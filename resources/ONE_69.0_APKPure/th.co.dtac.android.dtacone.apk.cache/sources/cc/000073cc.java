package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C4928a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes2.dex */
public class C4956i {

    /* renamed from: a */
    public final InterfaceC4957a f37317a;

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4957a {
        /* renamed from: a */
        C4928a.C4930b mo52920a(int i, int i2, int i3, Object obj);

        /* renamed from: b */
        void mo52919b(C4928a.C4930b c4930b);
    }

    public C4956i(InterfaceC4957a interfaceC4957a) {
        this.f37317a = interfaceC4957a;
    }

    /* renamed from: a */
    public final int m52926a(List list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C4928a.C4930b) list.get(size)).f37203a == 8) {
                if (z) {
                    return size;
                }
            } else {
                z = true;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void m52925b(List list) {
        while (true) {
            int m52926a = m52926a(list);
            if (m52926a != -1) {
                m52923d(list, m52926a, m52926a + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m52924c(List list, int i, C4928a.C4930b c4930b, int i2, C4928a.C4930b c4930b2) {
        int i3;
        int i4 = c4930b.f37206d;
        int i5 = c4930b2.f37204b;
        if (i4 < i5) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        int i6 = c4930b.f37204b;
        if (i6 < i5) {
            i3++;
        }
        if (i5 <= i6) {
            c4930b.f37204b = i6 + c4930b2.f37206d;
        }
        int i7 = c4930b2.f37204b;
        if (i7 <= i4) {
            c4930b.f37206d = i4 + c4930b2.f37206d;
        }
        c4930b2.f37204b = i7 + i3;
        list.set(i, c4930b2);
        list.set(i2, c4930b);
    }

    /* renamed from: d */
    public final void m52923d(List list, int i, int i2) {
        C4928a.C4930b c4930b = (C4928a.C4930b) list.get(i);
        C4928a.C4930b c4930b2 = (C4928a.C4930b) list.get(i2);
        int i3 = c4930b2.f37203a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 4) {
                    m52921f(list, i, c4930b, i2, c4930b2);
                    return;
                }
                return;
            }
            m52922e(list, i, c4930b, i2, c4930b2);
            return;
        }
        m52924c(list, i, c4930b, i2, c4930b2);
    }

    /* renamed from: e */
    public void m52922e(List list, int i, C4928a.C4930b c4930b, int i2, C4928a.C4930b c4930b2) {
        boolean z;
        int i3 = c4930b.f37204b;
        int i4 = c4930b.f37206d;
        boolean z2 = false;
        if (i3 < i4) {
            if (c4930b2.f37204b == i3 && c4930b2.f37206d == i4 - i3) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (c4930b2.f37204b == i4 + 1 && c4930b2.f37206d == i3 - i4) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i5 = c4930b2.f37204b;
        if (i4 < i5) {
            c4930b2.f37204b = i5 - 1;
        } else {
            int i6 = c4930b2.f37206d;
            if (i4 < i5 + i6) {
                c4930b2.f37206d = i6 - 1;
                c4930b.f37203a = 2;
                c4930b.f37206d = 1;
                if (c4930b2.f37206d == 0) {
                    list.remove(i2);
                    this.f37317a.mo52919b(c4930b2);
                    return;
                }
                return;
            }
        }
        int i7 = c4930b.f37204b;
        int i8 = c4930b2.f37204b;
        C4928a.C4930b c4930b3 = null;
        if (i7 <= i8) {
            c4930b2.f37204b = i8 + 1;
        } else {
            int i9 = c4930b2.f37206d;
            if (i7 < i8 + i9) {
                c4930b3 = this.f37317a.mo52920a(2, i7 + 1, (i8 + i9) - i7, null);
                c4930b2.f37206d = c4930b.f37204b - c4930b2.f37204b;
            }
        }
        if (z2) {
            list.set(i, c4930b2);
            list.remove(i2);
            this.f37317a.mo52919b(c4930b);
            return;
        }
        if (z) {
            if (c4930b3 != null) {
                int i10 = c4930b.f37204b;
                if (i10 > c4930b3.f37204b) {
                    c4930b.f37204b = i10 - c4930b3.f37206d;
                }
                int i11 = c4930b.f37206d;
                if (i11 > c4930b3.f37204b) {
                    c4930b.f37206d = i11 - c4930b3.f37206d;
                }
            }
            int i12 = c4930b.f37204b;
            if (i12 > c4930b2.f37204b) {
                c4930b.f37204b = i12 - c4930b2.f37206d;
            }
            int i13 = c4930b.f37206d;
            if (i13 > c4930b2.f37204b) {
                c4930b.f37206d = i13 - c4930b2.f37206d;
            }
        } else {
            if (c4930b3 != null) {
                int i14 = c4930b.f37204b;
                if (i14 >= c4930b3.f37204b) {
                    c4930b.f37204b = i14 - c4930b3.f37206d;
                }
                int i15 = c4930b.f37206d;
                if (i15 >= c4930b3.f37204b) {
                    c4930b.f37206d = i15 - c4930b3.f37206d;
                }
            }
            int i16 = c4930b.f37204b;
            if (i16 >= c4930b2.f37204b) {
                c4930b.f37204b = i16 - c4930b2.f37206d;
            }
            int i17 = c4930b.f37206d;
            if (i17 >= c4930b2.f37204b) {
                c4930b.f37206d = i17 - c4930b2.f37206d;
            }
        }
        list.set(i, c4930b2);
        if (c4930b.f37204b != c4930b.f37206d) {
            list.set(i2, c4930b);
        } else {
            list.remove(i2);
        }
        if (c4930b3 != null) {
            list.add(i, c4930b3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m52921f(java.util.List r9, int r10, androidx.recyclerview.widget.C4928a.C4930b r11, int r12, androidx.recyclerview.widget.C4928a.C4930b r13) {
        /*
            r8 = this;
            int r0 = r11.f37206d
            int r1 = r13.f37204b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f37204b = r1
            goto L20
        Ld:
            int r5 = r13.f37206d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f37206d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f37317a
            int r1 = r11.f37204b
            java.lang.Object r5 = r13.f37205c
            androidx.recyclerview.widget.a$b r0 = r0.mo52920a(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f37204b
            int r5 = r13.f37204b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f37204b = r5
            goto L41
        L2b:
            int r6 = r13.f37206d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r4 = r8.f37317a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f37205c
            androidx.recyclerview.widget.a$b r4 = r4.mo52920a(r2, r1, r5, r3)
            int r1 = r13.f37206d
            int r1 = r1 - r5
            r13.f37206d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f37206d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f37317a
            r11.mo52919b(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C4956i.m52921f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}