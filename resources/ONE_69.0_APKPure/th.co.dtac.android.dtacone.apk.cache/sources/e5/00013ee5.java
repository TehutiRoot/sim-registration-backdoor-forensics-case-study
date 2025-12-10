package th.p047co.dtac.android.dtacone.view.appOne.sellerID.fragment;

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
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$1", m29092f = "OneOtherShopListFragment.kt", m29091i = {}, m29090l = {90}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$1 */
/* loaded from: classes10.dex */
public final class OneOtherShopListFragment$onViewCreated$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneSellerViewModel $this_apply;
    int label;
    final /* synthetic */ OneOtherShopListFragment this$0;

    @Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "shop", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/ShopData;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$1$1", m29092f = "OneOtherShopListFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$1$1 */
    /* loaded from: classes10.dex */
    public static final class C151471 extends SuspendLambda implements Function2<ShopData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneOtherShopListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C151471(OneOtherShopListFragment oneOtherShopListFragment, Continuation<? super C151471> continuation) {
            super(2, continuation);
            this.this$0 = oneOtherShopListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C151471 c151471 = new C151471(this.this$0, continuation);
            c151471.L$0 = obj;
            return c151471;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OneFontTextView oneFontTextView;
            OneFontTextView oneFontTextView2;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                ShopData shopData = (ShopData) this.L$0;
                if (shopData != null) {
                    OneOtherShopListFragment oneOtherShopListFragment = this.this$0;
                    oneFontTextView = oneOtherShopListFragment.f97102p;
                    OneFontTextView oneFontTextView3 = null;
                    if (oneFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSellerName");
                        oneFontTextView = null;
                    }
                    oneFontTextView.setText(shopData.getRtrName());
                    oneFontTextView2 = oneOtherShopListFragment.f97103q;
                    if (oneFontTextView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSellerId");
                    } else {
                        oneFontTextView3 = oneFontTextView2;
                    }
                    oneFontTextView3.setText(shopData.getRtrCode());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable ShopData shopData, @Nullable Continuation<? super Unit> continuation) {
            return ((C151471) create(shopData, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOtherShopListFragment$onViewCreated$1$1(OneSellerViewModel oneSellerViewModel, OneOtherShopListFragment oneOtherShopListFragment, Continuation<? super OneOtherShopListFragment$onViewCreated$1$1> continuation) {
        super(2, continuation);
        this.$this_apply = oneSellerViewModel;
        this.this$0 = oneOtherShopListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneOtherShopListFragment$onViewCreated$1$1(this.$this_apply, this.this$0, continuation);
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
            StateFlow<ShopData> currentShop = this.$this_apply.getCurrentShop();
            C151471 c151471 = new C151471(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(currentShop, c151471, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneOtherShopListFragment$onViewCreated$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}