package androidx.compose.p003ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000*\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m28850d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "", "T", "", "", "label", "action", "<init>", "(Ljava/lang/String;Lkotlin/Function;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/Function;", "getAction", "()Lkotlin/Function;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.semantics.AccessibilityAction */
/* loaded from: classes2.dex */
public final class AccessibilityAction<T extends Function<? extends Boolean>> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f30853a;

    /* renamed from: b */
    public final Function f30854b;

    public AccessibilityAction(@Nullable String str, @Nullable T t) {
        this.f30853a = str;
        this.f30854b = t;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (Intrinsics.areEqual(this.f30853a, accessibilityAction.f30853a) && Intrinsics.areEqual(this.f30854b, accessibilityAction.f30854b)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final T getAction() {
        return (T) this.f30854b;
    }

    @Nullable
    public final String getLabel() {
        return this.f30853a;
    }

    public int hashCode() {
        int i;
        String str = this.f30853a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Function function = this.f30854b;
        if (function != null) {
            i2 = function.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + this.f30853a + ", action=" + this.f30854b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
