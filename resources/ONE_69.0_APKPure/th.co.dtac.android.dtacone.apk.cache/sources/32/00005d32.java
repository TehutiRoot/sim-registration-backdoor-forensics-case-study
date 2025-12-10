package androidx.compose.runtime;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\n¨\u0006\u001c"}, m29142d2 = {"Landroidx/compose/runtime/JoinedKey;", "", OneNadOutboundSearchFragment.POSITION_LEFT, OneNadOutboundSearchFragment.POSITION_RIGHT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "hashCode", "()I", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/JoinedKey;", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Object;)I", "Ljava/lang/Object;", "getLeft", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getRight", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class JoinedKey {

    /* renamed from: a */
    public final Object f28422a;

    /* renamed from: b */
    public final Object f28423b;

    public JoinedKey(@Nullable Object obj, @Nullable Object obj2) {
        this.f28422a = obj;
        this.f28423b = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = joinedKey.f28422a;
        }
        if ((i & 2) != 0) {
            obj2 = joinedKey.f28423b;
        }
        return joinedKey.copy(obj, obj2);
    }

    /* renamed from: a */
    public final int m60216a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @Nullable
    public final Object component1() {
        return this.f28422a;
    }

    @Nullable
    public final Object component2() {
        return this.f28423b;
    }

    @NotNull
    public final JoinedKey copy(@Nullable Object obj, @Nullable Object obj2) {
        return new JoinedKey(obj, obj2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JoinedKey) {
            JoinedKey joinedKey = (JoinedKey) obj;
            return Intrinsics.areEqual(this.f28422a, joinedKey.f28422a) && Intrinsics.areEqual(this.f28423b, joinedKey.f28423b);
        }
        return false;
    }

    @Nullable
    public final Object getLeft() {
        return this.f28422a;
    }

    @Nullable
    public final Object getRight() {
        return this.f28423b;
    }

    public int hashCode() {
        return (m60216a(this.f28422a) * 31) + m60216a(this.f28423b);
    }

    @NotNull
    public String toString() {
        return "JoinedKey(left=" + this.f28422a + ", right=" + this.f28423b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}