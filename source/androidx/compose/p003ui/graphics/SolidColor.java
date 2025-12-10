package androidx.compose.p003ui.graphics;

import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/Color;", "value", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getValue-0d7_KjU", "()J", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.SolidColor */
/* loaded from: classes2.dex */
public final class SolidColor extends Brush {

    /* renamed from: b */
    public final long f29182b;

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // androidx.compose.p003ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo71688applyToPq9zytI(long j, @NotNull Paint p, float f) {
        long m71734copywmQWz5c$default;
        Intrinsics.checkNotNullParameter(p, "p");
        p.setAlpha(1.0f);
        if (f == 1.0f) {
            m71734copywmQWz5c$default = this.f29182b;
        } else {
            long j2 = this.f29182b;
            m71734copywmQWz5c$default = Color.m71734copywmQWz5c$default(j2, Color.m71737getAlphaimpl(j2) * f, 0.0f, 0.0f, 0.0f, 14, null);
        }
        p.mo71623setColor8_81llA(m71734copywmQWz5c$default);
        if (p.getShader() != null) {
            p.setShader(null);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SolidColor) && Color.m71736equalsimpl0(this.f29182b, ((SolidColor) obj).f29182b)) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-0d7_KjU  reason: not valid java name */
    public final long m72025getValue0d7_KjU() {
        return this.f29182b;
    }

    public int hashCode() {
        return Color.m71742hashCodeimpl(this.f29182b);
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m71743toStringimpl(this.f29182b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public SolidColor(long j) {
        super(null);
        this.f29182b = j;
    }
}
