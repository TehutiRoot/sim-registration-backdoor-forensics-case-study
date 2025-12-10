package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$callAPICheckBlacklistSharing$2 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleViewModel$callAPICheckBlacklistSharing$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneDeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleViewModel$callAPICheckBlacklistSharing$2(OneDeviceSaleViewModel oneDeviceSaleViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleViewModel;
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
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        oneErrorService = this.this$0.f90688f;
        final OneDeviceSaleViewModel oneDeviceSaleViewModel = this.this$0;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSaleViewModel$callAPICheckBlacklistSharing$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                MutableLiveData m14393V;
                OneErrorService oneErrorService3;
                OneErrorService oneErrorService4;
                MutableLiveData m14346v0;
                oneErrorService2 = OneDeviceSaleViewModel.this.f90688f;
                if (!Intrinsics.areEqual(oneErrorService2.getErrorCode(th2), "10055613")) {
                    m14393V = OneDeviceSaleViewModel.this.m14393V();
                    m14393V.postValue(Resource.Companion.success(null));
                    return;
                }
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    oneErrorService3 = OneDeviceSaleViewModel.this.f90688f;
                    errorCollection.setDescription(oneErrorService3.getErrorMessage(th2));
                    oneErrorService4 = OneDeviceSaleViewModel.this.f90688f;
                    errorCollection.setSystemMessage(oneErrorService4.getSystemMessage(th2));
                } else {
                    ServerErrorException serverErrorException = (ServerErrorException) th2;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getDescription());
                    errorCollection.setSystemMessage(serverErrorException.error().getSystemMessage());
                }
                m14346v0 = OneDeviceSaleViewModel.this.m14346v0();
                m14346v0.postValue(Resource.Companion.success(errorCollection));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}