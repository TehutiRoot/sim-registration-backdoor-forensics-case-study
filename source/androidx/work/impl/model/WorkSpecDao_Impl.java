package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.p007db.SupportSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {

    /* renamed from: a */
    public final RoomDatabase f38631a;

    /* renamed from: b */
    public final EntityInsertionAdapter f38632b;

    /* renamed from: c */
    public final EntityDeletionOrUpdateAdapter f38633c;

    /* renamed from: d */
    public final SharedSQLiteStatement f38634d;

    /* renamed from: e */
    public final SharedSQLiteStatement f38635e;

    /* renamed from: f */
    public final SharedSQLiteStatement f38636f;

    /* renamed from: g */
    public final SharedSQLiteStatement f38637g;

    /* renamed from: h */
    public final SharedSQLiteStatement f38638h;

    /* renamed from: i */
    public final SharedSQLiteStatement f38639i;

    /* renamed from: j */
    public final SharedSQLiteStatement f38640j;

    /* renamed from: k */
    public final SharedSQLiteStatement f38641k;

    /* renamed from: l */
    public final SharedSQLiteStatement f38642l;

    /* renamed from: m */
    public final SharedSQLiteStatement f38643m;

    /* renamed from: n */
    public final SharedSQLiteStatement f38644n;

    /* renamed from: o */
    public final SharedSQLiteStatement f38645o;

    /* renamed from: p */
    public final SharedSQLiteStatement f38646p;

    /* renamed from: q */
    public final SharedSQLiteStatement f38647q;

    /* renamed from: r */
    public final SharedSQLiteStatement f38648r;

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$a */
    /* loaded from: classes.dex */
    public class C5269a extends SharedSQLiteStatement {
        public C5269a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$b */
    /* loaded from: classes.dex */
    public class C5270b extends SharedSQLiteStatement {
        public C5270b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$c */
    /* loaded from: classes.dex */
    public class C5271c extends SharedSQLiteStatement {
        public C5271c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$d */
    /* loaded from: classes.dex */
    public class C5272d extends SharedSQLiteStatement {
        public C5272d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$e */
    /* loaded from: classes.dex */
    public class C5273e extends SharedSQLiteStatement {
        public C5273e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$f */
    /* loaded from: classes.dex */
    public class C5274f extends SharedSQLiteStatement {
        public C5274f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$g */
    /* loaded from: classes.dex */
    public class C5275g extends SharedSQLiteStatement {
        public C5275g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$h */
    /* loaded from: classes.dex */
    public class C5276h extends SharedSQLiteStatement {
        public C5276h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$i */
    /* loaded from: classes.dex */
    public class CallableC5277i implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38657a;

        public CallableC5277i(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38657a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38657a, false, null);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    arrayList.add(string);
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38657a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$j */
    /* loaded from: classes.dex */
    public class CallableC5278j implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38659a;

        public CallableC5278j(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38659a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            byte[] blob;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            byte[] blob2;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38659a, true, null);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                WorkSpecDao_Impl.this.m52197b(hashMap);
                WorkSpecDao_Impl.this.m52198a(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i = query.getInt(3);
                    int i2 = query.getInt(4);
                    long j = query.getLong(13);
                    long j2 = query.getLong(14);
                    long j3 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j4 = query.getLong(17);
                    long j5 = query.getLong(18);
                    int i3 = query.getInt(19);
                    long j6 = query.getLong(20);
                    int i4 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j7 = query.getLong(10);
                    long j8 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38659a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$k */
    /* loaded from: classes.dex */
    public class C5279k extends EntityInsertionAdapter {
        public C5279k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.EntityInsertionAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
            String str = workSpec.f38608id;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
            supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
            String str2 = workSpec.workerClassName;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = workSpec.inputMergerClassName;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
            if (byteArrayInternal == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, byteArrayInternal);
            }
            byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
            if (byteArrayInternal2 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
            }
            supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
            supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
            supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
            supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
            supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
            supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
            supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
            supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
            supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
            supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
            supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
            supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
            supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
            supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
            supportSQLiteStatement.bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
            supportSQLiteStatement.bindLong(22, workSpec.getStopReason());
            Constraints constraints = workSpec.constraints;
            if (constraints != null) {
                supportSQLiteStatement.bindLong(23, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                supportSQLiteStatement.bindLong(24, constraints.requiresCharging() ? 1L : 0L);
                supportSQLiteStatement.bindLong(25, constraints.requiresDeviceIdle() ? 1L : 0L);
                supportSQLiteStatement.bindLong(26, constraints.requiresBatteryNotLow() ? 1L : 0L);
                supportSQLiteStatement.bindLong(27, constraints.requiresStorageNotLow() ? 1L : 0L);
                supportSQLiteStatement.bindLong(28, constraints.getContentTriggerUpdateDelayMillis());
                supportSQLiteStatement.bindLong(29, constraints.getContentTriggerMaxDelayMillis());
                byte[] ofTriggersToByteArray = WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                if (ofTriggersToByteArray == null) {
                    supportSQLiteStatement.bindNull(30);
                    return;
                } else {
                    supportSQLiteStatement.bindBlob(30, ofTriggersToByteArray);
                    return;
                }
            }
            supportSQLiteStatement.bindNull(23);
            supportSQLiteStatement.bindNull(24);
            supportSQLiteStatement.bindNull(25);
            supportSQLiteStatement.bindNull(26);
            supportSQLiteStatement.bindNull(27);
            supportSQLiteStatement.bindNull(28);
            supportSQLiteStatement.bindNull(29);
            supportSQLiteStatement.bindNull(30);
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$l */
    /* loaded from: classes.dex */
    public class CallableC5280l implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38662a;

        public CallableC5280l(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38662a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            byte[] blob;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            byte[] blob2;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38662a, true, null);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                WorkSpecDao_Impl.this.m52197b(hashMap);
                WorkSpecDao_Impl.this.m52198a(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i = query.getInt(3);
                    int i2 = query.getInt(4);
                    long j = query.getLong(13);
                    long j2 = query.getLong(14);
                    long j3 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j4 = query.getLong(17);
                    long j5 = query.getLong(18);
                    int i3 = query.getInt(19);
                    long j6 = query.getLong(20);
                    int i4 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j7 = query.getLong(10);
                    long j8 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38662a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$m */
    /* loaded from: classes.dex */
    public class CallableC5281m implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38664a;

        public CallableC5281m(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38664a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            byte[] blob;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            byte[] blob2;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38664a, true, null);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                WorkSpecDao_Impl.this.m52197b(hashMap);
                WorkSpecDao_Impl.this.m52198a(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i = query.getInt(3);
                    int i2 = query.getInt(4);
                    long j = query.getLong(13);
                    long j2 = query.getLong(14);
                    long j3 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j4 = query.getLong(17);
                    long j5 = query.getLong(18);
                    int i3 = query.getInt(19);
                    long j6 = query.getLong(20);
                    int i4 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j7 = query.getLong(10);
                    long j8 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38664a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$n */
    /* loaded from: classes.dex */
    public class CallableC5282n implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38666a;

        public CallableC5282n(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38666a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            byte[] blob;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            byte[] blob2;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38666a, true, null);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                WorkSpecDao_Impl.this.m52197b(hashMap);
                WorkSpecDao_Impl.this.m52198a(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i = query.getInt(3);
                    int i2 = query.getInt(4);
                    long j = query.getLong(13);
                    long j2 = query.getLong(14);
                    long j3 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j4 = query.getLong(17);
                    long j5 = query.getLong(18);
                    int i3 = query.getInt(19);
                    long j6 = query.getLong(20);
                    int i4 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j7 = query.getLong(10);
                    long j8 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38666a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$o */
    /* loaded from: classes.dex */
    public class CallableC5283o implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38668a;

        public CallableC5283o(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38668a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            byte[] blob;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            byte[] blob2;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38668a, true, null);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                WorkSpecDao_Impl.this.m52197b(hashMap);
                WorkSpecDao_Impl.this.m52198a(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i = query.getInt(3);
                    int i2 = query.getInt(4);
                    long j = query.getLong(13);
                    long j2 = query.getLong(14);
                    long j3 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j4 = query.getLong(17);
                    long j5 = query.getLong(18);
                    int i3 = query.getInt(19);
                    long j6 = query.getLong(20);
                    int i4 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j7 = query.getLong(10);
                    long j8 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38668a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$p */
    /* loaded from: classes.dex */
    public class CallableC5284p implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38670a;

        public CallableC5284p(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38670a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List call() {
            String string;
            byte[] blob;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            byte[] blob2;
            WorkSpecDao_Impl.this.f38631a.beginTransaction();
            try {
                Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38670a, true, null);
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    if (((ArrayList) hashMap.get(string2)) == null) {
                        hashMap.put(string2, new ArrayList());
                    }
                    String string3 = query.getString(0);
                    if (((ArrayList) hashMap2.get(string3)) == null) {
                        hashMap2.put(string3, new ArrayList());
                    }
                }
                query.moveToPosition(-1);
                WorkSpecDao_Impl.this.m52197b(hashMap);
                WorkSpecDao_Impl.this.m52198a(hashMap2);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                    if (query.isNull(2)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(2);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    int i = query.getInt(3);
                    int i2 = query.getInt(4);
                    long j = query.getLong(13);
                    long j2 = query.getLong(14);
                    long j3 = query.getLong(15);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                    long j4 = query.getLong(17);
                    long j5 = query.getLong(18);
                    int i3 = query.getInt(19);
                    long j6 = query.getLong(20);
                    int i4 = query.getInt(21);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                    if (query.getInt(6) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (query.getInt(7) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (query.getInt(8) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (query.getInt(9) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    long j7 = query.getLong(10);
                    long j8 = query.getLong(11);
                    if (query.isNull(12)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(12);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                    ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    ArrayList arrayList3 = arrayList2;
                    ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
                }
                WorkSpecDao_Impl.this.f38631a.setTransactionSuccessful();
                query.close();
                return arrayList;
            } finally {
                WorkSpecDao_Impl.this.f38631a.endTransaction();
            }
        }

        public void finalize() {
            this.f38670a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$q */
    /* loaded from: classes.dex */
    public class CallableC5285q implements Callable {

        /* renamed from: a */
        public final /* synthetic */ RoomSQLiteQuery f38672a;

        public CallableC5285q(RoomSQLiteQuery roomSQLiteQuery) {
            this.f38672a = roomSQLiteQuery;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Long call() {
            long j;
            Cursor query = DBUtil.query(WorkSpecDao_Impl.this.f38631a, this.f38672a, false, null);
            try {
                if (query.moveToFirst()) {
                    j = query.getLong(0);
                } else {
                    j = 0;
                }
                Long valueOf = Long.valueOf(j);
                query.close();
                return valueOf;
            } catch (Throwable th2) {
                query.close();
                throw th2;
            }
        }

        public void finalize() {
            this.f38672a.release();
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$r */
    /* loaded from: classes.dex */
    public class C5286r extends EntityDeletionOrUpdateAdapter {
        public C5286r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.EntityDeletionOrUpdateAdapter
        /* renamed from: d */
        public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
            String str = workSpec.f38608id;
            if (str == null) {
                supportSQLiteStatement.bindNull(1);
            } else {
                supportSQLiteStatement.bindString(1, str);
            }
            WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
            supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
            String str2 = workSpec.workerClassName;
            if (str2 == null) {
                supportSQLiteStatement.bindNull(3);
            } else {
                supportSQLiteStatement.bindString(3, str2);
            }
            String str3 = workSpec.inputMergerClassName;
            if (str3 == null) {
                supportSQLiteStatement.bindNull(4);
            } else {
                supportSQLiteStatement.bindString(4, str3);
            }
            byte[] byteArrayInternal = Data.toByteArrayInternal(workSpec.input);
            if (byteArrayInternal == null) {
                supportSQLiteStatement.bindNull(5);
            } else {
                supportSQLiteStatement.bindBlob(5, byteArrayInternal);
            }
            byte[] byteArrayInternal2 = Data.toByteArrayInternal(workSpec.output);
            if (byteArrayInternal2 == null) {
                supportSQLiteStatement.bindNull(6);
            } else {
                supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
            }
            supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
            supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
            supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
            supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
            supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
            supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
            supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
            supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
            supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
            supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
            supportSQLiteStatement.bindLong(17, WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
            supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
            supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
            supportSQLiteStatement.bindLong(20, workSpec.getNextScheduleTimeOverride());
            supportSQLiteStatement.bindLong(21, workSpec.getNextScheduleTimeOverrideGeneration());
            supportSQLiteStatement.bindLong(22, workSpec.getStopReason());
            Constraints constraints = workSpec.constraints;
            if (constraints != null) {
                supportSQLiteStatement.bindLong(23, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                supportSQLiteStatement.bindLong(24, constraints.requiresCharging() ? 1L : 0L);
                supportSQLiteStatement.bindLong(25, constraints.requiresDeviceIdle() ? 1L : 0L);
                supportSQLiteStatement.bindLong(26, constraints.requiresBatteryNotLow() ? 1L : 0L);
                supportSQLiteStatement.bindLong(27, constraints.requiresStorageNotLow() ? 1L : 0L);
                supportSQLiteStatement.bindLong(28, constraints.getContentTriggerUpdateDelayMillis());
                supportSQLiteStatement.bindLong(29, constraints.getContentTriggerMaxDelayMillis());
                byte[] ofTriggersToByteArray = WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                if (ofTriggersToByteArray == null) {
                    supportSQLiteStatement.bindNull(30);
                } else {
                    supportSQLiteStatement.bindBlob(30, ofTriggersToByteArray);
                }
            } else {
                supportSQLiteStatement.bindNull(23);
                supportSQLiteStatement.bindNull(24);
                supportSQLiteStatement.bindNull(25);
                supportSQLiteStatement.bindNull(26);
                supportSQLiteStatement.bindNull(27);
                supportSQLiteStatement.bindNull(28);
                supportSQLiteStatement.bindNull(29);
                supportSQLiteStatement.bindNull(30);
            }
            String str4 = workSpec.f38608id;
            if (str4 == null) {
                supportSQLiteStatement.bindNull(31);
            } else {
                supportSQLiteStatement.bindString(31, str4);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$s */
    /* loaded from: classes.dex */
    public class C5287s extends SharedSQLiteStatement {
        public C5287s(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$t */
    /* loaded from: classes.dex */
    public class C5288t extends SharedSQLiteStatement {
        public C5288t(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$u */
    /* loaded from: classes.dex */
    public class C5289u extends SharedSQLiteStatement {
        public C5289u(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$v */
    /* loaded from: classes.dex */
    public class C5290v extends SharedSQLiteStatement {
        public C5290v(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$w */
    /* loaded from: classes.dex */
    public class C5291w extends SharedSQLiteStatement {
        public C5291w(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$x */
    /* loaded from: classes.dex */
    public class C5292x extends SharedSQLiteStatement {
        public C5292x(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.WorkSpecDao_Impl$y */
    /* loaded from: classes.dex */
    public class C5293y extends SharedSQLiteStatement {
        public C5293y(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.f38631a = roomDatabase;
        this.f38632b = new C5279k(roomDatabase);
        this.f38633c = new C5286r(roomDatabase);
        this.f38634d = new C5287s(roomDatabase);
        this.f38635e = new C5288t(roomDatabase);
        this.f38636f = new C5289u(roomDatabase);
        this.f38637g = new C5290v(roomDatabase);
        this.f38638h = new C5291w(roomDatabase);
        this.f38639i = new C5292x(roomDatabase);
        this.f38640j = new C5293y(roomDatabase);
        this.f38641k = new C5269a(roomDatabase);
        this.f38642l = new C5270b(roomDatabase);
        this.f38643m = new C5271c(roomDatabase);
        this.f38644n = new C5272d(roomDatabase);
        this.f38645o = new C5273e(roomDatabase);
        this.f38646p = new C5274f(roomDatabase);
        this.f38647q = new C5275g(roomDatabase);
        this.f38648r = new C5276h(roomDatabase);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public final void m52198a(HashMap hashMap) {
        byte[] blob;
        int i;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                m52198a(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i > 0) {
                m52198a(hashMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i2);
            } else {
                acquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    if (query.isNull(0)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(0);
                    }
                    arrayList.add(Data.fromByteArray(blob));
                }
            }
        } finally {
            query.close();
        }
    }

    /* renamed from: b */
    public final void m52197b(HashMap hashMap) {
        String string;
        int i;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                m52197b(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i > 0) {
                m52197b(hashMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i2);
            } else {
                acquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(query.getString(columnIndex));
                if (arrayList != null) {
                    if (query.isNull(0)) {
                        string = null;
                    } else {
                        string = query.getString(0);
                    }
                    arrayList.add(string);
                }
            }
        } finally {
            query.close();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int countNonFinishedContentUriTriggerWorkers() {
        int i = 0;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                i = query.getInt(0);
            }
            return i;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38634d.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38634d.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        acquire.bindLong(1, i);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i9 = i7;
                    long j6 = query.getLong(i9);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    long j7 = query.getLong(i11);
                    columnIndexOrThrow15 = i11;
                    int i12 = columnIndexOrThrow16;
                    if (query.getInt(i12) != 0) {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i2));
                    columnIndexOrThrow17 = i2;
                    int i13 = columnIndexOrThrow18;
                    int i14 = query.getInt(i13);
                    columnIndexOrThrow18 = i13;
                    int i15 = columnIndexOrThrow19;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow19 = i15;
                    int i17 = columnIndexOrThrow20;
                    long j8 = query.getLong(i17);
                    columnIndexOrThrow20 = i17;
                    int i18 = columnIndexOrThrow21;
                    int i19 = query.getInt(i18);
                    columnIndexOrThrow21 = i18;
                    int i20 = columnIndexOrThrow22;
                    int i21 = query.getInt(i20);
                    columnIndexOrThrow22 = i20;
                    int i22 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i22));
                    columnIndexOrThrow23 = i22;
                    int i23 = columnIndexOrThrow24;
                    if (query.getInt(i23) != 0) {
                        columnIndexOrThrow24 = i23;
                        i3 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        columnIndexOrThrow24 = i23;
                        i3 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow25 = i3;
                        i4 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        columnIndexOrThrow25 = i3;
                        i4 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow26 = i4;
                        i5 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        columnIndexOrThrow26 = i4;
                        i5 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow27 = i5;
                        i6 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        columnIndexOrThrow27 = i5;
                        i6 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j9 = query.getLong(i6);
                    columnIndexOrThrow28 = i6;
                    int i24 = columnIndexOrThrow29;
                    long j10 = query.getLong(i24);
                    columnIndexOrThrow29 = i24;
                    int i25 = columnIndexOrThrow30;
                    if (query.isNull(i25)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i25);
                    }
                    columnIndexOrThrow30 = i25;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i19, i21));
                    columnIndexOrThrow = i10;
                    i7 = i9;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<String>> getAllWorkSpecIdsLiveData() {
        return this.f38631a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, true, new CallableC5277i(RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0)));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, i);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i7 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i9 = i7;
                    long j6 = query.getLong(i9);
                    int i10 = columnIndexOrThrow;
                    int i11 = columnIndexOrThrow15;
                    long j7 = query.getLong(i11);
                    columnIndexOrThrow15 = i11;
                    int i12 = columnIndexOrThrow16;
                    if (query.getInt(i12) != 0) {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i12;
                        i2 = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i2));
                    columnIndexOrThrow17 = i2;
                    int i13 = columnIndexOrThrow18;
                    int i14 = query.getInt(i13);
                    columnIndexOrThrow18 = i13;
                    int i15 = columnIndexOrThrow19;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow19 = i15;
                    int i17 = columnIndexOrThrow20;
                    long j8 = query.getLong(i17);
                    columnIndexOrThrow20 = i17;
                    int i18 = columnIndexOrThrow21;
                    int i19 = query.getInt(i18);
                    columnIndexOrThrow21 = i18;
                    int i20 = columnIndexOrThrow22;
                    int i21 = query.getInt(i20);
                    columnIndexOrThrow22 = i20;
                    int i22 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i22));
                    columnIndexOrThrow23 = i22;
                    int i23 = columnIndexOrThrow24;
                    if (query.getInt(i23) != 0) {
                        columnIndexOrThrow24 = i23;
                        i3 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        columnIndexOrThrow24 = i23;
                        i3 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow25 = i3;
                        i4 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        columnIndexOrThrow25 = i3;
                        i4 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow26 = i4;
                        i5 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        columnIndexOrThrow26 = i4;
                        i5 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i5) != 0) {
                        columnIndexOrThrow27 = i5;
                        i6 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        columnIndexOrThrow27 = i5;
                        i6 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j9 = query.getLong(i6);
                    columnIndexOrThrow28 = i6;
                    int i24 = columnIndexOrThrow29;
                    long j10 = query.getLong(i24);
                    columnIndexOrThrow29 = i24;
                    int i25 = columnIndexOrThrow30;
                    if (query.isNull(i25)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i25);
                    }
                    columnIndexOrThrow30 = i25;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i14, i16, j8, i19, i21));
                    columnIndexOrThrow = i10;
                    i7 = i9;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForSchedulingWithContentUris() {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i7 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j6 = query.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j7 = query.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = query.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = query.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    long j8 = query.getLong(i16);
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow21 = i17;
                    int i19 = columnIndexOrThrow22;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow22 = i19;
                    int i21 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i21));
                    columnIndexOrThrow23 = i21;
                    int i22 = columnIndexOrThrow24;
                    if (query.getInt(i22) != 0) {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j9 = query.getLong(i5);
                    columnIndexOrThrow28 = i5;
                    int i23 = columnIndexOrThrow29;
                    long j10 = query.getLong(i23);
                    columnIndexOrThrow29 = i23;
                    int i24 = columnIndexOrThrow30;
                    if (query.isNull(i24)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i24);
                    }
                    columnIndexOrThrow30 = i24;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i7, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i13, i15, j8, i18, i20));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        byte[] blob;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    blob = null;
                } else {
                    blob = query.getBlob(0);
                }
                arrayList.add(Data.fromByteArray(blob));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRecentlyCompletedWork(long j) {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        acquire.bindLong(1, j);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j2 = query.getLong(columnIndexOrThrow7);
                    long j3 = query.getLong(columnIndexOrThrow8);
                    long j4 = query.getLong(columnIndexOrThrow9);
                    int i7 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j5 = query.getLong(columnIndexOrThrow12);
                    long j6 = query.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j7 = query.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j8 = query.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = query.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = query.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    long j9 = query.getLong(i16);
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow21 = i17;
                    int i19 = columnIndexOrThrow22;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow22 = i19;
                    int i21 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i21));
                    columnIndexOrThrow23 = i21;
                    int i22 = columnIndexOrThrow24;
                    if (query.getInt(i22) != 0) {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j10 = query.getLong(i5);
                    columnIndexOrThrow28 = i5;
                    int i23 = columnIndexOrThrow29;
                    long j11 = query.getLong(i23);
                    columnIndexOrThrow29 = i23;
                    int i24 = columnIndexOrThrow30;
                    if (query.isNull(i24)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i24);
                    }
                    columnIndexOrThrow30 = i24;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j2, j3, j4, new Constraints(intToNetworkType, z2, z3, z4, z5, j10, j11, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i7, intToBackoffPolicy, j5, j6, j7, j8, z, intToOutOfQuotaPolicy, i13, i15, j9, i18, i20));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i7 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j6 = query.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j7 = query.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = query.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = query.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    long j8 = query.getLong(i16);
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow21 = i17;
                    int i19 = columnIndexOrThrow22;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow22 = i19;
                    int i21 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i21));
                    columnIndexOrThrow23 = i21;
                    int i22 = columnIndexOrThrow24;
                    if (query.getInt(i22) != 0) {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j9 = query.getLong(i5);
                    columnIndexOrThrow28 = i5;
                    int i23 = columnIndexOrThrow29;
                    long j10 = query.getLong(i23);
                    columnIndexOrThrow29 = i23;
                    int i24 = columnIndexOrThrow30;
                    if (query.isNull(i24)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i24);
                    }
                    columnIndexOrThrow30 = i24;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i7, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i13, i15, j8, i18, i20));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<Long> getScheduleRequestedAtLiveData(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.f38631a.getInvalidationTracker().createLiveData(new String[]{"workspec"}, false, new CallableC5285q(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i7 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i8 = i6;
                    long j6 = query.getLong(i8);
                    int i9 = columnIndexOrThrow;
                    int i10 = columnIndexOrThrow15;
                    long j7 = query.getLong(i10);
                    columnIndexOrThrow15 = i10;
                    int i11 = columnIndexOrThrow16;
                    if (query.getInt(i11) != 0) {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i11;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i));
                    columnIndexOrThrow17 = i;
                    int i12 = columnIndexOrThrow18;
                    int i13 = query.getInt(i12);
                    columnIndexOrThrow18 = i12;
                    int i14 = columnIndexOrThrow19;
                    int i15 = query.getInt(i14);
                    columnIndexOrThrow19 = i14;
                    int i16 = columnIndexOrThrow20;
                    long j8 = query.getLong(i16);
                    columnIndexOrThrow20 = i16;
                    int i17 = columnIndexOrThrow21;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow21 = i17;
                    int i19 = columnIndexOrThrow22;
                    int i20 = query.getInt(i19);
                    columnIndexOrThrow22 = i19;
                    int i21 = columnIndexOrThrow23;
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(i21));
                    columnIndexOrThrow23 = i21;
                    int i22 = columnIndexOrThrow24;
                    if (query.getInt(i22) != 0) {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        columnIndexOrThrow24 = i22;
                        i2 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        columnIndexOrThrow25 = i2;
                        i3 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        columnIndexOrThrow26 = i3;
                        i4 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        columnIndexOrThrow27 = i4;
                        i5 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j9 = query.getLong(i5);
                    columnIndexOrThrow28 = i5;
                    int i23 = columnIndexOrThrow29;
                    long j10 = query.getLong(i23);
                    columnIndexOrThrow29 = i23;
                    int i24 = columnIndexOrThrow30;
                    if (query.isNull(i24)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(i24);
                    }
                    columnIndexOrThrow30 = i24;
                    arrayList.add(new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i7, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i13, i15, j8, i18, i20));
                    columnIndexOrThrow = i9;
                    i6 = i8;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        Integer valueOf;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        WorkInfo.State state = null;
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                if (query.isNull(0)) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(query.getInt(0));
                }
                if (valueOf != null) {
                    WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                    state = WorkTypeConverters.intToState(valueOf.intValue());
                }
            }
            return state;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(string);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        WorkSpec workSpec;
        String string;
        String string2;
        String string3;
        byte[] blob;
        byte[] blob2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        byte[] blob3;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, RemoteConfigConstants.ResponseFieldKey.STATE);
            int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override");
                int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "next_schedule_time_override_generation");
                int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "stop_reason");
                int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow27 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow28 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow29 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow30 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                if (query.moveToFirst()) {
                    if (query.isNull(columnIndexOrThrow)) {
                        string = null;
                    } else {
                        string = query.getString(columnIndexOrThrow);
                    }
                    WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    if (query.isNull(columnIndexOrThrow3)) {
                        string2 = null;
                    } else {
                        string2 = query.getString(columnIndexOrThrow3);
                    }
                    if (query.isNull(columnIndexOrThrow4)) {
                        string3 = null;
                    } else {
                        string3 = query.getString(columnIndexOrThrow4);
                    }
                    if (query.isNull(columnIndexOrThrow5)) {
                        blob = null;
                    } else {
                        blob = query.getBlob(columnIndexOrThrow5);
                    }
                    Data fromByteArray = Data.fromByteArray(blob);
                    if (query.isNull(columnIndexOrThrow6)) {
                        blob2 = null;
                    } else {
                        blob2 = query.getBlob(columnIndexOrThrow6);
                    }
                    Data fromByteArray2 = Data.fromByteArray(blob2);
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i6 = query.getInt(columnIndexOrThrow10);
                    BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    long j6 = query.getLong(columnIndexOrThrow14);
                    long j7 = query.getLong(columnIndexOrThrow15);
                    if (query.getInt(columnIndexOrThrow16) != 0) {
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    OutOfQuotaPolicy intToOutOfQuotaPolicy = WorkTypeConverters.intToOutOfQuotaPolicy(query.getInt(i));
                    int i7 = query.getInt(columnIndexOrThrow18);
                    int i8 = query.getInt(columnIndexOrThrow19);
                    long j8 = query.getLong(columnIndexOrThrow20);
                    int i9 = query.getInt(columnIndexOrThrow21);
                    int i10 = query.getInt(columnIndexOrThrow22);
                    NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow23));
                    if (query.getInt(columnIndexOrThrow24) != 0) {
                        i2 = columnIndexOrThrow25;
                        z2 = true;
                    } else {
                        i2 = columnIndexOrThrow25;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        i3 = columnIndexOrThrow26;
                        z3 = true;
                    } else {
                        i3 = columnIndexOrThrow26;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        i4 = columnIndexOrThrow27;
                        z4 = true;
                    } else {
                        i4 = columnIndexOrThrow27;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        i5 = columnIndexOrThrow28;
                        z5 = true;
                    } else {
                        i5 = columnIndexOrThrow28;
                        z5 = false;
                    }
                    long j9 = query.getLong(i5);
                    long j10 = query.getLong(columnIndexOrThrow29);
                    if (query.isNull(columnIndexOrThrow30)) {
                        blob3 = null;
                    } else {
                        blob3 = query.getBlob(columnIndexOrThrow30);
                    }
                    workSpec = new WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new Constraints(intToNetworkType, z2, z3, z4, z5, j9, j10, WorkTypeConverters.byteArrayToSetOfTriggers(blob3)), i6, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i7, i8, j8, i9, i10);
                } else {
                    workSpec = null;
                }
                query.close();
                roomSQLiteQuery.release();
                return workSpec;
            } catch (Throwable th2) {
                th = th2;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        String string;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                arrayList.add(new WorkSpec.IdAndState(string, WorkTypeConverters.intToState(query.getInt(1))));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        return CoroutinesRoom.createFlow(this.f38631a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new CallableC5280l(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.createFlow(this.f38631a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new CallableC5284p(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoFlowForTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return CoroutinesRoom.createFlow(this.f38631a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, new CallableC5281m(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        String string;
        byte[] blob;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        this.f38631a.beginTransaction();
        try {
            WorkSpec.WorkInfoPojo workInfoPojo = null;
            byte[] blob2 = null;
            Cursor query = DBUtil.query(this.f38631a, acquire, true, null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string2 = query.getString(0);
                if (((ArrayList) hashMap.get(string2)) == null) {
                    hashMap.put(string2, new ArrayList());
                }
                String string3 = query.getString(0);
                if (((ArrayList) hashMap2.get(string3)) == null) {
                    hashMap2.put(string3, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            m52197b(hashMap);
            m52198a(hashMap2);
            if (query.moveToFirst()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                if (query.isNull(2)) {
                    blob = null;
                } else {
                    blob = query.getBlob(2);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                int i = query.getInt(3);
                int i2 = query.getInt(4);
                long j = query.getLong(13);
                long j2 = query.getLong(14);
                long j3 = query.getLong(15);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                long j4 = query.getLong(17);
                long j5 = query.getLong(18);
                int i3 = query.getInt(19);
                long j6 = query.getLong(20);
                int i4 = query.getInt(21);
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                if (query.getInt(6) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (query.getInt(7) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (query.getInt(8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (query.getInt(9) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long j7 = query.getLong(10);
                long j8 = query.getLong(11);
                if (!query.isNull(12)) {
                    blob2 = query.getBlob(12);
                }
                Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                ArrayList arrayList = (ArrayList) hashMap.get(query.getString(0));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = (ArrayList) hashMap2.get(query.getString(0));
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                }
                workInfoPojo = new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList2, arrayList3);
            }
            this.f38631a.setTransactionSuccessful();
            query.close();
            acquire.release();
            return workInfoPojo;
        } finally {
            this.f38631a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        String string;
        byte[] blob;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte[] blob2;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        this.f38631a.assertNotSuspendingTransaction();
        this.f38631a.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.f38631a, acquire, true, null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string2 = query.getString(0);
                if (((ArrayList) hashMap.get(string2)) == null) {
                    hashMap.put(string2, new ArrayList());
                }
                String string3 = query.getString(0);
                if (((ArrayList) hashMap2.get(string3)) == null) {
                    hashMap2.put(string3, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            m52197b(hashMap);
            m52198a(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                if (query.isNull(2)) {
                    blob = null;
                } else {
                    blob = query.getBlob(2);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                int i2 = query.getInt(3);
                int i3 = query.getInt(4);
                long j = query.getLong(13);
                long j2 = query.getLong(14);
                long j3 = query.getLong(15);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                long j4 = query.getLong(17);
                long j5 = query.getLong(18);
                int i4 = query.getInt(19);
                long j6 = query.getLong(20);
                int i5 = query.getInt(21);
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                if (query.getInt(6) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (query.getInt(7) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (query.getInt(8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (query.getInt(9) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long j7 = query.getLong(10);
                long j8 = query.getLong(11);
                if (query.isNull(12)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(12);
                }
                Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i2, intToBackoffPolicy, j4, j5, i4, i3, j6, i5, arrayList3, arrayList4));
            }
            this.f38631a.setTransactionSuccessful();
            query.close();
            acquire.release();
            return arrayList;
        } finally {
            this.f38631a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        String string;
        byte[] blob;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte[] blob2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        this.f38631a.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.f38631a, acquire, true, null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string2 = query.getString(0);
                if (((ArrayList) hashMap.get(string2)) == null) {
                    hashMap.put(string2, new ArrayList());
                }
                String string3 = query.getString(0);
                if (((ArrayList) hashMap2.get(string3)) == null) {
                    hashMap2.put(string3, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            m52197b(hashMap);
            m52198a(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                if (query.isNull(2)) {
                    blob = null;
                } else {
                    blob = query.getBlob(2);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                int i = query.getInt(3);
                int i2 = query.getInt(4);
                long j = query.getLong(13);
                long j2 = query.getLong(14);
                long j3 = query.getLong(15);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                long j4 = query.getLong(17);
                long j5 = query.getLong(18);
                int i3 = query.getInt(19);
                long j6 = query.getLong(20);
                int i4 = query.getInt(21);
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                if (query.getInt(6) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (query.getInt(7) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (query.getInt(8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (query.getInt(9) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long j7 = query.getLong(10);
                long j8 = query.getLong(11);
                if (query.isNull(12)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(12);
                }
                Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
            }
            this.f38631a.setTransactionSuccessful();
            query.close();
            acquire.release();
            return arrayList;
        } finally {
            this.f38631a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        String string;
        byte[] blob;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        byte[] blob2;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.assertNotSuspendingTransaction();
        this.f38631a.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.f38631a, acquire, true, null);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            while (query.moveToNext()) {
                String string2 = query.getString(0);
                if (((ArrayList) hashMap.get(string2)) == null) {
                    hashMap.put(string2, new ArrayList());
                }
                String string3 = query.getString(0);
                if (((ArrayList) hashMap2.get(string3)) == null) {
                    hashMap2.put(string3, new ArrayList());
                }
            }
            query.moveToPosition(-1);
            m52197b(hashMap);
            m52198a(hashMap2);
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                if (query.isNull(0)) {
                    string = null;
                } else {
                    string = query.getString(0);
                }
                WorkInfo.State intToState = WorkTypeConverters.intToState(query.getInt(1));
                if (query.isNull(2)) {
                    blob = null;
                } else {
                    blob = query.getBlob(2);
                }
                Data fromByteArray = Data.fromByteArray(blob);
                int i = query.getInt(3);
                int i2 = query.getInt(4);
                long j = query.getLong(13);
                long j2 = query.getLong(14);
                long j3 = query.getLong(15);
                BackoffPolicy intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(16));
                long j4 = query.getLong(17);
                long j5 = query.getLong(18);
                int i3 = query.getInt(19);
                long j6 = query.getLong(20);
                int i4 = query.getInt(21);
                NetworkType intToNetworkType = WorkTypeConverters.intToNetworkType(query.getInt(5));
                if (query.getInt(6) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (query.getInt(7) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (query.getInt(8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (query.getInt(9) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                long j7 = query.getLong(10);
                long j8 = query.getLong(11);
                if (query.isNull(12)) {
                    blob2 = null;
                } else {
                    blob2 = query.getBlob(12);
                }
                Constraints constraints = new Constraints(intToNetworkType, z, z2, z3, z4, j7, j8, WorkTypeConverters.byteArrayToSetOfTriggers(blob2));
                ArrayList arrayList2 = (ArrayList) hashMap.get(query.getString(0));
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = (ArrayList) hashMap2.get(query.getString(0));
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i, intToBackoffPolicy, j4, j5, i3, i2, j6, i4, arrayList3, arrayList4));
            }
            this.f38631a.setTransactionSuccessful();
            query.close();
            acquire.release();
            return arrayList;
        } finally {
            this.f38631a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        return this.f38631a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new CallableC5278j(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.f38631a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new CallableC5283o(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.f38631a.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new CallableC5282n(acquire));
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
        boolean z = false;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f38631a.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.f38631a, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38647q.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38647q.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38637g.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38637g.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38640j.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f38631a.endTransaction();
            this.f38640j.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        this.f38631a.assertNotSuspendingTransaction();
        this.f38631a.beginTransaction();
        try {
            this.f38632b.insert((EntityInsertionAdapter) workSpec);
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38644n.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f38631a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f38631a.endTransaction();
            this.f38644n.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38646p.acquire();
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38646p.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38645o.acquire();
        this.f38631a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f38631a.endTransaction();
            this.f38645o.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void resetWorkSpecNextScheduleTimeOverride(String str, int i) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38643m.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i);
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38643m.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38641k.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f38631a.endTransaction();
            this.f38641k.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setCancelledState(String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38636f.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.f38631a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f38631a.endTransaction();
            this.f38636f.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueueTime(String str, long j) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38639i.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38639i.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setNextScheduleTimeOverride(String str, long j) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38642l.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38642l.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38638h.acquire();
        byte[] byteArrayInternal = Data.toByteArrayInternal(data);
        if (byteArrayInternal == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, byteArrayInternal);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38638h.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String str) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38635e.acquire();
        acquire.bindLong(1, WorkTypeConverters.stateToInt(state));
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f38631a.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.f38631a.endTransaction();
            this.f38635e.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setStopReason(String str, int i) {
        this.f38631a.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.f38648r.acquire();
        acquire.bindLong(1, i);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.f38631a.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
            this.f38648r.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(WorkSpec workSpec) {
        this.f38631a.assertNotSuspendingTransaction();
        this.f38631a.beginTransaction();
        try {
            this.f38633c.handle(workSpec);
            this.f38631a.setTransactionSuccessful();
        } finally {
            this.f38631a.endTransaction();
        }
    }
}
