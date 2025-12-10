package com.google.api.client.util.store;

import com.google.api.client.util.Maps;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class AbstractDataStoreFactory implements DataStoreFactory {

    /* renamed from: c */
    public static final Pattern f52382c = Pattern.compile("\\w{1,30}");

    /* renamed from: a */
    public final Lock f52383a = new ReentrantLock();

    /* renamed from: b */
    public final Map f52384b = Maps.newHashMap();

    public abstract <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException;

    @Override // com.google.api.client.util.store.DataStoreFactory
    public final <V extends Serializable> DataStore<V> getDataStore(String str) throws IOException {
        Pattern pattern = f52382c;
        Preconditions.checkArgument(pattern.matcher(str).matches(), "%s does not match pattern %s", str, pattern);
        this.f52383a.lock();
        try {
            DataStore<V> dataStore = (DataStore) this.f52384b.get(str);
            if (dataStore == null) {
                dataStore = createDataStore(str);
                this.f52384b.put(str, dataStore);
            }
            return dataStore;
        } finally {
            this.f52383a.unlock();
        }
    }
}
