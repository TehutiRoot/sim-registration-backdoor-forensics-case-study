package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.SmartSearchData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.EntryFeeData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneSmartSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSmartSearchScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneSmartSearchScreenKt$CampaignCardList$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,790:1\n1855#2,2:791\n*S KotlinDebug\n*F\n+ 1 OneSmartSearchScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneSmartSearchScreenKt$CampaignCardList$3\n*L\n291#1:791,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$CampaignCardList$3 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$CampaignCardList$3 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<SmartSearchData> $discountList;
    final /* synthetic */ EntryFeeData $entryFeeData;
    final /* synthetic */ Function2<String, String, Unit> $onSelect;
    final /* synthetic */ Function1<SmartSearchData, Unit> $onSelectDetail;
    final /* synthetic */ String $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSmartSearchScreenKt$CampaignCardList$3(List<SmartSearchData> list, EntryFeeData entryFeeData, String str, int i, Function2<? super String, ? super String, Unit> function2, Function1<? super SmartSearchData, Unit> function1) {
        super(1);
        this.$discountList = list;
        this.$entryFeeData = entryFeeData;
        this.$query = str;
        this.$$dirty = i;
        this.$onSelect = function2;
        this.$onSelectDetail = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        EntryFeeData entryFeeData = this.$entryFeeData;
        String str = this.$query;
        int i = this.$$dirty;
        Function2<String, String, Unit> function2 = this.$onSelect;
        Function1<SmartSearchData, Unit> function1 = this.$onSelectDetail;
        for (SmartSearchData smartSearchData : this.$discountList) {
            LazyListScope.CC.m61223i(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1766834283, true, new OneSmartSearchScreenKt$CampaignCardList$3$1$1(smartSearchData, Intrinsics.areEqual(entryFeeData.getCampaignCode(), smartSearchData.getCampaignCode()) && Intrinsics.areEqual(entryFeeData.getCampaignMarketingCode(), smartSearchData.getMarketingCode()) && entryFeeData.getCampaignEntryFeeReasonCode() != null, str, i, function2, function1)), 3, null);
            i = i;
            str = str;
            function2 = function2;
            function1 = function1;
        }
    }
}