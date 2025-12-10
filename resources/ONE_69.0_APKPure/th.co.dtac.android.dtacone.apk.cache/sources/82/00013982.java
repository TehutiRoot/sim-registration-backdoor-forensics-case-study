package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateExistingCustomerScoreData;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;
import th.p047co.dtac.android.dtacone.view.fragment.upPass.UpPassFormFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$validateExistingCustomerScore$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$validateExistingCustomerScore$3 extends Lambda implements Function1<OneValidateExistingCustomerScoreResponse, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$validateExistingCustomerScore$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse) {
        invoke2(oneValidateExistingCustomerScoreResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse) {
        String status;
        OnePostpaidRepository onePostpaidRepository;
        OneErrorService oneErrorService;
        MutableLiveData m11539u2;
        MutableLiveData m11590j2;
        this.this$0.setValidateExistingCustomerScoreResponse(oneValidateExistingCustomerScoreResponse.getData());
        ValidateExistingCustomerScoreData data = oneValidateExistingCustomerScoreResponse.getData();
        if (data == null || (status = data.getStatus()) == null) {
            return;
        }
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
        onePostpaidRepository = onePostpaidRegistrationViewModel.f94609b;
        onePostpaidRepository.setStatusColor(status);
        if (Intrinsics.areEqual(status, "GREEN")) {
            onePostpaidRegistrationViewModel.getLiveDataState().setValue(StatusResource.DISMISS);
            onePostpaidRegistrationViewModel.getLiveDataState().setValue(StatusResource.SUCCESS);
            if (onePostpaidRegistrationViewModel.isFaceRecog()) {
                m11590j2 = onePostpaidRegistrationViewModel.m11590j2();
                m11590j2.setValue(new Event(new FragmentNavEvent(UpPassFormFragment.class, null, null, 4, null)));
                return;
            }
            m11539u2 = onePostpaidRegistrationViewModel.m11539u2();
            m11539u2.postValue(Resource.Companion.success(2));
        } else if (Intrinsics.areEqual(status, "YELLOW")) {
            OnePostpaidRegistrationViewModel.m11566o1(onePostpaidRegistrationViewModel, null, 1, null);
        } else {
            onePostpaidRegistrationViewModel.getLiveDataState().setValue(StatusResource.DISMISS);
            oneErrorService = onePostpaidRegistrationViewModel.f94619g;
            oneErrorService.handleExceptionCallback(new Throwable("ขออภัยค่ะ ไม่สามารถรับสิทธิ์ซื้อเครื่องราคาพิเศษได้"), new OneErrorService.ExceptionHandler[0], new C15016x43aa05b1(onePostpaidRegistrationViewModel));
        }
    }
}