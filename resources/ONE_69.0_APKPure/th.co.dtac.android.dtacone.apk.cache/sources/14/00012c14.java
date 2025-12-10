package th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel$queryTransaction$3 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerViewModel$queryTransaction$3 extends Lambda implements Function1<QueryTransactionResponse, Unit> {
    final /* synthetic */ String $orderId;
    final /* synthetic */ OneChangeOwnerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerViewModel$queryTransaction$3(OneChangeOwnerViewModel oneChangeOwnerViewModel, String str) {
        super(1);
        this.this$0 = oneChangeOwnerViewModel;
        this.$orderId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(QueryTransactionResponse queryTransactionResponse) {
        invoke2(queryTransactionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(QueryTransactionResponse queryTransactionResponse) {
        int i;
        int i2;
        int i3;
        String status;
        QueryTransactionResponse.Data data = queryTransactionResponse.getData();
        String str = "";
        if (!Intrinsics.areEqual((data == null || (r0 = data.getStatus()) == null) ? "" : "", Constant.QueryTransactionStatus.COMPLETED)) {
            QueryTransactionResponse.Data data2 = queryTransactionResponse.getData();
            if (!Intrinsics.areEqual((data2 == null || (r0 = data2.getStatus()) == null) ? "" : "", Constant.QueryTransactionStatus.FAILED)) {
                QueryTransactionResponse.Data data3 = queryTransactionResponse.getData();
                if (data3 != null && (status = data3.getStatus()) != null) {
                    str = status;
                }
                if (!Intrinsics.areEqual(str, Constant.QueryTransactionStatus.CANCELLED)) {
                    i = this.this$0.f89392M;
                    i2 = this.this$0.f89393N;
                    if (i == i2) {
                        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
                        return;
                    }
                    OneChangeOwnerViewModel oneChangeOwnerViewModel = this.this$0;
                    i3 = oneChangeOwnerViewModel.f89392M;
                    oneChangeOwnerViewModel.f89392M = i3 + 1;
                    this.this$0.m15296u(this.$orderId);
                    return;
                }
            }
        }
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
    }
}