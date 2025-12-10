package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Maps;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class AbstractMemoryDataStore<V extends Serializable> extends AbstractDataStore<V> {

    /* renamed from: c */
    public final Lock f52397c;
    protected HashMap<String, byte[]> keyValueMap;

    public AbstractMemoryDataStore(DataStoreFactory dataStoreFactory, String str) {
        super(dataStoreFactory, str);
        this.f52397c = new ReentrantLock();
        this.keyValueMap = Maps.newHashMap();
    }

    @Override // com.google.api.client.util.store.DataStore
    public final DataStore<V> clear() throws IOException {
        this.f52397c.lock();
        try {
            this.keyValueMap.clear();
            save();
            return this;
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public boolean containsKey(String str) throws IOException {
        if (str == null) {
            return false;
        }
        this.f52397c.lock();
        try {
            return this.keyValueMap.containsKey(str);
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public boolean containsValue(V v) throws IOException {
        if (v == null) {
            return false;
        }
        this.f52397c.lock();
        try {
            byte[] serialize = IOUtils.serialize(v);
            for (byte[] bArr : this.keyValueMap.values()) {
                if (Arrays.equals(serialize, bArr)) {
                    this.f52397c.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public DataStore<V> delete(String str) throws IOException {
        if (str == null) {
            return this;
        }
        this.f52397c.lock();
        try {
            this.keyValueMap.remove(str);
            save();
            return this;
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public final V get(String str) throws IOException {
        if (str == null) {
            return null;
        }
        this.f52397c.lock();
        try {
            return (V) IOUtils.deserialize(this.keyValueMap.get(str));
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public boolean isEmpty() throws IOException {
        this.f52397c.lock();
        try {
            return this.keyValueMap.isEmpty();
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.DataStore
    public final Set<String> keySet() throws IOException {
        this.f52397c.lock();
        try {
            return Collections.unmodifiableSet(this.keyValueMap.keySet());
        } finally {
            this.f52397c.unlock();
        }
    }

    public void save() throws IOException {
    }

    @Override // com.google.api.client.util.store.DataStore
    public final DataStore<V> set(String str, V v) throws IOException {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(v);
        this.f52397c.lock();
        try {
            this.keyValueMap.put(str, IOUtils.serialize(v));
            save();
            return this;
        } finally {
            this.f52397c.unlock();
        }
    }

    @Override // com.google.api.client.util.store.AbstractDataStore, com.google.api.client.util.store.DataStore
    public int size() throws IOException {
        this.f52397c.lock();
        try {
            return this.keyValueMap.size();
        } finally {
            this.f52397c.unlock();
        }
    }

    public String toString() {
        return DataStoreUtils.toString(this);
    }

    @Override // com.google.api.client.util.store.DataStore
    public final Collection<V> values() throws IOException {
        this.f52397c.lock();
        try {
            ArrayList newArrayList = Lists.newArrayList();
            for (byte[] bArr : this.keyValueMap.values()) {
                newArrayList.add(IOUtils.deserialize(bArr));
            }
            List unmodifiableList = Collections.unmodifiableList(newArrayList);
            this.f52397c.unlock();
            return unmodifiableList;
        } catch (Throwable th2) {
            this.f52397c.unlock();
            throw th2;
        }
    }
}