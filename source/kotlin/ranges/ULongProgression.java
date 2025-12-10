package kotlin.ranges;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Iterator;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.WasExperimental;
import kotlin.internal.UProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.5")
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\u0082\u0002\u0004\n\u0002\b!¨\u0006$"}, m28850d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", "start", "endInclusive", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "iterator", "()Ljava/util/Iterator;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getFirst-s-VKNKU", "()J", "first", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLast-s-VKNKU", "last", OperatorName.CURVE_TO, "getStep", "Companion", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0})
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
/* loaded from: classes5.dex */
public class ULongProgression implements Iterable<ULong>, KMappedMarker {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final long f68332a;

    /* renamed from: b */
    public final long f68333b;

    /* renamed from: c */
    public final long f68334c;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, m28849k = 1, m28848mv = {1, 9, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: fromClosedRange-7ftBX0g  reason: not valid java name */
        public final ULongProgression m74471fromClosedRange7ftBX0g(long j, long j2, long j3) {
            return new ULongProgression(j, j2, j3, null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ ULongProgression(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ULongProgression) {
            if (!isEmpty() || !((ULongProgression) obj).isEmpty()) {
                ULongProgression uLongProgression = (ULongProgression) obj;
                if (this.f68332a != uLongProgression.f68332a || this.f68333b != uLongProgression.f68333b || this.f68334c != uLongProgression.f68334c) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: getFirst-s-VKNKU  reason: not valid java name */
    public final long m74469getFirstsVKNKU() {
        return this.f68332a;
    }

    /* renamed from: getLast-s-VKNKU  reason: not valid java name */
    public final long m74470getLastsVKNKU() {
        return this.f68333b;
    }

    public final long getStep() {
        return this.f68334c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f68332a;
        long j2 = this.f68333b;
        long j3 = this.f68334c;
        return ((int) (j3 ^ (j3 >>> 32))) + (((((int) ULong.m74146constructorimpl(j ^ ULong.m74146constructorimpl(j >>> 32))) * 31) + ((int) ULong.m74146constructorimpl(j2 ^ ULong.m74146constructorimpl(j2 >>> 32)))) * 31);
    }

    public boolean isEmpty() {
        int compare;
        int i = (this.f68334c > 0L ? 1 : (this.f68334c == 0L ? 0 : -1));
        compare = Long.compare(this.f68332a ^ Long.MIN_VALUE, this.f68333b ^ Long.MIN_VALUE);
        if (i > 0) {
            if (compare <= 0) {
                return false;
            }
        } else if (compare >= 0) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<ULong> iterator() {
        return new KW1(this.f68332a, this.f68333b, this.f68334c, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.f68334c > 0) {
            sb = new StringBuilder();
            sb.append((Object) ULong.m74150toStringimpl(this.f68332a));
            sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb.append((Object) ULong.m74150toStringimpl(this.f68333b));
            sb.append(" step ");
            j = this.f68334c;
        } else {
            sb = new StringBuilder();
            sb.append((Object) ULong.m74150toStringimpl(this.f68332a));
            sb.append(" downTo ");
            sb.append((Object) ULong.m74150toStringimpl(this.f68333b));
            sb.append(" step ");
            j = -this.f68334c;
        }
        sb.append(j);
        return sb.toString();
    }

    public ULongProgression(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 != Long.MIN_VALUE) {
            this.f68332a = j;
            this.f68333b = UProgressionUtilKt.m74450getProgressionLastElement7ftBX0g(j, j2, j3);
            this.f68334c = j3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
}
