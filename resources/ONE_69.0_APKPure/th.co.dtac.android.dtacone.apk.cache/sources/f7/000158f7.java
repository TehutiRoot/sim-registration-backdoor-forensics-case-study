package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidRegisSuccessFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$callCutSIMStock$1$1 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$callCutSIMStock$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidRegistrationViewModel$callCutSIMStock$1$1(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
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
        mrtrErrorService = this.this$0.f106479g;
        final MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel = this.this$0;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$callCutSIMStock$1$1.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                MutableLiveData m2282b0;
                if (!(th2 instanceof HttpException) || ((HttpException) th2).code() != 404) {
                    ErrorCollection errorCollection = new ErrorCollection();
                    if (!(th2 instanceof ServerErrorException)) {
                        mrtrErrorService2 = MrtrPostpaidRegistrationViewModel.this.f106479g;
                        errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th2));
                    } else {
                        ServerErrorException serverErrorException = (ServerErrorException) th2;
                        errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                        errorCollection.setDescription(serverErrorException.error().getSystemMessage());
                    }
                    MrtrPostpaidRegistrationViewModel.this.setCutSimStockError(errorCollection);
                }
                if (MrtrPostpaidRegistrationViewModel.this.isCheckSimStock() && MrtrPostpaidRegistrationViewModel.this.isUserLan()) {
                    MrtrPostpaidRegistrationViewModel.this.callSaveResult();
                    return;
                }
                MrtrPostpaidRegistrationViewModel.this.getLiveDataState().setValue(StatusResource.SUCCESS);
                m2282b0 = MrtrPostpaidRegistrationViewModel.this.m2282b0();
                m2282b0.setValue(new Event(new FragmentNavEvent(MrtrPostpaidRegisSuccessFragment.class, null, null, 4, null)));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}