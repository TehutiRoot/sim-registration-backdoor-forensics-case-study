package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C3623Dp;
import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u0085\u0001\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0014\u0010\u0010\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010(\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010-\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b*\u0010\f\u001a\u0004\b+\u0010,R \u00100\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\f\u001a\u0004\b/\u0010,R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u0010<\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\bR \u0010?\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010\f\u001a\u0004\b>\u0010,R \u0010B\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b@\u0010\f\u001a\u0004\bA\u0010,R\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010H\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bG\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010N\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\bM\u0010\bR \u0010Q\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\bP\u0010,R\u0017\u0010T\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\bR\u0017\u0010W\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\bR\u0017\u0010Z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bX\u0010\u0006\u001a\u0004\bY\u0010\bR\u0017\u0010]\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\b\\\u0010\bR\u0017\u0010`\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b^\u0010%\u001a\u0004\b_\u0010'R \u0010c\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\ba\u0010\f\u001a\u0004\bb\u0010,R \u0010f\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bd\u0010\f\u001a\u0004\be\u0010,R \u0010i\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bg\u0010\f\u001a\u0004\bh\u0010,R\u0017\u0010l\u001a\u00020#8\u0006¢\u0006\f\n\u0004\bj\u0010%\u001a\u0004\bk\u0010'R \u0010o\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bm\u0010\f\u001a\u0004\bn\u0010,R\u0017\u0010q\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\bp\u0010\bR\u0017\u0010t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\bR\u0017\u0010w\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bu\u0010\u0006\u001a\u0004\bv\u0010\bR\u0017\u0010z\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bx\u0010\u0006\u001a\u0004\by\u0010\bR\u0017\u0010}\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b{\u0010\u0006\u001a\u0004\b|\u0010\bR!\u0010\u0080\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b~\u0010\f\u001a\u0004\b\u007f\u0010,R#\u0010\u0083\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\f\u001a\u0005\b\u0082\u0001\u0010,R\u001a\u0010\u0086\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010\u0006\u001a\u0005\b\u0085\u0001\u0010\bR\u001a\u0010\u0089\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0006\u001a\u0005\b\u0088\u0001\u0010\bR\u001a\u0010\u008c\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010\u0006\u001a\u0005\b\u008b\u0001\u0010\bR\u001a\u0010\u008f\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0006\u001a\u0005\b\u008e\u0001\u0010\bR\u001a\u0010\u0092\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010\u0006\u001a\u0005\b\u0091\u0001\u0010\bR#\u0010\u0095\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\f\u001a\u0005\b\u0094\u0001\u0010,R\u001a\u0010\u0098\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u0097\u0001\u0010\bR\u001a\u0010\u009b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\bR\u001a\u0010\u009e\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010\u0006\u001a\u0005\b\u009d\u0001\u0010\bR\u001a\u0010¡\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\bR\u001a\u0010¤\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0001\u0010\u0006\u001a\u0005\b£\u0001\u0010\bR\u001a\u0010§\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0006\u001a\u0005\b¦\u0001\u0010\bR#\u0010ª\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b¨\u0001\u0010\f\u001a\u0005\b©\u0001\u0010,R#\u0010\u00ad\u0001\u001a\u00020)8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010\f\u001a\u0005\b¬\u0001\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006®\u0001"}, m29142d2 = {"Landroidx/compose/material3/tokens/SwitchTokens;", "", "<init>", "()V", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDisabledSelectedHandleColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DisabledSelectedHandleColor", "", "DisabledSelectedHandleOpacity", "F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDisabledSelectedIconColor", "DisabledSelectedIconColor", "DisabledSelectedIconOpacity", OperatorName.CURVE_TO, "getDisabledSelectedTrackColor", "DisabledSelectedTrackColor", "DisabledTrackOpacity", "d", "getDisabledUnselectedHandleColor", "DisabledUnselectedHandleColor", "DisabledUnselectedHandleOpacity", "e", "getDisabledUnselectedIconColor", "DisabledUnselectedIconColor", "DisabledUnselectedIconOpacity", OperatorName.FILL_NON_ZERO, "getDisabledUnselectedTrackColor", "DisabledUnselectedTrackColor", OperatorName.NON_STROKING_GRAY, "getDisabledUnselectedTrackOutlineColor", "DisabledUnselectedTrackOutlineColor", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", OperatorName.CLOSE_PATH, "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getHandleShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "HandleShape", "Landroidx/compose/ui/unit/Dp;", "i", "getPressedHandleHeight-D9Ej5fM", "()F", "PressedHandleHeight", OperatorName.SET_LINE_JOINSTYLE, "getPressedHandleWidth-D9Ej5fM", "PressedHandleWidth", OperatorName.NON_STROKING_CMYK, "getSelectedFocusHandleColor", "SelectedFocusHandleColor", OperatorName.LINE_TO, "getSelectedFocusIconColor", "SelectedFocusIconColor", OperatorName.MOVE_TO, "getSelectedFocusTrackColor", "SelectedFocusTrackColor", OperatorName.ENDPATH, "getSelectedHandleColor", "SelectedHandleColor", "o", "getSelectedHandleHeight-D9Ej5fM", "SelectedHandleHeight", "p", "getSelectedHandleWidth-D9Ej5fM", "SelectedHandleWidth", OperatorName.SAVE, "getSelectedHoverHandleColor", "SelectedHoverHandleColor", PDPageLabelRange.STYLE_ROMAN_LOWER, "getSelectedHoverIconColor", "SelectedHoverIconColor", OperatorName.CLOSE_AND_STROKE, "getSelectedHoverTrackColor", "SelectedHoverTrackColor", "t", "getSelectedIconColor", "SelectedIconColor", "u", "getSelectedIconSize-D9Ej5fM", "SelectedIconSize", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "getSelectedPressedHandleColor", "SelectedPressedHandleColor", OperatorName.SET_LINE_WIDTH, "getSelectedPressedIconColor", "SelectedPressedIconColor", "x", "getSelectedPressedTrackColor", "SelectedPressedTrackColor", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "getSelectedTrackColor", "SelectedTrackColor", "z", "getStateLayerShape", "StateLayerShape", "A", "getStateLayerSize-D9Ej5fM", "StateLayerSize", "B", "getTrackHeight-D9Ej5fM", "TrackHeight", "C", "getTrackOutlineWidth-D9Ej5fM", "TrackOutlineWidth", "D", "getTrackShape", "TrackShape", ExifInterface.LONGITUDE_EAST, "getTrackWidth-D9Ej5fM", "TrackWidth", "getUnselectedFocusHandleColor", "UnselectedFocusHandleColor", OperatorName.STROKING_COLOR_GRAY, "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "H", "getUnselectedFocusTrackColor", "UnselectedFocusTrackColor", "I", "getUnselectedFocusTrackOutlineColor", "UnselectedFocusTrackOutlineColor", OperatorName.SET_LINE_CAPSTYLE, "getUnselectedHandleColor", "UnselectedHandleColor", "K", "getUnselectedHandleHeight-D9Ej5fM", "UnselectedHandleHeight", "L", "getUnselectedHandleWidth-D9Ej5fM", "UnselectedHandleWidth", "M", "getUnselectedHoverHandleColor", "UnselectedHoverHandleColor", "N", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE, "getUnselectedHoverTrackColor", "UnselectedHoverTrackColor", "P", "getUnselectedHoverTrackOutlineColor", "UnselectedHoverTrackOutlineColor", OperatorName.RESTORE, "getUnselectedIconColor", "UnselectedIconColor", "R", "getUnselectedIconSize-D9Ej5fM", "UnselectedIconSize", "S", "getUnselectedPressedHandleColor", "UnselectedPressedHandleColor", "T", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", PDBorderStyleDictionary.STYLE_UNDERLINE, "getUnselectedPressedTrackColor", "UnselectedPressedTrackColor", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "getUnselectedPressedTrackOutlineColor", "UnselectedPressedTrackOutlineColor", "W", "getUnselectedTrackColor", "UnselectedTrackColor", "X", "getUnselectedTrackOutlineColor", "UnselectedTrackOutlineColor", "Y", "getIconHandleHeight-D9Ej5fM", "IconHandleHeight", "Z", "getIconHandleWidth-D9Ej5fM", "IconHandleWidth", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwitchTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchTokens.kt\nandroidx/compose/material3/tokens/SwitchTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,81:1\n164#2:82\n164#2:83\n164#2:84\n164#2:85\n164#2:86\n164#2:87\n164#2:88\n164#2:89\n164#2:90\n164#2:91\n164#2:92\n164#2:93\n164#2:94\n164#2:95\n*S KotlinDebug\n*F\n+ 1 SwitchTokens.kt\nandroidx/compose/material3/tokens/SwitchTokens\n*L\n37#1:82\n38#1:83\n43#1:84\n44#1:85\n49#1:86\n55#1:87\n56#1:88\n57#1:89\n59#1:90\n65#1:91\n66#1:92\n72#1:93\n79#1:94\n80#1:95\n*E\n"})
/* loaded from: classes2.dex */
public final class SwitchTokens {

    /* renamed from: A */
    public static final float f27974A;

    /* renamed from: B */
    public static final float f27975B;

    /* renamed from: C */
    public static final float f27976C;

    /* renamed from: D */
    public static final ShapeKeyTokens f27977D;
    public static final float DisabledSelectedHandleOpacity = 1.0f;
    public static final float DisabledSelectedIconOpacity = 0.38f;
    public static final float DisabledTrackOpacity = 0.12f;
    public static final float DisabledUnselectedHandleOpacity = 0.38f;
    public static final float DisabledUnselectedIconOpacity = 0.38f;

    /* renamed from: E */
    public static final float f27978E;

    /* renamed from: F */
    public static final ColorSchemeKeyTokens f27979F;

    /* renamed from: G */
    public static final ColorSchemeKeyTokens f27980G;

    /* renamed from: H */
    public static final ColorSchemeKeyTokens f27981H;

    /* renamed from: I */
    public static final ColorSchemeKeyTokens f27982I;

    /* renamed from: J */
    public static final ColorSchemeKeyTokens f27983J;

    /* renamed from: K */
    public static final float f27984K;

    /* renamed from: L */
    public static final float f27985L;

    /* renamed from: M */
    public static final ColorSchemeKeyTokens f27986M;

    /* renamed from: N */
    public static final ColorSchemeKeyTokens f27987N;

    /* renamed from: O */
    public static final ColorSchemeKeyTokens f27988O;

    /* renamed from: P */
    public static final ColorSchemeKeyTokens f27989P;

    /* renamed from: Q */
    public static final ColorSchemeKeyTokens f27990Q;

    /* renamed from: R */
    public static final float f27991R;

    /* renamed from: S */
    public static final ColorSchemeKeyTokens f27992S;

    /* renamed from: T */
    public static final ColorSchemeKeyTokens f27993T;

    /* renamed from: U */
    public static final ColorSchemeKeyTokens f27994U;

    /* renamed from: V */
    public static final ColorSchemeKeyTokens f27995V;

    /* renamed from: W */
    public static final ColorSchemeKeyTokens f27996W;

    /* renamed from: X */
    public static final ColorSchemeKeyTokens f27997X;

    /* renamed from: Y */
    public static final float f27998Y;

    /* renamed from: Z */
    public static final float f27999Z;

    /* renamed from: b */
    public static final ColorSchemeKeyTokens f28001b;

    /* renamed from: c */
    public static final ColorSchemeKeyTokens f28002c;

    /* renamed from: d */
    public static final ColorSchemeKeyTokens f28003d;

    /* renamed from: e */
    public static final ColorSchemeKeyTokens f28004e;

    /* renamed from: f */
    public static final ColorSchemeKeyTokens f28005f;

    /* renamed from: g */
    public static final ColorSchemeKeyTokens f28006g;

    /* renamed from: h */
    public static final ShapeKeyTokens f28007h;

    /* renamed from: i */
    public static final float f28008i;

    /* renamed from: j */
    public static final float f28009j;

    /* renamed from: k */
    public static final ColorSchemeKeyTokens f28010k;

    /* renamed from: l */
    public static final ColorSchemeKeyTokens f28011l;

    /* renamed from: m */
    public static final ColorSchemeKeyTokens f28012m;

    /* renamed from: n */
    public static final ColorSchemeKeyTokens f28013n;

    /* renamed from: o */
    public static final float f28014o;

    /* renamed from: p */
    public static final float f28015p;

    /* renamed from: q */
    public static final ColorSchemeKeyTokens f28016q;

    /* renamed from: r */
    public static final ColorSchemeKeyTokens f28017r;

    /* renamed from: s */
    public static final ColorSchemeKeyTokens f28018s;

    /* renamed from: t */
    public static final ColorSchemeKeyTokens f28019t;

    /* renamed from: u */
    public static final float f28020u;

    /* renamed from: v */
    public static final ColorSchemeKeyTokens f28021v;

    /* renamed from: w */
    public static final ColorSchemeKeyTokens f28022w;

    /* renamed from: x */
    public static final ColorSchemeKeyTokens f28023x;

    /* renamed from: y */
    public static final ColorSchemeKeyTokens f28024y;

    /* renamed from: z */
    public static final ShapeKeyTokens f28025z;
    @NotNull
    public static final SwitchTokens INSTANCE = new SwitchTokens();

    /* renamed from: a */
    public static final ColorSchemeKeyTokens f28000a = ColorSchemeKeyTokens.Surface;

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.OnSurface;
        f28001b = colorSchemeKeyTokens;
        f28002c = colorSchemeKeyTokens;
        f28003d = colorSchemeKeyTokens;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.SurfaceVariant;
        f28004e = colorSchemeKeyTokens2;
        f28005f = colorSchemeKeyTokens2;
        f28006g = colorSchemeKeyTokens;
        ShapeKeyTokens shapeKeyTokens = ShapeKeyTokens.CornerFull;
        f28007h = shapeKeyTokens;
        float f = (float) 28.0d;
        f28008i = C3623Dp.m73842constructorimpl(f);
        f28009j = C3623Dp.m73842constructorimpl(f);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.PrimaryContainer;
        f28010k = colorSchemeKeyTokens3;
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ColorSchemeKeyTokens.OnPrimaryContainer;
        f28011l = colorSchemeKeyTokens4;
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = ColorSchemeKeyTokens.Primary;
        f28012m = colorSchemeKeyTokens5;
        f28013n = ColorSchemeKeyTokens.OnPrimary;
        float f2 = (float) 24.0d;
        f28014o = C3623Dp.m73842constructorimpl(f2);
        f28015p = C3623Dp.m73842constructorimpl(f2);
        f28016q = colorSchemeKeyTokens3;
        f28017r = colorSchemeKeyTokens4;
        f28018s = colorSchemeKeyTokens5;
        f28019t = colorSchemeKeyTokens4;
        float f3 = (float) 16.0d;
        f28020u = C3623Dp.m73842constructorimpl(f3);
        f28021v = colorSchemeKeyTokens3;
        f28022w = colorSchemeKeyTokens4;
        f28023x = colorSchemeKeyTokens5;
        f28024y = colorSchemeKeyTokens5;
        f28025z = shapeKeyTokens;
        f27974A = C3623Dp.m73842constructorimpl((float) 40.0d);
        f27975B = C3623Dp.m73842constructorimpl((float) 32.0d);
        f27976C = C3623Dp.m73842constructorimpl((float) 2.0d);
        f27977D = shapeKeyTokens;
        f27978E = C3623Dp.m73842constructorimpl((float) 52.0d);
        ColorSchemeKeyTokens colorSchemeKeyTokens6 = ColorSchemeKeyTokens.OnSurfaceVariant;
        f27979F = colorSchemeKeyTokens6;
        f27980G = colorSchemeKeyTokens2;
        f27981H = colorSchemeKeyTokens2;
        ColorSchemeKeyTokens colorSchemeKeyTokens7 = ColorSchemeKeyTokens.Outline;
        f27982I = colorSchemeKeyTokens7;
        f27983J = colorSchemeKeyTokens7;
        f27984K = C3623Dp.m73842constructorimpl(f3);
        f27985L = C3623Dp.m73842constructorimpl(f3);
        f27986M = colorSchemeKeyTokens6;
        f27987N = colorSchemeKeyTokens2;
        f27988O = colorSchemeKeyTokens2;
        f27989P = colorSchemeKeyTokens7;
        f27990Q = colorSchemeKeyTokens2;
        f27991R = C3623Dp.m73842constructorimpl(f3);
        f27992S = colorSchemeKeyTokens6;
        f27993T = colorSchemeKeyTokens2;
        f27994U = colorSchemeKeyTokens2;
        f27995V = colorSchemeKeyTokens7;
        f27996W = colorSchemeKeyTokens2;
        f27997X = colorSchemeKeyTokens7;
        f27998Y = C3623Dp.m73842constructorimpl(f2);
        f27999Z = C3623Dp.m73842constructorimpl(f2);
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedHandleColor() {
        return f28000a;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedIconColor() {
        return f28001b;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledSelectedTrackColor() {
        return f28002c;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedHandleColor() {
        return f28003d;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedIconColor() {
        return f28004e;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedTrackColor() {
        return f28005f;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDisabledUnselectedTrackOutlineColor() {
        return f28006g;
    }

    @NotNull
    public final ShapeKeyTokens getHandleShape() {
        return f28007h;
    }

    /* renamed from: getIconHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71461getIconHandleHeightD9Ej5fM() {
        return f27998Y;
    }

    /* renamed from: getIconHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71462getIconHandleWidthD9Ej5fM() {
        return f27999Z;
    }

    /* renamed from: getPressedHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71463getPressedHandleHeightD9Ej5fM() {
        return f28008i;
    }

    /* renamed from: getPressedHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71464getPressedHandleWidthD9Ej5fM() {
        return f28009j;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusHandleColor() {
        return f28010k;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return f28011l;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedFocusTrackColor() {
        return f28012m;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHandleColor() {
        return f28013n;
    }

    /* renamed from: getSelectedHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71465getSelectedHandleHeightD9Ej5fM() {
        return f28014o;
    }

    /* renamed from: getSelectedHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71466getSelectedHandleWidthD9Ej5fM() {
        return f28015p;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverHandleColor() {
        return f28016q;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return f28017r;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedHoverTrackColor() {
        return f28018s;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return f28019t;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71467getSelectedIconSizeD9Ej5fM() {
        return f28020u;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedHandleColor() {
        return f28021v;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return f28022w;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedPressedTrackColor() {
        return f28023x;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSelectedTrackColor() {
        return f28024y;
    }

    @NotNull
    public final ShapeKeyTokens getStateLayerShape() {
        return f28025z;
    }

    /* renamed from: getStateLayerSize-D9Ej5fM  reason: not valid java name */
    public final float m71468getStateLayerSizeD9Ej5fM() {
        return f27974A;
    }

    /* renamed from: getTrackHeight-D9Ej5fM  reason: not valid java name */
    public final float m71469getTrackHeightD9Ej5fM() {
        return f27975B;
    }

    /* renamed from: getTrackOutlineWidth-D9Ej5fM  reason: not valid java name */
    public final float m71470getTrackOutlineWidthD9Ej5fM() {
        return f27976C;
    }

    @NotNull
    public final ShapeKeyTokens getTrackShape() {
        return f27977D;
    }

    /* renamed from: getTrackWidth-D9Ej5fM  reason: not valid java name */
    public final float m71471getTrackWidthD9Ej5fM() {
        return f27978E;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusHandleColor() {
        return f27979F;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusIconColor() {
        return f27980G;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrackColor() {
        return f27981H;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedFocusTrackOutlineColor() {
        return f27982I;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHandleColor() {
        return f27983J;
    }

    /* renamed from: getUnselectedHandleHeight-D9Ej5fM  reason: not valid java name */
    public final float m71472getUnselectedHandleHeightD9Ej5fM() {
        return f27984K;
    }

    /* renamed from: getUnselectedHandleWidth-D9Ej5fM  reason: not valid java name */
    public final float m71473getUnselectedHandleWidthD9Ej5fM() {
        return f27985L;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverHandleColor() {
        return f27986M;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverIconColor() {
        return f27987N;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrackColor() {
        return f27988O;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedHoverTrackOutlineColor() {
        return f27989P;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedIconColor() {
        return f27990Q;
    }

    /* renamed from: getUnselectedIconSize-D9Ej5fM  reason: not valid java name */
    public final float m71474getUnselectedIconSizeD9Ej5fM() {
        return f27991R;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedHandleColor() {
        return f27992S;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedIconColor() {
        return f27993T;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrackColor() {
        return f27994U;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedPressedTrackOutlineColor() {
        return f27995V;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrackColor() {
        return f27996W;
    }

    @NotNull
    public final ColorSchemeKeyTokens getUnselectedTrackOutlineColor() {
        return f27997X;
    }
}