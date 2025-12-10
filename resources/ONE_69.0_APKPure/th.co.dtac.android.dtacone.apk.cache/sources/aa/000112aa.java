package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.OneSegmentedButtonRowKt$SegmentedButton$3 */
/* loaded from: classes7.dex */
public final class OneSegmentedButtonRowKt$SegmentedButton$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneSegmentedButtonRowKt$SegmentedButton$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, PaddingValues paddingValues, int i, int i2) {
        super(2);
        this.$icon = function2;
        this.$label = function22;
        this.$contentPadding = paddingValues;
        this.$$dirty1 = i;
        this.$$dirty = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@Nullable Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1930485838, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButton.<anonymous> (OneSegmentedButtonRow.kt:196)");
        }
        OneSegmentedButtonRowKt.m19985b(this.$icon, this.$label, this.$contentPadding, composer, (this.$$dirty1 & WebSocketProtocol.PAYLOAD_SHORT) | ((this.$$dirty >> 18) & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}