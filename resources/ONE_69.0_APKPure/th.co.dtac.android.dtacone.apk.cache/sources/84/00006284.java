package androidx.compose.p003ui.node;

import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m29142d2 = {"Landroidx/compose/ui/node/NestedVectorStack;", "T", "", "<init>", "()V", "", "isNotEmpty", "()Z", "pop", "()Ljava/lang/Object;", "Landroidx/compose/runtime/collection/MutableVector;", "vector", "", "push", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)V", "I", "current", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "lastIndex", "", OperatorName.CURVE_TO, "[I", "indexes", "d", "Landroidx/compose/runtime/collection/MutableVector;", "vectors", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestedVectorStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,57:1\n1182#2:58\n1161#2,2:59\n523#3:61\n523#3:62\n*S KotlinDebug\n*F\n+ 1 NestedVectorStack.kt\nandroidx/compose/ui/node/NestedVectorStack\n*L\n26#1:58\n26#1:59,2\n41#1:61\n47#1:62\n*E\n"})
/* renamed from: androidx.compose.ui.node.NestedVectorStack */
/* loaded from: classes2.dex */
public final class NestedVectorStack<T> {

    /* renamed from: b */
    public int f30457b;

    /* renamed from: a */
    public int f30456a = -1;

    /* renamed from: c */
    public int[] f30458c = new int[16];

    /* renamed from: d */
    public final MutableVector f30459d = new MutableVector(new MutableVector[16], 0);

    /* renamed from: a */
    public final void m59382a(int i) {
        int i2 = this.f30457b;
        int[] iArr = this.f30458c;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f30458c = copyOf;
        }
        int[] iArr2 = this.f30458c;
        int i3 = this.f30457b;
        this.f30457b = i3 + 1;
        iArr2[i3] = i;
    }

    public final boolean isNotEmpty() {
        int i = this.f30456a;
        if (i >= 0 && this.f30458c[i] >= 0) {
            return true;
        }
        return false;
    }

    public final T pop() {
        int[] iArr;
        int i = this.f30456a;
        int i2 = this.f30458c[i];
        MutableVector mutableVector = (MutableVector) this.f30459d.getContent()[i];
        if (i2 > 0) {
            this.f30458c[i] = iArr[i] - 1;
        } else if (i2 == 0) {
            this.f30459d.removeAt(i);
            this.f30456a--;
        }
        return (T) mutableVector.getContent()[i2];
    }

    public final void push(@NotNull MutableVector<T> vector) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        if (vector.isNotEmpty()) {
            this.f30459d.add(vector);
            m59382a(vector.getSize() - 1);
            this.f30456a++;
        }
    }
}