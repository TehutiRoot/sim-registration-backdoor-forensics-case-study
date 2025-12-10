package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Immutable
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001]B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J8\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\"J\u001a\u0010)\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010,\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\"R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010,\u0012\u0004\b5\u0010/\u001a\u0004\b4\u0010\"R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010,\u0012\u0004\b8\u0010/\u001a\u0004\b7\u0010\"R\u001a\u0010;\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010/\u001a\u0004\b9\u0010\"R\u001a\u0010>\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010/\u001a\u0004\b<\u0010\"R#\u0010C\u001a\u00020?8FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\bB\u0010/\u001a\u0004\b@\u0010AR\u001a\u0010D\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010/\u001a\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bG\u0010\"R\u0011\u0010J\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010\"R\u001a\u0010L\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bK\u0010AR\u001a\u0010N\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bM\u0010AR\u001a\u0010P\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bO\u0010AR\u001a\u0010R\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010AR\u001a\u0010T\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010AR\u001a\u0010V\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bU\u0010AR\u001a\u0010X\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u0010AR\u001a\u0010Z\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bY\u0010AR\u001a\u0010\\\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010A\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006^"}, m28850d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "Landroidx/compose/ui/unit/IntOffset;", TypedValues.CycleType.S_WAVE_OFFSET, "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", "translate", "translateX", "translateY", "(II)Landroidx/compose/ui/unit/IntRect;", "delta", "inflate", "(I)Landroidx/compose/ui/unit/IntRect;", "deflate", "other", "intersect", "(Landroidx/compose/ui/unit/IntRect;)Landroidx/compose/ui/unit/IntRect;", "", "overlaps", "(Landroidx/compose/ui/unit/IntRect;)Z", "contains--gyyYBs", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Landroidx/compose/ui/unit/IntRect;", "hashCode", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getLeft", "getLeft$annotations", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop", "getTop$annotations", OperatorName.CURVE_TO, "getRight", "getRight$annotations", "d", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "getSize-YbymL2g$annotations", "size", "isEmpty", "()Z", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-nOcc-ac", "topLeft", "getTopCenter-nOcc-ac", "topCenter", "getTopRight-nOcc-ac", "topRight", "getCenterLeft-nOcc-ac", "centerLeft", "getCenter-nOcc-ac", Constant.VIEW_CENTER, "getCenterRight-nOcc-ac", "centerRight", "getBottomLeft-nOcc-ac", "bottomLeft", "getBottomCenter-nOcc-ac", "bottomCenter", "getBottomRight-nOcc-ac", "bottomRight", "Companion", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.unit.IntRect */
/* loaded from: classes2.dex */
public final class IntRect {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final IntRect f31760e = new IntRect(0, 0, 0, 0);

    /* renamed from: a */
    public final int f31761a;

    /* renamed from: b */
    public final int f31762b;

    /* renamed from: c */
    public final int f31763c;

    /* renamed from: d */
    public final int f31764d;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "ui-unit_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.unit.IntRect$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final IntRect getZero() {
            return IntRect.f31760e;
        }

        public Companion() {
        }
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.f31761a = i;
        this.f31762b = i2;
        this.f31763c = i3;
        this.f31764d = i4;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = intRect.f31761a;
        }
        if ((i5 & 2) != 0) {
            i2 = intRect.f31762b;
        }
        if ((i5 & 4) != 0) {
            i3 = intRect.f31763c;
        }
        if ((i5 & 8) != 0) {
            i4 = intRect.f31764d;
        }
        return intRect.copy(i, i2, i3, i4);
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getRight$annotations() {
    }

    @Stable
    /* renamed from: getSize-YbymL2g$annotations */
    public static /* synthetic */ void m73794getSizeYbymL2g$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Stable
    public static /* synthetic */ void isEmpty$annotations() {
    }

    public final int component1() {
        return this.f31761a;
    }

    public final int component2() {
        return this.f31762b;
    }

    public final int component3() {
        return this.f31763c;
    }

    public final int component4() {
        return this.f31764d;
    }

    /* renamed from: contains--gyyYBs */
    public final boolean m73795containsgyyYBs(long j) {
        if (IntOffset.m73776getXimpl(j) >= this.f31761a && IntOffset.m73776getXimpl(j) < this.f31763c && IntOffset.m73777getYimpl(j) >= this.f31762b && IntOffset.m73777getYimpl(j) < this.f31764d) {
            return true;
        }
        return false;
    }

    @NotNull
    public final IntRect copy(int i, int i2, int i3, int i4) {
        return new IntRect(i, i2, i3, i4);
    }

    @Stable
    @NotNull
    public final IntRect deflate(int i) {
        return inflate(-i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntRect) {
            IntRect intRect = (IntRect) obj;
            return this.f31761a == intRect.f31761a && this.f31762b == intRect.f31762b && this.f31763c == intRect.f31763c && this.f31764d == intRect.f31764d;
        }
        return false;
    }

    public final int getBottom() {
        return this.f31764d;
    }

    /* renamed from: getBottomCenter-nOcc-ac */
    public final long m73796getBottomCenternOccac() {
        return IntOffsetKt.IntOffset(this.f31761a + (getWidth() / 2), this.f31764d);
    }

    /* renamed from: getBottomLeft-nOcc-ac */
    public final long m73797getBottomLeftnOccac() {
        return IntOffsetKt.IntOffset(this.f31761a, this.f31764d);
    }

    /* renamed from: getBottomRight-nOcc-ac */
    public final long m73798getBottomRightnOccac() {
        return IntOffsetKt.IntOffset(this.f31763c, this.f31764d);
    }

    /* renamed from: getCenter-nOcc-ac */
    public final long m73799getCenternOccac() {
        return IntOffsetKt.IntOffset(this.f31761a + (getWidth() / 2), this.f31762b + (getHeight() / 2));
    }

    /* renamed from: getCenterLeft-nOcc-ac */
    public final long m73800getCenterLeftnOccac() {
        return IntOffsetKt.IntOffset(this.f31761a, this.f31762b + (getHeight() / 2));
    }

    /* renamed from: getCenterRight-nOcc-ac */
    public final long m73801getCenterRightnOccac() {
        return IntOffsetKt.IntOffset(this.f31763c, this.f31762b + (getHeight() / 2));
    }

    public final int getHeight() {
        return this.f31764d - this.f31762b;
    }

    public final int getLeft() {
        return this.f31761a;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.f31763c;
    }

    /* renamed from: getSize-YbymL2g */
    public final long m73802getSizeYbymL2g() {
        return IntSizeKt.IntSize(getWidth(), getHeight());
    }

    public final int getTop() {
        return this.f31762b;
    }

    /* renamed from: getTopCenter-nOcc-ac */
    public final long m73803getTopCenternOccac() {
        return IntOffsetKt.IntOffset(this.f31761a + (getWidth() / 2), this.f31762b);
    }

    /* renamed from: getTopLeft-nOcc-ac */
    public final long m73804getTopLeftnOccac() {
        return IntOffsetKt.IntOffset(this.f31761a, this.f31762b);
    }

    /* renamed from: getTopRight-nOcc-ac */
    public final long m73805getTopRightnOccac() {
        return IntOffsetKt.IntOffset(this.f31763c, this.f31762b);
    }

    public final int getWidth() {
        return this.f31763c - this.f31761a;
    }

    public int hashCode() {
        return (((((this.f31761a * 31) + this.f31762b) * 31) + this.f31763c) * 31) + this.f31764d;
    }

    @Stable
    @NotNull
    public final IntRect inflate(int i) {
        return new IntRect(this.f31761a - i, this.f31762b - i, this.f31763c + i, this.f31764d + i);
    }

    @Stable
    @NotNull
    public final IntRect intersect(@NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new IntRect(Math.max(this.f31761a, other.f31761a), Math.max(this.f31762b, other.f31762b), Math.min(this.f31763c, other.f31763c), Math.min(this.f31764d, other.f31764d));
    }

    public final boolean isEmpty() {
        if (this.f31761a < this.f31763c && this.f31762b < this.f31764d) {
            return false;
        }
        return true;
    }

    public final boolean overlaps(@NotNull IntRect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f31763c <= other.f31761a || other.f31763c <= this.f31761a || this.f31764d <= other.f31762b || other.f31764d <= this.f31762b) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "IntRect.fromLTRB(" + this.f31761a + ", " + this.f31762b + ", " + this.f31763c + ", " + this.f31764d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Stable
    @NotNull
    public final IntRect translate(int i, int i2) {
        return new IntRect(this.f31761a + i, this.f31762b + i2, this.f31763c + i, this.f31764d + i2);
    }

    @Stable
    @NotNull
    /* renamed from: translate--gyyYBs */
    public final IntRect m73806translategyyYBs(long j) {
        return new IntRect(this.f31761a + IntOffset.m73776getXimpl(j), this.f31762b + IntOffset.m73777getYimpl(j), this.f31763c + IntOffset.m73776getXimpl(j), this.f31764d + IntOffset.m73777getYimpl(j));
    }
}
