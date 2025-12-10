package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpSelectNumberScreenKt$PackageCard$1$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineFlpSelectNumberScreenKt$PackageCard$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<String, Unit> $onSelect;
    final /* synthetic */ String $packageName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneRegisterTrueOnlineFlpSelectNumberScreenKt$PackageCard$1$1(Function1<? super String, Unit> function1, String str) {
        super(0);
        this.$onSelect = function1;
        this.$packageName = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSelect.invoke(this.$packageName);
    }
}