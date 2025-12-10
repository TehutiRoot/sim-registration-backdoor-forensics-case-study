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
public final class MetadataBackendRegistry_Factory implements Factory<C23278ys0> {

    /* renamed from: a */
    public final Provider f44087a;

    /* renamed from: b */
    public final Provider f44088b;

    public MetadataBackendRegistry_Factory(Provider<Context> provider, Provider<C0901Mz> provider2) {
        this.f44087a = provider;
        this.f44088b = provider2;
    }

    public static MetadataBackendRegistry_Factory create(Provider<Context> provider, Provider<C0901Mz> provider2) {
        return new MetadataBackendRegistry_Factory(provider, provider2);
    }

    public static C23278ys0 newInstance(Context context, Object obj) {
        return new C23278ys0(context, (C0901Mz) obj);
    }

    @Override // javax.inject.Provider
    public C23278ys0 get() {
        return newInstance((Context) this.f44087a.get(), this.f44088b.get());
    }
}