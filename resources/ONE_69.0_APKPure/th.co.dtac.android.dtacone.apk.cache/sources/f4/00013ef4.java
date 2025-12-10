package th.p047co.dtac.android.dtacone.view.appOne.sellerID.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.states.OneShopListState;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel;
import th.p047co.dtac.android.dtacone.widget.loading.DtacProgressDialog;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneShopListFragment$onViewCreated$1$1", m29092f = "OneShopListFragment.kt", m29091i = {}, m29090l = {92}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneShopListFragment$onViewCreated$1$1 */
/* loaded from: classes10.dex */
public final class OneShopListFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneShopListFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lth/co/dtac/android/dtacone/view/appOne/sellerID/states/OneShopListState;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneShopListFragment$onViewCreated$1$1$1", m29092f = "OneShopListFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneShopListFragment$onViewCreated$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C151531 extends SuspendLambda implements Function2<OneShopListState, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneShopListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C151531(OneShopListFragment oneShopListFragment, Continuation<? super C151531> continuation) {
            super(2, continuation);
            this.this$0 = oneShopListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C151531 c151531 = new C151531(this.this$0, continuation);
            c151531.L$0 = obj;
            return c151531;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                OneShopListState oneShopListState = (OneShopListState) this.L$0;
                if (oneShopListState instanceof OneShopListState.Loading) {
                    DtacProgressDialog.show(this.this$0.getContext());
                } else if (oneShopListState instanceof OneShopListState.Success) {
                    DtacProgressDialog.cancel(this.this$0.getContext());
                } else if (oneShopListState instanceof OneShopListState.Error) {
                    DtacProgressDialog.cancel(this.this$0.getContext());
                } else {
                    Intrinsics.areEqual(oneShopListState, OneShopListState.Initial.INSTANCE);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OneShopListState oneShopListState, @Nullable Continuation<? super Unit> continuation) {
            return ((C151531) create(oneShopListState, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShopListFragment$onViewCreated$1$1(OneShopListFragment oneShopListFragment, Continuation<? super OneShopListFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oneShopListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneShopListFragment$onViewCreated$1$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        OneSellerViewModel oneSellerViewModel;
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
            oneSellerViewModel = this.this$0.f97114i;
            if (oneSellerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopListViewModel");
                oneSellerViewModel = null;
            }
            StateFlow<OneShopListState> shopListState = oneSellerViewModel.getShopListState();
            C151531 c151531 = new C151531(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(shopListState, c151531, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneShopListFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}