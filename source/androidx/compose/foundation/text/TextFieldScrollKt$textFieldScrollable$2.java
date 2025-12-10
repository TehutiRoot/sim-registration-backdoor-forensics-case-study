package androidx.compose.foundation.text;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,370:1\n76#2:371\n36#3:372\n50#3:379\n49#3:380\n1097#4,6:373\n1097#4,6:381\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollKt$textFieldScrollable$2\n*L\n69#1:371\n71#1:372\n84#1:379\n84#1:380\n71#1:373,6\n84#1:381,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, MutableInteractionSource mutableInteractionSource) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Modifier scrollable;
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(805428266);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(805428266, i, -1, "androidx.compose.foundation.text.textFieldScrollable.<anonymous> (TextFieldScroll.kt:66)");
        }
        boolean z = this.$scrollerPosition.getOrientation() == Orientation.Vertical || !(composer.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl);
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(textFieldScrollerPosition);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldScrollKt$textFieldScrollable$2$scrollableState$1$1(textFieldScrollerPosition);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ScrollableState rememberScrollableState = ScrollableStateKt.rememberScrollableState((Function1) rememberedValue, composer, 0);
        TextFieldScrollerPosition textFieldScrollerPosition2 = this.$scrollerPosition;
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(rememberScrollableState) | composer.changed(textFieldScrollerPosition2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new ScrollableState(textFieldScrollerPosition2) { // from class: androidx.compose.foundation.text.TextFieldScrollKt$textFieldScrollable$2$wrappedScrollableState$1$1

                /* renamed from: b */
                public final State f14042b;

                /* renamed from: c */
                public final State f14043c;

                {
                    this.f14042b = SnapshotStateKt.derivedStateOf(new C3024xe39168d8(textFieldScrollerPosition2));
                    this.f14043c = SnapshotStateKt.derivedStateOf(new C3023x355dcd8c(textFieldScrollerPosition2));
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public float dispatchRawDelta(float f) {
                    return ScrollableState.this.dispatchRawDelta(f);
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean getCanScrollBackward() {
                    return ((Boolean) this.f14043c.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean getCanScrollForward() {
                    return ((Boolean) this.f14042b.getValue()).booleanValue();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                public boolean isScrollInProgress() {
                    return ScrollableState.this.isScrollInProgress();
                }

                @Override // androidx.compose.foundation.gestures.ScrollableState
                @Nullable
                public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
                    return ScrollableState.this.scroll(mutatePriority, function2, continuation);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        scrollable = ScrollableKt.scrollable(Modifier.Companion, rememberedValue2, this.$scrollerPosition.getOrientation(), (r14 & 4) != 0 ? true : this.$enabled && this.$scrollerPosition.getMaximum() != 0.0f, (r14 & 8) != 0 ? false : z, (r14 & 16) != 0 ? null : null, (r14 & 32) != 0 ? null : this.$interactionSource);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return scrollable;
    }
}
