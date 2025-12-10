package androidx.compose.p003ui.graphics;

import android.graphics.Shader;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0014\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001d\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010$R\u001d\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010*\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m28850d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/util/List;", "e", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.LinearGradient */
/* loaded from: classes2.dex */
public final class LinearGradient extends ShaderBrush {

    /* renamed from: d */
    public final List f29097d;

    /* renamed from: e */
    public final List f29098e;

    /* renamed from: f */
    public final long f29099f;

    /* renamed from: g */
    public final long f29100g;

    /* renamed from: h */
    public final int f29101h;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    @Override // androidx.compose.p003ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo71710createShaderuvyYCjk(long j) {
        float m71502getXimpl;
        float m71503getYimpl;
        float m71502getXimpl2;
        float m71503getYimpl2;
        if (Offset.m71502getXimpl(this.f29099f) == Float.POSITIVE_INFINITY) {
            m71502getXimpl = Size.m71571getWidthimpl(j);
        } else {
            m71502getXimpl = Offset.m71502getXimpl(this.f29099f);
        }
        if (Offset.m71503getYimpl(this.f29099f) == Float.POSITIVE_INFINITY) {
            m71503getYimpl = Size.m71568getHeightimpl(j);
        } else {
            m71503getYimpl = Offset.m71503getYimpl(this.f29099f);
        }
        if (Offset.m71502getXimpl(this.f29100g) == Float.POSITIVE_INFINITY) {
            m71502getXimpl2 = Size.m71571getWidthimpl(j);
        } else {
            m71502getXimpl2 = Offset.m71502getXimpl(this.f29100g);
        }
        if (Offset.m71503getYimpl(this.f29100g) == Float.POSITIVE_INFINITY) {
            m71503getYimpl2 = Size.m71568getHeightimpl(j);
        } else {
            m71503getYimpl2 = Offset.m71503getYimpl(this.f29100g);
        }
        return ShaderKt.m72005LinearGradientShaderVjE6UOU(OffsetKt.Offset(m71502getXimpl, m71503getYimpl), OffsetKt.Offset(m71502getXimpl2, m71503getYimpl2), this.f29097d, this.f29098e, this.f29101h);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (Intrinsics.areEqual(this.f29097d, linearGradient.f29097d) && Intrinsics.areEqual(this.f29098e, linearGradient.f29098e) && Offset.m71499equalsimpl0(this.f29099f, linearGradient.f29099f) && Offset.m71499equalsimpl0(this.f29100g, linearGradient.f29100g) && TileMode.m72059equalsimpl0(this.f29101h, linearGradient.f29101h)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo71689getIntrinsicSizeNHjbRc() {
        float f;
        float m71503getYimpl;
        float m71503getYimpl2;
        float m71502getXimpl = Offset.m71502getXimpl(this.f29099f);
        float f2 = Float.NaN;
        if (!Float.isInfinite(m71502getXimpl) && !Float.isNaN(m71502getXimpl)) {
            float m71502getXimpl2 = Offset.m71502getXimpl(this.f29100g);
            if (!Float.isInfinite(m71502getXimpl2) && !Float.isNaN(m71502getXimpl2)) {
                f = Math.abs(Offset.m71502getXimpl(this.f29099f) - Offset.m71502getXimpl(this.f29100g));
                m71503getYimpl = Offset.m71503getYimpl(this.f29099f);
                if (!Float.isInfinite(m71503getYimpl) && !Float.isNaN(m71503getYimpl)) {
                    m71503getYimpl2 = Offset.m71503getYimpl(this.f29100g);
                    if (!Float.isInfinite(m71503getYimpl2) && !Float.isNaN(m71503getYimpl2)) {
                        f2 = Math.abs(Offset.m71503getYimpl(this.f29099f) - Offset.m71503getYimpl(this.f29100g));
                    }
                }
                return SizeKt.Size(f, f2);
            }
        }
        f = Float.NaN;
        m71503getYimpl = Offset.m71503getYimpl(this.f29099f);
        if (!Float.isInfinite(m71503getYimpl)) {
            m71503getYimpl2 = Offset.m71503getYimpl(this.f29100g);
            if (!Float.isInfinite(m71503getYimpl2)) {
                f2 = Math.abs(Offset.m71503getYimpl(this.f29099f) - Offset.m71503getYimpl(this.f29100g));
            }
        }
        return SizeKt.Size(f, f2);
    }

    public int hashCode() {
        int i;
        int hashCode = this.f29097d.hashCode() * 31;
        List list = this.f29098e;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + Offset.m71504hashCodeimpl(this.f29099f)) * 31) + Offset.m71504hashCodeimpl(this.f29100g)) * 31) + TileMode.m72060hashCodeimpl(this.f29101h);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m71519isFinitek4lQ0M(this.f29099f)) {
            str = "";
        } else {
            str = "start=" + ((Object) Offset.m71510toStringimpl(this.f29099f)) + ", ";
        }
        if (OffsetKt.m71519isFinitek4lQ0M(this.f29100g)) {
            str2 = "end=" + ((Object) Offset.m71510toStringimpl(this.f29100g)) + ", ";
        }
        return "LinearGradient(colors=" + this.f29097d + ", stops=" + this.f29098e + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m72061toStringimpl(this.f29101h)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m72063getClamp3opZhB0() : i, null);
    }

    public LinearGradient(List colors, List list, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f29097d = colors;
        this.f29098e = list;
        this.f29099f = j;
        this.f29100g = j2;
        this.f29101h = i;
    }
}
