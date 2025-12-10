package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionKt$animateDp$1\n*L\n1#1,1156:1\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.signaturePage.OneRegisterTrueOnlineSignaturePageScreenKt$SignatureModalBottomSheet$$inlined$animateDp$1 */
/* loaded from: classes10.dex */
public final class C15523xee20b434 extends Lambda implements Function3<Transition.Segment<Boolean>, Composer, Integer, SpringSpec<C3623Dp>> {
    public static final C15523xee20b434 INSTANCE = new C15523xee20b434();

    public C15523xee20b434() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ SpringSpec<C3623Dp> invoke(Transition.Segment<Boolean> segment, Composer composer, Integer num) {
        return invoke(segment, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final SpringSpec<C3623Dp> invoke(@NotNull Transition.Segment<Boolean> segment, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        composer.startReplaceableGroup(-575880366);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-575880366, i, -1, "androidx.compose.animation.core.animateDp.<anonymous> (Transition.kt:964)");
        }
        SpringSpec<C3623Dp> spring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, C3623Dp.m73840boximpl(VisibilityThresholdsKt.getVisibilityThreshold(C3623Dp.Companion)), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return spring$default;
    }
}