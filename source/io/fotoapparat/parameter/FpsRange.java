package io.fotoapparat.parameter;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000fR\u0014\u0010\"\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010\r¨\u0006&"}, m28850d2 = {"Lio/fotoapparat/parameter/FpsRange;", "Lio/fotoapparat/parameter/Parameter;", "Lkotlin/ranges/ClosedRange;", "", "min", "max", "<init>", "(II)V", "value", "", "contains", "(I)Z", "isEmpty", "()Z", "component1", "()I", "component2", "copy", "(II)Lio/fotoapparat/parameter/FpsRange;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getMin", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMax", "getEndInclusive", "()Ljava/lang/Integer;", "endInclusive", "getStart", "start", "isFixed", "fotoapparat_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class FpsRange implements Parameter, ClosedRange<Integer> {

    /* renamed from: a */
    public final int f62999a;

    /* renamed from: b */
    public final int f63000b;

    /* renamed from: c */
    public final /* synthetic */ IntRange f63001c;

    public FpsRange(int i, int i2) {
        this.f62999a = i;
        this.f63000b = i2;
        this.f63001c = new IntRange(i, i2);
    }

    public static /* synthetic */ FpsRange copy$default(FpsRange fpsRange, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fpsRange.f62999a;
        }
        if ((i3 & 2) != 0) {
            i2 = fpsRange.f63000b;
        }
        return fpsRange.copy(i, i2);
    }

    public final int component1() {
        return this.f62999a;
    }

    public final int component2() {
        return this.f63000b;
    }

    public boolean contains(int i) {
        return this.f63001c.contains(i);
    }

    @NotNull
    public final FpsRange copy(int i, int i2) {
        return new FpsRange(i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FpsRange) {
            FpsRange fpsRange = (FpsRange) obj;
            return this.f62999a == fpsRange.f62999a && this.f63000b == fpsRange.f63000b;
        }
        return false;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Integer getEndInclusive() {
        return this.f63001c.getEndInclusive();
    }

    public final int getMax() {
        return this.f63000b;
    }

    public final int getMin() {
        return this.f62999a;
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Integer getStart() {
        return this.f63001c.getStart();
    }

    public int hashCode() {
        return (this.f62999a * 31) + this.f63000b;
    }

    @Override // kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return this.f63001c.isEmpty();
    }

    public final boolean isFixed() {
        if (this.f63000b == this.f62999a) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        int i = this.f62999a;
        int i2 = this.f63000b;
        return "FpsRange(min=" + i + ", max=" + i2 + ")";
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ boolean contains(Integer num) {
        return contains(num.intValue());
    }
}
