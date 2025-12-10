package th.p047co.dtac.android.dtacone.viewmodel.customerenquiry;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.customerenquiry.BSubsInfo;
import th.p047co.dtac.android.dtacone.model.customerenquiry.GetSubsNumbByAccountNumberResponseItem;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "", "Lth/co/dtac/android/dtacone/model/customerenquiry/GetSubsNumbByAccountNumberResponseItem;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nIdentityInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityInfoViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/customerenquiry/IdentityInfoViewModel$callApiGetSubsNumbByAccountNumber$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,576:1\n1549#2:577\n1620#2,3:578\n*S KotlinDebug\n*F\n+ 1 IdentityInfoViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/customerenquiry/IdentityInfoViewModel$callApiGetSubsNumbByAccountNumber$3\n*L\n329#1:577\n329#1:578,3\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.customerenquiry.IdentityInfoViewModel$callApiGetSubsNumbByAccountNumber$3 */
/* loaded from: classes9.dex */
public final class IdentityInfoViewModel$callApiGetSubsNumbByAccountNumber$3 extends Lambda implements Function1<List<? extends GetSubsNumbByAccountNumberResponseItem>, Unit> {
    final /* synthetic */ String $customerNumber;
    final /* synthetic */ IdentityInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityInfoViewModel$callApiGetSubsNumbByAccountNumber$3(IdentityInfoViewModel identityInfoViewModel, String str) {
        super(1);
        this.this$0 = identityInfoViewModel;
        this.$customerNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends GetSubsNumbByAccountNumberResponseItem> list) {
        invoke2((List<GetSubsNumbByAccountNumberResponseItem>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<GetSubsNumbByAccountNumberResponseItem> it) {
        MutableLiveData mutableLiveData;
        MutableLiveData m3238B;
        String decryptCBC;
        String decryptCBC2;
        String decryptCBC3;
        this.this$0.m3226N(this.$customerNumber);
        mutableLiveData = this.this$0.f105300r;
        mutableLiveData.setValue(Resource.Companion.success(""));
        m3238B = this.this$0.m3238B();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        List<GetSubsNumbByAccountNumberResponseItem> list = it;
        IdentityInfoViewModel identityInfoViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (GetSubsNumbByAccountNumberResponseItem getSubsNumbByAccountNumberResponseItem : list) {
            decryptCBC = identityInfoViewModel.decryptCBC(getSubsNumbByAccountNumberResponseItem.getSubscriberNumber());
            String subscriberToPrefix0 = StringExtKt.subscriberToPrefix0(decryptCBC);
            String subscriberStatus = getSubsNumbByAccountNumberResponseItem.getSubscriberStatus();
            String companyName = getSubsNumbByAccountNumberResponseItem.getCompanyName();
            decryptCBC2 = identityInfoViewModel.decryptCBC(getSubsNumbByAccountNumberResponseItem.getFirstName());
            decryptCBC3 = identityInfoViewModel.decryptCBC(getSubsNumbByAccountNumberResponseItem.getLastName());
            arrayList.add(new BSubsInfo(subscriberToPrefix0, subscriberStatus, companyName, decryptCBC2 + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + decryptCBC3));
        }
        m3238B.postValue(arrayList);
    }
}