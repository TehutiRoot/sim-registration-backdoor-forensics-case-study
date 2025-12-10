package androidx.compose.p003ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PointerInputChange.isConsumed and PointerInputChange.consume() instead")
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\b\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\f¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/ui/input/pointer/ConsumedData;", "", "", "positionChange", "downChange", "<init>", "(ZZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getPositionChange", "()Z", "setPositionChange", "(Z)V", "getPositionChange$annotations", "()V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDownChange", "setDownChange", "getDownChange$annotations", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.input.pointer.ConsumedData */
/* loaded from: classes2.dex */
public final class ConsumedData {
    public static final int $stable = 8;

    /* renamed from: a */
    public boolean f29899a;

    /* renamed from: b */
    public boolean f29900b;

    public ConsumedData() {
        this(false, false, 3, null);
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getDownChange$annotations() {
    }

    @Deprecated(message = "Partial consumption was deprecated. Use PointerEvent.isConsumed and PointerEvent.consume() instead.")
    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public final boolean getDownChange() {
        return this.f29900b;
    }

    public final boolean getPositionChange() {
        return this.f29899a;
    }

    public final void setDownChange(boolean z) {
        this.f29900b = z;
    }

    public final void setPositionChange(boolean z) {
        this.f29899a = z;
    }

    public ConsumedData(boolean z, boolean z2) {
        this.f29899a = z;
        this.f29900b = z2;
    }

    public /* synthetic */ ConsumedData(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
