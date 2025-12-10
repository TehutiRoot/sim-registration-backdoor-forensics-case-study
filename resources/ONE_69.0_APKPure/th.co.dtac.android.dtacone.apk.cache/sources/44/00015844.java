package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.response.MrtrChangeSimExistingProfileResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.response.RecieptInfo;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$getExistingProfile$2 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$getExistingProfile$2 extends Lambda implements Function1<MrtrChangeSimExistingProfileResponse, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$getExistingProfile$2(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse) {
        invoke2(mrtrChangeSimExistingProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        String m2392o;
        String m2392o2;
        String m2392o3;
        String m2392o4;
        String m2392o5;
        String m2392o6;
        String m2392o7;
        String m2392o8;
        MutableLiveData m2416A;
        String provinceName;
        String idType;
        mrtrChangeSimRepository = this.this$0.f106258b;
        MrtrChangeSimViewModel mrtrChangeSimViewModel = this.this$0;
        RecieptInfo recieptInfo = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        String str = "";
        m2392o = mrtrChangeSimViewModel.m2392o((recieptInfo == null || (r3 = recieptInfo.getFirstName()) == null) ? "" : "");
        MrtrChangeSimViewModel mrtrChangeSimViewModel2 = this.this$0;
        RecieptInfo recieptInfo2 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2392o2 = mrtrChangeSimViewModel2.m2392o((recieptInfo2 == null || (r5 = recieptInfo2.getLastName()) == null) ? "" : "");
        RecieptInfo recieptInfo3 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        String str2 = (recieptInfo3 == null || (idType = recieptInfo3.getIdType()) == null) ? "" : idType;
        MrtrChangeSimViewModel mrtrChangeSimViewModel3 = this.this$0;
        RecieptInfo recieptInfo4 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2392o3 = mrtrChangeSimViewModel3.m2392o((recieptInfo4 == null || (r7 = recieptInfo4.getIdNumber()) == null) ? "" : "");
        MrtrChangeSimViewModel mrtrChangeSimViewModel4 = this.this$0;
        RecieptInfo recieptInfo5 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2392o4 = mrtrChangeSimViewModel4.m2392o((recieptInfo5 == null || (r8 = recieptInfo5.getAddress2()) == null) ? "" : "");
        MrtrChangeSimViewModel mrtrChangeSimViewModel5 = this.this$0;
        RecieptInfo recieptInfo6 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2392o5 = mrtrChangeSimViewModel5.m2392o((recieptInfo6 == null || (r9 = recieptInfo6.getAddress1()) == null) ? "" : "");
        MrtrChangeSimViewModel mrtrChangeSimViewModel6 = this.this$0;
        RecieptInfo recieptInfo7 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2392o6 = mrtrChangeSimViewModel6.m2392o((recieptInfo7 == null || (r10 = recieptInfo7.getPostcode()) == null) ? "" : "");
        MrtrChangeSimViewModel mrtrChangeSimViewModel7 = this.this$0;
        RecieptInfo recieptInfo8 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2392o7 = mrtrChangeSimViewModel7.m2392o((recieptInfo8 == null || (r11 = recieptInfo8.getAmphurName()) == null) ? "" : "");
        MrtrChangeSimViewModel mrtrChangeSimViewModel8 = this.this$0;
        RecieptInfo recieptInfo9 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        if (recieptInfo9 != null && (provinceName = recieptInfo9.getProvinceName()) != null) {
            str = provinceName;
        }
        m2392o8 = mrtrChangeSimViewModel8.m2392o(str);
        mrtrChangeSimRepository.setExistingProfileResponse(new MrtrChangeSimExistingProfileResponse(new RecieptInfo(m2392o, m2392o2, str2, m2392o3, m2392o4, m2392o5, m2392o6, m2392o7, m2392o8)));
        m2416A = this.this$0.m2416A();
        m2416A.postValue(Resource.Companion.success("onComplete"));
    }
}