package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$PackageCard$3 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$PackageCard$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MarketingDetails $marketingResponse;
    final /* synthetic */ Function0<Unit> $onSelect;
    final /* synthetic */ String $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCodeSelectScreenKt$PackageCard$3(MarketingDetails marketingDetails, String str, Function0<Unit> function0, int i) {
        super(2);
        this.$marketingResponse = marketingDetails;
        this.$query = str;
        this.$onSelect = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        MarketingCodeSelectScreenKt.m9385g(this.$marketingResponse, this.$query, this.$onSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}