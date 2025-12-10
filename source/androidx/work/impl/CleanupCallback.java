package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import androidx.work.Clock;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"Landroidx/work/impl/CleanupCallback;", "Landroidx/room/RoomDatabase$Callback;", "Landroidx/work/Clock;", "clock", "<init>", "(Landroidx/work/Clock;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "onOpen", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Ljava/lang/String;", "pruneSQL", "", "()J", "pruneDate", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CleanupCallback extends RoomDatabase.Callback {

    /* renamed from: a */
    public final Clock f38297a;

    public CleanupCallback(@NotNull Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f38297a = clock;
    }

    /* renamed from: a */
    public final long m52354a() {
        return this.f38297a.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
    }

    /* renamed from: b */
    public final String m52353b() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + m52354a() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    @NotNull
    public final Clock getClock() {
        return this.f38297a;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onOpen(db);
        db.beginTransaction();
        try {
            db.execSQL(m52353b());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
}
