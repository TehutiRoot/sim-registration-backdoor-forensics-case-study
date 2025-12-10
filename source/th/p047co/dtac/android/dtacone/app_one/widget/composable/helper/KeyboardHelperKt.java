package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0007¨\u0006\b"}, m28850d2 = {"rememberIsKeyboardOpen", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "clearFocusOnKeyboardDismiss", "Landroidx/compose/ui/Modifier;", "isKeyboardOpen", "Landroid/view/View;", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nKeyboardHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardHelper.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/KeyboardHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,67:1\n76#2:68\n*S KotlinDebug\n*F\n+ 1 KeyboardHelper.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/KeyboardHelperKt\n*L\n30#1:68\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.KeyboardHelperKt */
/* loaded from: classes7.dex */
public final class KeyboardHelperKt {
    @NotNull
    public static final Modifier clearFocusOnKeyboardDismiss(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, KeyboardHelperKt$clearFocusOnKeyboardDismiss$1.INSTANCE, 1, null);
    }

    public static final boolean isKeyboardOpen(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getRootView().getHeight();
        if (height - rect.bottom > height * 0.15d) {
            return true;
        }
        return false;
    }

    @Composable
    @NotNull
    public static final State<Boolean> rememberIsKeyboardOpen(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-152141538);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-152141538, i, -1, "th.co.dtac.android.dtacone.app_one.widget.composable.helper.rememberIsKeyboardOpen (KeyboardHelper.kt:28)");
        }
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        State<Boolean> produceState = SnapshotStateKt.produceState(Boolean.valueOf(isKeyboardOpen(view)), new KeyboardHelperKt$rememberIsKeyboardOpen$1(view, null), composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }
}
