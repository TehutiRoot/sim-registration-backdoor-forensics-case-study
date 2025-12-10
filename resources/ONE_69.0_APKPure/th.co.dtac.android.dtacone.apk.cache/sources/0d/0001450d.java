package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$OneFeeInfoScreenPreview$1 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$OneFeeInfoScreenPreview$1 extends Lambda implements Function3<String, String, CampaignWaiveReason, Unit> {
    public static final OneFeeInfoScreenKt$OneFeeInfoScreenPreview$1 INSTANCE = new OneFeeInfoScreenKt$OneFeeInfoScreenPreview$1();

    public OneFeeInfoScreenKt$OneFeeInfoScreenPreview$1() {
        super(3);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String test1, @NotNull String test2, @NotNull CampaignWaiveReason test3) {
        Intrinsics.checkNotNullParameter(test1, "test1");
        Intrinsics.checkNotNullParameter(test2, "test2");
        Intrinsics.checkNotNullParameter(test3, "test3");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, CampaignWaiveReason campaignWaiveReason) {
        invoke2(str, str2, campaignWaiveReason);
        return Unit.INSTANCE;
    }
}