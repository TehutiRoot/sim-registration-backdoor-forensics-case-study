package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class LazyField extends LazyFieldLite {

    /* renamed from: e */
    public final MessageLite f34831e;

    /* renamed from: androidx.datastore.preferences.protobuf.LazyField$b */
    /* loaded from: classes2.dex */
    public static class C4380b implements Map.Entry {

        /* renamed from: a */
        public Map.Entry f34832a;

        /* renamed from: a */
        public LazyField m55721a() {
            return (LazyField) this.f34832a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f34832a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField lazyField = (LazyField) this.f34832a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f34832a.getValue()).setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C4380b(Map.Entry entry) {
            this.f34832a = entry;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.LazyField$c */
    /* loaded from: classes2.dex */
    public static class C4381c implements Iterator {

        /* renamed from: a */
        public Iterator f34833a;

        public C4381c(Iterator it) {
            this.f34833a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f34833a.next();
            if (entry.getValue() instanceof LazyField) {
                return new C4380b(entry);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34833a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f34833a.remove();
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.f34831e = messageLite;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        if (!super.containsDefaultInstance() && this.value != this.f34831e) {
            return false;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.f34831e);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
