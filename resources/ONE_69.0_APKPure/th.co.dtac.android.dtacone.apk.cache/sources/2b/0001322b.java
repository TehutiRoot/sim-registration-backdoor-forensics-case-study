package th.p047co.dtac.android.dtacone.view.appOne.mnp.fragment;

import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.decorator.DividerItemDecoration;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.model.appOne.mnp.response.PropositionData;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.adapter.OneMnpPropositionAdapter;
import th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$2", m29092f = "OneMnpPropositionFragment.kt", m29091i = {}, m29090l = {131}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$2 */
/* loaded from: classes10.dex */
public final class OneMnpPropositionFragment$setupObserve$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneMnpViewModel $this_apply;
    int label;
    final /* synthetic */ OneMnpPropositionFragment this$0;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m29142d2 = {"<anonymous>", "", "proposition", "", "Lth/co/dtac/android/dtacone/model/appOne/mnp/response/PropositionData;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    @DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$2$1", m29092f = "OneMnpPropositionFragment.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.fragment.OneMnpPropositionFragment$setupObserve$1$2$1 */
    /* loaded from: classes10.dex */
    public static final class C147521 extends SuspendLambda implements Function2<List<? extends PropositionData>, Continuation<? super Unit>, Object> {
        final /* synthetic */ OneMnpViewModel $this_apply;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ OneMnpPropositionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147521(OneMnpPropositionFragment oneMnpPropositionFragment, OneMnpViewModel oneMnpViewModel, Continuation<? super C147521> continuation) {
            super(2, continuation);
            this.this$0 = oneMnpPropositionFragment;
            this.$this_apply = oneMnpViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C147521 c147521 = new C147521(this.this$0, this.$this_apply, continuation);
            c147521.L$0 = obj;
            return c147521;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends PropositionData> list, Continuation<? super Unit> continuation) {
            return invoke2((List<PropositionData>) list, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v8, types: [th.co.dtac.android.dtacone.app_one.widget.OneFontTextView] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CardView cardView;
            ?? r7;
            CardView cardView2;
            OneFontTextView oneFontTextView;
            RecyclerView recyclerView;
            AbstractC19782eg0.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                List list = (List) this.L$0;
                RecyclerView recyclerView2 = null;
                if (!list.isEmpty()) {
                    cardView2 = this.this$0.f91636x;
                    if (cardView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView2 = null;
                    }
                    ViewVisibleExtKt.toVisible(cardView2);
                    oneFontTextView = this.this$0.f91632t;
                    if (oneFontTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                        oneFontTextView = null;
                    }
                    ViewVisibleExtKt.toGone(oneFontTextView);
                    recyclerView = this.this$0.f91637y;
                    if (recyclerView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("propositionListView");
                    } else {
                        recyclerView2 = recyclerView;
                    }
                    OneMnpPropositionFragment oneMnpPropositionFragment = this.this$0;
                    OneMnpViewModel oneMnpViewModel = this.$this_apply;
                    recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
                    recyclerView2.setAdapter(new OneMnpPropositionAdapter(list, new OneMnpPropositionFragment$setupObserve$1$2$1$1$1(oneMnpPropositionFragment), new OneMnpPropositionFragment$setupObserve$1$2$1$1$2(oneMnpViewModel, oneMnpPropositionFragment)));
                    Drawable drawable = ContextCompat.getDrawable(recyclerView2.getContext(), R.drawable.item_one_decoration_divider);
                    if (drawable != null) {
                        recyclerView2.addItemDecoration(new DividerItemDecoration(drawable));
                    }
                } else {
                    cardView = this.this$0.f91636x;
                    if (cardView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cardView");
                        cardView = null;
                    }
                    ViewVisibleExtKt.toGone(cardView);
                    r7 = this.this$0.f91632t;
                    if (r7 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("tvWarningMessage");
                    } else {
                        recyclerView2 = r7;
                    }
                    ViewVisibleExtKt.toVisible(recyclerView2);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull List<PropositionData> list, @Nullable Continuation<? super Unit> continuation) {
            return ((C147521) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpPropositionFragment$setupObserve$1$2(OneMnpViewModel oneMnpViewModel, OneMnpPropositionFragment oneMnpPropositionFragment, Continuation<? super OneMnpPropositionFragment$setupObserve$1$2> continuation) {
        super(2, continuation);
        this.$this_apply = oneMnpViewModel;
        this.this$0 = oneMnpPropositionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneMnpPropositionFragment$setupObserve$1$2(this.$this_apply, this.this$0, continuation);
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
            StateFlow<List<PropositionData>> filterPropositionListState = this.$this_apply.getFilterPropositionListState();
            C147521 c147521 = new C147521(this.this$0, this.$this_apply, null);
            this.label = 1;
            if (FlowKt.collectLatest(filterPropositionListState, c147521, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneMnpPropositionFragment$setupObserve$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}