package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel$oneNadOutboundBillingDelete$2 */
/* loaded from: classes10.dex */
public final class OneNadOutboundViewModel$oneNadOutboundBillingDelete$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneNadOutboundViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundViewModel$oneNadOutboundBillingDelete$2(OneNadOutboundViewModel oneNadOutboundViewModel) {
        super(1);
        this.this$0 = oneNadOutboundViewModel;
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
        oneErrorService = this.this$0.f92366c;
        final OneNadOutboundViewModel oneNadOutboundViewModel = this.this$0;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.nadOutbound.viewModel.OneNadOutboundViewModel$oneNadOutboundBillingDelete$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                OneErrorService oneErrorService3;
                if (th2 instanceof ServerErrorException) {
                    if (((ServerErrorException) th2).code() == 404) {
                        OneNadOutboundViewModel.this.getLiveDataState().setValue(StatusResource.DISMISS);
                        if (!OneNadOutboundViewModel.this.getOneModel().getInvoiceNotFound()) {
                            OneNadOutboundViewModel.this.m13264m();
                            return;
                        } else {
                            OneNadOutboundViewModel.this.getNadOutboundReminderList();
                            return;
                        }
                    }
                    OneNadOutboundViewModel.this.getLiveDataState().setValue(StatusResource.DISMISS);
                    oneErrorService3 = OneNadOutboundViewModel.this.f92366c;
                    oneErrorService3.handleException(th2, new OneErrorService.ExceptionHandler[0]);
                    return;
                }
                OneNadOutboundViewModel.this.getLiveDataState().setValue(StatusResource.DISMISS);
                oneErrorService2 = OneNadOutboundViewModel.this.f92366c;
                oneErrorService2.handleException(th2, new OneErrorService.ExceptionHandler[0]);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}