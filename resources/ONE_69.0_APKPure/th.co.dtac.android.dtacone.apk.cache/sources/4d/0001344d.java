package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingDataItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingResponse;
import th.p047co.dtac.android.dtacone.repository.ConfigurationRepository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, m29142d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "response", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nGetReminderListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetReminderListUseCase.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/useCase/GetReminderListUseCase$invoke$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1855#2,2:41\n*S KotlinDebug\n*F\n+ 1 GetReminderListUseCase.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/useCase/GetReminderListUseCase$invoke$1\n*L\n29#1:41,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetReminderListUseCase$invoke$1 */
/* loaded from: classes10.dex */
public final class GetReminderListUseCase$invoke$1 extends Lambda implements Function1<OneNadOutboundBillingResponse, ArrayList<OneNadOutboundBillingItem>> {
    final /* synthetic */ GetReminderListUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetReminderListUseCase$invoke$1(GetReminderListUseCase getReminderListUseCase) {
        super(1);
        this.this$0 = getReminderListUseCase;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ArrayList<OneNadOutboundBillingItem> invoke(@NotNull OneNadOutboundBillingResponse response) {
        ArrayList<OneNadOutboundBillingItem> billingList;
        ArrayList<OneNadOutboundBillingItem> billingList2;
        ConfigurationRepository configurationRepository;
        Intrinsics.checkNotNullParameter(response, "response");
        OneNadOutboundBillingDataItem data = response.getData();
        if (data != null && (billingList2 = data.getBillingList()) != null) {
            GetReminderListUseCase getReminderListUseCase = this.this$0;
            for (OneNadOutboundBillingItem oneNadOutboundBillingItem : billingList2) {
                String serviceId = oneNadOutboundBillingItem.getServiceId();
                configurationRepository = getReminderListUseCase.f92341b;
                oneNadOutboundBillingItem.setServiceId(AESCryptUtil.decryptCBC(serviceId, configurationRepository.dataPrivacyEncryptionAES256CBCKey()));
            }
        }
        OneNadOutboundBillingDataItem data2 = response.getData();
        return (data2 == null || (billingList = data2.getBillingList()) == null) ? new ArrayList<>() : billingList;
    }
}