package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SliderKt$Slider$3 extends Lambda implements Function3<SliderPositions, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ SliderColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$3(MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z, int i) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$colors = sliderColors;
        this.$enabled = z;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SliderPositions sliderPositions, Composer composer, Integer num) {
        invoke(sliderPositions, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull SliderPositions it, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1522452856, i, -1, "androidx.compose.material3.Slider.<anonymous> (Slider.kt:169)");
        }
        SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        SliderColors sliderColors = this.$colors;
        boolean z = this.$enabled;
        int i2 = this.$$dirty;
        sliderDefaults.m70724Thumb9LiSoMs(mutableInteractionSource, null, sliderColors, z, 0L, composer, ((i2 >> 24) & 14) | ProfileVerifier.CompilationStatus.f36619xf2722a21 | ((i2 >> 15) & 896) | (i2 & 7168), 18);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}