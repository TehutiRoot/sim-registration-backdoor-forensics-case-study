package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mnp.IdCardInformationCollection;
import th.p047co.dtac.android.dtacone.viewmodel.customerenquiry.CustomerSmartCardPresenter;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "cardInformation", "Lth/co/dtac/android/dtacone/model/mnp/IdCardInformationCollection;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.CustomerSmartCardPresenter$fetchCardData$3 */
/* loaded from: classes9.dex */
public final class CustomerSmartCardPresenter$fetchCardData$3 extends Lambda implements Function1<IdCardInformationCollection, Unit> {
    final /* synthetic */ CustomerSmartCardPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSmartCardPresenter$fetchCardData$3(CustomerSmartCardPresenter customerSmartCardPresenter) {
        super(1);
        this.this$0 = customerSmartCardPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IdCardInformationCollection idCardInformationCollection) {
        invoke2(idCardInformationCollection);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable IdCardInformationCollection idCardInformationCollection) {
        CustomerSmartCardPresenter.View view;
        view = this.this$0.f105258k;
        if (view != null) {
            view.onSuccessReadFinish(idCardInformationCollection);
        }
    }
}