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
import th.p047co.dtac.android.dtacone.util.Constant;

@Immutable
@Metadata(m28851d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B4\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 \u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m28850d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/geometry/Offset;", Constant.VIEW_CENTER, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "createShader", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", OperatorName.SET_LINE_CAPSTYLE, "e", "Ljava/util/List;", OperatorName.FILL_NON_ZERO, "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.SweepGradient */
/* loaded from: classes2.dex */
public final class SweepGradient extends ShaderBrush {

    /* renamed from: d */
    public final long f29195d;

    /* renamed from: e */
    public final List f29196e;

    /* renamed from: f */
    public final List f29197f;

    public /* synthetic */ SweepGradient(long j, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    @Override // androidx.compose.p003ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo71710createShaderuvyYCjk(long j) {
        float m71502getXimpl;
        float m71503getYimpl;
        long Offset;
        if (OffsetKt.m71523isUnspecifiedk4lQ0M(this.f29195d)) {
            Offset = SizeKt.m71581getCenteruvyYCjk(j);
        } else {
            if (Offset.m71502getXimpl(this.f29195d) == Float.POSITIVE_INFINITY) {
                m71502getXimpl = Size.m71571getWidthimpl(j);
            } else {
                m71502getXimpl = Offset.m71502getXimpl(this.f29195d);
            }
            if (Offset.m71503getYimpl(this.f29195d) == Float.POSITIVE_INFINITY) {
                m71503getYimpl = Size.m71568getHeightimpl(j);
            } else {
                m71503getYimpl = Offset.m71503getYimpl(this.f29195d);
            }
            Offset = OffsetKt.Offset(m71502getXimpl, m71503getYimpl);
        }
        return ShaderKt.m72009SweepGradientShader9KIMszo(Offset, this.f29196e, this.f29197f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SweepGradient)) {
            return false;
        }
        SweepGradient sweepGradient = (SweepGradient) obj;
        if (Offset.m71499equalsimpl0(this.f29195d, sweepGradient.f29195d) && Intrinsics.areEqual(this.f29196e, sweepGradient.f29196e) && Intrinsics.areEqual(this.f29197f, sweepGradient.f29197f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int m71504hashCodeimpl = ((Offset.m71504hashCodeimpl(this.f29195d) * 31) + this.f29196e.hashCode()) * 31;
        List list = this.f29197f;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return m71504hashCodeimpl + i;
    }

    @NotNull
    public String toString() {
        String str;
        if (OffsetKt.m71521isSpecifiedk4lQ0M(this.f29195d)) {
            str = "center=" + ((Object) Offset.m71510toStringimpl(this.f29195d)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.f29196e + ", stops=" + this.f29197f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ SweepGradient(long j, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, (i & 4) != 0 ? null : list2, null);
    }

    public SweepGradient(long j, List colors, List list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.f29195d = j;
        this.f29196e = colors;
        this.f29197f = list;
    }
}
