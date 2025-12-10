package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.IdentityInfoModel;
import th.p047co.dtac.android.dtacone.repository.customer_enquiry.CustomerEnquiryRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/customerenquiry/IdentityInfoModel;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel$callPermitCheckIDNumberProfile$permitDisposable$4 */
/* loaded from: classes9.dex */
public final class C16487xe3a4812d extends Lambda implements Function1<IdentityInfoModel, Unit> {
    final /* synthetic */ IdentityInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16487xe3a4812d(IdentityInfoViewModel identityInfoViewModel) {
        super(1);
        this.this$0 = identityInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IdentityInfoModel identityInfoModel) {
        invoke2(identityInfoModel);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IdentityInfoModel it) {
        CustomerEnquiryRepository customerEnquiryRepository;
        MutableLiveData m3237C;
        MutableLiveData m3200z;
        int countCondition;
        customerEnquiryRepository = this.this$0.f105284b;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        customerEnquiryRepository.setIdentityInfoModel(it);
        m3237C = this.this$0.m3237C();
        m3237C.postValue(Resource.Companion.success(it));
        this.this$0.m3204v();
        m3200z = this.this$0.m3200z();
        countCondition = this.this$0.countCondition(it);
        m3200z.postValue(Integer.valueOf(countCondition));
    }
}