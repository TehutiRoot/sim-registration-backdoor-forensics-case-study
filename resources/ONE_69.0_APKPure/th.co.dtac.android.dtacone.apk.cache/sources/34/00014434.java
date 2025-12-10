package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.IdCardDataItem;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.ReviewImageState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.review.ReviewScreenKt$ReviewScreen$5 */
/* loaded from: classes10.dex */
public final class ReviewScreenKt$ReviewScreen$5 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CustomerInformation $customerInfo;
    final /* synthetic */ GisStatusOrderData $gisInfo;
    final /* synthetic */ IdCardDataItem $idCardType;
    final /* synthetic */ String $idCardValue;
    final /* synthetic */ InstallInformation $installInfo;
    final /* synthetic */ boolean $isIdCardReader;
    final /* synthetic */ Function1<Integer, Unit> $onDeleteImage;
    final /* synthetic */ Function0<Unit> $onNext;
    final /* synthetic */ Function0<Unit> $onTakePhoto;
    final /* synthetic */ ReviewImageState $reviewImageState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReviewScreenKt$ReviewScreen$5(ReviewImageState reviewImageState, IdCardDataItem idCardDataItem, String str, boolean z, CustomerInformation customerInformation, GisStatusOrderData gisStatusOrderData, InstallInformation installInformation, Function1<? super Integer, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$reviewImageState = reviewImageState;
        this.$idCardType = idCardDataItem;
        this.$idCardValue = str;
        this.$isIdCardReader = z;
        this.$customerInfo = customerInformation;
        this.$gisInfo = gisStatusOrderData;
        this.$installInfo = installInformation;
        this.$onDeleteImage = function1;
        this.$onTakePhoto = function0;
        this.$onNext = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        ReviewScreenKt.ReviewScreen(this.$reviewImageState, this.$idCardType, this.$idCardValue, this.$isIdCardReader, this.$customerInfo, this.$gisInfo, this.$installInfo, this.$onDeleteImage, this.$onTakePhoto, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}