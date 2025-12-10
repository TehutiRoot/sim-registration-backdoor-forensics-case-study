package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¦\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aØ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010)\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010*\u001aª\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010+\u001a\u0085\u0002\u00107\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00103\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00104\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00106\u001a\u000205H\u0001ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001am\u0010D\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020/2\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001am\u0010N\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020/2\u0006\u00106\u001a\u000205H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a¡\u0001\u0010_\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010U\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010S2\b\u0010W\u001a\u0004\u0018\u00010S2\u0006\u0010X\u001a\u00020S2\b\u0010Y\u001a\u0004\u0018\u00010S2\b\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u00100\u001a\u00020/2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010C\u001a\u00020/2\u0006\u0010^\u001a\u00020]2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b_\u0010`\u001a)\u0010d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010a\u001a\u0002012\u0006\u00106\u001a\u000205H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bb\u0010c\"\u0017\u0010g\u001a\u00020e8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\bN\u0010f\"\u001d\u0010j\u001a\u00020e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\bD\u0010f\u001a\u0004\bh\u0010i\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006k"}, m28850d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "isLabelInMiddleSection", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(IIIIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "leadingPlaceableHeight", "trailingPlaceableHeight", "prefixPlaceableHeight", "suffixPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "supportingPlaceableHeight", PDPageLabelRange.STYLE_LETTERS_LOWER, "(IIIIIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", OperatorName.CURVE_TO, "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "outlineCutout", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldInnerPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextFieldTopPadding", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1124:1\n76#2:1125\n76#2:1135\n76#2:1145\n76#2:1153\n76#2:1170\n76#2:1172\n76#2:1201\n76#2:1238\n76#2:1282\n76#2:1320\n76#2:1360\n76#2:1398\n76#2:1436\n25#3:1126\n25#3:1136\n25#3:1146\n25#3:1154\n83#3,3:1161\n456#3,11:1184\n460#3,13:1213\n473#3,3:1227\n460#3,13:1250\n473#3,3:1264\n460#3,13:1294\n473#3,3:1308\n460#3,13:1332\n473#3,3:1346\n460#3,13:1372\n473#3,3:1386\n460#3,13:1410\n473#3,3:1424\n460#3,13:1448\n473#3,3:1462\n467#3,3:1467\n1114#4,6:1127\n1114#4,6:1137\n1114#4,6:1147\n1114#4,6:1155\n1114#4,6:1164\n658#5:1133\n646#5:1134\n658#5:1143\n646#5:1144\n74#6:1171\n75#6,11:1173\n75#6:1200\n76#6,11:1202\n89#6:1230\n75#6:1237\n76#6,11:1239\n89#6:1267\n75#6:1281\n76#6,11:1283\n89#6:1311\n75#6:1319\n76#6,11:1321\n89#6:1349\n75#6:1359\n76#6,11:1361\n89#6:1389\n75#6:1397\n76#6,11:1399\n89#6:1427\n75#6:1435\n76#6,11:1437\n89#6:1465\n88#6:1470\n68#7,5:1195\n73#7:1226\n77#7:1231\n68#7,5:1232\n73#7:1263\n77#7:1268\n67#7,6:1275\n73#7:1307\n77#7:1312\n67#7,6:1313\n73#7:1345\n77#7:1350\n67#7,6:1353\n73#7:1385\n77#7:1390\n67#7,6:1391\n73#7:1423\n77#7:1428\n67#7,6:1429\n73#7:1461\n77#7:1466\n58#8:1269\n58#8:1272\n51#8:1471\n154#9:1270\n211#9:1271\n154#9:1273\n211#9:1274\n154#9:1351\n154#9:1352\n154#9:1472\n154#9:1473\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n146#1:1125\n305#1:1135\n399#1:1145\n452#1:1153\n527#1:1170\n528#1:1172\n534#1:1201\n542#1:1238\n565#1:1282\n576#1:1320\n601#1:1360\n611#1:1398\n620#1:1436\n161#1:1126\n320#1:1136\n412#1:1146\n465#1:1154\n519#1:1161,3\n528#1:1184,11\n534#1:1213,13\n534#1:1227,3\n542#1:1250,13\n542#1:1264,3\n565#1:1294,13\n565#1:1308,3\n576#1:1332,13\n576#1:1346,3\n601#1:1372,13\n601#1:1386,3\n611#1:1410,13\n611#1:1424,3\n620#1:1448,13\n620#1:1462,3\n528#1:1467,3\n161#1:1127,6\n320#1:1137,6\n412#1:1147,6\n465#1:1155,6\n519#1:1164,6\n166#1:1133\n166#1:1134\n325#1:1143\n325#1:1144\n528#1:1171\n528#1:1173,11\n534#1:1200\n534#1:1202,11\n534#1:1230\n542#1:1237\n542#1:1239,11\n542#1:1267\n565#1:1281\n565#1:1283,11\n565#1:1311\n576#1:1319\n576#1:1321,11\n576#1:1349\n601#1:1359\n601#1:1361,11\n601#1:1389\n611#1:1397\n611#1:1399,11\n611#1:1427\n620#1:1435\n620#1:1437,11\n620#1:1465\n528#1:1470\n534#1:1195,5\n534#1:1226\n534#1:1231\n542#1:1232,5\n542#1:1263\n542#1:1268\n565#1:1275,6\n565#1:1307\n565#1:1312\n576#1:1313,6\n576#1:1345\n576#1:1350\n601#1:1353,6\n601#1:1385\n601#1:1390\n611#1:1391,6\n611#1:1423\n611#1:1428\n620#1:1429,6\n620#1:1461\n620#1:1466\n554#1:1269\n559#1:1272\n934#1:1471\n554#1:1270\n554#1:1271\n559#1:1273\n559#1:1274\n591#1:1351\n592#1:1352\n1116#1:1472\n1124#1:1473\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {

    /* renamed from: a */
    public static final float f25937a = C3641Dp.m73658constructorimpl(4);

    /* renamed from: b */
    public static final float f25938b = C3641Dp.m73658constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull java.lang.String r124, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r125, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r126, boolean r127, boolean r128, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r129, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r133, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r134, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r135, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r136, boolean r137, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.input.VisualTransformation r138, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r139, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r140, boolean r141, int r142, int r143, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r144, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r145, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r146, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r147, int r148, int r149, int r150, int r151) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull Modifier modifier, @NotNull Function2<? super Composer, ? super Integer, Unit> textField, @Nullable Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Function2<? super Composer, ? super Integer, Unit> function23, @Nullable Function2<? super Composer, ? super Integer, Unit> function24, @Nullable Function2<? super Composer, ? super Integer, Unit> function25, boolean z, float f, @NotNull Function1<? super Size, Unit> onLabelMeasured, @NotNull Function2<? super Composer, ? super Integer, Unit> container, @Nullable Function2<? super Composer, ? super Integer, Unit> function26, @NotNull PaddingValues paddingValues, @Nullable Composer composer, int i, int i2) {
        PaddingValues paddingValues2;
        int i3;
        float f2;
        float f3;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer startRestartGroup = composer.startRestartGroup(1408290209);
        int i4 = (i & 14) == 0 ? i | (startRestartGroup.changed(modifier) ? 4 : 2) : i;
        if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(textField) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= startRestartGroup.changedInstance(function25) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= startRestartGroup.changed(z) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        if ((1879048192 & i) == 0) {
            i4 |= startRestartGroup.changed(f) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i5 = i4;
        int i6 = (i2 & 14) == 0 ? i2 | (startRestartGroup.changedInstance(onLabelMeasured) ? 4 : 2) : i2;
        if ((i2 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(container) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i6 |= startRestartGroup.changedInstance(function26) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            paddingValues2 = paddingValues;
            i6 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i7 = i6;
        if ((i5 & 1533916891) == 306783378 && (i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i5, i7, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:502)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z), Float.valueOf(f), paddingValues2};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i8 = 0;
            boolean z2 = false;
            for (int i9 = 4; i8 < i9; i9 = 4) {
                z2 |= startRestartGroup.changed(objArr[i8]);
                i8++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z, f, paddingValues2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(modifier);
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
            Updater.m71400setimpl(m71393constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl, density, companion.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            materializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            container.invoke(startRestartGroup, Integer.valueOf((i7 >> 3) & 14));
            startRestartGroup.startReplaceableGroup(1116455047);
            if (function22 != null) {
                Modifier then = LayoutIdKt.layoutId(Modifier.Companion, "Leading").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(then);
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
                Composer m71393constructorimpl2 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl2, density2, companion.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl2, layoutDirection3, companion.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf2.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function22.invoke(startRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116455332);
            if (function23 != null) {
                Modifier then2 = LayoutIdKt.layoutId(Modifier.Companion, "Trailing").then(TextFieldImplKt.getIconDefaultSizeModifier());
                Alignment center2 = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(then2);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71393constructorimpl3 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl3, density3, companion.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl3, layoutDirection4, companion.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf3.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                function23.invoke(startRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (function22 != null) {
                i3 = 0;
                calculateStartPadding = C3641Dp.m73658constructorimpl(AbstractC11719c.coerceAtLeast(C3641Dp.m73658constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C3641Dp.m73658constructorimpl(0)));
            } else {
                i3 = 0;
            }
            if (function23 != null) {
                calculateEndPadding = C3641Dp.m73658constructorimpl(AbstractC11719c.coerceAtLeast(C3641Dp.m73658constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C3641Dp.m73658constructorimpl(i3)));
            }
            startRestartGroup.startReplaceableGroup(1116456222);
            if (function24 != null) {
                Modifier m69533paddingqDBjuR0$default = PaddingKt.m69533paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m69552heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), calculateStartPadding, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(m69533paddingqDBjuR0$default);
                f2 = calculateStartPadding;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71393constructorimpl4 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl4, density4, companion.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl4, layoutDirection5, companion.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                function24.invoke(startRestartGroup, Integer.valueOf((i5 >> 18) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                f2 = calculateStartPadding;
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116456621);
            if (function25 != null) {
                Modifier m69533paddingqDBjuR0$default2 = PaddingKt.m69533paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m69552heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, calculateEndPadding, 0.0f, 10, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf5 = LayoutKt.materializerOf(m69533paddingqDBjuR0$default2);
                f3 = calculateEndPadding;
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71393constructorimpl5 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl5, rememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl5, density5, companion.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl5, layoutDirection6, companion.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl5, viewConfiguration5, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf5.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                function25.invoke(startRestartGroup, Integer.valueOf((i5 >> 21) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            } else {
                f3 = calculateEndPadding;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m69533paddingqDBjuR0$default3 = PaddingKt.m69533paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m69552heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), function24 == null ? f2 : C3641Dp.m73658constructorimpl(0), 0.0f, function25 == null ? f3 : C3641Dp.m73658constructorimpl(0), 0.0f, 10, null);
            startRestartGroup.startReplaceableGroup(1116457331);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.layoutId(companion2, "Hint").then(m69533paddingqDBjuR0$default3), startRestartGroup, Integer.valueOf((i5 >> 3) & 112));
            }
            startRestartGroup.endReplaceableGroup();
            Modifier then3 = LayoutIdKt.layoutId(companion2, "TextField").then(m69533paddingqDBjuR0$default3);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density6 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor6 = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf6 = LayoutKt.materializerOf(then3);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor6);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m71393constructorimpl6 = Updater.m71393constructorimpl(startRestartGroup);
            Updater.m71400setimpl(m71393constructorimpl6, rememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
            Updater.m71400setimpl(m71393constructorimpl6, density6, companion.getSetDensity());
            Updater.m71400setimpl(m71393constructorimpl6, layoutDirection7, companion.getSetLayoutDirection());
            Updater.m71400setimpl(m71393constructorimpl6, viewConfiguration6, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf6.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            textField.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1116457749);
            if (function2 != null) {
                Modifier layoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m69552heightInVpY3zN4$default(companion2, DpKt.m73701lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), "Label");
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density7 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection8 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration7 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor7 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf7 = LayoutKt.materializerOf(layoutId);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor7);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71393constructorimpl7 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl7, rememberBoxMeasurePolicy6, companion.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl7, density7, companion.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl7, layoutDirection8, companion.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl7, viewConfiguration7, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf7.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                function2.invoke(startRestartGroup, Integer.valueOf((i5 >> 9) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-2058764510);
            if (function26 != null) {
                Modifier padding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m69552heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m70668supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density8 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection9 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration8 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor8 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf8 = LayoutKt.materializerOf(padding);
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor8);
                } else {
                    startRestartGroup.useNode();
                }
                startRestartGroup.disableReusing();
                Composer m71393constructorimpl8 = Updater.m71393constructorimpl(startRestartGroup);
                Updater.m71400setimpl(m71393constructorimpl8, rememberBoxMeasurePolicy7, companion.getSetMeasurePolicy());
                Updater.m71400setimpl(m71393constructorimpl8, density8, companion.getSetDensity());
                Updater.m71400setimpl(m71393constructorimpl8, layoutDirection9, companion.getSetLayoutDirection());
                Updater.m71400setimpl(m71393constructorimpl8, viewConfiguration8, companion.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf8.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                function26.invoke(startRestartGroup, Integer.valueOf((i7 >> 6) & 14));
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OutlinedTextFieldKt$OutlinedTextFieldLayout$2(modifier, textField, function3, function2, function22, function23, function24, function25, z, f, onLabelMeasured, container, function26, paddingValues, i, i2));
    }

    /* renamed from: a */
    public static final int m60597a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f, PaddingValues paddingValues) {
        return Math.max(Constraints.m73627getMinHeightimpl(j), AbstractC16931vu.maxOf(i, i2, i3, i4, AbstractC21140mr0.roundToInt(Math.max(i5, i7) + (paddingValues.mo69156calculateBottomPaddingD9Ej5fM() * f) + Math.max(paddingValues.mo69159calculateTopPaddingD9Ej5fM() * f, i6 / 2.0f))) + i8);
    }

    /* renamed from: b */
    public static final int m60596b(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, long j, float f, PaddingValues paddingValues) {
        int i8;
        int i9 = i3 + i4;
        int i10 = i5 + i9;
        int i11 = i7 + i9;
        int i12 = 0;
        if (z) {
            i8 = i6;
        } else {
            i8 = 0;
        }
        int max = i + Math.max(i10, Math.max(i11, i8)) + i2;
        if (!z) {
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            i12 = i6 + AbstractC21140mr0.roundToInt(C3641Dp.m73658constructorimpl(paddingValues.mo69157calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo69158calculateRightPaddingu2uoSUM(layoutDirection)) * f);
        }
        return Math.max(max, Math.max(i12, Constraints.m73628getMinWidthimpl(j)));
    }

    /* renamed from: c */
    public static final void m60595c(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, boolean z, float f2, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int i3;
        float widthOrZero;
        Placeable.PlacementScope.m72850place70tqf50$default(placementScope, placeable8, IntOffset.Companion.m73786getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i - TextFieldImplKt.heightOrZero(placeable9);
        int roundToInt = AbstractC21140mr0.roundToInt(paddingValues.mo69159calculateTopPaddingD9Ej5fM() * f2);
        int roundToInt2 = AbstractC21140mr0.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f2);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f2;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            if (z) {
                i3 = Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), heightOrZero);
            } else {
                i3 = roundToInt;
            }
            int lerp = MathHelpersKt.lerp(i3, -(placeable6.getHeight() / 2), f);
            if (placeable == null) {
                widthOrZero = 0.0f;
            } else {
                widthOrZero = (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, AbstractC21140mr0.roundToInt(widthOrZero) + roundToInt2, lerp, 0.0f, 4, null);
        }
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), m60594d(z, heightOrZero, roundToInt, placeable6, placeable3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i2 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), m60594d(z, heightOrZero, roundToInt, placeable6, placeable4), 0.0f, 4, null);
        }
        int widthOrZero2 = TextFieldImplKt.widthOrZero(placeable) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, widthOrZero2, m60594d(z, heightOrZero, roundToInt, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, widthOrZero2, m60594d(z, heightOrZero, roundToInt, placeable6, placeable7), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    /* renamed from: d */
    public static final int m60594d(boolean z, int i, int i2, Placeable placeable, Placeable placeable2) {
        if (z) {
            i2 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i);
        }
        return Math.max(i2, TextFieldImplKt.heightOrZero(placeable) / 2);
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return f25938b;
    }

    @NotNull
    /* renamed from: outlineCutout-12SF9DM  reason: not valid java name */
    public static final Modifier m70494outlineCutout12SF9DM(@NotNull Modifier outlineCutout, long j, @NotNull PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new OutlinedTextFieldKt$outlineCutout$1(j, paddingValues));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:368:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0146  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull androidx.compose.p003ui.text.input.TextFieldValue r124, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.compose.p003ui.text.input.TextFieldValue, kotlin.Unit> r125, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r126, boolean r127, boolean r128, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.TextStyle r129, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r130, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r131, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r132, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r133, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r134, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r135, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r136, boolean r137, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.text.input.VisualTransformation r138, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r139, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r140, boolean r141, int r142, int r143, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r144, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r145, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r146, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r147, int r148, int r149, int r150, int r151) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(java.lang.String r121, kotlin.jvm.functions.Function1 r122, androidx.compose.p003ui.Modifier r123, boolean r124, boolean r125, androidx.compose.p003ui.text.TextStyle r126, kotlin.jvm.functions.Function2 r127, kotlin.jvm.functions.Function2 r128, kotlin.jvm.functions.Function2 r129, kotlin.jvm.functions.Function2 r130, kotlin.jvm.functions.Function2 r131, boolean r132, androidx.compose.p003ui.text.input.VisualTransformation r133, androidx.compose.foundation.text.KeyboardOptions r134, androidx.compose.foundation.text.KeyboardActions r135, boolean r136, int r137, int r138, androidx.compose.foundation.interaction.MutableInteractionSource r139, androidx.compose.p003ui.graphics.Shape r140, androidx.compose.material3.TextFieldColors r141, androidx.compose.runtime.Composer r142, int r143, int r144, int r145, int r146) {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with prefix and suffix parameters")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void OutlinedTextField(androidx.compose.p003ui.text.input.TextFieldValue r121, kotlin.jvm.functions.Function1 r122, androidx.compose.p003ui.Modifier r123, boolean r124, boolean r125, androidx.compose.p003ui.text.TextStyle r126, kotlin.jvm.functions.Function2 r127, kotlin.jvm.functions.Function2 r128, kotlin.jvm.functions.Function2 r129, kotlin.jvm.functions.Function2 r130, kotlin.jvm.functions.Function2 r131, boolean r132, androidx.compose.p003ui.text.input.VisualTransformation r133, androidx.compose.foundation.text.KeyboardOptions r134, androidx.compose.foundation.text.KeyboardActions r135, boolean r136, int r137, int r138, androidx.compose.foundation.interaction.MutableInteractionSource r139, androidx.compose.p003ui.graphics.Shape r140, androidx.compose.material3.TextFieldColors r141, androidx.compose.runtime.Composer r142, int r143, int r144, int r145, int r146) {
        /*
            Method dump skipped, instructions count: 1432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
