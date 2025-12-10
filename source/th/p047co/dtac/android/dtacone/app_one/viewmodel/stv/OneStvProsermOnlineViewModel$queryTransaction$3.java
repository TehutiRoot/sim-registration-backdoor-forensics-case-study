package th.p047co.dtac.android.dtacone.app_one.viewmodel.stv;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.stv.OneSubmitSTVProsermResponse;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.query_transaction.QueryTransactionResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/query_transaction/QueryTransactionResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.viewmodel.stv.OneStvProsermOnlineViewModel$queryTransaction$3 */
/* loaded from: classes7.dex */
public final class OneStvProsermOnlineViewModel$queryTransaction$3 extends Lambda implements Function1<QueryTransactionResponse, Unit> {
    final /* synthetic */ OneSubmitSTVProsermResponse $response;
    final /* synthetic */ OneStvProsermOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStvProsermOnlineViewModel$queryTransaction$3(OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel, OneSubmitSTVProsermResponse oneSubmitSTVProsermResponse) {
        super(1);
        this.this$0 = oneStvProsermOnlineViewModel;
        this.$response = oneSubmitSTVProsermResponse;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(QueryTransactionResponse queryTransactionResponse) {
        invoke2(queryTransactionResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(QueryTransactionResponse queryTransactionResponse) {
        MutableLiveData m19980N0;
        int i;
        int i2;
        int i3;
        MutableLiveData m19980N02;
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
                    i = this.this$0.f82696i0;
                    i2 = this.this$0.f82698j0;
                    if (i == i2) {
                        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
                        m19980N02 = this.this$0.m19980N0();
                        m19980N02.postValue(Resource.Companion.success(this.$response));
                        return;
                    }
                    OneStvProsermOnlineViewModel oneStvProsermOnlineViewModel = this.this$0;
                    i3 = oneStvProsermOnlineViewModel.f82696i0;
                    oneStvProsermOnlineViewModel.f82696i0 = i3 + 1;
                    this.this$0.m19978O0(this.$response);
                    return;
                }
            }
        }
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m19980N0 = this.this$0.m19980N0();
        m19980N0.postValue(Resource.Companion.success(this.$response));
    }
}
