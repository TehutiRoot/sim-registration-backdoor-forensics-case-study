package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.IdGenerator;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28850d2 = {"Landroidx/work/impl/utils/IdGenerator;", "", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "<init>", "(Landroidx/work/impl/WorkDatabase;)V", "", "minInclusive", "maxInclusive", "nextJobSchedulerIdWithRange", "(II)I", "nextAlarmManagerId", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/work/impl/WorkDatabase;", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IdGenerator {

    /* renamed from: a */
    public final WorkDatabase f38708a;

    public IdGenerator(@NotNull WorkDatabase workDatabase) {
        Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
        this.f38708a = workDatabase;
    }

    /* renamed from: a */
    public static /* synthetic */ Integer m52171a(IdGenerator idGenerator, int i, int i2) {
        return m52168d(idGenerator, i, i2);
    }

    /* renamed from: b */
    public static /* synthetic */ Integer m52170b(IdGenerator idGenerator) {
        return m52169c(idGenerator);
    }

    /* renamed from: c */
    public static final Integer m52169c(IdGenerator this$0) {
        int m52167a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m52167a = IdGeneratorKt.m52167a(this$0.f38708a, IdGeneratorKt.NEXT_ALARM_MANAGER_ID_KEY);
        return Integer.valueOf(m52167a);
    }

    /* renamed from: d */
    public static final Integer m52168d(IdGenerator this$0, int i, int i2) {
        int m52167a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        m52167a = IdGeneratorKt.m52167a(this$0.f38708a, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY);
        if (i > m52167a || m52167a > i2) {
            IdGeneratorKt.m52166b(this$0.f38708a, IdGeneratorKt.NEXT_JOB_SCHEDULER_ID_KEY, i + 1);
        } else {
            i = m52167a;
        }
        return Integer.valueOf(i);
    }

    public final int nextAlarmManagerId() {
        Object runInTransaction = this.f38708a.runInTransaction(new Callable() { // from class: yc0
            {
                IdGenerator.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.m52170b(IdGenerator.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) runInTransaction).intValue();
    }

    public final int nextJobSchedulerIdWithRange(final int i, final int i2) {
        Object runInTransaction = this.f38708a.runInTransaction(new Callable() { // from class: zc0
            {
                IdGenerator.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return IdGenerator.m52171a(IdGenerator.this, i, i2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) runInTransaction).intValue();
    }
}
