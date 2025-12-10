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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$PostCodeList$4 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$PostCodeList$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $districtId;
    final /* synthetic */ Function1<PostCode, Unit> $onPostCodeSelect;
    final /* synthetic */ String $postCode;
    final /* synthetic */ List<PostCode> $postCodeList;
    final /* synthetic */ int $provinceId;
    final /* synthetic */ int $subDistrictId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$PostCodeList$4(List<PostCode> list, int i, int i2, int i3, String str, Function1<? super PostCode, Unit> function1, int i4) {
        super(2);
        this.$postCodeList = list;
        this.$provinceId = i;
        this.$districtId = i2;
        this.$subDistrictId = i3;
        this.$postCode = str;
        this.$onPostCodeSelect = function1;
        this.$$changed = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        InputInfoScreenKt.m9527B(this.$postCodeList, this.$provinceId, this.$districtId, this.$subDistrictId, this.$postCode, this.$onPostCodeSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}