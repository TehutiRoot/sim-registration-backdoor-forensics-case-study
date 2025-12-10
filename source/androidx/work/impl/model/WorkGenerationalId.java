package androidx.work.impl.model;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m28850d2 = {"Landroidx/work/impl/model/WorkGenerationalId;", "", "", "workSpecId", "", "generation", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Landroidx/work/impl/model/WorkGenerationalId;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getWorkSpecId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getGeneration", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WorkGenerationalId {

    /* renamed from: a */
    public final String f38586a;

    /* renamed from: b */
    public final int f38587b;

    public WorkGenerationalId(@NotNull String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f38586a = workSpecId;
        this.f38587b = i;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = workGenerationalId.f38586a;
        }
        if ((i2 & 2) != 0) {
            i = workGenerationalId.f38587b;
        }
        return workGenerationalId.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.f38586a;
    }

    public final int component2() {
        return this.f38587b;
    }

    @NotNull
    public final WorkGenerationalId copy(@NotNull String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WorkGenerationalId) {
            WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
            return Intrinsics.areEqual(this.f38586a, workGenerationalId.f38586a) && this.f38587b == workGenerationalId.f38587b;
        }
        return false;
    }

    public final int getGeneration() {
        return this.f38587b;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.f38586a;
    }

    public int hashCode() {
        return (this.f38586a.hashCode() * 31) + this.f38587b;
    }

    @NotNull
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f38586a + ", generation=" + this.f38587b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
