package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material.AnchoredDraggableState;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a=\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001aá\u0002\u0010>\u001a\u00020\u001b2\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00172\u0015\b\u0002\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\"¢\u0006\u0002\b\u001c2\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\u0002\b\u001c2\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\"¢\u0006\u0002\b\u001c2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020+2 \b\u0002\u00101\u001a\u001a\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0005¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001d2\b\b\u0002\u00102\u001a\u00020\u00062\b\b\u0002\u00103\u001a\u00020)2\b\b\u0002\u00104\u001a\u00020+2\b\b\u0002\u00105\u001a\u00020-2\b\b\u0002\u00106\u001a\u00020-2\b\b\u0002\u00107\u001a\u00020-2\b\b\u0002\u00108\u001a\u00020-2\b\b\u0002\u00109\u001a\u00020-2\u0017\u0010;\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a\u009c\u0001\u0010F\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00062-\u0010E\u001a)\u0012\u0013\u0012\u00110@¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(C\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030D0\u00052\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020-2\b\b\u0002\u0010 \u001a\u00020\u001f2\u001c\u0010;\u001a\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\u0002\b\u001c¢\u0006\u0002\b\u001dH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bF\u0010G\u001aÈ\u0001\u0010O\u001a\u00020\u001b2\u0013\u0010#\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\"¢\u0006\u0002\b\u001c2&\u0010I\u001a\"\u0012\u0013\u0012\u00110:¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(H\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\u0002\b\u001c2&\u0010L\u001a\"\u0012\u0013\u0012\u00110J¢\u0006\f\bA\u0012\b\bB\u0012\u0004\b\b(K\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\u0002\b\u001c2\u0013\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u001b\u0018\u00010\"¢\u0006\u0002\b\u001c2\u0011\u0010$\u001a\r\u0012\u0004\u0012\u00020\u001b0\"¢\u0006\u0002\b\u001c2\u0006\u00100\u001a\u00020+2\u0006\u0010'\u001a\u00020&2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030\"2\u0006\u0010N\u001a\u00020\bH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bO\u0010P\u001a#\u0010U\u001a\u00020T2\n\u0010?\u001a\u0006\u0012\u0002\b\u00030Q2\u0006\u0010S\u001a\u00020RH\u0002¢\u0006\u0004\bU\u0010V\u001a%\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00000Y2\u0006\u0010?\u001a\u00020\b2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bZ\u0010[\"\u0017\u0010]\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bF\u0010\\\"\u0017\u0010^\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bZ\u0010\\\"\u0017\u0010_\u001a\u00020+8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006`"}, m28850d2 = {"Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material/BottomSheetState;", "BottomSheetScaffoldState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/ui/unit/Density;", "density", "confirmValueChange", "BottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/ui/unit/Density;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material/BottomSheetState;", "rememberBottomSheetState", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/DrawerState;", "drawerState", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "Landroidx/compose/material/BottomSheetScaffoldState;", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material/BottomSheetScaffoldState;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "topBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material/FabPosition;", "floatingActionButtonPosition", "sheetGesturesEnabled", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/unit/Dp;", "sheetElevation", "Landroidx/compose/ui/graphics/Color;", "sheetBackgroundColor", "sheetContentColor", "sheetPeekHeight", "drawerContent", "drawerGesturesEnabled", "drawerShape", "drawerElevation", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-bGncdBI", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material/BottomSheetScaffoldState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLandroidx/compose/ui/graphics/Shape;FJJFLkotlin/jvm/functions/Function3;ZLandroidx/compose/ui/graphics/Shape;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;IIII)V", "BottomSheetScaffold", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "sheetSize", "", "calculateAnchors", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/material/BottomSheetState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/Shape;FJJLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "innerPadding", "body", "", "layoutHeight", "bottomSheet", "sheetOffset", "sheetState", OperatorName.CURVE_TO, "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FILkotlin/jvm/functions/Function0;Landroidx/compose/material/BottomSheetState;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "d", "(Landroidx/compose/material/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/material/BottomSheetState;Lkotlinx/coroutines/CoroutineScope;)Landroidx/compose/material/AnchoredDraggableState$AnchorChangedCallback;", "F", "FabSpacing", "BottomSheetScaffoldPositionalThreshold", "BottomSheetScaffoldVelocityThreshold", "material_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,748:1\n76#2:749\n76#2:767\n76#2:776\n25#3:750\n67#3,3:757\n66#3:760\n50#3:768\n49#3:769\n25#3:782\n50#3:793\n49#3:794\n83#3,3:801\n1097#4,6:751\n1097#4,6:761\n1097#4,6:770\n1097#4,3:783\n1100#4,3:789\n1097#4,6:795\n1097#4,6:804\n1#5:777\n486#6,4:778\n490#6,2:786\n494#6:792\n486#7:788\n154#8:810\n154#8:811\n154#8:812\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldKt\n*L\n309#1:749\n442#1:767\n448#1:776\n354#1:750\n356#1:757,3\n356#1:760\n443#1:768\n443#1:769\n537#1:782\n538#1:793\n538#1:794\n613#1:801,3\n354#1:751,6\n356#1:761,6\n443#1:770,6\n537#1:783,3\n537#1:789,3\n538#1:795,6\n613#1:804,6\n537#1:778,4\n537#1:786,2\n537#1:792\n537#1:788\n746#1:810\n747#1:811\n748#1:812\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {

    /* renamed from: a */
    public static final float f14381a = C3641Dp.m73658constructorimpl(16);

    /* renamed from: b */
    public static final float f14382b = C3641Dp.m73658constructorimpl(56);

    /* renamed from: c */
    public static final float f14383c = C3641Dp.m73658constructorimpl(125);

    /* JADX WARN: Removed duplicated region for block: B:100:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:382:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_]]")
    /* renamed from: BottomSheetScaffold-bGncdBI  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m69931BottomSheetScaffoldbGncdBI(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r42, @org.jetbrains.annotations.Nullable androidx.compose.material.BottomSheetScaffoldState r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, int r47, boolean r48, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r49, float r50, long r51, long r53, float r55, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r56, boolean r57, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r58, float r59, long r60, long r62, long r64, long r66, long r68, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r70, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r71, int r72, int r73, int r74, int r75) {
        /*
            Method dump skipped, instructions count: 1662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m69931BottomSheetScaffoldbGncdBI(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomSheetScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, float, kotlin.jvm.functions.Function3, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "BottomSheetScaffoldState(initialValue, animationSpec, confirmStateChange)", imports = {}))
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState BottomSheetScaffoldState(@NotNull BottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        return new BottomSheetState(initialValue, animationSpec, confirmStateChange);
    }

    public static /* synthetic */ BottomSheetState BottomSheetScaffoldState$default(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        return BottomSheetScaffoldState(bottomSheetValue, animationSpec, function1);
    }

    @Stable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState BottomSheetState(@NotNull BottomSheetValue initialValue, @NotNull Density density, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        BottomSheetState bottomSheetState = new BottomSheetState(initialValue, animationSpec, confirmValueChange);
        bottomSheetState.setDensity$material_release(density);
        return bottomSheetState;
    }

    public static /* synthetic */ BottomSheetState BottomSheetState$default(BottomSheetValue bottomSheetValue, Density density, AnimationSpec animationSpec, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i & 8) != 0) {
            function1 = BottomSheetScaffoldKt$BottomSheetState$1.INSTANCE;
        }
        return BottomSheetState(bottomSheetValue, density, animationSpec, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m60941a(androidx.compose.material.BottomSheetState r27, boolean r28, kotlin.jvm.functions.Function1 r29, androidx.compose.p003ui.graphics.Shape r30, float r31, long r32, long r34, androidx.compose.p003ui.Modifier r36, kotlin.jvm.functions.Function3 r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt.m60941a(androidx.compose.material.BottomSheetState, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.graphics.Shape, float, long, long, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: b */
    public static final AnchoredDraggableState.AnchorChangedCallback m60940b(final BottomSheetState bottomSheetState, final CoroutineScope coroutineScope) {
        return new AnchoredDraggableState.AnchorChangedCallback() { // from class: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeCallback$1

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* loaded from: classes.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[BottomSheetValue.values().length];
                    try {
                        iArr[BottomSheetValue.Collapsed.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BottomSheetValue.Expanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material.AnchoredDraggableState.AnchorChangedCallback
            /* renamed from: a */
            public final void onAnchorsChanged(BottomSheetValue prevTarget, Map prevAnchors, Map newAnchors) {
                BottomSheetValue bottomSheetValue;
                Intrinsics.checkNotNullParameter(prevTarget, "prevTarget");
                Intrinsics.checkNotNullParameter(prevAnchors, "prevAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = (Float) prevAnchors.get(prevTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[prevTarget.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        bottomSheetValue = BottomSheetValue.Expanded;
                        if (!newAnchors.containsKey(bottomSheetValue)) {
                            bottomSheetValue = BottomSheetValue.Collapsed;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    bottomSheetValue = BottomSheetValue.Collapsed;
                }
                if (!Intrinsics.areEqual(((Number) AbstractC11687a.getValue(newAnchors, bottomSheetValue)).floatValue(), f)) {
                    if (BottomSheetState.this.isAnimationRunning$material_release()) {
                        AbstractC1552Vc.m65753e(coroutineScope, null, null, new C3083x87c90c56(BottomSheetState.this, bottomSheetValue, null), 3, null);
                    } else if (!BottomSheetState.this.trySnapTo$material_release(bottomSheetValue)) {
                        AbstractC1552Vc.m65753e(coroutineScope, null, null, new C3084x87c90c57(BottomSheetState.this, bottomSheetValue, null), 3, null);
                    }
                }
            }
        };
    }

    /* renamed from: c */
    public static final void m60939c(Function2 function2, Function3 function3, Function3 function32, Function2 function22, Function2 function23, float f, int i, Function0 function0, BottomSheetState bottomSheetState, Composer composer, int i2) {
        Composer composer2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1621720523);
        int i4 = (i2 & 14) == 0 ? (startRestartGroup.changedInstance(function2) ? 4 : 2) | i2 : i2;
        if ((i2 & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= startRestartGroup.changedInstance(function32) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
        }
        if ((i2 & 3670016) == 0) {
            i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        if ((i2 & 234881024) == 0) {
            i4 |= startRestartGroup.changed(bottomSheetState) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        if ((i4 & 191739611) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1621720523, i4, -1, "androidx.compose.material.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:601)");
            }
            Object[] objArr = {function32, function0, function2, function3, C3641Dp.m73656boximpl(f), function22, FabPosition.m70028boximpl(i), function23, bottomSheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i5 = 0;
            boolean z = false;
            for (int i6 = 9; i5 < i6; i6 = 9) {
                z |= startRestartGroup.changed(objArr[i5]);
                i5++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
                i3 = 0;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, function2, function22, i, f, function23, bottomSheetState, function32, i4, function3);
                composer2.updateRememberedValue(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1);
                rememberedValue = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;
            } else {
                composer2 = startRestartGroup;
                i3 = 0;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, composer2, i3, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(function2, function3, function32, function22, function23, f, i, function0, bottomSheetState, i2));
    }

    /* renamed from: d */
    public static final NestedScrollConnection m60938d(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new C3088x7deaba9e(anchoredDraggableState, orientation);
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable DrawerState drawerState, @Nullable BottomSheetState bottomSheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1353009744);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.rememberDrawerState(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            bottomSheetState = rememberBottomSheetState(BottomSheetValue.Collapsed, null, null, composer, 6, 6);
        }
        if ((i2 & 4) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1353009744, i, -1, "androidx.compose.material.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:350)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(drawerState) | composer.changed(bottomSheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(drawerState, bottomSheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        BottomSheetScaffoldState bottomSheetScaffoldState = (BottomSheetScaffoldState) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetScaffoldState;
    }

    @Composable
    @ExperimentalMaterialApi
    @NotNull
    public static final BottomSheetState rememberBottomSheetState(@NotNull BottomSheetValue initialValue, @Nullable AnimationSpec<Float> animationSpec, @Nullable Function1<? super BottomSheetValue, Boolean> function1, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        composer.startReplaceableGroup(1808153344);
        if ((i2 & 2) != 0) {
            animationSpec = SwipeableDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i2 & 4) != 0) {
            function1 = BottomSheetScaffoldKt$rememberBottomSheetState$1.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1808153344, i, -1, "androidx.compose.material.rememberBottomSheetState (BottomSheetScaffold.kt:303)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        BottomSheetState bottomSheetState = (BottomSheetState) RememberSaveableKt.m71406rememberSaveable(new Object[]{animationSpec}, BottomSheetState.Companion.Saver(animationSpec, function1, density), (String) null, (Function0<? extends Object>) new BottomSheetScaffoldKt$rememberBottomSheetState$2(initialValue, density, animationSpec, function1), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bottomSheetState;
    }
}
