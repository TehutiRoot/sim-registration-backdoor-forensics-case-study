package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.MutableState;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.UniqueSortedSpeedData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$OneSelectCampaignScreen$1", m29092f = "OneCampaignPackageScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$OneSelectCampaignScreen$1 */
/* loaded from: classes10.dex */
public final class OneCampaignPackageScreenKt$OneSelectCampaignScreen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<UniqueSortedSpeedData> $buttonFilter$delegate;
    final /* synthetic */ MutableState<List<Campaign>> $campaignsResp$delegate;
    final /* synthetic */ CampaignPackageListState $uiState;
    final /* synthetic */ MutableState<List<UniqueSortedSpeedData>> $uniqueSpeed$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignPackageScreenKt$OneSelectCampaignScreen$1(CampaignPackageListState campaignPackageListState, MutableState<List<Campaign>> mutableState, MutableState<List<UniqueSortedSpeedData>> mutableState2, MutableState<UniqueSortedSpeedData> mutableState3, Continuation<? super OneCampaignPackageScreenKt$OneSelectCampaignScreen$1> continuation) {
        super(2, continuation);
        this.$uiState = campaignPackageListState;
        this.$campaignsResp$delegate = mutableState;
        this.$uniqueSpeed$delegate = mutableState2;
        this.$buttonFilter$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneCampaignPackageScreenKt$OneSelectCampaignScreen$1(this.$uiState, this.$campaignsResp$delegate, this.$uniqueSpeed$delegate, this.$buttonFilter$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List m9380e;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CampaignPackageListState campaignPackageListState = this.$uiState;
            if (campaignPackageListState instanceof CampaignPackageListState.Success) {
                MutableState<List<Campaign>> mutableState = this.$campaignsResp$delegate;
                Intrinsics.checkNotNull(campaignPackageListState, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState.Success");
                OneCampaignPackageScreenKt.m9377h(mutableState, ((CampaignPackageListState.Success) campaignPackageListState).getData().getData().getCampaignList());
                MutableState<List<UniqueSortedSpeedData>> mutableState2 = this.$uniqueSpeed$delegate;
                CampaignPackageListState campaignPackageListState2 = this.$uiState;
                Intrinsics.checkNotNull(campaignPackageListState2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState.Success");
                OneCampaignPackageScreenKt.m9379f(mutableState2, ((CampaignPackageListState.Success) campaignPackageListState2).getData().getData().getUniqueSortedSpeedList());
                MutableState<UniqueSortedSpeedData> mutableState3 = this.$buttonFilter$delegate;
                m9380e = OneCampaignPackageScreenKt.m9380e(this.$uniqueSpeed$delegate);
                OneCampaignPackageScreenKt.m9373l(mutableState3, (UniqueSortedSpeedData) m9380e.get(0));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneCampaignPackageScreenKt$OneSelectCampaignScreen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}