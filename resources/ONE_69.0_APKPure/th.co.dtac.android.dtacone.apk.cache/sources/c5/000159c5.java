package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

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
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.validate_barcode.response.MrtrPrepaidValidateBarcodeResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSubscriber;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$checkSimStock$1 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$checkSimStock$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ MrtrPrepaidValidateBarcodeResponse $response;
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$checkSimStock$1(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel, MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
        this.$response = mrtrPrepaidValidateBarcodeResponse;
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
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        mrtrErrorService = this.this$0.f106674f;
        final MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel = this.this$0;
        final MrtrPrepaidValidateBarcodeResponse mrtrPrepaidValidateBarcodeResponse = this.$response;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$checkSimStock$1.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                MutableLiveData m2098U;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th2 instanceof ServerErrorException)) {
                    mrtrErrorService2 = MrtrPrepaidMultiSimViewModel.this.f106674f;
                    errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th2));
                } else {
                    errorCollection = ((ServerErrorException) th2).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                }
                ErrorCollection errorCollection2 = errorCollection;
                m2098U = MrtrPrepaidMultiSimViewModel.this.m2098U();
                m2098U.setValue(Resource.Companion.success(new MultiSubscriber(errorCollection2, null, mrtrPrepaidValidateBarcodeResponse, null, null, null, 58, null)));
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}