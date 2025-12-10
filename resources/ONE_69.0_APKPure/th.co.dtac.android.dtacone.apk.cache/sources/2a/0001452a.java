package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$1$1 */
/* loaded from: classes10.dex */
public final class OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MutableState<String> $filterText$delegate;
    final /* synthetic */ Function1<String, Unit> $onSearch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSmartSearchScreenKt$OneSmartSearchScreen$1$1$1$1(Function1<? super String, Unit> function1, MutableState<String> mutableState) {
        super(0);
        this.$onSearch = function1;
        this.$filterText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String m9360f;
        Function1<String, Unit> function1 = this.$onSearch;
        m9360f = OneSmartSearchScreenKt.m9360f(this.$filterText$delegate);
        function1.invoke(m9360f);
    }
}