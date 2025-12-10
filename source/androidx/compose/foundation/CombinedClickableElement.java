package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.node.ModifierNodeElement;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.semantics.Role;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bh\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0019\u001a\u00020\f*\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u001f\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m28850d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/b;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function0;", "", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "<init>", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "d", "()Landroidx/compose/foundation/b;", "node", "e", "(Landroidx/compose/foundation/b;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/interaction/MutableInteractionSource;", OperatorName.CURVE_TO, "Z", "Ljava/lang/String;", "Landroidx/compose/ui/semantics/Role;", OperatorName.FILL_NON_ZERO, "Lkotlin/jvm/functions/Function0;", OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CombinedClickableElement extends ModifierNodeElement<C2789b> {

    /* renamed from: b */
    public final MutableInteractionSource f12829b;

    /* renamed from: c */
    public final boolean f12830c;

    /* renamed from: d */
    public final String f12831d;

    /* renamed from: e */
    public final Role f12832e;

    /* renamed from: f */
    public final Function0 f12833f;

    /* renamed from: g */
    public final String f12834g;

    /* renamed from: h */
    public final Function0 f12835h;

    /* renamed from: i */
    public final Function0 f12836i;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, boolean z, String str, Role role, Function0 function0, String str2, Function0 function02, Function0 function03, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, z, str, role, function0, str2, function02, function03);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: d */
    public C2789b create() {
        return new C2789b(this.f12829b, this.f12830c, this.f12831d, this.f12832e, this.f12833f, this.f12834g, this.f12835h, this.f12836i, null);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    /* renamed from: e */
    public void update(C2789b node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.m61524j(this.f12829b, this.f12830c, this.f12831d, this.f12832e, this.f12833f, this.f12834g, this.f12835h, this.f12836i);
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(CombinedClickableElement.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.foundation.CombinedClickableElement");
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        if (Intrinsics.areEqual(this.f12829b, combinedClickableElement.f12829b) && this.f12830c == combinedClickableElement.f12830c && Intrinsics.areEqual(this.f12831d, combinedClickableElement.f12831d) && Intrinsics.areEqual(this.f12832e, combinedClickableElement.f12832e) && Intrinsics.areEqual(this.f12833f, combinedClickableElement.f12833f) && Intrinsics.areEqual(this.f12834g, combinedClickableElement.f12834g) && Intrinsics.areEqual(this.f12835h, combinedClickableElement.f12835h) && Intrinsics.areEqual(this.f12836i, combinedClickableElement.f12836i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode = ((this.f12829b.hashCode() * 31) + AbstractC1705Xp.m65430a(this.f12830c)) * 31;
        String str = this.f12831d;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 31;
        Role role = this.f12832e;
        if (role != null) {
            i2 = Role.m73066hashCodeimpl(role.m73068unboximpl());
        } else {
            i2 = 0;
        }
        int hashCode2 = (((i6 + i2) * 31) + this.f12833f.hashCode()) * 31;
        String str2 = this.f12834g;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (hashCode2 + i3) * 31;
        Function0 function0 = this.f12835h;
        if (function0 != null) {
            i4 = function0.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        Function0 function02 = this.f12836i;
        if (function02 != null) {
            i5 = function02.hashCode();
        }
        return i8 + i5;
    }

    @Override // androidx.compose.p003ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
    }

    public CombinedClickableElement(MutableInteractionSource interactionSource, boolean z, String str, Role role, Function0 onClick, String str2, Function0 function0, Function0 function02) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f12829b = interactionSource;
        this.f12830c = z;
        this.f12831d = str;
        this.f12832e = role;
        this.f12833f = onClick;
        this.f12834g = str2;
        this.f12835h = function0;
        this.f12836i = function02;
    }
}
