package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m28851d1 = {"\u0000¤\u0001\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aµ\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0019\b\u0002\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0019\u001a\u0081\u0001\u0010\u001a\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001aæ\u0001\u0010\u001a\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0019\b\u0002\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001a\u0010 \u001a\u009b\u0001\u0010!\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0017\u0010\u0017\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b!\u0010\"\u001aÊ\u0001\u0010#\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00162\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0016H\u0003¢\u0006\u0004\b#\u0010$\u001a/\u0010*\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+\u001a;\u00103\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0000\u0018\u000101*\u00020,2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0082@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b3\u00104\u001a\u0017\u00105\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u00106\u001a7\u0010<\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0002¢\u0006\u0004\b<\u0010=\u001aC\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u00020\u00002\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0002¢\u0006\u0004\b?\u0010@\u001a'\u0010C\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0000H\u0002¢\u0006\u0004\bC\u0010D\u001ac\u0010E\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bE\u0010F\u001ak\u0010O\u001a\u00020\u0005*\u00020\u00052\u0006\u0010H\u001a\u00020G2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u00072\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00000J2\u0012\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0J2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00000M2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bO\u0010P\u001a3\u0010S\u001a\u00020\u00032\u0006\u0010H\u001a\u00020G2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u00002\u0006\u0010R\u001a\u00020\u0000H\u0082@ø\u0001\u0001¢\u0006\u0004\bS\u0010T\u001a\u009f\u0001\u0010Y\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00000J2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00000J2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010I\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00020J2\u001e\u0010X\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030W0JH\u0002¢\u0006\u0004\bY\u0010Z\"\u001d\u0010_\u001a\u00020[8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010\\\u001a\u0004\b]\u0010^\"\u0017\u0010`\u001a\u00020[8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bA\u0010\\\"\u0017\u0010d\u001a\u00020a8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bb\u0010c\"\u0017\u0010f\u001a\u00020[8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\be\u0010\\\"\u0017\u0010h\u001a\u00020[8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bg\u0010\\\"\u0017\u0010j\u001a\u00020[8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bi\u0010\\\"\u001d\u0010m\u001a\u00020[8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010^\"\u0017\u0010o\u001a\u00020[8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bn\u0010\\\"\u0017\u0010q\u001a\u00020[8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bp\u0010\\\"\u0014\u0010s\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010r\"\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00000t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006x"}, m28850d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/material3/SliderColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/SliderPositions;", "Landroidx/compose/runtime/Composable;", "thumb", "track", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V", "startInteractionSource", "endInteractionSource", "startThumb", "endThumb", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SliderColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;III)V", OperatorName.SET_LINE_JOINSTYLE, "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IFLkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/Modifier;Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "current", "", "tickFractions", "minPx", "maxPx", "u", "(F[FFF)F", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "Lkotlin/Pair;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", OperatorName.ENDPATH, "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "(I)[F", "a1", "b1", "x1", "a2", "b2", OperatorName.SAVE, "(FFFFF)F", "x", PDPageLabelRange.STYLE_ROMAN_LOWER, "(FFLkotlin/ranges/ClosedFloatingPointRange;FF)Lkotlin/ranges/ClosedFloatingPointRange;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "pos", "o", "(FFF)F", OperatorName.CLOSE_AND_STROKE, "(Landroidx/compose/ui/Modifier;FZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/gestures/DraggableState;", "draggableState", "isRtl", "Landroidx/compose/runtime/State;", "rawOffset", "gestureEndAction", "Landroidx/compose/runtime/MutableState;", "pressOffset", "t", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/DraggableState;Landroidx/compose/foundation/interaction/MutableInteractionSource;IZLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Z)Landroidx/compose/ui/Modifier;", TypedValues.AttributesType.S_TARGET, "velocity", OperatorName.MOVE_TO, "(Landroidx/compose/foundation/gestures/DraggableState;FFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rawOffsetStart", "rawOffsetEnd", "Lkotlin/Function2;", "onDrag", "p", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;ZZILkotlin/ranges/ClosedFloatingPointRange;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "F", "getThumbWidth", "()F", "ThumbWidth", "ThumbHeight", "Landroidx/compose/ui/unit/DpSize;", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "ThumbSize", "d", "ThumbDefaultElevation", "e", "ThumbPressedElevation", OperatorName.FILL_NON_ZERO, "TickSize", OperatorName.NON_STROKING_GRAY, "getTrackHeight", "TrackHeight", OperatorName.CLOSE_PATH, "SliderHeight", "i", "SliderMinWidth", "Landroidx/compose/ui/Modifier;", "DefaultSliderConstraints", "Landroidx/compose/animation/core/TweenSpec;", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/animation/core/TweenSpec;", "SliderToTickAnimation", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 9 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1508:1\n25#2:1509\n25#2:1517\n25#2:1524\n25#2:1531\n25#2:1538\n25#2:1545\n50#2:1552\n49#2:1553\n36#2:1560\n25#2:1567\n25#2:1574\n25#2:1582\n25#2:1589\n25#2:1596\n36#2:1603\n36#2:1610\n456#2,11:1630\n460#2,13:1660\n473#2,3:1674\n460#2,13:1698\n473#2,3:1712\n467#2,3:1717\n50#2:1721\n49#2:1722\n36#2:1729\n25#2:1736\n25#2:1743\n25#2:1750\n25#2:1758\n25#2:1765\n25#2:1772\n36#2:1779\n25#2:1786\n50#2:1793\n49#2:1794\n50#2:1801\n49#2:1802\n456#2,11:1822\n36#2:1833\n460#2,13:1859\n473#2,3:1873\n36#2:1878\n460#2,13:1904\n473#2,3:1918\n460#2,13:1942\n473#2,3:1956\n467#2,3:1961\n1114#3,6:1510\n1114#3,6:1518\n1114#3,6:1525\n1114#3,6:1532\n1114#3,6:1539\n1114#3,6:1546\n1114#3,6:1554\n1114#3,6:1561\n1114#3,6:1568\n1114#3,6:1575\n1114#3,6:1583\n1114#3,6:1590\n1114#3,6:1597\n1114#3,6:1604\n1114#3,6:1611\n1114#3,6:1723\n1114#3,6:1730\n1114#3,6:1737\n1114#3,6:1744\n1114#3,6:1751\n1114#3,6:1759\n1114#3,6:1766\n1114#3,6:1773\n1114#3,6:1780\n1114#3,6:1787\n1114#3,6:1795\n1114#3,6:1803\n1114#3,6:1834\n1114#3,6:1879\n1#4:1516\n76#5:1581\n76#5:1618\n76#5:1648\n76#5:1686\n76#5:1757\n76#5:1810\n76#5:1847\n76#5:1892\n76#5:1930\n74#6:1617\n75#6,11:1619\n75#6:1647\n76#6,11:1649\n89#6:1677\n75#6:1685\n76#6,11:1687\n89#6:1715\n88#6:1720\n74#6:1809\n75#6,11:1811\n75#6:1846\n76#6,11:1848\n89#6:1876\n75#6:1891\n76#6,11:1893\n89#6:1921\n75#6:1929\n76#6,11:1931\n89#6:1959\n88#6:1964\n67#7,6:1641\n73#7:1673\n77#7:1678\n67#7,6:1679\n73#7:1711\n77#7:1716\n67#7,6:1840\n73#7:1872\n77#7:1877\n67#7,6:1885\n73#7:1917\n77#7:1922\n67#7,6:1923\n73#7:1955\n77#7:1960\n16867#8,14:1965\n135#9:1979\n76#10:1980\n102#10,2:1981\n76#10:1983\n102#10,2:1984\n76#10:1986\n102#10,2:1987\n154#11:1989\n154#11:1990\n154#11:1991\n154#11:1992\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderKt\n*L\n157#1:1509\n252#1:1517\n331#1:1524\n332#1:1531\n437#1:1538\n438#1:1545\n494#1:1552\n494#1:1553\n500#1:1560\n504#1:1567\n505#1:1574\n514#1:1582\n515#1:1589\n519#1:1596\n525#1:1603\n559#1:1610\n564#1:1630,11\n566#1:1660,13\n566#1:1674,3\n567#1:1698,13\n567#1:1712,3\n564#1:1717,3\n642#1:1721\n642#1:1722\n648#1:1729\n652#1:1736\n653#1:1743\n654#1:1750\n666#1:1758\n667#1:1765\n668#1:1772\n670#1:1779\n719#1:1786\n734#1:1793\n734#1:1794\n742#1:1801\n742#1:1802\n751#1:1822,11\n755#1:1833\n753#1:1859,13\n753#1:1873,3\n763#1:1878\n761#1:1904,13\n761#1:1918,3\n769#1:1942,13\n769#1:1956,3\n751#1:1961,3\n157#1:1510,6\n252#1:1518,6\n331#1:1525,6\n332#1:1532,6\n437#1:1539,6\n438#1:1546,6\n494#1:1554,6\n500#1:1561,6\n504#1:1568,6\n505#1:1575,6\n514#1:1583,6\n515#1:1590,6\n519#1:1597,6\n525#1:1604,6\n559#1:1611,6\n642#1:1723,6\n648#1:1730,6\n652#1:1737,6\n653#1:1744,6\n654#1:1751,6\n666#1:1759,6\n667#1:1766,6\n668#1:1773,6\n670#1:1780,6\n719#1:1787,6\n734#1:1795,6\n742#1:1803,6\n755#1:1834,6\n763#1:1879,6\n513#1:1581\n564#1:1618\n566#1:1648\n567#1:1686\n656#1:1757\n751#1:1810\n753#1:1847\n761#1:1892\n769#1:1930\n564#1:1617\n564#1:1619,11\n566#1:1647\n566#1:1649,11\n566#1:1677\n567#1:1685\n567#1:1687,11\n567#1:1715\n564#1:1720\n751#1:1809\n751#1:1811,11\n753#1:1846\n753#1:1848,11\n753#1:1876\n761#1:1891\n761#1:1893,11\n761#1:1921\n769#1:1929\n769#1:1931,11\n769#1:1959\n751#1:1964\n566#1:1641,6\n566#1:1673\n566#1:1678\n567#1:1679,6\n567#1:1711\n567#1:1716\n753#1:1840,6\n753#1:1872\n753#1:1877\n761#1:1885,6\n761#1:1917\n761#1:1922\n769#1:1923,6\n769#1:1955\n769#1:1960\n1081#1:1965,14\n1201#1:1979\n652#1:1980\n652#1:1981,2\n653#1:1983\n653#1:1984,2\n654#1:1986\n654#1:1987,2\n1416#1:1989\n1417#1:1990\n1422#1:1991\n1423#1:1992\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderKt {

    /* renamed from: a */
    public static final float f26076a;

    /* renamed from: b */
    public static final float f26077b;

    /* renamed from: c */
    public static final long f26078c;

    /* renamed from: d */
    public static final float f26079d;

    /* renamed from: e */
    public static final float f26080e;

    /* renamed from: f */
    public static final float f26081f;

    /* renamed from: g */
    public static final float f26082g;

    /* renamed from: h */
    public static final float f26083h;

    /* renamed from: i */
    public static final float f26084i;

    /* renamed from: j */
    public static final Modifier f26085j;

    /* renamed from: k */
    public static final TweenSpec f26086k;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        float m71255getHandleWidthD9Ej5fM = sliderTokens.m71255getHandleWidthD9Ej5fM();
        f26076a = m71255getHandleWidthD9Ej5fM;
        float m71254getHandleHeightD9Ej5fM = sliderTokens.m71254getHandleHeightD9Ej5fM();
        f26077b = m71254getHandleHeightD9Ej5fM;
        f26078c = DpKt.m73680DpSizeYgX7TsA(m71255getHandleWidthD9Ej5fM, m71254getHandleHeightD9Ej5fM);
        f26079d = C3641Dp.m73658constructorimpl(1);
        f26080e = C3641Dp.m73658constructorimpl(6);
        f26081f = sliderTokens.m71261getTickMarksContainerSizeD9Ej5fM();
        f26082g = sliderTokens.m71256getInactiveTrackHeightD9Ej5fM();
        float m73658constructorimpl = C3641Dp.m73658constructorimpl(48);
        f26083h = m73658constructorimpl;
        float m73658constructorimpl2 = C3641Dp.m73658constructorimpl((float) SyslogConstants.LOG_LOCAL2);
        f26084i = m73658constructorimpl2;
        f26085j = SizeKt.m69552heightInVpY3zN4$default(SizeKt.m69571widthInVpY3zN4$default(Modifier.Companion, m73658constructorimpl2, 0.0f, 2, null), 0.0f, m73658constructorimpl, 1, null);
        f26086k = new TweenSpec(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0285  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r42, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r44, boolean r45, @org.jetbrains.annotations.Nullable kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r46, int r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r48, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r49, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0294  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(float r42, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r43, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r44, boolean r45, @org.jetbrains.annotations.Nullable kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r46, int r47, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r48, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r49, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r50, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:303:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:491:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m60559a(androidx.compose.p003ui.Modifier r41, final kotlin.ranges.ClosedFloatingPointRange r42, kotlin.jvm.functions.Function1 r43, boolean r44, final kotlin.ranges.ClosedFloatingPointRange r45, int r46, kotlin.jvm.functions.Function0 r47, androidx.compose.foundation.interaction.MutableInteractionSource r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, kotlin.jvm.functions.Function3 r50, kotlin.jvm.functions.Function3 r51, kotlin.jvm.functions.Function3 r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 2144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m60559a(androidx.compose.ui.Modifier, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, boolean, kotlin.ranges.ClosedFloatingPointRange, int, kotlin.jvm.functions.Function0, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final /* synthetic */ float access$RangeSliderImpl$lambda$25(MutableState mutableState) {
        return m60558b(mutableState);
    }

    public static final /* synthetic */ void access$RangeSliderImpl$lambda$26(MutableState mutableState, float f) {
        m60557c(mutableState, f);
    }

    public static final /* synthetic */ float access$RangeSliderImpl$lambda$28(MutableState mutableState) {
        return m60556d(mutableState);
    }

    public static final /* synthetic */ void access$RangeSliderImpl$lambda$29(MutableState mutableState, float f) {
        m60555e(mutableState, f);
    }

    public static final /* synthetic */ int access$RangeSliderImpl$lambda$31(MutableState mutableState) {
        return m60554f(mutableState);
    }

    public static final /* synthetic */ void access$RangeSliderImpl$lambda$32(MutableState mutableState, int i) {
        m60553g(mutableState, i);
    }

    public static final /* synthetic */ float access$RangeSliderImpl$scaleToOffset$34(ClosedFloatingPointRange closedFloatingPointRange, float f, float f2, float f3) {
        return m60552h(closedFloatingPointRange, f, f2, f3);
    }

    public static final /* synthetic */ float access$getTickSize$p() {
        return f26081f;
    }

    /* renamed from: b */
    public static final float m60558b(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    /* renamed from: c */
    public static final void m60557c(MutableState mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* renamed from: d */
    public static final float m60556d(MutableState mutableState) {
        return ((Number) mutableState.getValue()).floatValue();
    }

    /* renamed from: e */
    public static final void m60555e(MutableState mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* renamed from: f */
    public static final int m60554f(MutableState mutableState) {
        return ((Number) mutableState.getValue()).intValue();
    }

    /* renamed from: g */
    public static final void m60553g(MutableState mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final float getThumbWidth() {
        return f26076a;
    }

    public static final float getTrackHeight() {
        return f26082g;
    }

    /* renamed from: h */
    public static final float m60552h(ClosedFloatingPointRange closedFloatingPointRange, float f, float f2, float f3) {
        return m60543q(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f3, f, f2);
    }

    /* renamed from: i */
    public static final ClosedFloatingPointRange m60551i(ClosedFloatingPointRange closedFloatingPointRange, float f, float f2, ClosedFloatingPointRange closedFloatingPointRange2) {
        return m60542r(f, f2, closedFloatingPointRange2, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
    }

    /* renamed from: j */
    public static final void m60550j(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Function1 function1, Function0 function0, int i, float f, ClosedFloatingPointRange closedFloatingPointRange, Function3 function3, Function3 function32, Composer composer, int i2) {
        int i3;
        MutableState mutableState;
        int i4;
        boolean z2;
        SnapshotMutationPolicy snapshotMutationPolicy;
        float f2;
        int i5;
        final float f3;
        SliderPositions sliderPositions;
        Composer composer2;
        MutableState m31891g;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(851260148);
        if ((i2 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (startRestartGroup.changed(z)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        if ((i2 & 896) == 0) {
            if (startRestartGroup.changed(mutableInteractionSource)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i3 |= i13;
        }
        if ((i2 & 7168) == 0) {
            if (startRestartGroup.changedInstance(function1)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((57344 & i2) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((458752 & i2) == 0) {
            if (startRestartGroup.changed(i)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((3670016 & i2) == 0) {
            if (startRestartGroup.changed(f)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((29360128 & i2) == 0) {
            if (startRestartGroup.changed(closedFloatingPointRange)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((234881024 & i2) == 0) {
            if (startRestartGroup.changedInstance(function3)) {
                i7 = 67108864;
            } else {
                i7 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
            }
            i3 |= i7;
        }
        if ((1879048192 & i2) == 0) {
            if (startRestartGroup.changedInstance(function32)) {
                i6 = PKIFailureInfo.duplicateCertReq;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        }
        int i16 = i3;
        if ((1533916891 & i16) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851260148, i16, -1, "androidx.compose.material3.SliderImpl (Slider.kt:481)");
            }
            Float valueOf = Float.valueOf(f);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(function1);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SliderKt$SliderImpl$onValueChangeState$1$1(f, function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(rememberedValue, startRestartGroup, 0);
            Integer valueOf2 = Integer.valueOf(i);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(valueOf2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = m60538v(i);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            float[] fArr = (float[]) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue3 == companion.getEmpty()) {
                m31891g = AbstractC19508dK1.m31891g(Float.valueOf(getThumbWidth()), null, 2, null);
                startRestartGroup.updateRememberedValue(m31891g);
                rememberedValue3 = m31891g;
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                mutableState = mutableState2;
                rememberedValue4 = AbstractC19508dK1.m31891g(0, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                mutableState = mutableState2;
            }
            startRestartGroup.endReplaceableGroup();
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            if (startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl) {
                i4 = -492369756;
                z2 = true;
            } else {
                i4 = -492369756;
                z2 = false;
            }
            startRestartGroup.startReplaceableGroup(i4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                snapshotMutationPolicy = null;
                rememberedValue5 = AbstractC19508dK1.m31891g(Float.valueOf(m60549k(closedFloatingPointRange, 0.0f, 0.0f, f)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                snapshotMutationPolicy = null;
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState4 = (MutableState) rememberedValue5;
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = AbstractC19508dK1.m31891g(Float.valueOf(0.0f), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState5 = (MutableState) rememberedValue6;
            float m60545o = m60545o(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), AbstractC11719c.coerceIn(f, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()));
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                f2 = 0.0f;
                rememberedValue7 = new SliderPositions(AbstractC18012Lr1.rangeTo(0.0f, m60545o), fArr);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            } else {
                f2 = 0.0f;
            }
            startRestartGroup.endReplaceableGroup();
            SliderPositions sliderPositions2 = (SliderPositions) rememberedValue7;
            sliderPositions2.setActiveRange$material3_release(AbstractC18012Lr1.rangeTo(f2, m60545o));
            sliderPositions2.setTickFractions$material3_release(fArr);
            int i17 = i16 >> 21;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed3 = startRestartGroup.changed(closedFloatingPointRange);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changed3 && rememberedValue8 != companion.getEmpty()) {
                i5 = i16;
                f3 = m60545o;
                sliderPositions = sliderPositions2;
                composer2 = startRestartGroup;
            } else {
                i5 = i16;
                f3 = m60545o;
                sliderPositions = sliderPositions2;
                composer2 = startRestartGroup;
                SliderDraggableState sliderDraggableState = new SliderDraggableState(new SliderKt$SliderImpl$draggableState$1$1(mutableState3, mutableState, mutableState4, mutableState5, fArr, rememberUpdatedState, closedFloatingPointRange));
                composer2.updateRememberedValue(sliderDraggableState);
                rememberedValue8 = sliderDraggableState;
            }
            composer2.endReplaceableGroup();
            SliderDraggableState sliderDraggableState2 = (SliderDraggableState) rememberedValue8;
            State rememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(new SliderKt$SliderImpl$gestureEndAction$1(sliderDraggableState2, function0), composer2, 0);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m60540t = m60540t(companion2, sliderDraggableState2, mutableInteractionSource, ((Number) mutableState3.getValue()).intValue(), z2, mutableState4, rememberUpdatedState2, mutableState5, z);
            Orientation orientation = Orientation.Horizontal;
            boolean m60561e = sliderDraggableState2.m60561e();
            composer2.startReplaceableGroup(1157296644);
            boolean changed4 = composer2.changed(rememberUpdatedState2);
            Object rememberedValue9 = composer2.rememberedValue();
            if (changed4 || rememberedValue9 == companion.getEmpty()) {
                rememberedValue9 = new SliderKt$SliderImpl$drag$1$1(rememberUpdatedState2, null);
                composer2.updateRememberedValue(rememberedValue9);
            }
            composer2.endReplaceableGroup();
            Modifier draggable$default = DraggableKt.draggable$default(companion2, sliderDraggableState2, orientation, z, mutableInteractionSource, m60561e, null, (Function3) rememberedValue9, z2, 32, null);
            Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier);
            SliderTokens sliderTokens = SliderTokens.INSTANCE;
            Modifier then = FocusableKt.focusable(m60541s(SizeKt.m69560requiredSizeInqDBjuR0$default(minimumInteractiveComponentSize, sliderTokens.m71255getHandleWidthD9Ej5fM(), sliderTokens.m71254getHandleHeightD9Ej5fM(), 0.0f, 0.0f, 12, null), f, z, function1, function0, closedFloatingPointRange, i), z, mutableInteractionSource).then(m60540t).then(draggable$default);
            final MutableState mutableState6 = mutableState;
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SliderKt$SliderImpl$2
                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return AbstractC22344tr0.m1366a(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return AbstractC22344tr0.m1365b(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo69194measure3p2s80s(MeasureScope Layout, List measurables, long j) {
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    Intrinsics.checkNotNullParameter(measurables, "measurables");
                    List<Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (LayoutIdKt.getLayoutId(measurable) == SliderComponents.THUMB) {
                            Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
                            for (Measurable measurable2 : list) {
                                if (LayoutIdKt.getLayoutId(measurable2) == SliderComponents.TRACK) {
                                    Placeable mo72811measureBRTryo02 = measurable2.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(ConstraintsKt.m73643offsetNN6EwU$default(j, -mo72811measureBRTryo0.getWidth(), 0, 2, null), 0, 0, 0, 0, 11, null));
                                    int width = mo72811measureBRTryo02.getWidth() + mo72811measureBRTryo0.getWidth();
                                    int max = Math.max(mo72811measureBRTryo02.getHeight(), mo72811measureBRTryo0.getHeight());
                                    MutableState.this.setValue(Float.valueOf(mo72811measureBRTryo0.getWidth()));
                                    mutableState3.setValue(Integer.valueOf(width));
                                    return MeasureScope.CC.m59532q(Layout, width, max, null, new SliderKt$SliderImpl$2$measure$1(mo72811measureBRTryo02, mo72811measureBRTryo0.getWidth() / 2, (max - mo72811measureBRTryo02.getHeight()) / 2, mo72811measureBRTryo0, AbstractC21140mr0.roundToInt(mo72811measureBRTryo02.getWidth() * f3), (max - mo72811measureBRTryo0.getHeight()) / 2), 4, null);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return AbstractC22344tr0.m1364c(this, intrinsicMeasureScope, list, i18);
                }

                @Override // androidx.compose.p003ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i18) {
                    return AbstractC22344tr0.m1363d(this, intrinsicMeasureScope, list, i18);
                }
            };
            composer2.startReplaceableGroup(-1323940314);
            Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(then);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m71393constructorimpl = Updater.m71393constructorimpl(composer2);
            Updater.m71400setimpl(m71393constructorimpl, measurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, density, companion3.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            Modifier layoutId = LayoutIdKt.layoutId(companion2, SliderComponents.THUMB);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion4 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(layoutId);
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
            Composer m71393constructorimpl2 = Updater.m71393constructorimpl(composer2);
            Updater.m71400setimpl(m71393constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl2, density2, companion3.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SliderPositions sliderPositions3 = sliderPositions;
            function3.invoke(sliderPositions3, composer2, Integer.valueOf((i17 & 112) | 6));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            Modifier layoutId2 = LayoutIdKt.layoutId(companion2, SliderComponents.TRACK);
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion4.getTopStart(), false, composer2, 0);
            composer2.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(layoutId2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m71393constructorimpl3 = Updater.m71393constructorimpl(composer2);
            Updater.m71400setimpl(m71393constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl3, density3, companion3.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            function32.invoke(sliderPositions3, composer2, Integer.valueOf(((i5 >> 24) & 112) | 6));
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$SliderImpl$3(modifier, z, mutableInteractionSource, function1, function0, i, f, closedFloatingPointRange, function3, function32, i2));
        }
    }

    /* renamed from: k */
    public static final float m60549k(ClosedFloatingPointRange closedFloatingPointRange, float f, float f2, float f3) {
        return m60543q(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f3, f, f2);
    }

    /* renamed from: l */
    public static final float m60548l(ClosedFloatingPointRange closedFloatingPointRange, float f, float f2, float f3) {
        return m60543q(f, f2, f3, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue());
    }

    /* renamed from: m */
    public static final Object m60547m(DraggableState draggableState, float f, float f2, float f3, Continuation continuation) {
        Object m31148a = AbstractC10295gK.m31148a(draggableState, null, new SliderKt$animateToTarget$2(f, f2, f3, null), continuation, 1, null);
        if (m31148a == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return m31148a;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0064 A[ORIG_RETURN, RETURN] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m60546n(androidx.compose.p003ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, kotlin.coroutines.Continuation r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.ResultKt.throwOnFailure(r12)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m70371awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7 = r12
            r12 = r8
            r8 = r7
        L55:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.p003ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.element
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
            kotlin.Pair r8 = kotlin.TuplesKt.m28844to(r12, r8)
            goto L65
        L64:
            r8 = 0
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m60546n(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: o */
    public static final float m60545o(float f, float f2, float f3) {
        float f4;
        float f5 = f2 - f;
        if (f5 == 0.0f) {
            f4 = 0.0f;
        } else {
            f4 = (f3 - f) / f5;
        }
        return AbstractC11719c.coerceIn(f4, 0.0f, 1.0f);
    }

    /* renamed from: p */
    public static final Modifier m60544p(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, boolean z, boolean z2, int i, ClosedFloatingPointRange closedFloatingPointRange, State state3, State state4) {
        if (z) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Integer.valueOf(i), Boolean.valueOf(z2), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z2, i, state3, null));
        }
        return modifier;
    }

    /* renamed from: q */
    public static final float m60543q(float f, float f2, float f3, float f4, float f5) {
        return MathHelpersKt.lerp(f4, f5, m60545o(f, f2, f3));
    }

    /* renamed from: r */
    public static final ClosedFloatingPointRange m60542r(float f, float f2, ClosedFloatingPointRange closedFloatingPointRange, float f3, float f4) {
        return AbstractC18012Lr1.rangeTo(m60543q(f, f2, ((Number) closedFloatingPointRange.getStart()).floatValue(), f3, f4), m60543q(f, f2, ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f3, f4));
    }

    /* renamed from: s */
    public static final Modifier m60541s(Modifier modifier, float f, boolean z, Function1 function1, Function0 function0, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z, closedFloatingPointRange, i, AbstractC11719c.coerceIn(f, ((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()), function1, function0), 1, null), f, closedFloatingPointRange, i);
    }

    /* renamed from: t */
    public static final Modifier m60540t(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i, boolean z, State state, State state2, MutableState mutableState, boolean z2) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, i, z, state, state2, mutableState, z2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SliderKt$sliderTapModifier$2(z2, draggableState, mutableInteractionSource, i, z, mutableState, state, state2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    /* renamed from: u */
    public static final float m60539u(float f, float[] fArr, float f2, float f3) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(fArr);
            if (lastIndex == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(MathHelpersKt.lerp(f2, f3, f4) - f);
                ?? it = new IntRange(1, lastIndex).iterator();
                while (it.hasNext()) {
                    float f5 = fArr[it.nextInt()];
                    float abs2 = Math.abs(MathHelpersKt.lerp(f2, f3, f5) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        f4 = f5;
                        abs = abs2;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        if (valueOf != null) {
            return MathHelpersKt.lerp(f2, f3, valueOf.floatValue());
        }
        return f;
    }

    /* renamed from: v */
    public static final float[] m60538v(int i) {
        if (i == 0) {
            return new float[0];
        }
        int i2 = i + 2;
        float[] fArr = new float[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[i3] = i3 / (i + 1);
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0311  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(float r46, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r48, boolean r49, @org.jetbrains.annotations.Nullable kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r50, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r51, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r52, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r55, int r56, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, int, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x03b8  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RangeSlider(@org.jetbrains.annotations.NotNull kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r47, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.ranges.ClosedFloatingPointRange<java.lang.Float>, kotlin.Unit> r48, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r49, boolean r50, @org.jetbrains.annotations.Nullable kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<kotlin.Unit> r52, @org.jetbrains.annotations.Nullable androidx.compose.material3.SliderColors r53, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r54, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material3.SliderPositions, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r58, int r59, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.ranges.ClosedFloatingPointRange, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, int, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
