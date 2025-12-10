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
    public final Provider f44230a;

    /* renamed from: b */
    public final Provider f44231b;

    /* renamed from: c */
    public final Provider f44232c;

    /* renamed from: d */
    public final Provider f44233d;

    /* renamed from: e */
    public final Provider f44234e;

    public SQLiteEventStore_Factory(Provider<Clock> provider, Provider<Clock> provider2, Provider<AbstractC1667XS> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        this.f44230a = provider;
        this.f44231b = provider2;
        this.f44232c = provider3;
        this.f44233d = provider4;
        this.f44234e = provider5;
    }

    public static SQLiteEventStore_Factory create(Provider<Clock> provider, Provider<Clock> provider2, Provider<AbstractC1667XS> provider3, Provider<SchemaManager> provider4, Provider<String> provider5) {
        return new SQLiteEventStore_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2, Provider<String> provider) {
        return new SQLiteEventStore(clock, clock2, (AbstractC1667XS) obj, (SchemaManager) obj2, provider);
    }

    @Override // javax.inject.Provider
    public SQLiteEventStore get() {
        return newInstance((Clock) this.f44230a.get(), (Clock) this.f44231b.get(), this.f44232c.get(), this.f44233d.get(), this.f44234e);
    }
}