package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ClickableSemanticsNode extends Modifier.Node implements SemanticsModifierNode {

    /* renamed from: n */
    public boolean f12907n;

    /* renamed from: o */
    public String f12908o;

    /* renamed from: p */
    public Role f12909p;

    /* renamed from: q */
    public Function0 f12910q;

    /* renamed from: r */
    public String f12911r;

    /* renamed from: s */
    public Function0 f12912s;

    public /* synthetic */ ClickableSemanticsNode(boolean z, String str, Role role, Function0 function0, String str2, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, role, function0, str2, function02);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Role role = this.f12909p;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m73266setRolekuIjeqM(semanticsPropertyReceiver, role.m73252unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.f12908o, new ClickableSemanticsNode$applySemantics$1(this));
        if (this.f12912s != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.f12911r, new ClickableSemanticsNode$applySemantics$2(this));
        }
        if (!this.f12907n) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
    }

    /* renamed from: c */
    public final void m61550c(boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12907n = z;
        this.f12908o = str;
        this.f12909p = role;
        this.f12910q = onClick;
        this.f12911r = str2;
        this.f12912s = function0;
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return CG1.m68982a(this);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public ClickableSemanticsNode(boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12907n = z;
        this.f12908o = str;
        this.f12909p = role;
        this.f12910q = onClick;
        this.f12911r = str2;
        this.f12912s = function0;
    }
}