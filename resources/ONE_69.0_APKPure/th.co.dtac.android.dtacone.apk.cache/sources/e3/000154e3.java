package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetSubscriberMainBalanceResponse;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetSubscriberMainBalanceResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel$callApiGetSubscriberNumberMainBalance$getBalanceDisposable$3 */
/* loaded from: classes9.dex */
public final class C16512x88b676d7 extends Lambda implements Function1<GetSubscriberMainBalanceResponse, Unit> {
    final /* synthetic */ SubscriberInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16512x88b676d7(SubscriberInfoViewModel subscriberInfoViewModel) {
        super(1);
        this.this$0 = subscriberInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetSubscriberMainBalanceResponse getSubscriberMainBalanceResponse) {
        invoke2(getSubscriberMainBalanceResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(GetSubscriberMainBalanceResponse getSubscriberMainBalanceResponse) {
        CustomerEnquiryRepository customerEnquiryRepository;
        MutableLiveData mutableLiveData;
        customerEnquiryRepository = this.this$0.f105402b;
        customerEnquiryRepository.setMainBalance(getSubscriberMainBalanceResponse.getBalance(), getSubscriberMainBalanceResponse.getSos(), getSubscriberMainBalanceResponse.getCeDate());
        mutableLiveData = this.this$0.f105410j;
        mutableLiveData.setValue(Resource.Companion.success(getSubscriberMainBalanceResponse));
    }
}