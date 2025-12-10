package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.ClosedRange;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a%\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, m28850d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,906:1\n50#2:907\n49#2:908\n1097#3,6:909\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManagerKt\n*L\n809#1:907\n809#1:908\n809#1:909,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(boolean z, @NotNull ResolvedTextDirection direction, @NotNull TextFieldSelectionManager manager, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z);
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(manager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = manager.handleDragObserver$foundation_release(z);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        int i2 = i << 3;
        AndroidSelectionHandles_androidKt.m69830SelectionHandle8fL75g(manager.m69893getHandlePositiontuRUvjQ$foundation_release(z), z, direction, TextRange.m73215getReversedimpl(manager.getValue$foundation_release().m73425getSelectiond9O1mEE()), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(textDragObserver, null)), null, startRestartGroup, (i2 & 112) | ProfileVerifier.CompilationStatus.f36531xf2722a21 | (i2 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z, direction, manager, i));
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c  reason: not valid java name */
    public static final long m69894calculateSelectionMagnifierCenterAndroidO0kMr_c(@NotNull TextFieldSelectionManager manager, long j) {
        int i;
        int m73216getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        boolean z;
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.getValue$foundation_release().getText().length() == 0) {
            return Offset.Companion.m71517getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        if (draggingHandle == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        }
        if (i != -1) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    m73216getStartimpl = TextRange.m73211getEndimpl(manager.getValue$foundation_release().m73425getSelectiond9O1mEE());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                m73216getStartimpl = TextRange.m73216getStartimpl(manager.getValue$foundation_release().m73425getSelectiond9O1mEE());
            }
            int originalToTransformed = manager.getOffsetMapping$foundation_release().originalToTransformed(m73216getStartimpl);
            TextFieldState state$foundation_release = manager.getState$foundation_release();
            if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state$foundation_release2 = manager.getState$foundation_release();
                if (state$foundation_release2 != null && (textDelegate = state$foundation_release2.getTextDelegate()) != null && (text = textDelegate.getText()) != null) {
                    int coerceIn = AbstractC11719c.coerceIn(originalToTransformed, (ClosedRange<Integer>) StringsKt__StringsKt.getIndices(text));
                    long m71532getCenterF1C5BW0 = value.getBoundingBox(coerceIn).m71532getCenterF1C5BW0();
                    TextFieldState state$foundation_release3 = manager.getState$foundation_release();
                    if (state$foundation_release3 != null && (layoutCoordinates = state$foundation_release3.getLayoutCoordinates()) != null) {
                        TextFieldState state$foundation_release4 = manager.getState$foundation_release();
                        if (state$foundation_release4 != null && (layoutResult2 = state$foundation_release4.getLayoutResult()) != null && (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) != null) {
                            Offset m69891getCurrentDragPosition_m7T9E = manager.m69891getCurrentDragPosition_m7T9E();
                            if (m69891getCurrentDragPosition_m7T9E != null) {
                                float m71502getXimpl = Offset.m71502getXimpl(innerTextFieldCoordinates.mo72817localPositionOfR5De75A(layoutCoordinates, m69891getCurrentDragPosition_m7T9E.m71512unboximpl()));
                                int lineForOffset = value.getLineForOffset(coerceIn);
                                int lineStart = value.getLineStart(lineForOffset);
                                int lineEnd = value.getLineEnd(lineForOffset, true);
                                if (TextRange.m73216getStartimpl(manager.getValue$foundation_release().m73425getSelectiond9O1mEE()) > TextRange.m73211getEndimpl(manager.getValue$foundation_release().m73425getSelectiond9O1mEE())) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z);
                                float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z);
                                float coerceIn2 = AbstractC11719c.coerceIn(m71502getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
                                if (Math.abs(m71502getXimpl - coerceIn2) > IntSize.m73818getWidthimpl(j) / 2) {
                                    return Offset.Companion.m71517getUnspecifiedF1C5BW0();
                                }
                                return layoutCoordinates.mo72817localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(coerceIn2, Offset.m71503getYimpl(m71532getCenterF1C5BW0)));
                            }
                            return Offset.Companion.m71517getUnspecifiedF1C5BW0();
                        }
                        return Offset.Companion.m71517getUnspecifiedF1C5BW0();
                    }
                    return Offset.Companion.m71517getUnspecifiedF1C5BW0();
                }
                return Offset.Companion.m71517getUnspecifiedF1C5BW0();
            }
            return Offset.Companion.m71517getUnspecifiedF1C5BW0();
        }
        return Offset.Companion.m71517getUnspecifiedF1C5BW0();
    }

    public static final boolean isSelectionHandleInVisibleBound(@NotNull TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        Intrinsics.checkNotNullParameter(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release != null && (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) != null && (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) != null) {
            return SelectionManagerKt.m69876containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m69893getHandlePositiontuRUvjQ$foundation_release(z));
        }
        return false;
    }
}
