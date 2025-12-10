package org.apache.http.impl.client;

import java.net.URI;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public class RedirectLocations extends AbstractList<Object> {

    /* renamed from: a */
    public final Set f74173a = new HashSet();

    /* renamed from: b */
    public final List f74174b = new ArrayList();

    public void add(URI uri) {
        this.f74173a.add(uri);
        this.f74174b.add(uri);
    }

    public boolean contains(URI uri) {
        return this.f74173a.contains(uri);
    }

    public List<URI> getAll() {
        return new ArrayList(this.f74174b);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        URI uri = (URI) obj;
        URI uri2 = (URI) this.f74174b.set(i, uri);
        this.f74173a.remove(uri2);
        this.f74173a.add(uri);
        if (this.f74174b.size() != this.f74173a.size()) {
            this.f74173a.addAll(this.f74174b);
        }
        return uri2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74174b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f74173a.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public URI get(int i) {
        return (URI) this.f74174b.get(i);
    }

    public boolean remove(URI uri) {
        boolean remove = this.f74173a.remove(uri);
        if (remove) {
            Iterator it = this.f74174b.iterator();
            while (it.hasNext()) {
                if (((URI) it.next()).equals(uri)) {
                    it.remove();
                }
            }
        }
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        URI uri = (URI) obj;
        this.f74174b.add(i, uri);
        this.f74173a.add(uri);
    }

    @Override // java.util.AbstractList, java.util.List
    public URI remove(int i) {
        URI uri = (URI) this.f74174b.remove(i);
        this.f74173a.remove(uri);
        if (this.f74174b.size() != this.f74173a.size()) {
            this.f74173a.addAll(this.f74174b);
        }
        return uri;
    }
}
