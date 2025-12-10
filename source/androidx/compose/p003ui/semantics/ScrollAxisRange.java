package androidx.compose.p003ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m28850d2 = {"Landroidx/compose/ui/semantics/ScrollAxisRange;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/jvm/functions/Function0;", "getValue", "()Lkotlin/jvm/functions/Function0;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMaxValue", OperatorName.CURVE_TO, "Z", "getReverseScrolling", "()Z", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.ScrollAxisRange */
/* loaded from: classes2.dex */
public final class ScrollAxisRange {
    public static final int $stable = 0;

    /* renamed from: a */
    public final Function0 f30884a;

    /* renamed from: b */
    public final Function0 f30885b;

    /* renamed from: c */
    public final boolean f30886c;

    public ScrollAxisRange(@NotNull Function0<Float> value, @NotNull Function0<Float> maxValue, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.f30884a = value;
        this.f30885b = maxValue;
        this.f30886c = z;
    }

    @NotNull
    public final Function0<Float> getMaxValue() {
        return this.f30885b;
    }

    public final boolean getReverseScrolling() {
        return this.f30886c;
    }

    @NotNull
    public final Function0<Float> getValue() {
        return this.f30884a;
    }

    @NotNull
    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f30884a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f30885b.invoke()).floatValue() + ", reverseScrolling=" + this.f30886c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ ScrollAxisRange(Function0 function0, Function0 function02, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, (i & 4) != 0 ? false : z);
    }
}
