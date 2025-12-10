package androidx.compose.p003ui.focus;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\f¢\u0006\u0004\b\n\u0010\rJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0012\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/focus/FocusTargetNode;", "node", "scheduleInvalidation", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "T", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/Set;Ljava/lang/Object;)V", "Lkotlin/jvm/functions/Function1;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Set;", "focusTargetNodes", OperatorName.CURVE_TO, "focusEventNodes", "d", "focusPropertiesNodes", "e", "Lkotlin/jvm/functions/Function0;", "invalidateNodes", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.focus.FocusInvalidationManager */
/* loaded from: classes2.dex */
public final class FocusInvalidationManager {

    /* renamed from: a */
    public final Function1 f28911a;

    /* renamed from: b */
    public Set f28912b;

    /* renamed from: c */
    public Set f28913c;

    /* renamed from: d */
    public Set f28914d;

    /* renamed from: e */
    public final Function0 f28915e;

    public FocusInvalidationManager(@NotNull Function1<? super Function0<Unit>, Unit> onRequestApplyChangesListener) {
        Intrinsics.checkNotNullParameter(onRequestApplyChangesListener, "onRequestApplyChangesListener");
        this.f28911a = onRequestApplyChangesListener;
        this.f28912b = new LinkedHashSet();
        this.f28913c = new LinkedHashSet();
        this.f28914d = new LinkedHashSet();
        this.f28915e = new FocusInvalidationManager$invalidateNodes$1(this);
    }

    /* renamed from: a */
    public final void m59827a(Set set, Object obj) {
        if (set.add(obj) && this.f28912b.size() + this.f28913c.size() + this.f28914d.size() == 1) {
            this.f28911a.invoke(this.f28915e);
        }
    }

    public final void scheduleInvalidation(@NotNull FocusTargetNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m59827a(this.f28912b, node);
    }

    public final void scheduleInvalidation(@NotNull FocusEventModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m59827a(this.f28913c, node);
    }

    public final void scheduleInvalidation(@NotNull FocusPropertiesModifierNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        m59827a(this.f28914d, node);
    }
}
