package p000;

import androidx.compose.p003ui.text.android.TextLayout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a90  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18999a90 {

    /* renamed from: a */
    public final TextLayout f8361a;

    /* renamed from: b */
    public int f8362b;

    /* renamed from: c */
    public float f8363c;

    public C18999a90(TextLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f8361a = layout;
        this.f8362b = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float m65173a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L1f
            androidx.compose.ui.text.android.TextLayout r2 = r5.f8361a
            android.text.Layout r2 = r2.getLayout()
            int r2 = androidx.compose.p003ui.text.android.LayoutCompatKt.getLineForOffset(r2, r6, r7)
            androidx.compose.ui.text.android.TextLayout r3 = r5.f8361a
            int r3 = r3.getLineStart(r2)
            androidx.compose.ui.text.android.TextLayout r4 = r5.f8361a
            int r2 = r4.getLineEnd(r2)
            if (r6 == r3) goto L21
            if (r6 != r2) goto L1f
            goto L21
        L1f:
            r2 = 0
            goto L22
        L21:
            r2 = 1
        L22:
            int r3 = r6 * 4
            if (r9 == 0) goto L2a
            if (r2 == 0) goto L2f
            r0 = 0
            goto L2f
        L2a:
            if (r2 == 0) goto L2e
            r0 = 2
            goto L2f
        L2e:
            r0 = 3
        L2f:
            int r3 = r3 + r0
            int r0 = r5.f8362b
            if (r0 != r3) goto L37
            float r6 = r5.f8363c
            return r6
        L37:
            if (r9 == 0) goto L40
            androidx.compose.ui.text.android.TextLayout r9 = r5.f8361a
            float r6 = r9.getPrimaryHorizontal(r6, r7)
            goto L46
        L40:
            androidx.compose.ui.text.android.TextLayout r9 = r5.f8361a
            float r6 = r9.getSecondaryHorizontal(r6, r7)
        L46:
            if (r8 == 0) goto L4c
            r5.f8362b = r3
            r5.f8363c = r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C18999a90.m65173a(int, boolean, boolean, boolean):float");
    }

    /* renamed from: b */
    public final float m65172b(int i) {
        return m65173a(i, false, false, true);
    }

    /* renamed from: c */
    public final float m65171c(int i) {
        return m65173a(i, true, true, true);
    }

    /* renamed from: d */
    public final float m65170d(int i) {
        return m65173a(i, false, false, false);
    }

    /* renamed from: e */
    public final float m65169e(int i) {
        return m65173a(i, true, true, false);
    }
}