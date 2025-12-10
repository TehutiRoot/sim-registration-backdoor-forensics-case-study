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
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0014\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001d\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010+\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m29142d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "center", "radius", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/util/List;", "e", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, OperatorName.NON_STROKING_GRAY, "F", OperatorName.CLOSE_PATH, "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.RadialGradient */
/* loaded from: classes2.dex */
public final class RadialGradient extends ShaderBrush {

    /* renamed from: d */
    public final List f29220d;

    /* renamed from: e */
    public final List f29221e;

    /* renamed from: f */
    public final long f29222f;

    /* renamed from: g */
    public final float f29223g;

    /* renamed from: h */
    public final int f29224h;

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, f, i);
    }

    @Override // androidx.compose.p003ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo71894createShaderuvyYCjk(long j) {
        float m71686getXimpl;
        float m71687getYimpl;
        float f;
        if (OffsetKt.m71707isUnspecifiedk4lQ0M(this.f29222f)) {
            long m71765getCenteruvyYCjk = SizeKt.m71765getCenteruvyYCjk(j);
            m71686getXimpl = Offset.m71686getXimpl(m71765getCenteruvyYCjk);
            m71687getYimpl = Offset.m71687getYimpl(m71765getCenteruvyYCjk);
        } else {
            if (Offset.m71686getXimpl(this.f29222f) == Float.POSITIVE_INFINITY) {
                m71686getXimpl = Size.m71755getWidthimpl(j);
            } else {
                m71686getXimpl = Offset.m71686getXimpl(this.f29222f);
            }
            if (Offset.m71687getYimpl(this.f29222f) == Float.POSITIVE_INFINITY) {
                m71687getYimpl = Size.m71752getHeightimpl(j);
            } else {
                m71687getYimpl = Offset.m71687getYimpl(this.f29222f);
            }
        }
        List list = this.f29220d;
        List list2 = this.f29221e;
        long Offset = OffsetKt.Offset(m71686getXimpl, m71687getYimpl);
        float f2 = this.f29223g;
        if (f2 == Float.POSITIVE_INFINITY) {
            f = Size.m71754getMinDimensionimpl(j) / 2;
        } else {
            f = f2;
        }
        return ShaderKt.m72191RadialGradientShader8uybcMk(Offset, f, list, list2, this.f29224h);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadialGradient)) {
            return false;
        }
        RadialGradient radialGradient = (RadialGradient) obj;
        if (Intrinsics.areEqual(this.f29220d, radialGradient.f29220d) && Intrinsics.areEqual(this.f29221e, radialGradient.f29221e) && Offset.m71683equalsimpl0(this.f29222f, radialGradient.f29222f) && this.f29223g == radialGradient.f29223g && TileMode.m72243equalsimpl0(this.f29224h, radialGradient.f29224h)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo71873getIntrinsicSizeNHjbRc() {
        float f = this.f29223g;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            float f2 = this.f29223g;
            float f3 = 2;
            return SizeKt.Size(f2 * f3, f2 * f3);
        }
        return Size.Companion.m71763getUnspecifiedNHjbRc();
    }

    public int hashCode() {
        int i;
        int hashCode = this.f29220d.hashCode() * 31;
        List list = this.f29221e;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + Offset.m71688hashCodeimpl(this.f29222f)) * 31) + Float.floatToIntBits(this.f29223g)) * 31) + TileMode.m72244hashCodeimpl(this.f29224h);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m71705isSpecifiedk4lQ0M(this.f29222f)) {
            str = "";
        } else {
            str = "center=" + ((Object) Offset.m71694toStringimpl(this.f29222f)) + ", ";
        }
        float f = this.f29223g;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            str2 = "radius=" + this.f29223g + ", ";
        }
        return "RadialGradient(colors=" + this.f29220d + ", stops=" + this.f29221e + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m72245toStringimpl(this.f29224h)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ RadialGradient(List list, List list2, long j, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, f, (i2 & 16) != 0 ? TileMode.Companion.m72247getClamp3opZhB0() : i, null);
    }

    public RadialGradient(List colors, List list, long j, float f, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f29220d = colors;
        this.f29221e = list;
        this.f29222f = j;
        this.f29223g = f;
        this.f29224h = i;
    }
}