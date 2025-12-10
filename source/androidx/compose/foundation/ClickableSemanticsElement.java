package androidx.compose.foundation;

import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.semantics.Role;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BN\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\n*\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m28850d2 = {"Landroidx/compose/foundation/ClickableSemanticsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/ClickableSemanticsNode;", "", "enabled", "Landroidx/compose/ui/semantics/Role;", "role", "", "onLongClickLabel", "Lkotlin/Function0;", "", "onLongClick", "onClickLabel", "onClick", "<init>", "(ZLandroidx/compose/ui/semantics/Role;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/ClickableSemanticsNode;", "node", "e", "(Landroidx/compose/foundation/ClickableSemanticsNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", OperatorName.CURVE_TO, "Landroidx/compose/ui/semantics/Role;", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ClickableSemanticsElement extends ModifierNodeElement<ClickableSemanticsNode> {

    /* renamed from: b */
    public final boolean f12813b;

    /* renamed from: c */
    public final Role f12814c;

    /* renamed from: d */
    public final String f12815d;

    /* renamed from: e */
    public final Function0 f12816e;

    /* renamed from: f */
    public final String f12817f;

    /* renamed from: g */
    public final Function0 f12818g;

    public /* synthetic */ ClickableSemanticsElement(boolean z, Role role, String str, Function0 function0, String str2, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, role, str, function0, str2, function02);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public ClickableSemanticsNode create() {
        return new ClickableSemanticsNode(this.f12813b, this.f12817f, this.f12814c, this.f12818g, this.f12815d, this.f12816e, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(ClickableSemanticsNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61600c(this.f12813b, this.f12817f, this.f12814c, this.f12818g, this.f12815d, this.f12816e);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSemanticsElement)) {
            return false;
        }
        ClickableSemanticsElement clickableSemanticsElement = (ClickableSemanticsElement) obj;
        if (this.f12813b == clickableSemanticsElement.f12813b && Intrinsics.areEqual(this.f12814c, clickableSemanticsElement.f12814c) && Intrinsics.areEqual(this.f12815d, clickableSemanticsElement.f12815d) && Intrinsics.areEqual(this.f12816e, clickableSemanticsElement.f12816e) && Intrinsics.areEqual(this.f12817f, clickableSemanticsElement.f12817f) && Intrinsics.areEqual(this.f12818g, clickableSemanticsElement.f12818g)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int m65430a = AbstractC1705Xp.m65430a(this.f12813b) * 31;
        Role role = this.f12814c;
        int i4 = 0;
        if (role != null) {
            i = role.hashCode();
        } else {
            i = 0;
        }
        int i5 = (m65430a + i) * 31;
        String str = this.f12815d;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        Function0 function0 = this.f12816e;
        if (function0 != null) {
            i3 = function0.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.f12817f;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return ((i7 + i4) * 31) + this.f12818g.hashCode();
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    public ClickableSemanticsElement(boolean z, Role role, String str, Function0 function0, String str2, Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12813b = z;
        this.f12814c = role;
        this.f12815d = str;
        this.f12816e = function0;
        this.f12817f = str2;
        this.f12818g = onClick;
    }
}
