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
    public AtomicBoolean f40154a = new AtomicBoolean(false);

    /* renamed from: b */
    public CopyOnWriteArrayList f40155b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public Object[] f40156c;

    /* renamed from: d */
    public final Object[] f40157d;

    public COWArrayList(E[] eArr) {
        this.f40157d = eArr;
    }

    /* renamed from: a */
    public final boolean m51329a() {
        return this.f40154a.get();
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.f40155b.add(i, e);
        m51328b();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        boolean addAll = this.f40155b.addAll(i, collection);
        m51328b();
        return addAll;
    }

    public void addIfAbsent(E e) {
        this.f40155b.addIfAbsent(e);
        m51328b();
    }

    public E[] asTypedArray() {
        m51326d();
        return (E[]) this.f40156c;
    }

    /* renamed from: b */
    public final void m51328b() {
        this.f40154a.set(false);
    }

    /* renamed from: c */
    public final void m51327c() {
        this.f40156c = this.f40155b.toArray(this.f40157d);
        this.f40154a.set(true);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f40155b.clear();
        m51328b();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f40155b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f40155b.containsAll(collection);
    }

    /* renamed from: d */
    public final void m51326d() {
        if (m51329a()) {
            return;
        }
        m51327c();
    }

    @Override // java.util.List
    public E get(int i) {
        m51326d();
        return (E) this.f40156c[i];
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f40155b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f40155b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f40155b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f40155b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f40155b.listIterator();
    }

    @Override // java.util.List
    public E remove(int i) {
        E e = (E) this.f40155b.remove(i);
        m51328b();
        return e;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f40155b.removeAll(collection);
        m51328b();
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f40155b.retainAll(collection);
        m51328b();
        return retainAll;
    }

    @Override // java.util.List
    public E set(int i, E e) {
        E e2 = (E) this.f40155b.set(i, e);
        m51328b();
        return e2;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f40155b.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f40155b.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        m51326d();
        return this.f40156c;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        boolean add = this.f40155b.add(e);
        m51328b();
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll = this.f40155b.addAll(collection);
        m51328b();
        return addAll;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f40155b.listIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = this.f40155b.remove(obj);
        m51328b();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        m51326d();
        return (T[]) this.f40156c;
    }
}
