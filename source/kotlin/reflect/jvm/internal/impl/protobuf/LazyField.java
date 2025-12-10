package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public class LazyField extends LazyFieldLite {

    /* renamed from: d */
    public final MessageLite f69747d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.LazyField$b */
    /* loaded from: classes6.dex */
    public static class C11907b implements Map.Entry {

        /* renamed from: a */
        public Map.Entry f69748a;

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f69748a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField lazyField = (LazyField) this.f69748a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f69748a.getValue()).setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C11907b(Map.Entry entry) {
            this.f69748a = entry;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.LazyField$c */
    /* loaded from: classes6.dex */
    public static class C11908c implements Iterator {

        /* renamed from: a */
        public Iterator f69749a;

        public C11908c(Iterator it) {
            this.f69749a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f69749a.next();
            if (entry.getValue() instanceof LazyField) {
                return new C11907b(entry);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f69749a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f69749a.remove();
        }
    }

    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.f69747d);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
