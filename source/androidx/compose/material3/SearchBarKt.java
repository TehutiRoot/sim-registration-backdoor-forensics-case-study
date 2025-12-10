package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.focus.FocusChangedModifierKt;
import androidx.compose.p003ui.focus.FocusRequester;
import androidx.compose.p003ui.focus.FocusRequesterModifierKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.Hyphens;
import androidx.compose.p003ui.text.style.LineBreak;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.feitian.readerdk.Tool.C6150DK;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m28851d1 = {"\u0000\u008c\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008a\u0002\u0010 \u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0080\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\u001aÈ\u0001\u0010%\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0014\u001a\u00020$2\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b%\u0010&\"\u001d\u0010*\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010'\u0012\u0004\b(\u0010)\"\u001d\u0010.\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010-\"\u001d\u00101\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b0\u0010-\"\u0017\u00103\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b2\u0010'\"\u001d\u00106\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010-\"\u0017\u00108\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b7\u0010'\"\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010>\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;\"\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\"\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010B\"\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020F0?8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u0010B\"\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020F0?8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bI\u0010B\"\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M\"\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006S"}, m28850d2 = {"", SearchIntents.EXTRA_QUERY, "Lkotlin/Function1;", "", "onQueryChange", "onSearch", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "onActiveChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "SearchBar-Id_Pb_0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "DockedSearchBar-rpjkMjA", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar", "Landroidx/compose/material3/TextFieldColors;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "F", "getSearchBarCornerRadius$annotations", "()V", "SearchBarCornerRadius", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDockedActiveTableMinHeight", "()F", "DockedActiveTableMinHeight", OperatorName.CURVE_TO, "getSearchBarMinWidth", "SearchBarMinWidth", "d", "SearchBarMaxWidth", "e", "getSearchBarVerticalPadding", "SearchBarVerticalPadding", OperatorName.FILL_NON_ZERO, "SearchBarIconOffsetX", "Landroidx/compose/animation/core/CubicBezierEasing;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/animation/core/CubicBezierEasing;", "AnimationEnterEasing", OperatorName.CLOSE_PATH, "AnimationExitEasing", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "i", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "AnimationEnterFloatSpec", OperatorName.SET_LINE_JOINSTYLE, "AnimationExitFloatSpec", "Landroidx/compose/ui/unit/IntSize;", OperatorName.NON_STROKING_CMYK, "AnimationEnterSizeSpec", OperatorName.LINE_TO, "AnimationExitSizeSpec", "Landroidx/compose/animation/EnterTransition;", OperatorName.MOVE_TO, "Landroidx/compose/animation/EnterTransition;", "DockedEnterTransition", "Landroidx/compose/animation/ExitTransition;", OperatorName.ENDPATH, "Landroidx/compose/animation/ExitTransition;", "DockedExitTransition", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n25#2:747\n25#2:756\n50#2:763\n49#2:764\n25#2:771\n36#2:778\n50#2:785\n49#2:786\n50#2:793\n49#2:794\n36#2:801\n25#2:808\n36#2:816\n25#2:823\n25#2:830\n36#2:840\n83#2,3:847\n50#2:857\n49#2:858\n1114#3,6:748\n1114#3,6:757\n1114#3,6:765\n1114#3,6:772\n1114#3,6:779\n1114#3,6:787\n1114#3,6:795\n1114#3,6:802\n1114#3,6:809\n1114#3,6:817\n1114#3,6:824\n1114#3,6:831\n1114#3,6:841\n1114#3,6:850\n1114#3,6:859\n76#4:754\n76#4:755\n76#4:815\n76#4:837\n76#4:856\n658#5:838\n646#5:839\n76#6:865\n75#7:866\n154#8:867\n154#8:868\n154#8:869\n154#8:870\n154#8:871\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt\n*L\n175#1:747\n188#1:756\n191#1:763\n191#1:764\n211#1:771\n212#1:778\n226#1:785\n226#1:786\n230#1:793\n230#1:794\n292#1:801\n357#1:808\n416#1:816\n435#1:823\n437#1:830\n451#1:840\n452#1:847,3\n467#1:857\n467#1:858\n175#1:748,6\n188#1:757,6\n191#1:765,6\n211#1:772,6\n212#1:779,6\n226#1:787,6\n230#1:795,6\n292#1:802,6\n357#1:809,6\n416#1:817,6\n435#1:824,6\n437#1:831,6\n451#1:841,6\n452#1:850,6\n467#1:859,6\n183#1:754\n184#1:755\n360#1:815\n440#1:837\n464#1:856\n440#1:838\n440#1:839\n188#1:865\n707#1:866\n708#1:867\n710#1:868\n711#1:869\n712#1:870\n714#1:871\n*E\n"})
/* loaded from: classes2.dex */
public final class SearchBarKt {

    /* renamed from: a */
    public static final float f25995a = C3641Dp.m73658constructorimpl(SearchBarDefaults.INSTANCE.m70524getInputFieldHeightD9Ej5fM() / 2);

    /* renamed from: b */
    public static final float f25996b = C3641Dp.m73658constructorimpl((float) C6150DK.ERROR_RECEIVE_LRC);

    /* renamed from: c */
    public static final float f25997c = C3641Dp.m73658constructorimpl(360);

    /* renamed from: d */
    public static final float f25998d = C3641Dp.m73658constructorimpl(720);

    /* renamed from: e */
    public static final float f25999e = C3641Dp.m73658constructorimpl(8);

    /* renamed from: f */
    public static final float f26000f = C3641Dp.m73658constructorimpl(4);

    /* renamed from: g */
    public static final CubicBezierEasing f26001g;

    /* renamed from: h */
    public static final CubicBezierEasing f26002h;

    /* renamed from: i */
    public static final FiniteAnimationSpec f26003i;

    /* renamed from: j */
    public static final FiniteAnimationSpec f26004j;

    /* renamed from: k */
    public static final FiniteAnimationSpec f26005k;

    /* renamed from: l */
    public static final FiniteAnimationSpec f26006l;

    /* renamed from: m */
    public static final EnterTransition f26007m;

    /* renamed from: n */
    public static final ExitTransition f26008n;

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        f26001g = easingEmphasizedDecelerateCubicBezier;
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        f26002h = cubicBezierEasing;
        TweenSpec tween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        f26003i = tween;
        TweenSpec tween2 = AnimationSpecKt.tween(350, 100, cubicBezierEasing);
        f26004j = tween2;
        TweenSpec tween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        f26005k = tween3;
        TweenSpec tween4 = AnimationSpecKt.tween(350, 100, cubicBezierEasing);
        f26006l = tween4;
        f26007m = EnterExitTransitionKt.fadeIn$default(tween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tween3, null, false, null, 14, null));
        f26008n = EnterExitTransitionKt.fadeOut$default(tween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tween4, null, false, null, 14, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0184, code lost:
        if (r6.changed(r49) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: DockedSearchBar-rpjkMjA  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70527DockedSearchBarrpjkMjA(@org.jetbrains.annotations.NotNull java.lang.String r38, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r39, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r40, boolean r41, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r42, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r43, boolean r44, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r45, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r48, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r49, float r50, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r51, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m70527DockedSearchBarrpjkMjA(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0184, code lost:
        if (r6.changed(r56) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: SearchBar-Id_Pb_0  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m70528SearchBarId_Pb_0(@org.jetbrains.annotations.NotNull java.lang.String r45, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r46, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r47, boolean r48, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r49, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.Modifier r50, boolean r51, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r54, @org.jetbrains.annotations.Nullable androidx.compose.p003ui.graphics.Shape r55, @org.jetbrains.annotations.Nullable androidx.compose.material3.SearchBarColors r56, float r57, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r58, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r59, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r61, int r62, int r63, int r64) {
        /*
            Method dump skipped, instructions count: 1435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt.m70528SearchBarId_Pb_0(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, androidx.compose.foundation.layout.WindowInsets, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: a */
    public static final void m60574a(String str, Function1 function1, Function1 function12, boolean z, Function1 function13, Modifier modifier, boolean z2, Function2 function2, Function2 function22, Function2 function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2, int i3) {
        int i4;
        TextFieldColors textFieldColors2;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Function2 function24;
        Function2 function25;
        Function2 function26;
        boolean z3;
        Modifier modifier3;
        int i5;
        long m71745unboximpl;
        Composer composer2;
        boolean z4;
        Function2 function27;
        Function2 function28;
        Function2 function29;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors3;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-1330051158);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = i | (startRestartGroup.changed(str) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i4;
        if ((i3 & 4) != 0) {
            i6 |= 384;
        } else if ((i & 896) == 0) {
            i6 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i6 |= 3072;
        } else if ((i & 7168) == 0) {
            i6 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i6 |= 24576;
        } else if ((57344 & i) == 0) {
            i6 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        int i7 = i3 & 32;
        if (i7 != 0) {
            i6 |= ProfileVerifier.CompilationStatus.f36531xf2722a21;
        } else if ((i & 458752) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i8 = i3 & 64;
        if (i8 != 0) {
            i6 |= 1572864;
        } else if ((i & 3670016) == 0) {
            i6 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        int i9 = 128 & i3;
        if (i9 != 0) {
            i6 |= 12582912;
        } else if ((i & 29360128) == 0) {
            i6 |= startRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i10 = 256 & i3;
        if (i10 != 0) {
            i6 |= 100663296;
        } else if ((i & 234881024) == 0) {
            i6 |= startRestartGroup.changedInstance(function22) ? 67108864 : MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i6 |= 805306368;
        } else if ((i & 1879048192) == 0) {
            i6 |= startRestartGroup.changedInstance(function23) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i12 = (i2 & 14) == 0 ? i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(textFieldColors)) ? 4 : 2) : i2;
        int i13 = 2048 & i3;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i2 & 112) == 0) {
            i12 |= startRestartGroup.changed(mutableInteractionSource) ? 32 : 16;
        }
        if ((i6 & 1533916891) == 306783378 && (i12 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier4 = modifier;
            function27 = function2;
            function28 = function22;
            function29 = function23;
            textFieldColors3 = textFieldColors;
            mutableInteractionSource3 = mutableInteractionSource;
            composer2 = startRestartGroup;
            z4 = z2;
        } else {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((1024 & i3) != 0) {
                    i12 &= -15;
                }
                modifier3 = modifier;
                z3 = z2;
                function25 = function2;
                function26 = function22;
                function24 = function23;
                textFieldColors2 = textFieldColors;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier;
                boolean z5 = i8 != 0 ? true : z2;
                Function2 function210 = i9 != 0 ? null : function2;
                Function2 function211 = i10 != 0 ? null : function22;
                Function2 function212 = i11 != 0 ? null : function23;
                if ((1024 & i3) != 0) {
                    textFieldColors2 = SearchBarDefaults.INSTANCE.m70526inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 0, 24576, 16383);
                    i12 &= -15;
                } else {
                    textFieldColors2 = textFieldColors;
                }
                if (i13 != 0) {
                    startRestartGroup.startReplaceableGroup(-492369756);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    modifier2 = modifier5;
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                } else {
                    modifier2 = modifier5;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function24 = function212;
                function25 = function210;
                function26 = function211;
                z3 = z5;
                modifier3 = modifier2;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1330051158, i6, i12, "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            Strings.Companion companion2 = Strings.Companion;
            String m70619getStringNWtq28 = Strings_androidKt.m70619getStringNWtq28(companion2.m70600getSearchBarSearchadMyvUU(), startRestartGroup, 6);
            String m70619getStringNWtq282 = Strings_androidKt.m70619getStringNWtq28(companion2.m70604getSuggestionsAvailableadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(462567106);
            long m73237getColor0d7_KjU = ((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).m73237getColor0d7_KjU();
            if (m73237getColor0d7_KjU != Color.Companion.m71771getUnspecified0d7_KjU()) {
                m71745unboximpl = m73237getColor0d7_KjU;
                i5 = i6;
            } else {
                i5 = i6;
                m71745unboximpl = textFieldColors2.textColor$material3_release(z3, false, mutableInteractionSource2, startRestartGroup, ((i12 << 3) & 896) | ((i6 >> 18) & 14) | 48 | ((i12 << 9) & 7168)).getValue().m71745unboximpl();
            }
            startRestartGroup.endReplaceableGroup();
            Modifier modifier6 = modifier3;
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(SizeKt.m69550height3ABfNKs(modifier3, SearchBarDefaults.INSTANCE.m70524getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(function13);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SearchBarKt$SearchBarInputField$2$1(function13);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier onFocusChanged = FocusChangedModifierKt.onFocusChanged(focusRequester2, (Function1) rememberedValue3);
            Object[] objArr = {m70619getStringNWtq28, Boolean.valueOf(z), m70619getStringNWtq282, focusRequester};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i14 = 0;
            boolean z6 = false;
            for (int i15 = 4; i14 < i15; i15 = 4) {
                z6 |= startRestartGroup.changed(objArr[i14]);
                i14++;
            }
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z6 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new SearchBarKt$SearchBarInputField$3$1(m70619getStringNWtq28, z, m70619getStringNWtq282, focusRequester);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier semantics$default = SemanticsModifierKt.semantics$default(onFocusChanged, false, (Function1) rememberedValue4, 1, null);
            TextStyle merge = ((TextStyle) startRestartGroup.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(m71745unboximpl, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (DefaultConstructorMarker) null));
            SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor$material3_release(false, startRestartGroup, ((i12 << 3) & 112) | 6).getValue().m71745unboximpl(), null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, 0, ImeAction.Companion.m73371getSearcheUduSuo(), 7, null);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed2 = startRestartGroup.changed(function12) | startRestartGroup.changed(str);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new SearchBarKt$SearchBarInputField$4$1(function12, str);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            int i16 = i12;
            TextFieldColors textFieldColors4 = textFieldColors2;
            composer2 = startRestartGroup;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, semantics$default, z3, false, merge, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) rememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 584727264, true, new SearchBarKt$SearchBarInputField$5(str, z3, mutableInteractionSource2, function25, function26, function24, textFieldColors2, i5, i16)), composer2, (i5 & 14) | 102236160 | (i5 & 112) | ((i5 >> 9) & 7168), ((i16 << 6) & 7168) | ProfileVerifier.CompilationStatus.f36531xf2722a21, 7696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z4 = z3;
            function27 = function25;
            function28 = function26;
            function29 = function24;
            mutableInteractionSource3 = mutableInteractionSource2;
            textFieldColors3 = textFieldColors4;
            modifier4 = modifier6;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new SearchBarKt$SearchBarInputField$6(str, function1, function12, z, function13, modifier4, z4, function27, function28, function29, textFieldColors3, mutableInteractionSource3, i, i2, i3));
    }

    /* renamed from: b */
    public static final boolean m60573b(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final float getDockedActiveTableMinHeight() {
        return f25996b;
    }

    public static final float getSearchBarMinWidth() {
        return f25997c;
    }

    public static final float getSearchBarVerticalPadding() {
        return f25999e;
    }
}
