package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoModel;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoResponse;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoModel;", "kotlin.jvm.PlatformType", "response", "Lth/co/dtac/android/dtacone/model/customerenquiry/DataUsageInfoResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$callApiGetPrepaidDataUsageInfo$getDataDisposable$2 */
/* loaded from: classes9.dex */
public final class C16498x9333cb75 extends Lambda implements Function1<DataUsageInfoResponse, DataUsageInfoModel> {
    final /* synthetic */ InfoAnalyticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16498x9333cb75(InfoAnalyticViewModel infoAnalyticViewModel) {
        super(1);
        this.this$0 = infoAnalyticViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DataUsageInfoModel invoke(@NotNull DataUsageInfoResponse response) {
        CustomerEnquiryRepository customerEnquiryRepository;
        String arpuaverage3months;
        Intrinsics.checkNotNullParameter(response, "response");
        customerEnquiryRepository = this.this$0.f105345b;
        DataUsageInfoModel dataUsageInfoModel = customerEnquiryRepository.getDataUsageInfoModel();
        if (dataUsageInfoModel.isOnline()) {
            arpuaverage3months = dataUsageInfoModel.getArpuaverage3months();
        } else {
            arpuaverage3months = response.getArpuaverage3months();
        }
        dataUsageInfoModel.setArpuaverage3months(arpuaverage3months);
        dataUsageInfoModel.setBehavior(response.getBehavior());
        dataUsageInfoModel.setCustomerNumber(response.getCustomerNumber());
        dataUsageInfoModel.setGeneratedPeriod(response.getGeneratedPeriod());
        dataUsageInfoModel.setInternetusagevolumnaverage3months(response.getInternetusagevolumnaverage3months());
        dataUsageInfoModel.setMinuteofuseaverage3months(response.getMinuteofuseaverage3months());
        dataUsageInfoModel.setRefillamountaverage3months(response.getRefillamountaverage3months());
        dataUsageInfoModel.setRefillaverage3months(response.getRefillaverage3months());
        dataUsageInfoModel.setRetentionGrade(response.getRetentionGrade());
        dataUsageInfoModel.setSubscriberNumber(response.getSubscriberNumber());
        return dataUsageInfoModel;
    }
}