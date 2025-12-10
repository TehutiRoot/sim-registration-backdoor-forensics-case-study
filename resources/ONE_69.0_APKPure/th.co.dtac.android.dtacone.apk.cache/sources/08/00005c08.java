package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m29142d2 = {"<anonymous>", ""}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.TimePickerState$update$2", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {571, 573}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes2.dex */
public final class TimePickerState$update$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $fromTap;
    final /* synthetic */ float $value;
    int label;
    final /* synthetic */ TimePickerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerState$update$2(TimePickerState timePickerState, float f, boolean z, Continuation<? super TimePickerState$update$2> continuation) {
        super(1, continuation);
        this.this$0 = timePickerState;
        this.$value = f;
        this.$fromTap = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new TimePickerState$update$2(this.this$0, this.$value, this.$fromTap, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        int m60364e;
        int m60364e2;
        int m60364e3;
        float m60366c;
        int m60365d;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (Selection.m70718equalsimpl0(this.this$0.m70918getSelectionJiIwxys$material3_release(), Selection.Companion.m70722getHourJiIwxys())) {
                TimePickerState timePickerState = this.this$0;
                m60365d = timePickerState.m60365d(this.$value);
                timePickerState.setHourAngle$material3_release((m60365d % 12) * 0.5235988f);
            } else if (this.$fromTap) {
                TimePickerState timePickerState2 = this.this$0;
                m60364e2 = timePickerState2.m60364e(this.$value);
                m60364e3 = this.this$0.m60364e(this.$value);
                timePickerState2.setMinuteAngle$material3_release((m60364e2 - (m60364e3 % 5)) * 0.10471976f);
            } else {
                TimePickerState timePickerState3 = this.this$0;
                m60364e = timePickerState3.m60364e(this.$value);
                timePickerState3.setMinuteAngle$material3_release(m60364e * 0.10471976f);
            }
            if (this.$fromTap) {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release = this.this$0.getCurrentAngle$material3_release();
                Float boxFloat = Boxing.boxFloat(this.this$0.getMinuteAngle$material3_release());
                this.label = 1;
                if (currentAngle$material3_release.snapTo(boxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Animatable<Float, AnimationVector1D> currentAngle$material3_release2 = this.this$0.getCurrentAngle$material3_release();
                m60366c = this.this$0.m60366c(this.$value);
                Float boxFloat2 = Boxing.boxFloat(m60366c);
                this.label = 2;
                if (currentAngle$material3_release2.snapTo(boxFloat2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((TimePickerState$update$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}