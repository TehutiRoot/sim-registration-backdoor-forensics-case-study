package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.ViewConfiguration;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001ax\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0096\u0001\u0010\u001a\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a~\u0010#\u001a\u00020\u00012\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000fH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a0\u0010&\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\n2\u0011\u0010\u0010\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001aT\u0010(\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u0002H\u0003¢\u0006\u0004\b(\u0010)\u001a#\u0010-\u001a\u00020\u0004*\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.\u001a!\u00101\u001a\u00020\u0004*\u00020\u00042\f\u00100\u001a\b\u0012\u0004\u0012\u00020*0/H\u0002¢\u0006\u0004\b1\u00102\"\u0017\u00104\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u00103\"\u001d\u00107\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b(\u00103\u001a\u0004\b5\u00106\"\u001d\u00109\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b#\u00103\u001a\u0004\b8\u00106\"\u0017\u0010:\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b1\u00103\"\u0017\u0010;\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b-\u00103\"\u0017\u0010=\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b<\u00103\"\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@\"\u0017\u0010C\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bB\u00103\"\u001d\u0010F\u001a\u00020 8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bD\u00103\u001a\u0004\bE\u00106\"\u0017\u0010H\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u00103\"\u0017\u0010J\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bI\u00103\"\u0017\u0010L\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bK\u00103\"\u0017\u0010N\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u00103\"\u0017\u0010P\u001a\u00020 8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u00103\"\u0014\u0010R\u001a\u00020Q8\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010S\"\u0014\u0010U\u001a\u00020T8\u0000X\u0080T¢\u0006\u0006\n\u0004\bU\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006W"}, m29142d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "tooltip", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/PlainTooltipState;", "tooltipState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipBoxScope;", "Lkotlin/ExtensionFunctionType;", "content", "PlainTooltipBox-nBX6wN0", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/PlainTooltipState;Landroidx/compose/ui/graphics/Shape;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PlainTooltipBox", TextBundle.TEXT_ENTRY, "Landroidx/compose/material3/RichTooltipState;", MessageBundle.TITLE_ENTRY, "action", "Landroidx/compose/material3/RichTooltipColors;", "colors", "RichTooltipBox", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RichTooltipState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "tooltipContent", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltipPositionProvider", "Landroidx/compose/material3/TooltipState;", "Landroidx/compose/ui/unit/Dp;", "elevation", "maxWidth", OperatorName.CURVE_TO, "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TooltipState;JFFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "textColor", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "subheadExists", "actionExists", "e", "(Landroidx/compose/ui/Modifier;ZZ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/animation/core/Transition;", "transition", "d", "(Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/Transition;)Landroidx/compose/ui/Modifier;", "F", "TooltipAnchorPadding", "getTooltipMinHeight", "()F", "TooltipMinHeight", "getTooltipMinWidth", "TooltipMinWidth", "PlainTooltipMaxWidth", "PlainTooltipVerticalPadding", OperatorName.FILL_NON_ZERO, "PlainTooltipHorizontalPadding", "Landroidx/compose/foundation/layout/PaddingValues;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/foundation/layout/PaddingValues;", "PlainTooltipContentPadding", OperatorName.CLOSE_PATH, "RichTooltipMaxWidth", "i", "getRichTooltipHorizontalPadding", "RichTooltipHorizontalPadding", OperatorName.SET_LINE_JOINSTYLE, "HeightToSubheadFirstLine", OperatorName.NON_STROKING_CMYK, "HeightFromSubheadToTextFirstLine", OperatorName.LINE_TO, "TextBottomPadding", OperatorName.MOVE_TO, "ActionLabelMinHeight", OperatorName.ENDPATH, "ActionLabelBottomPadding", "", "TooltipDuration", OperatorName.SET_LINE_CAPSTYLE, "", "TooltipFadeInDuration", "I", "material3_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,770:1\n25#2:771\n25#2:780\n25#2:788\n25#2:796\n50#2:803\n49#2:804\n25#2:815\n25#2:826\n460#2,13:853\n473#2,3:867\n460#2,13:891\n473#2,3:905\n460#2,13:929\n460#2,13:962\n473#2,3:976\n460#2,13:1000\n473#2,3:1014\n460#2,13:1038\n473#2,3:1052\n473#2,3:1057\n1114#3,6:772\n1114#3,6:781\n1114#3,6:789\n1114#3,6:797\n1114#3,6:805\n1114#3,3:816\n1117#3,3:822\n1114#3,6:827\n76#4:778\n76#4:795\n76#4:841\n76#4:879\n76#4:917\n76#4:950\n76#4:988\n76#4:1026\n1#5:779\n154#6:787\n154#6:1063\n154#6:1064\n154#6:1065\n154#6:1066\n154#6:1067\n154#6:1068\n154#6:1069\n154#6:1070\n154#6:1071\n154#6:1072\n154#6:1073\n154#6:1074\n154#6:1075\n474#7,4:811\n478#7,2:819\n482#7:825\n474#8:821\n66#9,7:833\n73#9:866\n77#9:871\n67#9,6:872\n73#9:904\n77#9:909\n67#9,6:943\n73#9:975\n77#9:980\n67#9,6:981\n73#9:1013\n77#9:1018\n67#9,6:1019\n73#9:1051\n77#9:1056\n75#10:840\n76#10,11:842\n89#10:870\n75#10:878\n76#10,11:880\n89#10:908\n75#10:916\n76#10,11:918\n75#10:949\n76#10,11:951\n89#10:979\n75#10:987\n76#10,11:989\n89#10:1017\n75#10:1025\n76#10,11:1027\n89#10:1055\n89#10:1060\n74#11,6:910\n80#11:942\n84#11:1061\n135#12:1062\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n98#1:771\n105#1:780\n152#1:788\n160#1:796\n162#1:803\n162#1:804\n200#1:815\n203#1:826\n246#1:853,13\n246#1:867,3\n285#1:891,13\n285#1:905,3\n309#1:929,13\n313#1:962,13\n313#1:976,3\n323#1:1000,13\n323#1:1014,3\n333#1:1038,13\n333#1:1052,3\n309#1:1057,3\n98#1:772,6\n105#1:781,6\n152#1:789,6\n160#1:797,6\n162#1:805,6\n200#1:816,3\n200#1:822,3\n203#1:827,6\n104#1:778\n159#1:795\n246#1:841\n285#1:879\n309#1:917\n313#1:950\n323#1:988\n333#1:1026\n119#1:787\n752#1:1063\n753#1:1064\n754#1:1065\n755#1:1066\n756#1:1067\n757#1:1068\n760#1:1069\n761#1:1070\n762#1:1071\n763#1:1072\n764#1:1073\n765#1:1074\n766#1:1075\n200#1:811,4\n200#1:819,2\n200#1:825\n200#1:821\n246#1:833,7\n246#1:866\n246#1:871\n285#1:872,6\n285#1:904\n285#1:909\n313#1:943,6\n313#1:975\n313#1:980\n323#1:981,6\n323#1:1013\n323#1:1018\n333#1:1019,6\n333#1:1051\n333#1:1056\n246#1:840\n246#1:842,11\n246#1:870\n285#1:878\n285#1:880,11\n285#1:908\n309#1:916\n309#1:918,11\n313#1:949\n313#1:951,11\n313#1:979\n323#1:987\n323#1:989,11\n323#1:1017\n333#1:1025\n333#1:1027,11\n333#1:1055\n309#1:1060\n309#1:910,6\n309#1:942\n309#1:1061\n696#1:1062\n*E\n"})
/* loaded from: classes2.dex */
public final class TooltipKt {
    public static final long TooltipDuration = 1500;
    public static final int TooltipFadeInDuration = 150;

    /* renamed from: a */
    public static final float f26566a;

    /* renamed from: b */
    public static final float f26567b;

    /* renamed from: c */
    public static final float f26568c = C3623Dp.m73842constructorimpl(40);

    /* renamed from: d */
    public static final float f26569d = C3623Dp.m73842constructorimpl(200);

    /* renamed from: e */
    public static final float f26570e;

    /* renamed from: f */
    public static final float f26571f;

    /* renamed from: g */
    public static final PaddingValues f26572g;

    /* renamed from: h */
    public static final float f26573h;

    /* renamed from: i */
    public static final float f26574i;

    /* renamed from: j */
    public static final float f26575j;

    /* renamed from: k */
    public static final float f26576k;

    /* renamed from: l */
    public static final float f26577l;

    /* renamed from: m */
    public static final float f26578m;

    /* renamed from: n */
    public static final float f26579n;

    static {
        float f = 4;
        f26566a = C3623Dp.m73842constructorimpl(f);
        float f2 = 24;
        f26567b = C3623Dp.m73842constructorimpl(f2);
        float m73842constructorimpl = C3623Dp.m73842constructorimpl(f);
        f26570e = m73842constructorimpl;
        float f3 = 8;
        float m73842constructorimpl2 = C3623Dp.m73842constructorimpl(f3);
        f26571f = m73842constructorimpl2;
        f26572g = PaddingKt.m69707PaddingValuesYgX7TsA(m73842constructorimpl2, m73842constructorimpl);
        f26573h = C3623Dp.m73842constructorimpl(320);
        float f4 = 16;
        f26574i = C3623Dp.m73842constructorimpl(f4);
        f26575j = C3623Dp.m73842constructorimpl(28);
        f26576k = C3623Dp.m73842constructorimpl(f2);
        f26577l = C3623Dp.m73842constructorimpl(f4);
        f26578m = C3623Dp.m73842constructorimpl(36);
        f26579n = C3623Dp.m73842constructorimpl(f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x011b, code lost:
        if ((r35 & 32) != 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: PlainTooltipBox-nBX6wN0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70989PlainTooltipBoxnBX6wN0(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.material3.PlainTooltipState r26, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r27, long r28, long r30, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.material3.TooltipBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.m70989PlainTooltipBoxnBX6wN0(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.PlainTooltipState, androidx.compose.ui.graphics.Shape, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RichTooltipBox(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r30, @org.jetbrains.annotations.Nullable androidx.compose.material3.RichTooltipState r31, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r33, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r34, @org.jetbrains.annotations.Nullable androidx.compose.material3.RichTooltipColors r35, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.material3.TooltipBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TooltipKt.RichTooltipBox(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.RichTooltipState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.RichTooltipColors, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: a */
    public static final void m60363a(long j, Function2 function2, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(893340370);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(j)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
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
                ComposerKt.traceEventStart(893340370, i2, -1, "androidx.compose.material3.PlainTooltipImpl (Tooltip.kt:280)");
            }
            Modifier padding = PaddingKt.padding(Modifier.Companion, f26572g);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
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
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(j)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function2, startRestartGroup, (i2 & 112) | 8);
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
            endRestartGroup.updateScope(new TooltipKt$PlainTooltipImpl$2(j, function2, i));
        }
    }

    /* renamed from: b */
    public static final void m60362b(RichTooltipColors richTooltipColors, Function2 function2, Function2 function22, Function2 function23, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-878950288);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(richTooltipColors) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-878950288, i2, -1, "androidx.compose.material3.RichTooltipImpl (Tooltip.kt:296)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(startRestartGroup, 6);
            RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
            TextStyle fromToken = TypographyKt.fromToken(typography, richTooltipTokens.getActionLabelTextFont());
            TextStyle fromToken2 = TypographyKt.fromToken(materialTheme.getTypography(startRestartGroup, 6), richTooltipTokens.getSubheadFont());
            TextStyle fromToken3 = TypographyKt.fromToken(materialTheme.getTypography(startRestartGroup, 6), richTooltipTokens.getSupportingTextFont());
            Modifier.Companion companion = Modifier.Companion;
            Modifier m69715paddingVpY3zN4$default = PaddingKt.m69715paddingVpY3zN4$default(companion, f26574i, 0.0f, 2, null);
            startRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(m69715paddingVpY3zN4$default);
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
            startRestartGroup.startReplaceableGroup(51873568);
            if (function22 != null) {
                Modifier m69650paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m69650paddingFromBaselineVpY3zN4$default(companion, f26575j, 0.0f, 2, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf2 = LayoutKt.materializerOf(m69650paddingFromBaselineVpY3zN4$default);
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
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(richTooltipColors.m70700getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken2)}, function22, startRestartGroup, 8);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m60359e = m60359e(companion, function22 != null, function23 != null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf3 = LayoutKt.materializerOf(m60359e);
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
            Composer m71577constructorimpl3 = Updater.m71577constructorimpl(startRestartGroup);
            Updater.m71584setimpl(m71577constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl3, density3, companion3.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl3, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl3, viewConfiguration3, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(richTooltipColors.m70699getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken3)}, function2, startRestartGroup, (i2 & 112) | 8);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(75391440);
            if (function23 != null) {
                Modifier m69717paddingqDBjuR0$default = PaddingKt.m69717paddingqDBjuR0$default(SizeKt.m69739requiredHeightInVpY3zN4$default(companion, f26578m, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, f26579n, 7, null);
                startRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf4 = LayoutKt.materializerOf(m69717paddingqDBjuR0$default);
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
                Composer m71577constructorimpl4 = Updater.m71577constructorimpl(startRestartGroup);
                Updater.m71584setimpl(m71577constructorimpl4, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m71584setimpl(m71577constructorimpl4, density4, companion3.getSetDensity());
                Updater.m71584setimpl(m71577constructorimpl4, layoutDirection4, companion3.getSetLayoutDirection());
                Updater.m71584setimpl(m71577constructorimpl4, viewConfiguration4, companion3.getSetViewConfiguration());
                startRestartGroup.enableReusing();
                materializerOf4.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m71909boximpl(richTooltipColors.m70697getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken)}, function23, startRestartGroup, 8);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
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
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new TooltipKt$RichTooltipImpl$2(richTooltipColors, function2, function22, function23, i));
    }

    /* renamed from: c */
    public static final void m60361c(Function2 function2, PopupPositionProvider popupPositionProvider, Modifier modifier, Shape shape, final TooltipState tooltipState, long j, float f, float f2, Function3 function3, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1415647894);
        if ((i & 14) == 0) {
            if (startRestartGroup.changedInstance(function2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(popupPositionProvider)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 896) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 7168) == 0) {
            if (startRestartGroup.changed(shape)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((57344 & i) == 0) {
            if (startRestartGroup.changed(tooltipState)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((458752 & i) == 0) {
            if (startRestartGroup.changed(j)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((3670016 & i) == 0) {
            if (startRestartGroup.changed(f)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((29360128 & i) == 0) {
            if (startRestartGroup.changed(f2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        if ((234881024 & i) == 0) {
            if (startRestartGroup.changedInstance(function3)) {
                i3 = 67108864;
            } else {
                i3 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
            }
            i2 |= i3;
        }
        if ((191739611 & i2) == 38347922 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415647894, i2, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:188)");
            }
            startRestartGroup.startReplaceableGroup(773894976);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            Strings.Companion companion2 = Strings.Companion;
            final String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(companion2.m70801getTooltipLongPressLabeladMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new TooltipBoxScope() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1
                    @Override // androidx.compose.material3.TooltipBoxScope
                    @NotNull
                    public Modifier tooltipAnchor(@NotNull Modifier modifier2) {
                        Intrinsics.checkNotNullParameter(modifier2, "<this>");
                        TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1 = new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1(coroutineScope, TooltipState.this);
                        return SemanticsModifierKt.semantics(SuspendingPointerInputFilterKt.pointerInput(modifier2, TooltipState.this, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1(tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1, null)), true, new TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$2(m70803getStringNWtq28, tooltipKt$TooltipBox$scope$1$1$tooltipAnchor$onLongPress$1));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            TooltipKt$TooltipBox$scope$1$1 tooltipKt$TooltipBox$scope$1$1 = (TooltipKt$TooltipBox$scope$1$1) rememberedValue2;
            startRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(companion3);
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
            Updater.m71584setimpl(m71577constructorimpl, rememberBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m71584setimpl(m71577constructorimpl, density, companion4.getSetDensity());
            Updater.m71584setimpl(m71577constructorimpl, layoutDirection, companion4.getSetLayoutDirection());
            Updater.m71584setimpl(m71577constructorimpl, viewConfiguration, companion4.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m71568boximpl(SkippableUpdater.m71569constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(tooltipState.isVisible()), "Tooltip transition", startRestartGroup, 48, 0);
            startRestartGroup.startReplaceableGroup(-1995827526);
            if (((Boolean) updateTransition.getCurrentState()).booleanValue() || ((Boolean) updateTransition.getTargetState()).booleanValue()) {
                TooltipPopup_androidKt.TooltipPopup(popupPositionProvider, new TooltipKt$TooltipBox$1$1(tooltipState, coroutineScope), ComposableLambdaKt.composableLambda(startRestartGroup, -442150991, true, new TooltipKt$TooltipBox$1$2(modifier, f2, updateTransition, Strings_androidKt.m70803getStringNWtq28(companion2.m70802getTooltipPaneDescriptionadMyvUU(), startRestartGroup, 6), shape, j, f, function2, i2)), startRestartGroup, ((i2 >> 3) & 14) | 384);
            }
            startRestartGroup.endReplaceableGroup();
            function3.invoke(tooltipKt$TooltipBox$scope$1$1, startRestartGroup, Integer.valueOf(((i2 >> 21) & 112) | 6));
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
            endRestartGroup.updateScope(new TooltipKt$TooltipBox$2(function2, popupPositionProvider, modifier, shape, tooltipState, j, f, f2, function3, i));
        }
    }

    /* renamed from: d */
    public static final Modifier m60360d(Modifier modifier, Transition transition) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1(transition);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TooltipKt$animateTooltip$2(transition));
    }

    /* renamed from: e */
    public static final Modifier m60359e(Modifier modifier, boolean z, boolean z2) {
        if (!z && !z2) {
            return PaddingKt.m69715paddingVpY3zN4$default(modifier, 0.0f, f26570e, 1, null);
        }
        return PaddingKt.m69717paddingqDBjuR0$default(AlignmentLineKt.m69650paddingFromBaselineVpY3zN4$default(modifier, f26576k, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, f26577l, 7, null);
    }

    public static final float getRichTooltipHorizontalPadding() {
        return f26574i;
    }

    public static final float getTooltipMinHeight() {
        return f26567b;
    }

    public static final float getTooltipMinWidth() {
        return f26568c;
    }
}