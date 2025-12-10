package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneFeeInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$ReasonSelection$1$2\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,407:1\n136#2,12:408\n*S KotlinDebug\n*F\n+ 1 OneFeeInfoScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneFeeInfoScreenKt$ReasonSelection$1$2\n*L\n331#1:408,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$ReasonSelection$1$2 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$ReasonSelection$1$2 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ String $filterText;
    final /* synthetic */ List<CampaignWaiveReason> $filteredList;
    final /* synthetic */ Function1<CampaignWaiveReason, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$ReasonSelection$1$2(List<CampaignWaiveReason> list, CampaignInfo campaignInfo, String str, Function1<? super CampaignWaiveReason, Unit> function1, int i) {
        super(1);
        this.$filteredList = list;
        this.$campaignInfo = campaignInfo;
        this.$filterText = str;
        this.$onSelect = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        List<CampaignWaiveReason> list = this.$filteredList;
        CampaignInfo campaignInfo = this.$campaignInfo;
        String str = this.$filterText;
        Function1<CampaignWaiveReason, Unit> function1 = this.$onSelect;
        int i = this.$$dirty;
        LazyColumn.items(list.size(), null, new C15617x205f7ad9(C15615x205f7ad7.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new C15618x205f7ada(list, campaignInfo, str, function1, i)));
    }
}