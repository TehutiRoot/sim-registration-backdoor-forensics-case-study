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
public final class EventStoreModule_StoreConfigFactory implements Factory<AbstractC1667XS> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6279a {

        /* renamed from: a */
        public static final EventStoreModule_StoreConfigFactory f44221a = new EventStoreModule_StoreConfigFactory();
    }

    public static EventStoreModule_StoreConfigFactory create() {
        return C6279a.f44221a;
    }

    public static AbstractC1667XS storeConfig() {
        return (AbstractC1667XS) Preconditions.checkNotNullFromProvides(EventStoreModule.m49059d());
    }

    @Override // javax.inject.Provider
    public AbstractC1667XS get() {
        return storeConfig();
    }
}