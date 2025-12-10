package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u001b\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0016\u0010\u0019J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u001a2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001b\u0010\u001dJ%\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001e\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, m29142d2 = {"Landroidx/room/EntityUpsertionAdapter;", "T", "", "Landroidx/room/EntityInsertionAdapter;", "insertionAdapter", "Landroidx/room/EntityDeletionOrUpdateAdapter;", "updateAdapter", "<init>", "(Landroidx/room/EntityInsertionAdapter;Landroidx/room/EntityDeletionOrUpdateAdapter;)V", "entity", "", "upsert", "(Ljava/lang/Object;)V", "", "entities", "([Ljava/lang/Object;)V", "", "(Ljava/lang/Iterable;)V", "", "upsertAndReturnId", "(Ljava/lang/Object;)J", "", "upsertAndReturnIdsArray", "([Ljava/lang/Object;)[J", "", "(Ljava/util/Collection;)[J", "", "upsertAndReturnIdsList", "([Ljava/lang/Object;)Ljava/util/List;", "(Ljava/util/Collection;)Ljava/util/List;", "upsertAndReturnIdsArrayBox", "([Ljava/lang/Object;)[Ljava/lang/Long;", "(Ljava/util/Collection;)[Ljava/lang/Long;", "Landroid/database/sqlite/SQLiteConstraintException;", "ex", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/database/sqlite/SQLiteConstraintException;)V", "Landroidx/room/EntityInsertionAdapter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/room/EntityDeletionOrUpdateAdapter;", "room-runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@SourceDebugExtension({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
/* loaded from: classes2.dex */
public final class EntityUpsertionAdapter<T> {

    /* renamed from: a */
    public final EntityInsertionAdapter f37357a;

    /* renamed from: b */
    public final EntityDeletionOrUpdateAdapter f37358b;

    public EntityUpsertionAdapter(@NotNull EntityInsertionAdapter<T> insertionAdapter, @NotNull EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.f37357a = insertionAdapter;
        this.f37358b = updateAdapter;
    }

    /* renamed from: a */
    public final void m52870a(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message != null) {
            if (!StringsKt__StringsKt.contains((CharSequence) message, (CharSequence) "unique", true) && !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "2067", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "1555", false, 2, (Object) null)) {
                throw sQLiteConstraintException;
            }
            return;
        }
        throw sQLiteConstraintException;
    }

    public final void upsert(T t) {
        try {
            this.f37357a.insert((EntityInsertionAdapter) t);
        } catch (SQLiteConstraintException e) {
            m52870a(e);
            this.f37358b.handle(t);
        }
    }

    public final long upsertAndReturnId(T t) {
        try {
            return this.f37357a.insertAndReturnId(t);
        } catch (SQLiteConstraintException e) {
            m52870a(e);
            this.f37358b.handle(t);
            return -1L;
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull T[] entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.f37357a.insertAndReturnId(entities[i]);
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(entities[i]);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull T[] entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.f37357a.insertAndReturnId(entities[i]);
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(entities[i]);
                j = -1;
            }
            lArr[i] = Long.valueOf(j);
        }
        return lArr;
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List createListBuilder = AbstractC10100ds.createListBuilder();
        for (T t : entities) {
            try {
                createListBuilder.add(Long.valueOf(this.f37357a.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(t);
                createListBuilder.add(-1L);
            }
        }
        return AbstractC10100ds.build(createListBuilder);
    }

    public final void upsert(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t : entities) {
            try {
                this.f37357a.insert((EntityInsertionAdapter) t);
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(t);
            }
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull Collection<? extends T> entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                j = this.f37357a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(next);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull Collection<? extends T> entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                j = this.f37357a.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(next);
                j = -1;
            }
            lArr[i] = Long.valueOf(j);
        }
        return lArr;
    }

    public final void upsert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t : entities) {
            try {
                this.f37357a.insert((EntityInsertionAdapter) t);
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(t);
            }
        }
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        List createListBuilder = AbstractC10100ds.createListBuilder();
        for (T t : entities) {
            try {
                createListBuilder.add(Long.valueOf(this.f37357a.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                m52870a(e);
                this.f37358b.handle(t);
                createListBuilder.add(-1L);
            }
        }
        return AbstractC10100ds.build(createListBuilder);
    }
}