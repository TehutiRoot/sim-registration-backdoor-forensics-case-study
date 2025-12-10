package th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.ServerErrorService;
import th.p047co.dtac.android.dtacone.model.error.ErrorCollection;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;
import th.p047co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel$getConsentNonTelco$2 */
/* loaded from: classes9.dex */
public final class ConsentNonTelcoViewModel$getConsentNonTelco$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ConsentNonTelcoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentNonTelcoViewModel$getConsentNonTelco$2(ConsentNonTelcoViewModel consentNonTelcoViewModel) {
        super(1);
        this.this$0 = consentNonTelcoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        ConsentNonTelcoViewModel.View view;
        view = this.this$0.f105221f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
            view = null;
        }
        view.dismissSecondaryLoading();
        ServerErrorService errorService = this.this$0.getErrorService();
        final ConsentNonTelcoViewModel consentNonTelcoViewModel = this.this$0;
        errorService.handleException(th2, new ServerErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.consent_nontelco.ConsentNonTelcoViewModel$getConsentNonTelco$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th3) {
                ConsentNonTelcoViewModel.View view2;
                ConsentNonTelcoViewModel.View view3;
                ErrorCollection errorCollection = new ErrorCollection();
                if (th3 instanceof ServerErrorException) {
                    errorCollection = ((ServerErrorException) th3).error();
                    Intrinsics.checkNotNullExpressionValue(errorCollection, "e.error()");
                } else {
                    errorCollection.setDescription(ConsentNonTelcoViewModel.this.getErrorService().getErrorMessage(th3));
                }
                ConsentNonTelcoViewModel.View view4 = null;
                if (errorCollection.getStatusCode() != null) {
                    view3 = ConsentNonTelcoViewModel.this.f105221f;
                    if (view3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                    } else {
                        view4 = view3;
                    }
                    view4.onConsentNotFound(errorCollection);
                    return;
                }
                view2 = ConsentNonTelcoViewModel.this.f105221f;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                } else {
                    view4 = view2;
                }
                String errorMessage = ConsentNonTelcoViewModel.this.getErrorService().getErrorMessage(th3);
                Intrinsics.checkNotNullExpressionValue(errorMessage, "errorService.getErrorMessage(e)");
                view4.onConsentErrorMessage(errorMessage);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.ServerErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}