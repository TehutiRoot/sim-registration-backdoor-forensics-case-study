package com.google.common.cache;

import com.google.common.cache.LocalCache;

/* renamed from: com.google.common.cache.b */
/* loaded from: classes4.dex */
public interface InterfaceC7524b {
    long getAccessTime();

    int getHash();

    Object getKey();

    InterfaceC7524b getNext();

    InterfaceC7524b getNextInAccessQueue();

    InterfaceC7524b getNextInWriteQueue();

    InterfaceC7524b getPreviousInAccessQueue();

    InterfaceC7524b getPreviousInWriteQueue();

    LocalCache.InterfaceC7506s getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(InterfaceC7524b interfaceC7524b);

    void setNextInWriteQueue(InterfaceC7524b interfaceC7524b);

    void setPreviousInAccessQueue(InterfaceC7524b interfaceC7524b);

    void setPreviousInWriteQueue(InterfaceC7524b interfaceC7524b);

    void setValueReference(LocalCache.InterfaceC7506s interfaceC7506s);

    void setWriteTime(long j);
}