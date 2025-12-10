package com.facebook.stetho.inspector.helper;

import android.util.SparseArray;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
public class ObjectIdMapper {
    protected final Object mSync = new Object();
    @GuardedBy("mSync")
    private int mNextId = 1;
    @GuardedBy("mSync")
    private final Map<Object, Integer> mObjectToIdMap = new IdentityHashMap();
    @GuardedBy("mSync")
    private SparseArray<Object> mIdToObjectMap = new SparseArray<>();

    public void clear() {
        SparseArray<Object> sparseArray;
        synchronized (this.mSync) {
            sparseArray = this.mIdToObjectMap;
            this.mObjectToIdMap.clear();
            this.mIdToObjectMap = new SparseArray<>();
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            onUnmapped(sparseArray.valueAt(i), sparseArray.keyAt(i));
        }
    }

    public boolean containsId(int i) {
        boolean z;
        synchronized (this.mSync) {
            if (this.mIdToObjectMap.get(i) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public boolean containsObject(Object obj) {
        boolean containsKey;
        synchronized (this.mSync) {
            containsKey = this.mObjectToIdMap.containsKey(obj);
        }
        return containsKey;
    }

    @Nullable
    public Integer getIdForObject(Object obj) {
        Integer num;
        synchronized (this.mSync) {
            num = this.mObjectToIdMap.get(obj);
        }
        return num;
    }

    @Nullable
    public Object getObjectForId(int i) {
        Object obj;
        synchronized (this.mSync) {
            obj = this.mIdToObjectMap.get(i);
        }
        return obj;
    }

    public void onMapped(Object obj, int i) {
    }

    public void onUnmapped(Object obj, int i) {
    }

    public int putObject(Object obj) {
        synchronized (this.mSync) {
            try {
                Integer num = this.mObjectToIdMap.get(obj);
                if (num != null) {
                    return num.intValue();
                }
                int i = this.mNextId;
                this.mNextId = i + 1;
                this.mObjectToIdMap.put(obj, Integer.valueOf(i));
                this.mIdToObjectMap.put(i, obj);
                onMapped(obj, i);
                return i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public Integer removeObject(Object obj) {
        synchronized (this.mSync) {
            try {
                Integer remove = this.mObjectToIdMap.remove(obj);
                if (remove == null) {
                    return null;
                }
                this.mIdToObjectMap.remove(remove.intValue());
                onUnmapped(obj, remove.intValue());
                return remove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public Object removeObjectById(int i) {
        synchronized (this.mSync) {
            try {
                Object obj = this.mIdToObjectMap.get(i);
                if (obj == null) {
                    return null;
                }
                this.mIdToObjectMap.remove(i);
                this.mObjectToIdMap.remove(obj);
                onUnmapped(obj, i);
                return obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int size() {
        int size;
        synchronized (this.mSync) {
            size = this.mObjectToIdMap.size();
        }
        return size;
    }
}