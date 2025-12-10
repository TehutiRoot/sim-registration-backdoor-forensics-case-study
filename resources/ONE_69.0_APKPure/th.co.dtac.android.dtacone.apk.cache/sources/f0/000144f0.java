package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.UniqueSortedSpeedData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneCampaignPackageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$CampaignSpeedBar$1$2\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,610:1\n171#2,12:611\n*S KotlinDebug\n*F\n+ 1 OneCampaignPackageScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/tolPackage/OneCampaignPackageScreenKt$CampaignSpeedBar$1$2\n*L\n369#1:611,12\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneCampaignPackageScreenKt$CampaignSpeedBar$1$2 */
/* loaded from: classes10.dex */
public final class OneCampaignPackageScreenKt$CampaignSpeedBar$1$2 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ Function1<UniqueSortedSpeedData, Unit> $callBack;
    final /* synthetic */ MutableState<Integer> $selectedIndex;
    final /* synthetic */ List<UniqueSortedSpeedData> $speedData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneCampaignPackageScreenKt$CampaignSpeedBar$1$2(List<UniqueSortedSpeedData> list, MutableState<Integer> mutableState, Function1<? super UniqueSortedSpeedData, Unit> function1) {
        super(1);
        this.$speedData = list;
        this.$selectedIndex = mutableState;
        this.$callBack = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        List<UniqueSortedSpeedData> list = this.$speedData;
        LazyRow.items(list.size(), null, new C15609xd67a263b(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new C15610xd67a263c(list, this.$selectedIndex, this.$callBack)));
    }
}