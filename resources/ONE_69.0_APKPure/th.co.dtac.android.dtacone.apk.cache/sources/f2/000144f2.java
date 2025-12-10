package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.UniqueSortedSpeedData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$CampaignSpeedBar$2 */
/* loaded from: classes10.dex */
public final class OneCampaignPackageScreenKt$CampaignSpeedBar$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<UniqueSortedSpeedData, Unit> $callBack;
    final /* synthetic */ List<UniqueSortedSpeedData> $speedData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneCampaignPackageScreenKt$CampaignSpeedBar$2(List<UniqueSortedSpeedData> list, Function1<? super UniqueSortedSpeedData, Unit> function1, int i) {
        super(2);
        this.$speedData = list;
        this.$callBack = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneCampaignPackageScreenKt.CampaignSpeedBar(this.$speedData, this.$callBack, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}