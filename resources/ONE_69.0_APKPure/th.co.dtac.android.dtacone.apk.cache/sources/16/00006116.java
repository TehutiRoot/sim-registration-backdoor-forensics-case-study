package androidx.compose.p003ui.input.pointer;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nPointerIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n76#2:243\n25#3:244\n83#3,3:251\n36#3:260\n1097#4,6:245\n1097#4,6:254\n1097#4,6:261\n*S KotlinDebug\n*F\n+ 1 PointerIcon.kt\nandroidx/compose/ui/input/pointer/PointerIconKt$pointerHoverIcon$2\n*L\n91#1:243\n98#1:244\n101#1:251,3\n109#1:260\n98#1:245,6\n101#1:254,6\n109#1:261,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2 */
/* loaded from: classes2.dex */
public final class PointerIconKt$pointerHoverIcon$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ PointerIcon $icon;
    final /* synthetic */ boolean $overrideDescendants;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$2(PointerIcon pointerIcon, boolean z) {
        super(3);
        this.$icon = pointerIcon;
        this.$overrideDescendants = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Modifier modifier;
        Modifier then;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(811087536);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(811087536, i, -1, "androidx.compose.ui.input.pointer.pointerHoverIcon.<anonymous> (PointerIcon.kt:89)");
        }
        PointerIconService pointerIconService = (PointerIconService) composer.consume(CompositionLocalsKt.getLocalPointerIconService());
        if (pointerIconService == null) {
            then = Modifier.Companion;
        } else {
            PointerIconKt$pointerHoverIcon$2$onSetIcon$1 pointerIconKt$pointerHoverIcon$2$onSetIcon$1 = new PointerIconKt$pointerHoverIcon$2$onSetIcon$1(pointerIconService);
            PointerIcon pointerIcon = this.$icon;
            boolean z = this.$overrideDescendants;
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new PointerIconModifierLocal(pointerIcon, z, pointerIconKt$pointerHoverIcon$2$onSetIcon$1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            PointerIconModifierLocal pointerIconModifierLocal = (PointerIconModifierLocal) rememberedValue;
            Object[] objArr = {pointerIconModifierLocal, this.$icon, Boolean.valueOf(this.$overrideDescendants), pointerIconKt$pointerHoverIcon$2$onSetIcon$1};
            PointerIcon pointerIcon2 = this.$icon;
            boolean z2 = this.$overrideDescendants;
            composer.startReplaceableGroup(-568225417);
            boolean z3 = false;
            for (int i2 = 0; i2 < 4; i2++) {
                z3 |= composer.changed(objArr[i2]);
            }
            Object rememberedValue2 = composer.rememberedValue();
            if (z3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new PointerIconKt$pointerHoverIcon$2$1$1(pointerIconModifierLocal, pointerIcon2, z2, pointerIconKt$pointerHoverIcon$2$onSetIcon$1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) rememberedValue2, composer, 0);
            if (pointerIconModifierLocal.m59556l()) {
                composer.startReplaceableGroup(1157296644);
                boolean changed = composer.changed(pointerIconModifierLocal);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1(pointerIconModifierLocal, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                modifier = SuspendingPointerInputFilterKt.pointerInput(composed, pointerIconModifierLocal, (Function2) rememberedValue3);
            } else {
                modifier = Modifier.Companion;
            }
            then = pointerIconModifierLocal.then(modifier);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}