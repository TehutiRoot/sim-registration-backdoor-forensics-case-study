package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class LazyField extends LazyFieldLite {

    /* renamed from: e */
    public final MessageLite f57372e;

    /* renamed from: com.google.protobuf.LazyField$b */
    /* loaded from: classes4.dex */
    public static class C8891b implements Map.Entry {

        /* renamed from: a */
        public Map.Entry f57373a;

        /* renamed from: a */
        public LazyField m35777a() {
            return (LazyField) this.f57373a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f57373a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField lazyField = (LazyField) this.f57373a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f57373a.getValue()).setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public C8891b(Map.Entry entry) {
            this.f57373a = entry;
        }
    }

    /* renamed from: com.google.protobuf.LazyField$c */
    /* loaded from: classes4.dex */
    public static class C8892c implements Iterator {

        /* renamed from: a */
        public Iterator f57374a;

        public C8892c(Iterator it) {
            this.f57374a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f57374a.next();
            if (entry.getValue() instanceof LazyField) {
                return new C8891b(entry);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f57374a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f57374a.remove();
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.f57372e = messageLite;
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        if (!super.containsDefaultInstance() && this.value != this.f57372e) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.f57372e);
    }

    @Override // com.google.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
