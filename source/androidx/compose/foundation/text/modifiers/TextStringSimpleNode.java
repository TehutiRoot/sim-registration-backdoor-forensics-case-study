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
import androidx.compose.p003ui.text.Paragraph;
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
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJC\u0010\u001d\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020!*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J)\u0010/\u001a\u00020,*\u00020'2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.J#\u00103\u001a\u00020\u000f*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b3\u00104J#\u00106\u001a\u00020\u000f*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00104J#\u00107\u001a\u00020\u000f*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00102\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u00104J#\u00108\u001a\u00020\u000f*\u0002002\u0006\u0010)\u001a\u0002012\u0006\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u00104J\u0013\u0010:\u001a\u00020!*\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b?\u0010@R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001f\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010HR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010S\u001a\u0010\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u000f\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR*\u0010\\\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X\u0012\u0004\u0012\u00020\r\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020>8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006`"}, m28850d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "", TextBundle.TEXT_ENTRY, "Landroidx/compose/ui/text/TextStyle;", "style", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/ColorProducer;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;IZIILandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", TypedValues.Custom.S_COLOR, "updateDraw", "(Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/ui/text/TextStyle;)Z", "updateText", "(Ljava/lang/String;)Z", "updateLayoutRelatedArgs-HuAbxIM", "(Landroidx/compose/ui/text/TextStyle;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;I)Z", "updateLayoutRelatedArgs", "drawChanged", "textChanged", "layoutChanged", "", "doInvalidations", "(ZZZ)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/unit/Density;)Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", OperatorName.ENDPATH, "Ljava/lang/String;", "o", "Landroidx/compose/ui/text/TextStyle;", "p", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", OperatorName.SAVE, "I", PDPageLabelRange.STYLE_ROMAN_LOWER, "Z", OperatorName.CLOSE_AND_STROKE, "t", "u", "Landroidx/compose/ui/graphics/ColorProducer;", "", "Landroidx/compose/ui/layout/AlignmentLine;", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "Ljava/util/Map;", "baselineCache", OperatorName.SET_LINE_WIDTH, "Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "_layoutCache", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "x", "Lkotlin/jvm/functions/Function1;", "semanticsTextLayoutResult", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "layoutCache", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextStringSimpleNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,330:1\n1#2:331\n245#3:332\n646#4:333\n646#4:334\n*S KotlinDebug\n*F\n+ 1 TextStringSimpleNode.kt\nandroidx/compose/foundation/text/modifiers/TextStringSimpleNode\n*L\n281#1:332\n307#1:333\n309#1:334\n*E\n"})
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {

    /* renamed from: n */
    public String f14200n;

    /* renamed from: o */
    public TextStyle f14201o;

    /* renamed from: p */
    public FontFamily.Resolver f14202p;

    /* renamed from: q */
    public int f14203q;

    /* renamed from: r */
    public boolean f14204r;

    /* renamed from: s */
    public int f14205s;

    /* renamed from: t */
    public int f14206t;

    /* renamed from: u */
    public ColorProducer f14207u;

    /* renamed from: v */
    public Map f14208v;

    /* renamed from: w */
    public ParagraphLayoutCache f14209w;

    /* renamed from: x */
    public Function1 f14210x;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, i, z, i2, i3, colorProducer);
    }

    /* renamed from: a */
    public final ParagraphLayoutCache m61028a() {
        if (this.f14209w == null) {
            this.f14209w = new ParagraphLayoutCache(this.f14200n, this.f14201o, this.f14202p, this.f14203q, this.f14204r, this.f14205s, this.f14206t, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this.f14209w;
        Intrinsics.checkNotNull(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Function1 function1 = this.f14210x;
        if (function1 == null) {
            function1 = new TextStringSimpleNode$applySemantics$1(this);
            this.f14210x = function1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.f14200n, null, null, 6, null));
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    /* renamed from: b */
    public final ParagraphLayoutCache m61027b(Density density) {
        ParagraphLayoutCache m61028a = m61028a();
        m61028a.setDensity$foundation_release(density);
        return m61028a;
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3) {
        if (z2) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z2 || z3) {
            m61028a().m69817updateL6sJoHM(this.f14200n, this.f14201o, this.f14202p, this.f14203q, this.f14204r, this.f14205s, this.f14206t);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        long m71771getUnspecified0d7_KjU;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        Paragraph paragraph$foundation_release = m61028a().getParagraph$foundation_release();
        if (paragraph$foundation_release != null) {
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = m61028a().getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                Rect m71542Recttz77jQw = RectKt.m71542Recttz77jQw(Offset.Companion.m71518getZeroF1C5BW0(), SizeKt.Size(IntSize.m73818getWidthimpl(m61028a().m69814getLayoutSizeYbymL2g$foundation_release()), IntSize.m73817getHeightimpl(m61028a().m69814getLayoutSizeYbymL2g$foundation_release())));
                canvas.save();
                AbstractC16846ul.m1198o(canvas, m71542Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.f14201o.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.f14201o.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.f14201o.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.f14201o.getBrush();
                if (brush != null) {
                    AbstractC17603Fh1.m68370d(paragraph$foundation_release, canvas, brush, this.f14201o.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.f14207u;
                    if (colorProducer != null) {
                        m71771getUnspecified0d7_KjU = colorProducer.mo70159invoke0d7_KjU();
                    } else {
                        m71771getUnspecified0d7_KjU = Color.Companion.m71771getUnspecified0d7_KjU();
                    }
                    Color.Companion companion = Color.Companion;
                    if (m71771getUnspecified0d7_KjU == companion.m71771getUnspecified0d7_KjU()) {
                        if (this.f14201o.m73237getColor0d7_KjU() != companion.m71771getUnspecified0d7_KjU()) {
                            m71771getUnspecified0d7_KjU = this.f14201o.m73237getColor0d7_KjU();
                        } else {
                            m71771getUnspecified0d7_KjU = companion.m71761getBlack0d7_KjU();
                        }
                    }
                    AbstractC17603Fh1.m68372b(paragraph$foundation_release, canvas, m71771getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
                if (didOverflow$foundation_release) {
                    canvas.restore();
                    return;
                }
                return;
            } catch (Throwable th2) {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
                throw th2;
            }
        }
        throw new IllegalArgumentException("Required value was null.".toString());
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
        return m61027b(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61027b(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        ParagraphLayoutCache m61027b = m61027b(measure);
        boolean m69815layoutWithConstraintsK40F9xA = m61027b.m69815layoutWithConstraintsK40F9xA(j, measure.getLayoutDirection());
        m61027b.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = m61027b.getParagraph$foundation_release();
        Intrinsics.checkNotNull(paragraph$foundation_release);
        long m69814getLayoutSizeYbymL2g$foundation_release = m61027b.m69814getLayoutSizeYbymL2g$foundation_release();
        if (m69815layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map map = this.f14208v;
            if (map == null) {
                map = new LinkedHashMap(2);
            }
            map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(AbstractC21140mr0.roundToInt(paragraph$foundation_release.getFirstBaseline())));
            map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(AbstractC21140mr0.roundToInt(paragraph$foundation_release.getLastBaseline())));
            this.f14208v = map;
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.Companion.m73634fixedJhjzzOo(IntSize.m73818getWidthimpl(m69814getLayoutSizeYbymL2g$foundation_release), IntSize.m73817getHeightimpl(m69814getLayoutSizeYbymL2g$foundation_release)));
        int m73818getWidthimpl = IntSize.m73818getWidthimpl(m69814getLayoutSizeYbymL2g$foundation_release);
        int m73817getHeightimpl = IntSize.m73817getHeightimpl(m69814getLayoutSizeYbymL2g$foundation_release);
        Map<AlignmentLine, Integer> map2 = this.f14208v;
        Intrinsics.checkNotNull(map2);
        return measure.layout(m73818getWidthimpl, m73817getHeightimpl, map2, new TextStringSimpleNode$measure$1(mo72811measureBRTryo0));
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61027b(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return m61027b(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11526jK.m29219a(this);
    }

    public final boolean updateDraw(@Nullable ColorProducer colorProducer, @NotNull TextStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        boolean z = !Intrinsics.areEqual(colorProducer, this.f14207u);
        this.f14207u = colorProducer;
        if (z || !style.hasSameDrawAffectingAttributes(this.f14201o)) {
            return true;
        }
        return false;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM  reason: not valid java name */
    public final boolean m69828updateLayoutRelatedArgsHuAbxIM(@NotNull TextStyle style, int i, int i2, boolean z, @NotNull FontFamily.Resolver fontFamilyResolver, int i3) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        boolean z2 = !this.f14201o.hasSameLayoutAffectingAttributes(style);
        this.f14201o = style;
        if (this.f14206t != i) {
            this.f14206t = i;
            z2 = true;
        }
        if (this.f14205s != i2) {
            this.f14205s = i2;
            z2 = true;
        }
        if (this.f14204r != z) {
            this.f14204r = z;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.f14202p, fontFamilyResolver)) {
            this.f14202p = fontFamilyResolver;
            z2 = true;
        }
        if (!TextOverflow.m73587equalsimpl0(this.f14203q, i3)) {
            this.f14203q = i3;
            return true;
        }
        return z2;
    }

    public final boolean updateText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(this.f14200n, text)) {
            return false;
        }
        this.f14200n = text;
        return true;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m73594getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & 128) != 0 ? null : colorProducer, null);
    }

    public TextStringSimpleNode(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        this.f14200n = text;
        this.f14201o = style;
        this.f14202p = fontFamilyResolver;
        this.f14203q = i;
        this.f14204r = z;
        this.f14205s = i2;
        this.f14206t = i3;
        this.f14207u = colorProducer;
    }
}
