package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.Subscriber;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidActivateSimType;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel$cutSimStock$1$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidRegistrationViewModel$cutSimStock$1$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $nontelcoConsentType;
    final /* synthetic */ boolean $redirectToActivate;
    final /* synthetic */ MrtrPrepaidRegisterRequest $registerRequest;
    final /* synthetic */ MrtrPrepaidRegisterResponse $response;
    final /* synthetic */ MrtrPrepaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidRegistrationViewModel$cutSimStock$1$2(MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel, MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse, boolean z, MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, String str) {
        super(1);
        this.this$0 = mrtrPrepaidRegistrationViewModel;
        this.$response = mrtrPrepaidRegisterResponse;
        this.$redirectToActivate = z;
        this.$registerRequest = mrtrPrepaidRegisterRequest;
        this.$nontelcoConsentType = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MrtrErrorService mrtrErrorService;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrErrorService = this.this$0.f106729h;
        final MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel = this.this$0;
        final MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse = this.$response;
        final boolean z = this.$redirectToActivate;
        final MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.$registerRequest;
        final String str = this.$nontelcoConsentType;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel$cutSimStock$1$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                String str2;
                Subscriber subscriber;
                if (!(th2 instanceof HttpException) || ((HttpException) th2).code() != 404) {
                    ErrorCollection errorCollection = new ErrorCollection();
                    if (!(th2 instanceof ServerErrorException)) {
                        mrtrErrorService2 = MrtrPrepaidRegistrationViewModel.this.f106729h;
                        errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th2));
                    } else {
                        ServerErrorException serverErrorException = (ServerErrorException) th2;
                        errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                        errorCollection.setDescription(serverErrorException.error().getSystemMessage());
                    }
                    MrtrPrepaidRegistrationViewModel.this.setCutSimStockError(errorCollection);
                }
                if (MrtrPrepaidRegistrationViewModel.this.isCheckSimStock()) {
                    MrtrPrepaidRegistrationViewModel.this.m2042F(mrtrPrepaidRegisterResponse, z, mrtrPrepaidRegisterRequest, str);
                } else if (z) {
                    MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest2 = mrtrPrepaidRegisterRequest;
                    if (mrtrPrepaidRegisterRequest2 != null && (subscriber = mrtrPrepaidRegisterRequest2.getSubscriber()) != null) {
                        str2 = subscriber.getSimType();
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.areEqual(str2, PrepaidActivateSimType.PUSH_MODE)) {
                        MrtrPrepaidRegistrationViewModel.this.assignPooling();
                    } else {
                        MrtrPrepaidRegistrationViewModel.this.activatePrepaid();
                    }
                } else {
                    MrtrPrepaidRegistrationViewModel.this.getLiveDataState().setValue(StatusResource.SUCCESS);
                }
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}