package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoModel;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetOfferUpsellResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoModel;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInfoAnalyticViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoAnalyticViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/customerenquiry/InfoAnalyticViewModel$callApiGetOfferUpsell$getDataDisposable$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,972:1\n1#2:973\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$callApiGetOfferUpsell$getDataDisposable$2 */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModel$callApiGetOfferUpsell$getDataDisposable$2 extends Lambda implements Function1<GetOfferUpsellResponse, DataUsageInfoModel> {
    final /* synthetic */ InfoAnalyticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAnalyticViewModel$callApiGetOfferUpsell$getDataDisposable$2(InfoAnalyticViewModel infoAnalyticViewModel) {
        super(1);
        this.this$0 = infoAnalyticViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DataUsageInfoModel invoke(@NotNull GetOfferUpsellResponse it) {
        CustomerEnquiryRepository customerEnquiryRepository;
        CustomerEnquiryRepository customerEnquiryRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        customerEnquiryRepository = this.this$0.f105345b;
        DataUsageInfoModel dataUsageInfoModel = customerEnquiryRepository.getDataUsageInfoModel();
        dataUsageInfoModel.setUpsellRequestId(it.getRequestID());
        dataUsageInfoModel.setArpuaverage3months(String.valueOf(it.getAverageArpu3Months()));
        List<Offer> offerList = it.getOfferList();
        if (offerList == null) {
            offerList = CollectionsKt__CollectionsKt.emptyList();
        }
        dataUsageInfoModel.setOfferList(offerList);
        dataUsageInfoModel.setOnline(true);
        customerEnquiryRepository2 = this.this$0.f105345b;
        return customerEnquiryRepository2.getDataUsageInfoModel();
    }
}