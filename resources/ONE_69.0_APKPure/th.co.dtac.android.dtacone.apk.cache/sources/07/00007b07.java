package ch.qos.logback.core.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class COWArrayList<E> implements List<E> {

    /* renamed from: a */
    public AtomicBoolean f40152a = new AtomicBoolean(false);

    /* renamed from: b */
    public CopyOnWriteArrayList f40153b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public Object[] f40154c;

    /* renamed from: d */
    public final Object[] f40155d;

    public COWArrayList(E[] eArr) {
        this.f40155d = eArr;
    }

    /* renamed from: a */
    public final boolean m51324a() {
        return this.f40152a.get();
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.f40153b.add(i, e);
        m51323b();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        boolean addAll = this.f40153b.addAll(i, collection);
        m51323b();
        return addAll;
    }

    public void addIfAbsent(E e) {
        this.f40153b.addIfAbsent(e);
        m51323b();
    }

    public E[] asTypedArray() {
        m51321d();
        return (E[]) this.f40154c;
    }

    /* renamed from: b */
    public final void m51323b() {
        this.f40152a.set(false);
    }

    /* renamed from: c */
    public final void m51322c() {
        this.f40154c = this.f40153b.toArray(this.f40155d);
        this.f40152a.set(true);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f40153b.clear();
        m51323b();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f40153b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f40153b.containsAll(collection);
    }

    /* renamed from: d */
    public final void m51321d() {
        if (m51324a()) {
            return;
        }
        m51322c();
    }

    @Override // java.util.List
    public E get(int i) {
        m51321d();
        return (E) this.f40154c[i];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f40153b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f40153b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f40153b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f40153b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f40153b.listIterator();
    }

    @Override // java.util.List
    public E remove(int i) {
        E e = (E) this.f40153b.remove(i);
        m51323b();
        return e;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f40153b.removeAll(collection);
        m51323b();
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f40153b.retainAll(collection);
        m51323b();
        return retainAll;
    }

    @Override // java.util.List
    public E set(int i, E e) {
        E e2 = (E) this.f40153b.set(i, e);
        m51323b();
        return e2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f40153b.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f40153b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m51321d();
        return this.f40154c;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        boolean add = this.f40153b.add(e);
        m51323b();
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll = this.f40153b.addAll(collection);
        m51323b();
        return addAll;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f40153b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = this.f40153b.remove(obj);
        m51323b();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        m51321d();
        return (T[]) this.f40154c;
    }
}