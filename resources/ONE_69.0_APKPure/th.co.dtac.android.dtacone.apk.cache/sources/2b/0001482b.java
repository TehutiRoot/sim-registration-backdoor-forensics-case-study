package th.p047co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ComposableSingletons$WaitingScreenKt$lambda-1$1$1$1", m29092f = "WaitingScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ComposableSingletons$WaitingScreenKt$lambda-1$1$1$1  reason: invalid class name */
/* loaded from: classes10.dex */
public final class ComposableSingletons$WaitingScreenKt$lambda1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Long> $leftTimeMillis$delegate;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ComposableSingletons$WaitingScreenKt$lambda-1$1$1$1$1", m29092f = "WaitingScreen.kt", m29091i = {}, m29090l = {146}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.screen.kyc2ndLine.ComposableSingletons$WaitingScreenKt$lambda-1$1$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C158431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<Long> $leftTimeMillis$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C158431(MutableState<Long> mutableState, Continuation<? super C158431> continuation) {
            super(2, continuation);
            this.$leftTimeMillis$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C158431(this.$leftTimeMillis$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            long invoke$lambda$1;
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
                this.label = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            MutableState<Long> mutableState = this.$leftTimeMillis$delegate;
            invoke$lambda$1 = ComposableSingletons$WaitingScreenKt$lambda1$1.invoke$lambda$1(mutableState);
            ComposableSingletons$WaitingScreenKt$lambda1$1.invoke$lambda$2(mutableState, invoke$lambda$1 - 1000);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C158431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$WaitingScreenKt$lambda1$1$1$1(MutableState<Long> mutableState, Continuation<? super ComposableSingletons$WaitingScreenKt$lambda1$1$1$1> continuation) {
        super(2, continuation);
        this.$leftTimeMillis$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ComposableSingletons$WaitingScreenKt$lambda1$1$1$1 composableSingletons$WaitingScreenKt$lambda1$1$1$1 = new ComposableSingletons$WaitingScreenKt$lambda1$1$1$1(this.$leftTimeMillis$delegate, continuation);
        composableSingletons$WaitingScreenKt$lambda1$1$1$1.L$0 = obj;
        return composableSingletons$WaitingScreenKt$lambda1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC1539Vc.m65885e((CoroutineScope) this.L$0, null, null, new C158431(this.$leftTimeMillis$delegate, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((ComposableSingletons$WaitingScreenKt$lambda1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}