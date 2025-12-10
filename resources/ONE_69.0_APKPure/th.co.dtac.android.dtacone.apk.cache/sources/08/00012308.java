package th.p047co.dtac.android.dtacone.presenter.dtacAtHome;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.presenter.dtacAtHome.CheckMapPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.dtacAtHome.CheckMapPresenter$getPlaceAutoComplete$4 */
/* loaded from: classes8.dex */
public final class CheckMapPresenter$getPlaceAutoComplete$4 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CheckMapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckMapPresenter$getPlaceAutoComplete$4(CheckMapPresenter checkMapPresenter) {
        super(1);
        this.this$0 = checkMapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ServerErrorService errorService = this.this$0.getErrorService();
        final CheckMapPresenter checkMapPresenter = this.this$0;
        errorService.handleException(th2, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.presenter.dtacAtHome.CheckMapPresenter$getPlaceAutoComplete$4.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                CheckMapPresenter.View view;
                CheckMapPresenter.View view2;
                CheckMapPresenter.View view3 = null;
                if ((th3 instanceof HttpException) && ((HttpException) th3).code() == 404) {
                    view2 = CheckMapPresenter.this.f85722d;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    } else {
                        view3 = view2;
                    }
                    view3.onShowPlaceListNotFound();
                    return;
                }
                ErrorCollection errorCollection = new ErrorCollection();
                if (th3 instanceof ServerErrorException) {
                    ServerErrorException serverErrorException = (ServerErrorException) th3;
                    errorCollection.setStatusCode(serverErrorException.error().getStatusCode());
                    errorCollection.setDescription(serverErrorException.error().getDescription());
                } else {
                    errorCollection.setDescription(CheckMapPresenter.this.getErrorService().getErrorMessage(th3));
                }
                view = CheckMapPresenter.this.f85722d;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view3 = view;
                }
                view3.onLoadPlaceAutoCompleteFailed(errorCollection);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}