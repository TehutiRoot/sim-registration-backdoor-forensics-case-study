package com.google.api.client.util.store;

import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class MemoryDataStoreFactory extends AbstractDataStoreFactory {

    /* renamed from: com.google.api.client.util.store.MemoryDataStoreFactory$a */
    /* loaded from: classes4.dex */
    public static class C7317a {

        /* renamed from: a */
        public static final MemoryDataStoreFactory f52401a = new MemoryDataStoreFactory();
    }

    /* renamed from: com.google.api.client.util.store.MemoryDataStoreFactory$b */
    /* loaded from: classes4.dex */
    public static class C7318b extends AbstractMemoryDataStore {
        public C7318b(MemoryDataStoreFactory memoryDataStoreFactory, String str) {
            super(memoryDataStoreFactory, str);
        }

        @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
        /* renamed from: a */
        public MemoryDataStoreFactory getDataStoreFactory() {
            return (MemoryDataStoreFactory) super.getDataStoreFactory();
        }
    }

    public static MemoryDataStoreFactory getDefaultInstance() {
        return C7317a.f52401a;
    }

    @Override // com.google.api.client.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new C7318b(this, str);
    }
}