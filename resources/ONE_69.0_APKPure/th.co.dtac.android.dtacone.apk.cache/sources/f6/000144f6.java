package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.UniqueSortedSpeedData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$3$1 */
/* loaded from: classes10.dex */
public final class OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$3$1 extends Lambda implements Function1<UniqueSortedSpeedData, Unit> {
    final /* synthetic */ MutableState<UniqueSortedSpeedData> $buttonFilter$delegate;
    final /* synthetic */ MutableState<String> $filterText$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$3$1(MutableState<UniqueSortedSpeedData> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$buttonFilter$delegate = mutableState;
        this.$filterText$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UniqueSortedSpeedData uniqueSortedSpeedData) {
        invoke2(uniqueSortedSpeedData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull UniqueSortedSpeedData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OneCampaignPackageScreenKt.m9373l(this.$buttonFilter$delegate, it);
        OneCampaignPackageScreenKt.m9375j(this.$filterText$delegate, "");
    }
}