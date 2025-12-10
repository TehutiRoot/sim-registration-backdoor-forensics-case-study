package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class EventStoreModule_StoreConfigFactory implements Factory<AbstractC1387TS> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6290a {

        /* renamed from: a */
        public static final EventStoreModule_StoreConfigFactory f44209a = new EventStoreModule_StoreConfigFactory();
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return C6290a.f44209a;
    }

    public static AbstractC1387TS storeConfig() {
        return (AbstractC1387TS) Preconditions.checkNotNullFromProvides(EventStoreModule.m49062d());
    }

    @Override // javax.inject.Provider
    public AbstractC1387TS get() {
        return storeConfig();
    }
}
