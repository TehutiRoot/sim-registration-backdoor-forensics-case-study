package p000;

import androidx.room.migration.Migration;
import androidx.sqlite.p007db.SupportSQLiteDatabase;

/* renamed from: h62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20155h62 extends Migration {
    public C20155h62() {
        super(17, 18);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807");
        supportSQLiteDatabase.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0");
    }
}
