package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidConfig;
import th.p047co.dtac.android.dtacone.model.prepaid.config.FaceRecognitionByPass;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidValidateIdCardNumberViewModel$getPostCodeInfo$1$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidValidateIdCardNumberViewModel$getPostCodeInfo$1$2 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ MrtrPrepaidValidateIdCardNumberViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidValidateIdCardNumberViewModel$getPostCodeInfo$1$2(MrtrPrepaidValidateIdCardNumberViewModel mrtrPrepaidValidateIdCardNumberViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidValidateIdCardNumberViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        MrtrPrepaidRepository mrtrPrepaidRepository;
        MutableLiveData m2000c;
        MutableLiveData m1998e;
        ConfigurationRepository configurationRepository;
        FaceRecognitionByPass faceRecognitionByPass;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mrtrPrepaidRepository = this.this$0.f106804b;
        PrepaidConfig prepaidConfig = mrtrPrepaidRepository.getPrepaidConfig();
        if (Intrinsics.areEqual((prepaidConfig == null || (faceRecognitionByPass = prepaidConfig.getFaceRecognitionByPass()) == null) ? null : Boolean.valueOf(faceRecognitionByPass.getByPass()), Boolean.TRUE)) {
            m1998e = this.this$0.m1998e();
            Resource.Companion companion = Resource.Companion;
            configurationRepository = this.this$0.f106805c;
            m1998e.setValue(companion.success(Integer.valueOf(configurationRepository.prepaidRegistrationReferenceDocMax())));
            return;
        }
        m2000c = this.this$0.m2000c();
        m2000c.setValue(new Event(new FragmentNavEvent(UpPassFormFragment.class, null, null, 4, null)));
    }
}