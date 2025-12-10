package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import android.graphics.Bitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneDialogKt$OneDialogImagePreview$2 */
/* loaded from: classes7.dex */
public final class OneDialogKt$OneDialogImagePreview$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogImagePreview$2(Bitmap bitmap, Function0<Unit> function0, int i) {
        super(2);
        this.$bitmap = bitmap;
        this.$onDismiss = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneDialogKt.OneDialogImagePreview(this.$bitmap, this.$onDismiss, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
