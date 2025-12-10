package androidx.compose.p003ui.tooling.data;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.nadOutbound.fragment.OneNadOutboundSearchFragment;

@StabilityInferred(parameters = 0)
@UiToolingDataApi
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, m29142d2 = {"Landroidx/compose/ui/tooling/data/JoinedKey;", "", OneNadOutboundSearchFragment.POSITION_LEFT, OneNadOutboundSearchFragment.POSITION_RIGHT, "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/ui/tooling/data/JoinedKey;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Object;", "getLeft", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getRight", "ui-tooling-data_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.data.JoinedKey */
/* loaded from: classes2.dex */
public final class JoinedKey {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Object f31805a;

    /* renamed from: b */
    public final Object f31806b;

    public JoinedKey(@Nullable Object obj, @Nullable Object obj2) {
        this.f31805a = obj;
        this.f31806b = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = joinedKey.f31805a;
        }
        if ((i & 2) != 0) {
            obj2 = joinedKey.f31806b;
        }
        return joinedKey.copy(obj, obj2);
    }

    @Nullable
    public final Object component1() {
        return this.f31805a;
    }

    @Nullable
    public final Object component2() {
        return this.f31806b;
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
            return Intrinsics.areEqual(this.f31805a, joinedKey.f31805a) && Intrinsics.areEqual(this.f31806b, joinedKey.f31806b);
        }
        return false;
    }

    @Nullable
    public final Object getLeft() {
        return this.f31805a;
    }

    @Nullable
    public final Object getRight() {
        return this.f31806b;
    }

    public int hashCode() {
        Object obj = this.f31805a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f31806b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "JoinedKey(left=" + this.f31805a + ", right=" + this.f31806b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}