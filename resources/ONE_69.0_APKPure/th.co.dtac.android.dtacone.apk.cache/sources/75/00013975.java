package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateBlacklist3OperData;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$validateBlacklist3Oper$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$validateBlacklist3Oper$3 extends Lambda implements Function1<OnePostpaidValidateBlacklist3OperResponse, Unit> {
    final /* synthetic */ Function1<String, Unit> $onExtraAdvanceMasterCallback;
    final /* synthetic */ Function1<String, Unit> $onSuccessCallback;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnePostpaidRegistrationViewModel$validateBlacklist3Oper$3(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$onSuccessCallback = function1;
        this.$onExtraAdvanceMasterCallback = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidateBlacklist3OperResponse onePostpaidValidateBlacklist3OperResponse) {
        invoke2(onePostpaidValidateBlacklist3OperResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidateBlacklist3OperResponse onePostpaidValidateBlacklist3OperResponse) {
        OnePostpaidRepository onePostpaidRepository;
        OneErrorService oneErrorService;
        OnePostpaidRepository onePostpaidRepository2;
        this.this$0.setValidateBlacklist3OperResponse(onePostpaidValidateBlacklist3OperResponse.getData());
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        ValidateBlacklist3OperData data = onePostpaidValidateBlacklist3OperResponse.getData();
        String status = data != null ? data.getStatus() : null;
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
        Function1<String, Unit> function1 = this.$onSuccessCallback;
        Function1<String, Unit> function12 = this.$onExtraAdvanceMasterCallback;
        onePostpaidRepository = onePostpaidRegistrationViewModel.f94609b;
        onePostpaidRepository.setStatusColor(status);
        if (Intrinsics.areEqual(status, "GREEN")) {
            if (function1 != null) {
                onePostpaidRepository2 = onePostpaidRegistrationViewModel.f94609b;
                String statusColor = onePostpaidRepository2.getStatusColor();
                function1.invoke(statusColor != null ? statusColor : "GREEN");
            }
        } else if (Intrinsics.areEqual(status, "YELLOW")) {
            onePostpaidRegistrationViewModel.m11571n1(function12);
        } else {
            onePostpaidRegistrationViewModel.setValidateBlacklist3OperResponse(null);
            oneErrorService = onePostpaidRegistrationViewModel.f94619g;
            oneErrorService.handleException(new Throwable("ขออภัยค่ะ ไม่สามารถรับสิทธิ์ซื้อเครื่องราคาพิเศษได้"), new OneErrorService.ExceptionHandler[0]);
        }
    }
}