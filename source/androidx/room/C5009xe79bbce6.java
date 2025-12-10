package androidx.room;

import androidx.sqlite.p007db.SupportSQLiteStatement;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "obj", "Landroidx/sqlite/db/SupportSQLiteStatement;", "invoke", "(Landroidx/sqlite/db/SupportSQLiteStatement;)Ljava/lang/Long;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1 */
/* loaded from: classes2.dex */
public final class C5009xe79bbce6 extends Lambda implements Function1<SupportSQLiteStatement, Long> {
    public static final C5009xe79bbce6 INSTANCE = new C5009xe79bbce6();

    public C5009xe79bbce6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Long invoke(@NotNull SupportSQLiteStatement obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        return Long.valueOf(obj.executeInsert());
    }
}
