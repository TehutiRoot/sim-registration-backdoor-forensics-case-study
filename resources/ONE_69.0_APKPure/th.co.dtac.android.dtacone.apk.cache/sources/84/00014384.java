package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.installation;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m29142d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/LazyItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$4\n+ 2 InstallAppointmentScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/installation/InstallAppointmentScreenKt$InstallDateList$1\n*L\n1#1,423:1\n295#2:424\n311#2:425\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.installation.InstallAppointmentScreenKt$InstallDateList$1$invoke$lambda$1$$inlined$itemsIndexed$default$3 */
/* loaded from: classes10.dex */
public final class C15497xea3ebadb extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ List $dayList$inlined;
    final /* synthetic */ Ref.BooleanRef $expanded$inlined;
    final /* synthetic */ boolean $isSecondary$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ Function3 $onAppointmentSelected$inlined;
    final /* synthetic */ ColumnScope $this_InstallDateList$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15497xea3ebadb(List list, ColumnScope columnScope, Ref.BooleanRef booleanRef, int i, boolean z, Function3 function3, List list2) {
        super(4);
        this.$items = list;
        this.$this_InstallDateList$inlined = columnScope;
        this.$expanded$inlined = booleanRef;
        this.$$dirty$inlined = i;
        this.$isSecondary$inlined = z;
        this.$onAppointmentSelected$inlined = function3;
        this.$dayList$inlined = list2;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    @Composable
    public final void invoke(@NotNull LazyItemScope items, int i, @Nullable Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.changed(items) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:179)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(this.$this_InstallDateList$inlined, this.$expanded$inlined.element, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(composer, 228552262, true, new InstallAppointmentScreenKt$InstallDateList$1$1$2$1(this.$isSecondary$inlined, (AppointmentDateItem) this.$items.get(i), this.$onAppointmentSelected$inlined, this.$$dirty$inlined, i3 & WebSocketProtocol.PAYLOAD_SHORT, i, this.$dayList$inlined)), composer, (this.$$dirty$inlined & 14) | 1572864, 30);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}