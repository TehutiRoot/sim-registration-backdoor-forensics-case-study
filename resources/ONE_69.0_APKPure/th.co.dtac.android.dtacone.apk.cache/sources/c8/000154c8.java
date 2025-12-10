package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

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
import th.p047co.dtac.android.dtacone.model.customerenquiry.Offer;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$5 */
/* loaded from: classes9.dex */
public final class InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$5 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ Offer $offer;
    final /* synthetic */ InfoAnalyticViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$5(InfoAnalyticViewModel infoAnalyticViewModel, Offer offer) {
        super(1);
        this.this$0 = infoAnalyticViewModel;
        this.$offer = offer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MutableLiveData m3196B0;
        MrtrErrorService mrtrErrorService;
        Intrinsics.checkNotNullParameter(it, "it");
        m3196B0 = this.this$0.m3196B0();
        m3196B0.postValue(Resource.Companion.error$default(Resource.Companion, "", null, null, 4, null));
        mrtrErrorService = this.this$0.f105348e;
        final InfoAnalyticViewModel infoAnalyticViewModel = this.this$0;
        final Offer offer = this.$offer;
        mrtrErrorService.handleException(it, new MrtrErrorService.ExceptionHandler() { // from class: th.co.dtac.android.dtacone.viewmodel.customerenquiry.InfoAnalyticViewModel$onSelectPrepaidUpsellPackage$5.1
            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public void handle(@Nullable Throwable th2) {
                MrtrErrorService mrtrErrorService2;
                MrtrErrorService mrtrErrorService3;
                MrtrErrorService mrtrErrorService4;
                mrtrErrorService2 = InfoAnalyticViewModel.this.f105348e;
                mrtrErrorService2.handleException(th2, new MrtrErrorService.ExceptionHandler[0]);
                InfoAnalyticViewModel infoAnalyticViewModel2 = InfoAnalyticViewModel.this;
                Offer offer2 = offer;
                mrtrErrorService3 = infoAnalyticViewModel2.f105348e;
                String errorCode = mrtrErrorService3.getErrorCode(th2);
                Intrinsics.checkNotNullExpressionValue(errorCode, "errorService.getErrorCode(e)");
                mrtrErrorService4 = InfoAnalyticViewModel.this.f105348e;
                String systemMessage = mrtrErrorService4.getSystemMessage(th2);
                Intrinsics.checkNotNullExpressionValue(systemMessage, "errorService.getSystemMessage(e)");
                infoAnalyticViewModel2.callAPIBuyOfferFail(offer2, errorCode, systemMessage);
            }

            @Override // th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService.ExceptionHandler
            public boolean supportHttpCode(int i) {
                return i != 401;
            }
        });
    }
}