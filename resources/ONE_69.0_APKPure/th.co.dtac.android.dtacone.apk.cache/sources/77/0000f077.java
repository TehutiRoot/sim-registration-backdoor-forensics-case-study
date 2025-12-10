package org.apache.commons.logging.impl;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class WeakHashtable extends Hashtable {
    private static final int MAX_CHANGES_BEFORE_PURGE = 100;
    private static final int PARTIAL_PURGE_COUNT = 10;
    private static final long serialVersionUID = -1546036869799732453L;
    private final ReferenceQueue queue = new ReferenceQueue();
    private int changeCount = 0;

    /* renamed from: org.apache.commons.logging.impl.WeakHashtable$a */
    /* loaded from: classes6.dex */
    public static final class C12551a implements Map.Entry {

        /* renamed from: a */
        public final Object f73700a;

        /* renamed from: b */
        public final Object f73701b;

        public /* synthetic */ C12551a(Object obj, Object obj2, C12554a c12554a) {
            this(obj, obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (getKey() == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!getKey().equals(entry.getKey())) {
                return false;
            }
            if (getValue() == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f73700a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f73701b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int i = 0;
            if (getKey() == null) {
                hashCode = 0;
            } else {
                hashCode = getKey().hashCode();
            }
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        public C12551a(Object obj, Object obj2) {
            this.f73700a = obj;
            this.f73701b = obj2;
        }
    }

    /* renamed from: org.apache.commons.logging.impl.WeakHashtable$b */
    /* loaded from: classes6.dex */
    public static final class C12552b {

        /* renamed from: a */
        public final WeakReference f73702a;

        /* renamed from: b */
        public final int f73703b;

        public /* synthetic */ C12552b(Object obj, ReferenceQueue referenceQueue, C12554a c12554a) {
            this(obj, referenceQueue);
        }

        /* renamed from: b */
        public final Object m25026b() {
            return this.f73702a.get();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12552b)) {
                return false;
            }
            C12552b c12552b = (C12552b) obj;
            Object m25026b = m25026b();
            Object m25026b2 = c12552b.m25026b();
            if (m25026b == null) {
                if (m25026b2 != null || hashCode() != c12552b.hashCode()) {
                    return false;
                }
                return true;
            }
            return m25026b.equals(m25026b2);
        }

        public int hashCode() {
            return this.f73703b;
        }

        public /* synthetic */ C12552b(Object obj, C12554a c12554a) {
            this(obj);
        }

        public C12552b(Object obj) {
            this.f73702a = new WeakReference(obj);
            this.f73703b = obj.hashCode();
        }

        public C12552b(Object obj, ReferenceQueue referenceQueue) {
            this.f73702a = new C12553c(obj, referenceQueue, this, null);
            this.f73703b = obj.hashCode();
        }
    }

    /* renamed from: org.apache.commons.logging.impl.WeakHashtable$c */
    /* loaded from: classes6.dex */
    public static final class C12553c extends WeakReference {

        /* renamed from: a */
        public final C12552b f73704a;

        public /* synthetic */ C12553c(Object obj, ReferenceQueue referenceQueue, C12552b c12552b, C12554a c12554a) {
            this(obj, referenceQueue, c12552b);
        }

        /* renamed from: b */
        public final C12552b m25024b() {
            return this.f73704a;
        }

        public C12553c(Object obj, ReferenceQueue referenceQueue, C12552b c12552b) {
            super(obj, referenceQueue);
            this.f73704a = c12552b;
        }
    }

    private void purge() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.queue) {
            while (true) {
                try {
                    C12553c c12553c = (C12553c) this.queue.poll();
                    if (c12553c == null) {
                        break;
                    }
                    arrayList.add(c12553c.m25024b());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            super.remove(arrayList.get(i));
        }
    }

    private void purgeOne() {
        synchronized (this.queue) {
            try {
                C12553c c12553c = (C12553c) this.queue.poll();
                if (c12553c != null) {
                    super.remove(c12553c.m25024b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(new C12552b(obj, (C12554a) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration elements() {
        purge();
        return super.elements();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set entrySet() {
        purge();
        Set<Map.Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : entrySet) {
            Object m25026b = ((C12552b) entry.getKey()).m25026b();
            Object value = entry.getValue();
            if (m25026b != null) {
                hashSet.add(new C12551a(m25026b, value, null));
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public Object get(Object obj) {
        return super.get(new C12552b(obj, (C12554a) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public boolean isEmpty() {
        purge();
        return super.isEmpty();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Set keySet() {
        purge();
        Set<C12552b> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (C12552b c12552b : keySet) {
            Object m25026b = c12552b.m25026b();
            if (m25026b != null) {
                hashSet.add(m25026b);
            }
        }
        return hashSet;
    }

    @Override // java.util.Hashtable, java.util.Dictionary
    public Enumeration keys() {
        purge();
        return new C12554a(this, super.keys());
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object put(Object obj, Object obj2) {
        try {
            if (obj != null) {
                if (obj2 != null) {
                    int i = this.changeCount;
                    int i2 = i + 1;
                    this.changeCount = i2;
                    if (i > 100) {
                        purge();
                        this.changeCount = 0;
                    } else if (i2 % 10 == 0) {
                        purgeOne();
                    }
                } else {
                    throw new NullPointerException("Null values are not allowed");
                }
            } else {
                throw new NullPointerException("Null keys are not allowed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.put(new C12552b(obj, this.queue, null), obj2);
    }

    @Override // java.util.Hashtable, java.util.Map
    public void putAll(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Hashtable
    public void rehash() {
        purge();
        super.rehash();
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public synchronized Object remove(Object obj) {
        try {
            int i = this.changeCount;
            int i2 = i + 1;
            this.changeCount = i2;
            if (i > 100) {
                purge();
                this.changeCount = 0;
            } else if (i2 % 10 == 0) {
                purgeOne();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return super.remove(new C12552b(obj, (C12554a) null));
    }

    @Override // java.util.Hashtable, java.util.Dictionary, java.util.Map
    public int size() {
        purge();
        return super.size();
    }

    @Override // java.util.Hashtable
    public String toString() {
        purge();
        return super.toString();
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection values() {
        purge();
        return super.values();
    }
}