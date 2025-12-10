package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.device;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRouterItem;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.device.DeviceSelectScreenKt$RouterSection$1 */
/* loaded from: classes10.dex */
public final class DeviceSelectScreenKt$RouterSection$1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onEdit;
    final /* synthetic */ DeviceRouterItem $router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSelectScreenKt$RouterSection$1(Function0<Unit> function0, int i, DeviceRouterItem deviceRouterItem) {
        super(3);
        this.$onEdit = function0;
        this.$$dirty = i;
        this.$router = deviceRouterItem;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull ColumnScope Card, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(822350560, i, -1, "th.co.dtac.android.dtacone.view.appOne.tol.screen.device.RouterSection.<anonymous> (DeviceSelectScreen.kt:197)");
        }
        DeviceSelectScreenKt.HeaderRow(composer, 0);
        DeviceSelectScreenKt.SubHeaderRow(R.drawable.ic_router, R.string.one_tol_device_router_header, true, this.$onEdit, composer, ((this.$$dirty << 6) & 7168) | 384, 0);
        if (this.$router == null) {
            composer.startReplaceableGroup(1792948957);
            DeviceSelectScreenKt.ModelEmptyRow(R.string.one_tol_device_router_empty, composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1792949022);
            DeviceSelectScreenKt.ModelRow(this.$router.getDeviceOfferName(), false, 0, 0, false, null, null, composer, 0, WebSocketProtocol.PAYLOAD_SHORT);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}