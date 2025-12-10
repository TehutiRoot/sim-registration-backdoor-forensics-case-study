package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001e"}, m28850d2 = {"Landroidx/room/SharedSQLiteStatement;", "", "Landroidx/room/RoomDatabase;", "database", "<init>", "(Landroidx/room/RoomDatabase;)V", "", "createQuery", "()Ljava/lang/String;", "", "assertNotMainThread", "()V", "Landroidx/sqlite/db/SupportSQLiteStatement;", "acquire", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "statement", "release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "canUseCached", OperatorName.CURVE_TO, "(Z)Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroidx/room/RoomDatabase;", "Ljava/util/concurrent/atomic/AtomicBoolean;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "lock", "Lkotlin/Lazy;", "stmt", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class SharedSQLiteStatement {

    /* renamed from: a */
    public final RoomDatabase f37417a;

    /* renamed from: b */
    public final AtomicBoolean f37418b;

    /* renamed from: c */
    public final Lazy f37419c;

    public SharedSQLiteStatement(@NotNull RoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f37417a = database;
        this.f37418b = new AtomicBoolean(false);
        this.f37419c = LazyKt__LazyJVMKt.lazy(new SharedSQLiteStatement$stmt$2(this));
    }

    /* renamed from: a */
    public final SupportSQLiteStatement m52851a() {
        return this.f37417a.compileStatement(createQuery());
    }

    @NotNull
    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return m52849c(this.f37418b.compareAndSet(false, true));
    }

    public void assertNotMainThread() {
        this.f37417a.assertNotMainThread();
    }

    /* renamed from: b */
    public final SupportSQLiteStatement m52850b() {
        return (SupportSQLiteStatement) this.f37419c.getValue();
    }

    /* renamed from: c */
    public final SupportSQLiteStatement m52849c(boolean z) {
        if (z) {
            return m52850b();
        }
        return m52851a();
    }

    @NotNull
    public abstract String createQuery();

    public void release(@NotNull SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == m52850b()) {
            this.f37418b.set(false);
        }
    }
}
