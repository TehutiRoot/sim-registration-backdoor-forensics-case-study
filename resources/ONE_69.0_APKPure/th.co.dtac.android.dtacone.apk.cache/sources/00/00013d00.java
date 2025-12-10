package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.appOne.prepaid.Data;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$queryTransaction$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$queryTransaction$3 extends Lambda implements Function1<QueryTransactionResponse, Unit> {
    final /* synthetic */ Data $submitOrder;
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$queryTransaction$3(OnePrepaidViewModel onePrepaidViewModel, Data data) {
        super(1);
        this.this$0 = onePrepaidViewModel;
        this.$submitOrder = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(QueryTransactionResponse queryTransactionResponse) {
        invoke2(queryTransactionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(QueryTransactionResponse queryTransactionResponse) {
        OnePrepaidRepository onePrepaidRepository;
        int i;
        int i2;
        int i3;
        String status;
        onePrepaidRepository = this.this$0.f95986b;
        onePrepaidRepository.setQueryTransactionResponse(queryTransactionResponse.getData());
        QueryTransactionResponse.Data data = queryTransactionResponse.getData();
        String str = "";
        if (Intrinsics.areEqual((data == null || (r0 = data.getStatus()) == null) ? "" : "", Constant.QueryTransactionStatus.COMPLETED)) {
            this.this$0.getPermissionList();
            return;
        }
        QueryTransactionResponse.Data data2 = queryTransactionResponse.getData();
        if (!Intrinsics.areEqual((data2 == null || (r0 = data2.getStatus()) == null) ? "" : "", Constant.QueryTransactionStatus.FAILED)) {
            QueryTransactionResponse.Data data3 = queryTransactionResponse.getData();
            if (data3 != null && (status = data3.getStatus()) != null) {
                str = status;
            }
            if (!Intrinsics.areEqual(str, Constant.QueryTransactionStatus.CANCELLED)) {
                i = this.this$0.f95984A;
                i2 = this.this$0.f95985B;
                if (i == i2) {
                    this.this$0.navigateToSuccessPage();
                    return;
                }
                OnePrepaidViewModel onePrepaidViewModel = this.this$0;
                i3 = onePrepaidViewModel.f95984A;
                onePrepaidViewModel.f95984A = i3 + 1;
                this.this$0.m10556c0(this.$submitOrder);
                return;
            }
        }
        this.this$0.navigateToSuccessPage();
    }
}