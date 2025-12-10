package androidx.sqlite.p007db.framework;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m28850d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "", "execute", "()V", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "", "simpleQueryForString", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/database/sqlite/SQLiteStatement;", "sqlite-framework_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteStatement */
/* loaded from: classes2.dex */
public final class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* renamed from: b */
    public final SQLiteStatement f37520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteStatement(@NotNull SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f37520b = delegate;
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public void execute() {
        this.f37520b.execute();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public long executeInsert() {
        return this.f37520b.executeInsert();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public int executeUpdateDelete() {
        return this.f37520b.executeUpdateDelete();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    public long simpleQueryForLong() {
        return this.f37520b.simpleQueryForLong();
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteStatement
    @Nullable
    public String simpleQueryForString() {
        return this.f37520b.simpleQueryForString();
    }
}
