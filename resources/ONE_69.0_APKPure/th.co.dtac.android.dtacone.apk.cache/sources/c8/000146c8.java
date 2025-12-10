package th.p047co.dtac.android.dtacone.view.appOne.topup.viewModel;

import androidx.lifecycle.MutableLiveData;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel$getTopUpPriceList$3 */
/* loaded from: classes10.dex */
public final class OneTopUpViewModel$getTopUpPriceList$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneTopUpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTopUpViewModel$getTopUpPriceList$3(OneTopUpViewModel oneTopUpViewModel) {
        super(1);
        this.this$0 = oneTopUpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        OneErrorService oneErrorService;
        MutableLiveData m9211b0;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (th2 instanceof NoSuchElementException) {
            m9211b0 = this.this$0.m9211b0();
            m9211b0.setValue(Resource.Companion.error(String.valueOf(th2.getMessage()), null, 0));
            return;
        }
        oneErrorService = this.this$0.f98536d;
        final OneTopUpViewModel oneTopUpViewModel = this.this$0;
        oneErrorService.handleException(th2, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.topup.viewModel.OneTopUpViewModel$getTopUpPriceList$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                MutableLiveData m9213a0;
                OneErrorService oneErrorService2;
                m9213a0 = OneTopUpViewModel.this.m9213a0();
                Resource.Companion companion = Resource.Companion;
                oneErrorService2 = OneTopUpViewModel.this.f98536d;
                String errorMessage = oneErrorService2.getErrorMessage(th3);
                if (errorMessage == null) {
                    errorMessage = "";
                }
                m9213a0.setValue(companion.error(errorMessage, null, 0));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}