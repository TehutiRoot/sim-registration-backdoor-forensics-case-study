package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.List;
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
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.PricePlanListItem;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPackageAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$3", m29092f = "OneMnpTruePackageSetFragment.kt", m29091i = {}, m29090l = {SyslogConstants.LOG_LOCAL4}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$3 */
/* loaded from: classes10.dex */
public final class OneMnpTruePackageSetFragment$setupObserve$1$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpTruePackageSetFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "packages", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PricePlanListItem;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$3$1", m29092f = "OneMnpTruePackageSetFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.trueCompany.OneMnpTruePackageSetFragment$setupObserve$1$3$1 */
    /* loaded from: classes10.dex */
    public static final class C147861 extends SuspendLambda implements Function2<List<? extends PricePlanListItem>, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneMnpViewModel $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpTruePackageSetFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147861(OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment, OneMnpViewModel oneMnpViewModel, Continuation<? super C147861> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpTruePackageSetFragment;
            this.$this_apply = oneMnpViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147861 c147861 = new C147861(this.this$0, this.$this_apply, continuation);
            c147861.L$0 = obj;
            return c147861;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends PricePlanListItem> list, Continuation<? super Unit> continuation) {
            return invoke2((List<PricePlanListItem>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LinearLayoutCompat linearLayoutCompat;
            OneFontTextView oneFontTextView;
            CardView cardView;
            RecyclerView recyclerView;
            CardView cardView2;
            LinearLayoutCompat linearLayoutCompat2;
            OneFontTextView oneFontTextView2;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                RecyclerView recyclerView4 = null;
                if (!list.isEmpty()) {
                    cardView2 = this.this$0.f91952x;
                    if (cardView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView2 = null;
                    }
                    ViewVisibleExtKt.toGone(cardView2);
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
                    recyclerView2 = this.this$0.f91953y;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("packageListView");
                        recyclerView2 = null;
                    }
                    ViewVisibleExtKt.toVisible(recyclerView2);
                    recyclerView3 = this.this$0.f91953y;
                    if (recyclerView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("packageListView");
                    } else {
                        recyclerView4 = recyclerView3;
                    }
                    OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment = this.this$0;
                    OneMnpViewModel oneMnpViewModel = this.$this_apply;
                    recyclerView4.setLayoutManager(new LinearLayoutManager(recyclerView4.getContext()));
                    recyclerView4.setAdapter(new OneMnpPackageAdapter(list, new OneMnpTruePackageSetFragment$setupObserve$1$3$1$1$1(oneMnpTruePackageSetFragment), new OneMnpTruePackageSetFragment$setupObserve$1$3$1$1$2(oneMnpViewModel, oneMnpTruePackageSetFragment)));
                } else {
                    linearLayoutCompat = this.this$0.f91951w;
                    if (linearLayoutCompat == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutRetry");
                        linearLayoutCompat = null;
                    }
                    ViewVisibleExtKt.toGone(linearLayoutCompat);
                    oneFontTextView = this.this$0.f91948t;
                    if (oneFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                        oneFontTextView = null;
                    }
                    ViewVisibleExtKt.toVisible(oneFontTextView);
                    cardView = this.this$0.f91952x;
                    if (cardView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView = null;
                    }
                    ViewVisibleExtKt.toGone(cardView);
                    recyclerView = this.this$0.f91953y;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("packageListView");
                    } else {
                        recyclerView4 = recyclerView;
                    }
                    ViewVisibleExtKt.toGone(recyclerView4);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull List<PricePlanListItem> list, @Nullable Continuation<? super Unit> continuation) {
            return ((C147861) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpTruePackageSetFragment$setupObserve$1$3(OneMnpViewModel oneMnpViewModel, OneMnpTruePackageSetFragment oneMnpTruePackageSetFragment, Continuation<? super OneMnpTruePackageSetFragment$setupObserve$1$3> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpTruePackageSetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpTruePackageSetFragment$setupObserve$1$3(this.$this_apply, this.this$0, continuation);
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
            StateFlow<List<PricePlanListItem>> filterPackageDetailListState = this.$this_apply.getFilterPackageDetailListState();
            C147861 c147861 = new C147861(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (FlowKt.collectLatest(filterPackageDetailListState, c147861, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpTruePackageSetFragment$setupObserve$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}