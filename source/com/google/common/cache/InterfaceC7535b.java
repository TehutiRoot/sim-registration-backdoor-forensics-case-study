package com.google.common.cache;

import com.google.common.cache.LocalCache;

/* renamed from: com.google.common.cache.b */
/* loaded from: classes4.dex */
public interface InterfaceC7535b {
    long getAccessTime();

    int getHash();

    Object getKey();

    InterfaceC7535b getNext();

    InterfaceC7535b getNextInAccessQueue();

    InterfaceC7535b getNextInWriteQueue();

    InterfaceC7535b getPreviousInAccessQueue();

    InterfaceC7535b getPreviousInWriteQueue();

    LocalCache.InterfaceC7517s getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(InterfaceC7535b interfaceC7535b);

    void setNextInWriteQueue(InterfaceC7535b interfaceC7535b);

    void setPreviousInAccessQueue(InterfaceC7535b interfaceC7535b);

    void setPreviousInWriteQueue(InterfaceC7535b interfaceC7535b);

    void setValueReference(LocalCache.InterfaceC7517s interfaceC7517s);

    void setWriteTime(long j);
}
