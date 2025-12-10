package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class ChipKt$Chip$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$Chip$2(Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, ChipColors chipColors, boolean z, int i, float f, PaddingValues paddingValues, int i2) {
        super(2);
        this.$label = function2;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j;
        this.$leadingIcon = function22;
        this.$trailingIcon = function23;
        this.$colors = chipColors;
        this.$enabled = z;
        this.$$dirty = i;
        this.$minHeight = f;
        this.$paddingValues = paddingValues;
        this.$$dirty1 = i2;
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
            ComposerKt.traceEventStart(-1985962652, i, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1328)");
        }
        Function2<Composer, Integer, Unit> function2 = this.$label;
        TextStyle textStyle = this.$labelTextStyle;
        long j = this.$labelColor;
        Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
        Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
        ChipColors chipColors = this.$colors;
        boolean z = this.$enabled;
        int i2 = this.$$dirty;
        long m71929unboximpl = chipColors.leadingIconContentColor$material3_release(z, composer, ((i2 >> 24) & 112) | ((i2 >> 6) & 14)).getValue().m71929unboximpl();
        ChipColors chipColors2 = this.$colors;
        boolean z2 = this.$enabled;
        int i3 = this.$$dirty;
        long m71929unboximpl2 = chipColors2.trailingIconContentColor$material3_release(z2, composer, ((i3 >> 24) & 112) | ((i3 >> 6) & 14)).getValue().m71929unboximpl();
        float f = this.$minHeight;
        PaddingValues paddingValues = this.$paddingValues;
        int i4 = this.$$dirty;
        int i5 = (i4 >> 9) & 896;
        int i6 = ((i4 >> 6) & 458752) | i5 | ((i4 >> 9) & 14) | 24576 | ((i4 >> 9) & 112) | ((i4 >> 9) & 7168);
        int i7 = this.$$dirty1;
        ChipKt.m60629b(function2, textStyle, j, function22, null, function23, m71929unboximpl, m71929unboximpl2, f, paddingValues, composer, i6 | ((i7 << 18) & 234881024) | ((i7 << 18) & 1879048192));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}