package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    /* renamed from: com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6295a {

        /* renamed from: a */
        public static final TimeModule_EventClockFactory f44239a = new TimeModule_EventClockFactory();
    }

    public static TimeModule_EventClockFactory create() {
        return C6295a.f44239a;
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNullFromProvides(TimeModule.m48967a());
    }

    @Override // javax.inject.Provider
    public Clock get() {
        return eventClock();
    }
}
