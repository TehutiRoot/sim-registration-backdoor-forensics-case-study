package io.realm;

import io.realm.internal.OsCollection;
import io.realm.internal.OsList;
import io.realm.internal.OsResults;
import io.realm.internal.OsSet;
import io.realm.internal.PendingRow;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.TableQuery;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class RealmQuery<E> {

    /* renamed from: a */
    public final Table f66636a;

    /* renamed from: b */
    public final BaseRealm f66637b;

    /* renamed from: c */
    public final TableQuery f66638c;

    /* renamed from: d */
    public final RealmObjectSchema f66639d;

    /* renamed from: e */
    public Class f66640e;

    /* renamed from: f */
    public String f66641f;

    /* renamed from: g */
    public final boolean f66642g;

    /* renamed from: h */
    public final OsCollection f66643h;

    /* renamed from: io.realm.RealmQuery$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11282a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66644a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f66644a = iArr;
            try {
                iArr[RealmFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66644a[RealmFieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66644a[RealmFieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66644a[RealmFieldType.DECIMAL128.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f66644a[RealmFieldType.MIXED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public RealmQuery(Realm realm, Class cls) {
        this.f66637b = realm;
        this.f66640e = cls;
        boolean z = !m29611g(cls);
        this.f66642g = z;
        if (!z) {
            RealmObjectSchema m29582f = realm.getSchema().m29582f(cls);
            this.f66639d = m29582f;
            Table m29619f = m29582f.m29619f();
            this.f66636a = m29619f;
            this.f66643h = null;
            this.f66638c = m29619f.where();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    /* renamed from: a */
    public static RealmQuery m29617a(DynamicRealm dynamicRealm, String str) {
        return new RealmQuery(dynamicRealm, str);
    }

    /* renamed from: b */
    public static RealmQuery m29616b(Realm realm, Class cls) {
        return new RealmQuery(realm, cls);
    }

    /* renamed from: c */
    public static RealmQuery m29615c(RealmList realmList) {
        if (realmList.clazz == null) {
            return new RealmQuery(realmList.baseRealm, realmList.m29645j(), realmList.className);
        }
        return new RealmQuery(realmList.baseRealm, realmList.m29645j(), realmList.clazz);
    }

    /* renamed from: d */
    public static RealmQuery m29614d(RealmResults realmResults) {
        Class cls = realmResults.f66911a;
        if (cls == null) {
            return new RealmQuery(realmResults, realmResults.f66912b);
        }
        return new RealmQuery(realmResults, cls);
    }

    /* renamed from: g */
    public static boolean m29611g(Class cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    private static native String nativeSerializeQuery(long j);

    public RealmQuery<E> alwaysFalse() {
        this.f66637b.checkIfValid();
        this.f66638c.alwaysFalse();
        return this;
    }

    public RealmQuery<E> alwaysTrue() {
        this.f66637b.checkIfValid();
        this.f66638c.alwaysTrue();
        return this;
    }

    public RealmQuery<E> and() {
        this.f66637b.checkIfValid();
        return this;
    }

    public double average(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        long m29621c = this.f66639d.m29621c(str);
        int i = C11282a.f66644a[this.f66636a.getColumnType(m29621c).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return this.f66638c.averageDouble(m29621c);
                }
                throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", str, "int, float or double. For Decimal128 use `averageDecimal128` method."));
            }
            return this.f66638c.averageFloat(m29621c);
        }
        return this.f66638c.averageInt(m29621c);
    }

    @Nullable
    public Decimal128 averageDecimal128(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return this.f66638c.averageDecimal128(this.f66639d.m29621c(str));
    }

    @Nullable
    public Decimal128 averageRealmAny(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return this.f66638c.averageRealmAny(this.f66639d.m29621c(str));
    }

    public RealmQuery<E> beginGroup() {
        this.f66637b.checkIfValid();
        this.f66638c.beginGroup();
        return this;
    }

    public RealmQuery<E> beginsWith(String str, String str2) {
        return beginsWith(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> between(String str, int i, int i2) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Integer.valueOf(i)), RealmAny.valueOf(Integer.valueOf(i2)));
        return this;
    }

    public RealmQuery<E> contains(String str, String str2) {
        return contains(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> containsEntry(String str, Map.Entry<String, ?> entry) {
        Util.checkNull(entry, "entry");
        this.f66637b.checkIfValid();
        this.f66638c.containsEntry(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(entry.getKey()), RealmAny.m29706c(entry.getValue()));
        return this;
    }

    public RealmQuery<E> containsKey(String str, @Nullable String str2) {
        this.f66637b.checkIfValid();
        this.f66638c.containsKey(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(str2));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Boolean bool) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(bool));
        return this;
    }

    public long count() {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return m29609i().size();
    }

    public RealmQuery<E> distinct(String str, String... strArr) {
        this.f66637b.checkIfValid();
        String[] strArr2 = new String[strArr.length + 1];
        int i = 0;
        strArr2[0] = str;
        while (i < strArr.length) {
            int i2 = i + 1;
            strArr2[i2] = strArr[i];
            i = i2;
        }
        this.f66638c.distinct(this.f66637b.getSchema().m29583e(), strArr2);
        return this;
    }

    /* renamed from: e */
    public final RealmResults m29613e(TableQuery tableQuery, boolean z) {
        RealmResults realmResults;
        OsResults createFromQuery = OsResults.createFromQuery(this.f66637b.sharedRealm, tableQuery);
        if (m29610h()) {
            realmResults = new RealmResults(this.f66637b, createFromQuery, this.f66641f);
        } else {
            realmResults = new RealmResults(this.f66637b, createFromQuery, this.f66640e);
        }
        if (z) {
            realmResults.load();
        }
        return realmResults;
    }

    public RealmQuery<E> endGroup() {
        this.f66637b.checkIfValid();
        this.f66638c.endGroup();
        return this;
    }

    public RealmQuery<E> endsWith(String str, String str2) {
        return endsWith(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> equalTo(String str, @Nullable String str2) {
        return equalTo(str, str2, Case.SENSITIVE);
    }

    /* renamed from: f */
    public final long m29612f() {
        return this.f66638c.find();
    }

    public RealmResults<E> findAll() {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return m29613e(this.f66638c, true);
    }

    public RealmResults<E> findAllAsync() {
        this.f66637b.checkIfValid();
        this.f66637b.sharedRealm.capabilities.checkCanDeliverNotification("Async query cannot be created on current thread.");
        return m29613e(this.f66638c, false);
    }

    @Nullable
    public E findFirst() {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        if (this.f66642g) {
            return null;
        }
        long m29612f = m29612f();
        if (m29612f < 0) {
            return null;
        }
        return (E) this.f66637b.m29757k(this.f66640e, this.f66641f, m29612f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    public E findFirstAsync() {
        Row pendingRow;
        E e;
        this.f66637b.checkIfValid();
        if (!this.f66642g) {
            this.f66637b.sharedRealm.capabilities.checkCanDeliverNotification("Async query cannot be created on current thread.");
            if (this.f66637b.isInTransaction()) {
                pendingRow = OsResults.createFromQuery(this.f66637b.sharedRealm, this.f66638c).firstUncheckedRow();
            } else {
                pendingRow = new PendingRow(this.f66637b.sharedRealm, this.f66638c, m29610h());
            }
            if (m29610h()) {
                e = (E) new DynamicRealmObject(this.f66637b, pendingRow);
            } else {
                Class cls = this.f66640e;
                RealmProxyMediator schemaMediator = this.f66637b.getConfiguration().getSchemaMediator();
                BaseRealm baseRealm = this.f66637b;
                e = (E) schemaMediator.newInstance(cls, baseRealm, pendingRow, baseRealm.getSchema().m29584d(cls), false, Collections.emptyList());
            }
            if (pendingRow instanceof PendingRow) {
                ((PendingRow) pendingRow).setFrontEnd(e.realmGet$proxyState());
            }
            return e;
        }
        throw new UnsupportedOperationException("findFirstAsync() available only when type parameter 'E' is implementing RealmModel.");
    }

    public String getDescription() {
        this.f66638c.validateQuery();
        return nativeSerializeQuery(this.f66638c.getNativePtr());
    }

    public long getQueryPointer() {
        return this.f66638c.getNativePtr();
    }

    public Realm getRealm() {
        BaseRealm baseRealm = this.f66637b;
        if (baseRealm == null) {
            return null;
        }
        baseRealm.checkIfValid();
        BaseRealm baseRealm2 = this.f66637b;
        if (baseRealm2 instanceof Realm) {
            return (Realm) baseRealm2;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    public String getTypeQueried() {
        return this.f66636a.getClassName();
    }

    public RealmQuery<E> greaterThan(String str, int i) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Integer.valueOf(i)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, int i) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Integer.valueOf(i)));
        return this;
    }

    /* renamed from: h */
    public final boolean m29610h() {
        if (this.f66641f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final OsResults m29609i() {
        this.f66637b.checkIfValid();
        return m29613e(this.f66638c, false).f66913c;
    }

    /* renamed from: in */
    public RealmQuery<E> m29600in(String str, @Nullable String[] strArr) {
        return m29599in(str, strArr, Case.SENSITIVE);
    }

    public RealmQuery<E> isEmpty(String str) {
        this.f66637b.checkIfValid();
        this.f66638c.isEmpty(this.f66637b.getSchema().m29583e(), str);
        return this;
    }

    public RealmQuery<E> isNotEmpty(String str) {
        this.f66637b.checkIfValid();
        this.f66638c.isNotEmpty(this.f66637b.getSchema().m29583e(), str);
        return this;
    }

    public RealmQuery<E> isNotNull(String str) {
        this.f66637b.checkIfValid();
        this.f66638c.isNotNull(this.f66637b.getSchema().m29583e(), str);
        return this;
    }

    public RealmQuery<E> isNull(String str) {
        this.f66637b.checkIfValid();
        this.f66638c.isNull(this.f66637b.getSchema().m29583e(), str);
        return this;
    }

    public boolean isValid() {
        BaseRealm baseRealm = this.f66637b;
        if (baseRealm == null || baseRealm.isClosed()) {
            return false;
        }
        OsCollection osCollection = this.f66643h;
        if (osCollection != null) {
            return osCollection.isValid();
        }
        Table table = this.f66636a;
        if (table == null || !table.isValid()) {
            return false;
        }
        return true;
    }

    public RealmQuery<E> lessThan(String str, int i) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Integer.valueOf(i)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, int i) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Integer.valueOf(i)));
        return this;
    }

    public RealmQuery<E> like(String str, String str2) {
        return like(str, str2, Case.SENSITIVE);
    }

    public RealmQuery<E> limit(long j) {
        this.f66637b.checkIfValid();
        this.f66638c.limit(j);
        return this;
    }

    @Nullable
    public Number max(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        long m29621c = this.f66639d.m29621c(str);
        int i = C11282a.f66644a[this.f66636a.getColumnType(m29621c).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.f66638c.maximumDecimal128(m29621c);
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", str, "int, float or double"));
                }
                return this.f66638c.maximumDouble(m29621c);
            }
            return this.f66638c.maximumFloat(m29621c);
        }
        return this.f66638c.maximumInt(m29621c);
    }

    public RealmAny maxRealmAny(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return new RealmAny(RealmAnyOperator.m29704b(this.f66637b, this.f66638c.maximumRealmAny(this.f66639d.m29621c(str))));
    }

    @Nullable
    public Date maximumDate(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return this.f66638c.maximumDate(this.f66639d.m29621c(str));
    }

    @Nullable
    public Number min(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        long m29621c = this.f66639d.m29621c(str);
        int i = C11282a.f66644a[this.f66636a.getColumnType(m29621c).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return this.f66638c.minimumDecimal128(m29621c);
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", str, "int, float or double"));
                }
                return this.f66638c.minimumDouble(m29621c);
            }
            return this.f66638c.minimumFloat(m29621c);
        }
        return this.f66638c.minimumInt(m29621c);
    }

    public RealmAny minRealmAny(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return new RealmAny(RealmAnyOperator.m29704b(this.f66637b, this.f66638c.minimumRealmAny(this.f66639d.m29621c(str))));
    }

    @Nullable
    public Date minimumDate(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        return this.f66638c.minimumDate(this.f66639d.m29621c(str));
    }

    public RealmQuery<E> not() {
        this.f66637b.checkIfValid();
        this.f66638c.not();
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable String str2) {
        return notEqualTo(str, str2, Case.SENSITIVE);
    }

    /* renamed from: or */
    public RealmQuery<E> m29597or() {
        this.f66637b.checkIfValid();
        this.f66638c.m29514or();
        return this;
    }

    public RealmQuery<E> rawPredicate(String str, Object... objArr) {
        this.f66637b.checkIfValid();
        if (!Util.isEmptyString(str)) {
            RealmAny[] realmAnyArr = new RealmAny[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                realmAnyArr[i] = RealmAny.m29706c(objArr[i]);
            }
            try {
                this.f66638c.rawPredicate(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
                return this;
            } catch (IllegalArgumentException e) {
                if (e.getMessage().startsWith("Illegal Argument: Request for argument at index")) {
                    throw new IllegalStateException(e.getMessage());
                }
                throw e;
            }
        }
        throw new IllegalArgumentException("Non-null 'predicate' required.");
    }

    public RealmQuery<E> sort(String str) {
        this.f66637b.checkIfValid();
        return sort(str, Sort.ASCENDING);
    }

    public Number sum(String str) {
        this.f66637b.checkIfValid();
        this.f66637b.checkAllowQueriesOnUiThread();
        long m29621c = this.f66639d.m29621c(str);
        int i = C11282a.f66644a[this.f66636a.getColumnType(m29621c).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return this.f66638c.sumRealmAny(m29621c);
                        }
                        throw new IllegalArgumentException(String.format(Locale.US, "Field '%s': type mismatch - %s expected.", str, "int, float or double"));
                    }
                    return this.f66638c.sumDecimal128(m29621c);
                }
                return Double.valueOf(this.f66638c.sumDouble(m29621c));
            }
            return Double.valueOf(this.f66638c.sumFloat(m29621c));
        }
        return Long.valueOf(this.f66638c.sumInt(m29621c));
    }

    public RealmQuery<E> beginsWith(String str, RealmAny realmAny) {
        return beginsWith(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> contains(String str, RealmAny realmAny) {
        return contains(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> endsWith(String str, RealmAny realmAny) {
        return endsWith(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> equalTo(String str, @Nullable String str2, Case r4) {
        this.f66637b.checkIfValid();
        equalTo(str, RealmAny.valueOf(str2), r4);
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29599in(String str, @Nullable String[] strArr, Case r6) {
        this.f66637b.checkIfValid();
        if (strArr != null && strArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                if (str2 != null) {
                    realmAnyArr[i] = RealmAny.valueOf(str2);
                } else {
                    realmAnyArr[i] = null;
                }
            }
            if (r6 == Case.SENSITIVE) {
                this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
            } else {
                this.f66638c.inInsensitive(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
            }
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery<E> like(String str, RealmAny realmAny) {
        return like(str, realmAny, Case.SENSITIVE);
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable String str2, Case r4) {
        this.f66637b.checkIfValid();
        notEqualTo(str, RealmAny.valueOf(str2), r4);
        return this;
    }

    public RealmQuery<E> beginsWith(String str, String str2, Case r4) {
        Util.checkNull(str2, "value");
        this.f66637b.checkIfValid();
        beginsWith(str, RealmAny.valueOf(str2), r4);
        return this;
    }

    public RealmQuery<E> between(String str, long j, long j2) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Long.valueOf(j)), RealmAny.valueOf(Long.valueOf(j2)));
        return this;
    }

    public RealmQuery<E> contains(String str, String str2, Case r4) {
        Util.checkNull(str2, "value");
        this.f66637b.checkIfValid();
        contains(str, RealmAny.valueOf(str2), r4);
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Byte b) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(b));
        return this;
    }

    public RealmQuery<E> endsWith(String str, String str2, Case r4) {
        Util.checkNull(str2, "value");
        this.f66637b.checkIfValid();
        endsWith(str, RealmAny.valueOf(str2), r4);
        return this;
    }

    public RealmQuery<E> greaterThan(String str, long j) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, long j) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> lessThan(String str, long j) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, long j) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Long.valueOf(j)));
        return this;
    }

    public RealmQuery<E> like(String str, String str2, Case r4) {
        Util.checkNull(str2, "value");
        this.f66637b.checkIfValid();
        like(str, RealmAny.valueOf(str2), r4);
        return this;
    }

    public RealmQuery<E> sort(String str, Sort sort) {
        this.f66637b.checkIfValid();
        return sort(new String[]{str}, new Sort[]{sort});
    }

    public RealmQuery<E> equalTo(String str, RealmAny realmAny, Case r4) {
        this.f66637b.checkIfValid();
        if (r4 == Case.SENSITIVE) {
            this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, realmAny);
        } else {
            this.f66638c.equalToInsensitive(this.f66637b.getSchema().m29583e(), str, realmAny);
        }
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, RealmAny realmAny, Case r4) {
        this.f66637b.checkIfValid();
        if (r4 == Case.SENSITIVE) {
            this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, realmAny);
        } else {
            this.f66638c.notEqualToInsensitive(this.f66637b.getSchema().m29583e(), str, realmAny);
        }
        return this;
    }

    public RealmQuery<E> between(String str, double d, double d2) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Double.valueOf(d)), RealmAny.valueOf(Double.valueOf(d2)));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Short sh) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(sh));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, double d) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Double.valueOf(d)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, double d) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Double.valueOf(d)));
        return this;
    }

    public RealmQuery<E> lessThan(String str, Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> sort(String str, Sort sort, String str2, Sort sort2) {
        this.f66637b.checkIfValid();
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    public RealmQuery<E> beginsWith(String str, RealmAny realmAny, Case r4) {
        this.f66637b.checkIfValid();
        if (r4 == Case.SENSITIVE) {
            this.f66638c.beginsWith(this.f66637b.getSchema().m29583e(), str, realmAny);
        } else {
            this.f66638c.beginsWithInsensitive(this.f66637b.getSchema().m29583e(), str, realmAny);
        }
        return this;
    }

    public RealmQuery<E> contains(String str, RealmAny realmAny, Case r4) {
        this.f66637b.checkIfValid();
        if (r4 == Case.SENSITIVE) {
            this.f66638c.contains(this.f66637b.getSchema().m29583e(), str, realmAny);
        } else {
            this.f66638c.containsInsensitive(this.f66637b.getSchema().m29583e(), str, realmAny);
        }
        return this;
    }

    public RealmQuery<E> endsWith(String str, RealmAny realmAny, Case r4) {
        this.f66637b.checkIfValid();
        if (r4 == Case.SENSITIVE) {
            this.f66638c.endsWith(this.f66637b.getSchema().m29583e(), str, realmAny);
        } else {
            this.f66638c.endsWithInsensitive(this.f66637b.getSchema().m29583e(), str, realmAny);
        }
        return this;
    }

    public RealmQuery<E> like(String str, RealmAny realmAny, Case r4) {
        this.f66637b.checkIfValid();
        if (r4 == Case.SENSITIVE) {
            this.f66638c.like(this.f66637b.getSchema().m29583e(), str, realmAny);
        } else {
            this.f66638c.likeInsensitive(this.f66637b.getSchema().m29583e(), str, realmAny);
        }
        return this;
    }

    public RealmQuery<E> between(String str, float f, float f2) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Float.valueOf(f)), RealmAny.valueOf(Float.valueOf(f2)));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Integer num) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(num));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, float f) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Float.valueOf(f)));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, float f) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Float.valueOf(f)));
        return this;
    }

    public RealmQuery<E> lessThan(String str, ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> sort(String[] strArr, Sort[] sortArr) {
        if (sortArr != null && sortArr.length != 0) {
            if (strArr.length == sortArr.length) {
                this.f66637b.checkIfValid();
                this.f66638c.sort(this.f66637b.getSchema().m29583e(), strArr, sortArr);
                return this;
            }
            throw new IllegalArgumentException("Number of fields and sort orders do not match.");
        }
        throw new IllegalArgumentException("You must provide at least one sort order.");
    }

    public RealmQuery<E> equalTo(String str, @Nullable Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> between(String str, Date date, Date date2) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date), RealmAny.valueOf(date2));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Long l) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(l));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> lessThan(String str, UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery(RealmResults realmResults, Class cls) {
        BaseRealm baseRealm = realmResults.baseRealm;
        this.f66637b = baseRealm;
        this.f66640e = cls;
        boolean z = !m29611g(cls);
        this.f66642g = z;
        if (!z) {
            this.f66639d = baseRealm.getSchema().m29582f(cls);
            this.f66636a = realmResults.m29374e();
            this.f66643h = null;
            this.f66638c = realmResults.m29375d().where();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    public RealmQuery<E> equalTo(String str, @Nullable ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> between(String str, RealmAny realmAny, RealmAny realmAny2) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, realmAny, realmAny2);
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Double d) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(d));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, realmAny);
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> lessThan(String str, double d) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Double.valueOf(d)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, double d) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Double.valueOf(d)));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> between(String str, Decimal128 decimal128, Decimal128 decimal1282) {
        this.f66637b.checkIfValid();
        this.f66638c.between(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128), RealmAny.valueOf(decimal1282));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Float f) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(f));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29606in(String str, @Nullable Byte[] bArr) {
        this.f66637b.checkIfValid();
        if (bArr != null && bArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(bArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery<E> lessThan(String str, float f) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Float.valueOf(f)));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, float f) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(Float.valueOf(f)));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Byte b) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(b));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        notEqualTo(str, realmAny, Case.SENSITIVE);
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable String str2) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(str2));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> lessThan(String str, Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable byte[] bArr) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(bArr));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Byte b) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(b));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable byte[] bArr) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(bArr));
        return this;
    }

    public RealmQuery<E> greaterThan(String str, UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThan(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> greaterThanOrEqualTo(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        this.f66638c.greaterThanOrEqual(this.f66637b.getSchema().m29583e(), str, realmAny);
        return this;
    }

    public RealmQuery<E> lessThan(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThan(this.f66637b.getSchema().m29583e(), str, realmAny);
        return this;
    }

    public RealmQuery<E> lessThanOrEqualTo(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        this.f66638c.lessThanOrEqual(this.f66637b.getSchema().m29583e(), str, realmAny);
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Short sh) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(sh));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable byte[] bArr) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(bArr));
        return this;
    }

    public RealmQuery(BaseRealm baseRealm, OsList osList, Class cls) {
        this.f66637b = baseRealm;
        this.f66640e = cls;
        boolean z = !m29611g(cls);
        this.f66642g = z;
        if (!z) {
            RealmObjectSchema m29582f = baseRealm.getSchema().m29582f(cls);
            this.f66639d = m29582f;
            this.f66636a = m29582f.m29619f();
            this.f66643h = osList;
            this.f66638c = osList.getQuery();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    public RealmQuery<E> containsValue(String str, @Nullable Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Integer num) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(num));
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29601in(String str, @Nullable Short[] shArr) {
        this.f66637b.checkIfValid();
        if (shArr != null && shArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[shArr.length];
            for (int i = 0; i < shArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(shArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Short sh) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(sh));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable Decimal128 decimal128) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(decimal128));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Long l) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(l));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Integer num) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(num));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable ObjectId objectId) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(objectId));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Double d) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(d));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Long l) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(l));
        return this;
    }

    public RealmQuery<E> containsValue(String str, @Nullable UUID uuid) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(uuid));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Float f) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(f));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Double d) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(d));
        return this;
    }

    public RealmQuery<E> containsValue(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, realmAny);
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29603in(String str, @Nullable Integer[] numArr) {
        this.f66637b.checkIfValid();
        if (numArr != null && numArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[numArr.length];
            for (int i = 0; i < numArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(numArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery(BaseRealm baseRealm, OsSet osSet, Class cls) {
        this.f66637b = baseRealm;
        this.f66640e = cls;
        boolean z = !m29611g(cls);
        this.f66642g = z;
        if (!z) {
            RealmObjectSchema m29582f = baseRealm.getSchema().m29582f(cls);
            this.f66639d = m29582f;
            this.f66636a = m29582f.m29619f();
            this.f66643h = osSet;
            this.f66638c = osSet.getQuery();
            return;
        }
        throw new UnsupportedOperationException("Queries on primitive lists are not yet supported");
    }

    public RealmQuery<E> equalTo(String str, @Nullable Boolean bool) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(bool));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Float f) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(f));
        return this;
    }

    public RealmQuery<E> containsValue(String str, RealmModel realmModel) {
        this.f66637b.checkIfValid();
        this.f66638c.containsValue(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(realmModel));
        return this;
    }

    public RealmQuery<E> equalTo(String str, @Nullable Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Boolean bool) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(bool));
        return this;
    }

    public RealmQuery<E> equalTo(String str, RealmAny realmAny) {
        this.f66637b.checkIfValid();
        this.f66638c.equalTo(this.f66637b.getSchema().m29583e(), str, realmAny);
        return this;
    }

    public RealmQuery<E> notEqualTo(String str, @Nullable Date date) {
        this.f66637b.checkIfValid();
        this.f66638c.notEqualTo(this.f66637b.getSchema().m29583e(), str, RealmAny.valueOf(date));
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29602in(String str, @Nullable Long[] lArr) {
        this.f66637b.checkIfValid();
        if (lArr != null && lArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[lArr.length];
            for (int i = 0; i < lArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(lArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery(BaseRealm baseRealm, String str) {
        this.f66637b = baseRealm;
        this.f66641f = str;
        this.f66642g = false;
        RealmObjectSchema m29581g = baseRealm.getSchema().m29581g(str);
        this.f66639d = m29581g;
        Table m29619f = m29581g.m29619f();
        this.f66636a = m29619f;
        this.f66638c = m29619f.where();
        this.f66643h = null;
    }

    /* renamed from: in */
    public RealmQuery<E> m29605in(String str, @Nullable Double[] dArr) {
        this.f66637b.checkIfValid();
        if (dArr != null && dArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[dArr.length];
            for (int i = 0; i < dArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(dArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery(RealmResults realmResults, String str) {
        BaseRealm baseRealm = realmResults.baseRealm;
        this.f66637b = baseRealm;
        this.f66641f = str;
        this.f66642g = false;
        RealmObjectSchema m29581g = baseRealm.getSchema().m29581g(str);
        this.f66639d = m29581g;
        this.f66636a = m29581g.m29619f();
        this.f66638c = realmResults.m29375d().where();
        this.f66643h = null;
    }

    /* renamed from: in */
    public RealmQuery<E> m29604in(String str, @Nullable Float[] fArr) {
        this.f66637b.checkIfValid();
        if (fArr != null && fArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[fArr.length];
            for (int i = 0; i < fArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(fArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    public RealmQuery(BaseRealm baseRealm, OsList osList, String str) {
        this.f66637b = baseRealm;
        this.f66641f = str;
        this.f66642g = false;
        RealmObjectSchema m29581g = baseRealm.getSchema().m29581g(str);
        this.f66639d = m29581g;
        this.f66636a = m29581g.m29619f();
        this.f66638c = osList.getQuery();
        this.f66643h = osList;
    }

    /* renamed from: in */
    public RealmQuery<E> m29607in(String str, @Nullable Boolean[] boolArr) {
        this.f66637b.checkIfValid();
        if (boolArr != null && boolArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[boolArr.length];
            for (int i = 0; i < boolArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(boolArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29598in(String str, @Nullable Date[] dateArr) {
        this.f66637b.checkIfValid();
        if (dateArr != null && dateArr.length != 0) {
            RealmAny[] realmAnyArr = new RealmAny[dateArr.length];
            for (int i = 0; i < dateArr.length; i++) {
                realmAnyArr[i] = RealmAny.valueOf(dateArr[i]);
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr);
        } else {
            alwaysFalse();
        }
        return this;
    }

    /* renamed from: in */
    public RealmQuery<E> m29608in(String str, RealmAny[] realmAnyArr) {
        this.f66637b.checkIfValid();
        if (realmAnyArr != null && realmAnyArr.length != 0) {
            RealmAny[] realmAnyArr2 = new RealmAny[realmAnyArr.length];
            for (int i = 0; i < realmAnyArr.length; i++) {
                RealmAny realmAny = realmAnyArr[i];
                if (realmAny == null) {
                    realmAny = RealmAny.nullValue();
                }
                realmAnyArr2[i] = realmAny;
            }
            this.f66638c.m29515in(this.f66637b.getSchema().m29583e(), str, realmAnyArr2);
        } else {
            alwaysFalse();
        }
        return this;
    }
}
