package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DataUsageInfoModel;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetOfferUpsellResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersInformation;
import th.p047co.dtac.android.dtacone.model.customerenquiry.OffersPackage;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendedPackageModel;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "", "packageResponse", "Lkotlin/Pair;", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetOfferUpsellResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nInfoAnalyticViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoAnalyticViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/customerenquiry/InfoAnalyticViewModel$callApiGetRecommendedPackage$recommendPackage$6\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,972:1\n1#2:973\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$callApiGetRecommendedPackage$recommendPackage$6 */
/* loaded from: classes9.dex */
public final class C16503x4e5a84c0 extends Lambda implements Function1<Pair<? extends RecommendPackageResponse, ? extends GetOfferUpsellResponse>, Unit> {
    final /* synthetic */ InfoAnalyticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16503x4e5a84c0(InfoAnalyticViewModel infoAnalyticViewModel) {
        super(1);
        this.this$0 = infoAnalyticViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends RecommendPackageResponse, ? extends GetOfferUpsellResponse> pair) {
        invoke2((Pair<RecommendPackageResponse, GetOfferUpsellResponse>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<RecommendPackageResponse, GetOfferUpsellResponse> pair) {
        MutableLiveData m3198A0;
        MutableLiveData m3194C0;
        CustomerEnquiryRepository customerEnquiryRepository;
        String str;
        List<Offer> offerList;
        MutableLiveData m3194C02;
        MutableLiveData m3194C03;
        MutableLiveData m3194C04;
        OffersInformation offersInformation;
        CustomerEnquiryRepository customerEnquiryRepository2;
        MutableLiveData m3198A02;
        MutableLiveData m3136n0;
        int m3180J0;
        boolean z = false;
        if (!pair.getFirst().isError()) {
            customerEnquiryRepository2 = this.this$0.f105345b;
            InfoAnalyticViewModel infoAnalyticViewModel = this.this$0;
            customerEnquiryRepository2.setOfferInformation(pair.getFirst().getOffersInformation());
            List<OffersPackage> offersPackage = pair.getFirst().getOffersPackage();
            if (offersPackage == null) {
                offersPackage = CollectionsKt__CollectionsKt.emptyList();
            }
            customerEnquiryRepository2.setOfferPackageList(offersPackage);
            RecommendedPackageModel offerInfo = customerEnquiryRepository2.getOfferInfo();
            List<String> flowIds = pair.getFirst().getFlowIds();
            if (flowIds == null) {
                flowIds = CollectionsKt__CollectionsKt.emptyList();
            }
            offerInfo.setFlowIds(flowIds);
            offerInfo.setRequesterId(pair.getFirst().getRequesterId());
            offerInfo.setPackageGroupRefNo(pair.getFirst().getPackageGroupRefNo());
            List<OffersPackage> offersPackage2 = pair.getFirst().getOffersPackage();
            infoAnalyticViewModel.setRecommendCount(offersPackage2 != null ? offersPackage2.size() : 0);
            DataUsageInfoModel dataUsageInfoModel = customerEnquiryRepository2.getDataUsageInfoModel();
            dataUsageInfoModel.setUpsellRequestId(pair.getSecond().getRequestID());
            dataUsageInfoModel.setArpuaverage3months(pair.getFirst().getOffersInformation().getAverageArpu());
            List<Offer> offerList2 = pair.getSecond().getOfferList();
            if (offerList2 == null) {
                offerList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            dataUsageInfoModel.setOfferList(offerList2);
            dataUsageInfoModel.setOnline(true);
            m3198A02 = this.this$0.m3198A0();
            m3198A02.postValue(Resource.Companion.success(pair.getFirst()));
            m3136n0 = this.this$0.m3136n0();
            m3180J0 = this.this$0.m3180J0(pair.getFirst());
            m3136n0.postValue(Integer.valueOf(m3180J0));
        } else {
            m3198A0 = this.this$0.m3198A0();
            m3198A0.postValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        }
        if (!pair.getSecond().isError()) {
            customerEnquiryRepository = this.this$0.f105345b;
            DataUsageInfoModel dataUsageInfoModel2 = customerEnquiryRepository.getDataUsageInfoModel();
            dataUsageInfoModel2.setUpsellRequestId(pair.getSecond().getRequestID());
            RecommendPackageResponse first = pair.getFirst();
            if (first == null || (offersInformation = first.getOffersInformation()) == null || (str = offersInformation.getAverageArpu()) == null) {
                str = HelpFormatter.DEFAULT_OPT_PREFIX;
            }
            dataUsageInfoModel2.setArpuaverage3months(str);
            List<Offer> offerList3 = pair.getSecond().getOfferList();
            if (offerList3 == null) {
                offerList3 = CollectionsKt__CollectionsKt.emptyList();
            }
            dataUsageInfoModel2.setOfferList(offerList3);
            dataUsageInfoModel2.setOnline(true);
            String color = pair.getFirst().getOffersInformation().getColor();
            if (Intrinsics.areEqual(color, "1") ? true : Intrinsics.areEqual(color, "2")) {
                List<Offer> offerList4 = pair.getSecond().getOfferList();
                if (!((offerList4 == null || offerList4.isEmpty()) ? true : true)) {
                    m3194C04 = this.this$0.m3194C0();
                    m3194C04.postValue(Resource.Companion.success(new GetOfferUpsellResponse(pair.getSecond().getAverageArpu3Months(), AbstractC10100ds.listOf(new Offer(null, null, "Upsell", 0.0f, null, null, null, "ข้อเสนอที่ดีกว่า", null, null, null, 0, null, null, 0.0f, null, 65403, null)), pair.getSecond().getRequestID(), null, null, null, false, 56, null)));
                    return;
                }
                m3194C03 = this.this$0.m3194C0();
                m3194C03.postValue(Resource.Companion.success(CollectionsKt__CollectionsKt.emptyList()));
                return;
            } else if (pair.getSecond().isError() || (offerList = pair.getSecond().getOfferList()) == null) {
                return;
            } else {
                InfoAnalyticViewModel infoAnalyticViewModel2 = this.this$0;
                infoAnalyticViewModel2.callApiViewOfferUpsell(infoAnalyticViewModel2.getPackageOfferByDisplayNum(offerList));
                m3194C02 = infoAnalyticViewModel2.m3194C0();
                m3194C02.postValue(Resource.Companion.success(new GetOfferUpsellResponse(pair.getSecond().getAverageArpu3Months(), offerList, pair.getSecond().getRequestID(), null, null, null, false, 56, null)));
                return;
            }
        }
        m3194C0 = this.this$0.m3194C0();
        m3194C0.postValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
    }
}