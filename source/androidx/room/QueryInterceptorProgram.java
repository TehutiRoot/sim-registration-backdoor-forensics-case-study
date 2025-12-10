package androidx.room;

import androidx.sqlite.p007db.SupportSQLiteProgram;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m28850d2 = {"Landroidx/room/QueryInterceptorProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "<init>", "()V", "", FirebaseAnalytics.Param.INDEX, "", "bindNull", "(I)V", "", "value", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "close", "bindIndex", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(ILjava/lang/Object;)V", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "getBindArgsCache$room_runtime_release", "()Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class QueryInterceptorProgram implements SupportSQLiteProgram {

    /* renamed from: a */
    public final List f37334a = new ArrayList();

    /* renamed from: b */
    public final void m52881b(int i, Object obj) {
        int size;
        int i2 = i - 1;
        if (i2 >= this.f37334a.size() && (size = this.f37334a.size()) <= i2) {
            while (true) {
                this.f37334a.add(null);
                if (size == i2) {
                    break;
                }
                size++;
            }
        }
        this.f37334a.set(i2, obj);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindBlob(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m52881b(i, value);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindDouble(int i, double d) {
        m52881b(i, Double.valueOf(d));
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindLong(int i, long j) {
        m52881b(i, Long.valueOf(j));
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindNull(int i) {
        m52881b(i, null);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void bindString(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        m52881b(i, value);
    }

    @Override // androidx.sqlite.p007db.SupportSQLiteProgram
    public void clearBindings() {
        this.f37334a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    public final List<Object> getBindArgsCache$room_runtime_release() {
        return this.f37334a;
    }
}
