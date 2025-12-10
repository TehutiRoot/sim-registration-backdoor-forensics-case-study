package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.ClosedFloatingPointRange;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
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
        int m60554f;
        float m60556d;
        float m60558b;
        float m60552h;
        float m60539u;
        ClosedFloatingPointRange<Float> rangeTo;
        ClosedFloatingPointRange<Float> m60551i;
        float m60552h2;
        float m60539u2;
        m60554f = SliderKt.m60554f(this.$totalWidth$delegate);
        m60556d = SliderKt.m60556d(this.$endThumbWidth$delegate);
        float f2 = 2;
        float max = Math.max(m60554f - (m60556d / f2), 0.0f);
        m60558b = SliderKt.m60558b(this.$startThumbWidth$delegate);
        float min = Math.min(m60558b / f2, max);
        if (z) {
            MutableState<Float> mutableState = this.$rawOffsetStart;
            mutableState.setValue(Float.valueOf(mutableState.getValue().floatValue() + f));
            MutableState<Float> mutableState2 = this.$rawOffsetEnd;
            m60552h2 = SliderKt.m60552h(this.$valueRange, min, max, this.$value.getEndInclusive().floatValue());
            mutableState2.setValue(Float.valueOf(m60552h2));
            float floatValue = this.$rawOffsetEnd.getValue().floatValue();
            m60539u2 = SliderKt.m60539u(AbstractC11719c.coerceIn(this.$rawOffsetStart.getValue().floatValue(), min, floatValue), this.$tickFractions, min, max);
            rangeTo = AbstractC18012Lr1.rangeTo(m60539u2, floatValue);
        } else {
            MutableState<Float> mutableState3 = this.$rawOffsetEnd;
            mutableState3.setValue(Float.valueOf(mutableState3.getValue().floatValue() + f));
            MutableState<Float> mutableState4 = this.$rawOffsetStart;
            m60552h = SliderKt.m60552h(this.$valueRange, min, max, this.$value.getStart().floatValue());
            mutableState4.setValue(Float.valueOf(m60552h));
            float floatValue2 = this.$rawOffsetStart.getValue().floatValue();
            m60539u = SliderKt.m60539u(AbstractC11719c.coerceIn(this.$rawOffsetEnd.getValue().floatValue(), floatValue2, max), this.$tickFractions, min, max);
            rangeTo = AbstractC18012Lr1.rangeTo(floatValue2, m60539u);
        }
        m60551i = SliderKt.m60551i(this.$valueRange, min, max, rangeTo);
        this.$onValueChangeState.getValue().invoke(m60551i);
    }
}
