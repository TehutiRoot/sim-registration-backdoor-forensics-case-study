package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.foundation.a */
/* loaded from: classes.dex */
public final class C2788a extends AbstractClickableNode {

    /* renamed from: v */
    public final ClickableSemanticsNode f12924v;

    /* renamed from: w */
    public final ClickablePointerInputNode f12925w;

    public /* synthetic */ C2788a(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: h */
    public ClickablePointerInputNode mo61527e() {
        return this.f12925w;
    }

    /* renamed from: i */
    public ClickableSemanticsNode m61529i() {
        return this.f12924v;
    }

    /* renamed from: j */
    public final void m61528j(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        m61640g(interactionSource, z, str, role, onClick);
        m61529i().m61600c(z, str, role, onClick, null, null);
        mo61527e().m61605k(z, interactionSource, onClick);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2788a(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick) {
        super(interactionSource, z, str, role, onClick, null);
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12924v = (ClickableSemanticsNode) delegate(new ClickableSemanticsNode(z, str, role, onClick, null, null, null));
        this.f12925w = (ClickablePointerInputNode) delegate(new ClickablePointerInputNode(z, interactionSource, onClick, m61641f()));
    }
}
