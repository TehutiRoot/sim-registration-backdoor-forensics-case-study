package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$4$1 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$4$1 extends Lambda implements Function2<String, String, Unit> {
    final /* synthetic */ Function2<String, String, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$4$1(Function2<? super String, ? super String, Unit> function2) {
        super(2);
        this.$onSelect = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String campaignCode, @NotNull String marketingCode) {
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        this.$onSelect.invoke(campaignCode, marketingCode);
    }
}