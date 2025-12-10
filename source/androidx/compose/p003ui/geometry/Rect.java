package androidx.compose.p003ui.geometry;

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
@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 c2\u00020\u0001:\u0001cB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\"J8\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\"R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010.\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\"R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010\"R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010.\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010\"R\u001a\u0010=\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u00101\u001a\u0004\b;\u0010\"R\u001a\u0010@\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010\"R#\u0010E\u001a\u00020A8FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\bD\u00101\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bH\u00101\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u00101\u001a\u0004\bI\u0010GR\u001a\u0010K\u001a\u00020\u00188FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u00101\u001a\u0004\bK\u0010GR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\"R\u0011\u0010P\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bO\u0010\"R\u001a\u0010R\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bQ\u0010CR\u001a\u0010T\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bS\u0010CR\u001a\u0010V\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bU\u0010CR\u001a\u0010X\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bW\u0010CR\u001a\u0010Z\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bY\u0010CR\u001a\u0010\\\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b[\u0010CR\u001a\u0010^\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b]\u0010CR\u001a\u0010`\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b_\u0010CR\u001a\u0010b\u001a\u00020\t8Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\ba\u0010C\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006d"}, m28850d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "", "left", "top", "right", "bottom", "<init>", "(FFFF)V", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translate", "translateX", "translateY", "(FF)Landroidx/compose/ui/geometry/Rect;", "delta", "inflate", "(F)Landroidx/compose/ui/geometry/Rect;", "deflate", "other", "intersect", "(Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "", "overlaps", "(Landroidx/compose/ui/geometry/Rect;)Z", "contains-k-4lQ0M", "(J)Z", "contains", "", "toString", "()Ljava/lang/String;", "component1", "()F", "component2", "component3", "component4", "copy", "(FFFF)Landroidx/compose/ui/geometry/Rect;", "", "hashCode", "()I", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getLeft", "getLeft$annotations", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTop", "getTop$annotations", OperatorName.CURVE_TO, "getRight", "getRight$annotations", "d", "getBottom", "getBottom$annotations", "getWidth", "getWidth$annotations", "width", "getHeight", "getHeight$annotations", "height", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getSize-NH-jbRc$annotations", "size", "isInfinite", "()Z", "isInfinite$annotations", "isFinite", "isFinite$annotations", "isEmpty", "isEmpty$annotations", "getMinDimension", "minDimension", "getMaxDimension", "maxDimension", "getTopLeft-F1C5BW0", "topLeft", "getTopCenter-F1C5BW0", "topCenter", "getTopRight-F1C5BW0", "topRight", "getCenterLeft-F1C5BW0", "centerLeft", "getCenter-F1C5BW0", Constant.VIEW_CENTER, "getCenterRight-F1C5BW0", "centerRight", "getBottomLeft-F1C5BW0", "bottomLeft", "getBottomCenter-F1C5BW0", "bottomCenter", "getBottomRight-F1C5BW0", "bottomRight", "Companion", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.geometry.Rect */
/* loaded from: classes2.dex */
public final class Rect {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    public static final Rect f28951e = new Rect(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a */
    public final float f28952a;

    /* renamed from: b */
    public final float f28953b;

    /* renamed from: c */
    public final float f28954c;

    /* renamed from: d */
    public final float f28955d;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28850d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.geometry.Rect$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Stable
        public static /* synthetic */ void getZero$annotations() {
        }

        @NotNull
        public final Rect getZero() {
            return Rect.f28951e;
        }

        public Companion() {
        }
    }

    public Rect(float f, float f2, float f3, float f4) {
        this.f28952a = f;
        this.f28953b = f2;
        this.f28954c = f3;
        this.f28955d = f4;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = rect.f28952a;
        }
        if ((i & 2) != 0) {
            f2 = rect.f28953b;
        }
        if ((i & 4) != 0) {
            f3 = rect.f28954c;
        }
        if ((i & 8) != 0) {
            f4 = rect.f28955d;
        }
        return rect.copy(f, f2, f3, f4);
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
    /* renamed from: getSize-NH-jbRc$annotations */
    public static /* synthetic */ void m71527getSizeNHjbRc$annotations() {
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

    @Stable
    public static /* synthetic */ void isFinite$annotations() {
    }

    @Stable
    public static /* synthetic */ void isInfinite$annotations() {
    }

    public final float component1() {
        return this.f28952a;
    }

    public final float component2() {
        return this.f28953b;
    }

    public final float component3() {
        return this.f28954c;
    }

    public final float component4() {
        return this.f28955d;
    }

    /* renamed from: contains-k-4lQ0M */
    public final boolean m71528containsk4lQ0M(long j) {
        if (Offset.m71502getXimpl(j) >= this.f28952a && Offset.m71502getXimpl(j) < this.f28954c && Offset.m71503getYimpl(j) >= this.f28953b && Offset.m71503getYimpl(j) < this.f28955d) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Rect copy(float f, float f2, float f3, float f4) {
        return new Rect(f, f2, f3, f4);
    }

    @Stable
    @NotNull
    public final Rect deflate(float f) {
        return inflate(-f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            return Float.compare(this.f28952a, rect.f28952a) == 0 && Float.compare(this.f28953b, rect.f28953b) == 0 && Float.compare(this.f28954c, rect.f28954c) == 0 && Float.compare(this.f28955d, rect.f28955d) == 0;
        }
        return false;
    }

    public final float getBottom() {
        return this.f28955d;
    }

    /* renamed from: getBottomCenter-F1C5BW0 */
    public final long m71529getBottomCenterF1C5BW0() {
        return OffsetKt.Offset(this.f28952a + (getWidth() / 2.0f), this.f28955d);
    }

    /* renamed from: getBottomLeft-F1C5BW0 */
    public final long m71530getBottomLeftF1C5BW0() {
        return OffsetKt.Offset(this.f28952a, this.f28955d);
    }

    /* renamed from: getBottomRight-F1C5BW0 */
    public final long m71531getBottomRightF1C5BW0() {
        return OffsetKt.Offset(this.f28954c, this.f28955d);
    }

    /* renamed from: getCenter-F1C5BW0 */
    public final long m71532getCenterF1C5BW0() {
        return OffsetKt.Offset(this.f28952a + (getWidth() / 2.0f), this.f28953b + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterLeft-F1C5BW0 */
    public final long m71533getCenterLeftF1C5BW0() {
        return OffsetKt.Offset(this.f28952a, this.f28953b + (getHeight() / 2.0f));
    }

    /* renamed from: getCenterRight-F1C5BW0 */
    public final long m71534getCenterRightF1C5BW0() {
        return OffsetKt.Offset(this.f28954c, this.f28953b + (getHeight() / 2.0f));
    }

    public final float getHeight() {
        return this.f28955d - this.f28953b;
    }

    public final float getLeft() {
        return this.f28952a;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final float getRight() {
        return this.f28954c;
    }

    /* renamed from: getSize-NH-jbRc */
    public final long m71535getSizeNHjbRc() {
        return SizeKt.Size(getWidth(), getHeight());
    }

    public final float getTop() {
        return this.f28953b;
    }

    /* renamed from: getTopCenter-F1C5BW0 */
    public final long m71536getTopCenterF1C5BW0() {
        return OffsetKt.Offset(this.f28952a + (getWidth() / 2.0f), this.f28953b);
    }

    /* renamed from: getTopLeft-F1C5BW0 */
    public final long m71537getTopLeftF1C5BW0() {
        return OffsetKt.Offset(this.f28952a, this.f28953b);
    }

    /* renamed from: getTopRight-F1C5BW0 */
    public final long m71538getTopRightF1C5BW0() {
        return OffsetKt.Offset(this.f28954c, this.f28953b);
    }

    public final float getWidth() {
        return this.f28954c - this.f28952a;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f28952a) * 31) + Float.floatToIntBits(this.f28953b)) * 31) + Float.floatToIntBits(this.f28954c)) * 31) + Float.floatToIntBits(this.f28955d);
    }

    @Stable
    @NotNull
    public final Rect inflate(float f) {
        return new Rect(this.f28952a - f, this.f28953b - f, this.f28954c + f, this.f28955d + f);
    }

    @Stable
    @NotNull
    public final Rect intersect(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return new Rect(Math.max(this.f28952a, other.f28952a), Math.max(this.f28953b, other.f28953b), Math.min(this.f28954c, other.f28954c), Math.min(this.f28955d, other.f28955d));
    }

    public final boolean isEmpty() {
        if (this.f28952a < this.f28954c && this.f28953b < this.f28955d) {
            return false;
        }
        return true;
    }

    public final boolean isFinite() {
        float f = this.f28952a;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f2 = this.f28953b;
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                float f3 = this.f28954c;
                if (!Float.isInfinite(f3) && !Float.isNaN(f3)) {
                    float f4 = this.f28955d;
                    if (!Float.isInfinite(f4) && !Float.isNaN(f4)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean isInfinite() {
        if (this.f28952a < Float.POSITIVE_INFINITY && this.f28953b < Float.POSITIVE_INFINITY && this.f28954c < Float.POSITIVE_INFINITY && this.f28955d < Float.POSITIVE_INFINITY) {
            return false;
        }
        return true;
    }

    public final boolean overlaps(@NotNull Rect other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (this.f28954c <= other.f28952a || other.f28954c <= this.f28952a || this.f28955d <= other.f28953b || other.f28955d <= this.f28953b) {
            return false;
        }
        return true;
    }

    @NotNull
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.f28952a, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28953b, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28954c, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28955d, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Stable
    @NotNull
    public final Rect translate(float f, float f2) {
        return new Rect(this.f28952a + f, this.f28953b + f2, this.f28954c + f, this.f28955d + f2);
    }

    @Stable
    @NotNull
    /* renamed from: translate-k-4lQ0M */
    public final Rect m71539translatek4lQ0M(long j) {
        return new Rect(this.f28952a + Offset.m71502getXimpl(j), this.f28953b + Offset.m71503getYimpl(j), this.f28954c + Offset.m71502getXimpl(j), this.f28955d + Offset.m71503getYimpl(j));
    }
}
