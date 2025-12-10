package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DefaultButtonElevation implements ButtonElevation {

    /* renamed from: a */
    public final float f14433a;

    /* renamed from: b */
    public final float f14434b;

    /* renamed from: c */
    public final float f14435c;

    /* renamed from: d */
    public final float f14436d;

    /* renamed from: e */
    public final float f14437e;

    public /* synthetic */ DefaultButtonElevation(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    @Override // androidx.compose.material.ButtonElevation
    public State elevation(boolean z, InteractionSource interactionSource, Composer composer, int i) {
        float f;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(-1588756907);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1588756907, i, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:505)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        int i2 = (i >> 3) & 14;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(interactionSource) | composer.changed(snapshotStateList);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new DefaultButtonElevation$elevation$1$1(interactionSource, snapshotStateList, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(interactionSource, (Function2) rememberedValue2, composer, i2 | 64);
        Interaction interaction = (Interaction) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) snapshotStateList);
        if (!z) {
            f = this.f14435c;
        } else if (interaction instanceof PressInteraction.Press) {
            f = this.f14434b;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f = this.f14436d;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f = this.f14437e;
        } else {
            f = this.f14433a;
        }
        float f2 = f;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new Animatable(C3641Dp.m73656boximpl(f2), VectorConvertersKt.getVectorConverter(C3641Dp.Companion), null, null, 12, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) rememberedValue3;
        if (!z) {
            composer.startReplaceableGroup(-1598807317);
            EffectsKt.LaunchedEffect(C3641Dp.m73656boximpl(f2), new DefaultButtonElevation$elevation$2(animatable, f2, null), composer, 64);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1598807146);
            EffectsKt.LaunchedEffect(C3641Dp.m73656boximpl(f2), new DefaultButtonElevation$elevation$3(animatable, this, f2, interaction, null), composer, 64);
            composer.endReplaceableGroup();
        }
        State asState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asState;
    }

    public DefaultButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.f14433a = f;
        this.f14434b = f2;
        this.f14435c = f3;
        this.f14436d = f4;
        this.f14437e = f5;
    }
}
