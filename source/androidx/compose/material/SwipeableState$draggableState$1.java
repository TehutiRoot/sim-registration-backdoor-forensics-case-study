package androidx.compose.material;

import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11719c;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class SwipeableState$draggableState$1 extends Lambda implements Function1<Float, Unit> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$draggableState$1(SwipeableState<T> swipeableState) {
        super(1);
        this.this$0 = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke(f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(float f) {
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        MutableFloatState mutableFloatState3;
        MutableFloatState mutableFloatState4;
        mutableFloatState = this.this$0.f14643g;
        float floatValue = mutableFloatState.getFloatValue() + f;
        float coerceIn = AbstractC11719c.coerceIn(floatValue, this.this$0.getMinBound$material_release(), this.this$0.getMaxBound$material_release());
        float f2 = floatValue - coerceIn;
        ResistanceConfig resistance$material_release = this.this$0.getResistance$material_release();
        float computeResistance = resistance$material_release != null ? resistance$material_release.computeResistance(f2) : 0.0f;
        mutableFloatState2 = this.this$0.f14641e;
        mutableFloatState2.setFloatValue(coerceIn + computeResistance);
        mutableFloatState3 = this.this$0.f14642f;
        mutableFloatState3.setFloatValue(f2);
        mutableFloatState4 = this.this$0.f14643g;
        mutableFloatState4.setFloatValue(floatValue);
    }
}
