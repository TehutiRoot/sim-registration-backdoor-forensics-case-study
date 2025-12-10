package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC11687a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0002\u0010 \u001a\u00020\u00022\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00032\u0019\b\u0002\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\u0017\u0010\u001d\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010$\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020\u0018H\u0007¢\u0006\u0004\b$\u0010%\u001a9\u0010*\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020&2\u0014\b\u0002\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00150\u00002\b\b\u0002\u0010)\u001a\u00020\u0015H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0090\u0001\u00104\u001a\u00020\u00022\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00032\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u001aÃ\u0001\u0010>\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0002\b\u00032&\u00109\u001a\"\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032&\u0010;\u001a\"\u0012\u0013\u0012\u00110:¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00020\u0013¢\u0006\u0002\b\u00032\u0006\u0010\u000b\u001a\u00020\n2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020.0\u00132\u0006\u0010=\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?\u001ax\u0010F\u001a\b\u0012\u0004\u0012\u00020&0E2\u0006\u0010,\u001a\u00020!26\u0010C\u001a2\u0012\u0013\u0012\u00110&¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(A\u0012\u0013\u0012\u00110.¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\u00020@2!\u0010D\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\bF\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006H"}, m28850d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "sheetContent", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/BottomSheetScaffoldState;", "scaffoldState", "Landroidx/compose/ui/unit/Dp;", "sheetPeekHeight", "Landroidx/compose/ui/graphics/Shape;", "sheetShape", "Landroidx/compose/ui/graphics/Color;", "sheetContainerColor", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "Lkotlin/Function0;", "sheetDragHandle", "", "sheetSwipeEnabled", "topBar", "Landroidx/compose/material3/SnackbarHostState;", "snackbarHost", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "BottomSheetScaffold-6cEcpDs", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "BottomSheetScaffold", "Landroidx/compose/material3/SheetState;", "bottomSheetState", "snackbarHostState", "rememberBottomSheetScaffoldState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "Landroidx/compose/material3/SheetValue;", "initialValue", "confirmValueChange", "skipHiddenState", "rememberStandardBottomSheetState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", RemoteConfigConstants.ResponseFieldKey.STATE, "peekHeight", "", "layoutHeight", "shape", "tonalElevation", "shadowElevation", "dragHandle", OperatorName.CURVE_TO, "(Landroidx/compose/material3/SheetState;FZFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/ParameterName;", "name", "innerPadding", "body", "", "bottomSheet", "sheetOffset", "sheetState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;FLkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;JJLandroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo", "snapTo", "Landroidx/compose/material3/AnchorChangeHandler;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material3/AnchorChangeHandler;", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n36#2:397\n25#2:404\n50#2:411\n49#2:412\n25#2:423\n50#2:436\n49#2:437\n36#2:444\n67#2,3:451\n66#2:454\n83#2,3:461\n1114#3,6:398\n1114#3,6:405\n1114#3,6:413\n1114#3,3:424\n1117#3,3:430\n1114#3,6:438\n1114#3,6:445\n1114#3,6:455\n1114#3,6:464\n474#4,4:419\n478#4,2:427\n482#4:433\n474#5:429\n76#6:434\n1#7:435\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material3/BottomSheetScaffoldKt\n*L\n123#1:397\n169#1:404\n171#1:411\n171#1:412\n210#1:423\n215#1:436\n215#1:437\n236#1:444\n253#1:451,3\n253#1:454\n329#1:461,3\n123#1:398,6\n169#1:405,6\n171#1:413,6\n210#1:424,3\n210#1:430,3\n215#1:438,6\n236#1:445,6\n253#1:455,6\n329#1:464,6\n210#1:419,4\n210#1:427,2\n210#1:433\n210#1:429\n211#1:434\n*E\n"})
/* loaded from: classes2.dex */
public final class BottomSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomSheetScaffold-6cEcpDs  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70205BottomSheetScaffold6cEcpDs(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r32, @org.jetbrains.annotations.Nullable androidx.compose.material3.BottomSheetScaffoldState r33, float r34, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r35, long r36, long r38, float r40, float r41, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, boolean r43, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, long r46, long r48, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r50, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetScaffoldKt.m70205BottomSheetScaffold6cEcpDs(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material3.BottomSheetScaffoldState, float, androidx.compose.ui.graphics.Shape, long, long, float, float, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final AnchorChangeHandler m60696a(final SheetState sheetState, final Function2 function2, final Function1 function1) {
        return new AnchorChangeHandler() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldAnchorChangeHandler$1

            @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[SheetValue.values().length];
                    try {
                        iArr[SheetValue.Hidden.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[SheetValue.PartiallyExpanded.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[SheetValue.Expanded.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // androidx.compose.material3.AnchorChangeHandler
            /* renamed from: a */
            public final void onAnchorsChanged(SheetValue previousTarget, Map previousAnchors, Map newAnchors) {
                SheetValue sheetValue;
                Intrinsics.checkNotNullParameter(previousTarget, "previousTarget");
                Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
                Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
                Float f = (Float) previousAnchors.get(previousTarget);
                int i = WhenMappings.$EnumSwitchMapping$0[previousTarget.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        sheetValue = SheetValue.Expanded;
                        if (!newAnchors.containsKey(sheetValue)) {
                            sheetValue = SheetValue.PartiallyExpanded;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    sheetValue = SheetValue.PartiallyExpanded;
                }
                if (!Intrinsics.areEqual(((Number) AbstractC11687a.getValue(newAnchors, sheetValue)).floatValue(), f)) {
                    if (SheetState.this.getSwipeableState$material3_release().isAnimationRunning()) {
                        function2.invoke(sheetValue, Float.valueOf(SheetState.this.getSwipeableState$material3_release().getLastVelocity()));
                    } else {
                        function1.invoke(sheetValue);
                    }
                }
            }
        };
    }

    /* renamed from: b */
    public static final void m60695b(Modifier modifier, Function2 function2, Function3 function3, Function3 function32, Function2 function22, float f, Function0 function0, SheetState sheetState, long j, long j2, Composer composer, int i) {
        int i2;
        Composer composer2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1120561936);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changedInstance(function3)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changedInstance(function32)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changedInstance(function22)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(f)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((i & 3670016) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((i & 29360128) == 0) {
            if (startRestartGroup.changed(sheetState)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((i & 234881024) == 0) {
            if (startRestartGroup.changed(j)) {
                i4 = 67108864;
            } else {
                i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
            }
            i2 |= i4;
        }
        if ((i & 1879048192) == 0) {
            if (startRestartGroup.changed(j2)) {
                i3 = PKIFailureInfo.duplicateCertReq;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if ((i2 & 1533916891) == 306783378 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1120561936, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:316)");
            }
            int i13 = i2;
            Object[] objArr = {function32, function0, function2, modifier, Color.m71725boximpl(j), Color.m71725boximpl(j2), function3, C3641Dp.m73656boximpl(f), function22, sheetState};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z = false;
            for (int i14 = 0; i14 < 10; i14++) {
                z |= startRestartGroup.changed(objArr[i14]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!z && rememberedValue != Composer.Companion.getEmpty()) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 = new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(function0, function2, function22, sheetState, function32, i13, modifier, j, j2, function3, f);
                composer2.updateRememberedValue(bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1);
                rememberedValue = bottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) rememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new BottomSheetScaffoldKt$BottomSheetScaffoldLayout$2(modifier, function2, function3, function32, function22, f, function0, sheetState, j, j2, i));
        }
    }

    /* renamed from: c */
    public static final void m60694c(SheetState sheetState, float f, boolean z, float f2, Shape shape, long j, long j2, float f3, float f4, Function2 function2, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-763942484);
        if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((i & 234881024) == 0) {
            i3 |= startRestartGroup.changed(f4) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        if ((i & 1879048192) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 14) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763942484, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:196)");
            }
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
            float mo69438toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo69438toPx0680j_4(f);
            int i5 = i3;
            Orientation orientation = Orientation.Vertical;
            int i6 = i4;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(sheetState) | startRestartGroup.changed(coroutineScope);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = m60696a(sheetState, new C3241x2ac34721(coroutineScope, sheetState), new C3243x2ac34722(coroutineScope, sheetState));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            AnchorChangeHandler anchorChangeHandler = (AnchorChangeHandler) rememberedValue2;
            Modifier m69555requiredHeightInVpY3zN4$default = SizeKt.m69555requiredHeightInVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m69571widthInVpY3zN4$default(Modifier.Companion, 0.0f, SheetDefaultsKt.getBottomSheetMaxWidth(), 1, null), 0.0f, 1, null), f, 0.0f, 2, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release = sheetState.getSwipeableState$material3_release();
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(swipeableState$material3_release);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new BottomSheetScaffoldKt$StandardBottomSheet$1$1(coroutineScope, sheetState));
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier swipeableV2$default = SwipeableV2Kt.swipeableV2$default(NestedScrollModifierKt.nestedScroll$default(m69555requiredHeightInVpY3zN4$default, (NestedScrollConnection) rememberedValue3, null, 2, null), sheetState.getSwipeableState$material3_release(), orientation, z, false, null, 24, null);
            SwipeableV2State<SheetValue> swipeableState$material3_release2 = sheetState.getSwipeableState$material3_release();
            Set of = DG1.setOf((Object[]) new SheetValue[]{SheetValue.Hidden, SheetValue.PartiallyExpanded, SheetValue.Expanded});
            Float valueOf = Float.valueOf(f2);
            Float valueOf2 = Float.valueOf(mo69438toPx0680j_4);
            startRestartGroup.startReplaceableGroup(1618982084);
            boolean changed3 = startRestartGroup.changed(valueOf) | startRestartGroup.changed(sheetState) | startRestartGroup.changed(valueOf2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new BottomSheetScaffoldKt$StandardBottomSheet$2$1(sheetState, f2, mo69438toPx0680j_4);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            int i7 = i5 >> 9;
            SurfaceKt.m70628SurfaceT9BRK9s(SwipeableV2Kt.swipeAnchors(swipeableV2$default, swipeableState$material3_release2, of, anchorChangeHandler, (Function2) rememberedValue4), shape, j, j2, f3, f4, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1381492089, true, new BottomSheetScaffoldKt$StandardBottomSheet$3(function2, function3, i6, sheetState, z, coroutineScope, i5)), startRestartGroup, (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (i7 & 57344) | (i7 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BottomSheetScaffoldKt$StandardBottomSheet$4(sheetState, f, z, f2, shape, j, j2, f3, f4, function2, function3, i, i2));
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public static final BottomSheetScaffoldState rememberBottomSheetScaffoldState(@Nullable SheetState sheetState, @Nullable SnackbarHostState snackbarHostState, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1474606134);
        if ((i2 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
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
            ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:166)");
        }
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(sheetState) | composer.changed(snackbarHostState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new BottomSheetScaffoldState(sheetState, snackbarHostState);
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
    @ExperimentalMaterial3Api
    @NotNull
    public static final SheetState rememberStandardBottomSheetState(@Nullable SheetValue sheetValue, @Nullable Function1<? super SheetValue, Boolean> function1, boolean z, @Nullable Composer composer, int i, int i2) {
        boolean z2;
        composer.startReplaceableGroup(678511581);
        if ((i2 & 1) != 0) {
            sheetValue = SheetValue.PartiallyExpanded;
        }
        SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            function1 = BottomSheetScaffoldKt$rememberStandardBottomSheetState$1.INSTANCE;
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if ((i2 & 4) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:188)");
        }
        SheetState rememberSheetState = SheetDefaultsKt.rememberSheetState(false, function12, sheetValue2, z2, composer, (i & 112) | 6 | ((i << 6) & 896) | ((i << 3) & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberSheetState;
    }
}
