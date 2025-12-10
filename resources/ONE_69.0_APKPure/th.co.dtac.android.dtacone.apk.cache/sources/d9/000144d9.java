package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$1 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$1 extends Lambda implements Function1<MarketingDetails, Unit> {
    public static final MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$1 INSTANCE = new MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$1();

    public MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull MarketingDetails it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MarketingDetails marketingDetails) {
        invoke2(marketingDetails);
        return Unit.INSTANCE;
    }
}