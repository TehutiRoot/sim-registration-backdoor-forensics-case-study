package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes3.dex */
public final class MetadataBackendRegistry_Factory implements Factory<C22175ss0> {

    /* renamed from: a */
    public final Provider f44075a;

    /* renamed from: b */
    public final Provider f44076b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<C0912Mz> provider2) {
        this.f44075a = provider;
        this.f44076b = provider2;
    }

    public static MetadataBackendRegistry_Factory create(Provider<Context> provider, Provider<C0912Mz> provider2) {
        return new MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static C22175ss0 newInstance(Context context, Object obj) {
        return new C22175ss0(context, (C0912Mz) obj);
    }

    @Override // javax.inject.Provider
    public C22175ss0 get() {
        return newInstance((Context) this.f44075a.get(), this.f44076b.get());
    }
}
