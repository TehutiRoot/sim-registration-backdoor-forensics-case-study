package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11695c;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SliderKt$RangeSliderImpl$onDrag$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    final /* synthetic */ MutableState<Float> $endThumbWidth$delegate;
    final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> $onValueChangeState;
    final /* synthetic */ MutableState<Float> $rawOffsetEnd;
    final /* synthetic */ MutableState<Float> $rawOffsetStart;
    final /* synthetic */ MutableState<Float> $startThumbWidth$delegate;
    final /* synthetic */ float[] $tickFractions;
    final /* synthetic */ MutableState<Integer> $totalWidth$delegate;
    final /* synthetic */ ClosedFloatingPointRange<Float> $value;
    final /* synthetic */ ClosedFloatingPointRange<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSliderImpl$onDrag$1(MutableState<Float> mutableState, MutableState<Float> mutableState2, ClosedFloatingPointRange<Float> closedFloatingPointRange, float[] fArr, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableState<Integer> mutableState3, MutableState<Float> mutableState4, MutableState<Float> mutableState5, ClosedFloatingPointRange<Float> closedFloatingPointRange2) {
        super(2);
        this.$rawOffsetStart = mutableState;
        this.$rawOffsetEnd = mutableState2;
        this.$value = closedFloatingPointRange;
        this.$tickFractions = fArr;
        this.$onValueChangeState = state;
        this.$totalWidth$delegate = mutableState3;
        this.$endThumbWidth$delegate = mutableState4;
        this.$startThumbWidth$delegate = mutableState5;
        this.$valueRange = closedFloatingPointRange2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Float f) {
        invoke(bool.booleanValue(), f.floatValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, float f) {
        int m60504f;
        float m60506d;
        float m60508b;
        float m60502h;
        float m60489u;
        ClosedFloatingPointRange<Float> rangeTo;
        ClosedFloatingPointRange<Float> m60501i;
        float m60502h2;
        float m60489u2;
        m60504f = SliderKt.m60504f(this.$totalWidth$delegate);
        m60506d = SliderKt.m60506d(this.$endThumbWidth$delegate);
        float f2 = 2;
        float max = Math.max(m60504f - (m60506d / f2), 0.0f);
        m60508b = SliderKt.m60508b(this.$startThumbWidth$delegate);
        float min = Math.min(m60508b / f2, max);
        if (z) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f));
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            m60502h2 = SliderKt.m60502h(this.$valueRange, min, max, this.$value.getEndInclusive().floatValue());
            mutableState2.setValue(Float.valueOf(m60502h2));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            m60489u2 = SliderKt.m60489u(AbstractC11695c.coerceIn(this.$rawOffsetStart.getValue().floatValue(), min, floatValue), this.$tickFractions, min, max);
            rangeTo = AbstractC17854Is1.rangeTo(m60489u2, floatValue);
        } else {
            MutableState<Float> mutableState3 = this.$rawOffsetEnd;
            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f));
            MutableState<Float> mutableState4 = this.$rawOffsetStart;
            m60502h = SliderKt.m60502h(this.$valueRange, min, max, this.$value.getStart().floatValue());
            mutableState4.setValue(Float.valueOf(m60502h));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            m60489u = SliderKt.m60489u(AbstractC11695c.coerceIn(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, max), this.$tickFractions, min, max);
            rangeTo = AbstractC17854Is1.rangeTo(floatValue2, m60489u);
        }
        m60501i = SliderKt.m60501i(this.$valueRange, min, max, rangeTo);
        this.$onValueChangeState.getValue().invoke(m60501i);
    }
}