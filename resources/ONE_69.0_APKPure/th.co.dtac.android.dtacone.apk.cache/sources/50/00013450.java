package th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.useCase;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingDataItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingItem;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingResponse;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingItem;", "kotlin.jvm.PlatformType", "response", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nGetSearchListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetSearchListUseCase.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/useCase/GetSearchListUseCase$invoke$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 GetSearchListUseCase.kt\nth/co/dtac/android/dtacone/view/appOne/nadOutbound/useCase/GetSearchListUseCase$invoke$1\n*L\n26#1:48\n26#1:49,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.nadOutbound.useCase.GetSearchListUseCase$invoke$1 */
/* loaded from: classes10.dex */
public final class GetSearchListUseCase$invoke$1 extends Lambda implements Function1<OneNadOutboundBillingResponse, List<? extends OneNadOutboundBillingItem>> {
    final /* synthetic */ String $word;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchListUseCase$invoke$1(String str) {
        super(1);
        this.$word = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<OneNadOutboundBillingItem> invoke(@NotNull OneNadOutboundBillingResponse response) {
        ArrayList<OneNadOutboundBillingItem> billingList;
        Intrinsics.checkNotNullParameter(response, "response");
        if (Intrinsics.areEqual(this.$word, "")) {
            return new ArrayList();
        }
        OneNadOutboundBillingDataItem data = response.getData();
        if (data != null && (billingList = data.getBillingList()) != null) {
            String str = this.$word;
            ArrayList arrayList = new ArrayList();
            for (Object obj : billingList) {
                if (StringsKt__StringsKt.contains((CharSequence) ((OneNadOutboundBillingItem) obj).getServiceId(), (CharSequence) str, true)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }
}