package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$checkSimStock$5 */
/* loaded from: classes9.dex */
public final class ESimViewModel$checkSimStock$5 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$checkSimStock$5(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
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
        mrtrErrorService = this.this$0.f105827i;
        final ESimViewModel eSimViewModel = this.this$0;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$checkSimStock$5.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                ESimRepository eSimRepository;
                MutableLiveData m2768I0;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    mrtrErrorService2 = ESimViewModel.this.f105827i;
                    errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th2));
                } else {
                    ServerErrorException serverErrorException = (ServerErrorException) th2;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getSystemMessage());
                }
                eSimRepository = ESimViewModel.this.f105820b;
                eSimRepository.setCheckSimStockErrorPhysical(errorCollection);
                m2768I0 = ESimViewModel.this.m2768I0();
                m2768I0.setValue(Resource.Companion.success(errorCollection.getStatusCode()));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}