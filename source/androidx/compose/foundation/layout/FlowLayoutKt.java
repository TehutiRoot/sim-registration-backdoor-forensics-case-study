package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aY\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aY\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\b\fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a;\u0010\u0018\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u001a\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0006H\u0001¢\u0006\u0004\b \u0010!\u001a\u009d\u0001\u0010-\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2*\u0010$\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2*\u0010+\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00142\u0006\u0010,\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b-\u0010.\u001aZ\u00106\u001a\u00020\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2#\u00103\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b\f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u00107\u001a\u0087\u0001\u00109\u001a\u00020\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2#\u00103\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b\f2#\u0010(\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b\f2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b9\u0010:\u001aM\u0010>\u001a\u00020\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010;\u001a\u00020\u00152\u0006\u0010<\u001a\u00020\u00152\u0006\u0010=\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0087\u0001\u0010@\u001a\u00020\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u0002000/2#\u00103\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b\f2#\u0010(\u001a\u001f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b\f2\u0006\u0010=\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b@\u0010:\u001a9\u0010I\u001a\u00020F*\u00020A2\u0006\u0010C\u001a\u00020B2\u0006\u0010#\u001a\u00020\"2\u0006\u0010E\u001a\u00020D2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bG\u0010H\u001a#\u0010K\u001a\u00020\u0006*\u00020J2\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020\u0006H\u0000¢\u0006\u0004\bK\u0010L\u001a#\u0010M\u001a\u00020\u0006*\u00020J2\u0006\u0010#\u001a\u00020\"2\u0006\u00103\u001a\u00020\u0006H\u0000¢\u0006\u0004\bM\u0010L\u001a\u001b\u00103\u001a\u00020\u0006*\u00020N2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b3\u0010O\u001a\u001b\u0010(\u001a\u00020\u0006*\u00020N2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b(\u0010O\u001a?\u0010Q\u001a\u00020\u0006*\u00020J2\u0006\u0010E\u001a\u00020D2\u0006\u0010#\u001a\u00020\"2\u0014\u0010P\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010N\u0012\u0004\u0012\u00020\n0\bH\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bQ\u0010R\"\u0014\u0010T\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010S\"\u0014\u0010U\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010S\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006V"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalArrangement", "", "maxItemsInEachRow", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "FlowRow", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnScope;", "FlowColumn", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function5;", "", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/layout/Arrangement$Vertical;)Lkotlin/jvm/functions/Function5;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;)Lkotlin/jvm/functions/Function5;", "maxItemsInMainAxis", "Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "mainAxisArrangement", "Landroidx/compose/ui/unit/Dp;", "mainAxisArrangementSpacing", "Landroidx/compose/foundation/layout/SizeMode;", "crossAxisSize", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "crossAxisArrangement", "crossAxisArrangementSpacing", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/functions/Function5;FI)Landroidx/compose/ui/layout/MeasurePolicy;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", OperatorName.FILL_NON_ZERO, "(Ljava/util/List;Lkotlin/jvm/functions/Function3;III)I", "crossAxisSpacing", OperatorName.CLOSE_PATH, "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIII)I", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "e", "(Ljava/util/List;[I[IIIII)I", "d", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;", "measureHelper", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "constraints", "Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems-w1Onq5I", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;Landroidx/compose/foundation/layout/LayoutOrientation;JI)Landroidx/compose/foundation/layout/FlowResult;", "breakDownItems", "Landroidx/compose/ui/layout/Measurable;", "mainAxisMin", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/LayoutOrientation;I)I", "crossAxisMin", "Landroidx/compose/ui/layout/Placeable;", "(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/LayoutOrientation;)I", "storePlaceable", OperatorName.NON_STROKING_GRAY, "(Landroidx/compose/ui/layout/Measurable;JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function1;)I", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/Updater\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,755:1\n78#2,11:756\n91#2:787\n78#2,11:788\n91#2:819\n456#3,8:767\n464#3,6:781\n456#3,8:799\n464#3,6:813\n67#3,3:820\n66#3:823\n67#3,3:830\n66#3:833\n4144#4,6:775\n4144#4,6:807\n1097#5,6:824\n1097#5,6:834\n69#6,6:840\n69#6,6:847\n1#7:846\n1182#8:853\n1161#8,2:854\n321#9:856\n320#9:857\n323#9:858\n322#9:859\n320#9:860\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n67#1:756,11\n67#1:787\n117#1:788,11\n117#1:819\n67#1:767,8\n67#1:781,6\n117#1:799,8\n117#1:813,6\n169#1:820,3\n169#1:823\n190#1:830,3\n190#1:833\n67#1:775,6\n117#1:807,6\n169#1:824,6\n190#1:834,6\n446#1:840,6\n567#1:847,6\n607#1:853\n607#1:854,2\n608#1:856\n609#1:857\n610#1:858\n687#1:859\n688#1:860\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLayoutKt {

    /* renamed from: a */
    public static final CrossAxisAlignment f13138a;

    /* renamed from: b */
    public static final CrossAxisAlignment f13139b;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        f13138a = companion.vertical$foundation_layout_release(companion2.getTop());
        f13139b = companion.horizontal$foundation_layout_release(companion2.getStart());
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowColumn(@Nullable Modifier modifier, @Nullable Arrangement.Vertical vertical, @Nullable Arrangement.Horizontal horizontal, int i, @NotNull Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-310290901);
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 4) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        MeasurePolicy columnMeasurementHelper = columnMeasurementHelper(vertical, horizontal, i, composer, (i2 >> 3) & 1022);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl, columnMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(FlowColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalLayoutApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void FlowRow(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, int i, @NotNull Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(1098475987);
        if ((i3 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i3 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i3 & 4) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i3 & 8) != 0) {
            i = Integer.MAX_VALUE;
        }
        MeasurePolicy rowMeasurementHelper = rowMeasurementHelper(horizontal, vertical, i, composer, (i2 >> 3) & 1022);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m71393constructorimpl = Updater.m71393constructorimpl(composer);
        Updater.m71400setimpl(m71393constructorimpl, rowMeasurementHelper, companion.getSetMeasurePolicy());
        Updater.m71400setimpl(m71393constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m71393constructorimpl.getInserting() || !Intrinsics.areEqual(m71393constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m71393constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m71393constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m71384boximpl(SkippableUpdater.m71385constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(FlowRowScopeInstance.INSTANCE, composer, Integer.valueOf(((i2 >> 9) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    /* renamed from: a */
    public static final MeasurePolicy m61400a(final LayoutOrientation layoutOrientation, final Function5 function5, final float f, final SizeMode sizeMode, final CrossAxisAlignment crossAxisAlignment, final Function5 function52, final float f2, final int i) {
        return new MeasurePolicy(function5, f, sizeMode, crossAxisAlignment, i, f2, function52) { // from class: androidx.compose.foundation.layout.FlowLayoutKt$flowMeasurePolicy$1

            /* renamed from: a */
            public final Function3 f13140a;

            /* renamed from: b */
            public final Function3 f13141b;

            /* renamed from: c */
            public final Function3 f13142c;

            /* renamed from: d */
            public final Function3 f13143d;

            /* renamed from: f */
            public final /* synthetic */ Function5 f13145f;

            /* renamed from: g */
            public final /* synthetic */ float f13146g;

            /* renamed from: h */
            public final /* synthetic */ SizeMode f13147h;

            /* renamed from: i */
            public final /* synthetic */ CrossAxisAlignment f13148i;

            /* renamed from: j */
            public final /* synthetic */ int f13149j;

            /* renamed from: k */
            public final /* synthetic */ float f13150k;

            /* renamed from: l */
            public final /* synthetic */ Function5 f13151l;

            {
                Function3 function3;
                Function3 function32;
                Function3 function33;
                Function3 function34;
                this.f13145f = function5;
                this.f13146g = f;
                this.f13147h = sizeMode;
                this.f13148i = crossAxisAlignment;
                this.f13149j = i;
                this.f13150k = f2;
                this.f13151l = function52;
                LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
                if (LayoutOrientation.this == layoutOrientation2) {
                    function3 = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    function3 = FlowLayoutKt$flowMeasurePolicy$1$maxMainAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.f13140a = function3;
                if (LayoutOrientation.this == layoutOrientation2) {
                    function32 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    function32 = FlowLayoutKt$flowMeasurePolicy$1$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.f13141b = function32;
                if (LayoutOrientation.this == layoutOrientation2) {
                    function33 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    function33 = FlowLayoutKt$flowMeasurePolicy$1$minCrossAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.f13142c = function33;
                if (LayoutOrientation.this == layoutOrientation2) {
                    function34 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$1.INSTANCE;
                } else {
                    function34 = FlowLayoutKt$flowMeasurePolicy$1$minMainAxisIntrinsicItemSize$2.INSTANCE;
                }
                this.f13143d = function34;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
                return this.f13141b;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
                return this.f13140a;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
                return this.f13142c;
            }

            @NotNull
            public final Function3<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
                return this.f13143d;
            }

            public final int intrinsicCrossAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int i2, int i3, int i4) {
                int m61397d;
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                m61397d = FlowLayoutKt.m61397d(measurables, this.f13143d, this.f13142c, i2, i3, i4, this.f13149j);
                return m61397d;
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return intrinsicCrossAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g), intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13150k));
                }
                return maxIntrinsicMainAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g));
            }

            public final int maxIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int i2, int i3) {
                int m61395f;
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                m61395f = FlowLayoutKt.m61395f(measurables, this.f13140a, i2, i3, this.f13149j);
                return m61395f;
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return maxIntrinsicMainAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g));
                }
                return intrinsicCrossAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g), intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13150k));
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            @NotNull
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo69194measure3p2s80s(@NotNull MeasureScope measure, @NotNull List<? extends Measurable> measurables, long j) {
                int mainAxisTotalSize;
                Intrinsics.checkNotNullParameter(measure, "$this$measure");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (measurables.isEmpty()) {
                    return MeasureScope.CC.m59532q(measure, 0, 0, null, FlowLayoutKt$flowMeasurePolicy$1$measure$1.INSTANCE, 4, null);
                }
                RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(LayoutOrientation.this, this.f13145f, this.f13146g, this.f13147h, this.f13148i, measurables, new Placeable[measurables.size()], null);
                FlowResult m69499breakDownItemsw1Onq5I = FlowLayoutKt.m69499breakDownItemsw1Onq5I(measure, rowColumnMeasurementHelper, LayoutOrientation.this, OrientationIndependentConstraints.m69506constructorimpl(j, LayoutOrientation.this), this.f13149j);
                MutableVector<RowColumnMeasureHelperResult> items = m69499breakDownItemsw1Onq5I.getItems();
                int size = items.getSize();
                int[] iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr[i2] = items.getContent()[i2].getCrossAxisSize();
                }
                int[] iArr2 = new int[size];
                int crossAxisTotalSize = m69499breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measure.mo69432roundToPx0680j_4(this.f13150k) * (items.getSize() - 1));
                this.f13151l.invoke(Integer.valueOf(crossAxisTotalSize), iArr, measure.getLayoutDirection(), measure, iArr2);
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    crossAxisTotalSize = m69499breakDownItemsw1Onq5I.getMainAxisTotalSize();
                    mainAxisTotalSize = crossAxisTotalSize;
                } else {
                    mainAxisTotalSize = m69499breakDownItemsw1Onq5I.getMainAxisTotalSize();
                }
                return MeasureScope.CC.m59532q(measure, ConstraintsKt.m73640constrainWidthK40F9xA(j, crossAxisTotalSize), ConstraintsKt.m73639constrainHeightK40F9xA(j, mainAxisTotalSize), null, new FlowLayoutKt$flowMeasurePolicy$1$measure$2(m69499breakDownItemsw1Onq5I, rowColumnMeasurementHelper, iArr2, measure), 4, null);
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return intrinsicCrossAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g), intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13150k));
                }
                return minIntrinsicMainAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g), intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13150k));
            }

            public final int minIntrinsicMainAxisSize(@NotNull List<? extends IntrinsicMeasurable> measurables, int i2, int i3, int i4) {
                int m61393h;
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                m61393h = FlowLayoutKt.m61393h(measurables, this.f13143d, this.f13142c, i2, i3, i4, this.f13149j);
                return m61393h;
            }

            @Override // androidx.compose.p003ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> measurables, int i2) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
                Intrinsics.checkNotNullParameter(measurables, "measurables");
                if (LayoutOrientation.this == LayoutOrientation.Horizontal) {
                    return minIntrinsicMainAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g), intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13150k));
                }
                return intrinsicCrossAxisSize(measurables, i2, intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13146g), intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13150k));
            }
        };
    }

    /* renamed from: b */
    public static final Function5 m61399b(Arrangement.Horizontal horizontal) {
        return new FlowLayoutKt$getHorizontalArrangement$1(horizontal);
    }

    @NotNull
    /* renamed from: breakDownItems-w1Onq5I  reason: not valid java name */
    public static final FlowResult m69499breakDownItemsw1Onq5I(@NotNull MeasureScope breakDownItems, @NotNull RowColumnMeasurementHelper measureHelper, @NotNull LayoutOrientation orientation, long j, int i) {
        Integer num;
        Integer num2;
        Integer num3;
        int i2;
        Intrinsics.checkNotNullParameter(breakDownItems, "$this$breakDownItems");
        Intrinsics.checkNotNullParameter(measureHelper, "measureHelper");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        MutableVector mutableVector = new MutableVector(new RowColumnMeasureHelperResult[16], 0);
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        List<Measurable> measurables = measureHelper.getMeasurables();
        Placeable[] placeables = measureHelper.getPlaceables();
        int ceil = (int) Math.ceil(breakDownItems.mo69438toPx0680j_4(measureHelper.m69543getArrangementSpacingD9Ej5fM()));
        long m69505constructorimpl = OrientationIndependentConstraints.m69505constructorimpl(m73628getMinWidthimpl, m73626getMaxWidthimpl, 0, m73625getMaxHeightimpl);
        Measurable measurable = (Measurable) CollectionsKt___CollectionsKt.getOrNull(measurables, 0);
        if (measurable != null) {
            num = Integer.valueOf(m61394g(measurable, m69505constructorimpl, orientation, new FlowLayoutKt$breakDownItems$nextSize$1(placeables)));
        } else {
            num = null;
        }
        Integer[] numArr = new Integer[measurables.size()];
        int size = measurables.size();
        int i3 = m73626getMaxWidthimpl;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            Intrinsics.checkNotNull(num);
            int intValue = num.intValue();
            int i8 = i5 + intValue;
            i3 -= intValue;
            int i9 = i4 + 1;
            Measurable measurable2 = (Measurable) CollectionsKt___CollectionsKt.getOrNull(measurables, i9);
            if (measurable2 != null) {
                num2 = Integer.valueOf(m61394g(measurable2, m69505constructorimpl, orientation, new FlowLayoutKt$breakDownItems$1(placeables, i4)) + ceil);
            } else {
                num2 = null;
            }
            if (i9 < measurables.size() && i9 - i6 < i) {
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                if (i3 - i2 >= 0) {
                    i5 = i8;
                    i4 = i9;
                    num = num2;
                }
            }
            int min = Math.min(Math.max(m73628getMinWidthimpl, i8), m73626getMaxWidthimpl);
            numArr[i7] = Integer.valueOf(i9);
            i7++;
            if (num2 != null) {
                num3 = Integer.valueOf(num2.intValue() - ceil);
            } else {
                num3 = null;
            }
            i3 = m73626getMaxWidthimpl;
            num2 = num3;
            i6 = i9;
            i5 = 0;
            m73628getMinWidthimpl = min;
            i4 = i9;
            num = num2;
        }
        int i10 = m73628getMinWidthimpl;
        long m69519toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m69519toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m69508copyyUG9Ft0$default(m69505constructorimpl, i10, 0, 0, 0, 14, null), orientation);
        Integer num4 = (Integer) ArraysKt___ArraysKt.getOrNull(numArr, 0);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (num4 != null) {
            RowColumnMeasureHelperResult m69544measureWithoutPlacing_EkL_Y = measureHelper.m69544measureWithoutPlacing_EkL_Y(breakDownItems, m69519toBoxConstraintsOenEA2s, i11, num4.intValue());
            i12 += m69544measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            i10 = Math.max(i10, m69544measureWithoutPlacing_EkL_Y.getMainAxisSize());
            mutableVector.add(m69544measureWithoutPlacing_EkL_Y);
            i11 = num4.intValue();
            i13++;
            num4 = (Integer) ArraysKt___ArraysKt.getOrNull(numArr, i13);
        }
        return new FlowResult(Math.max(i10, Constraints.m73628getMinWidthimpl(j)), Math.max(i12, Constraints.m73627getMinHeightimpl(j)), mutableVector);
    }

    /* renamed from: c */
    public static final Function5 m61398c(Arrangement.Vertical vertical) {
        return new FlowLayoutKt$getVerticalArrangement$1(vertical);
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy columnMeasurementHelper(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Arrangement.Horizontal horizontalArrangement, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        composer.startReplaceableGroup(-2013098357);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:184)");
        }
        Integer valueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(verticalArrangement) | composer.changed(horizontalArrangement);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m61400a(LayoutOrientation.Vertical, m61398c(verticalArrangement), verticalArrangement.mo69484getSpacingD9Ej5fM(), SizeMode.Wrap, f13139b, m61399b(horizontalArrangement), horizontalArrangement.mo69484getSpacingD9Ej5fM(), i);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }

    public static final int crossAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation orientation, int i) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicHeight(i);
        }
        return measurable.minIntrinsicWidth(i);
    }

    public static final int crossAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return placeable.getHeight();
        }
        return placeable.getWidth();
    }

    /* renamed from: d */
    public static final int m61397d(List list, Function3 function3, Function3 function32, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (list.isEmpty()) {
            return 0;
        }
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(list, 0);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) orNull;
        if (intrinsicMeasurable != null) {
            i5 = ((Number) function32.invoke(intrinsicMeasurable, 0, Integer.valueOf(i))).intValue();
        } else {
            i5 = 0;
        }
        if (intrinsicMeasurable != null) {
            i6 = ((Number) function3.invoke(intrinsicMeasurable, 0, Integer.valueOf(i5))).intValue();
        } else {
            i6 = 0;
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < size) {
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) list.get(i10);
            Intrinsics.checkNotNull(orNull);
            i9 -= i6;
            int max = Math.max(i12, i5);
            i10++;
            Object orNull2 = CollectionsKt___CollectionsKt.getOrNull(list, i10);
            IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) orNull2;
            if (intrinsicMeasurable3 != null) {
                i7 = ((Number) function32.invoke(intrinsicMeasurable3, Integer.valueOf(i10), Integer.valueOf(i))).intValue();
            } else {
                i7 = 0;
            }
            if (intrinsicMeasurable3 != null) {
                i8 = ((Number) function3.invoke(intrinsicMeasurable3, Integer.valueOf(i10), Integer.valueOf(i7))).intValue() + i2;
            } else {
                i8 = 0;
            }
            if (i9 >= 0 && i10 != list.size()) {
                if (i10 - i13 != i4 && i9 - i8 >= 0) {
                    int i14 = i7;
                    i12 = max;
                    orNull = orNull2;
                    i6 = i8;
                    i5 = i14;
                }
            }
            i11 += max + i3;
            i8 -= i2;
            i9 = i;
            i13 = i10;
            max = 0;
            int i142 = i7;
            i12 = max;
            orNull = orNull2;
            i6 = i8;
            i5 = i142;
        }
        return i11 - i3;
    }

    /* renamed from: e */
    public static final int m61396e(List list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        return m61397d(list, new FlowLayoutKt$intrinsicCrossAxisSize$1(iArr), new FlowLayoutKt$intrinsicCrossAxisSize$2(iArr2), i, i2, i3, i4);
    }

    /* renamed from: f */
    public static final int m61395f(List list, Function3 function3, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = ((Number) function3.invoke((IntrinsicMeasurable) list.get(i4), Integer.valueOf(i4), Integer.valueOf(i))).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 != i3 && i8 != list.size()) {
                i7 += intValue;
            } else {
                i5 = Math.max(i5, (i7 + intValue) - i2);
                i6 = i4;
                i7 = 0;
            }
            i4 = i8;
        }
        return i5;
    }

    /* renamed from: g */
    public static final int m61394g(Measurable measurable, long j, LayoutOrientation layoutOrientation, Function1 function1) {
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(OrientationIndependentConstraints.m69519toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m69508copyyUG9Ft0$default(j, 0, 0, 0, 0, 14, null), layoutOrientation));
            function1.invoke(mo72811measureBRTryo0);
            return mainAxisSize(mo72811measureBRTryo0, layoutOrientation);
        }
        return mainAxisMin(measurable, layoutOrientation, Integer.MAX_VALUE);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.IntIterator, java.util.Iterator] */
    /* renamed from: h */
    public static final int m61393h(List list, Function3 function3, Function3 function32, int i, int i2, int i3, int i4) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            iArr2[i6] = 0;
        }
        int size3 = list.size();
        for (int i7 = 0; i7 < size3; i7++) {
            IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) list.get(i7);
            int intValue = ((Number) function3.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(i))).intValue();
            iArr[i7] = intValue;
            iArr2[i7] = ((Number) function32.invoke(intrinsicMeasurable, Integer.valueOf(i7), Integer.valueOf(intValue))).intValue();
        }
        int sum = ArraysKt___ArraysKt.sum(iArr);
        if (size2 != 0) {
            int i8 = iArr2[0];
            ?? it = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr2)).iterator();
            while (it.hasNext()) {
                int i9 = iArr2[it.nextInt()];
                if (i8 < i9) {
                    i8 = i9;
                }
            }
            if (size != 0) {
                int i10 = iArr[0];
                ?? it2 = new IntRange(1, ArraysKt___ArraysKt.getLastIndex(iArr)).iterator();
                while (it2.hasNext()) {
                    int i11 = iArr[it2.nextInt()];
                    if (i10 < i11) {
                        i10 = i11;
                    }
                }
                int i12 = sum;
                while (i10 < i12) {
                    if (i8 == i) {
                        return sum;
                    }
                    int i13 = (i10 + i12) / 2;
                    i8 = m61396e(list, iArr, iArr2, i13, i2, i3, i4);
                    if (i8 == i) {
                        return i13;
                    }
                    if (i8 > i) {
                        i10 = i13 + 1;
                    } else {
                        i12 = i13 - 1;
                    }
                    sum = i13;
                }
                return sum;
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public static final int mainAxisMin(@NotNull Measurable measurable, @NotNull LayoutOrientation orientation, int i) {
        Intrinsics.checkNotNullParameter(measurable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return measurable.minIntrinsicWidth(i);
        }
        return measurable.minIntrinsicHeight(i);
    }

    public static final int mainAxisSize(@NotNull Placeable placeable, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(placeable, "<this>");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return placeable.getWidth();
        }
        return placeable.getHeight();
    }

    @Composable
    @PublishedApi
    @NotNull
    public static final MeasurePolicy rowMeasurementHelper(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, int i, @Nullable Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement");
        composer.startReplaceableGroup(1479255111);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:163)");
        }
        Integer valueOf = Integer.valueOf(i);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(horizontalArrangement) | composer.changed(verticalArrangement);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = m61400a(LayoutOrientation.Horizontal, m61399b(horizontalArrangement), horizontalArrangement.mo69484getSpacingD9Ej5fM(), SizeMode.Wrap, f13138a, m61398c(verticalArrangement), verticalArrangement.mo69484getSpacingD9Ej5fM(), i);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }
}
