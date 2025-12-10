package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetListSubscriberByIDResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SubscriberByIDModel;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/SubscriberByIDModel;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetListSubscriberByIDResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel$callApiGetSubscriberByID$2 */
/* loaded from: classes9.dex */
public final class IdentityInfoViewModel$callApiGetSubscriberByID$2 extends Lambda implements Function1<GetListSubscriberByIDResponse, SubscriberByIDModel> {
    final /* synthetic */ String $identityNumber;
    final /* synthetic */ IdentityInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityInfoViewModel$callApiGetSubscriberByID$2(IdentityInfoViewModel identityInfoViewModel, String str) {
        super(1);
        this.this$0 = identityInfoViewModel;
        this.$identityNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SubscriberByIDModel invoke(@NotNull GetListSubscriberByIDResponse it) {
        CustomerEnquiryRepository customerEnquiryRepository;
        List m3227M;
        Intrinsics.checkNotNullParameter(it, "it");
        customerEnquiryRepository = this.this$0.f105284b;
        customerEnquiryRepository.setListSubscriberByID(it);
        m3227M = this.this$0.m3227M(it);
        SubscriberByIDModel subscriberByIDModel = new SubscriberByIDModel(m3227M, null, 2, null);
        subscriberByIDModel.setIdCardNumber(this.$identityNumber);
        return subscriberByIDModel;
    }
}