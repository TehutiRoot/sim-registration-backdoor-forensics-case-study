package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ClipOp;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.runtime.RememberObserver;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, m28850d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "params", "<init>", "(Landroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "updateTextLayout", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "updateGlobalPosition", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, OperatorName.CURVE_TO, "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Landroidx/compose/foundation/text/selection/Selectable;", "d", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "", "e", "selectableId", "Landroidx/compose/ui/Modifier;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,360:1\n214#2,8:361\n261#2,11:369\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n149#1:361,8\n149#1:369,11\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {

    /* renamed from: a */
    public final SelectionRegistrar f14146a;

    /* renamed from: b */
    public final long f14147b;

    /* renamed from: c */
    public StaticTextSelectionParams f14148c;

    /* renamed from: d */
    public Selectable f14149d;

    /* renamed from: e */
    public final long f14150e;

    /* renamed from: f */
    public final Modifier f14151f;

    public /* synthetic */ SelectionController(SelectionRegistrar selectionRegistrar, long j, StaticTextSelectionParams staticTextSelectionParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectionRegistrar, j, staticTextSelectionParams);
    }

    public final void draw(@NotNull DrawScope drawScope) {
        int offset;
        int offset2;
        int i;
        Intrinsics.checkNotNullParameter(drawScope, "drawScope");
        Selection selection = this.f14146a.getSubselections().get(Long.valueOf(this.f14150e));
        if (selection == null) {
            return;
        }
        if (!selection.getHandlesCrossed()) {
            offset = selection.getStart().getOffset();
        } else {
            offset = selection.getEnd().getOffset();
        }
        if (!selection.getHandlesCrossed()) {
            offset2 = selection.getEnd().getOffset();
        } else {
            offset2 = selection.getStart().getOffset();
        }
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.f14149d;
        if (selectable != null) {
            i = selectable.getLastVisibleOffset();
        } else {
            i = 0;
        }
        Path pathForRange = this.f14148c.getPathForRange(AbstractC11719c.coerceAtMost(offset, i), AbstractC11719c.coerceAtMost(offset2, i));
        if (pathForRange == null) {
            return;
        }
        if (this.f14148c.getShouldClip()) {
            float m71571getWidthimpl = Size.m71571getWidthimpl(drawScope.mo72144getSizeNHjbRc());
            float m71568getHeightimpl = Size.m71568getHeightimpl(drawScope.mo72144getSizeNHjbRc());
            int m71724getIntersectrtfAjoo = ClipOp.Companion.m71724getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo72153clipRectN_I0leg(0.0f, 0.0f, m71571getWidthimpl, m71568getHeightimpl, m71724getIntersectrtfAjoo);
            AbstractC12212lK.m26520G(drawScope, pathForRange, this.f14147b, 0.0f, null, null, 0, 60, null);
            drawContext.getCanvas().restore();
            drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
            return;
        }
        AbstractC12212lK.m26520G(drawScope, pathForRange, this.f14147b, 0.0f, null, null, 0, 60, null);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.f14151f;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.f14149d;
        if (selectable != null) {
            this.f14146a.unsubscribe(selectable);
            this.f14149d = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.f14149d;
        if (selectable != null) {
            this.f14146a.unsubscribe(selectable);
            this.f14149d = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f14149d = this.f14146a.subscribe(new MultiWidgetSelectionDelegate(this.f14150e, new SelectionController$onRemembered$1(this), new SelectionController$onRemembered$2(this)));
    }

    public final void updateGlobalPosition(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f14148c = StaticTextSelectionParams.copy$default(this.f14148c, coordinates, null, 2, null);
    }

    public final void updateTextLayout(@NotNull TextLayoutResult textLayoutResult) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        this.f14148c = StaticTextSelectionParams.copy$default(this.f14148c, null, textLayoutResult, 1, null);
    }

    public SelectionController(SelectionRegistrar selectionRegistrar, long j, StaticTextSelectionParams params) {
        Modifier m61032a;
        Intrinsics.checkNotNullParameter(selectionRegistrar, "selectionRegistrar");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f14146a = selectionRegistrar;
        this.f14147b = j;
        this.f14148c = params;
        long nextSelectableId = selectionRegistrar.nextSelectableId();
        this.f14150e = nextSelectableId;
        m61032a = SelectionControllerKt.m61032a(selectionRegistrar, nextSelectableId, new SelectionController$modifier$1(this), new SelectionController$modifier$2(this), TouchMode_androidKt.isInTouchMode());
        this.f14151f = BasicText_androidKt.textPointerHoverIcon(m61032a, selectionRegistrar);
    }

    public /* synthetic */ SelectionController(SelectionRegistrar selectionRegistrar, long j, StaticTextSelectionParams staticTextSelectionParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(selectionRegistrar, j, (i & 4) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
