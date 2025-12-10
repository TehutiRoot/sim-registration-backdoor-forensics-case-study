package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Request;
import th.p047co.dtac.android.dtacone.model.GetReceiptBase64Response;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.cut_sim.response.CutSimStockResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_multi_sim.MultiSimSubmitResult;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimRepository;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lth/co/dtac/android/dtacone/model/GetReceiptBase64Response;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/collections/IndexedValue;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_multi_sim/MultiSimSubmitResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_multi_sim.MrtrPrepaidMultiSimViewModel$printReceipt$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidMultiSimViewModel$printReceipt$2 extends Lambda implements Function1<IndexedValue<? extends MultiSimSubmitResult>, ObservableSource<? extends GetReceiptBase64Response>> {
    final /* synthetic */ MrtrPrepaidMultiSimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidMultiSimViewModel$printReceipt$2(MrtrPrepaidMultiSimViewModel mrtrPrepaidMultiSimViewModel) {
        super(1);
        this.this$0 = mrtrPrepaidMultiSimViewModel;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ObservableSource<? extends GetReceiptBase64Response> invoke2(@NotNull IndexedValue<MultiSimSubmitResult> indexedValue) {
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository;
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository2;
        MrtrPrepaidMultiSimRepository mrtrPrepaidMultiSimRepository3;
        String orderNumber;
        String orderID;
        Intrinsics.checkNotNullParameter(indexedValue, "<name for destructuring parameter 0>");
        indexedValue.component1();
        MultiSimSubmitResult component2 = indexedValue.component2();
        mrtrPrepaidMultiSimRepository = this.this$0.f106670b;
        mrtrPrepaidMultiSimRepository2 = this.this$0.f106670b;
        String userLan = mrtrPrepaidMultiSimRepository2.getUserLan();
        mrtrPrepaidMultiSimRepository3 = this.this$0.f106670b;
        String locationCode = mrtrPrepaidMultiSimRepository3.getLocationCode();
        CutSimStockResponse cutSimStockResponse = component2.getCutSimStockResponse();
        String str = (cutSimStockResponse == null || (orderID = cutSimStockResponse.getOrderID()) == null) ? "" : orderID;
        CutSimStockResponse cutSimStockResponse2 = component2.getCutSimStockResponse();
        return mrtrPrepaidMultiSimRepository.printReceipt(new GetReceiptBase64Request(userLan, locationCode, str, (cutSimStockResponse2 == null || (orderNumber = cutSimStockResponse2.getOrderNumber()) == null) ? "" : orderNumber, false, 16, null)).toObservable().onExceptionResumeNext(Observable.just(new GetReceiptBase64Response(""))).onErrorResumeNext(Observable.just(new GetReceiptBase64Response("")));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ ObservableSource<? extends GetReceiptBase64Response> invoke(IndexedValue<? extends MultiSimSubmitResult> indexedValue) {
        return invoke2((IndexedValue<MultiSimSubmitResult>) indexedValue);
    }
}