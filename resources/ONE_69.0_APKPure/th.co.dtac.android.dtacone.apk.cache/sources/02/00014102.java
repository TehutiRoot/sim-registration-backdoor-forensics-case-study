package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$PerformNavigatePackageCampaign$5 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$PerformNavigatePackageCampaign$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CampaignPackageListState $campaignListState;
    final /* synthetic */ NavController $navController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$PerformNavigatePackageCampaign$5(CampaignPackageListState campaignPackageListState, NavController navController, int i) {
        super(2);
        this.$campaignListState = campaignPackageListState;
        this.$navController = navController;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneTolNavGraphKt.PerformNavigatePackageCampaign(this.$campaignListState, this.$navController, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}