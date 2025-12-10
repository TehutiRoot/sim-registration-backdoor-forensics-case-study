package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.foundation.lazy.LazyListScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$CampaignCardList$1 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$CampaignCardList$1 extends Lambda implements Function1<LazyListScope, Unit> {
    public static final OneSmartSearchScreenKt$CampaignCardList$1 INSTANCE = new OneSmartSearchScreenKt$CampaignCardList$1();

    public OneSmartSearchScreenKt$CampaignCardList$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        for (int i = 0; i < 10; i++) {
            LazyListScope.CC.m61223i(LazyColumn, null, null, ComposableSingletons$OneSmartSearchScreenKt.INSTANCE.m75274getLambda3$app_prodRelease(), 3, null);
        }
    }
}