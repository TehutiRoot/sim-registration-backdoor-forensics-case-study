package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$callAPICheckBlacklistSharing$2 */
/* loaded from: classes9.dex */
public final class ESimPostpaidViewModel$callAPICheckBlacklistSharing$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ESimPostpaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidViewModel$callAPICheckBlacklistSharing$2(ESimPostpaidViewModel eSimPostpaidViewModel) {
        super(1);
        this.this$0 = eSimPostpaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        MrtrErrorService mrtrErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mrtrErrorService = this.this$0.f105745g;
        final ESimPostpaidViewModel eSimPostpaidViewModel = this.this$0;
        mrtrErrorService.handleException(throwable, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidViewModel$callAPICheckBlacklistSharing$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@NotNull Throwable e) {
                MrtrErrorService mrtrErrorService2;
                MutableLiveData m2838a0;
                MrtrErrorService mrtrErrorService3;
                MutableLiveData m2800t0;
                Intrinsics.checkNotNullParameter(e, "e");
                mrtrErrorService2 = ESimPostpaidViewModel.this.f105745g;
                if (!Intrinsics.areEqual(mrtrErrorService2.getErrorCode(e), "10055613")) {
                    m2838a0 = ESimPostpaidViewModel.this.m2838a0();
                    m2838a0.postValue(Resource.Companion.success(null));
                    return;
                }
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(e instanceof ServerErrorException)) {
                    mrtrErrorService3 = ESimPostpaidViewModel.this.f105745g;
                    errorCollection.setDescription(mrtrErrorService3.getErrorMessage(e));
                } else {
                    errorCollection = ((ServerErrorException) e).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                }
                m2800t0 = ESimPostpaidViewModel.this.m2800t0();
                m2800t0.setValue(Resource.Companion.success(errorCollection));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}