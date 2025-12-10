package io.realm;

/* loaded from: classes5.dex */
public interface MapChangeSet<T> {
    T[] getChanges();

    T[] getDeletions();

    T[] getInsertions();

    boolean isEmpty();
}