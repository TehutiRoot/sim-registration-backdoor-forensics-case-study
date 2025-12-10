package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import androidx.sqlite.p007db.SimpleSQLiteQuery;
import androidx.sqlite.p007db.SupportSQLiteDatabase;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.AbstractC11687a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u0082\u00012\u00020\u0001:\n\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001BX\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\rB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\nH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\"\u0010#J'\u0010,\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0004\b-\u0010\u0011J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b3\u00102J\u0017\u00104\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b4\u00102J\u000f\u00108\u001a\u000205H\u0000¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u00020\u000fH\u0016¢\u0006\u0004\b9\u0010\u0011J\u000f\u0010:\u001a\u00020\u000fH\u0017¢\u0006\u0004\b:\u0010\u0011J#\u0010<\u001a\u00020\u000f2\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005H\u0007¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0000¢\u0006\u0004\b>\u0010#J\u000f\u0010?\u001a\u00020\u000fH\u0000¢\u0006\u0004\b>\u0010\u0011J;\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010@2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000AH\u0017¢\u0006\u0004\bD\u0010EJC\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010@2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n2\u0006\u0010F\u001a\u0002052\u000e\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000AH\u0017¢\u0006\u0004\bD\u0010GR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010LR+\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010LR&\u0010O\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00140\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bM\u0010NR\"\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010P\u001a\u0004\bQ\u0010RR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010TR\u001a\u0010Z\u001a\u00020U8GX\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010]\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR&\u0010t\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020o0n8\u0000X\u0081\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u0018\u0010x\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010{\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010zR\u001c\u0010\u007f\u001a\u00020~8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u007f\u0010\u0080\u0001\u0012\u0005\b\u0081\u0001\u0010\u0011¨\u0006\u0087\u0001"}, m28850d2 = {"Landroidx/room/InvalidationTracker;", "", "Landroidx/room/RoomDatabase;", "database", "", "", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "tableId", "e", "(Landroidx/sqlite/db/SupportSQLiteDatabase;I)V", "d", OperatorName.FILL_NON_ZERO, "([Ljava/lang/String;)[Ljava/lang/String;", "names", OperatorName.CURVE_TO, "Landroidx/room/AutoCloser;", "autoCloser", "setAutoCloser$room_runtime_release", "(Landroidx/room/AutoCloser;)V", "setAutoCloser", "internalInit$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "internalInit", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "name", "Landroid/content/Intent;", "serviceIntent", "startMultiInstanceInvalidation$room_runtime_release", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "startMultiInstanceInvalidation", "stopMultiInstanceInvalidation$room_runtime_release", "stopMultiInstanceInvalidation", "Landroidx/room/InvalidationTracker$Observer;", "observer", "addObserver", "(Landroidx/room/InvalidationTracker$Observer;)V", "addWeakObserver", "removeObserver", "", "ensureInitialization$room_runtime_release", "()Z", "ensureInitialization", "refreshVersionsAsync", "refreshVersionsSync", "tables", "notifyObserversByTableNames", "([Ljava/lang/String;)V", "syncTriggers$room_runtime_release", "syncTriggers", "T", "Ljava/util/concurrent/Callable;", "computeFunction", "Landroidx/lifecycle/LiveData;", "createLiveData", "([Ljava/lang/String;Ljava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", "inTransaction", "([Ljava/lang/String;ZLjava/util/concurrent/Callable;)Landroidx/lifecycle/LiveData;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/room/RoomDatabase;", "getDatabase$room_runtime_release", "()Landroidx/room/RoomDatabase;", "Ljava/util/Map;", "getTableIdLookup$room_runtime_release", "()Ljava/util/Map;", "tableIdLookup", "[Ljava/lang/String;", "getTablesNames$room_runtime_release", "()[Ljava/lang/String;", "tablesNames", "Landroidx/room/AutoCloser;", "Ljava/util/concurrent/atomic/AtomicBoolean;", OperatorName.NON_STROKING_GRAY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "getPendingRefresh", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", OperatorName.CLOSE_PATH, "Z", "initialized", "Landroidx/sqlite/db/SupportSQLiteStatement;", "i", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getCleanupStatement$room_runtime_release", "()Landroidx/sqlite/db/SupportSQLiteStatement;", "setCleanupStatement$room_runtime_release", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "cleanupStatement", "Landroidx/room/InvalidationTracker$ObservedTableTracker;", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/room/InvalidationTracker$ObservedTableTracker;", "observedTableTracker", "Landroidx/room/InvalidationLiveDataContainer;", OperatorName.NON_STROKING_CMYK, "Landroidx/room/InvalidationLiveDataContainer;", "invalidationLiveDataContainer", "Landroidx/arch/core/internal/SafeIterableMap;", "Landroidx/room/InvalidationTracker$ObserverWrapper;", OperatorName.LINE_TO, "Landroidx/arch/core/internal/SafeIterableMap;", "getObserverMap$room_runtime_release", "()Landroidx/arch/core/internal/SafeIterableMap;", "observerMap", "Landroidx/room/MultiInstanceInvalidationClient;", OperatorName.MOVE_TO, "Landroidx/room/MultiInstanceInvalidationClient;", "multiInstanceInvalidationClient", OperatorName.ENDPATH, "Ljava/lang/Object;", "syncTriggersLock", "o", "trackerLock", "Ljava/lang/Runnable;", "refreshRunnable", "Ljava/lang/Runnable;", "getRefreshRunnable$annotations", "Companion", "ObservedTableTracker", "Observer", "ObserverWrapper", "WeakObserver", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,840:1\n215#2,2:841\n11335#3:843\n11670#3,3:844\n13579#3,2:847\n13579#3,2:849\n13674#3,3:855\n37#4,2:851\n1855#5,2:853\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker\n*L\n102#1:841,2\n250#1:843\n250#1:844,3\n271#1:847,2\n287#1:849,2\n491#1:855,3\n294#1:851,2\n467#1:853,2\n*E\n"})
/* loaded from: classes2.dex */
public class InvalidationTracker {
    @NotNull
    public static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    @NotNull
    public static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";

    /* renamed from: a */
    public final RoomDatabase f37277a;

    /* renamed from: b */
    public final Map f37278b;

    /* renamed from: c */
    public final Map f37279c;

    /* renamed from: d */
    public final Map f37280d;

    /* renamed from: e */
    public final String[] f37281e;

    /* renamed from: f */
    public AutoCloser f37282f;

    /* renamed from: g */
    public final AtomicBoolean f37283g;

    /* renamed from: h */
    public volatile boolean f37284h;

    /* renamed from: i */
    public volatile SupportSQLiteStatement f37285i;

    /* renamed from: j */
    public final ObservedTableTracker f37286j;

    /* renamed from: k */
    public final InvalidationLiveDataContainer f37287k;

    /* renamed from: l */
    public final SafeIterableMap f37288l;

    /* renamed from: m */
    public MultiInstanceInvalidationClient f37289m;

    /* renamed from: n */
    public final Object f37290n;

    /* renamed from: o */
    public final Object f37291o;
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final Runnable refreshRunnable;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: p */
    public static final String[] f37276p = {"UPDATE", "DELETE", "INSERT"};

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28850d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "()V", "CREATE_TRACKING_TABLE_SQL", "", "INVALIDATED_COLUMN_NAME", "RESET_UPDATED_TABLES_SQL", "getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations", "SELECT_UPDATED_TABLES_SQL", "getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations", "TABLE_ID_COLUMN_NAME", "TRIGGERS", "", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "beginTransactionInternal", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "beginTransactionInternal$room_runtime_release", "getTriggerName", "tableName", "triggerType", "getTriggerName$room_runtime_release", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getRESET_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSELECT_UPDATED_TABLES_SQL$room_runtime_release$annotations() {
        }

        public final void beginTransactionInternal$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.isWriteAheadLoggingEnabled()) {
                database.beginTransactionNonExclusive();
            } else {
                database.beginTransaction();
            }
        }

        @NotNull
        public final String getTriggerName$room_runtime_release(@NotNull String tableName, @NotNull String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u000f\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\n\u0010\u0007\u001a\u00020\u0006\"\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, m28850d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker;", "", "", "tableCount", "<init>", "(I)V", "", "tableIds", "", "onAdded", "([I)Z", "onRemoved", "", "resetTriggerState", "()V", "getTablesToSync", "()[I", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "[J", "getTableObservers", "()[J", "tableObservers", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[Z", "triggerStates", OperatorName.CURVE_TO, "[I", "triggerStateChanges", "d", "Z", "getNeedsSync", "()Z", "setNeedsSync", "(Z)V", "needsSync", "Companion", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13600#2,2:841\n13600#2,2:843\n13684#2,3:845\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObservedTableTracker\n*L\n711#1:841,2\n729#1:843,2\n765#1:845,3\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ObservedTableTracker {
        public static final int ADD = 1;
        @NotNull
        public static final Companion Companion = new Companion(null);
        public static final int NO_OP = 0;
        public static final int REMOVE = 2;

        /* renamed from: a */
        public final long[] f37292a;

        /* renamed from: b */
        public final boolean[] f37293b;

        /* renamed from: c */
        public final int[] f37294c;

        /* renamed from: d */
        public boolean f37295d;

        @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m28850d2 = {"Landroidx/room/InvalidationTracker$ObservedTableTracker$Companion;", "", "()V", "ADD", "", "NO_OP", "REMOVE", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public ObservedTableTracker(int i) {
            this.f37292a = new long[i];
            this.f37293b = new boolean[i];
            this.f37294c = new int[i];
        }

        public final boolean getNeedsSync() {
            return this.f37295d;
        }

        @NotNull
        public final long[] getTableObservers() {
            return this.f37292a;
        }

        @VisibleForTesting
        @JvmName(name = "getTablesToSync")
        @Nullable
        public final int[] getTablesToSync() {
            boolean z;
            synchronized (this) {
                try {
                    if (!this.f37295d) {
                        return null;
                    }
                    long[] jArr = this.f37292a;
                    int length = jArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        int i4 = 1;
                        if (jArr[i] > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean[] zArr = this.f37293b;
                        if (z != zArr[i2]) {
                            int[] iArr = this.f37294c;
                            if (!z) {
                                i4 = 2;
                            }
                            iArr[i2] = i4;
                        } else {
                            this.f37294c[i2] = 0;
                        }
                        zArr[i2] = z;
                        i++;
                        i2 = i3;
                    }
                    this.f37295d = false;
                    return (int[]) this.f37294c.clone();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final boolean onAdded(@NotNull int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : tableIds) {
                        long[] jArr = this.f37292a;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            this.f37295d = true;
                            z = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z;
        }

        public final boolean onRemoved(@NotNull int... tableIds) {
            boolean z;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z = false;
                    for (int i : tableIds) {
                        long[] jArr = this.f37292a;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            this.f37295d = true;
                            z = true;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z;
        }

        public final void resetTriggerState() {
            synchronized (this) {
                Arrays.fill(this.f37293b, false);
                this.f37295d = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void setNeedsSync(boolean z) {
            this.f37295d = z;
        }
    }

    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m28850d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "firstTable", "rest", "(Ljava/lang/String;[Ljava/lang/String;)V", "", "", "onInvalidated", "(Ljava/util/Set;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "[Ljava/lang/String;", "getTables$room_runtime_release", "()[Ljava/lang/String;", "", "isRemote$room_runtime_release", "()Z", "isRemote", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,840:1\n37#2,2:841\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$Observer\n*L\n670#1:841,2\n*E\n"})
    /* loaded from: classes2.dex */
    public static abstract class Observer {

        /* renamed from: a */
        public final String[] f37296a;

        public Observer(@NotNull String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f37296a = tables;
        }

        @NotNull
        public final String[] getTables$room_runtime_release() {
            return this.f37296a;
        }

        public boolean isRemote$room_runtime_release() {
            return false;
        }

        public abstract void onInvalidated(@NotNull Set<String> set);

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Observer(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
            /*
                r2 = this;
                java.lang.String r0 = "firstTable"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "rest"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.util.List r0 = p000.AbstractC10108ds.createListBuilder()
                r1 = r0
                java.util.Collection r1 = (java.util.Collection) r1
                p000.AbstractC10410hs.addAll(r1, r4)
                r0.add(r3)
                java.util.List r3 = p000.AbstractC10108ds.build(r0)
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                java.lang.String[] r4 = new java.lang.String[r4]
                java.lang.Object[] r3 = r3.toArray(r4)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker.Observer.<init>(java.lang.String, java.lang.String[]):void");
        }
    }

    @Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m28850d2 = {"Landroidx/room/InvalidationTracker$ObserverWrapper;", "", "Landroidx/room/InvalidationTracker$Observer;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "notifyByTableInvalidStatus$room_runtime_release", "(Ljava/util/Set;)V", "notifyByTableInvalidStatus", "tables", "notifyByTableNames$room_runtime_release", "([Ljava/lang/String;)V", "notifyByTableNames", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/room/InvalidationTracker$Observer;", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "[I", "getTableIds$room_runtime_release", "()[I", OperatorName.CURVE_TO, "[Ljava/lang/String;", "d", "Ljava/util/Set;", "singleTableSet", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,840:1\n13674#2,3:841\n12744#2,2:844\n13579#2:846\n13579#2,2:847\n13580#2:849\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/InvalidationTracker$ObserverWrapper\n*L\n612#1:841,3\n634#1:844,2\n640#1:846\n641#1:847,2\n640#1:849\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class ObserverWrapper {

        /* renamed from: a */
        public final Observer f37297a;

        /* renamed from: b */
        public final int[] f37298b;

        /* renamed from: c */
        public final String[] f37299c;

        /* renamed from: d */
        public final Set f37300d;

        public ObserverWrapper(@NotNull Observer observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
            boolean z;
            Set emptySet;
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f37297a = observer;
            this.f37298b = tableIds;
            this.f37299c = tableNames;
            if (tableNames.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                emptySet = CG1.setOf(tableNames[0]);
            } else {
                emptySet = DG1.emptySet();
            }
            this.f37300d = emptySet;
            if (tableIds.length == tableNames.length) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        @NotNull
        public final Observer getObserver$room_runtime_release() {
            return this.f37297a;
        }

        @NotNull
        public final int[] getTableIds$room_runtime_release() {
            return this.f37298b;
        }

        public final void notifyByTableInvalidStatus$room_runtime_release(@NotNull Set<Integer> invalidatedTablesIds) {
            Set<String> emptySet;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f37298b;
            int length = iArr.length;
            if (length != 0) {
                int i = 0;
                if (length != 1) {
                    Set createSetBuilder = CG1.createSetBuilder();
                    int[] iArr2 = this.f37298b;
                    int length2 = iArr2.length;
                    int i2 = 0;
                    while (i < length2) {
                        int i3 = i2 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i]))) {
                            createSetBuilder.add(this.f37299c[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    emptySet = CG1.build(createSetBuilder);
                } else if (invalidatedTablesIds.contains(Integer.valueOf(iArr[0]))) {
                    emptySet = this.f37300d;
                } else {
                    emptySet = DG1.emptySet();
                }
            } else {
                emptySet = DG1.emptySet();
            }
            if (!emptySet.isEmpty()) {
                this.f37297a.onInvalidated(emptySet);
            }
        }

        public final void notifyByTableNames$room_runtime_release(@NotNull String[] tables) {
            Set<String> emptySet;
            String[] strArr;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f37299c.length;
            if (length != 0) {
                if (length != 1) {
                    Set createSetBuilder = CG1.createSetBuilder();
                    for (String str : tables) {
                        for (String str2 : this.f37299c) {
                            if (AbstractC20204hN1.equals(str2, str, true)) {
                                createSetBuilder.add(str2);
                            }
                        }
                    }
                    emptySet = CG1.build(createSetBuilder);
                } else {
                    int length2 = tables.length;
                    int i = 0;
                    while (true) {
                        if (i < length2) {
                            if (AbstractC20204hN1.equals(tables[i], this.f37299c[0], true)) {
                                emptySet = this.f37300d;
                                break;
                            }
                            i++;
                        } else {
                            emptySet = DG1.emptySet();
                            break;
                        }
                    }
                }
            } else {
                emptySet = DG1.emptySet();
            }
            if (!emptySet.isEmpty()) {
                this.f37297a.onInvalidated(emptySet);
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m28850d2 = {"Landroidx/room/InvalidationTracker$WeakObserver;", "Landroidx/room/InvalidationTracker$Observer;", "Landroidx/room/InvalidationTracker;", "tracker", "delegate", "<init>", "(Landroidx/room/InvalidationTracker;Landroidx/room/InvalidationTracker$Observer;)V", "", "", "tables", "", "onInvalidated", "(Ljava/util/Set;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/room/InvalidationTracker;", "getTracker", "()Landroidx/room/InvalidationTracker;", "Ljava/lang/ref/WeakReference;", OperatorName.CURVE_TO, "Ljava/lang/ref/WeakReference;", "getDelegateRef", "()Ljava/lang/ref/WeakReference;", "delegateRef", "room-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes2.dex */
    public static final class WeakObserver extends Observer {

        /* renamed from: b */
        public final InvalidationTracker f37301b;

        /* renamed from: c */
        public final WeakReference f37302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeakObserver(@NotNull InvalidationTracker tracker, @NotNull Observer delegate) {
            super(delegate.getTables$room_runtime_release());
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f37301b = tracker;
            this.f37302c = new WeakReference(delegate);
        }

        @NotNull
        public final WeakReference<Observer> getDelegateRef() {
            return this.f37302c;
        }

        @NotNull
        public final InvalidationTracker getTracker() {
            return this.f37301b;
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            Observer observer = (Observer) this.f37302c.get();
            if (observer == null) {
                this.f37301b.removeObserver(this);
            } else {
                observer.onInvalidated(tables);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull Map<String, String> shadowTablesMap, @NotNull Map<String, Set<String>> viewTables, @NotNull String... tableNames) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f37277a = database;
        this.f37278b = shadowTablesMap;
        this.f37279c = viewTables;
        this.f37283g = new AtomicBoolean(false);
        this.f37286j = new ObservedTableTracker(tableNames.length);
        this.f37287k = new InvalidationLiveDataContainer(database);
        this.f37288l = new SafeIterableMap();
        this.f37290n = new Object();
        this.f37291o = new Object();
        this.f37280d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = tableNames[i];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.f37280d.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.f37278b.get(tableNames[i]);
            if (str3 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = str3.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i] = lowerCase;
        }
        this.f37281e = strArr;
        for (Map.Entry entry : this.f37278b.entrySet()) {
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f37280d.containsKey(lowerCase2)) {
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f37280d;
                map.put(lowerCase3, AbstractC11687a.getValue(map, lowerCase2));
            }
        }
        this.refreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker$refreshRunnable$1
            /* renamed from: a */
            public final Set m52912a() {
                InvalidationTracker invalidationTracker = InvalidationTracker.this;
                Set createSetBuilder = CG1.createSetBuilder();
                Cursor query$default = RoomDatabase.query$default(invalidationTracker.getDatabase$room_runtime_release(), new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL), null, 2, null);
                while (query$default.moveToNext()) {
                    try {
                        createSetBuilder.add(Integer.valueOf(query$default.getInt(0)));
                    } finally {
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(query$default, null);
                Set build = CG1.build(createSetBuilder);
                if (!build.isEmpty()) {
                    if (InvalidationTracker.this.getCleanupStatement$room_runtime_release() != null) {
                        SupportSQLiteStatement cleanupStatement$room_runtime_release = InvalidationTracker.this.getCleanupStatement$room_runtime_release();
                        if (cleanupStatement$room_runtime_release != null) {
                            cleanupStatement$room_runtime_release.executeUpdateDelete();
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                return build;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
                if (r0 != null) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
                r0.decrementCountAndScheduleClose();
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
                if (r0 == null) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
                if (r0 == null) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
                if ((!r3.isEmpty()) == false) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
                r0 = r4.f37303a.getObserverMap$room_runtime_release();
                r1 = r4.f37303a;
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
                monitor-enter(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00c0, code lost:
                r1 = r1.getObserverMap$room_runtime_release().iterator();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
                if (r1.hasNext() == false) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x00ce, code lost:
                ((androidx.room.InvalidationTracker.ObserverWrapper) ((java.util.Map.Entry) r1.next()).getValue()).notifyByTableInvalidStatus$room_runtime_release(r3);
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
                r1 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00e0, code lost:
                r1 = kotlin.Unit.INSTANCE;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00e2, code lost:
                monitor-exit(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
                throw r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r4 = this;
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.RoomDatabase r0 = r0.getDatabase$room_runtime_release()
                    java.util.concurrent.locks.Lock r0 = r0.getCloseLock$room_runtime_release()
                    r0.lock()
                    r1 = 1
                    androidx.room.InvalidationTracker r2 = androidx.room.InvalidationTracker.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    boolean r2 = r2.ensureInitialization$room_runtime_release()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    if (r2 != 0) goto L25
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto L24
                    r0.decrementCountAndScheduleClose()
                L24:
                    return
                L25:
                    androidx.room.InvalidationTracker r2 = androidx.room.InvalidationTracker.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    java.util.concurrent.atomic.AtomicBoolean r2 = r2.getPendingRefresh()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    r3 = 0
                    boolean r2 = r2.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    if (r2 != 0) goto L41
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto L40
                    r0.decrementCountAndScheduleClose()
                L40:
                    return
                L41:
                    androidx.room.InvalidationTracker r2 = androidx.room.InvalidationTracker.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    androidx.room.RoomDatabase r2 = r2.getDatabase$room_runtime_release()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    boolean r2 = r2.inTransaction()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    if (r2 == 0) goto L5c
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto L5b
                    r0.decrementCountAndScheduleClose()
                L5b:
                    return
                L5c:
                    androidx.room.InvalidationTracker r2 = androidx.room.InvalidationTracker.this     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    androidx.room.RoomDatabase r2 = r2.getDatabase$room_runtime_release()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    androidx.sqlite.db.SupportSQLiteOpenHelper r2 = r2.getOpenHelper()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    r2.beginTransactionNonExclusive()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    java.util.Set r3 = r4.m52912a()     // Catch: java.lang.Throwable -> L88
                    r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L88
                    r2.endTransaction()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto Lad
                L82:
                    r0.decrementCountAndScheduleClose()
                    goto Lad
                L86:
                    r1 = move-exception
                    goto Le7
                L88:
                    r3 = move-exception
                    r2.endTransaction()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                    throw r3     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L8d java.lang.IllegalStateException -> L9d
                L8d:
                    java.util.Set r3 = p000.DG1.emptySet()     // Catch: java.lang.Throwable -> L86
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto Lad
                    goto L82
                L9d:
                    java.util.Set r3 = p000.DG1.emptySet()     // Catch: java.lang.Throwable -> L86
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto Lad
                    goto L82
                Lad:
                    r0 = r3
                    java.util.Collection r0 = (java.util.Collection) r0
                    boolean r0 = r0.isEmpty()
                    r0 = r0 ^ r1
                    if (r0 == 0) goto Le6
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.arch.core.internal.SafeIterableMap r0 = r0.getObserverMap$room_runtime_release()
                    androidx.room.InvalidationTracker r1 = androidx.room.InvalidationTracker.this
                    monitor-enter(r0)
                    androidx.arch.core.internal.SafeIterableMap r1 = r1.getObserverMap$room_runtime_release()     // Catch: java.lang.Throwable -> Lde
                    java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lde
                Lc8:
                    boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lde
                    if (r2 == 0) goto Le0
                    java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lde
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Lde
                    java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Lde
                    androidx.room.InvalidationTracker$ObserverWrapper r2 = (androidx.room.InvalidationTracker.ObserverWrapper) r2     // Catch: java.lang.Throwable -> Lde
                    r2.notifyByTableInvalidStatus$room_runtime_release(r3)     // Catch: java.lang.Throwable -> Lde
                    goto Lc8
                Lde:
                    r1 = move-exception
                    goto Le4
                Le0:
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lde
                    monitor-exit(r0)
                    goto Le6
                Le4:
                    monitor-exit(r0)
                    throw r1
                Le6:
                    return
                Le7:
                    r0.unlock()
                    androidx.room.InvalidationTracker r0 = androidx.room.InvalidationTracker.this
                    androidx.room.AutoCloser r0 = androidx.room.InvalidationTracker.access$getAutoCloser$p(r0)
                    if (r0 == 0) goto Lf5
                    r0.decrementCountAndScheduleClose()
                Lf5:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.InvalidationTracker$refreshRunnable$1.run():void");
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ void m52918a(InvalidationTracker invalidationTracker) {
        invalidationTracker.m52917b();
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$annotations() {
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@NotNull Observer observer) {
        ObserverWrapper observerWrapper;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] m52916c = m52916c(observer.getTables$room_runtime_release());
        ArrayList arrayList = new ArrayList(m52916c.length);
        for (String str : m52916c) {
            Map map = this.f37280d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num != null) {
                arrayList.add(num);
            } else {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
        }
        int[] intArray = CollectionsKt___CollectionsKt.toIntArray(arrayList);
        ObserverWrapper observerWrapper2 = new ObserverWrapper(observer, intArray, m52916c);
        synchronized (this.f37288l) {
            observerWrapper = (ObserverWrapper) this.f37288l.putIfAbsent(observer, observerWrapper2);
        }
        if (observerWrapper == null && this.f37286j.onAdded(Arrays.copyOf(intArray, intArray.length))) {
            syncTriggers$room_runtime_release();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(@NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        addObserver(new WeakObserver(this, observer));
    }

    /* renamed from: b */
    public final void m52917b() {
        synchronized (this.f37291o) {
            this.f37284h = false;
            this.f37286j.resetTriggerState();
            SupportSQLiteStatement supportSQLiteStatement = this.f37285i;
            if (supportSQLiteStatement != null) {
                supportSQLiteStatement.close();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* renamed from: c */
    public final String[] m52916c(String[] strArr) {
        Set createSetBuilder = CG1.createSetBuilder();
        for (String str : strArr) {
            Map map = this.f37279c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f37279c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.checkNotNull(obj);
                createSetBuilder.addAll((Collection) obj);
            } else {
                createSetBuilder.add(str);
            }
        }
        return (String[]) CG1.build(createSetBuilder).toArray(new String[0]);
    }

    @Deprecated(message = "Use [createLiveData(String[], boolean, Callable)]")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return createLiveData(tableNames, false, computeFunction);
    }

    /* renamed from: d */
    public final void m52915d(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.f37281e[i];
        for (String str2 : f37276p) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    /* renamed from: e */
    public final void m52914e(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String[] strArr;
        String str = this.f37281e[i];
        for (String str2 : f37276p) {
            String str3 = "DROP TRIGGER IF EXISTS " + Companion.getTriggerName$room_runtime_release(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            supportSQLiteDatabase.execSQL(str3);
        }
    }

    public final boolean ensureInitialization$room_runtime_release() {
        if (!this.f37277a.isOpenInternal()) {
            return false;
        }
        if (!this.f37284h) {
            this.f37277a.getOpenHelper().getWritableDatabase();
        }
        if (!this.f37284h) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String[] m52913f(String[] strArr) {
        String[] m52916c = m52916c(strArr);
        for (String str : m52916c) {
            Map map = this.f37280d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!map.containsKey(lowerCase)) {
                throw new IllegalArgumentException(("There is no table with name " + str).toString());
            }
        }
        return m52916c;
    }

    @Nullable
    public final SupportSQLiteStatement getCleanupStatement$room_runtime_release() {
        return this.f37285i;
    }

    @NotNull
    public final RoomDatabase getDatabase$room_runtime_release() {
        return this.f37277a;
    }

    @NotNull
    public final SafeIterableMap<Observer, ObserverWrapper> getObserverMap$room_runtime_release() {
        return this.f37288l;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @NotNull
    public final AtomicBoolean getPendingRefresh() {
        return this.f37283g;
    }

    @NotNull
    public final Map<String, Integer> getTableIdLookup$room_runtime_release() {
        return this.f37280d;
    }

    @NotNull
    public final String[] getTablesNames$room_runtime_release() {
        return this.f37281e;
    }

    public final void internalInit$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f37291o) {
            if (this.f37284h) {
                return;
            }
            database.execSQL("PRAGMA temp_store = MEMORY;");
            database.execSQL("PRAGMA recursive_triggers='ON';");
            database.execSQL("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            syncTriggers$room_runtime_release(database);
            this.f37285i = database.compileStatement(RESET_UPDATED_TABLES_SQL);
            this.f37284h = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyObserversByTableNames(@NotNull String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f37288l) {
            try {
                for (Map.Entry entry : this.f37288l) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    ObserverWrapper observerWrapper = (ObserverWrapper) entry.getValue();
                    if (!((Observer) entry.getKey()).isRemote$room_runtime_release()) {
                        observerWrapper.notifyByTableNames$room_runtime_release(tables);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void refreshVersionsAsync() {
        if (this.f37283g.compareAndSet(false, true)) {
            AutoCloser autoCloser = this.f37282f;
            if (autoCloser != null) {
                autoCloser.incrementCountAndEnsureDbIsOpen();
            }
            this.f37277a.getQueryExecutor().execute(this.refreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        AutoCloser autoCloser = this.f37282f;
        if (autoCloser != null) {
            autoCloser.incrementCountAndEnsureDbIsOpen();
        }
        syncTriggers$room_runtime_release();
        this.refreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@NotNull Observer observer) {
        ObserverWrapper observerWrapper;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f37288l) {
            observerWrapper = (ObserverWrapper) this.f37288l.remove(observer);
        }
        if (observerWrapper != null) {
            ObservedTableTracker observedTableTracker = this.f37286j;
            int[] tableIds$room_runtime_release = observerWrapper.getTableIds$room_runtime_release();
            if (observedTableTracker.onRemoved(Arrays.copyOf(tableIds$room_runtime_release, tableIds$room_runtime_release.length))) {
                syncTriggers$room_runtime_release();
            }
        }
    }

    public final void setAutoCloser$room_runtime_release(@NotNull AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f37282f = autoCloser;
        autoCloser.setAutoCloseCallback(new Runnable() { // from class: kg0
            {
                InvalidationTracker.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                InvalidationTracker.m52918a(InvalidationTracker.this);
            }
        });
    }

    public final void setCleanupStatement$room_runtime_release(@Nullable SupportSQLiteStatement supportSQLiteStatement) {
        this.f37285i = supportSQLiteStatement;
    }

    public final void startMultiInstanceInvalidation$room_runtime_release(@NotNull Context context, @NotNull String name, @NotNull Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f37289m = new MultiInstanceInvalidationClient(context, name, serviceIntent, this, this.f37277a.getQueryExecutor());
    }

    public final void stopMultiInstanceInvalidation$room_runtime_release() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f37289m;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
        }
        this.f37289m = null;
    }

    public final void syncTriggers$room_runtime_release(@NotNull SupportSQLiteDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.inTransaction()) {
            return;
        }
        try {
            Lock closeLock$room_runtime_release = this.f37277a.getCloseLock$room_runtime_release();
            closeLock$room_runtime_release.lock();
            synchronized (this.f37290n) {
                int[] tablesToSync = this.f37286j.getTablesToSync();
                if (tablesToSync == null) {
                    closeLock$room_runtime_release.unlock();
                    return;
                }
                Companion.beginTransactionInternal$room_runtime_release(database);
                int length = tablesToSync.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = tablesToSync[i];
                    int i4 = i2 + 1;
                    if (i3 == 1) {
                        m52915d(database, i2);
                    } else if (i3 == 2) {
                        m52914e(database, i2);
                    }
                    i++;
                    i2 = i4;
                }
                database.setTransactionSuccessful();
                database.endTransaction();
                Unit unit = Unit.INSTANCE;
                closeLock$room_runtime_release.unlock();
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public <T> LiveData<T> createLiveData(@NotNull String[] tableNames, boolean z, @NotNull Callable<T> computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return this.f37287k.create(m52913f(tableNames), z, computeFunction);
    }

    public final void syncTriggers$room_runtime_release() {
        if (this.f37277a.isOpenInternal()) {
            syncTriggers$room_runtime_release(this.f37277a.getOpenHelper().getWritableDatabase());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(@NotNull RoomDatabase database, @NotNull String... tableNames) {
        this(database, AbstractC11687a.emptyMap(), AbstractC11687a.emptyMap(), (String[]) Arrays.copyOf(tableNames, tableNames.length));
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
    }
}
