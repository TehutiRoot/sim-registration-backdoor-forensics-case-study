package androidx.compose.p003ui.graphics.vector;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m29142d2 = {"Landroidx/compose/ui/graphics/vector/FloatResult;", "", "", "value", "", "isValid", "<init>", "(FZ)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getValue", "()F", "setValue", "(F)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "()Z", "setValid", "(Z)V", "ui-graphics_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.vector.FloatResult */
/* loaded from: classes2.dex */
public final class FloatResult {

    /* renamed from: a */
    public float f29444a;

    /* renamed from: b */
    public boolean f29445b;

    public FloatResult() {
        this(0.0f, false, 3, null);
    }

    public final float getValue() {
        return this.f29444a;
    }

    public final boolean isValid() {
        return this.f29445b;
    }

    public final void setValid(boolean z) {
        this.f29445b = z;
    }

    public final void setValue(float f) {
        this.f29444a = f;
    }

    public FloatResult(float f, boolean z) {
        this.f29444a = f;
        this.f29445b = z;
    }

    public /* synthetic */ FloatResult(float f, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? false : z);
    }
}