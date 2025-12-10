package com.google.api.client.util.store;

import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class AbstractDataStore<V extends Serializable> implements DataStore<V> {

    /* renamed from: a */
    public final DataStoreFactory f52392a;

    /* renamed from: b */
    public final String f52393b;

    public AbstractDataStore(DataStoreFactory dataStoreFactory, String str) {
        this.f52392a = (DataStoreFactory) Preconditions.checkNotNull(dataStoreFactory);
        this.f52393b = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean containsKey(String str) throws IOException {
        if (get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean containsValue(V v) throws IOException {
        return values().contains(v);
    }

    @Override // com.google.api.client.util.store.DataStore
    public DataStoreFactory getDataStoreFactory() {
        return this.f52392a;
    }

    @Override // com.google.api.client.util.store.DataStore
    public final String getId() {
        return this.f52393b;
    }

    @Override // com.google.api.client.util.store.DataStore
    public boolean isEmpty() throws IOException {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.api.client.util.store.DataStore
    public int size() throws IOException {
        return keySet().size();
    }
}