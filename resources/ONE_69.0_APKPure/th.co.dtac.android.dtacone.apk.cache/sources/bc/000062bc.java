package androidx.compose.p003ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m29142d2 = {"Landroidx/compose/ui/node/Ref;", "T", "", "<init>", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.Ref */
/* loaded from: classes2.dex */
public final class Ref<T> {
    public static final int $stable = 8;

    /* renamed from: a */
    public Object f30519a;

    @Nullable
    public final T getValue() {
        return (T) this.f30519a;
    }

    public final void setValue(@Nullable T t) {
        this.f30519a = t;
    }
}