package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p003ui.input.pointer.PointerInputChange;
import androidx.compose.p003ui.input.pointer.util.VelocityTracker;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aÑ\u0001\u0010\u001f\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2>\b\u0002\u0010\u001b\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2>\b\u0002\u0010\u001d\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012¢\u0006\u0002\b\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\rø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001aZ\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0014\u0018\u00010'*\u00020!2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r0\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0$2\u0006\u0010&\u001a\u00020%2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aS\u0010/\u001a\u00020\r*\u00020!2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u00142\u0006\u0010&\u001a\u00020%2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aA\u00104\u001a\u00020\r*\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u0000H\u0082@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a!\u00106\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001a!\u00109\u001a\u00020\u0001*\u0002082\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b9\u00107\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006:"}, m28850d2 = {"Lkotlin/Function1;", "", "", "onDelta", "Landroidx/compose/foundation/gestures/DraggableState;", "DraggableState", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/foundation/gestures/DraggableState;", "rememberDraggableState", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/gestures/DraggableState;", "Landroidx/compose/ui/Modifier;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ParameterName;", "name", "startedPosition", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onDragStarted", "velocity", "onDragStopped", "reverseDirection", "draggable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Z)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "canDrag", "Lkotlin/Function0;", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "velocityTracker", "Lkotlin/Pair;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startEvent", "initialDelta", "Lkotlinx/coroutines/channels/SendChannel;", "Landroidx/compose/foundation/gestures/DragEvent;", "channel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;JLandroidx/compose/ui/input/pointer/util/VelocityTracker;Lkotlinx/coroutines/channels/SendChannel;ZLandroidx/compose/foundation/gestures/Orientation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "onDrag", OperatorName.CURVE_TO, "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/gestures/Orientation;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(JLandroidx/compose/foundation/gestures/Orientation;)F", "Landroidx/compose/ui/unit/Velocity;", "e", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,583:1\n25#2:584\n1097#3,6:585\n658#4,18:591\n676#4,4:618\n680#4,58:629\n581#4,6:687\n615#4,4:693\n619#4,2:706\n621#4,8:715\n588#4,10:723\n116#5,2:609\n33#5,6:611\n118#5:617\n33#5,6:622\n118#5:628\n116#5,2:697\n33#5,6:699\n118#5:705\n33#5,6:708\n118#5:714\n*S KotlinDebug\n*F\n+ 1 Draggable.kt\nandroidx/compose/foundation/gestures/DraggableKt\n*L\n142#1:584\n142#1:585,6\n490#1:591,18\n490#1:618,4\n490#1:629,58\n543#1:687,6\n543#1:693,4\n543#1:706,2\n543#1:715,8\n543#1:723,10\n490#1:609,2\n490#1:611,6\n490#1:617\n490#1:622,6\n490#1:628\n543#1:697,2\n543#1:699,6\n543#1:705\n543#1:708,6\n543#1:714\n*E\n"})
/* loaded from: classes.dex */
public final class DraggableKt {
    @NotNull
    public static final DraggableState DraggableState(@NotNull Function1<? super Float, Unit> onDelta) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        return new DefaultDraggableState(onDelta);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v17, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0225 -> B:168:0x0234). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x028e -> B:179:0x0293). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:194:0x02df -> B:168:0x0234). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m61500a(androidx.compose.p003ui.input.pointer.AwaitPointerEventScope r20, kotlin.jvm.functions.Function1 r21, kotlin.jvm.functions.Function0 r22, androidx.compose.p003ui.input.pointer.util.VelocityTracker r23, androidx.compose.foundation.gestures.Orientation r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m61500a(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.ui.input.pointer.util.VelocityTracker, androidx.compose.foundation.gestures.Orientation, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m61499b(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, long j, VelocityTracker velocityTracker, SendChannel sendChannel, boolean z, Orientation orientation, Continuation continuation) {
        long j2;
        sendChannel.mo74066trySendJP2dKIU(new DragEvent.DragStarted(Offset.m71506minusMKHz9U(pointerInputChange.m72714getPositionF1C5BW0(), OffsetKt.Offset(Offset.m71502getXimpl(j) * Math.signum(Offset.m71502getXimpl(pointerInputChange.m72714getPositionF1C5BW0())), Offset.m71503getYimpl(j) * Math.signum(Offset.m71503getYimpl(pointerInputChange.m72714getPositionF1C5BW0())))), null));
        if (z) {
            j2 = Offset.m71509timestuRUvjQ(j, -1.0f);
        } else {
            j2 = j;
        }
        sendChannel.mo74066trySendJP2dKIU(new DragEvent.DragDelta(j2, null));
        return m61498c(awaitPointerEventScope, orientation, pointerInputChange.m72713getIdJ3iCeTQ(), new DraggableKt$awaitDrag$2(velocityTracker, sendChannel, z), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0114, code lost:
        if ((!r16) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0090 -> B:104:0x0097). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m61498c(androidx.compose.p003ui.input.pointer.AwaitPointerEventScope r18, androidx.compose.foundation.gestures.Orientation r19, long r20, kotlin.jvm.functions.Function1 r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableKt.m61498c(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.gestures.Orientation, long, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: d */
    public static final float m61497d(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Offset.m71503getYimpl(j);
        }
        return Offset.m71502getXimpl(j);
    }

    @NotNull
    public static final Modifier draggable(@NotNull Modifier modifier, @NotNull DraggableState state, @NotNull Orientation orientation, boolean z, @Nullable MutableInteractionSource mutableInteractionSource, boolean z2, @NotNull Function3<? super CoroutineScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z3) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        return modifier.then(new DraggableElement(state, DraggableKt$draggable$3.INSTANCE, orientation, z, mutableInteractionSource, new DraggableKt$draggable$4(z2), onDragStarted, new DraggableKt$draggable$5(onDragStopped, orientation, null), z3));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, Function3 function3, Function3 function32, boolean z3, int i, Object obj) {
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        boolean z5;
        DraggableKt$draggable$1 draggableKt$draggable$1;
        DraggableKt$draggable$2 draggableKt$draggable$2;
        boolean z6;
        if ((i & 4) != 0) {
            z4 = true;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            mutableInteractionSource2 = null;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i & 16) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 32) != 0) {
            draggableKt$draggable$1 = new DraggableKt$draggable$1(null);
        } else {
            draggableKt$draggable$1 = function3;
        }
        if ((i & 64) != 0) {
            draggableKt$draggable$2 = new DraggableKt$draggable$2(null);
        } else {
            draggableKt$draggable$2 = function32;
        }
        if ((i & 128) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        return draggable(modifier, draggableState, orientation, z4, mutableInteractionSource2, z5, draggableKt$draggable$1, draggableKt$draggable$2, z6);
    }

    /* renamed from: e */
    public static final float m61496e(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Velocity.m73884getYimpl(j);
        }
        return Velocity.m73883getXimpl(j);
    }

    @Composable
    @NotNull
    public static final DraggableState rememberDraggableState(@NotNull Function1<? super Float, Unit> onDelta, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onDelta, "onDelta");
        composer.startReplaceableGroup(-183245213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:139)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onDelta, composer, i & 14);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = DraggableState(new DraggableKt$rememberDraggableState$1$1(rememberUpdatedState));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DraggableState draggableState = (DraggableState) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return draggableState;
    }
}
