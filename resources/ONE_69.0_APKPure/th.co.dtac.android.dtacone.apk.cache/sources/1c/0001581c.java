package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.response.MrtrChangeSimExistingProfileResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_change_sim.existing_profile.response.RecieptInfo;
import th.p047co.dtac.android.dtacone.repository.mrtr_change_sim.MrtrChangeSimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_change_sim/existing_profile/response/MrtrChangeSimExistingProfileResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimValidateViewModel$getExistingProfile$3 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimValidateViewModel$getExistingProfile$3 extends Lambda implements Function1<MrtrChangeSimExistingProfileResponse, Unit> {
    final /* synthetic */ MrtrChangeSimValidateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimValidateViewModel$getExistingProfile$3(MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimValidateViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse) {
        invoke2(mrtrChangeSimExistingProfileResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrChangeSimExistingProfileResponse mrtrChangeSimExistingProfileResponse) {
        MrtrChangeSimRepository mrtrChangeSimRepository;
        String m2422h;
        String m2422h2;
        String m2422h3;
        String m2422h4;
        String m2422h5;
        String m2422h6;
        String m2422h7;
        String m2422h8;
        MutableLiveData mutableLiveData;
        String provinceName;
        String idType;
        mrtrChangeSimRepository = this.this$0.f106213b;
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel = this.this$0;
        RecieptInfo recieptInfo = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        String str = "";
        m2422h = mrtrChangeSimValidateViewModel.m2422h((recieptInfo == null || (r3 = recieptInfo.getFirstName()) == null) ? "" : "");
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel2 = this.this$0;
        RecieptInfo recieptInfo2 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2422h2 = mrtrChangeSimValidateViewModel2.m2422h((recieptInfo2 == null || (r5 = recieptInfo2.getLastName()) == null) ? "" : "");
        RecieptInfo recieptInfo3 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        String str2 = (recieptInfo3 == null || (idType = recieptInfo3.getIdType()) == null) ? "" : idType;
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel3 = this.this$0;
        RecieptInfo recieptInfo4 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2422h3 = mrtrChangeSimValidateViewModel3.m2422h((recieptInfo4 == null || (r7 = recieptInfo4.getIdNumber()) == null) ? "" : "");
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel4 = this.this$0;
        RecieptInfo recieptInfo5 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2422h4 = mrtrChangeSimValidateViewModel4.m2422h((recieptInfo5 == null || (r8 = recieptInfo5.getAddress2()) == null) ? "" : "");
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel5 = this.this$0;
        RecieptInfo recieptInfo6 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2422h5 = mrtrChangeSimValidateViewModel5.m2422h((recieptInfo6 == null || (r9 = recieptInfo6.getAddress1()) == null) ? "" : "");
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel6 = this.this$0;
        RecieptInfo recieptInfo7 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2422h6 = mrtrChangeSimValidateViewModel6.m2422h((recieptInfo7 == null || (r10 = recieptInfo7.getPostcode()) == null) ? "" : "");
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel7 = this.this$0;
        RecieptInfo recieptInfo8 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        m2422h7 = mrtrChangeSimValidateViewModel7.m2422h((recieptInfo8 == null || (r11 = recieptInfo8.getAmphurName()) == null) ? "" : "");
        MrtrChangeSimValidateViewModel mrtrChangeSimValidateViewModel8 = this.this$0;
        RecieptInfo recieptInfo9 = mrtrChangeSimExistingProfileResponse.getRecieptInfo();
        if (recieptInfo9 != null && (provinceName = recieptInfo9.getProvinceName()) != null) {
            str = provinceName;
        }
        m2422h8 = mrtrChangeSimValidateViewModel8.m2422h(str);
        mrtrChangeSimRepository.setExistingProfileResponse(new MrtrChangeSimExistingProfileResponse(new RecieptInfo(m2422h, m2422h2, str2, m2422h3, m2422h4, m2422h5, m2422h6, m2422h7, m2422h8)));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mutableLiveData = this.this$0.f106226o;
        mutableLiveData.setValue(Resource.Companion.success(mrtrChangeSimExistingProfileResponse));
    }
}