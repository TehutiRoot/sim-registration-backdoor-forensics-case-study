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
@Metadata(m29143d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BF\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0014\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u001d\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b%\u0010$R\u001d\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010*\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m29142d2 = {"Landroidx/compose/ui/graphics/LinearGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "<init>", "(Ljava/util/List;Ljava/util/List;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/util/List;", "e", OperatorName.FILL_NON_ZERO, OperatorName.SET_LINE_CAPSTYLE, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "I", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.LinearGradient */
/* loaded from: classes2.dex */
public final class LinearGradient extends ShaderBrush {

    /* renamed from: d */
    public final List f29185d;

    /* renamed from: e */
    public final List f29186e;

    /* renamed from: f */
    public final long f29187f;

    /* renamed from: g */
    public final long f29188g;

    /* renamed from: h */
    public final int f29189h;

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, j, j2, i);
    }

    @Override // androidx.compose.p003ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo71894createShaderuvyYCjk(long j) {
        float m71686getXimpl;
        float m71687getYimpl;
        float m71686getXimpl2;
        float m71687getYimpl2;
        if (Offset.m71686getXimpl(this.f29187f) == Float.POSITIVE_INFINITY) {
            m71686getXimpl = Size.m71755getWidthimpl(j);
        } else {
            m71686getXimpl = Offset.m71686getXimpl(this.f29187f);
        }
        if (Offset.m71687getYimpl(this.f29187f) == Float.POSITIVE_INFINITY) {
            m71687getYimpl = Size.m71752getHeightimpl(j);
        } else {
            m71687getYimpl = Offset.m71687getYimpl(this.f29187f);
        }
        if (Offset.m71686getXimpl(this.f29188g) == Float.POSITIVE_INFINITY) {
            m71686getXimpl2 = Size.m71755getWidthimpl(j);
        } else {
            m71686getXimpl2 = Offset.m71686getXimpl(this.f29188g);
        }
        if (Offset.m71687getYimpl(this.f29188g) == Float.POSITIVE_INFINITY) {
            m71687getYimpl2 = Size.m71752getHeightimpl(j);
        } else {
            m71687getYimpl2 = Offset.m71687getYimpl(this.f29188g);
        }
        return ShaderKt.m72189LinearGradientShaderVjE6UOU(OffsetKt.Offset(m71686getXimpl, m71687getYimpl), OffsetKt.Offset(m71686getXimpl2, m71687getYimpl2), this.f29185d, this.f29186e, this.f29189h);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinearGradient)) {
            return false;
        }
        LinearGradient linearGradient = (LinearGradient) obj;
        if (Intrinsics.areEqual(this.f29185d, linearGradient.f29185d) && Intrinsics.areEqual(this.f29186e, linearGradient.f29186e) && Offset.m71683equalsimpl0(this.f29187f, linearGradient.f29187f) && Offset.m71683equalsimpl0(this.f29188g, linearGradient.f29188g) && TileMode.m72243equalsimpl0(this.f29189h, linearGradient.f29189h)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.graphics.Brush
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo71873getIntrinsicSizeNHjbRc() {
        float f;
        float m71687getYimpl;
        float m71687getYimpl2;
        float m71686getXimpl = Offset.m71686getXimpl(this.f29187f);
        float f2 = Float.NaN;
        if (!Float.isInfinite(m71686getXimpl) && !Float.isNaN(m71686getXimpl)) {
            float m71686getXimpl2 = Offset.m71686getXimpl(this.f29188g);
            if (!Float.isInfinite(m71686getXimpl2) && !Float.isNaN(m71686getXimpl2)) {
                f = Math.abs(Offset.m71686getXimpl(this.f29187f) - Offset.m71686getXimpl(this.f29188g));
                m71687getYimpl = Offset.m71687getYimpl(this.f29187f);
                if (!Float.isInfinite(m71687getYimpl) && !Float.isNaN(m71687getYimpl)) {
                    m71687getYimpl2 = Offset.m71687getYimpl(this.f29188g);
                    if (!Float.isInfinite(m71687getYimpl2) && !Float.isNaN(m71687getYimpl2)) {
                        f2 = Math.abs(Offset.m71687getYimpl(this.f29187f) - Offset.m71687getYimpl(this.f29188g));
                    }
                }
                return SizeKt.Size(f, f2);
            }
        }
        f = Float.NaN;
        m71687getYimpl = Offset.m71687getYimpl(this.f29187f);
        if (!Float.isInfinite(m71687getYimpl)) {
            m71687getYimpl2 = Offset.m71687getYimpl(this.f29188g);
            if (!Float.isInfinite(m71687getYimpl2)) {
                f2 = Math.abs(Offset.m71687getYimpl(this.f29187f) - Offset.m71687getYimpl(this.f29188g));
            }
        }
        return SizeKt.Size(f, f2);
    }

    public int hashCode() {
        int i;
        int hashCode = this.f29185d.hashCode() * 31;
        List list = this.f29186e;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + Offset.m71688hashCodeimpl(this.f29187f)) * 31) + Offset.m71688hashCodeimpl(this.f29188g)) * 31) + TileMode.m72244hashCodeimpl(this.f29189h);
    }

    @NotNull
    public String toString() {
        String str;
        String str2 = "";
        if (!OffsetKt.m71703isFinitek4lQ0M(this.f29187f)) {
            str = "";
        } else {
            str = "start=" + ((Object) Offset.m71694toStringimpl(this.f29187f)) + ", ";
        }
        if (OffsetKt.m71703isFinitek4lQ0M(this.f29188g)) {
            str2 = "end=" + ((Object) Offset.m71694toStringimpl(this.f29188g)) + ", ";
        }
        return "LinearGradient(colors=" + this.f29185d + ", stops=" + this.f29186e + ", " + str + str2 + "tileMode=" + ((Object) TileMode.m72245toStringimpl(this.f29189h)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ LinearGradient(List list, List list2, long j, long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? null : list2, j, j2, (i2 & 16) != 0 ? TileMode.Companion.m72247getClamp3opZhB0() : i, null);
    }

    public LinearGradient(List colors, List list, long j, long j2, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f29185d = colors;
        this.f29186e = list;
        this.f29187f = j;
        this.f29188g = j2;
        this.f29189h = i;
    }
}