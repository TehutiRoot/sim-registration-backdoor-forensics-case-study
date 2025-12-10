package androidx.compose.p003ui.node;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m29142d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "Landroidx/compose/ui/node/ObserverModifierNode;", "observerNode", "<init>", "(Landroidx/compose/ui/node/ObserverModifierNode;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/node/ObserverModifierNode;", "getObserverNode$ui_release", "()Landroidx/compose/ui/node/ObserverModifierNode;", "", "isValidOwnerScope", "()Z", "Companion", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.ObserverNodeOwnerScope */
/* loaded from: classes2.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    public static final Function1 f30505b = ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.INSTANCE;

    /* renamed from: a */
    public final ObserverModifierNode f30506a;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m29142d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "()V", "OnObserveReadsChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "", "getOnObserveReadsChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Function1<ObserverNodeOwnerScope, Unit> getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.f30505b;
        }

        public Companion() {
        }
    }

    public ObserverNodeOwnerScope(@NotNull ObserverModifierNode observerNode) {
        Intrinsics.checkNotNullParameter(observerNode, "observerNode");
        this.f30506a = observerNode;
    }

    @NotNull
    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.f30506a;
    }

    @Override // androidx.compose.p003ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.f30506a.getNode().isAttached();
    }
}