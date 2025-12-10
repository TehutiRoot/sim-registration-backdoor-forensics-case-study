package th.p047co.dtac.android.dtacone.view.appOne.mnp.viewModel;

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
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$getCutSIMStock$1$1 */
/* loaded from: classes10.dex */
public final class OneMnpViewModel$getCutSIMStock$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneMnpViewModel$getCutSIMStock$1$1(OneMnpViewModel oneMnpViewModel) {
        super(1);
        this.this$0 = oneMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        oneErrorService = this.this$0.f92124e;
        final OneMnpViewModel oneMnpViewModel = this.this$0;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.mnp.viewModel.OneMnpViewModel$getCutSIMStock$1$1.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                MutableLiveData m13414u1;
                if (!(th2 instanceof HttpException) || ((HttpException) th2).code() != 404) {
                    ErrorCollection errorCollection = new ErrorCollection();
                    if (!(th2 instanceof ServerErrorException)) {
                        oneErrorService2 = OneMnpViewModel.this.f92124e;
                        errorCollection.setDescription(oneErrorService2.getErrorMessage(th2));
                    } else {
                        ServerErrorException serverErrorException = (ServerErrorException) th2;
                        errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                        errorCollection.setDescription(serverErrorException.error().getSystemMessage());
                    }
                    OneMnpViewModel.this.setCutSimStockError(errorCollection);
                }
                if (!OneMnpViewModel.this.isCheckSimStock() || !OneMnpViewModel.this.isUserLan()) {
                    m13414u1 = OneMnpViewModel.this.m13414u1();
                    m13414u1.setValue(Resource.Companion.success(null));
                    return;
                }
                OneMnpViewModel.this.callSaveResult();
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}