package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$SubDistrictList$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$SubDistrictList$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $districtId;
    final /* synthetic */ Function1<SubDistrict, Unit> $onSubDistrictSelect;
    final /* synthetic */ int $provinceId;
    final /* synthetic */ int $subDistrictId;
    final /* synthetic */ List<SubDistrict> $subDistrictList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$SubDistrictList$2(List<SubDistrict> list, int i, int i2, int i3, Function1<? super SubDistrict, Unit> function1, int i4) {
        super(2);
        this.$subDistrictList = list;
        this.$provinceId = i;
        this.$districtId = i2;
        this.$subDistrictId = i3;
        this.$onSubDistrictSelect = function1;
        this.$$changed = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputInfoScreenKt.m9522G(this.$subDistrictList, this.$provinceId, this.$districtId, this.$subDistrictId, this.$onSubDistrictSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}