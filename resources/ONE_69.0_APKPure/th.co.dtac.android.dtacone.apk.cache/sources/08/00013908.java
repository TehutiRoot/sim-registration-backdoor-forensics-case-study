package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidRegisSuccessFragment;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$callCutSIMStock$1$1 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$callCutSIMStock$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$callCutSIMStock$1$1(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(it, "it");
        oneErrorService = this.this$0.f94619g;
        final OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
        oneErrorService.handleException(it, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$callCutSIMStock$1$1.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                MutableLiveData m11600h2;
                if (!(th2 instanceof HttpException) || ((HttpException) th2).code() != 404) {
                    ErrorCollection errorCollection = new ErrorCollection();
                    if (!(th2 instanceof ServerErrorException)) {
                        oneErrorService2 = OnePostpaidRegistrationViewModel.this.f94619g;
                        errorCollection.setDescription(oneErrorService2.getErrorMessage(th2));
                    } else {
                        ServerErrorException serverErrorException = (ServerErrorException) th2;
                        errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                        errorCollection.setDescription(serverErrorException.error().getSystemMessage());
                    }
                    OnePostpaidRegistrationViewModel.this.setCutSimStockError(errorCollection);
                }
                if (OnePostpaidRegistrationViewModel.this.isCheckSimStock() && OnePostpaidRegistrationViewModel.this.isUserLan()) {
                    OnePostpaidRegistrationViewModel.this.callSaveResult();
                    return;
                }
                OnePostpaidRegistrationViewModel.this.getLiveDataState().setValue(StatusResource.SUCCESS);
                m11600h2 = OnePostpaidRegistrationViewModel.this.m11600h2();
                m11600h2.setValue(new Event(new FragmentNavEvent(MrtrPostpaidRegisSuccessFragment.class, null, null, 4, null)));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}