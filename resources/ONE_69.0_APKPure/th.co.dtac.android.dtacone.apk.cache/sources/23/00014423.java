package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.IdCardDataItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$CustomerAndInstallAddressSection$2 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$CustomerAndInstallAddressSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ GisStatusOrderData $gisInfo;
    final /* synthetic */ IdCardDataItem $idCardType;
    final /* synthetic */ String $idCardValue;
    final /* synthetic */ Function0<Unit> $onTakePhoto;
    final /* synthetic */ ReviewImageState $reviewImageState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewScreenKt$CustomerAndInstallAddressSection$2(IdCardDataItem idCardDataItem, String str, CustomerInformation customerInformation, GisStatusOrderData gisStatusOrderData, ReviewImageState reviewImageState, Function0<Unit> function0, int i) {
        super(2);
        this.$idCardType = idCardDataItem;
        this.$idCardValue = str;
        this.$customerInfo = customerInformation;
        this.$gisInfo = gisStatusOrderData;
        this.$reviewImageState = reviewImageState;
        this.$onTakePhoto = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ReviewScreenKt.m9446c(this.$idCardType, this.$idCardValue, this.$customerInfo, this.$gisInfo, this.$reviewImageState, this.$onTakePhoto, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}