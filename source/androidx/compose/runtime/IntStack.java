package androidx.compose.runtime;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\rR\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\n¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/runtime/IntStack;", "", "<init>", "()V", "", "value", "", "push", "(I)V", "pop", "()I", "default", "peekOr", "(I)I", "peek", FirebaseAnalytics.Param.INDEX, "", "isEmpty", "()Z", "isNotEmpty", "clear", "indexOf", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "slots", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "tos", "getSize", "size", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class IntStack {

    /* renamed from: a */
    public int[] f28332a = new int[10];

    /* renamed from: b */
    public int f28333b;

    public final void clear() {
        this.f28333b = 0;
    }

    public final int getSize() {
        return this.f28333b;
    }

    public final int indexOf(int i) {
        int i2 = this.f28333b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f28332a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.f28333b == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.f28333b != 0) {
            return true;
        }
        return false;
    }

    public final int peek() {
        return this.f28332a[this.f28333b - 1];
    }

    public final int peekOr(int i) {
        if (this.f28333b > 0) {
            return peek();
        }
        return i;
    }

    public final int pop() {
        int[] iArr = this.f28332a;
        int i = this.f28333b - 1;
        this.f28333b = i;
        return iArr[i];
    }

    public final void push(int i) {
        int i2 = this.f28333b;
        int[] iArr = this.f28332a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f28332a = copyOf;
        }
        int[] iArr2 = this.f28332a;
        int i3 = this.f28333b;
        this.f28333b = i3 + 1;
        iArr2[i3] = i;
    }

    public final int peek(int i) {
        return this.f28332a[i];
    }
}
