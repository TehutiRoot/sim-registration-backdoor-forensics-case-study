package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneCampaignPackageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$4$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,610:1\n171#2,12:611\n*S KotlinDebug\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$4$1\n*L\n164#1:611,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$4$1 */
/* loaded from: classes10.dex */
public final class OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$4$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ State<List<Campaign>> $filteredList$delegate;
    final /* synthetic */ Function1<Campaign, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneCampaignPackageScreenKt$OneSelectCampaignScreen$2$1$4$1(State<? extends List<Campaign>> state, MutableState<String> mutableState, Function1<? super Campaign, Unit> function1) {
        super(1);
        this.$filteredList$delegate = state;
        this.$filterText$delegate = mutableState;
        this.$onSelect = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        List m9378g;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        m9378g = OneCampaignPackageScreenKt.m9378g(this.$filteredList$delegate);
        LazyColumn.items(m9378g.size(), null, new C15612x7651741a(m9378g), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15613x7651741b(m9378g, this.$filterText$delegate, this.$onSelect)));
    }
}