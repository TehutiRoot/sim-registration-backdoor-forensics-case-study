package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoModel;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoResponse;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoModel;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$callApiGetPostpaidDataUsageInfo$getDataDisposable$2 */
/* loaded from: classes9.dex */
public final class C16494x893fe3ce extends Lambda implements Function1<DataUsageInfoResponse, DataUsageInfoModel> {
    final /* synthetic */ InfoAnalyticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16494x893fe3ce(InfoAnalyticViewModel infoAnalyticViewModel) {
        super(1);
        this.this$0 = infoAnalyticViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DataUsageInfoModel invoke(@NotNull DataUsageInfoResponse it) {
        CustomerEnquiryRepository customerEnquiryRepository;
        CustomerEnquiryRepository customerEnquiryRepository2;
        String arpuaverage3months;
        CustomerEnquiryRepository customerEnquiryRepository3;
        Intrinsics.checkNotNullParameter(it, "it");
        customerEnquiryRepository = this.this$0.f105345b;
        DataUsageInfoModel dataUsageInfoModel = customerEnquiryRepository.getDataUsageInfoModel();
        InfoAnalyticViewModel infoAnalyticViewModel = this.this$0;
        customerEnquiryRepository2 = infoAnalyticViewModel.f105345b;
        if (customerEnquiryRepository2.getDataUsageInfoModel().isOnline()) {
            customerEnquiryRepository3 = infoAnalyticViewModel.f105345b;
            arpuaverage3months = customerEnquiryRepository3.getDataUsageInfoModel().getArpuaverage3months();
        } else {
            arpuaverage3months = it.getArpuaverage3months();
        }
        dataUsageInfoModel.setArpuaverage3months(arpuaverage3months);
        dataUsageInfoModel.setBehavior(it.getBehavior());
        dataUsageInfoModel.setCustomerNumber(it.getCustomerNumber());
        dataUsageInfoModel.setGeneratedPeriod(it.getGeneratedPeriod());
        dataUsageInfoModel.setInternetusagevolumnaverage3months(it.getInternetusagevolumnaverage3months());
        dataUsageInfoModel.setMinuteofuseaverage3months(it.getMinuteofuseaverage3months());
        dataUsageInfoModel.setRetentionGrade(it.getRetentionGrade());
        dataUsageInfoModel.setSubscriberNumber(it.getSubscriberNumber());
        return dataUsageInfoModel;
    }
}