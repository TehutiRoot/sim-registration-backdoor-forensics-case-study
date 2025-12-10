package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class zzmu<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzamq = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zzamq);
    }

    public int zza(Object[] objArr, int i) {
        zzna zznaVar = (zzna) iterator();
        while (zznaVar.hasNext()) {
            objArr[i] = zznaVar.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzjo */
    public abstract zzna<E> iterator();

    @NullableDecl
    public Object[] zzjp() {
        return null;
    }

    public int zzjq() {
        throw new UnsupportedOperationException();
    }

    public int zzjr() {
        throw new UnsupportedOperationException();
    }

    public zzmx<E> zzjs() {
        if (isEmpty()) {
            return zzmx.zzju();
        }
        return zzmx.zza(toArray());
    }

    public abstract boolean zzjt();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zzml.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzjp = zzjp();
            if (zzjp != null) {
                return (T[]) Arrays.copyOfRange(zzjp, zzjq(), zzjr(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }
}