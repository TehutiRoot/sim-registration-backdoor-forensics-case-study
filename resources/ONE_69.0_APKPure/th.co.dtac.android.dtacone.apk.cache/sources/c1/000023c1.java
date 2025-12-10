package androidx.compose.foundation;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.modifier.ModifierLocal;
import androidx.compose.p003ui.modifier.ModifierLocalMap;
import androidx.compose.p003ui.modifier.ModifierLocalModifierNode;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R$\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m29142d2 = {"Landroidx/compose/foundation/FocusedBoundsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "<init>", "()V", "", "focused", "", "setFocus", "(Z)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.ENDPATH, "Z", "isFocused", "o", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Lkotlin/Function1;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Lkotlin/jvm/functions/Function1;", "observer", "foundation_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FocusedBoundsNode extends Modifier.Node implements ModifierLocalModifierNode, GlobalPositionAwareModifierNode {

    /* renamed from: n */
    public boolean f12945n;

    /* renamed from: o */
    public LayoutCoordinates f12946o;

    /* renamed from: a */
    public final Function1 m61531a() {
        if (isAttached()) {
            return (Function1) getCurrent(FocusedBoundsKt.getModifierLocalFocusedBoundsObserver());
        }
        return null;
    }

    /* renamed from: b */
    public final void m61530b() {
        Function1 m61531a;
        LayoutCoordinates layoutCoordinates = this.f12946o;
        if (layoutCoordinates != null) {
            Intrinsics.checkNotNull(layoutCoordinates);
            if (layoutCoordinates.isAttached() && (m61531a = m61531a()) != null) {
                m61531a.invoke(this.f12946o);
            }
        }
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode, androidx.compose.p003ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return AbstractC21724pt0.m23731a(this, modifierLocal);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return AbstractC21724pt0.m23730b(this);
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f12946o = coordinates;
        if (!this.f12945n) {
            return;
        }
        if (coordinates.isAttached()) {
            m61530b();
            return;
        }
        Function1 m61531a = m61531a();
        if (m61531a != null) {
            m61531a.invoke(null);
        }
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        AbstractC21724pt0.m23729c(this, modifierLocal, obj);
    }

    public final void setFocus(boolean z) {
        if (z == this.f12945n) {
            return;
        }
        if (!z) {
            Function1 m61531a = m61531a();
            if (m61531a != null) {
                m61531a.invoke(null);
            }
        } else {
            m61530b();
        }
        this.f12945n = z;
    }
}