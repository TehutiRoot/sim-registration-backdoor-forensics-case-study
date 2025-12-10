package th.p047co.dtac.android.dtacone.repository.customer_enquiry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.VerifySubscriberNumberResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/VerifySubscriberNumberResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository$verifySubscriberNumber$1 */
/* loaded from: classes8.dex */
public final class CustomerEnquiryRepository$verifySubscriberNumber$1 extends Lambda implements Function1<VerifySubscriberNumberResponse, VerifySubscriberNumberResponse> {
    final /* synthetic */ CustomerEnquiryRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerEnquiryRepository$verifySubscriberNumber$1(CustomerEnquiryRepository customerEnquiryRepository) {
        super(1);
        this.this$0 = customerEnquiryRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final VerifySubscriberNumberResponse invoke(@NotNull VerifySubscriberNumberResponse it) {
        ConfigurationRepository configurationRepository;
        ConfigurationRepository configurationRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        String customerFirstName = it.getCustomerFirstName();
        configurationRepository = this.this$0.f86813c;
        it.setCustomerFirstName(AESCryptUtil.decryptCBC(customerFirstName, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
        String customerLastName = it.getCustomerLastName();
        configurationRepository2 = this.this$0.f86813c;
        it.setCustomerLastName(AESCryptUtil.decryptCBC(customerLastName, configurationRepository2.dataPrivacyEncryptionAES256CBCKey()));
        it.setSubscriberNumberDisplay(this.this$0.decryptCBC(it.getSubscriberNumber()));
        return it;
    }
}