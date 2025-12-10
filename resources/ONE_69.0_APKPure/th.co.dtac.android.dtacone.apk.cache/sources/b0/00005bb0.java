package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.Selection;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.ZIndexModifierKt;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.TextFieldValue;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\b\t\u001a;\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0018\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001c\u001a'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b!\u0010 \u001a?\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0003¢\u0006\u0004\b'\u0010(\u001aS\u00102\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0+2\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u00101\u001a\u0018\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\b0-¢\u0006\u0002\b/¢\u0006\u0002\b0H\u0003¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b4\u00105\u001a=\u00109\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:\u001a'\u0010;\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0001¢\u0006\u0004\b;\u0010<\u001a#\u0010=\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010?\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@\u001a'\u0010A\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0003¢\u0006\u0004\bA\u0010B\u001a`\u0010I\u001a\u00020\b2\u0006\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00106\u001a\u00020C2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u000e2!\u0010H\u001a\u001d\u0012\u0013\u0012\u00110C¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\b0-H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010J\u001ae\u0010P\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00106\u001a\u00020C2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\b0-2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\b\b\u0002\u0010M\u001a\u00020L2\b\b\u0002\u0010O\u001a\u00020N2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bP\u0010Q\u001a:\u0010T\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020R2\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\b0+¢\u0006\u0002\b/H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bT\u0010U\u001a-\u0010Z\u001a\u00020W2\u0006\u00108\u001a\u0002072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\u000eH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bX\u0010Y\u001a+\u0010_\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020[0^2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020[H\u0002¢\u0006\u0004\b_\u0010`\u001a/\u0010e\u001a\u00020[2\u0006\u0010a\u001a\u00020[2\u0006\u0010b\u001a\u00020[2\u0006\u0010c\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u000eH\u0002¢\u0006\u0004\be\u0010f\u001a\u001f\u0010g\u001a\u00020[2\u0006\u0010I\u001a\u00020[2\u0006\u0010=\u001a\u00020[H\u0002¢\u0006\u0004\bg\u0010h\u001a\u001b\u0010j\u001a\u00020\u0002*\u00020\u00022\u0006\u0010i\u001a\u00020\u0011H\u0003¢\u0006\u0004\bj\u0010k\u001a\u001b\u0010m\u001a\u00020W*\u00020\u000e2\u0006\u0010l\u001a\u00020\u000eH\u0002¢\u0006\u0004\bm\u0010n\"\u0017\u0010p\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bT\u0010o\"\u0017\u0010q\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010o\"\u0017\u0010r\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u0010o\"\u0017\u0010t\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bs\u0010o\"\u0017\u0010v\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bu\u0010o\"\u0017\u0010w\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010o\"\u0017\u0010x\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010o\"\u0017\u0010y\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010o\"\u0017\u0010z\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010o\"\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010|\"\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010|\"\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e0{8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010|\"\u0019\u0010\u0083\u0001\u001a\u00020R8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010o\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0084\u0001"}, m29142d2 = {"Landroidx/compose/material3/TimePickerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/TimePickerColors;", "colors", "Landroidx/compose/material3/TimePickerLayoutType;", "layoutType", "", "TimePicker-mT9BvqQ", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ILandroidx/compose/runtime/Composer;II)V", "TimePicker", "TimeInput", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "rememberTimePickerState", "(IIZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TimePickerState;", "autoSwitchToMinute", "VerticalTimePicker", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;II)V", "HorizontalTimePicker", OperatorName.SET_LINE_JOINSTYLE, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/material3/TimePickerState;Landroidx/compose/runtime/Composer;I)V", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", OperatorName.CLOSE_AND_STROKE, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CLOSE_PATH, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "t", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/graphics/Shape;", "startShape", "endShape", "i", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", PDPageLabelRange.STYLE_ROMAN_LOWER, "(ZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TimePickerColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", OperatorName.FILL_NON_ZERO, "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "value", "Landroidx/compose/material3/Selection;", "selection", OperatorName.SAVE, "(Landroidx/compose/ui/Modifier;ILandroidx/compose/material3/TimePickerState;ILandroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;I)V", "ClockFace", "(Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;ZLandroidx/compose/runtime/Composer;I)V", "x", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Landroidx/compose/material3/TimePickerColors;)Landroidx/compose/ui/Modifier;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/TimePickerState;Z)Landroidx/compose/ui/Modifier;", OperatorName.CURVE_TO, "(Landroidx/compose/material3/TimePickerState;IZLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "prevValue", "max", "Lkotlin/ParameterName;", "name", "onNewValue", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "(ILandroidx/compose/material3/TimePickerState;Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/TextFieldValue;ILkotlin/jvm/functions/Function1;)V", "onValueChange", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "o", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/TimePickerState;ILandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;Landroidx/compose/material3/TimePickerColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "radius", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "number", "", "numberContentDescription-YKJpE6Y", "(IZILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "numberContentDescription", "", "current", "new", "Lkotlin/Pair;", "A", "(FF)Lkotlin/Pair;", "x1", "y1", "x2", "y2", OperatorName.SET_LINE_WIDTH, "(FFII)F", "u", "(FF)F", "visible", "B", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "minDigits", "z", "(II)Ljava/lang/String;", "F", "OuterCircleSizeRadius", "InnerCircleRadius", "ClockDisplayBottomMargin", "d", "ClockFaceBottomMargin", "e", "DisplaySeparatorWidth", "SupportLabelTop", "TimeInputBottomPadding", "MaxDistance", "MinimumInteractiveSize", "", "Ljava/util/List;", "Minutes", OperatorName.NON_STROKING_CMYK, "Hours", OperatorName.LINE_TO, "ExtraHours", OperatorName.MOVE_TO, "PeriodToggleMargin", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 11 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 15 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1673:1\n67#2,3:1674\n66#2:1677\n460#2,13:1703\n473#2,3:1717\n460#2,13:1741\n473#2,3:1755\n36#2:1760\n36#2:1767\n460#2,13:1793\n460#2,13:1826\n473#2,3:1840\n473#2,3:1845\n460#2,13:1870\n460#2,13:1903\n473#2,3:1917\n473#2,3:1922\n460#2,13:1947\n460#2,13:1980\n473#2,3:1994\n473#2,3:1999\n25#2:2004\n25#2:2011\n36#2:2018\n456#2,11:2038\n36#2:2049\n36#2:2056\n467#2,3:2063\n36#2:2067\n460#2,13:2094\n473#2,3:2108\n25#2:2117\n36#2:2128\n25#2:2138\n25#2:2149\n36#2:2160\n460#2,13:2185\n36#2:2199\n473#2,3:2206\n25#2:2211\n25#2:2218\n460#2,13:2244\n460#2,13:2277\n36#2:2291\n473#2,3:2299\n473#2,3:2304\n67#2,3:2309\n66#2:2312\n456#2,14:2332\n1114#3,6:1678\n1114#3,6:1761\n1114#3,6:1768\n1114#3,6:2005\n1114#3,6:2012\n1114#3,6:2019\n1114#3,6:2050\n1114#3,6:2057\n1114#3,6:2068\n1114#3,3:2118\n1117#3,3:2124\n1114#3,6:2129\n1114#3,6:2139\n1114#3,3:2150\n1117#3,3:2156\n1114#3,6:2161\n1114#3,6:2200\n1114#3,6:2212\n1114#3,6:2219\n1114#3,6:2292\n1114#3,6:2313\n74#4,6:1684\n80#4:1716\n84#4:1721\n73#4,7:1850\n80#4:1883\n84#4:1926\n74#4,6:2225\n80#4:2257\n84#4:2308\n75#5:1690\n76#5,11:1692\n89#5:1720\n75#5:1728\n76#5,11:1730\n89#5:1758\n75#5:1780\n76#5,11:1782\n75#5:1813\n76#5,11:1815\n89#5:1843\n89#5:1848\n75#5:1857\n76#5,11:1859\n75#5:1890\n76#5,11:1892\n89#5:1920\n89#5:1925\n75#5:1934\n76#5,11:1936\n75#5:1967\n76#5,11:1969\n89#5:1997\n89#5:2002\n74#5:2025\n75#5,11:2027\n88#5:2066\n75#5:2081\n76#5,11:2083\n89#5:2111\n75#5:2172\n76#5,11:2174\n89#5:2209\n75#5:2231\n76#5,11:2233\n75#5:2264\n76#5,11:2266\n89#5:2302\n89#5:2307\n74#5:2319\n75#5,11:2321\n88#5:2346\n76#6:1691\n76#6:1729\n76#6:1781\n76#6:1814\n76#6:1858\n76#6:1891\n76#6:1935\n76#6:1968\n76#6:2026\n76#6:2075\n76#6:2082\n76#6:2136\n76#6:2173\n76#6:2232\n76#6:2265\n76#6:2298\n76#6:2320\n75#7,6:1722\n81#7:1754\n85#7:1759\n75#7,6:1774\n81#7:1806\n85#7:1849\n74#7,7:1927\n81#7:1960\n85#7:2003\n67#8,6:1807\n73#8:1839\n77#8:1844\n67#8,6:1884\n73#8:1916\n77#8:1921\n67#8,6:1961\n73#8:1993\n77#8:1998\n68#8,5:2076\n73#8:2107\n77#8:2112\n68#8,5:2167\n73#8:2198\n77#8:2210\n67#8,6:2258\n73#8:2290\n77#8:2303\n154#9:2074\n154#9:2358\n154#9:2359\n154#9:2360\n154#9:2361\n154#9:2362\n154#9:2363\n154#9:2364\n154#9:2365\n154#9:2366\n154#9:2371\n474#10,4:2113\n478#10,2:2121\n482#10:2127\n474#10,4:2145\n478#10,2:2153\n482#10:2159\n474#11:2123\n474#11:2155\n135#12:2135\n135#12:2347\n1#13:2137\n76#14:2348\n76#14:2349\n102#14,2:2350\n76#14:2352\n102#14,2:2353\n76#14:2355\n102#14,2:2356\n1549#15:2367\n1620#15,3:2368\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt\n*L\n445#1:1674,3\n445#1:1677\n668#1:1703,13\n668#1:1717,3\n683#1:1741,13\n683#1:1755,3\n699#1:1760\n702#1:1767\n706#1:1793,13\n787#1:1826,13\n787#1:1840,3\n706#1:1845,3\n803#1:1870,13\n806#1:1903,13\n806#1:1917,3\n803#1:1922,3\n822#1:1947,13\n825#1:1980,13\n825#1:1994,3\n822#1:1999,3\n884#1:2004\n927#1:2011\n982#1:2018\n980#1:2038,11\n994#1:2049\n1010#1:2056\n980#1:2063,3\n1034#1:2067\n1057#1:2094,13\n1057#1:2108,3\n1089#1:2117\n1092#1:2128\n1293#1:2138\n1294#1:2149\n1314#1:2160\n1309#1:2185,13\n1325#1:2199\n1309#1:2206,3\n1397#1:2211\n1398#1:2218\n1405#1:2244,13\n1424#1:2277,13\n1431#1:2291\n1424#1:2299,3\n1405#1:2304,3\n1489#1:2309,3\n1489#1:2312\n1503#1:2332,14\n445#1:1678,6\n699#1:1761,6\n702#1:1768,6\n884#1:2005,6\n927#1:2012,6\n982#1:2019,6\n994#1:2050,6\n1010#1:2057,6\n1034#1:2068,6\n1089#1:2118,3\n1089#1:2124,3\n1092#1:2129,6\n1293#1:2139,6\n1294#1:2150,3\n1294#1:2156,3\n1314#1:2161,6\n1325#1:2200,6\n1397#1:2212,6\n1398#1:2219,6\n1431#1:2292,6\n1489#1:2313,6\n668#1:1684,6\n668#1:1716\n668#1:1721\n803#1:1850,7\n803#1:1883\n803#1:1926\n1405#1:2225,6\n1405#1:2257\n1405#1:2308\n668#1:1690\n668#1:1692,11\n668#1:1720\n683#1:1728\n683#1:1730,11\n683#1:1758\n706#1:1780\n706#1:1782,11\n787#1:1813\n787#1:1815,11\n787#1:1843\n706#1:1848\n803#1:1857\n803#1:1859,11\n806#1:1890\n806#1:1892,11\n806#1:1920\n803#1:1925\n822#1:1934\n822#1:1936,11\n825#1:1967\n825#1:1969,11\n825#1:1997\n822#1:2002\n980#1:2025\n980#1:2027,11\n980#1:2066\n1057#1:2081\n1057#1:2083,11\n1057#1:2111\n1309#1:2172\n1309#1:2174,11\n1309#1:2209\n1405#1:2231\n1405#1:2233,11\n1424#1:2264\n1424#1:2266,11\n1424#1:2302\n1405#1:2307\n1503#1:2319\n1503#1:2321,11\n1503#1:2346\n668#1:1691\n683#1:1729\n706#1:1781\n787#1:1814\n803#1:1858\n806#1:1891\n822#1:1935\n825#1:1968\n980#1:2026\n1049#1:2075\n1057#1:2082\n1292#1:2136\n1309#1:2173\n1405#1:2232\n1424#1:2265\n1437#1:2298\n1503#1:2320\n683#1:1722,6\n683#1:1754\n683#1:1759\n706#1:1774,6\n706#1:1806\n706#1:1849\n822#1:1927,7\n822#1:1960\n822#1:2003\n787#1:1807,6\n787#1:1839\n787#1:1844\n806#1:1884,6\n806#1:1916\n806#1:1921\n825#1:1961,6\n825#1:1993\n825#1:1998\n1057#1:2076,5\n1057#1:2107\n1057#1:2112\n1309#1:2167,5\n1309#1:2198\n1309#1:2210\n1424#1:2258,6\n1424#1:2290\n1424#1:2303\n1035#1:2074\n1609#1:2358\n1610#1:2359\n1611#1:2360\n1612#1:2361\n1613#1:2362\n1615#1:2363\n1616#1:2364\n1617#1:2365\n1618#1:2366\n1622#1:2371\n1089#1:2113,4\n1089#1:2121,2\n1089#1:2127\n1294#1:2145,4\n1294#1:2153,2\n1294#1:2159\n1089#1:2123\n1294#1:2155\n1242#1:2135\n1632#1:2347\n195#1:2348\n699#1:2349\n699#1:2350,2\n702#1:2352\n702#1:2353,2\n1293#1:2355\n1293#1:2356,2\n1621#1:2367\n1621#1:2368,3\n*E\n"})
/* loaded from: classes2.dex */
public final class TimePickerKt {

    /* renamed from: d */
    public static final float f26473d;

    /* renamed from: e */
    public static final float f26474e;

    /* renamed from: g */
    public static final float f26476g;

    /* renamed from: k */
    public static final List f26480k;

    /* renamed from: l */
    public static final List f26481l;

    /* renamed from: m */
    public static final float f26482m;

    /* renamed from: a */
    public static final float f26470a = C3623Dp.m73842constructorimpl(101);

    /* renamed from: b */
    public static final float f26471b = C3623Dp.m73842constructorimpl(69);

    /* renamed from: c */
    public static final float f26472c = C3623Dp.m73842constructorimpl(36);

    /* renamed from: f */
    public static final float f26475f = C3623Dp.m73842constructorimpl(7);

    /* renamed from: h */
    public static final float f26477h = C3623Dp.m73842constructorimpl(74);

    /* renamed from: i */
    public static final float f26478i = C3623Dp.m73842constructorimpl(48);

    /* renamed from: j */
    public static final List f26479j = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55});

    static {
        float f = 24;
        f26473d = C3623Dp.m73842constructorimpl(f);
        f26474e = C3623Dp.m73842constructorimpl(f);
        f26476g = C3623Dp.m73842constructorimpl(f);
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
        f26480k = listOf;
        List<Number> list = listOf;
        ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
        for (Number number : list) {
            arrayList.add(Integer.valueOf((number.intValue() % 12) + 12));
        }
        f26481l = arrayList;
        f26482m = C3623Dp.m73842constructorimpl(12);
    }

    /* renamed from: A */
    public static final Pair m60396A(float f, float f2) {
        if (Math.abs(f - f2) <= 3.141592653589793d) {
            return new Pair(Float.valueOf(f), Float.valueOf(f2));
        }
        double d = f;
        if (d > 3.141592653589793d && f2 < 3.141592653589793d) {
            f2 += 6.2831855f;
        } else if (d < 3.141592653589793d && f2 > 3.141592653589793d) {
            f += 6.2831855f;
        }
        return new Pair(Float.valueOf(f), Float.valueOf(f2));
    }

    /* renamed from: B */
    public static final Modifier m60395B(Modifier modifier, boolean z) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TimePickerKt$visible$$inlined$debugInspectorInfo$1(z);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new VisibleModifier(z, noInspectorInfo));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ClockFace(@NotNull TimePickerState state, @NotNull TimePickerColors colors, boolean z, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer startRestartGroup = composer.startRestartGroup(-1525091100);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(state)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(colors)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(z)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1525091100, i2, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1125)");
            }
            CrossfadeKt.Crossfade(state.getValues$material3_release(), SemanticsModifierKt.semantics$default(SizeKt.m69748size3ABfNKs(BackgroundKt.m69504backgroundbw27NRU(Modifier.Companion, colors.m70886getClockDialColor0d7_KjU$material3_release(), RoundedCornerShapeKt.getCircleShape()), TimePickerTokens.INSTANCE.m71484getClockDialContainerSizeD9Ej5fM()), false, TimePickerKt$ClockFace$1.INSTANCE, 1, null), AnimationSpecKt.tween$default(350, 0, null, 6, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1628166511, true, new TimePickerKt$ClockFace$2(state, z, colors, i2)), startRestartGroup, 24584, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockFace$3(state, colors, z, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void HorizontalTimePicker(@org.jetbrains.annotations.NotNull androidx.compose.material3.TimePickerState r41, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r42, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r43, boolean r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.HorizontalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TimeInput(@org.jetbrains.annotations.NotNull androidx.compose.material3.TimePickerState r39, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r40, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r41, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.TimeInput(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: TimePicker-mT9BvqQ  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70896TimePickermT9BvqQ(@org.jetbrains.annotations.NotNull androidx.compose.material3.TimePickerState r42, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r43, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r44, int r45, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m70896TimePickermT9BvqQ(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VerticalTimePicker(@org.jetbrains.annotations.NotNull androidx.compose.material3.TimePickerState r41, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r42, @org.jetbrains.annotations.Nullable androidx.compose.material3.TimePickerColors r43, boolean r44, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.VerticalTimePicker(androidx.compose.material3.TimePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.TimePickerColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m60394a(Modifier modifier, final float f, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1548175696);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (startRestartGroup.changed(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i3 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i7 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1548175696, i3, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1497)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.TimePickerKt$CircularLayout$1
                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return AbstractC23448zr0.m68a(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return AbstractC23448zr0.m67b(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo69380measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Object obj;
                    Object obj2;
                    Placeable placeable;
                    Placeable placeable2;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    float mo69622toPx0680j_4 = Layout.mo69622toPx0680j_4(f);
                    long m73802copyZbe2FdA$default = Constraints.m73802copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
                    List list = measurables;
                    ArrayList<Measurable> arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        Measurable measurable = (Measurable) obj3;
                        if (LayoutIdKt.getLayoutId(measurable) != LayoutId.Selector && LayoutIdKt.getLayoutId(measurable) != LayoutId.InnerCircle) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC10172es.collectionSizeOrDefault(arrayList, 10));
                    for (Measurable measurable2 : arrayList) {
                        arrayList2.add(measurable2.mo72995measureBRTryo0(m73802copyZbe2FdA$default));
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (LayoutIdKt.getLayoutId((Measurable) obj) == LayoutId.Selector) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    Measurable measurable3 = (Measurable) obj;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (LayoutIdKt.getLayoutId((Measurable) obj2) == LayoutId.InnerCircle) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    Measurable measurable4 = (Measurable) obj2;
                    float size = 6.2831855f / arrayList2.size();
                    if (measurable3 != null) {
                        placeable = measurable3.mo72995measureBRTryo0(m73802copyZbe2FdA$default);
                    } else {
                        placeable = null;
                    }
                    if (measurable4 != null) {
                        placeable2 = measurable4.mo72995measureBRTryo0(m73802copyZbe2FdA$default);
                    } else {
                        placeable2 = null;
                    }
                    return MeasureScope.CC.m59482q(Layout, Constraints.m73812getMinWidthimpl(j), Constraints.m73811getMinHeightimpl(j), null, new TimePickerKt$CircularLayout$1$measure$1(placeable, arrayList2, placeable2, j, mo69622toPx0680j_4, size), 4, null);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return AbstractC23448zr0.m66c(this, intrinsicMeasureScope, list, i8);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i8) {
                    return AbstractC23448zr0.m65d(this, intrinsicMeasureScope, list, i8);
                }
            };
            int i8 = ((i3 >> 6) & 14) | ((i3 << 3) & 112);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
            int i9 = ((i8 << 9) & 7168) | 6;
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(startRestartGroup, Integer.valueOf((i9 >> 9) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$CircularLayout$2(modifier2, f, function2, i, i2));
        }
    }

    /* renamed from: b */
    public static final void m60393b(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-934561141);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-934561141, i2, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:839)");
            }
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), TimePickerTokens.INSTANCE.getTimeSelectorLabelTextFont()))}, ComposableLambdaKt.composableLambda(startRestartGroup, -477913269, true, new TimePickerKt$ClockDisplayNumbers$1(timePickerState, timePickerColors, i2)), startRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ClockDisplayNumbers$2(timePickerState, timePickerColors, i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0145, code lost:
        if (r13 == r14.getEmpty()) goto L63;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m60392c(androidx.compose.material3.TimePickerState r38, int r39, boolean r40, androidx.compose.runtime.Composer r41, int r42) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m60392c(androidx.compose.material3.TimePickerState, int, boolean, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: d */
    public static final long m60391d(MutableState mutableState) {
        return ((Offset) mutableState.getValue()).m71696unboximpl();
    }

    /* renamed from: e */
    public static final void m60390e(MutableState mutableState, long j) {
        mutableState.setValue(Offset.m71675boximpl(j));
    }

    /* renamed from: f */
    public static final void m60389f(Modifier modifier, Composer composer, int i) {
        int i2;
        TextStyle m73414copyCXVQc50;
        Composer composer2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(2100674302);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2100674302, i, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1046)");
            }
            m73414copyCXVQc50 = r16.m73414copyCXVQc50((r46 & 1) != 0 ? r16.f31200a.m73360getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r16.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r16.f31200a.getFontWeight() : null, (r46 & 8) != 0 ? r16.f31200a.m73362getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r16.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r16.f31200a.getFontFamily() : null, (r46 & 64) != 0 ? r16.f31200a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r16.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r16.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r16.f31200a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r16.f31200a.getLocaleList() : null, (r46 & 2048) != 0 ? r16.f31200a.m73358getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r16.f31200a.getTextDecoration() : null, (r46 & 8192) != 0 ? r16.f31200a.getShadow() : null, (r46 & 16384) != 0 ? r16.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), (r46 & 32768) != 0 ? r16.f31201b.m73318getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r16.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r16.f31201b.getTextIndent() : null, (r46 & 262144) != 0 ? r16.f31202c : null, (r46 & 524288) != 0 ? r16.f31201b.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.Companion.m73710getCenterPIaL0Z0(), LineHeightStyle.Trim.Companion.m73721getBothEVpEnUU(), null), (r46 & 1048576) != 0 ? r16.f31201b.m73313getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? ((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).f31201b.m73311getHyphensEaSxIns() : null);
            TextStyle copyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(m73414copyCXVQc50, false);
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, TimePickerKt$DisplaySeparator$1.INSTANCE);
            Alignment center = Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(clearAndSetSemantics);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m70882Text4IGK_g(":", (Modifier) null, ColorSchemeKt.toColor(TimeInputTokens.INSTANCE.getTimeFieldSeparatorColor(), startRestartGroup, 6), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, copyAndSetFontPadding, composer2, 6, 0, 65530);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$DisplaySeparator$3(modifier, i));
        }
    }

    /* renamed from: g */
    public static final void m60388g(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(755539561);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755539561, i2, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:801)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, companion2.getStart(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion3.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            m60393b(timePickerState, timePickerColors, startRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            startRestartGroup.startReplaceableGroup(-552398963);
            if (!timePickerState.is24hour()) {
                Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(companion, 0.0f, f26482m, 0.0f, 0.0f, 13, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m69717paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71577constructorimpl2 = Updater.m71577constructorimpl(startRestartGroup);
                Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl2, density2, companion3.getSetDensity());
                Updater.m71584setimpl(m71577constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m71584setimpl(m71577constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i5 = i2 << 3;
                m60387h(SizeKt.m69750sizeVpY3zN4(companion, timePickerTokens.m71490getPeriodSelectorHorizontalContainerWidthD9Ej5fM(), timePickerTokens.m71489getPeriodSelectorHorizontalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i5 & 896) | (i5 & 112) | 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$HorizontalClockDisplay$2(timePickerState, timePickerColors, i));
        }
    }

    /* renamed from: h */
    public static final void m60387h(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(1261215927);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261215927, i2, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:878)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1.f26484a;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            m60386i(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.start(cornerBasedShape), ShapesKt.end(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$HorizontalPeriodToggle$1(modifier, timePickerState, timePickerColors, i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* renamed from: i */
    public static final void m60386i(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, MeasurePolicy measurePolicy, Shape shape, Shape shape2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(1374241901);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(measurePolicy)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(shape)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(shape2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((374491 & i2) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1374241901, i2, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:964)");
            }
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            BorderStroke m69525BorderStrokecXLIe8U = BorderStrokeKt.m69525BorderStrokecXLIe8U(timePickerTokens.m71491getPeriodSelectorOutlineWidthD9Ej5fM(), timePickerColors.m70888getPeriodSelectorBorderColor0d7_KjU$material3_release());
            Shape shape3 = ShapesKt.toShape(timePickerTokens.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape3, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape3;
            String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70800getTimePickerPeriodToggleadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(m70803getStringNWtq28);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$PeriodToggleImpl$1$1(m70803getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier border = BorderKt.border(SelectableGroupKt.selectableGroup(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null)).then(modifier), m69525BorderStrokecXLIe8U, cornerBasedShape);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(border);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            boolean z = !timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(timePickerState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$PeriodToggleImpl$2$1$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            ComposableSingletons$TimePickerKt composableSingletons$TimePickerKt = ComposableSingletons$TimePickerKt.INSTANCE;
            int i9 = (i2 << 3) & 7168;
            m60377r(z, shape, (Function0) rememberedValue2, timePickerColors, composableSingletons$TimePickerKt.m70515getLambda1$material3_release(), startRestartGroup, ((i2 >> 9) & 112) | 24576 | i9);
            SpacerKt.Spacer(BackgroundKt.m69505backgroundbw27NRU$default(SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(LayoutIdKt.layoutId(Modifier.Companion, "Spacer"), 2.0f), 0.0f, 1, null), ColorSchemeKt.toColor(timePickerTokens.getPeriodSelectorOutlineColor(), startRestartGroup, 6), null, 2, null), startRestartGroup, 0);
            boolean isAfternoonToggle$material3_release = timePickerState.isAfternoonToggle$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed3 = startRestartGroup.changed(timePickerState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$PeriodToggleImpl$2$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            m60377r(isAfternoonToggle$material3_release, shape2, rememberedValue3, timePickerColors, composableSingletons$TimePickerKt.m70516getLambda2$material3_release(), startRestartGroup, ((i2 >> 12) & 112) | 24576 | i9);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$PeriodToggleImpl$3(modifier, timePickerState, timePickerColors, measurePolicy, shape, shape2, i));
        }
    }

    /* renamed from: j */
    public static final void m60385j(Modifier modifier, TimePickerColors timePickerColors, TimePickerState timePickerState, Composer composer, int i) {
        int i2;
        Composer composer2;
        TextStyle m73414copyCXVQc50;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-475657989);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i6 = i2;
        if ((i6 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475657989, i6, -1, "androidx.compose.material3.TimeInputImpl (TimePicker.kt:693)");
            }
            Object[] objArr = new Object[0];
            TextFieldValue.Companion companion = TextFieldValue.Companion;
            Saver<TextFieldValue, Object> saver = companion.getSaver();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(timePickerState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$TimeInputImpl$hourValue$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, startRestartGroup, 72, 4);
            Object[] objArr2 = new Object[0];
            Saver<TextFieldValue, Object> saver2 = companion.getSaver();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(timePickerState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeInputImpl$minuteValue$2$1(timePickerState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState rememberSaveable2 = RememberSaveableKt.rememberSaveable(objArr2, (Saver) saver2, (String) null, (Function0) rememberedValue2, startRestartGroup, 72, 4);
            composer2 = startRestartGroup;
            Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f26476g, 7, null);
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical top = companion2.getTop();
            composer2.startReplaceableGroup(693286680);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), top, composer2, 48);
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m69717paddingqDBjuR0$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(composer2);
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion3.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Typography typography = MaterialTheme.INSTANCE.getTypography(composer2, 6);
            TimeInputTokens timeInputTokens = TimeInputTokens.INSTANCE;
            m73414copyCXVQc50 = r21.m73414copyCXVQc50((r46 & 1) != 0 ? r21.f31200a.m73360getColor0d7_KjU() : timePickerColors.m70893timeSelectorContentColorvNxB06k$material3_release(true), (r46 & 2) != 0 ? r21.f31200a.m73361getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r21.f31200a.getFontWeight() : null, (r46 & 8) != 0 ? r21.f31200a.m73362getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r21.f31200a.m73363getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r21.f31200a.getFontFamily() : null, (r46 & 64) != 0 ? r21.f31200a.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r21.f31200a.m73364getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r21.f31200a.m73359getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r21.f31200a.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r21.f31200a.getLocaleList() : null, (r46 & 2048) != 0 ? r21.f31200a.m73358getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r21.f31200a.getTextDecoration() : null, (r46 & 8192) != 0 ? r21.f31200a.getShadow() : null, (r46 & 16384) != 0 ? r21.f31201b.m73316getTextAlignbuA522U() : TextAlign.m73725boximpl(TextAlign.Companion.m73732getCentere0LSkKk()), (r46 & 32768) != 0 ? r21.f31201b.m73318getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r21.f31201b.m73315getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r21.f31201b.getTextIndent() : null, (r46 & 262144) != 0 ? r21.f31202c : null, (r46 & 524288) != 0 ? r21.f31201b.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r21.f31201b.m73313getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TypographyKt.fromToken(typography, timeInputTokens.getTimeFieldLabelTextFont()).f31201b.m73311getHyphensEaSxIns() : null);
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{TextKt.getLocalTextStyle().provides(m73414copyCXVQc50)}, ComposableLambdaKt.composableLambda(composer2, 1306700887, true, new TimePickerKt$TimeInputImpl$1$1(rememberSaveable, timePickerState, i6, timePickerColors, rememberSaveable2)), composer2, 56);
            composer2.startReplaceableGroup(565119480);
            if (!timePickerState.is24hour()) {
                Modifier m69717paddingqDBjuR0$default2 = PaddingKt.m69717paddingqDBjuR0$default(modifier, f26482m, 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                composer2.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m69717paddingqDBjuR0$default2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer m71577constructorimpl2 = Updater.m71577constructorimpl(composer2);
                Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl2, density2, companion3.getSetDensity());
                Updater.m71584setimpl(m71577constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m71584setimpl(m71577constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                composer2.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(composer2)), composer2, 0);
                composer2.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                m60375t(SizeKt.m69750sizeVpY3zN4(Modifier.Companion, timeInputTokens.m71479getPeriodSelectorContainerWidthD9Ej5fM(), timeInputTokens.m71478getPeriodSelectorContainerHeightD9Ej5fM()), timePickerState, timePickerColors, composer2, ((i6 >> 3) & 112) | 6 | ((i6 << 3) & 896));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$TimeInputImpl$2(modifier, timePickerColors, timePickerState, i));
        }
    }

    /* renamed from: k */
    public static final TextFieldValue m60384k(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* renamed from: l */
    public static final void m60383l(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    /* renamed from: m */
    public static final TextFieldValue m60382m(MutableState mutableState) {
        return (TextFieldValue) mutableState.getValue();
    }

    /* renamed from: n */
    public static final void m60381n(MutableState mutableState, TextFieldValue textFieldValue) {
        mutableState.setValue(textFieldValue);
    }

    @Composable
    @ReadOnlyComposable
    @NotNull
    /* renamed from: numberContentDescription-YKJpE6Y  reason: not valid java name */
    public static final String m70901numberContentDescriptionYKJpE6Y(int i, boolean z, int i2, @Nullable Composer composer, int i3) {
        int m70793getTimePickerHourSuffixadMyvUU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1826155772, i3, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:1542)");
        }
        if (Selection.m70718equalsimpl0(i, Selection.Companion.m70723getMinuteJiIwxys())) {
            m70793getTimePickerHourSuffixadMyvUU = Strings.Companion.m70797getTimePickerMinuteSuffixadMyvUU();
        } else if (z) {
            m70793getTimePickerHourSuffixadMyvUU = Strings.Companion.m70789getTimePicker24HourSuffixadMyvUU();
        } else {
            m70793getTimePickerHourSuffixadMyvUU = Strings.Companion.m70793getTimePickerHourSuffixadMyvUU();
        }
        String m70804getStringiSCLEhQ = Strings_androidKt.m70804getStringiSCLEhQ(m70793getTimePickerHourSuffixadMyvUU, new Object[]{Integer.valueOf(i2)}, composer, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m70804getStringiSCLEhQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m60380o(androidx.compose.p003ui.Modifier r122, androidx.compose.p003ui.text.input.TextFieldValue r123, kotlin.jvm.functions.Function1 r124, androidx.compose.material3.TimePickerState r125, int r126, androidx.compose.foundation.text.KeyboardOptions r127, androidx.compose.foundation.text.KeyboardActions r128, androidx.compose.material3.TimePickerColors r129, androidx.compose.runtime.Composer r130, int r131, int r132) {
        /*
            Method dump skipped, instructions count: 1514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TimePickerKt.m60380o(androidx.compose.ui.Modifier, androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.material3.TimePickerState, int, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, androidx.compose.material3.TimePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: p */
    public static final boolean m60379p(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    /* renamed from: q */
    public static final void m60378q(Modifier modifier, int i, TimePickerState timePickerState, int i2, TimePickerColors timePickerColors, Composer composer, int i3) {
        int i4;
        int m70796getTimePickerMinuteSelectionadMyvUU;
        Composer composer2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Composer startRestartGroup = composer.startRestartGroup(21099367);
        if ((i3 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            if (startRestartGroup.changed(i)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i3 & 896) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i3 & 7168) == 0) {
            if (startRestartGroup.changed(i2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i4 |= i6;
        }
        if ((57344 & i3) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i4 |= i5;
        }
        int i10 = i4;
        if ((46811 & i10) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21099367, i10, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1070)");
            }
            boolean m70718equalsimpl0 = Selection.m70718equalsimpl0(timePickerState.m70918getSelectionJiIwxys$material3_release(), i2);
            if (Selection.m70718equalsimpl0(i2, Selection.Companion.m70722getHourJiIwxys())) {
                m70796getTimePickerMinuteSelectionadMyvUU = Strings.Companion.m70792getTimePickerHourSelectionadMyvUU();
            } else {
                m70796getTimePickerMinuteSelectionadMyvUU = Strings.Companion.m70796getTimePickerMinuteSelectionadMyvUU();
            }
            String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(m70796getTimePickerMinuteSelectionadMyvUU, startRestartGroup, 0);
            long m70892timeSelectorContainerColorvNxB06k$material3_release = timePickerColors.m70892timeSelectorContainerColorvNxB06k$material3_release(m70718equalsimpl0);
            long m70893timeSelectorContentColorvNxB06k$material3_release = timePickerColors.m70893timeSelectorContentColorvNxB06k$material3_release(m70718equalsimpl0);
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(m70803getStringNWtq28);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeSelector$1$1(m70803getStringNWtq28);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            SurfaceKt.m70813Surfaced85dljk(m70718equalsimpl0, (Function0<Unit>) new TimePickerKt$TimeSelector$2(i2, timePickerState, coroutineScope), SemanticsModifierKt.semantics(modifier, true, (Function1) rememberedValue2), false, ShapesKt.toShape(TimePickerTokens.INSTANCE.getTimeSelectorContainerShape(), startRestartGroup, 6), m70892timeSelectorContainerColorvNxB06k$material3_release, 0L, 0.0f, 0.0f, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, -1338709103, true, new TimePickerKt$TimeSelector$3(i2, timePickerState, i, i10, m70893timeSelectorContentColorvNxB06k$material3_release)), composer2, 0, 48, 1992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$TimeSelector$4(modifier, i, timePickerState, i2, timePickerColors, i3));
        }
    }

    /* renamed from: r */
    public static final void m60377r(boolean z, Shape shape, Function0 function0, TimePickerColors timePickerColors, Function3 function3, Composer composer, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1937408098);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(shape)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changedInstance(function3)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((46811 & i2) == 9362 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1937408098, i2, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1019)");
            }
            long m70891periodSelectorContentColorvNxB06k$material3_release = timePickerColors.m70891periodSelectorContentColorvNxB06k$material3_release(z);
            long m70890periodSelectorContainerColorvNxB06k$material3_release = timePickerColors.m70890periodSelectorContainerColorvNxB06k$material3_release(z);
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(ZIndexModifierKt.zIndex(companion, f), 0.0f, 1, null);
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$ToggleItem$1$1(z);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            ButtonKt.TextButton(function0, SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (Function1) rememberedValue, 1, null), false, shape, ButtonDefaults.INSTANCE.m70405textButtonColorsro_MJ88(m70890periodSelectorContainerColorvNxB06k$material3_release, m70891periodSelectorContentColorvNxB06k$material3_release, 0L, 0L, startRestartGroup, 24576, 12), null, null, PaddingKt.m69706PaddingValues0680j_4(C3623Dp.m73842constructorimpl(0)), null, function3, startRestartGroup, ((i2 >> 6) & 14) | 12582912 | ((i2 << 6) & 7168) | ((i2 << 15) & 1879048192), 356);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$ToggleItem$2(z, shape, function0, timePickerColors, function3, i));
        }
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final TimePickerState rememberTimePickerState(int i, int i2, boolean z, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1237715277);
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = TimeFormat_androidKt.is24HourFormat(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237715277, i3, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:438)");
        }
        Object[] objArr = new Object[0];
        Saver<TimePickerState, ?> Saver = TimePickerState.Companion.Saver();
        Integer valueOf = Integer.valueOf(i);
        Integer valueOf2 = Integer.valueOf(i2);
        Boolean valueOf3 = Boolean.valueOf(z);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(valueOf3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TimePickerKt$rememberTimePickerState$1$1(i, i2, z);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TimePickerState timePickerState = (TimePickerState) RememberSaveableKt.m71590rememberSaveable(objArr, Saver, (String) null, (Function0<? extends Object>) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return timePickerState;
    }

    /* renamed from: s */
    public static final void m60376s(TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(2054675515);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054675515, i2, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:820)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            startRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, companion2.getTop(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71577constructorimpl = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion3.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m60393b(timePickerState, timePickerColors, startRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            startRestartGroup.startReplaceableGroup(952907597);
            if (!timePickerState.is24hour()) {
                Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(companion, f26482m, 0.0f, 0.0f, 0.0f, 14, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m69717paddingqDBjuR0$default);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71577constructorimpl2 = Updater.m71577constructorimpl(startRestartGroup);
                Updater.m71584setimpl(m71577constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl2, density2, companion3.getSetDensity());
                Updater.m71584setimpl(m71577constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.m71584setimpl(m71577constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
                int i5 = i2 << 3;
                m60375t(SizeKt.m69750sizeVpY3zN4(companion, timePickerTokens.m71493getPeriodSelectorVerticalContainerWidthD9Ej5fM(), timePickerTokens.m71492getPeriodSelectorVerticalContainerHeightD9Ej5fM()), timePickerState, timePickerColors, startRestartGroup, (i5 & 896) | (i5 & 112) | 6);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$VerticalClockDisplay$2(timePickerState, timePickerColors, i));
        }
    }

    /* renamed from: t */
    public static final void m60375t(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1898918107);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(timePickerState)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(timePickerColors)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1898918107, i2, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:921)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TimePickerKt$VerticalPeriodToggle$measurePolicy$1$1.f26485a;
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Shape shape = ShapesKt.toShape(TimePickerTokens.INSTANCE.getPeriodSelectorContainerShape(), startRestartGroup, 6);
            Intrinsics.checkNotNull(shape, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            CornerBasedShape cornerBasedShape = (CornerBasedShape) shape;
            m60386i(modifier, timePickerState, timePickerColors, (MeasurePolicy) rememberedValue, ShapesKt.top(cornerBasedShape), ShapesKt.bottom(cornerBasedShape), startRestartGroup, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TimePickerKt$VerticalPeriodToggle$1(modifier, timePickerState, timePickerColors, i));
        }
    }

    /* renamed from: u */
    public static final float m60374u(float f, float f2) {
        float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
        if (atan2 < 0.0f) {
            return atan2 + 6.2831855f;
        }
        return atan2;
    }

    /* renamed from: v */
    public static final Modifier m60373v(Modifier modifier, TimePickerState timePickerState, boolean z) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TimePickerKt$clockDial$$inlined$debugInspectorInfo$1(timePickerState);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TimePickerKt$clockDial$2(timePickerState, z));
    }

    /* renamed from: w */
    public static final float m60372w(float f, float f2, int i, int i2) {
        return (float) Math.hypot(i - f, i2 - f2);
    }

    /* renamed from: x */
    public static final Modifier m60371x(Modifier modifier, TimePickerState timePickerState, TimePickerColors timePickerColors) {
        return DrawModifierKt.drawWithContent(modifier, new TimePickerKt$drawSelector$1(timePickerState, timePickerColors));
    }

    /* renamed from: y */
    public static final void m60370y(int i, TimePickerState timePickerState, TextFieldValue textFieldValue, TextFieldValue textFieldValue2, int i2, Function1 function1) {
        int parseInt;
        if (Intrinsics.areEqual(textFieldValue.getText(), textFieldValue2.getText())) {
            function1.invoke(textFieldValue);
        } else if (textFieldValue.getText().length() == 0) {
            if (Selection.m70718equalsimpl0(i, Selection.Companion.m70722getHourJiIwxys())) {
                timePickerState.setHour$material3_release(0);
            } else {
                timePickerState.setMinute$material3_release(0);
            }
            function1.invoke(TextFieldValue.m73605copy3r_uNRQ$default(textFieldValue, "", 0L, (TextRange) null, 6, (Object) null));
        } else {
            try {
                if (textFieldValue.getText().length() == 3 && TextRange.m73400getStartimpl(textFieldValue.m73609getSelectiond9O1mEE()) == 1) {
                    parseInt = AbstractC5380bp.digitToInt(textFieldValue.getText().charAt(0));
                } else {
                    parseInt = Integer.parseInt(textFieldValue.getText());
                }
                if (parseInt <= i2) {
                    Selection.Companion companion = Selection.Companion;
                    if (Selection.m70718equalsimpl0(i, companion.m70722getHourJiIwxys())) {
                        timePickerState.setHour$material3_release(parseInt);
                        if (parseInt > 1 && !timePickerState.is24hour()) {
                            timePickerState.m70921setSelectioniHAOin8$material3_release(companion.m70723getMinuteJiIwxys());
                        }
                    } else {
                        timePickerState.setMinute$material3_release(parseInt);
                    }
                    if (textFieldValue.getText().length() > 2) {
                        textFieldValue = TextFieldValue.m73605copy3r_uNRQ$default(textFieldValue, String.valueOf(textFieldValue.getText().charAt(0)), 0L, (TextRange) null, 6, (Object) null);
                    }
                    function1.invoke(textFieldValue);
                }
            } catch (NumberFormatException | IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: z */
    public static final String m60369z(int i, int i2) {
        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
        integerInstance.setGroupingUsed(false);
        integerInstance.setMinimumIntegerDigits(i2);
        String format = integerInstance.format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(format, "formatter.format(this)");
        return format;
    }
}