package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSearchBoxKt$OneSearchBox$3$1$1$3$1 */
/* loaded from: classes7.dex */
public final class OneSearchBoxKt$OneSearchBox$3$1$1$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<String, Unit> $onTextChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSearchBoxKt$OneSearchBox$3$1$1$3$1(Function1<? super String, Unit> function1) {
        super(0);
        this.$onTextChange = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onTextChange.invoke("");
    }
}
