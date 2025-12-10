package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u0013¨\u0006!"}, m28850d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "Lkotlin/collections/IntIterator;", "iterator", "()Lkotlin/collections/IntIterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getFirst", "first", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLast", "last", OperatorName.CURVE_TO, "getStep", "Companion", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class IntProgression implements Iterable<Integer>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int f68312a;

    /* renamed from: b */
    public final int f68313b;

    /* renamed from: c */
    public final int f68314c;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, m28850d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntProgression fromClosedRange(int i, int i2, int i3) {
            return new IntProgression(i, i2, i3);
        }

        public Companion() {
        }
    }

    public IntProgression(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.f68312a = i;
                this.f68313b = ProgressionUtilKt.getProgressionLastElement(i, i2, i3);
                this.f68314c = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof IntProgression) {
            if (!isEmpty() || !((IntProgression) obj).isEmpty()) {
                IntProgression intProgression = (IntProgression) obj;
                if (this.f68312a != intProgression.f68312a || this.f68313b != intProgression.f68313b || this.f68314c != intProgression.f68314c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int getFirst() {
        return this.f68312a;
    }

    public final int getLast() {
        return this.f68313b;
    }

    public final int getStep() {
        return this.f68314c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f68312a * 31) + this.f68313b) * 31) + this.f68314c;
    }

    public boolean isEmpty() {
        if (this.f68314c > 0) {
            if (this.f68312a <= this.f68313b) {
                return false;
            }
        } else if (this.f68312a >= this.f68313b) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f68314c > 0) {
            sb = new StringBuilder();
            sb.append(this.f68312a);
            sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb.append(this.f68313b);
            sb.append(" step ");
            i = this.f68314c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f68312a);
            sb.append(" downTo ");
            sb.append(this.f68313b);
            sb.append(" step ");
            i = -this.f68314c;
        }
        sb.append(i);
        return sb.toString();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Integer> iterator() {
        return new IntProgressionIterator(this.f68312a, this.f68313b, this.f68314c);
    }
}
