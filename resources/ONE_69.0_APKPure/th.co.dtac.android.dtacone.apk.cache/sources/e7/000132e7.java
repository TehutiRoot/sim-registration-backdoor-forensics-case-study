package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
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
import th.p047co.dtac.android.dtacone.view.appOne.mnp.states.OneMnpPricePlansState;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$1", m29092f = "OneMnpTruePackageSetFragment.kt", m29091i = {}, m29090l = {110}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$1 */
/* loaded from: classes10.dex */
public final class OneMnpTruePackageSetFragment$setupObserve$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpTruePackageSetFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "packages", "Lth/co/dtac/android/dtacone/view/appOne/mnp/states/OneMnpPricePlansState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$1$1", m29092f = "OneMnpTruePackageSetFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C147841 extends SuspendLambda implements Function2<OneMnpPricePlansState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpTruePackageSetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147841(OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment, Continuation<? super C147841> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpTruePackageSetFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147841 c147841 = new C147841(this.this$0, continuation);
            c147841.L$0 = obj;
            return c147841;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LinearLayoutCompat linearLayoutCompat;
            OneFontTextView oneFontTextView;
            CardView cardView;
            CardView cardView2;
            RecyclerView recyclerView;
            LinearLayoutCompat linearLayoutCompat2;
            OneFontTextView oneFontTextView2;
            CardView cardView3;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneMnpPricePlansState oneMnpPricePlansState = (OneMnpPricePlansState) this.L$0;
                CardView cardView4 = null;
                if (oneMnpPricePlansState instanceof OneMnpPricePlansState.Loading) {
                    linearLayoutCompat2 = this.this$0.f91951w;
                    if (linearLayoutCompat2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                        linearLayoutCompat2 = null;
                    }
                    ViewVisibleExtKt.toGone(linearLayoutCompat2);
                    oneFontTextView2 = this.this$0.f91948t;
                    if (oneFontTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                        oneFontTextView2 = null;
                    }
                    ViewVisibleExtKt.toGone(oneFontTextView2);
                    cardView3 = this.this$0.f91952x;
                    if (cardView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                    } else {
                        cardView4 = cardView3;
                    }
                    ViewVisibleExtKt.toGone(cardView4);
                    this.this$0.showLoading();
                } else if (oneMnpPricePlansState instanceof OneMnpPricePlansState.Success) {
                    this.this$0.dismissLoading();
                    cardView2 = this.this$0.f91952x;
                    if (cardView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView2 = null;
                    }
                    ViewVisibleExtKt.toGone(cardView2);
                    recyclerView = this.this$0.f91953y;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("packageListView");
                    } else {
                        cardView4 = recyclerView;
                    }
                    ViewVisibleExtKt.toVisible(cardView4);
                } else if (oneMnpPricePlansState instanceof OneMnpPricePlansState.Error) {
                    linearLayoutCompat = this.this$0.f91951w;
                    if (linearLayoutCompat == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                        linearLayoutCompat = null;
                    }
                    ViewVisibleExtKt.toVisible(linearLayoutCompat);
                    oneFontTextView = this.this$0.f91948t;
                    if (oneFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                        oneFontTextView = null;
                    }
                    ViewVisibleExtKt.toGone(oneFontTextView);
                    cardView = this.this$0.f91952x;
                    if (cardView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                    } else {
                        cardView4 = cardView;
                    }
                    ViewVisibleExtKt.toGone(cardView4);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneMnpPricePlansState oneMnpPricePlansState, @Nullable Continuation<? super Unit> continuation) {
            return ((C147841) create(oneMnpPricePlansState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpTruePackageSetFragment$setupObserve$1$1(OneMnpViewModel oneMnpViewModel, OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment, Continuation<? super OneMnpTruePackageSetFragment$setupObserve$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpTruePackageSetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpTruePackageSetFragment$setupObserve$1$1(this.$this_apply, this.this$0, continuation);
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
            StateFlow<OneMnpPricePlansState> packageListState = this.$this_apply.getPackageListState();
            C147841 c147841 = new C147841(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(packageListState, c147841, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpTruePackageSetFragment$setupObserve$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}