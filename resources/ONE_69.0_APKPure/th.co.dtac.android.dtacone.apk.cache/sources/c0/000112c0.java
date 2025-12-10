package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import android.app.Activity;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"DisableCaptureScreen", "", "(Landroidx/compose/runtime/Composer;I)V", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nDisableCaptureScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisableCaptureScreen.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/DisableCaptureScreenKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,18:1\n76#2:19\n*S KotlinDebug\n*F\n+ 1 DisableCaptureScreen.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/DisableCaptureScreenKt\n*L\n11#1:19\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.DisableCaptureScreenKt */
/* loaded from: classes7.dex */
public final class DisableCaptureScreenKt {
    @Composable
    public static final void DisableCaptureScreen(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1976639194);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1976639194, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.helper.DisableCaptureScreen (DisableCaptureScreen.kt:9)");
            }
            Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type android.app.Activity");
            EffectsKt.DisposableEffect(Unit.INSTANCE, new DisableCaptureScreenKt$DisableCaptureScreen$1((Activity) consume), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DisableCaptureScreenKt$DisableCaptureScreen$2(i));
        }
    }
}