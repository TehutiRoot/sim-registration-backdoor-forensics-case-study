package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.DeviceSIMInfo;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSIMInfo;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.SubscriberInfoViewModel$callGetDeviceSIMInfoApi$4 */
/* loaded from: classes9.dex */
public final class SubscriberInfoViewModel$callGetDeviceSIMInfoApi$4 extends Lambda implements Function1<DeviceSIMInfo, Unit> {
    final /* synthetic */ boolean $showErr;
    final /* synthetic */ SubscriberInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberInfoViewModel$callGetDeviceSIMInfoApi$4(SubscriberInfoViewModel subscriberInfoViewModel, boolean z) {
        super(1);
        this.this$0 = subscriberInfoViewModel;
        this.$showErr = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DeviceSIMInfo deviceSIMInfo) {
        invoke2(deviceSIMInfo);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DeviceSIMInfo it) {
        boolean m3081c0;
        MutableLiveData m3086Z;
        CustomerEnquiryRepository customerEnquiryRepository;
        MutableLiveData m3091U;
        MutableLiveData m3091U2;
        MutableLiveData m3086Z2;
        SubscriberInfoViewModel subscriberInfoViewModel = this.this$0;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        m3081c0 = subscriberInfoViewModel.m3081c0(it);
        if (m3081c0) {
            m3086Z2 = this.this$0.m3086Z();
            m3086Z2.postValue(Integer.valueOf(R.drawable.icon_information_red));
        } else {
            m3086Z = this.this$0.m3086Z();
            m3086Z.postValue(Integer.valueOf(R.drawable.icon_information));
        }
        customerEnquiryRepository = this.this$0.f105402b;
        customerEnquiryRepository.setDeviceSIMInfoStore(it);
        if (this.$showErr) {
            m3091U2 = this.this$0.m3091U();
            m3091U2.setValue(Resource.Companion.success(it));
        } else if (this.this$0.isESIMFlag() || this.this$0.getPendingEsimCard().length() > 0) {
            this.this$0.m3099M();
        } else {
            m3091U = this.this$0.m3091U();
            m3091U.setValue(Resource.Companion.success(it));
        }
    }
}