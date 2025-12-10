package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.SmartSearchData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$3$1 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$3$1 extends Lambda implements Function1<SmartSearchData, Unit> {
    final /* synthetic */ Function1<SmartSearchData, Unit> $onSelectDetail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$3$1(Function1<? super SmartSearchData, Unit> function1) {
        super(1);
        this.$onSelectDetail = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SmartSearchData smartSearchData) {
        invoke2(smartSearchData);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull SmartSearchData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$onSelectDetail.invoke(it);
    }
}