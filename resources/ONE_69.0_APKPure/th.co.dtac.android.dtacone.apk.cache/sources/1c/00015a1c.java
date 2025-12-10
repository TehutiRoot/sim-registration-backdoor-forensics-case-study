package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.family_sim.FamilySimPostpaidNumberResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/family_sim/FamilySimPostpaidNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel$validateFamilySimPostpaidNumber$3 */
/* loaded from: classes9.dex */
public final class C16665xb9d884fc extends Lambda implements Function1<FamilySimPostpaidNumberResponse, Unit> {
    final /* synthetic */ MrtrPrepaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16665xb9d884fc(MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FamilySimPostpaidNumberResponse familySimPostpaidNumberResponse) {
        invoke2(familySimPostpaidNumberResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FamilySimPostpaidNumberResponse familySimPostpaidNumberResponse) {
        MutableLiveData m2047A;
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m2047A = this.this$0.m2047A();
        m2047A.postValue(Resource.Companion.success(familySimPostpaidNumberResponse));
    }
}