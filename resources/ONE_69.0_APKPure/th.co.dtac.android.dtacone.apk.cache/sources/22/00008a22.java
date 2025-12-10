package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import ch.qos.logback.core.CoreConstants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;
import org.apache.commons.logging.LogFactory;

@Singleton
@WorkerThread
/* loaded from: classes3.dex */
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {

    /* renamed from: f */
    public static final Encoding f44222f = Encoding.m49166of("proto");

    /* renamed from: a */
    public final SchemaManager f44223a;

    /* renamed from: b */
    public final Clock f44224b;

    /* renamed from: c */
    public final Clock f44225c;

    /* renamed from: d */
    public final AbstractC1667XS f44226d;

    /* renamed from: e */
    public final Provider f44227e;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC6281b {
        Object apply(Object obj);
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$c */
    /* loaded from: classes3.dex */
    public static class C6282c {

        /* renamed from: a */
        public final String f44228a;

        /* renamed from: b */
        public final String f44229b;

        public C6282c(String str, String str2) {
            this.f44228a = str;
            this.f44229b = str2;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC6283d {
        /* renamed from: a */
        Object mo48982a();
    }

    public SQLiteEventStore(Clock clock, Clock clock2, AbstractC1667XS abstractC1667XS, SchemaManager schemaManager, Provider provider) {
        this.f44223a = schemaManager;
        this.f44224b = clock;
        this.f44225c = clock2;
        this.f44226d = abstractC1667XS;
        this.f44227e = provider;
    }

    /* renamed from: A */
    public static /* synthetic */ Object m49055A(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext, Cursor cursor) {
        return sQLiteEventStore.m49019h0(list, transportContext, cursor);
    }

    /* renamed from: B */
    public static /* synthetic */ Object m49054B(SQLiteEventStore sQLiteEventStore, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.m49001q0(sQLiteDatabase);
    }

    /* renamed from: D */
    public static /* synthetic */ Long m49052D(Cursor cursor) {
        return m49032X(cursor);
    }

    /* renamed from: E */
    public static /* synthetic */ TimeWindow m49051E(long j, SQLiteDatabase sQLiteDatabase) {
        return m49030Z(j, sQLiteDatabase);
    }

    /* renamed from: T */
    public static /* synthetic */ Object m49036T(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    /* renamed from: V */
    public static /* synthetic */ Object m49034V(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    /* renamed from: W */
    public static /* synthetic */ SQLiteDatabase m49033W(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    /* renamed from: X */
    public static /* synthetic */ Long m49032X(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: Y */
    public static /* synthetic */ TimeWindow m49031Y(long j, Cursor cursor) {
        cursor.moveToNext();
        return TimeWindow.newBuilder().setStartMs(cursor.getLong(0)).setEndMs(j).build();
    }

    /* renamed from: Z */
    public static /* synthetic */ TimeWindow m49030Z(final long j, SQLiteDatabase sQLiteDatabase) {
        return (TimeWindow) m48983z0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC6281b() { // from class: RD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49028b(j, (Cursor) obj);
            }
        });
    }

    /* renamed from: a0 */
    public static /* synthetic */ Long m49029a0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: b */
    public static /* synthetic */ TimeWindow m49028b(long j, Cursor cursor) {
        return m49031Y(j, cursor);
    }

    /* renamed from: c0 */
    public static /* synthetic */ List m49026c0(SQLiteDatabase sQLiteDatabase) {
        return (List) m48983z0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC6281b() { // from class: ND1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49021g((Cursor) obj);
            }
        });
    }

    /* renamed from: d */
    public static /* synthetic */ List m49025d(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.m49023e0(transportContext, sQLiteDatabase);
    }

    /* renamed from: d0 */
    public static /* synthetic */ List m49024d0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(PriorityMapping.valueOf(cursor.getInt(2))).setExtras(m48995t0(cursor.getString(3))).build());
        }
        return arrayList;
    }

    /* renamed from: g */
    public static /* synthetic */ List m49021g(Cursor cursor) {
        return m49024d0(cursor);
    }

    /* renamed from: i */
    public static /* synthetic */ Object m49018i(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        return sQLiteEventStore.m49011l0(cursor);
    }

    /* renamed from: i0 */
    public static /* synthetic */ Object m49017i0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C6282c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* renamed from: j */
    public static /* synthetic */ SQLiteDatabase m49016j(Throwable th2) {
        return m49033W(th2);
    }

    /* renamed from: k */
    public static /* synthetic */ Object m49014k(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        return sQLiteEventStore.m49038R(cursor);
    }

    /* renamed from: k0 */
    public static /* synthetic */ byte[] m49013k0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: l */
    public static /* synthetic */ Object m49012l(SQLiteEventStore sQLiteEventStore, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.m49009m0(str, str2, sQLiteDatabase);
    }

    /* renamed from: m */
    public static /* synthetic */ Boolean m49010m(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.m49027b0(transportContext, sQLiteDatabase);
    }

    /* renamed from: n */
    public static /* synthetic */ Object m49008n(long j, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return m49003p0(j, transportContext, sQLiteDatabase);
    }

    /* renamed from: n0 */
    public static /* synthetic */ Boolean m49007n0(Cursor cursor) {
        boolean z;
        if (cursor.getCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public static /* synthetic */ byte[] m49006o(Cursor cursor) {
        return m49013k0(cursor);
    }

    /* renamed from: o0 */
    public static /* synthetic */ Object m49005o0(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m48983z0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new InterfaceC6281b() { // from class: KD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49000r((Cursor) obj);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(reason.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
        }
        return null;
    }

    /* renamed from: p */
    public static /* synthetic */ List m49004p(SQLiteDatabase sQLiteDatabase) {
        return m49026c0(sQLiteDatabase);
    }

    /* renamed from: p0 */
    public static /* synthetic */ Object m49003p0(long j, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}) < 1) {
            contentValues.put("backend_name", transportContext.getBackendName());
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: q */
    public static /* synthetic */ ClientMetrics m49002q(SQLiteEventStore sQLiteEventStore, Map map, ClientMetrics.Builder builder, Cursor cursor) {
        return sQLiteEventStore.m49022f0(map, builder, cursor);
    }

    /* renamed from: r */
    public static /* synthetic */ Boolean m49000r(Cursor cursor) {
        return m49007n0(cursor);
    }

    /* renamed from: s */
    public static /* synthetic */ Object m48998s(SQLiteDatabase sQLiteDatabase) {
        return m49036T(sQLiteDatabase);
    }

    /* renamed from: t */
    public static /* synthetic */ Long m48996t(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.m49015j0(eventInternal, transportContext, sQLiteDatabase);
    }

    /* renamed from: t0 */
    public static byte[] m48995t0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: u */
    public static /* synthetic */ Object m48994u(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.beginTransaction();
    }

    /* renamed from: v */
    public static /* synthetic */ Long m48992v(Cursor cursor) {
        return m49029a0(cursor);
    }

    /* renamed from: w */
    public static /* synthetic */ Object m48990w(Throwable th2) {
        return m49034V(th2);
    }

    /* renamed from: x */
    public static /* synthetic */ Object m48988x(String str, LogEventDropped.Reason reason, long j, SQLiteDatabase sQLiteDatabase) {
        return m49005o0(str, reason, j, sQLiteDatabase);
    }

    /* renamed from: x0 */
    public static Encoding m48987x0(String str) {
        if (str == null) {
            return f44222f;
        }
        return Encoding.m49166of(str);
    }

    /* renamed from: y */
    public static /* synthetic */ Object m48986y(Map map, Cursor cursor) {
        return m49017i0(map, cursor);
    }

    /* renamed from: y0 */
    public static String m48985y0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((PersistedEvent) it.next()).getId());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    /* renamed from: z */
    public static /* synthetic */ Integer m48984z(SQLiteEventStore sQLiteEventStore, long j, SQLiteDatabase sQLiteDatabase) {
        return sQLiteEventStore.m49037S(j, sQLiteDatabase);
    }

    /* renamed from: z0 */
    public static Object m48983z0(Cursor cursor, InterfaceC6281b interfaceC6281b) {
        try {
            return interfaceC6281b.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: F */
    public final LogEventDropped.Reason m49050F(int i) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i == reason7.getNumber()) {
            return reason7;
        }
        Logging.m49113d("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return reason;
    }

    /* renamed from: G */
    public final void m49049G(final SQLiteDatabase sQLiteDatabase) {
        m48989w0(new InterfaceC6283d() { // from class: SD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6283d
            /* renamed from: a */
            public final Object mo48982a() {
                return SQLiteEventStore.m48994u(sQLiteDatabase);
            }
        }, new InterfaceC6281b() { // from class: TD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48990w((Throwable) obj);
            }
        });
    }

    /* renamed from: H */
    public final long m49048H(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        Long m49042N = m49042N(sQLiteDatabase, transportContext);
        if (m49042N != null) {
            return m49042N.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", transportContext.getBackendName());
        contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (transportContext.getExtras() != null) {
            contentValues.put("extras", Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: I */
    public long m49047I() {
        return m49044L() * getPageSize();
    }

    /* renamed from: J */
    public SQLiteDatabase m49046J() {
        final SchemaManager schemaManager = this.f44223a;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) m48989w0(new InterfaceC6283d() { // from class: WD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6283d
            /* renamed from: a */
            public final Object mo48982a() {
                return SchemaManager.this.getWritableDatabase();
            }
        }, new InterfaceC6281b() { // from class: XD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49016j((Throwable) obj);
            }
        });
    }

    /* renamed from: K */
    public final GlobalMetrics m49045K() {
        return GlobalMetrics.newBuilder().setStorageMetrics(StorageMetrics.newBuilder().setCurrentCacheSizeBytes(m49047I()).setMaxCacheSizeBytes(AbstractC1667XS.f7559a.mo22869f()).build()).build();
    }

    /* renamed from: L */
    public final long m49044L() {
        return m49046J().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: M */
    public final TimeWindow m49043M() {
        final long time = this.f44224b.getTime();
        return (TimeWindow) m49041O(new InterfaceC6281b() { // from class: QD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49051E(time, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: N */
    public final Long m49042N(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.getExtras(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m48983z0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new InterfaceC6281b() { // from class: ID1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48992v((Cursor) obj);
            }
        });
    }

    /* renamed from: O */
    public Object m49041O(InterfaceC6281b interfaceC6281b) {
        SQLiteDatabase m49046J = m49046J();
        m49046J.beginTransaction();
        try {
            Object apply = interfaceC6281b.apply(m49046J);
            m49046J.setTransactionSuccessful();
            return apply;
        } finally {
            m49046J.endTransaction();
        }
    }

    /* renamed from: P */
    public final boolean m49040P() {
        if (m49044L() * getPageSize() >= this.f44226d.mo22869f()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    public final List m49039Q(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
            if (map.containsKey(Long.valueOf(persistedEvent.getId()))) {
                EventInternal.Builder builder = persistedEvent.getEvent().toBuilder();
                for (C6282c c6282c : (Set) map.get(Long.valueOf(persistedEvent.getId()))) {
                    builder.addMetadata(c6282c.f44228a, c6282c.f44229b);
                }
                listIterator.set(PersistedEvent.create(persistedEvent.getId(), persistedEvent.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    /* renamed from: R */
    public final /* synthetic */ Object m49038R(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            recordLogEventDropped(i, LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: S */
    public final /* synthetic */ Integer m49037S(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m48983z0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC6281b() { // from class: OD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49014k(SQLiteEventStore.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: b0 */
    public final /* synthetic */ Boolean m49027b0(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Long m49042N = m49042N(sQLiteDatabase, transportContext);
        if (m49042N == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m48983z0(m49046J().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m49042N.toString()}), new InterfaceC6281b() { // from class: FD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        final long time = this.f44224b.getTime() - this.f44226d.mo22872c();
        return ((Integer) m49041O(new InterfaceC6281b() { // from class: BD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48984z(SQLiteEventStore.this, time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void clearDb() {
        m49041O(new InterfaceC6281b() { // from class: UD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48998s((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f44223a.close();
    }

    /* renamed from: e0 */
    public final /* synthetic */ List m49023e0(TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Priority[] values;
        List m48999r0 = m48999r0(sQLiteDatabase, transportContext, this.f44226d.mo22871d());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.getPriority()) {
                int mo22871d = this.f44226d.mo22871d() - m48999r0.size();
                if (mo22871d <= 0) {
                    break;
                }
                m48999r0.addAll(m48999r0(sQLiteDatabase, transportContext.withPriority(priority), mo22871d));
            }
        }
        return m49039Q(m48999r0, m48997s0(sQLiteDatabase, m48999r0));
    }

    /* renamed from: f0 */
    public final /* synthetic */ ClientMetrics m49022f0(Map map, ClientMetrics.Builder builder, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason m49050F = m49050F(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.newBuilder().setReason(m49050F).setEventsDroppedCount(j).build());
        }
        m48993u0(builder, map);
        return builder.setWindow(m49043M()).setGlobalMetrics(m49045K()).setAppNamespace((String) this.f44227e.get()).build();
    }

    /* renamed from: g0 */
    public final /* synthetic */ ClientMetrics m49020g0(String str, final Map map, final ClientMetrics.Builder builder, SQLiteDatabase sQLiteDatabase) {
        return (ClientMetrics) m48983z0(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC6281b() { // from class: LD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49002q(SQLiteEventStore.this, map, builder, (Cursor) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext) {
        return ((Long) m48983z0(m49046J().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}), new InterfaceC6281b() { // from class: ED1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49052D((Cursor) obj);
            }
        })).longValue();
    }

    public final long getPageSize() {
        return m49046J().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: h0 */
    public final /* synthetic */ Object m49019h0(List list, TransportContext transportContext, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            EventInternal.Builder uptimeMillis = EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            if (z) {
                uptimeMillis.setEncodedPayload(new EncodedPayload(m48987x0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                uptimeMillis.setEncodedPayload(new EncodedPayload(m48987x0(cursor.getString(4)), m48991v0(j)));
            }
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                uptimeMillis.setProductId(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                uptimeMillis.setPseudonymousId(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                uptimeMillis.setExperimentIdsClear(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                uptimeMillis.setExperimentIdsEncrypted(cursor.getBlob(11));
            }
            list.add(PersistedEvent.create(j, transportContext, uptimeMillis.build()));
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(final TransportContext transportContext) {
        return ((Boolean) m49041O(new InterfaceC6281b() { // from class: ZD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49010m(SQLiteEventStore.this, transportContext, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    /* renamed from: j0 */
    public final /* synthetic */ Long m49015j0(EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (m49040P()) {
            recordLogEventDropped(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal.getTransportName());
            return -1L;
        }
        long m49048H = m49048H(sQLiteDatabase, transportContext);
        int mo22870e = this.f44226d.mo22870e();
        byte[] bytes = eventInternal.getEncodedPayload().getBytes();
        if (bytes.length <= mo22870e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m49048H));
        contentValues.put("transport_name", eventInternal.getTransportName());
        contentValues.put("timestamp_ms", Long.valueOf(eventInternal.getEventMillis()));
        contentValues.put("uptime_ms", Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues.put("payload_encoding", eventInternal.getEncodedPayload().getEncoding().getName());
        contentValues.put("code", eventInternal.getCode());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = bytes;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        contentValues.put("product_id", eventInternal.getProductId());
        contentValues.put("pseudonymous_id", eventInternal.getPseudonymousId());
        contentValues.put("experiment_ids_clear_blob", eventInternal.getExperimentIdsClear());
        contentValues.put("experiment_ids_encrypted_blob", eventInternal.getExperimentIdsEncrypted());
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(bytes.length / mo22870e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(bytes, (i - 1) * mo22870e, Math.min(i * mo22870e, bytes.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : eventInternal.getMetadata().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: l0 */
    public final /* synthetic */ Object m49011l0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            recordLogEventDropped(i, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<TransportContext> loadActiveContexts() {
        return (Iterable) m49041O(new InterfaceC6281b() { // from class: DD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49004p((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<PersistedEvent> loadBatch(final TransportContext transportContext) {
        return (Iterable) m49041O(new InterfaceC6281b() { // from class: VD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49025d(SQLiteEventStore.this, transportContext, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public ClientMetrics loadClientMetrics() {
        final ClientMetrics.Builder newBuilder = ClientMetrics.newBuilder();
        final HashMap hashMap = new HashMap();
        return (ClientMetrics) m49041O(new InterfaceC6281b() { // from class: yD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                ClientMetrics m49020g0;
                m49020g0 = SQLiteEventStore.this.m49020g0(r2, hashMap, newBuilder, (SQLiteDatabase) obj);
                return m49020g0;
            }
        });
    }

    /* renamed from: m0 */
    public final /* synthetic */ Object m49009m0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m48983z0(sQLiteDatabase.rawQuery(str2, null), new InterfaceC6281b() { // from class: GD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49018i(SQLiteEventStore.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @Nullable
    public PersistedEvent persist(final TransportContext transportContext, final EventInternal eventInternal) {
        Logging.m49111d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long longValue = ((Long) m49041O(new InterfaceC6281b() { // from class: YD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48996t(SQLiteEventStore.this, eventInternal, transportContext, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return PersistedEvent.create(longValue, transportContext, eventInternal);
    }

    /* renamed from: q0 */
    public final /* synthetic */ Object m49001q0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f44224b.getTime()).execute();
        return null;
    }

    /* renamed from: r0 */
    public final List m48999r0(SQLiteDatabase sQLiteDatabase, final TransportContext transportContext, int i) {
        final ArrayList arrayList = new ArrayList();
        Long m49042N = m49042N(sQLiteDatabase, transportContext);
        if (m49042N == null) {
            return arrayList;
        }
        m48983z0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{m49042N.toString()}, null, null, null, String.valueOf(i)), new InterfaceC6281b() { // from class: HD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49055A(SQLiteEventStore.this, arrayList, transportContext, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable<PersistedEvent> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m48985y0(iterable);
        m49041O(new InterfaceC6281b() { // from class: JD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49012l(SQLiteEventStore.this, str, r3, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(final long j, final LogEventDropped.Reason reason, final String str) {
        m49041O(new InterfaceC6281b() { // from class: CD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48988x(str, reason, j, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(final TransportContext transportContext, final long j) {
        m49041O(new InterfaceC6281b() { // from class: zD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49008n(j, transportContext, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable<PersistedEvent> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        m49046J().compileStatement("DELETE FROM events WHERE _id in " + m48985y0(iterable)).execute();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        m49041O(new InterfaceC6281b() { // from class: AD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49054B(SQLiteEventStore.this, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase m49046J = m49046J();
        m49049G(m49046J);
        try {
            T execute = criticalSection.execute();
            m49046J.setTransactionSuccessful();
            return execute;
        } finally {
            m49046J.endTransaction();
        }
    }

    /* renamed from: s0 */
    public final Map m48997s0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(((PersistedEvent) list.get(i)).getId());
            if (i < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        m48983z0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC6281b() { // from class: MD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m48986y(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    /* renamed from: u0 */
    public final void m48993u0(ClientMetrics.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource((String) entry.getKey()).setLogEventDroppedList((List) entry.getValue()).build());
        }
    }

    /* renamed from: v0 */
    public final byte[] m48991v0(long j) {
        return (byte[]) m48983z0(m49046J().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new InterfaceC6281b() { // from class: PD1
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.InterfaceC6281b
            public final Object apply(Object obj) {
                return SQLiteEventStore.m49006o((Cursor) obj);
            }
        });
    }

    /* renamed from: w0 */
    public final Object m48989w0(InterfaceC6283d interfaceC6283d, InterfaceC6281b interfaceC6281b) {
        long time = this.f44225c.getTime();
        while (true) {
            try {
                return interfaceC6283d.mo48982a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f44225c.getTime() >= this.f44226d.mo22873b() + time) {
                    return interfaceC6281b.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}