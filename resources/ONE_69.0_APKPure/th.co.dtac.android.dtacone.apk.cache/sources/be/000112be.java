package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonDefaults$Icon$2 */
/* loaded from: classes7.dex */
public final class SegmentedButtonDefaults$Icon$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $active;
    final /* synthetic */ Function2<Composer, Integer, Unit> $activeContent;
    final /* synthetic */ SegmentedButtonDefaults $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonDefaults$Icon$2(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = segmentedButtonDefaults;
        this.$active = z;
        this.$activeContent = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        this.$tmp0_rcvr.Icon(this.$active, this.$activeContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}