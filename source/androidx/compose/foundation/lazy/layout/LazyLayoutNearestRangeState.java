package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@RX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\f\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState;", "Landroidx/compose/runtime/State;", "Lkotlin/ranges/IntRange;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "", "update", "(I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "getValue", "()Lkotlin/ranges/IntRange;", "(Lkotlin/ranges/IntRange;)V", "value", "d", "lastFirstVisibleItem", "e", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutNearestRangeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,65:1\n81#2:66\n107#2,2:67\n*S KotlinDebug\n*F\n+ 1 LazyLayoutNearestRangeState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutNearestRangeState\n*L\n31#1:66\n31#1:67,2\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutNearestRangeState implements State<IntRange> {

    /* renamed from: e */
    public static final C2931a f13645e = new C2931a(null);

    /* renamed from: a */
    public final int f13646a;

    /* renamed from: b */
    public final int f13647b;

    /* renamed from: c */
    public final MutableState f13648c;

    /* renamed from: d */
    public int f13649d;

    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState$a */
    /* loaded from: classes.dex */
    public static final class C2931a {
        public /* synthetic */ C2931a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final IntRange m61199b(int i, int i2, int i3) {
            int i4 = (i / i2) * i2;
            return AbstractC11719c.until(Math.max(i4 - i3, 0), i4 + i2 + i3);
        }

        public C2931a() {
        }
    }

    public LazyLayoutNearestRangeState(int i, int i2, int i3) {
        this.f13646a = i2;
        this.f13647b = i3;
        this.f13648c = SnapshotStateKt.mutableStateOf(f13645e.m61199b(i, i2, i3), SnapshotStateKt.structuralEqualityPolicy());
        this.f13649d = i;
    }

    /* renamed from: a */
    public final void m61201a(IntRange intRange) {
        this.f13648c.setValue(intRange);
    }

    public final void update(int i) {
        if (i != this.f13649d) {
            this.f13649d = i;
            m61201a(f13645e.m61199b(i, this.f13646a, this.f13647b));
        }
    }

    @Override // androidx.compose.runtime.State
    @NotNull
    public IntRange getValue() {
        return (IntRange) this.f13648c.getValue();
    }
}
