package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.customerenquiry.BCustInfo;
import th.p047co.dtac.android.dtacone.model.customerenquiry.BlackListResponse;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetOutStandingByAccountNumberResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetOutStandingByAccountNumberResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nIdentityInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityInfoViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/customerenquiry/IdentityInfoViewModel$getBlacklistCustomerList$4$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1559#2:577\n1590#2,4:578\n*S KotlinDebug\n*F\n+ 1 IdentityInfoViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/customerenquiry/IdentityInfoViewModel$getBlacklistCustomerList$4$5\n*L\n527#1:577\n527#1:578,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel$getBlacklistCustomerList$4$5 */
/* loaded from: classes9.dex */
public final class IdentityInfoViewModel$getBlacklistCustomerList$4$5 extends Lambda implements Function1<List<? extends GetOutStandingByAccountNumberResponse>, Unit> {
    final /* synthetic */ IdentityInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityInfoViewModel$getBlacklistCustomerList$4$5(IdentityInfoViewModel identityInfoViewModel) {
        super(1);
        this.this$0 = identityInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetOutStandingByAccountNumberResponse> list) {
        invoke2((List<GetOutStandingByAccountNumberResponse>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetOutStandingByAccountNumberResponse> list) {
        MutableLiveData m3201y;
        BlackListResponse blackListResponse;
        if (list != null) {
            IdentityInfoViewModel identityInfoViewModel = this.this$0;
            m3201y = identityInfoViewModel.m3201y();
            List<GetOutStandingByAccountNumberResponse> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                GetOutStandingByAccountNumberResponse getOutStandingByAccountNumberResponse = (GetOutStandingByAccountNumberResponse) obj;
                List<BlackListResponse> blackList = identityInfoViewModel.getPermitListModel().getBlackList();
                arrayList.add(new BCustInfo((blackList == null || (blackListResponse = blackList.get(i)) == null || (r5 = blackListResponse.getCustomerNumber()) == null) ? "" : "", getOutStandingByAccountNumberResponse.getAmount(), getOutStandingByAccountNumberResponse.getOtherCharge(), getOutStandingByAccountNumberResponse.getNetAmount(), false, 16, null));
                i = i2;
            }
            m3201y.postValue(arrayList);
        }
    }
}