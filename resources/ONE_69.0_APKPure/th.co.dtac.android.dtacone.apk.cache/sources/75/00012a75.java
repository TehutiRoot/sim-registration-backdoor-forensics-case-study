package th.p047co.dtac.android.dtacone.view.appOne.buyDol.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.configuration.featureconfig.BuyDolConfig;
import th.p047co.dtac.android.dtacone.manager.service.OneErrorService;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.error.ServerErrorException;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "throwable", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$chargeBankAccount$2 */
/* loaded from: classes10.dex */
public final class OneBuyDolViewModel$chargeBankAccount$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OneBuyDolViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneBuyDolViewModel$chargeBankAccount$2(OneBuyDolViewModel oneBuyDolViewModel) {
        super(1);
        this.this$0 = oneBuyDolViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable throwable) {
        MutableLiveData m15878e0;
        OneErrorService oneErrorService;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        m15878e0 = this.this$0.m15878e0();
        m15878e0.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        oneErrorService = this.this$0.f88643e;
        final OneBuyDolViewModel oneBuyDolViewModel = this.this$0;
        oneErrorService.handleException(throwable, new OneErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.view.appOne.buyDol.viewModel.OneBuyDolViewModel$chargeBankAccount$2.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                OneErrorService oneErrorService2;
                MutableLiveData m15892U;
                OneErrorService oneErrorService3;
                MutableLiveData m15892U2;
                OneErrorService oneErrorService4;
                try {
                    Intrinsics.checkNotNull(th2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.model.error.ServerErrorException");
                    if (Intrinsics.areEqual(((ServerErrorException) th2).error().getStatusCode(), BuyDolConfig.OTP_FAIL_CODE)) {
                        m15892U2 = OneBuyDolViewModel.this.m15892U();
                        m15892U2.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
                        oneErrorService4 = OneBuyDolViewModel.this.f88643e;
                        oneErrorService4.handleException(th2, new OneErrorService.ExceptionHandler[0]);
                    } else {
                        m15892U = OneBuyDolViewModel.this.m15892U();
                        m15892U.setValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
                        oneErrorService3 = OneBuyDolViewModel.this.f88643e;
                        oneErrorService3.handleException(th2, new OneErrorService.ExceptionHandler[0]);
                    }
                } catch (Exception e) {
                    oneErrorService2 = OneBuyDolViewModel.this.f88643e;
                    oneErrorService2.handleException(e, new OneErrorService.ExceptionHandler[0]);
                }
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.OneErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}