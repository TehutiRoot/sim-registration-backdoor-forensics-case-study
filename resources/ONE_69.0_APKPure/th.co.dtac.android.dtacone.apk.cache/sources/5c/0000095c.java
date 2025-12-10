package p000;

import androidx.room.migration.Migration;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;

/* renamed from: Js0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C17918Js0 extends Migration {

    /* renamed from: a */
    public final Function1 f3137a;

    public C17918Js0(int i, int i2, Function1 function1) {
        super(i, i2);
        this.f3137a = function1;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        this.f3137a.invoke(supportSQLiteDatabase);
    }
}