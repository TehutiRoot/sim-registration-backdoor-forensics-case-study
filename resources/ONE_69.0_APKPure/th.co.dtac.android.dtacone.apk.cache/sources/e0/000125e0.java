package th.p047co.dtac.android.dtacone.presenter.withDevice;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.presenter.withDevice.ValidateImeiPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.withDevice.ValidateImeiPresenter$validateImei$3 */
/* loaded from: classes8.dex */
public final class ValidateImeiPresenter$validateImei$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ValidateImeiPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValidateImeiPresenter$validateImei$3(ValidateImeiPresenter validateImeiPresenter) {
        super(1);
        this.this$0 = validateImeiPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ValidateImeiPresenter.View view;
        view = this.this$0.f86752d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.onResumeScanImei();
        ServerErrorService errorService = this.this$0.getErrorService();
        final ValidateImeiPresenter validateImeiPresenter = this.this$0;
        errorService.handleException(th2, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.withDevice.ValidateImeiPresenter$validateImei$3.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@NotNull Throwable e) {
                ValidateImeiPresenter.View view2;
                Intrinsics.checkNotNullParameter(e, "e");
                ErrorCollection errorCollection = new ErrorCollection();
                if (e instanceof ServerErrorException) {
                    ServerErrorException serverErrorException = (ServerErrorException) e;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getDescription());
                } else {
                    errorCollection.setDescription(ValidateImeiPresenter.this.getErrorService().getErrorMessage(e));
                }
                view2 = ValidateImeiPresenter.this.f86752d;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    view2 = null;
                }
                view2.onValidateError(errorCollection);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}