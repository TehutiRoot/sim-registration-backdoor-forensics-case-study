package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes3.dex */
public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {

    /* renamed from: a */
    public final Provider f44218a;

    /* renamed from: b */
    public final Provider f44219b;

    /* renamed from: c */
    public final Provider f44220c;

    /* renamed from: d */
    public final Provider f44221d;

    /* renamed from: e */
    public final Provider f44222e;

    public SQLiteEventStore_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<AbstractC1387TS> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        this.f44218a = provider;
        this.f44219b = provider2;
        this.f44220c = provider3;
        this.f44221d = provider4;
        this.f44222e = provider5;
    }

    public static SQLiteEventStore_Factory create(Provider<Clock> provider, Provider<Clock> provider2, Provider<AbstractC1387TS> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        return new SQLiteEventStore_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, Provider<String> provider) {
        return new SQLiteEventStore(clock, clock2, (AbstractC1387TS) obj, (SchemaManager) obj2, provider);
    }

    @Override // javax.inject.Provider
    public SQLiteEventStore get() {
        return newInstance((Clock) this.f44218a.get(), (Clock) this.f44219b.get(), this.f44220c.get(), this.f44221d.get(), this.f44222e);
    }
}
