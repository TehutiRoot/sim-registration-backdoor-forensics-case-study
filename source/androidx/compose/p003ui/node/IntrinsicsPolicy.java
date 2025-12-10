package androidx.compose.p003ui.node;

import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.runtime.MutableState;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR/\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001f\u0010\n¨\u0006!"}, m28850d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "", "updateFrom", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "", "height", "minIntrinsicWidth", "(I)I", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "minLookaheadIntrinsicWidth", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Landroidx/compose/ui/layout/MeasurePolicy;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "Landroidx/compose/runtime/MutableState;", OperatorName.CURVE_TO, "measurePolicyState", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n81#2:90\n107#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.IntrinsicsPolicy */
/* loaded from: classes2.dex */
public final class IntrinsicsPolicy {

    /* renamed from: c */
    public static final C3514a f30235c = new C3514a(null);

    /* renamed from: a */
    public final LayoutNode f30236a;

    /* renamed from: b */
    public final MutableState f30237b;

    /* renamed from: androidx.compose.ui.node.IntrinsicsPolicy$a */
    /* loaded from: classes2.dex */
    public static final class C3514a {
        public /* synthetic */ C3514a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C3514a() {
        }
    }

    public IntrinsicsPolicy(@NotNull LayoutNode layoutNode) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.f30236a = layoutNode;
        m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
        this.f30237b = m31891g;
    }

    /* renamed from: a */
    public final MeasurePolicy m59494a() {
        return (MeasurePolicy) this.f30237b.getValue();
    }

    /* renamed from: b */
    public final MeasurePolicy m59493b() {
        MeasurePolicy m59494a = m59494a();
        if (m59494a != null) {
            return m59494a;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }

    /* renamed from: c */
    public final void m59492c(MeasurePolicy measurePolicy) {
        this.f30237b.setValue(measurePolicy);
    }

    @NotNull
    public final LayoutNode getLayoutNode() {
        return this.f30236a;
    }

    public final int maxIntrinsicHeight(int i) {
        return m59493b().maxIntrinsicHeight(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildMeasurables$ui_release(), i);
    }

    public final int maxIntrinsicWidth(int i) {
        return m59493b().maxIntrinsicWidth(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildMeasurables$ui_release(), i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return m59493b().maxIntrinsicHeight(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return m59493b().maxIntrinsicWidth(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int minIntrinsicHeight(int i) {
        return m59493b().minIntrinsicHeight(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildMeasurables$ui_release(), i);
    }

    public final int minIntrinsicWidth(int i) {
        return m59493b().minIntrinsicWidth(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildMeasurables$ui_release(), i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return m59493b().minIntrinsicHeight(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return m59493b().minIntrinsicWidth(this.f30236a.getOuterCoordinator$ui_release(), this.f30236a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final void updateFrom(@NotNull MeasurePolicy measurePolicy) {
        Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
        m59492c(measurePolicy);
    }
}
