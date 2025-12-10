package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m29142d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "()V", "colors", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "material_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1097#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    @NotNull
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    @Composable
    @NotNull
    /* renamed from: colors-RGew2ao  reason: not valid java name */
    public final RadioButtonColors m70262colorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        long j4;
        long j5;
        long j6;
        composer.startReplaceableGroup(1370708026);
        if ((i2 & 1) != 0) {
            j4 = MaterialTheme.INSTANCE.getColors(composer, 6).m70156getSecondary0d7_KjU();
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = Color.m71918copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m70153getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            j6 = Color.m71918copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m70153getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j6 = j3;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370708026, i, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        Color m71909boximpl = Color.m71909boximpl(j4);
        Color m71909boximpl2 = Color.m71909boximpl(j5);
        Color m71909boximpl3 = Color.m71909boximpl(j6);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(m71909boximpl) | composer.changed(m71909boximpl2) | composer.changed(m71909boximpl3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new C0785LE(j4, j5, j6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        C0785LE c0785le = (C0785LE) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c0785le;
    }
}