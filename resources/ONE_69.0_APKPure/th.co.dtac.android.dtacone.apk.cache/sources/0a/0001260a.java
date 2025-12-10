package th.p047co.dtac.android.dtacone.repository.customer_enquiry;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetListSubscriberByIDResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Subscriber;
import th.p047co.dtac.android.dtacone.model.customerenquiry.SubscriberByID;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetListSubscriberByIDResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nCustomerEnquiryRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerEnquiryRepository.kt\nth/co/dtac/android/dtacone/repository/customer_enquiry/CustomerEnquiryRepository$getListSubscriberByID$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,763:1\n1549#2:764\n1620#2,3:765\n*S KotlinDebug\n*F\n+ 1 CustomerEnquiryRepository.kt\nth/co/dtac/android/dtacone/repository/customer_enquiry/CustomerEnquiryRepository$getListSubscriberByID$1\n*L\n581#1:764\n581#1:765,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository$getListSubscriberByID$1 */
/* loaded from: classes8.dex */
public final class CustomerEnquiryRepository$getListSubscriberByID$1 extends Lambda implements Function1<GetListSubscriberByIDResponse, GetListSubscriberByIDResponse> {
    final /* synthetic */ CustomerEnquiryRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerEnquiryRepository$getListSubscriberByID$1(CustomerEnquiryRepository customerEnquiryRepository) {
        super(1);
        this.this$0 = customerEnquiryRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final GetListSubscriberByIDResponse invoke(@NotNull GetListSubscriberByIDResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<SubscriberByID> listSubscriberByID = it.getListSubscriberByID();
        CustomerEnquiryRepository customerEnquiryRepository = this.this$0;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(listSubscriberByID, 10));
        for (SubscriberByID subscriberByID : listSubscriberByID) {
            subscriberByID.setSubscriber(Subscriber.copy$default(subscriberByID.getSubscriber(), null, customerEnquiryRepository.decryptCBC(subscriberByID.getSubscriber().getFirstname()), customerEnquiryRepository.decryptCBC(subscriberByID.getSubscriber().getLastname()), null, customerEnquiryRepository.decryptCBC(subscriberByID.getSubscriber().getSubscriberNumber()), null, 41, null));
            arrayList.add(subscriberByID);
        }
        it.setListSubscriberByID(arrayList);
        return it;
    }
}