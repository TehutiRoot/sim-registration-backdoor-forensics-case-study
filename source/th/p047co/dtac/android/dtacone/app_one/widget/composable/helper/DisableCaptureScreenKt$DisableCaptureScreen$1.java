package th.p047co.dtac.android.dtacone.app_one.widget.composable.helper;

import android.app.Activity;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nDisableCaptureScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisableCaptureScreen.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/DisableCaptureScreenKt$DisableCaptureScreen$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,18:1\n63#2,5:19\n*S KotlinDebug\n*F\n+ 1 DisableCaptureScreen.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/helper/DisableCaptureScreenKt$DisableCaptureScreen$1\n*L\n14#1:19,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.helper.DisableCaptureScreenKt$DisableCaptureScreen$1 */
/* loaded from: classes7.dex */
public final class DisableCaptureScreenKt$DisableCaptureScreen$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ Activity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableCaptureScreenKt$DisableCaptureScreen$1(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        this.$activity.getWindow().addFlags(8192);
        final Activity activity = this.$activity;
        return new DisposableEffectResult() { // from class: th.co.dtac.android.dtacone.app_one.widget.composable.helper.DisableCaptureScreenKt$DisableCaptureScreen$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                activity.getWindow().clearFlags(8192);
            }
        };
    }
}
