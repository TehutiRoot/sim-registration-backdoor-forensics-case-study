package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import com.google.android.datatransport.runtime.time.Clock;
import javax.inject.Provider;

@QualifierMetadata({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class CreationContextFactory_Factory implements Factory<C0901Mz> {

    /* renamed from: a */
    public final Provider f44084a;

    /* renamed from: b */
    public final Provider f44085b;

    /* renamed from: c */
    public final Provider f44086c;

    public CreationContextFactory_Factory(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        this.f44084a = provider;
        this.f44085b = provider2;
        this.f44086c = provider3;
    }

    public static CreationContextFactory_Factory create(Provider<Context> provider, Provider<Clock> provider2, Provider<Clock> provider3) {
        return new CreationContextFactory_Factory(provider, provider2, provider3);
    }

    public static C0901Mz newInstance(Context context, Clock clock, Clock clock2) {
        return new C0901Mz(context, clock, clock2);
    }

    @Override // javax.inject.Provider
    public C0901Mz get() {
        return newInstance((Context) this.f44084a.get(), (Clock) this.f44085b.get(), (Clock) this.f44086c.get());
    }
}