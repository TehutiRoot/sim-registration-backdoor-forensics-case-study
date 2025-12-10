package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.DisableCaptureScreenKt$DisableCaptureScreen$2 */
/* loaded from: classes7.dex */
public final class DisableCaptureScreenKt$DisableCaptureScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableCaptureScreenKt$DisableCaptureScreen$2(int i) {
        super(2);
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        DisableCaptureScreenKt.DisableCaptureScreen(composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
