package androidx.compose.material;

import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Immutable;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Immutable
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001c\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, m29142d2 = {"Landroidx/compose/material/TabPosition;", "", "Landroidx/compose/ui/unit/Dp;", OneNadOutboundSearchFragment.POSITION_LEFT, "width", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getLeft-D9Ej5fM", "()F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getWidth-D9Ej5fM", "getRight-D9Ej5fM", OneNadOutboundSearchFragment.POSITION_RIGHT, "material_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,517:1\n51#2:518\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabPosition\n*L\n328#1:518\n*E\n"})
/* loaded from: classes.dex */
public final class TabPosition {
    public static final int $stable = 0;

    /* renamed from: a */
    public final float f14772a;

    /* renamed from: b */
    public final float f14773b;

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
        if (C3623Dp.m73847equalsimpl0(this.f14772a, tabPosition.f14772a) && C3623Dp.m73847equalsimpl0(this.f14773b, tabPosition.f14773b)) {
            return true;
        }
        return false;
    }

    /* renamed from: getLeft-D9Ej5fM  reason: not valid java name */
    public final float m70305getLeftD9Ej5fM() {
        return this.f14772a;
    }

    /* renamed from: getRight-D9Ej5fM  reason: not valid java name */
    public final float m70306getRightD9Ej5fM() {
        return C3623Dp.m73842constructorimpl(this.f14772a + this.f14773b);
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m70307getWidthD9Ej5fM() {
        return this.f14773b;
    }

    public int hashCode() {
        return (C3623Dp.m73848hashCodeimpl(this.f14772a) * 31) + C3623Dp.m73848hashCodeimpl(this.f14773b);
    }

    @NotNull
    public String toString() {
        return "TabPosition(left=" + ((Object) C3623Dp.m73853toStringimpl(this.f14772a)) + ", right=" + ((Object) C3623Dp.m73853toStringimpl(m70306getRightD9Ej5fM())) + ", width=" + ((Object) C3623Dp.m73853toStringimpl(this.f14773b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public TabPosition(float f, float f2) {
        this.f14772a = f;
        this.f14773b = f2;
    }
}