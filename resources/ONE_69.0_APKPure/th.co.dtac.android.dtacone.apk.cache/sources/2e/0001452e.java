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
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.SmartSearchData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.EntryFeeData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.SmartSearchListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$OneSmartSearchScreen$2 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$OneSmartSearchScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ EntryFeeData $entryFeeData;
    final /* synthetic */ boolean $isDiscountFeeSelect;
    final /* synthetic */ Function1<String, Unit> $onSearch;
    final /* synthetic */ Function2<String, String, Unit> $onSelect;
    final /* synthetic */ Function1<SmartSearchData, Unit> $onSelectDetail;
    final /* synthetic */ List<SmartSearchData> $smartSearchItemSelected;
    final /* synthetic */ SmartSearchListState $smartSearchState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSmartSearchScreenKt$OneSmartSearchScreen$2(EntryFeeData entryFeeData, SmartSearchListState smartSearchListState, List<SmartSearchData> list, boolean z, Function2<? super String, ? super String, Unit> function2, Function1<? super SmartSearchData, Unit> function1, Function1<? super String, Unit> function12, int i) {
        super(2);
        this.$entryFeeData = entryFeeData;
        this.$smartSearchState = smartSearchListState;
        this.$smartSearchItemSelected = list;
        this.$isDiscountFeeSelect = z;
        this.$onSelect = function2;
        this.$onSelectDetail = function1;
        this.$onSearch = function12;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneSmartSearchScreenKt.OneSmartSearchScreen(this.$entryFeeData, this.$smartSearchState, this.$smartSearchItemSelected, this.$isDiscountFeeSelect, this.$onSelect, this.$onSelectDetail, this.$onSearch, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}