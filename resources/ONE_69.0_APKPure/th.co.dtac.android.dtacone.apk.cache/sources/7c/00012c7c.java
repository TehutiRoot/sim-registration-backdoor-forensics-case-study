package th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel$getConsentNonTelco$6 */
/* loaded from: classes10.dex */
public final class OneConsentNonTelcoViewModel$getConsentNonTelco$6 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneConsentNonTelcoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentNonTelcoViewModel$getConsentNonTelco$6(OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel) {
        super(1);
        this.this$0 = oneConsentNonTelcoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        OneConsentNonTelcoViewModel.View view;
        view = this.this$0.f89637f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
        OneErrorService errorService = this.this$0.getErrorService();
        final OneConsentNonTelcoViewModel oneConsentNonTelcoViewModel = this.this$0;
        errorService.handleException(th2, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.consent_nontelco.viewModel.OneConsentNonTelcoViewModel$getConsentNonTelco$6.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                OneConsentNonTelcoViewModel.View view2;
                OneConsentNonTelcoViewModel.View view3;
                ErrorCollection errorCollection = new ErrorCollection();
                if (th3 instanceof ServerErrorException) {
                    errorCollection = ((ServerErrorException) th3).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                } else {
                    errorCollection.setDescription(OneConsentNonTelcoViewModel.this.getErrorService().getErrorMessage(th3));
                }
                OneConsentNonTelcoViewModel.View view4 = null;
                if (errorCollection.getStatusCode() != null) {
                    view3 = OneConsentNonTelcoViewModel.this.f89637f;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    } else {
                        view4 = view3;
                    }
                    view4.onConsentNotFound(errorCollection);
                    return;
                }
                String errorMessage = OneConsentNonTelcoViewModel.this.getErrorService().getErrorMessage(th3);
                if (errorMessage != null) {
                    view2 = OneConsentNonTelcoViewModel.this.f89637f;
                    if (view2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    } else {
                        view4 = view2;
                    }
                    view4.onConsentErrorMessage(errorMessage);
                }
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}