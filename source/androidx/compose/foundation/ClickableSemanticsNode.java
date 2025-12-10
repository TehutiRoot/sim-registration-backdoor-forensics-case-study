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
    public boolean f12819n;

    /* renamed from: o */
    public String f12820o;

    /* renamed from: p */
    public Role f12821p;

    /* renamed from: q */
    public Function0 f12822q;

    /* renamed from: r */
    public String f12823r;

    /* renamed from: s */
    public Function0 f12824s;

    public /* synthetic */ ClickableSemanticsNode(boolean z, String str, Role role, Function0 function0, String str2, Function0 function02, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, role, function0, str2, function02);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "<this>");
        Role role = this.f12821p;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m73082setRolekuIjeqM(semanticsPropertyReceiver, role.m73068unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.f12820o, new ClickableSemanticsNode$applySemantics$1(this));
        if (this.f12824s != null) {
            SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, this.f12823r, new ClickableSemanticsNode$applySemantics$2(this));
        }
        if (!this.f12819n) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
    }

    /* renamed from: c */
    public final void m61600c(boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12819n = z;
        this.f12820o = str;
        this.f12821p = role;
        this.f12822q = onClick;
        this.f12823r = str2;
        this.f12824s = function0;
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return FF1.m68408a(this);
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public ClickableSemanticsNode(boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12819n = z;
        this.f12820o = str;
        this.f12821p = role;
        this.f12822q = onClick;
        this.f12823r = str2;
        this.f12824s = function0;
    }
}
