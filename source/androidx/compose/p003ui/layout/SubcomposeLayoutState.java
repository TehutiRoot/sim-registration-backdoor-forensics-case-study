package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.ExperimentalComposeUiApi;
import androidx.compose.p003ui.node.LayoutNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u0011\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\tJ*\u0010\u0010\u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0015\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR1\u0010#\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0002\b\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R1\u0010'\u001a\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0002\b\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"RK\u0010-\u001a0\u0012\u0004\u0012\u00020\u001d\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u001c¢\u0006\u0002\b\u001e\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0002\b\u001e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"RK\u00101\u001a0\u0012\u0004\u0012\u00020\u001d\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u001c¢\u0006\u0002\b\u001e\u0012\u0004\u0012\u00020\f0\u001c¢\u0006\u0002\b\u001e8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\u001a\u00103\u001a\u0002028GX\u0087\u0004¢\u0006\f\u0012\u0004\b5\u0010\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, m28850d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "()V", "", "maxSlotsToRetainForReuse", "(I)V", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren$ui_release", "forceRecomposeChildren", "disposeCurrentNodes$ui_release", "disposeCurrentNodes", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "_state", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/ExtensionFunctionType;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function2;", "getSetRoot$ui_release", "()Lkotlin/jvm/functions/Function2;", "setRoot", "Landroidx/compose/runtime/CompositionContext;", "d", "getSetCompositionContext$ui_release", "setCompositionContext", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "e", "getSetMeasurePolicy$ui_release", "setMeasurePolicy", "Landroidx/compose/ui/layout/SubcomposeIntermediateMeasureScope;", OperatorName.FILL_NON_ZERO, "getSetIntermediateMeasurePolicy$ui_release", "setIntermediateMeasurePolicy", "", "isInLookaheadScope", "()Z", "isInLookaheadScope$annotations", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "PrecomposedSlotHandle", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState */
/* loaded from: classes2.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;

    /* renamed from: a */
    public final SubcomposeSlotReusePolicy f30160a;

    /* renamed from: b */
    public LayoutNodeSubcompositionsState f30161b;

    /* renamed from: c */
    public final Function2 f30162c;

    /* renamed from: d */
    public final Function2 f30163d;

    /* renamed from: e */
    public final Function2 f30164e;

    /* renamed from: f */
    public final Function2 f30165f;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J%\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "placeablesCount", "", "getPlaceablesCount", "()I", "dispose", "", "premeasure", FirebaseAnalytics.Param.INDEX, "constraints", "Landroidx/compose/ui/unit/Constraints;", "premeasure-0kLqBqw", "(IJ)V", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.layout.SubcomposeLayoutState$PrecomposedSlotHandle */
    /* loaded from: classes2.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        int getPlaceablesCount();

        /* renamed from: premeasure-0kLqBqw */
        void mo72828premeasure0kLqBqw(int i, long j);
    }

    public SubcomposeLayoutState(@NotNull SubcomposeSlotReusePolicy slotReusePolicy) {
        Intrinsics.checkNotNullParameter(slotReusePolicy, "slotReusePolicy");
        this.f30160a = slotReusePolicy;
        this.f30162c = new SubcomposeLayoutState$setRoot$1(this);
        this.f30163d = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.f30164e = new SubcomposeLayoutState$setMeasurePolicy$1(this);
        this.f30165f = new SubcomposeLayoutState$setIntermediateMeasurePolicy$1(this);
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isInLookaheadScope$annotations() {
    }

    /* renamed from: a */
    public final LayoutNodeSubcompositionsState m59520a() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f30161b;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void disposeCurrentNodes$ui_release() {
        m59520a().disposeCurrentNodes();
    }

    public final void forceRecomposeChildren$ui_release() {
        m59520a().forceRecomposeChildren();
    }

    @NotNull
    public final Function2<LayoutNode, CompositionContext, Unit> getSetCompositionContext$ui_release() {
        return this.f30163d;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeIntermediateMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetIntermediateMeasurePolicy$ui_release() {
        return this.f30165f;
    }

    @NotNull
    public final Function2<LayoutNode, Function2<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, Unit> getSetMeasurePolicy$ui_release() {
        return this.f30164e;
    }

    @NotNull
    public final Function2<LayoutNode, SubcomposeLayoutState, Unit> getSetRoot$ui_release() {
        return this.f30162c;
    }

    @ExperimentalComposeUiApi
    public final boolean isInLookaheadScope() {
        return m59520a().isInLookaheadScope();
    }

    @NotNull
    public final PrecomposedSlotHandle precompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return m59520a().precompose(obj, content);
    }

    public SubcomposeLayoutState() {
        this(C3508b.f30170a);
    }

    @Deprecated(message = "This constructor is deprecated", replaceWith = @ReplaceWith(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i));
    }
}
