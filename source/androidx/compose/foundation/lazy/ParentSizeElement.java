package androidx.compose.foundation.lazy;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.runtime.State;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b%\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, m28850d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/ParentSizeNode;", "", "fraction", "Landroidx/compose/runtime/State;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLandroidx/compose/runtime/State;Landroidx/compose/runtime/State;Ljava/lang/String;)V", "d", "()Landroidx/compose/foundation/lazy/ParentSizeNode;", "node", "", "e", "(Landroidx/compose/foundation/lazy/ParentSizeNode;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getFraction", "()F", OperatorName.CURVE_TO, "Landroidx/compose/runtime/State;", "getWidthState", "()Landroidx/compose/runtime/State;", "getHeightState", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ParentSizeElement extends ModifierNodeElement<ParentSizeNode> {

    /* renamed from: b */
    public final float f13454b;

    /* renamed from: c */
    public final State f13455c;

    /* renamed from: d */
    public final State f13456d;

    /* renamed from: e */
    public final String f13457e;

    public /* synthetic */ ParentSizeElement(float f, State state, State state2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? null : state, (i & 4) != 0 ? null : state2, str);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public ParentSizeNode create() {
        return new ParentSizeNode(this.f13454b, this.f13455c, this.f13456d);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(ParentSizeNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61256d(this.f13454b);
        node.m61254f(this.f13455c);
        node.m61255e(this.f13456d);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeNode)) {
            return false;
        }
        ParentSizeNode parentSizeNode = (ParentSizeNode) obj;
        if (this.f13454b == parentSizeNode.m61259a() && Intrinsics.areEqual(this.f13455c, parentSizeNode.m61257c()) && Intrinsics.areEqual(this.f13456d, parentSizeNode.m61258b())) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int i;
        State state = this.f13455c;
        int i2 = 0;
        if (state != null) {
            i = state.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        State state2 = this.f13456d;
        if (state2 != null) {
            i2 = state2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.floatToIntBits(this.f13454b);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        inspectorInfo.setName(this.f13457e);
        inspectorInfo.setValue(Float.valueOf(this.f13454b));
    }

    public ParentSizeElement(float f, State state, State state2, String inspectorName) {
        Intrinsics.checkNotNullParameter(inspectorName, "inspectorName");
        this.f13454b = f;
        this.f13455c = state;
        this.f13456d = state2;
        this.f13457e = inspectorName;
    }
}
