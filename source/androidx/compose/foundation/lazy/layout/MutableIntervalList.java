package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010#¨\u0006%"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "T", "Landroidx/compose/foundation/lazy/layout/IntervalList;", "<init>", "()V", "", "size", "value", "", "addInterval", "(ILjava/lang/Object;)V", "fromIndex", "toIndex", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "block", "forEach", "(IILkotlin/jvm/functions/Function1;)V", FirebaseAnalytics.Param.INDEX, "get", "(I)Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "itemIndex", OperatorName.CURVE_TO, PDPageLabelRange.STYLE_LETTERS_LOWER, "(I)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;I)Z", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "intervals", "<set-?>", "I", "getSize", "()I", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "lastInterval", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalFoundationApi
@SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,216:1\n1182#2:217\n1161#2,2:218\n523#3:220\n523#3:221\n523#3:222\n*S KotlinDebug\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/MutableIntervalList\n*L\n98#1:217\n98#1:218,2\n150#1:220\n152#1:221\n169#1:222\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntervalList<T> implements IntervalList<T> {
    public static final int $stable = 8;

    /* renamed from: a */
    public final MutableVector f13675a = new MutableVector(new IntervalList.Interval[16], 0);

    /* renamed from: b */
    public int f13676b;

    /* renamed from: c */
    public IntervalList.Interval f13677c;

    /* renamed from: a */
    public final void m61186a(int i) {
        if (i >= 0 && i < getSize()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + ", size " + getSize());
    }

    public final void addInterval(int i, T t) {
        if (i >= 0) {
            if (i == 0) {
                return;
            }
            IntervalList.Interval interval = new IntervalList.Interval(getSize(), i, t);
            this.f13676b = getSize() + i;
            this.f13675a.add(interval);
            return;
        }
        throw new IllegalArgumentException(("size should be >=0, but was " + i).toString());
    }

    /* renamed from: b */
    public final boolean m61185b(IntervalList.Interval interval, int i) {
        int startIndex = interval.getStartIndex();
        if (i >= interval.getStartIndex() + interval.getSize() || startIndex > i) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final IntervalList.Interval m61184c(int i) {
        int m61219a;
        IntervalList.Interval interval = this.f13677c;
        if (interval == null || !m61185b(interval, i)) {
            MutableVector mutableVector = this.f13675a;
            m61219a = IntervalListKt.m61219a(mutableVector, i);
            IntervalList.Interval interval2 = (IntervalList.Interval) mutableVector.getContent()[m61219a];
            this.f13677c = interval2;
            return interval2;
        }
        return interval;
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public void forEach(int i, int i2, @NotNull Function1<? super IntervalList.Interval<? extends T>, Unit> block) {
        int m61219a;
        Intrinsics.checkNotNullParameter(block, "block");
        m61186a(i);
        m61186a(i2);
        if (i2 >= i) {
            m61219a = IntervalListKt.m61219a(this.f13675a, i);
            int startIndex = ((IntervalList.Interval) this.f13675a.getContent()[m61219a]).getStartIndex();
            while (startIndex <= i2) {
                IntervalList.Interval interval = (IntervalList.Interval) this.f13675a.getContent()[m61219a];
                block.invoke(interval);
                startIndex += interval.getSize();
                m61219a++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i2 + ") should be not smaller than fromIndex (" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    @NotNull
    public IntervalList.Interval<T> get(int i) {
        m61186a(i);
        return m61184c(i);
    }

    @Override // androidx.compose.foundation.lazy.layout.IntervalList
    public int getSize() {
        return this.f13676b;
    }
}
