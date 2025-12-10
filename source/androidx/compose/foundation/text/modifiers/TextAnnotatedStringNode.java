package androidx.compose.foundation.text.modifiers;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorProducer;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.node.DrawModifierNodeKt;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.node.LayoutModifierNodeKt;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.node.SemanticsModifierNodeKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.MultiParagraph;
import androidx.compose.p003ui.text.Placeholder;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B²\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&JY\u0010)\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(JK\u0010*\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b*\u0010+J-\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u0013\u00103\u001a\u00020\r*\u000202H\u0016¢\u0006\u0004\b3\u00104J+\u0010>\u001a\u00020;2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J)\u0010@\u001a\u00020;*\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b?\u0010=J%\u0010E\u001a\u00020\u00132\u0006\u0010B\u001a\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013¢\u0006\u0004\bE\u0010FJ#\u0010G\u001a\u00020\u0013*\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016¢\u0006\u0004\bG\u0010FJ%\u0010I\u001a\u00020\u00132\u0006\u0010B\u001a\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010H\u001a\u00020\u0013¢\u0006\u0004\bI\u0010FJ#\u0010J\u001a\u00020\u0013*\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bJ\u0010FJ%\u0010K\u001a\u00020\u00132\u0006\u0010B\u001a\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013¢\u0006\u0004\bK\u0010FJ#\u0010L\u001a\u00020\u0013*\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0013H\u0016¢\u0006\u0004\bL\u0010FJ%\u0010M\u001a\u00020\u00132\u0006\u0010B\u001a\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010H\u001a\u00020\u0013¢\u0006\u0004\bM\u0010FJ#\u0010N\u001a\u00020\u0013*\u00020A2\u0006\u00108\u001a\u00020C2\u0006\u0010H\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010FJ\u0015\u0010Q\u001a\u00020\r2\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0013\u0010S\u001a\u00020\r*\u00020OH\u0016¢\u0006\u0004\bS\u0010RJ\u0017\u0010W\u001a\u00020V2\u0006\u0010U\u001a\u00020TH\u0002¢\u0006\u0004\bW\u0010XR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R$\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u001f\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010bR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010bR$\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR,\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010`R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR$\u0010r\u001a\u0010\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u0013\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010u\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR*\u0010x\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0v\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010`R\u0014\u0010{\u001a\u00020V8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010z\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006|"}, m28850d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/text/AnnotatedString;", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "", "onTextLayout", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/geometry/Rect;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/SelectionController;", "selectionController", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lkotlin/jvm/functions/Function1;IZIILjava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", TypedValues.Custom.S_COLOR, "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateText", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "updateLayoutRelatedArgs-MPT68mk", "(Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "updateCallbacks", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/modifiers/SelectionController;)Z", "drawChanged", "textChanged", "layoutChanged", "callbacksChanged", "doInvalidations", "(ZZZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "measureScope", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureNonExtension", "measure-3p2s80s", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidthNonExtension", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minIntrinsicWidth", "width", "minIntrinsicHeightNonExtension", "minIntrinsicHeight", "maxIntrinsicWidthNonExtension", "maxIntrinsicWidth", "maxIntrinsicHeightNonExtension", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "contentDrawScope", "drawNonExtension", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "draw", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", OperatorName.ENDPATH, "Landroidx/compose/ui/text/AnnotatedString;", "o", "Landroidx/compose/ui/text/TextStyle;", "p", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", OperatorName.SAVE, "Lkotlin/jvm/functions/Function1;", PDPageLabelRange.STYLE_ROMAN_LOWER, "I", OperatorName.CLOSE_AND_STROKE, "Z", "t", "u", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Ljava/util/List;", OperatorName.SET_LINE_WIDTH, "x", "Landroidx/compose/foundation/text/modifiers/SelectionController;", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "Landroidx/compose/ui/graphics/ColorProducer;", "", "Landroidx/compose/ui/layout/AlignmentLine;", "z", "Ljava/util/Map;", "baselineCache", "A", "Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "_layoutCache", "", "B", "semanticsTextLayoutResult", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "layoutCache", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextAnnotatedStringNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,413:1\n1#2:414\n245#3:415\n646#4:416\n646#4:417\n*S KotlinDebug\n*F\n+ 1 TextAnnotatedStringNode.kt\nandroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode\n*L\n360#1:415\n388#1:416\n390#1:417\n*E\n"})
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    /* renamed from: A */
    public MultiParagraphLayoutCache f14177A;

    /* renamed from: B */
    public Function1 f14178B;

    /* renamed from: n */
    public AnnotatedString f14179n;

    /* renamed from: o */
    public TextStyle f14180o;

    /* renamed from: p */
    public FontFamily.Resolver f14181p;

    /* renamed from: q */
    public Function1 f14182q;

    /* renamed from: r */
    public int f14183r;

    /* renamed from: s */
    public boolean f14184s;

    /* renamed from: t */
    public int f14185t;

    /* renamed from: u */
    public int f14186u;

    /* renamed from: v */
    public List f14187v;

    /* renamed from: w */
    public Function1 f14188w;

    /* renamed from: x */
    public SelectionController f14189x;

    /* renamed from: y */
    public ColorProducer f14190y;

    /* renamed from: z */
    public Map f14191z;

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer);
    }

    /* renamed from: a */
    public final MultiParagraphLayoutCache m61030a() {
        if (this.f14177A == null) {
            this.f14177A = new MultiParagraphLayoutCache(this.f14179n, this.f14180o, this.f14181p, this.f14183r, this.f14184s, this.f14185t, this.f14186u, this.f14187v, null);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this.f14177A;
        Intrinsics.checkNotNull(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Function1 function1 = this.f14178B;
        if (function1 == null) {
            function1 = new TextAnnotatedStringNode$applySemantics$1(this);
            this.f14178B = function1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.f14179n);
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    /* renamed from: b */
    public final MultiParagraphLayoutCache m61029b(Density density) {
        MultiParagraphLayoutCache m61030a = m61030a();
        m61030a.setDensity$foundation_release(density);
        return m61030a;
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z2 || z3 || z4) {
            m61030a().m69813updateZNqEYIc(this.f14179n, this.f14180o, this.f14181p, this.f14183r, this.f14184s, this.f14185t, this.f14186u, this.f14187v);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        boolean z;
        long m71771getUnspecified0d7_KjU;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        SelectionController selectionController = this.f14189x;
        if (selectionController != null) {
            selectionController.draw(contentDrawScope);
        }
        Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
        TextLayoutResult textLayoutResult = m61030a().getTextLayoutResult();
        MultiParagraph multiParagraph = textLayoutResult.getMultiParagraph();
        if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.m73587equalsimpl0(this.f14183r, TextOverflow.Companion.m73596getVisiblegIe3tQ8())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Rect m71542Recttz77jQw = RectKt.m71542Recttz77jQw(Offset.Companion.m71518getZeroF1C5BW0(), SizeKt.Size(IntSize.m73818getWidthimpl(textLayoutResult.m73190getSizeYbymL2g()), IntSize.m73817getHeightimpl(textLayoutResult.m73190getSizeYbymL2g())));
            canvas.save();
            AbstractC16846ul.m1198o(canvas, m71542Recttz77jQw, 0, 2, null);
        }
        try {
            TextDecoration textDecoration = this.f14180o.getTextDecoration();
            if (textDecoration == null) {
                textDecoration = TextDecoration.Companion.getNone();
            }
            TextDecoration textDecoration2 = textDecoration;
            Shadow shadow = this.f14180o.getShadow();
            if (shadow == null) {
                shadow = Shadow.Companion.getNone();
            }
            Shadow shadow2 = shadow;
            DrawStyle drawStyle = this.f14180o.getDrawStyle();
            if (drawStyle == null) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            Brush brush = this.f14180o.getBrush();
            if (brush != null) {
                MultiParagraph.m73107painthn5TExg$default(multiParagraph, canvas, brush, this.f14180o.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
            } else {
                ColorProducer colorProducer = this.f14190y;
                if (colorProducer != null) {
                    m71771getUnspecified0d7_KjU = colorProducer.mo70159invoke0d7_KjU();
                } else {
                    m71771getUnspecified0d7_KjU = Color.Companion.m71771getUnspecified0d7_KjU();
                }
                Color.Companion companion = Color.Companion;
                if (m71771getUnspecified0d7_KjU == companion.m71771getUnspecified0d7_KjU()) {
                    if (this.f14180o.m73237getColor0d7_KjU() != companion.m71771getUnspecified0d7_KjU()) {
                        m71771getUnspecified0d7_KjU = this.f14180o.m73237getColor0d7_KjU();
                    } else {
                        m71771getUnspecified0d7_KjU = companion.m71761getBlack0d7_KjU();
                    }
                }
                MultiParagraph.m73105paintLG529CI$default(multiParagraph, canvas, m71771getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
            }
            if (z) {
                canvas.restore();
            }
            List list = this.f14187v;
            if (list != null && !list.isEmpty()) {
                contentDrawScope.drawContent();
            }
        } catch (Throwable th2) {
            if (z) {
                canvas.restore();
            }
            throw th2;
        }
    }

    public final void drawNonExtension(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "contentDrawScope");
        draw(contentDrawScope);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return FF1.m68408a(this);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return FF1.m68407b(this);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61029b(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return maxIntrinsicHeight(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61029b(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int maxIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return maxIntrinsicWidth(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        MultiParagraphLayoutCache m61029b = m61029b(measure);
        boolean m69812layoutWithConstraintsK40F9xA = m61029b.m69812layoutWithConstraintsK40F9xA(j, measure.getLayoutDirection());
        TextLayoutResult textLayoutResult = m61029b.getTextLayoutResult();
        textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts();
        if (m69812layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Function1 function1 = this.f14182q;
            if (function1 != null) {
                function1.invoke(textLayoutResult);
            }
            SelectionController selectionController = this.f14189x;
            if (selectionController != null) {
                selectionController.updateTextLayout(textLayoutResult);
            }
            this.f14191z = AbstractC11687a.mapOf(TuplesKt.m28844to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(AbstractC21140mr0.roundToInt(textLayoutResult.getFirstBaseline()))), TuplesKt.m28844to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(AbstractC21140mr0.roundToInt(textLayoutResult.getLastBaseline()))));
        }
        Function1 function12 = this.f14188w;
        if (function12 != null) {
            function12.invoke(textLayoutResult.getPlaceholderRects());
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.Companion.m73634fixedJhjzzOo(IntSize.m73818getWidthimpl(textLayoutResult.m73190getSizeYbymL2g()), IntSize.m73817getHeightimpl(textLayoutResult.m73190getSizeYbymL2g())));
        int m73818getWidthimpl = IntSize.m73818getWidthimpl(textLayoutResult.m73190getSizeYbymL2g());
        int m73817getHeightimpl = IntSize.m73817getHeightimpl(textLayoutResult.m73190getSizeYbymL2g());
        Map<AlignmentLine, Integer> map = this.f14191z;
        Intrinsics.checkNotNull(map);
        return measure.layout(m73818getWidthimpl, m73817getHeightimpl, map, new TextAnnotatedStringNode$measure$1(mo72811measureBRTryo0));
    }

    @NotNull
    /* renamed from: measureNonExtension-3p2s80s  reason: not valid java name */
    public final MeasureResult m69826measureNonExtension3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return mo69155measure3p2s80s(measureScope, measurable, j);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61029b(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicHeightNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return minIntrinsicHeight(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61029b(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    public final int minIntrinsicWidthNonExtension(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return minIntrinsicWidth(intrinsicMeasureScope, measurable, i);
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11526jK.m29219a(this);
    }

    public final boolean updateCallbacks(@Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable Function1<? super List<Rect>, Unit> function12, @Nullable SelectionController selectionController) {
        boolean z;
        if (!Intrinsics.areEqual(this.f14182q, function1)) {
            this.f14182q = function1;
            z = true;
        } else {
            z = false;
        }
        if (!Intrinsics.areEqual(this.f14188w, function12)) {
            this.f14188w = function12;
            z = true;
        }
        if (!Intrinsics.areEqual(this.f14189x, selectionController)) {
            this.f14189x = selectionController;
            return true;
        }
        return z;
    }

    public final boolean updateDraw(@Nullable ColorProducer colorProducer, @NotNull TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        boolean z = !Intrinsics.areEqual(colorProducer, this.f14190y);
        this.f14190y = colorProducer;
        if (z || !style.hasSameDrawAffectingAttributes(this.f14180o)) {
            return true;
        }
        return false;
    }

    /* renamed from: updateLayoutRelatedArgs-MPT68mk  reason: not valid java name */
    public final boolean m69827updateLayoutRelatedArgsMPT68mk(@NotNull TextStyle style, @Nullable List<AnnotatedString.Range<Placeholder>> list, int i, int i2, boolean z, @NotNull FontFamily.Resolver fontFamilyResolver, int i3) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        boolean z2 = !this.f14180o.hasSameLayoutAffectingAttributes(style);
        this.f14180o = style;
        if (!Intrinsics.areEqual(this.f14187v, list)) {
            this.f14187v = list;
            z2 = true;
        }
        if (this.f14186u != i) {
            this.f14186u = i;
            z2 = true;
        }
        if (this.f14185t != i2) {
            this.f14185t = i2;
            z2 = true;
        }
        if (this.f14184s != z) {
            this.f14184s = z;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.f14181p, fontFamilyResolver)) {
            this.f14181p = fontFamilyResolver;
            z2 = true;
        }
        if (!TextOverflow.m73587equalsimpl0(this.f14183r, i3)) {
            this.f14183r = i3;
            return true;
        }
        return z2;
    }

    public final boolean updateText(@NotNull AnnotatedString text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(this.f14179n, text)) {
            return false;
        }
        this.f14179n = text;
        return true;
    }

    public /* synthetic */ TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : function1, (i4 & 16) != 0 ? TextOverflow.Companion.m73594getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & 128) != 0 ? 1 : i3, (i4 & 256) != 0 ? null : list, (i4 & 512) != 0 ? null : function12, (i4 & 1024) != 0 ? null : selectionController, (i4 & 2048) != 0 ? null : colorProducer, null);
    }

    public TextAnnotatedStringNode(AnnotatedString text, TextStyle style, FontFamily.Resolver fontFamilyResolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f14179n = text;
        this.f14180o = style;
        this.f14181p = fontFamilyResolver;
        this.f14182q = function1;
        this.f14183r = i;
        this.f14184s = z;
        this.f14185t = i2;
        this.f14186u = i3;
        this.f14187v = list;
        this.f14188w = function12;
        this.f14189x = selectionController;
        this.f14190y = colorProducer;
    }
}
