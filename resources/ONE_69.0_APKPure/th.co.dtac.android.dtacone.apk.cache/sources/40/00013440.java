package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.repository;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.OneNadOutboundModel;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingDataItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingResponse;", "kotlin.jvm.PlatformType", "response", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneNadOutboundRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneNadOutboundRepository.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/repository/OneNadOutboundRepository$getOneNadOutboundReminderList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1855#2,2:138\n*S KotlinDebug\n*F\n+ 1 OneNadOutboundRepository.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/repository/OneNadOutboundRepository$getOneNadOutboundReminderList$1\n*L\n50#1:138,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.repository.OneNadOutboundRepository$getOneNadOutboundReminderList$1 */
/* loaded from: classes10.dex */
public final class OneNadOutboundRepository$getOneNadOutboundReminderList$1 extends Lambda implements Function1<OneNadOutboundBillingResponse, OneNadOutboundBillingResponse> {
    final /* synthetic */ OneNadOutboundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneNadOutboundRepository$getOneNadOutboundReminderList$1(OneNadOutboundRepository oneNadOutboundRepository) {
        super(1);
        this.this$0 = oneNadOutboundRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneNadOutboundBillingResponse invoke(@NotNull OneNadOutboundBillingResponse response) {
        ArrayList<OneNadOutboundBillingItem> arrayList;
        ArrayList<OneNadOutboundBillingItem> billingList;
        ConfigurationRepository configurationRepository;
        Intrinsics.checkNotNullParameter(response, "response");
        OneNadOutboundBillingDataItem data = response.getData();
        if (data != null && (billingList = data.getBillingList()) != null) {
            OneNadOutboundRepository oneNadOutboundRepository = this.this$0;
            for (OneNadOutboundBillingItem oneNadOutboundBillingItem : billingList) {
                String serviceId = oneNadOutboundBillingItem.getServiceId();
                configurationRepository = oneNadOutboundRepository.f92328b;
                oneNadOutboundBillingItem.setServiceId(AESCryptUtil.decryptCBC(serviceId, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
            }
        }
        OneNadOutboundModel oneNadOutboundModel = this.this$0.getOneNadOutboundModel();
        OneNadOutboundBillingDataItem data2 = response.getData();
        if (data2 == null || (arrayList = data2.getBillingList()) == null) {
            arrayList = new ArrayList<>();
        }
        oneNadOutboundModel.setNoFilterReminderList(arrayList);
        return response;
    }
}