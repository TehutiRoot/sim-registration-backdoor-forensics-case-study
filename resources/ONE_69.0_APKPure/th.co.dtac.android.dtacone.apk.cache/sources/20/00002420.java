package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.b */
/* loaded from: classes.dex */
public final class C2771b extends AbstractClickableNode {

    /* renamed from: v */
    public Function0 f13014v;

    /* renamed from: w */
    public final ClickableSemanticsNode f13015w;

    /* renamed from: x */
    public final CombinedClickablePointerInputNode f13016x;

    public /* synthetic */ C2771b(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0, str2, function02, function03);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: h */
    public CombinedClickablePointerInputNode mo61477e() {
        return this.f13016x;
    }

    /* renamed from: i */
    public ClickableSemanticsNode m61475i() {
        return this.f13015w;
    }

    /* renamed from: j */
    public final void m61474j(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function02) {
        boolean z2;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        boolean z3 = false;
        if (this.f13014v == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (function0 == null) {
            z3 = true;
        }
        if (z2 != z3) {
            m61592d();
        }
        this.f13014v = function0;
        m61590g(interactionSource, z, str, role, onClick);
        m61475i().m61550c(z, str, role, onClick, str2, function0);
        mo61477e().m61542m(z, interactionSource, onClick, function0, function02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2771b(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function02) {
        super(interactionSource, z, str, role, onClick, null);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f13014v = function0;
        this.f13015w = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z, str, role, onClick, str2, function0, null));
        this.f13016x = (CombinedClickablePointerInputNode) delegate(new CombinedClickablePointerInputNode(z, interactionSource, onClick, m61591f(), this.f13014v, function02));
    }
}