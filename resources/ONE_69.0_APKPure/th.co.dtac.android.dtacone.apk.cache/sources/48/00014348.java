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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.District;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$DistrictList$2 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$DistrictList$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $districtId;
    final /* synthetic */ List<District> $districtList;
    final /* synthetic */ Function1<District, Unit> $onDistrictSelect;
    final /* synthetic */ int $provinceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$DistrictList$2(List<District> list, int i, int i2, Function1<? super District, Unit> function1, int i3) {
        super(2);
        this.$districtList = list;
        this.$provinceId = i;
        this.$districtId = i2;
        this.$onDistrictSelect = function1;
        this.$$changed = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputInfoScreenKt.m9511j(this.$districtList, this.$provinceId, this.$districtId, this.$onDistrictSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}