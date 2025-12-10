package androidx.compose.material;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001c\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/material/TabPosition;", "", "Landroidx/compose/ui/unit/Dp;", "left", "width", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getLeft-D9Ej5fM", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getWidth-D9Ej5fM", "getRight-D9Ej5fM", "right", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,517:1\n51#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n328#1:518\n*E\n"})
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;

    /* renamed from: a */
    public final float f14684a;

    /* renamed from: b */
    public final float f14685b;

    public /* synthetic */ TabPosition(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabPosition)) {
            return false;
        }
        TabPosition tabPosition = (TabPosition) obj;
        if (C3641Dp.m73663equalsimpl0(this.f14684a, tabPosition.f14684a) && C3641Dp.m73663equalsimpl0(this.f14685b, tabPosition.f14685b)) {
            return true;
        }
        return false;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m70121getLeftD9Ej5fM() {
        return this.f14684a;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m70122getRightD9Ej5fM() {
        return C3641Dp.m73658constructorimpl(this.f14684a + this.f14685b);
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m70123getWidthD9Ej5fM() {
        return this.f14685b;
    }

    public int hashCode() {
        return (C3641Dp.m73664hashCodeimpl(this.f14684a) * 31) + C3641Dp.m73664hashCodeimpl(this.f14685b);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) C3641Dp.m73669toStringimpl(this.f14684a)) + ", right=" + ((Object) C3641Dp.m73669toStringimpl(m70122getRightD9Ej5fM())) + ", width=" + ((Object) C3641Dp.m73669toStringimpl(this.f14685b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TabPosition(float f, float f2) {
        this.f14684a = f;
        this.f14685b = f2;
    }
}
