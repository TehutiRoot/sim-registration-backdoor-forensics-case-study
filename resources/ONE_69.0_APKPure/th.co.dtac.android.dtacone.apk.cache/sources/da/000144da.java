package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.EntryFeeData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.MarketingListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2", m29092f = "MarketingCodeSelectScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EntryFeeData $entryFeeData;
    final /* synthetic */ MutableState<MarketingResponse> $marketingResponse$delegate;
    final /* synthetic */ MarketingListState $marketingState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2(MarketingListState marketingListState, EntryFeeData entryFeeData, MutableState<MarketingResponse> mutableState, Continuation<? super MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2> continuation) {
        super(2, continuation);
        this.$marketingState = marketingListState;
        this.$entryFeeData = entryFeeData;
        this.$marketingResponse$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2(this.$marketingState, this.$entryFeeData, this.$marketingResponse$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$marketingState instanceof MarketingListState.Success) {
                EntryFeeData entryFeeData = this.$entryFeeData;
                System.out.println((Object) ("entryFeeData == " + entryFeeData));
                MutableState<MarketingResponse> mutableState = this.$marketingResponse$delegate;
                MarketingListState marketingListState = this.$marketingState;
                Intrinsics.checkNotNull(marketingListState, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.MarketingListState.Success");
                MarketingCodeSelectScreenKt.m9388d(mutableState, ((MarketingListState.Success) marketingListState).getData());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}