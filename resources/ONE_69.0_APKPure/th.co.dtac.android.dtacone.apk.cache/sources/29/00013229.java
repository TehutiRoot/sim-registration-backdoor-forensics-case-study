package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneMnpPropositionState;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$1", m29092f = "OneMnpPropositionFragment.kt", m29091i = {}, m29090l = {107}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$1 */
/* loaded from: classes10.dex */
public final class OneMnpPropositionFragment$setupObserve$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpPropositionFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "proposition", "Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMnpPropositionState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$1$1", m29092f = "OneMnpPropositionFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C147511 extends SuspendLambda implements Function2<OneMnpPropositionState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpPropositionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147511(OneMnpPropositionFragment oneMnpPropositionFragment, Continuation<? super C147511> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpPropositionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147511 c147511 = new C147511(this.this$0, continuation);
            c147511.L$0 = obj;
            return c147511;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CardView cardView;
            OneFontTextView oneFontTextView;
            LinearLayoutCompat linearLayoutCompat;
            CardView cardView2;
            OneFontTextView oneFontTextView2;
            LinearLayoutCompat linearLayoutCompat2;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneMnpPropositionState oneMnpPropositionState = (OneMnpPropositionState) this.L$0;
                LinearLayoutCompat linearLayoutCompat3 = null;
                if (oneMnpPropositionState instanceof OneMnpPropositionState.Loading) {
                    this.this$0.showLoading();
                    cardView2 = this.this$0.f91636x;
                    if (cardView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView2 = null;
                    }
                    ViewVisibleExtKt.toGone(cardView2);
                    oneFontTextView2 = this.this$0.f91632t;
                    if (oneFontTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                        oneFontTextView2 = null;
                    }
                    ViewVisibleExtKt.toGone(oneFontTextView2);
                    linearLayoutCompat2 = this.this$0.f91635w;
                    if (linearLayoutCompat2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                    } else {
                        linearLayoutCompat3 = linearLayoutCompat2;
                    }
                    ViewVisibleExtKt.toGone(linearLayoutCompat3);
                } else if (oneMnpPropositionState instanceof OneMnpPropositionState.Success) {
                    this.this$0.dismissLoading();
                } else if (oneMnpPropositionState instanceof OneMnpPropositionState.Error) {
                    this.this$0.dismissLoading();
                    cardView = this.this$0.f91636x;
                    if (cardView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView = null;
                    }
                    ViewVisibleExtKt.toGone(cardView);
                    oneFontTextView = this.this$0.f91632t;
                    if (oneFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                        oneFontTextView = null;
                    }
                    ViewVisibleExtKt.toGone(oneFontTextView);
                    linearLayoutCompat = this.this$0.f91635w;
                    if (linearLayoutCompat == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                    } else {
                        linearLayoutCompat3 = linearLayoutCompat;
                    }
                    ViewVisibleExtKt.toVisible(linearLayoutCompat3);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneMnpPropositionState oneMnpPropositionState, @Nullable Continuation<? super Unit> continuation) {
            return ((C147511) create(oneMnpPropositionState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpPropositionFragment$setupObserve$1$1(OneMnpViewModel oneMnpViewModel, OneMnpPropositionFragment oneMnpPropositionFragment, Continuation<? super OneMnpPropositionFragment$setupObserve$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpPropositionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpPropositionFragment$setupObserve$1$1(this.$this_apply, this.this$0, continuation);
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
            StateFlow<OneMnpPropositionState> propositionListState = this.$this_apply.getPropositionListState();
            C147511 c147511 = new C147511(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(propositionListState, c147511, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpPropositionFragment$setupObserve$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}