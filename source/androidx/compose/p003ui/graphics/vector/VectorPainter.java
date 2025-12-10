package androidx.compose.p003ui.graphics.vector;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawContext;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.compose.ComposeNavigator;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062;\u0010\r\u001a7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJT\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2;\u0010\u001e\u001a7\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0002¢\u0006\u0004\b \u0010!R4\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u00100\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R+\u0010:\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\b9\u0010-\"\u0004\b$\u0010/R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010F\u001a\u0004\u0018\u00010\u00182\b\u0010A\u001a\u0004\u0018\u00010\u00188@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001d\u0010H\u001a\u00020\"8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bG\u0010'\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006I"}, m28850d2 = {"Landroidx/compose/ui/graphics/vector/VectorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "<init>", "()V", "", "name", "", "viewportWidth", "viewportHeight", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "", "Landroidx/compose/runtime/Composable;", "content", "RenderVector$ui_release", "(Ljava/lang/String;FFLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "RenderVector", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/runtime/CompositionContext;", "parent", ComposeNavigator.NAME, "Landroidx/compose/runtime/Composition;", "e", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function4;)Landroidx/compose/runtime/Composition;", "Landroidx/compose/ui/geometry/Size;", "<set-?>", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/MutableState;", "getSize-NH-jbRc$ui_release", "()J", "setSize-uvyYCjk$ui_release", "(J)V", "size", OperatorName.CLOSE_PATH, "getAutoMirror$ui_release", "()Z", "setAutoMirror$ui_release", "(Z)V", "autoMirror", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "i", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "vector", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/runtime/Composition;", "composition", OperatorName.NON_STROKING_CMYK, OperatorName.FILL_NON_ZERO, "isDirty", OperatorName.LINE_TO, "F", "currentAlpha", OperatorName.MOVE_TO, "Landroidx/compose/ui/graphics/ColorFilter;", "currentColorFilter", "value", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVectorPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainterKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,420:1\n81#2:421\n107#2,2:422\n81#2:424\n107#2,2:425\n81#2:427\n107#2,2:428\n281#3:430\n282#3:448\n173#4,6:431\n261#4,11:437\n*S KotlinDebug\n*F\n+ 1 VectorPainter.kt\nandroidx/compose/ui/graphics/vector/VectorPainter\n*L\n178#1:421\n178#1:422,2\n180#1:424\n180#1:425,2\n219#1:427\n219#1:428,2\n255#1:430\n255#1:448\n255#1:431,6\n255#1:437,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.VectorPainter */
/* loaded from: classes2.dex */
public final class VectorPainter extends Painter {
    public static final int $stable = 8;

    /* renamed from: g */
    public final MutableState f29516g;

    /* renamed from: h */
    public final MutableState f29517h;

    /* renamed from: i */
    public final VectorComponent f29518i;

    /* renamed from: j */
    public Composition f29519j;

    /* renamed from: k */
    public final MutableState f29520k;

    /* renamed from: l */
    public float f29521l;

    /* renamed from: m */
    public ColorFilter f29522m;

    public VectorPainter() {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        m31891g = AbstractC19508dK1.m31891g(Size.m71559boximpl(Size.Companion.m71580getZeroNHjbRc()), null, 2, null);
        this.f29516g = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f29517h = m31891g2;
        VectorComponent vectorComponent = new VectorComponent();
        vectorComponent.setInvalidateCallback$ui_release(new VectorPainter$vector$1$1(this));
        this.f29518i = vectorComponent;
        m31891g3 = AbstractC19508dK1.m31891g(Boolean.TRUE, null, 2, null);
        this.f29520k = m31891g3;
        this.f29521l = 1.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void RenderVector$ui_release(@NotNull String name, float f, float f2, @NotNull Function4<? super Float, ? super Float, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1264894527);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264894527, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        VectorComponent vectorComponent = this.f29518i;
        vectorComponent.setName(name);
        vectorComponent.setViewportWidth(f);
        vectorComponent.setViewportHeight(f2);
        Composition m59645e = m59645e(ComposablesKt.rememberCompositionContext(startRestartGroup, 0), content);
        EffectsKt.DisposableEffect(m59645e, new VectorPainter$RenderVector$2(m59645e), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorPainter$RenderVector$3(this, name, f, f2, content, i));
        }
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.f29521l = f;
        return true;
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f29522m = colorFilter;
        return true;
    }

    /* renamed from: e */
    public final Composition m59645e(CompositionContext compositionContext, Function4 function4) {
        Composition composition = this.f29519j;
        if (composition == null || composition.isDisposed()) {
            composition = CompositionKt.Composition(new VectorApplier(this.f29518i.getRoot()), compositionContext);
        }
        this.f29519j = composition;
        composition.setContent(ComposableLambdaKt.composableLambdaInstance(-1916507005, true, new VectorPainter$composeVector$1(function4, this)));
        return composition;
    }

    /* renamed from: f */
    public final boolean m59644f() {
        return ((Boolean) this.f29520k.getValue()).booleanValue();
    }

    /* renamed from: g */
    public final void m59643g(boolean z) {
        this.f29520k.setValue(Boolean.valueOf(z));
    }

    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.f29517h.getValue()).booleanValue();
    }

    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.f29518i.getIntrinsicColorFilter$ui_release();
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo72236getIntrinsicSizeNHjbRc() {
        return m72262getSizeNHjbRc$ui_release();
    }

    /* renamed from: getSize-NH-jbRc$ui_release  reason: not valid java name */
    public final long m72262getSizeNHjbRc$ui_release() {
        return ((Size) this.f29516g.getValue()).m71576unboximpl();
    }

    @Override // androidx.compose.p003ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        VectorComponent vectorComponent = this.f29518i;
        ColorFilter colorFilter = this.f29522m;
        if (colorFilter == null) {
            colorFilter = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (getAutoMirror$ui_release() && drawScope.getLayoutDirection() == LayoutDirection.Rtl) {
            long mo72143getCenterF1C5BW0 = drawScope.mo72143getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo72150getSizeNHjbRc = drawContext.mo72150getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo72157scale0AR0LA0(-1.0f, 1.0f, mo72143getCenterF1C5BW0);
            vectorComponent.draw(drawScope, this.f29521l, colorFilter);
            drawContext.getCanvas().restore();
            drawContext.mo72151setSizeuvyYCjk(mo72150getSizeNHjbRc);
        } else {
            vectorComponent.draw(drawScope, this.f29521l, colorFilter);
        }
        if (m59644f()) {
            m59643g(false);
        }
    }

    public final void setAutoMirror$ui_release(boolean z) {
        this.f29517h.setValue(Boolean.valueOf(z));
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.f29518i.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* renamed from: setSize-uvyYCjk$ui_release  reason: not valid java name */
    public final void m72263setSizeuvyYCjk$ui_release(long j) {
        this.f29516g.setValue(Size.m71559boximpl(j));
    }
}
