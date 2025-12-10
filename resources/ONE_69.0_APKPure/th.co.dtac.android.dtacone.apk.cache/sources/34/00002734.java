package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalFoundationApi
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0010J6\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0004\u0012\u00020\b0\fH&J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u0004H¦\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m29142d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList;", "T", "", "size", "", "getSize", "()I", "forEach", "", "fromIndex", "toIndex", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "get", FirebaseAnalytics.Param.INDEX, "Interval", "Landroidx/compose/foundation/lazy/layout/MutableIntervalList;", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public interface IntervalList<T> {

    @StabilityInferred(parameters = 1)
    @Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m29142d2 = {"Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "T", "", "", "startIndex", "size", "value", "<init>", "(IILjava/lang/Object;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getStartIndex", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSize", OperatorName.CURVE_TO, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nIntervalList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntervalList.kt\nandroidx/compose/foundation/lazy/layout/IntervalList$Interval\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
    /* loaded from: classes.dex */
    public static final class Interval<T> {
        public static final int $stable = 0;

        /* renamed from: a */
        public final int f13693a;

        /* renamed from: b */
        public final int f13694b;

        /* renamed from: c */
        public final Object f13695c;

        public Interval(int i, int i2, T t) {
            this.f13693a = i;
            this.f13694b = i2;
            this.f13695c = t;
            if (i >= 0) {
                if (i2 > 0) {
                    return;
                }
                throw new IllegalArgumentException(("size should be >0, but was " + i2).toString());
            }
            throw new IllegalArgumentException(("startIndex should be >= 0, but was " + i).toString());
        }

        public final int getSize() {
            return this.f13694b;
        }

        public final int getStartIndex() {
            return this.f13693a;
        }

        public final T getValue() {
            return (T) this.f13695c;
        }
    }

    void forEach(int i, int i2, @NotNull Function1<? super Interval<? extends T>, Unit> function1);

    @NotNull
    Interval<T> get(int i);

    int getSize();
}