package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.OneRegisterTrueOnlineCvgDataItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.existingTmhTvs.OneRegisterTrueOnlineSelectNumberScreenKt$NumberCardItem$2 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineSelectNumberScreenKt$NumberCardItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ OneRegisterTrueOnlineCvgDataItem $dataItem;
    final /* synthetic */ Function1<String, String> $formatter;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ ColumnScope $this_NumberCardItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneRegisterTrueOnlineSelectNumberScreenKt$NumberCardItem$2(ColumnScope columnScope, OneRegisterTrueOnlineCvgDataItem oneRegisterTrueOnlineCvgDataItem, Function1<? super String, String> function1, Function0<Unit> function0, int i) {
        super(2);
        this.$this_NumberCardItem = columnScope;
        this.$dataItem = oneRegisterTrueOnlineCvgDataItem;
        this.$formatter = function1;
        this.$onClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRegisterTrueOnlineSelectNumberScreenKt.m9565d(this.$this_NumberCardItem, this.$dataItem, this.$formatter, this.$onClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}