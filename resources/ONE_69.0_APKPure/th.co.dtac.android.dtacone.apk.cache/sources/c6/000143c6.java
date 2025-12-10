package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.layout;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.ProductType;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.layout.TopAppBarKt$TolProductSection$2 */
/* loaded from: classes10.dex */
public final class TopAppBarKt$TolProductSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ ProductType $productType;
    final /* synthetic */ RowScope $this_TolProductSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$TolProductSection$2(RowScope rowScope, ProductType productType, int i) {
        super(2);
        this.$this_TolProductSection = rowScope;
        this.$productType = productType;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TopAppBarKt.m9474b(this.$this_TolProductSection, this.$productType, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}