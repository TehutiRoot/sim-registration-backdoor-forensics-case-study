package th.p047co.dtac.android.dtacone.view.compose.upPassDemo.screen.component;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.compose.upPassDemo.model.LabelValue;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPassDemo.screen.component.LabelValuesListKt$LabelValuesList$2 */
/* loaded from: classes10.dex */
public final class LabelValuesListKt$LabelValuesList$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<LabelValue> $data;
    final /* synthetic */ ColumnScope $this_LabelValuesList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelValuesListKt$LabelValuesList$2(ColumnScope columnScope, List<LabelValue> list, int i) {
        super(2);
        this.$this_LabelValuesList = columnScope;
        this.$data = list;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        LabelValuesListKt.LabelValuesList(this.$this_LabelValuesList, this.$data, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}