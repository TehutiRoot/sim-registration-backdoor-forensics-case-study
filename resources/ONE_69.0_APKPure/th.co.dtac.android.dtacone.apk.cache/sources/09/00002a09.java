package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00158GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R5\u0010!\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000e0\u001a8GX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m29142d2 = {"Landroidx/compose/material/AnchoredDraggableDefaults;", "", "<init>", "()V", "T", "Landroidx/compose/material/AnchoredDraggableState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "ReconcileAnimationOnAnchorChangedCallback$material_release", "(Landroidx/compose/material/AnchoredDraggableState;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "ReconcileAnimationOnAnchorChangedCallback", "Landroidx/compose/animation/core/SpringSpec;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "AnimationSpec", "Lkotlin/Function0;", "getVelocityThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "getVelocityThreshold$annotations", "velocityThreshold", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "totalDistance", "getPositionalThreshold", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "getPositionalThreshold$annotations", "positionalThreshold", "material_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,710:1\n76#2:711\n76#2:720\n1#3:712\n36#4:713\n36#4:721\n1097#5,6:714\n1097#5,6:722\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableDefaults\n*L\n655#1:711\n664#1:720\n655#1:713\n665#1:721\n655#1:714,6\n665#1:722,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    @NotNull
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    /* renamed from: a */
    public static final SpringSpec f14411a = new SpringSpec(0.0f, 0.0f, null, 7, null);

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getVelocityThreshold$annotations() {
    }

    @ExperimentalMaterialApi
    @NotNull
    public final <T> AnchoredDraggableState.AnchorChangedCallback<T> ReconcileAnimationOnAnchorChangedCallback$material_release(@NotNull final AnchoredDraggableState<T> state, @NotNull final CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new AnchoredDraggableState.AnchorChangedCallback() { // from class: androidx.compose.material.AnchoredDraggableDefaults$ReconcileAnimationOnAnchorChangedCallback$1
            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            public final void onAnchorsChanged(Object obj, Map previousAnchors, Map newAnchors) {
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = (Float) newAnchors.get(obj);
                if (!Intrinsics.areEqual((Float) previousAnchors.get(obj), f)) {
                    if (f != null) {
                        AbstractC1539Vc.m65885e(CoroutineScope.this, null, null, new C3037xbdc6dec3(state, obj, null), 3, null);
                    } else {
                        AbstractC1539Vc.m65885e(CoroutineScope.this, null, null, new C3038xbdc6dec4(state, newAnchors, null), 3, null);
                    }
                }
            }
        };
    }

    @ExperimentalMaterialApi
    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return f14411a;
    }

    @JvmName(name = "getPositionalThreshold")
    @NotNull
    @Composable
    @ExperimentalMaterialApi
    public final Function1<Float, Float> getPositionalThreshold(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(82866976);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(82866976, i, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-positionalThreshold> (AnchoredDraggable.kt:663)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AnchoredDraggableDefaults$positionalThreshold$1$1$1(density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function1<Float, Float> function1 = (Function1) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function1;
    }

    @JvmName(name = "getVelocityThreshold")
    @NotNull
    @Composable
    @ExperimentalMaterialApi
    public final Function0<Float> getVelocityThreshold(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2030704141);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030704141, i, -1, "androidx.compose.material.AnchoredDraggableDefaults.<get-velocityThreshold> (AnchoredDraggable.kt:654)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AnchoredDraggableDefaults$velocityThreshold$1$1$1(density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function0<Float> function0 = (Function0) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function0;
    }
}