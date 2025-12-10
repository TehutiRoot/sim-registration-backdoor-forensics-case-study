package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

import androidx.compose.material3.SheetState;
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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.SubDistrict;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$AddressSelectSheet$3 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$AddressSelectSheet$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ boolean $canBack;
    final /* synthetic */ int $districtId;
    final /* synthetic */ List<District> $districtList;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function1<District, Unit> $onDistrictSelect;
    final /* synthetic */ Function1<PostCode, Unit> $onPostCodeSelect;
    final /* synthetic */ Function1<Province, Unit> $onProvinceSelect;
    final /* synthetic */ Function1<SubDistrict, Unit> $onSubDistrictSelect;
    final /* synthetic */ String $postCode;
    final /* synthetic */ List<PostCode> $postCodeList;
    final /* synthetic */ int $provinceId;
    final /* synthetic */ List<Province> $provinceList;
    final /* synthetic */ AddressSelectType $selectType;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ int $subDistrictId;
    final /* synthetic */ List<SubDistrict> $subDistrictList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$AddressSelectSheet$3(AddressSelectType addressSelectType, SheetState sheetState, int i, int i2, int i3, String str, List<Province> list, List<District> list2, List<SubDistrict> list3, List<PostCode> list4, boolean z, Function1<? super Province, Unit> function1, Function1<? super District, Unit> function12, Function1<? super SubDistrict, Unit> function13, Function1<? super PostCode, Unit> function14, Function0<Unit> function0, Function0<Unit> function02, int i4, int i5) {
        super(2);
        this.$selectType = addressSelectType;
        this.$sheetState = sheetState;
        this.$provinceId = i;
        this.$districtId = i2;
        this.$subDistrictId = i3;
        this.$postCode = str;
        this.$provinceList = list;
        this.$districtList = list2;
        this.$subDistrictList = list3;
        this.$postCodeList = list4;
        this.$canBack = z;
        this.$onProvinceSelect = function1;
        this.$onDistrictSelect = function12;
        this.$onSubDistrictSelect = function13;
        this.$onPostCodeSelect = function14;
        this.$onBack = function0;
        this.$onDismiss = function02;
        this.$$changed = i4;
        this.$$changed1 = i5;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputInfoScreenKt.m9515f(this.$selectType, this.$sheetState, this.$provinceId, this.$districtId, this.$subDistrictId, this.$postCode, this.$provinceList, this.$districtList, this.$subDistrictList, this.$postCodeList, this.$canBack, this.$onProvinceSelect, this.$onDistrictSelect, this.$onSubDistrictSelect, this.$onPostCodeSelect, this.$onBack, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}