package io.realm.internal;

import io.realm.RealmAny;
import io.realm.RealmAnyNativeFunctionsImpl;
import io.realm.Sort;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;
import java.util.Date;
import javax.annotation.Nullable;
import org.apache.commons.cli.HelpFormatter;
import org.bson.types.Decimal128;

/* loaded from: classes5.dex */
public class TableQuery implements NativeObject {

    /* renamed from: e */
    public static final long f66785e = nativeGetFinalizerPtr();

    /* renamed from: a */
    public final Table f66786a;

    /* renamed from: b */
    public final long f66787b;

    /* renamed from: c */
    public final RealmAnyNativeFunctionsImpl f66788c = new RealmAnyNativeFunctionsImpl();

    /* renamed from: d */
    public boolean f66789d = true;

    public TableQuery(NativeContext nativeContext, Table table, long j) {
        this.f66786a = table;
        this.f66787b = j;
        nativeContext.addReference(this);
    }

    /* renamed from: a */
    public static String m29518a(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR, "\\ ");
    }

    public static String buildDistinctDescriptor(String[] strArr) {
        StringBuilder sb = new StringBuilder("DISTINCT(");
        int length = strArr.length;
        String str = "";
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            sb.append(str);
            sb.append(m29518a(str2));
            i++;
            str = ", ";
        }
        sb.append(")");
        return sb.toString();
    }

    public static String buildSortDescriptor(String[] strArr, Sort[] sortArr) {
        String str;
        StringBuilder sb = new StringBuilder("SORT(");
        String str2 = "";
        int i = 0;
        while (i < strArr.length) {
            String str3 = strArr[i];
            sb.append(str2);
            sb.append(m29518a(str3));
            sb.append(HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR);
            if (sortArr[i] == Sort.ASCENDING) {
                str = "ASC";
            } else {
                str = "DESC";
            }
            sb.append(str);
            i++;
            str2 = ", ";
        }
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    private void m29516c() {
        throw new IllegalStateException("Mutable method call during read transaction.");
    }

    private native long[] nativeAverageDecimal128(long j, long j2);

    private native double nativeAverageDouble(long j, long j2);

    private native double nativeAverageFloat(long j, long j2);

    private native double nativeAverageInt(long j, long j2);

    private native long[] nativeAverageRealmAny(long j, long j2);

    private native void nativeBeginGroup(long j);

    private native long nativeCount(long j);

    private native void nativeEndGroup(long j);

    private native long nativeFind(long j);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long j, long j2);

    private native Double nativeMaximumDouble(long j, long j2);

    private native Float nativeMaximumFloat(long j, long j2);

    private native Long nativeMaximumInt(long j, long j2);

    private native NativeRealmAny nativeMaximumRealmAny(long j, long j2);

    private native Long nativeMaximumTimestamp(long j, long j2);

    private native long[] nativeMinimumDecimal128(long j, long j2);

    private native Double nativeMinimumDouble(long j, long j2);

    private native Float nativeMinimumFloat(long j, long j2);

    private native Long nativeMinimumInt(long j, long j2);

    private native NativeRealmAny nativeMinimumRealmAny(long j, long j2);

    private native Long nativeMinimumTimestamp(long j, long j2);

    private native void nativeNot(long j);

    private native void nativeOr(long j);

    private native void nativeRawDescriptor(long j, String str, long j2);

    private native void nativeRawPredicate(long j, String str, long[] jArr, long j2);

    private native long nativeRemove(long j);

    private native long[] nativeSumDecimal128(long j, long j2);

    private native double nativeSumDouble(long j, long j2);

    private native double nativeSumFloat(long j, long j2);

    private native long nativeSumInt(long j, long j2);

    private native long[] nativeSumRealmAny(long j, long j2);

    private native String nativeValidateQuery(long j);

    public TableQuery alwaysFalse() {
        rawPredicateWithPointers(null, "FALSEPREDICATE", new long[0]);
        this.f66789d = false;
        return this;
    }

    public TableQuery alwaysTrue() {
        rawPredicateWithPointers(null, "TRUEPREDICATE", new long[0]);
        this.f66789d = false;
        return this;
    }

    public Decimal128 averageDecimal128(long j) {
        validateQuery();
        long[] nativeAverageDecimal128 = nativeAverageDecimal128(this.f66787b, j);
        if (nativeAverageDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeAverageDecimal128[1], nativeAverageDecimal128[0]);
        }
        return new Decimal128(0L);
    }

    public double averageDouble(long j) {
        validateQuery();
        return nativeAverageDouble(this.f66787b, j);
    }

    public double averageFloat(long j) {
        validateQuery();
        return nativeAverageFloat(this.f66787b, j);
    }

    public double averageInt(long j) {
        validateQuery();
        return nativeAverageInt(this.f66787b, j);
    }

    public Decimal128 averageRealmAny(long j) {
        validateQuery();
        long[] nativeAverageRealmAny = nativeAverageRealmAny(this.f66787b, j);
        return Decimal128.fromIEEE754BIDEncoding(nativeAverageRealmAny[1], nativeAverageRealmAny[0]);
    }

    /* renamed from: b */
    public final void m29517b(OsKeyPathMapping osKeyPathMapping, String str) {
        long j;
        long j2 = this.f66787b;
        if (osKeyPathMapping != null) {
            j = osKeyPathMapping.getNativePtr();
        } else {
            j = 0;
        }
        nativeRawDescriptor(j2, str, j);
    }

    public TableQuery beginGroup() {
        nativeBeginGroup(this.f66787b);
        this.f66789d = false;
        return this;
    }

    public TableQuery beginsWith(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " BEGINSWITH $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery beginsWithInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " BEGINSWITH[c] $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery between(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny, RealmAny realmAny2) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, "(" + m29518a(str) + " >= $0 AND " + m29518a(str) + " <= $1)", realmAny, realmAny2);
        this.f66789d = false;
        return this;
    }

    public TableQuery contains(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " CONTAINS $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery containsEntry(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny, RealmAny realmAny2) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + "[$0] == $1", realmAny, realmAny2);
        this.f66789d = false;
        return this;
    }

    public TableQuery containsInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " CONTAINS[c] $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery containsKey(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, "ANY " + m29518a(str) + ".@keys == $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery containsValue(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, "ANY " + m29518a(str) + ".@values == $0", realmAny);
        this.f66789d = false;
        return this;
    }

    @Deprecated
    public long count() {
        validateQuery();
        return nativeCount(this.f66787b);
    }

    public TableQuery distinct(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr) {
        m29517b(osKeyPathMapping, buildDistinctDescriptor(strArr));
        return this;
    }

    public TableQuery endGroup() {
        nativeEndGroup(this.f66787b);
        this.f66789d = false;
        return this;
    }

    public TableQuery endsWith(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " ENDSWITH $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery endsWithInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " ENDSWITH[c] $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery equalTo(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " = $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery equalToInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " =[c] $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public long find() {
        validateQuery();
        return nativeFind(this.f66787b);
    }

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66785e;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66787b;
    }

    public Table getTable() {
        return this.f66786a;
    }

    public TableQuery greaterThan(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " > $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery greaterThanOrEqual(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " >= $0", realmAny);
        this.f66789d = false;
        return this;
    }

    /* renamed from: in */
    public TableQuery m29515in(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny[] realmAnyArr) {
        String m29518a = m29518a(str);
        beginGroup();
        int length = realmAnyArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            RealmAny realmAny = realmAnyArr[i];
            if (!z) {
                m29514or();
            }
            if (realmAny == null) {
                isNull(osKeyPathMapping, m29518a);
            } else {
                equalTo(osKeyPathMapping, m29518a, realmAny);
            }
            i++;
            z = false;
        }
        endGroup();
        this.f66789d = false;
        return this;
    }

    public TableQuery inInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny[] realmAnyArr) {
        String m29518a = m29518a(str);
        beginGroup();
        int length = realmAnyArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            RealmAny realmAny = realmAnyArr[i];
            if (!z) {
                m29514or();
            }
            if (realmAny == null) {
                isNull(osKeyPathMapping, m29518a);
            } else {
                equalToInsensitive(osKeyPathMapping, m29518a, realmAny);
            }
            i++;
            z = false;
        }
        endGroup();
        this.f66789d = false;
        return this;
    }

    public TableQuery isEmpty(@Nullable OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, m29518a(str) + ".@count = 0", new long[0]);
        this.f66789d = false;
        return this;
    }

    public TableQuery isNotEmpty(@Nullable OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, m29518a(str) + ".@count != 0", new long[0]);
        this.f66789d = false;
        return this;
    }

    public TableQuery isNotNull(@Nullable OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, m29518a(str) + " != NULL", new long[0]);
        this.f66789d = false;
        return this;
    }

    public TableQuery isNull(@Nullable OsKeyPathMapping osKeyPathMapping, String str) {
        rawPredicateWithPointers(osKeyPathMapping, m29518a(str) + " = NULL", new long[0]);
        this.f66789d = false;
        return this;
    }

    public TableQuery lessThan(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " < $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery lessThanOrEqual(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " <= $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery like(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " LIKE $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery likeInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " LIKE[c] $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery limit(long j) {
        m29517b(null, "LIMIT(" + j + ")");
        return this;
    }

    public Date maximumDate(long j) {
        validateQuery();
        Long nativeMaximumTimestamp = nativeMaximumTimestamp(this.f66787b, j);
        if (nativeMaximumTimestamp != null) {
            return new Date(nativeMaximumTimestamp.longValue());
        }
        return null;
    }

    public Decimal128 maximumDecimal128(long j) {
        validateQuery();
        long[] nativeMaximumDecimal128 = nativeMaximumDecimal128(this.f66787b, j);
        if (nativeMaximumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeMaximumDecimal128[1], nativeMaximumDecimal128[0]);
        }
        return null;
    }

    public Double maximumDouble(long j) {
        validateQuery();
        return nativeMaximumDouble(this.f66787b, j);
    }

    public Float maximumFloat(long j) {
        validateQuery();
        return nativeMaximumFloat(this.f66787b, j);
    }

    public Long maximumInt(long j) {
        validateQuery();
        return nativeMaximumInt(this.f66787b, j);
    }

    public NativeRealmAny maximumRealmAny(long j) {
        validateQuery();
        return nativeMaximumRealmAny(this.f66787b, j);
    }

    public Date minimumDate(long j) {
        validateQuery();
        Long nativeMinimumTimestamp = nativeMinimumTimestamp(this.f66787b, j);
        if (nativeMinimumTimestamp != null) {
            return new Date(nativeMinimumTimestamp.longValue());
        }
        return null;
    }

    public Decimal128 minimumDecimal128(long j) {
        validateQuery();
        long[] nativeMinimumDecimal128 = nativeMinimumDecimal128(this.f66787b, j);
        if (nativeMinimumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeMinimumDecimal128[1], nativeMinimumDecimal128[0]);
        }
        return null;
    }

    public Double minimumDouble(long j) {
        validateQuery();
        return nativeMinimumDouble(this.f66787b, j);
    }

    public Float minimumFloat(long j) {
        validateQuery();
        return nativeMinimumFloat(this.f66787b, j);
    }

    public Long minimumInt(long j) {
        validateQuery();
        return nativeMinimumInt(this.f66787b, j);
    }

    public NativeRealmAny minimumRealmAny(long j) {
        validateQuery();
        return nativeMinimumRealmAny(this.f66787b, j);
    }

    public TableQuery not() {
        nativeNot(this.f66787b);
        this.f66789d = false;
        return this;
    }

    public TableQuery notEqualTo(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " != $0", realmAny);
        this.f66789d = false;
        return this;
    }

    public TableQuery notEqualToInsensitive(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny realmAny) {
        RealmAnyNativeFunctionsImpl realmAnyNativeFunctionsImpl = this.f66788c;
        realmAnyNativeFunctionsImpl.callRawPredicate(this, osKeyPathMapping, m29518a(str) + " !=[c] $0", realmAny);
        this.f66789d = false;
        return this;
    }

    /* renamed from: or */
    public TableQuery m29514or() {
        nativeOr(this.f66787b);
        this.f66789d = false;
        return this;
    }

    public TableQuery rawPredicate(@Nullable OsKeyPathMapping osKeyPathMapping, String str, RealmAny... realmAnyArr) {
        this.f66788c.callRawPredicate(this, osKeyPathMapping, str, realmAnyArr);
        return this;
    }

    public void rawPredicateWithPointers(@Nullable OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        long j;
        long j2 = this.f66787b;
        if (osKeyPathMapping != null) {
            j = osKeyPathMapping.getNativePtr();
        } else {
            j = 0;
        }
        nativeRawPredicate(j2, str, jArr, j);
    }

    public long remove() {
        validateQuery();
        if (this.f66786a.m29522b()) {
            m29516c();
        }
        return nativeRemove(this.f66787b);
    }

    public TableQuery sort(@Nullable OsKeyPathMapping osKeyPathMapping, String[] strArr, Sort[] sortArr) {
        m29517b(osKeyPathMapping, buildSortDescriptor(strArr, sortArr));
        return this;
    }

    public Decimal128 sumDecimal128(long j) {
        validateQuery();
        long[] nativeSumDecimal128 = nativeSumDecimal128(this.f66787b, j);
        if (nativeSumDecimal128 != null) {
            return Decimal128.fromIEEE754BIDEncoding(nativeSumDecimal128[1], nativeSumDecimal128[0]);
        }
        return null;
    }

    public double sumDouble(long j) {
        validateQuery();
        return nativeSumDouble(this.f66787b, j);
    }

    public double sumFloat(long j) {
        validateQuery();
        return nativeSumFloat(this.f66787b, j);
    }

    public long sumInt(long j) {
        validateQuery();
        return nativeSumInt(this.f66787b, j);
    }

    public Decimal128 sumRealmAny(long j) {
        validateQuery();
        long[] nativeSumRealmAny = nativeSumRealmAny(this.f66787b, j);
        return Decimal128.fromIEEE754BIDEncoding(nativeSumRealmAny[1], nativeSumRealmAny[0]);
    }

    public void validateQuery() {
        if (!this.f66789d) {
            String nativeValidateQuery = nativeValidateQuery(this.f66787b);
            if ("".equals(nativeValidateQuery)) {
                this.f66789d = true;
                return;
            }
            throw new UnsupportedOperationException(nativeValidateQuery);
        }
    }
}
