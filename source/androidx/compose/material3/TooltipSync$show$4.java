package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m28850d2 = {"<anonymous>", ""}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.material3.TooltipSync$show$4", m28800f = "Tooltip.kt", m28799i = {}, m28798l = {771, 642}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipSync$show$4\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,770:1\n314#2,11:771\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipSync$show$4\n*L\n637#1:771,11\n*E\n"})
/* loaded from: classes2.dex */
public final class TooltipSync$show$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $persistent;
    final /* synthetic */ TooltipState $state;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipSync$show$4(boolean z, TooltipState tooltipState, Continuation<? super TooltipSync$show$4> continuation) {
        super(1, continuation);
        this.$persistent = z;
        this.$state = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new TooltipSync$show$4(this.$persistent, this.$state, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                TooltipState tooltipState = (TooltipState) this.L$0;
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            if (this.$persistent) {
                TooltipState tooltipState2 = this.$state;
                this.L$0 = tooltipState2;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this), 1);
                cancellableContinuationImpl.initCancellability();
                ((RichTooltipState) tooltipState2).setVisible$material3_release(true);
                Object result = cancellableContinuationImpl.getResult();
                if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                    DebugProbes.probeCoroutineSuspended(this);
                }
                if (result == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ((RichTooltipState) this.$state).setVisible$material3_release(true);
                this.label = 2;
                if (DelayKt.delay(TooltipKt.TooltipDuration, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((TooltipSync$show$4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
