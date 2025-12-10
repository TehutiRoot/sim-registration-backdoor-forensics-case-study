package p000;

import androidx.room.migration.Migration;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;

/* renamed from: Ds0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17501Ds0 extends Migration {

    /* renamed from: a */
    public final Function1 f1129a;

    public C17501Ds0(int i, int i2, Function1 function1) {
        super(i, i2);
        this.f1129a = function1;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.f1129a.invoke(supportSQLiteDatabase);
    }
}
