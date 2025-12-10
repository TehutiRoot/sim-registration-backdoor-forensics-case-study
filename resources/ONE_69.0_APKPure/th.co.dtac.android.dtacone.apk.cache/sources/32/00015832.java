package th.p047co.dtac.android.dtacone.viewmodel.mrtr_change_sim;

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
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$callAutoTransferEDMS$1 */
/* loaded from: classes9.dex */
public final class MrtrChangeSimViewModel$callAutoTransferEDMS$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ MrtrChangeSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrChangeSimViewModel$callAutoTransferEDMS$1(MrtrChangeSimViewModel mrtrChangeSimViewModel) {
        super(1);
        this.this$0 = mrtrChangeSimViewModel;
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
        it.printStackTrace();
        mrtrErrorService = this.this$0.f106265i;
        final MrtrChangeSimViewModel mrtrChangeSimViewModel = this.this$0;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_change_sim.MrtrChangeSimViewModel$callAutoTransferEDMS$1.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                MutableLiveData m2416A;
                MutableLiveData m2413D;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    mrtrErrorService2 = MrtrChangeSimViewModel.this.f106265i;
                    errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th2));
                    errorCollection.setCodeType("T");
                } else {
                    ServerErrorException serverErrorException = (ServerErrorException) th2;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getDescription());
                    errorCollection.setCodeType(serverErrorException.error().getCodeType());
                }
                if (Intrinsics.areEqual(errorCollection.getCodeType(), "B")) {
                    m2413D = MrtrChangeSimViewModel.this.m2413D();
                    m2413D.setValue(Resource.Companion.success(errorCollection));
                    return;
                }
                m2416A = MrtrChangeSimViewModel.this.m2416A();
                m2416A.postValue(Resource.Companion.error$default(Resource.Companion, Constant.ServiceAPIName.Validate, null, null, 4, null));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}