package androidx.compose.material3;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class TimePickerKt$ClockText$2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
    final /* synthetic */ boolean $autoSwitchToMinute;
    final /* synthetic */ MutableState<Offset> $center$delegate;
    final /* synthetic */ float $maxDist;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ TimePickerState $state;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1 */
    /* loaded from: classes2.dex */
    public static final class C33871 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ boolean $autoSwitchToMinute;
        final /* synthetic */ MutableState<Offset> $center$delegate;
        final /* synthetic */ float $maxDist;
        final /* synthetic */ CoroutineScope $scope;
        final /* synthetic */ TimePickerState $state;

        @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        @DebugMetadata(m29093c = "androidx.compose.material3.TimePickerKt$ClockText$2$1$1", m29092f = "TimePicker.kt", m29091i = {}, m29090l = {1318}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
        /* renamed from: androidx.compose.material3.TimePickerKt$ClockText$2$1$1 */
        /* loaded from: classes2.dex */
        public static final class C33881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $autoSwitchToMinute;
            final /* synthetic */ MutableState<Offset> $center$delegate;
            final /* synthetic */ float $maxDist;
            final /* synthetic */ TimePickerState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C33881(TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState, Continuation<? super C33881> continuation) {
                super(2, continuation);
                this.$state = timePickerState;
                this.$maxDist = f;
                this.$autoSwitchToMinute = z;
                this.$center$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C33881(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                long m60391d;
                long m60391d2;
                Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TimePickerState timePickerState = this.$state;
                    m60391d = TimePickerKt.m60391d(this.$center$delegate);
                    float m71686getXimpl = Offset.m71686getXimpl(m60391d);
                    m60391d2 = TimePickerKt.m60391d(this.$center$delegate);
                    float m71687getYimpl = Offset.m71687getYimpl(m60391d2);
                    float f = this.$maxDist;
                    boolean z = this.$autoSwitchToMinute;
                    this.label = 1;
                    if (timePickerState.onTap$material3_release(m71686getXimpl, m71687getYimpl, f, z, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C33881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33871(CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z, MutableState<Offset> mutableState) {
            super(0);
            this.$scope = coroutineScope;
            this.$state = timePickerState;
            this.$maxDist = f;
            this.$autoSwitchToMinute = z;
            this.$center$delegate = mutableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            AbstractC1539Vc.m65885e(this.$scope, null, null, new C33881(this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate, null), 3, null);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$ClockText$2(boolean z, CoroutineScope coroutineScope, TimePickerState timePickerState, float f, boolean z2, MutableState<Offset> mutableState) {
        super(1);
        this.$selected = z;
        this.$scope = coroutineScope;
        this.$state = timePickerState;
        this.$maxDist = f;
        this.$autoSwitchToMinute = z2;
        this.$center$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.onClick$default(semantics, null, new C33871(this.$scope, this.$state, this.$maxDist, this.$autoSwitchToMinute, this.$center$delegate), 1, null);
        SemanticsPropertiesKt.setSelected(semantics, this.$selected);
    }
}