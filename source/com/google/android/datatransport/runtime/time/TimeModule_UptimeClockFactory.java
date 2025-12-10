package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    /* renamed from: com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6296a {

        /* renamed from: a */
        public static final TimeModule_UptimeClockFactory f44240a = new TimeModule_UptimeClockFactory();
    }

    public static TimeModule_UptimeClockFactory create() {
        return C6296a.f44240a;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.m48966b());
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return uptimeClock();
    }
}
