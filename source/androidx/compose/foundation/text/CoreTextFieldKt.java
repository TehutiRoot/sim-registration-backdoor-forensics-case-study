package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.input.key.KeyInputModifierKt;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.input.ImeOptions;
import androidx.compose.p003ui.text.input.OffsetMapping;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.input.TextInputService;
import androidx.compose.p003ui.text.input.TextInputSession;
import androidx.compose.p003ui.text.style.ResolvedTextDirection;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001að\u0001\u0010\"\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u001123\b\u0002\u0010!\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001d¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u001dH\u0001¢\u0006\u0004\b\"\u0010#\u001a2\u0010'\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001dH\u0003¢\u0006\u0004\b'\u0010(\u001a#\u0010+\u001a\u00020\u0005*\u00020\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u00100\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u00101\u001a7\u00106\u001a\u00020\u00032\u0006\u00103\u001a\u0002022\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0017\u00108\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b8\u00109\u001a7\u0010>\u001a\u00020\u0003*\u00020:2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\u000b2\u0006\u00105\u001a\u000204H\u0080@ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a\u001f\u0010A\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010@\u001a\u00020\u0011H\u0003¢\u0006\u0004\bA\u0010B\u001a\u0017\u0010C\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\bC\u0010D\u001a'\u0010E\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, m28850d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/ui/text/TextLayoutResult;", "onTextLayout", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "enabled", "readOnly", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", "name", "innerTextField", "decorationBox", "CoreTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;ZIILandroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/text/KeyboardActions;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "content", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/TextFieldState;", RemoteConfigConstants.ResponseFieldKey.STATE, OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/focus/FocusRequester;", "focusRequester", "allowKeyboard", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/focus/FocusRequester;Z)V", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "d", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/OffsetMapping;)V", "e", "(Landroidx/compose/foundation/text/TextFieldState;)V", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "textLayoutResult", "bringSelectionEndIntoView", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "show", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;ZLandroidx/compose/runtime/Composer;I)V", "TextFieldCursorHandle", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/text/TextFieldState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;)V", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 13 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,1121:1\n25#2:1122\n36#2:1134\n50#2:1141\n49#2:1142\n25#2:1149\n25#2:1156\n25#2:1163\n25#2:1177\n25#2:1188\n456#2,8:1212\n464#2,3:1226\n467#2,3:1232\n36#2:1238\n36#2:1246\n1097#3,6:1123\n1097#3,6:1135\n1097#3,6:1143\n1097#3,6:1150\n1097#3,6:1157\n1097#3,6:1164\n1097#3,3:1178\n1100#3,3:1184\n1097#3,6:1189\n1097#3,6:1239\n1097#3,6:1247\n76#4:1129\n76#4:1130\n76#4:1131\n76#4:1132\n76#4:1133\n76#4:1170\n76#4:1171\n76#4:1172\n76#4:1245\n486#5,4:1173\n490#5,2:1181\n494#5:1187\n486#6:1183\n66#7,6:1195\n72#7:1229\n76#7:1236\n78#8,11:1201\n91#8:1235\n4144#9,6:1220\n30#10,2:1230\n1#11:1237\n495#12,4:1253\n500#12:1262\n129#13,5:1257\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt\n*L\n203#1:1122\n219#1:1134\n222#1:1141\n222#1:1142\n235#1:1149\n263#1:1156\n266#1:1163\n278#1:1177\n279#1:1188\n703#1:1212,8\n703#1:1226,3\n703#1:1232,3\n1071#1:1238\n1079#1:1246\n203#1:1123,6\n219#1:1135,6\n222#1:1143,6\n235#1:1150,6\n263#1:1157,6\n266#1:1164,6\n278#1:1178,3\n278#1:1184,3\n279#1:1189,6\n1071#1:1239,6\n1079#1:1247,6\n207#1:1129\n208#1:1130\n209#1:1131\n210#1:1132\n211#1:1133\n272#1:1170\n273#1:1171\n274#1:1172\n1072#1:1245\n278#1:1173,4\n278#1:1181,2\n278#1:1187\n278#1:1183\n703#1:1195,6\n703#1:1229\n703#1:1236\n703#1:1201,11\n703#1:1235\n703#1:1220,6\n704#1:1230,2\n1107#1:1253,4\n1107#1:1262\n1107#1:1257,5\n*E\n"})
/* loaded from: classes.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Code restructure failed: missing block: B:579:0x045c, code lost:
        if (r12 == null) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x03cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x05ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0696 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:635:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CoreTextField(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.TextFieldValue r46, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.text.input.TextFieldValue, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r48, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r49, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.input.VisualTransformation r50, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.text.TextLayoutResult, kotlin.Unit> r51, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r52, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Brush r53, boolean r54, int r55, int r56, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.input.ImeOptions r57, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r58, boolean r59, boolean r60, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 2009
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.CoreTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldCursorHandle(@NotNull TextFieldSelectionManager manager, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1436003720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1436003720, i, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (CoreTextField.kt:1068)");
        }
        TextFieldState state$foundation_release = manager.getState$foundation_release();
        if (state$foundation_release != null && state$foundation_release.getShowCursorHandle()) {
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(manager);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = manager.cursorDragObserver$foundation_release();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
            long m69892getCursorPositiontuRUvjQ$foundation_release = manager.m69892getCursorPositiontuRUvjQ$foundation_release((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new CoreTextFieldKt$TextFieldCursorHandle$1(textDragObserver, null));
            Offset m71491boximpl = Offset.m71491boximpl(m69892getCursorPositiontuRUvjQ$foundation_release);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(m71491boximpl);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new CoreTextFieldKt$TextFieldCursorHandle$2$1(m69892getCursorPositiontuRUvjQ$foundation_release);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidCursorHandle_androidKt.m69714CursorHandleULxng0E(m69892getCursorPositiontuRUvjQ$foundation_release, SemanticsModifierKt.semantics$default(pointerInput, false, (Function1) rememberedValue2, 1, null), null, startRestartGroup, 384);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$TextFieldCursorHandle$3(manager, i));
        }
    }

    /* renamed from: a */
    public static final void m61076a(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager, Function2 function2, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-20551815);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-20551815, i, -1, "androidx.compose.foundation.text.CoreTextFieldRootBox (CoreTextField.kt:697)");
        }
        startRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), true, startRestartGroup, 48);
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m71393constructorimpl = Updater.m71393constructorimpl(startRestartGroup);
        Updater.m71400setimpl(m71393constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1985516685);
        function2.invoke(startRestartGroup, Integer.valueOf(((((i >> 3) & 112) | 8) >> 3) & 14));
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$CoreTextFieldRootBox$2(modifier, textFieldSelectionManager, function2, i));
        }
    }

    public static final /* synthetic */ void access$onBlur(TextFieldState textFieldState) {
        m61072e(textFieldState);
    }

    /* renamed from: b */
    public static final void m61075b(TextFieldSelectionManager textFieldSelectionManager, boolean z, Composer composer, int i) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        boolean z2;
        Composer startRestartGroup = composer.startRestartGroup(626339208);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626339208, i, -1, "androidx.compose.foundation.text.SelectionToolbarAndHandles (CoreTextField.kt:1025)");
        }
        if (z) {
            TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
            TextLayoutResult textLayoutResult = null;
            if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state$foundation_release2 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    z2 = state$foundation_release2.isLayoutResultStale();
                } else {
                    z2 = true;
                }
                if (!z2) {
                    textLayoutResult = value;
                }
            }
            if (textLayoutResult != null) {
                if (!TextRange.m73210getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().m73425getSelectiond9O1mEE())) {
                    int originalToTransformed = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m73216getStartimpl(textFieldSelectionManager.getValue$foundation_release().m73425getSelectiond9O1mEE()));
                    int originalToTransformed2 = textFieldSelectionManager.getOffsetMapping$foundation_release().originalToTransformed(TextRange.m73211getEndimpl(textFieldSelectionManager.getValue$foundation_release().m73425getSelectiond9O1mEE()));
                    ResolvedTextDirection bidiRunDirection = textLayoutResult.getBidiRunDirection(originalToTransformed);
                    ResolvedTextDirection bidiRunDirection2 = textLayoutResult.getBidiRunDirection(Math.max(originalToTransformed2 - 1, 0));
                    startRestartGroup.startReplaceableGroup(-498389736);
                    TextFieldState state$foundation_release3 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release3 != null && state$foundation_release3.getShowSelectionHandleStart()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(true, bidiRunDirection, textFieldSelectionManager, startRestartGroup, 518);
                    }
                    startRestartGroup.endReplaceableGroup();
                    TextFieldState state$foundation_release4 = textFieldSelectionManager.getState$foundation_release();
                    if (state$foundation_release4 != null && state$foundation_release4.getShowSelectionHandleEnd()) {
                        TextFieldSelectionManagerKt.TextFieldSelectionHandle(false, bidiRunDirection2, textFieldSelectionManager, startRestartGroup, 518);
                    }
                }
                TextFieldState state$foundation_release5 = textFieldSelectionManager.getState$foundation_release();
                if (state$foundation_release5 != null) {
                    if (textFieldSelectionManager.isTextChanged$foundation_release()) {
                        state$foundation_release5.setShowFloatingToolbar(false);
                    }
                    if (state$foundation_release5.getHasFocus()) {
                        if (state$foundation_release5.getShowFloatingToolbar()) {
                            textFieldSelectionManager.showSelectionToolbar$foundation_release();
                        } else {
                            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                        }
                    }
                }
            }
        } else {
            textFieldSelectionManager.hideSelectionToolbar$foundation_release();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CoreTextFieldKt$SelectionToolbarAndHandles$2(textFieldSelectionManager, z, i));
        }
    }

    @Nullable
    public static final Object bringSelectionEndIntoView(@NotNull BringIntoViewRequester bringIntoViewRequester, @NotNull TextFieldValue textFieldValue, @NotNull TextDelegate textDelegate, @NotNull TextLayoutResult textLayoutResult, @NotNull OffsetMapping offsetMapping, @NotNull Continuation<? super Unit> continuation) {
        Rect rect;
        int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m73213getMaximpl(textFieldValue.m73425getSelectiond9O1mEE()));
        if (originalToTransformed < textLayoutResult.getLayoutInput().getText().length()) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed);
        } else if (originalToTransformed != 0) {
            rect = textLayoutResult.getBoundingBox(originalToTransformed - 1);
        } else {
            rect = new Rect(0.0f, 0.0f, 1.0f, IntSize.m73817getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null)));
        }
        Object bringIntoView = bringIntoViewRequester.bringIntoView(rect, continuation);
        if (bringIntoView == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return bringIntoView;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final void m61074c(TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot createNonObservableSnapshot = Snapshot.Companion.createNonObservableSnapshot();
        try {
            Snapshot makeCurrent = createNonObservableSnapshot.makeCurrent();
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            if (layoutResult == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            TextInputSession inputSession = textFieldState.getInputSession();
            if (inputSession == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            LayoutCoordinates layoutCoordinates = textFieldState.getLayoutCoordinates();
            if (layoutCoordinates == null) {
                createNonObservableSnapshot.restoreCurrent(makeCurrent);
                return;
            }
            TextFieldDelegate.Companion.notifyFocusedRect$foundation_release(textFieldValue, textFieldState.getTextDelegate(), layoutResult.getValue(), layoutCoordinates, inputSession, textFieldState.getHasFocus(), offsetMapping);
            Unit unit = Unit.INSTANCE;
            createNonObservableSnapshot.restoreCurrent(makeCurrent);
        } finally {
            createNonObservableSnapshot.dispose();
        }
    }

    /* renamed from: d */
    public static final void m61073d(TextInputService textInputService, TextFieldState textFieldState, TextFieldValue textFieldValue, ImeOptions imeOptions, OffsetMapping offsetMapping) {
        if (textFieldState.getHasFocus()) {
            textFieldState.setInputSession(TextFieldDelegate.Companion.onFocus$foundation_release(textInputService, textFieldValue, textFieldState.getProcessor(), imeOptions, textFieldState.getOnValueChange(), textFieldState.getOnImeActionPerformed()));
            m61074c(textFieldState, textFieldValue, offsetMapping);
            return;
        }
        m61072e(textFieldState);
    }

    /* renamed from: e */
    public static final void m61072e(TextFieldState textFieldState) {
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.Companion.onBlur$foundation_release(inputSession, textFieldState.getProcessor(), textFieldState.getOnValueChange());
        }
        textFieldState.setInputSession(null);
    }

    /* renamed from: f */
    public static final Modifier m61071f(Modifier modifier, TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        return KeyInputModifierKt.onPreviewKeyEvent(modifier, new CoreTextFieldKt$previewKeyEventToDeselectOnBack$1(textFieldState, textFieldSelectionManager));
    }

    /* renamed from: g */
    public static final void m61070g(TextFieldState textFieldState, FocusRequester focusRequester, boolean z) {
        TextInputSession inputSession;
        if (!textFieldState.getHasFocus()) {
            focusRequester.requestFocus();
        } else if (z && (inputSession = textFieldState.getInputSession()) != null) {
            inputSession.showSoftwareKeyboard();
        }
    }
}
