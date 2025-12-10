package th.p047co.dtac.android.dtacone.widget.compose.signature;

import android.graphics.Bitmap;
import androidx.compose.foundation.gestures.TransformableKt;
import androidx.compose.foundation.gestures.TransformableState;
import androidx.compose.foundation.gestures.TransformableStateKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nSignaturePageScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignaturePageScreen.kt\nth/co/dtac/android/dtacone/widget/compose/signature/SignaturePageScreenKt$PdfPreview$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1068:1\n25#2:1069\n67#2,3:1076\n66#2:1079\n50#2:1086\n49#2:1087\n50#2:1094\n49#2:1095\n36#2:1103\n1097#3,6:1070\n1097#3,6:1080\n1097#3,6:1088\n1097#3,6:1096\n1097#3,6:1104\n154#4:1102\n75#5:1110\n108#5,2:1111\n81#6:1113\n107#6,2:1114\n*S KotlinDebug\n*F\n+ 1 SignaturePageScreen.kt\nth/co/dtac/android/dtacone/widget/compose/signature/SignaturePageScreenKt$PdfPreview$2\n*L\n719#1:1069\n720#1:1076,3\n720#1:1079\n738#1:1086\n738#1:1087\n744#1:1094\n744#1:1095\n756#1:1103\n719#1:1070,6\n720#1:1080,6\n738#1:1088,6\n744#1:1096,6\n756#1:1104,6\n755#1:1102\n716#1:1110\n716#1:1111,2\n719#1:1113\n719#1:1114,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$PdfPreview$2 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$PdfPreview$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<Bitmap>> $renderedBitmaps$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$PdfPreview$2(MutableState<List<Bitmap>> mutableState) {
        super(3);
        this.$renderedBitmaps$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invoke$lambda$3(MutableState<Offset> mutableState) {
        return mutableState.getValue().m71696unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$4(MutableState<Offset> mutableState, long j) {
        mutableState.setValue(Offset.m71675boximpl(j));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1894912950, i2, -1, "th.co.dtac.android.dtacone.widget.compose.signature.PdfPreview.<anonymous> (SignaturePageScreen.kt:712)");
        }
        MutableFloatState mutableFloatState = (MutableFloatState) RememberSaveableKt.m71590rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) SignaturePageScreenKt$PdfPreview$2$scale$2.INSTANCE, composer, 3080, 6);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = AbstractC19036aL1.m65148g(Offset.m71675boximpl(Offset.Companion.m71702getZeroF1C5BW0()), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(mutableFloatState) | composer.changed(BoxWithConstraints) | composer.changed(mutableState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SignaturePageScreenKt$PdfPreview$2$state$1$1(BoxWithConstraints, mutableFloatState, mutableState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        TransformableState rememberTransformableState = TransformableStateKt.rememberTransformableState((Function3) rememberedValue2, composer, 0);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
        composer.startReplaceableGroup(511388516);
        boolean changed2 = composer.changed(mutableFloatState) | composer.changed(mutableState);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new SignaturePageScreenKt$PdfPreview$2$1$1(mutableFloatState, mutableState);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(fillMaxSize$default, (Function1) rememberedValue3);
        Float valueOf = Float.valueOf(mutableFloatState.getFloatValue());
        composer.startReplaceableGroup(511388516);
        boolean changed3 = composer.changed(mutableFloatState) | composer.changed(mutableState);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new SignaturePageScreenKt$PdfPreview$2$2$1(mutableFloatState, mutableState, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceableGroup();
        Modifier transformable$default = TransformableKt.transformable$default(SuspendingPointerInputFilterKt.pointerInput(graphicsLayer, valueOf, (Function2) rememberedValue4), rememberTransformableState, false, false, 6, null);
        PaddingValues m69706PaddingValues0680j_4 = PaddingKt.m69706PaddingValues0680j_4(C3623Dp.m73842constructorimpl(16));
        MutableState<List<Bitmap>> mutableState2 = this.$renderedBitmaps$delegate;
        composer.startReplaceableGroup(1157296644);
        boolean changed4 = composer.changed(mutableState2);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed4 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new SignaturePageScreenKt$PdfPreview$2$3$1(mutableState2);
            composer.updateRememberedValue(rememberedValue5);
        }
        composer.endReplaceableGroup();
        LazyDslKt.LazyColumn(transformable$default, null, m69706PaddingValues0680j_4, false, null, null, null, false, (Function1) rememberedValue5, composer, 384, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}