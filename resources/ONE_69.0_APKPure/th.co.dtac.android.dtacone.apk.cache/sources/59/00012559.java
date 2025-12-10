package th.p047co.dtac.android.dtacone.presenter.simActivation;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.presenter.simActivation.SimActivationScanBarcodePresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.simActivation.SimActivationScanBarcodePresenter$getPermissionForConfirm$3 */
/* loaded from: classes8.dex */
public final class SimActivationScanBarcodePresenter$getPermissionForConfirm$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ SimActivationScanBarcodePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimActivationScanBarcodePresenter$getPermissionForConfirm$3(SimActivationScanBarcodePresenter simActivationScanBarcodePresenter) {
        super(1);
        this.this$0 = simActivationScanBarcodePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        MrtrErrorService mrtrErrorService;
        mrtrErrorService = this.this$0.f86517c;
        final SimActivationScanBarcodePresenter simActivationScanBarcodePresenter = this.this$0;
        mrtrErrorService.handleException(th2, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.simActivation.SimActivationScanBarcodePresenter$getPermissionForConfirm$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                MrtrErrorService mrtrErrorService2;
                SimActivationScanBarcodePresenter.View view;
                ErrorCollection errorCollection = new ErrorCollection();
                if (!(th3 instanceof ServerErrorException)) {
                    mrtrErrorService2 = SimActivationScanBarcodePresenter.this.f86517c;
                    errorCollection.setDescription(mrtrErrorService2.getErrorMessage(th3));
                } else {
                    ServerErrorException serverErrorException = (ServerErrorException) th3;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getDescription());
                    errorCollection.setResponseDateTime(serverErrorException.error().getResponseDateTime());
                    errorCollection.setUsername(serverErrorException.error().getUsername());
                    errorCollection.setSystemMessage(serverErrorException.error().getSystemMessage());
                }
                view = SimActivationScanBarcodePresenter.this.f86520f;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view = null;
                }
                view.notHavePermissionForConfirm(errorCollection);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}