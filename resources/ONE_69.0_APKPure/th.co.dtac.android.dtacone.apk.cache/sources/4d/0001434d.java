package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$InputInfoScreen$10 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$InputInfoScreen$10 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ int $districtId;
    final /* synthetic */ List<District> $districtList;
    final /* synthetic */ boolean $isSmartCard;
    final /* synthetic */ Function1<CustomerInformation, Unit> $onCustomerInfoChange;
    final /* synthetic */ Function0<Unit> $onNext;
    final /* synthetic */ List<PostCode> $postCodeList;
    final /* synthetic */ int $provinceId;
    final /* synthetic */ List<Province> $provinceList;
    final /* synthetic */ int $subDistrictId;
    final /* synthetic */ List<SubDistrict> $subDistrictList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$InputInfoScreen$10(CustomerInformation customerInformation, boolean z, int i, int i2, int i3, List<Province> list, List<District> list2, List<SubDistrict> list3, List<PostCode> list4, Function1<? super CustomerInformation, Unit> function1, Function0<Unit> function0, int i4, int i5) {
        super(2);
        this.$customerInfo = customerInformation;
        this.$isSmartCard = z;
        this.$provinceId = i;
        this.$districtId = i2;
        this.$subDistrictId = i3;
        this.$provinceList = list;
        this.$districtList = list2;
        this.$subDistrictList = list3;
        this.$postCodeList = list4;
        this.$onCustomerInfoChange = function1;
        this.$onNext = function0;
        this.$$changed = i4;
        this.$$changed1 = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputInfoScreenKt.InputInfoScreen(this.$customerInfo, this.$isSmartCard, this.$provinceId, this.$districtId, this.$subDistrictId, this.$provinceList, this.$districtList, this.$subDistrictList, this.$postCodeList, this.$onCustomerInfoChange, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}