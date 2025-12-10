package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 extends Lambda implements Function0<Job> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ TooltipState $tooltipState;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    @DebugMetadata(m28801c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1$1", m28800f = "Tooltip.kt", m28799i = {}, m28798l = {208}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
    /* renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1$1 */
    /* loaded from: classes2.dex */
    public static final class C34241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TooltipState $tooltipState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34241(TooltipState tooltipState, Continuation<? super C34241> continuation) {
            super(2, continuation);
            this.$tooltipState = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C34241(this.$tooltipState, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TooltipState tooltipState = this.$tooltipState;
                this.label = 1;
                if (tooltipState.show(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C34241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1(CoroutineScope coroutineScope, TooltipState tooltipState) {
        super(0);
        this.$coroutineScope = coroutineScope;
        this.$tooltipState = tooltipState;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Job invoke() {
        Job m65753e;
        m65753e = AbstractC1552Vc.m65753e(this.$coroutineScope, null, null, new C34241(this.$tooltipState, null), 3, null);
        return m65753e;
    }
}
