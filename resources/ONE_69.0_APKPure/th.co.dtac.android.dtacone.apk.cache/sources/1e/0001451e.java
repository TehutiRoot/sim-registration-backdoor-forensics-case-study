package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.SmartSearchData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$CampaignCardItem$4 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$CampaignCardItem$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isDiscount;
    final /* synthetic */ Function0<Unit> $onSelect;
    final /* synthetic */ Function0<Unit> $onSelectDetail;
    final /* synthetic */ String $query;
    final /* synthetic */ SmartSearchData $smartSearchData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSmartSearchScreenKt$CampaignCardItem$4(SmartSearchData smartSearchData, boolean z, String str, Function0<Unit> function0, Function0<Unit> function02, int i, int i2) {
        super(2);
        this.$smartSearchData = smartSearchData;
        this.$isDiscount = z;
        this.$query = str;
        this.$onSelect = function0;
        this.$onSelectDetail = function02;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneSmartSearchScreenKt.CampaignCardItem(this.$smartSearchData, this.$isDiscount, this.$query, this.$onSelect, this.$onSelectDetail, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}