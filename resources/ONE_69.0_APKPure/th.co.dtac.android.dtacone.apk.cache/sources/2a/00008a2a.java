package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* renamed from: a */
    public final Provider f44247a;

    /* renamed from: b */
    public final Provider f44248b;

    /* renamed from: c */
    public final Provider f44249c;

    public SchemaManager_Factory(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f44247a = provider;
        this.f44248b = provider2;
        this.f44249c = provider3;
    }

    public static SchemaManager_Factory create(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new SchemaManager_Factory(provider, provider2, provider3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // javax.inject.Provider
    public SchemaManager get() {
        return newInstance((Context) this.f44247a.get(), (String) this.f44248b.get(), ((Integer) this.f44249c.get()).intValue());
    }
}