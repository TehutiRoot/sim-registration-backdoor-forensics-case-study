package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$2$3 */
/* loaded from: classes10.dex */
public final class InputIdCardScreenKt$InputIdForms$2$3 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ MutableState<Integer> $targetTypeIndex$delegate;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$2$3$1", m29092f = "InputIdCardScreen.kt", m29091i = {}, m29090l = {164}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputIdCard.InputIdCardScreenKt$InputIdForms$2$3$1 */
    /* loaded from: classes10.dex */
    public static final class C154591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $ind;
        final /* synthetic */ PagerState $pagerState;
        final /* synthetic */ MutableState<Integer> $targetTypeIndex$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C154591(int i, PagerState pagerState, MutableState<Integer> mutableState, Continuation<? super C154591> continuation) {
            super(2, continuation);
            this.$ind = i;
            this.$pagerState = pagerState;
            this.$targetTypeIndex$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C154591(this.$ind, this.$pagerState, this.$targetTypeIndex$delegate, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                InputIdCardScreenKt.m9533c(this.$targetTypeIndex$delegate, this.$ind);
                PagerState pagerState = this.$pagerState;
                int i2 = this.$ind;
                this.label = 1;
                if (PagerState.animateScrollToPage$default(pagerState, i2, 0.0f, null, this, 6, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C154591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputIdCardScreenKt$InputIdForms$2$3(CoroutineScope coroutineScope, PagerState pagerState, MutableState<Integer> mutableState) {
        super(1);
        this.$coroutineScope = coroutineScope;
        this.$pagerState = pagerState;
        this.$targetTypeIndex$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        AbstractC1539Vc.m65885e(this.$coroutineScope, null, null, new C154591(i, this.$pagerState, this.$targetTypeIndex$delegate, null), 3, null);
    }
}