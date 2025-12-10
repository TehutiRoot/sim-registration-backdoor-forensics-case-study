package p000;

import androidx.room.migration.Migration;
import androidx.sqlite.p007db.SupportSQLiteDatabase;

/* renamed from: i62  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C20327i62 extends Migration {
    public C20327i62() {
        super(18, 19);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `WorkSpec` ADD COLUMN `stop_reason` INTEGER NOT NULL DEFAULT -256");
    }
}
