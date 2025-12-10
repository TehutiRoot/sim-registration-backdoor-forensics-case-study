package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.manager.service.Rx2ThreadService;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/Long;)Lio/reactivex/SingleSource;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$getPricePlansDetail$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$getPricePlansDetail$1 extends Lambda implements Function1<Long, SingleSource<? extends OneGetPricePlansDetailResponse>> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$getPricePlansDetail$1(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SingleSource<? extends OneGetPricePlansDetailResponse> invoke(@NotNull Long it) {
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository;
        Rx2ThreadService rx2ThreadService;
        Intrinsics.checkNotNullParameter(it, "it");
        oneDeviceSaleTrueRepository = this.this$0.f90027b;
        Single<OneGetPricePlansDetailResponse> oneGetPricePlansDetail = oneDeviceSaleTrueRepository.oneGetPricePlansDetail();
        rx2ThreadService = this.this$0.f90031d;
        return oneGetPricePlansDetail.compose(rx2ThreadService.applySingleAsync());
    }
}