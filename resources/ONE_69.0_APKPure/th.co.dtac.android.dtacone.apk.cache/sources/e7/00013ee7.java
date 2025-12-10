package th.p047co.dtac.android.dtacone.view.appOne.sellerID.fragment;

import android.content.Context;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.adapter.sellerID.OneShopListAdapter;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.dialog.OneConfirmShopDialog;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData;
import th.p047co.dtac.android.dtacone.view.appOne.sellerID.viewModel.OneSellerViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$2", m29092f = "OneOtherShopListFragment.kt", m29091i = {}, m29090l = {100}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$2 */
/* loaded from: classes10.dex */
public final class OneOtherShopListFragment$onViewCreated$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneSellerViewModel $this_apply;
    int label;
    final /* synthetic */ OneOtherShopListFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "shopList", "", "Lth/co/dtac/android/dtacone/view/appOne/sellerID/model/ShopData;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$2$1", m29092f = "OneOtherShopListFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$2$1 */
    /* loaded from: classes10.dex */
    public static final class C151481 extends SuspendLambda implements Function2<List<? extends ShopData>, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneSellerViewModel $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneOtherShopListFragment this$0;

        @Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$2$1$1 */
        /* loaded from: classes10.dex */
        public static final class C151491 extends Lambda implements Function0<String> {
            final /* synthetic */ OneOtherShopListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C151491(OneOtherShopListFragment oneOtherShopListFragment) {
                super(0);
                this.this$0 = oneOtherShopListFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                OneEditText oneEditText;
                oneEditText = this.this$0.f97100n;
                if (oneEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtSearchSeller");
                    oneEditText = null;
                }
                return String.valueOf(oneEditText.getText());
            }
        }

        @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "shopName", "", "shopCode", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
        /* renamed from: th.co.dtac.android.dtacone.view.appOne.sellerID.fragment.OneOtherShopListFragment$onViewCreated$1$2$1$2 */
        /* loaded from: classes10.dex */
        public static final class C151502 extends Lambda implements Function2<String, String, Unit> {
            final /* synthetic */ OneSellerViewModel $this_apply;
            final /* synthetic */ OneOtherShopListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C151502(OneOtherShopListFragment oneOtherShopListFragment, OneSellerViewModel oneSellerViewModel) {
                super(2);
                this.this$0 = oneOtherShopListFragment;
                this.$this_apply = oneSellerViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                invoke2(str, str2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String shopName, @NotNull String shopCode) {
                Intrinsics.checkNotNullParameter(shopName, "shopName");
                Intrinsics.checkNotNullParameter(shopCode, "shopCode");
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                new OneConfirmShopDialog(requireContext, shopName, shopCode, new OneOtherShopListFragment$onViewCreated$1$2$1$2$dialog$1(this.$this_apply, shopCode)).show();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C151481(OneOtherShopListFragment oneOtherShopListFragment, OneSellerViewModel oneSellerViewModel, Continuation<? super C151481> continuation) {
            super(2, continuation);
            this.this$0 = oneOtherShopListFragment;
            this.$this_apply = oneSellerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C151481 c151481 = new C151481(this.this$0, this.$this_apply, continuation);
            c151481.L$0 = obj;
            return c151481;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends ShopData> list, Continuation<? super Unit> continuation) {
            return invoke2((List<ShopData>) list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v8, types: [th.co.dtac.android.dtacone.app_one.widget.OneFontTextView] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CardView cardView;
            ?? r10;
            CardView cardView2;
            OneFontTextView oneFontTextView;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            RecyclerView recyclerView4;
            RecyclerView recyclerView5;
            RecyclerView recyclerView6;
            OneShopListAdapter oneShopListAdapter;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                RecyclerView recyclerView7 = null;
                if (!list.isEmpty()) {
                    cardView2 = this.this$0.f97098l;
                    if (cardView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
                        cardView2 = null;
                    }
                    cardView2.setVisibility(0);
                    oneFontTextView = this.this$0.f97101o;
                    if (oneFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSellerNotFound");
                        oneFontTextView = null;
                    }
                    oneFontTextView.setVisibility(8);
                    OneOtherShopListFragment oneOtherShopListFragment = this.this$0;
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<th.co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData>{ kotlin.collections.TypeAliasesKt.ArrayList<th.co.dtac.android.dtacone.view.appOne.sellerID.model.ShopData> }");
                    oneOtherShopListFragment.f97097k = new OneShopListAdapter((ArrayList) list, new C151491(this.this$0), new C151502(this.this$0, this.$this_apply));
                    recyclerView = this.this$0.f97099m;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvShopList");
                        recyclerView = null;
                    }
                    recyclerView.setHasFixedSize(true);
                    recyclerView2 = this.this$0.f97099m;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvShopList");
                        recyclerView2 = null;
                    }
                    recyclerView2.setDrawingCacheEnabled(true);
                    recyclerView3 = this.this$0.f97099m;
                    if (recyclerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvShopList");
                        recyclerView3 = null;
                    }
                    recyclerView3.setDrawingCacheQuality(0);
                    recyclerView4 = this.this$0.f97099m;
                    if (recyclerView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvShopList");
                        recyclerView4 = null;
                    }
                    recyclerView4.setItemViewCacheSize(50);
                    recyclerView5 = this.this$0.f97099m;
                    if (recyclerView5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvShopList");
                        recyclerView5 = null;
                    }
                    recyclerView5.setLayoutManager(new LinearLayoutManager(this.this$0.getContext()));
                    recyclerView6 = this.this$0.f97099m;
                    if (recyclerView6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("rvShopList");
                    } else {
                        recyclerView7 = recyclerView6;
                    }
                    oneShopListAdapter = this.this$0.f97097k;
                    recyclerView7.setAdapter(oneShopListAdapter);
                } else {
                    cardView = this.this$0.f97098l;
                    if (cardView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("contentLayout");
                        cardView = null;
                    }
                    cardView.setVisibility(4);
                    r10 = this.this$0.f97101o;
                    if (r10 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvSellerNotFound");
                    } else {
                        recyclerView7 = r10;
                    }
                    recyclerView7.setVisibility(0);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull List<ShopData> list, @Nullable Continuation<? super Unit> continuation) {
            return ((C151481) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneOtherShopListFragment$onViewCreated$1$2(OneOtherShopListFragment oneOtherShopListFragment, OneSellerViewModel oneSellerViewModel, Continuation<? super OneOtherShopListFragment$onViewCreated$1$2> continuation) {
        super(2, continuation);
        this.this$0 = oneOtherShopListFragment;
        this.$this_apply = oneSellerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneOtherShopListFragment$onViewCreated$1$2(this.this$0, this.$this_apply, continuation);
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
            oneSellerViewModel = this.this$0.f97095i;
            if (oneSellerViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shopListViewModel");
                oneSellerViewModel = null;
            }
            StateFlow<List<ShopData>> filterListState = oneSellerViewModel.getFilterListState();
            C151481 c151481 = new C151481(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (FlowKt.collectLatest(filterListState, c151481, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneOtherShopListFragment$onViewCreated$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}