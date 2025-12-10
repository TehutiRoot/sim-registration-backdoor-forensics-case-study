package androidx.compose.p003ui.node;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a]\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a]\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010(\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28850d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", PDPrintFieldAttributeObject.ROLE_CB, "Lkf0;", OperatorName.CURVE_TO, "(IILandroidx/compose/ui/node/DiffCallback;)Lkf0;", "diagonals", "callback", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lkf0;Landroidx/compose/ui/node/DiffCallback;)V", "executeDiff", "(IILandroidx/compose/ui/node/DiffCallback;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Lvm;", "forward", "backward", "", "snake", "", "e", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "d", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "startX", "startY", "endX", "endY", "reverse", "data", "fillSnake", "(IIIIZ[I)V", "i", OperatorName.SET_LINE_JOINSTYLE, OperatorName.FILL_NON_ZERO, "([III)V", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.MyersDiffKt */
/* loaded from: classes2.dex */
public final class MyersDiffKt {
    /* renamed from: a */
    public static final void m59438a(C20760kf0 c20760kf0, DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < c20760kf0.m28899c()) {
            int i4 = i + 2;
            int m28900b = c20760kf0.m28900b(i) - c20760kf0.m28900b(i4);
            int m28900b2 = c20760kf0.m28900b(i + 1) - c20760kf0.m28900b(i4);
            int m28900b3 = c20760kf0.m28900b(i4);
            i += 3;
            while (i2 < m28900b) {
                diffCallback.remove(i3, i2);
                i2++;
            }
            while (i3 < m28900b2) {
                diffCallback.insert(i3);
                i3++;
            }
            while (true) {
                int i5 = m28900b3 - 1;
                if (m28900b3 > 0) {
                    diffCallback.same(i2, i3);
                    i2++;
                    i3++;
                    m28900b3 = i5;
                }
            }
        }
    }

    /* renamed from: b */
    public static final boolean m59437b(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int m1004b;
        int i6;
        int i7;
        int i8;
        int i9 = (i2 - i) - (i4 - i3);
        if (i9 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int i10 = -i5;
        for (int i11 = i10; i11 <= i5; i11 += 2) {
            if (i11 != i10 && (i11 == i5 || AbstractC16916vm.m1004b(iArr2, i11 + 1) >= AbstractC16916vm.m1004b(iArr2, i11 - 1))) {
                m1004b = AbstractC16916vm.m1004b(iArr2, i11 - 1);
                i6 = m1004b - 1;
            } else {
                m1004b = AbstractC16916vm.m1004b(iArr2, i11 + 1);
                i6 = m1004b;
            }
            int i12 = i4 - ((i2 - i6) - i11);
            if (i5 != 0 && i6 == m1004b) {
                i7 = i12 + 1;
            } else {
                i7 = i12;
            }
            while (i6 > i && i12 > i3) {
                if (!diffCallback.areItemsTheSame(i6 - 1, i12 - 1)) {
                    break;
                }
                i6--;
                i12--;
            }
            AbstractC16916vm.m1002d(iArr2, i11, i6);
            if (z && (i8 = i9 - i11) >= i10 && i8 <= i5) {
                if (AbstractC16916vm.m1004b(iArr, i8) >= i6) {
                    fillSnake(i6, i12, m1004b, i7, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final C20760kf0 m59436c(int i, int i2, DiffCallback diffCallback) {
        int i3 = ((i + i2) + 1) / 2;
        C20760kf0 c20760kf0 = new C20760kf0(i3 * 3);
        C20760kf0 c20760kf02 = new C20760kf0(i3 * 4);
        c20760kf02.m28894h(0, i, 0, i2);
        int i4 = (i3 * 2) + 1;
        int[] m1005a = AbstractC16916vm.m1005a(new int[i4]);
        int[] m1005a2 = AbstractC16916vm.m1005a(new int[i4]);
        int[] m65872b = VJ1.m65872b(new int[5]);
        while (c20760kf02.m28898d()) {
            int m28896f = c20760kf02.m28896f();
            int m28896f2 = c20760kf02.m28896f();
            int m28896f3 = c20760kf02.m28896f();
            int m28896f4 = c20760kf02.m28896f();
            int[] iArr = m1005a;
            int[] iArr2 = m1005a2;
            if (m59434e(m28896f4, m28896f3, m28896f2, m28896f, diffCallback, m1005a, m1005a2, m65872b)) {
                if (VJ1.m65871c(m65872b) > 0) {
                    VJ1.m65873a(m65872b, c20760kf0);
                }
                c20760kf02.m28894h(m28896f4, VJ1.m65866h(m65872b), m28896f2, VJ1.m65865i(m65872b));
                c20760kf02.m28894h(VJ1.m65870d(m65872b), m28896f3, VJ1.m65869e(m65872b), m28896f);
            }
            m1005a = iArr;
            m1005a2 = iArr2;
        }
        c20760kf0.m28892j();
        c20760kf0.m28895g(i, i2, 0);
        return c20760kf0;
    }

    /* renamed from: d */
    public static final boolean m59435d(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i5, int[] iArr3) {
        boolean z;
        int m1004b;
        int i6;
        int i7;
        int i8 = (i2 - i) - (i4 - i3);
        if (Math.abs(i8) % 2 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i9 = -i5;
        for (int i10 = i9; i10 <= i5; i10 += 2) {
            if (i10 != i9 && (i10 == i5 || AbstractC16916vm.m1004b(iArr, i10 + 1) <= AbstractC16916vm.m1004b(iArr, i10 - 1))) {
                m1004b = AbstractC16916vm.m1004b(iArr, i10 - 1);
                i6 = m1004b + 1;
            } else {
                m1004b = AbstractC16916vm.m1004b(iArr, i10 + 1);
                i6 = m1004b;
            }
            int i11 = (i3 + (i6 - i)) - i10;
            int i12 = (i5 != 0 && i6 == m1004b) ? i11 - 1 : i11;
            while (i6 < i2 && i11 < i4) {
                if (!diffCallback.areItemsTheSame(i6, i11)) {
                    break;
                }
                i6++;
                i11++;
            }
            AbstractC16916vm.m1002d(iArr, i10, i6);
            if (z && (i7 = i8 - i10) >= i9 + 1 && i7 <= i5 - 1) {
                if (AbstractC16916vm.m1004b(iArr2, i7) <= i6) {
                    fillSnake(m1004b, i12, i6, i11, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m59434e(int i, int i2, int i3, int i4, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i5 = i2 - i;
        int i6 = i4 - i3;
        if (i5 >= 1 && i6 >= 1) {
            int i7 = ((i5 + i6) + 1) / 2;
            AbstractC16916vm.m1002d(iArr, 1, i);
            AbstractC16916vm.m1002d(iArr2, 1, i2);
            int i8 = 0;
            while (i8 < i7) {
                int i9 = i8;
                if (m59435d(i, i2, i3, i4, diffCallback, iArr, iArr2, i8, iArr3) || m59437b(i, i2, i3, i4, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i8 = i9 + 1;
            }
        }
        return false;
    }

    public static final void executeDiff(int i, int i2, @NotNull DiffCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        m59438a(m59436c(i, i2, callback), callback);
    }

    /* renamed from: f */
    public static final void m59433f(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static final void fillSnake(int i, int i2, int i3, int i4, boolean z, @NotNull int[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        data[0] = i;
        data[1] = i2;
        data[2] = i3;
        data[3] = i4;
        data[4] = z ? 1 : 0;
    }
}
