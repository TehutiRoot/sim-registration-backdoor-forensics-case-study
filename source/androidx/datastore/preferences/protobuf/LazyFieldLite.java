package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class LazyFieldLite {

    /* renamed from: d */
    public static final ExtensionRegistryLite f34834d = ExtensionRegistryLite.getEmptyRegistry();

    /* renamed from: a */
    public ByteString f34835a;

    /* renamed from: b */
    public ExtensionRegistryLite f34836b;

    /* renamed from: c */
    public volatile ByteString f34837c;
    protected volatile MessageLite value;

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        m55719a(extensionRegistryLite, byteString);
        this.f34836b = extensionRegistryLite;
        this.f34835a = byteString;
    }

    /* renamed from: a */
    public static void m55719a(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        if (extensionRegistryLite != null) {
            if (byteString != null) {
                return;
            }
            throw new NullPointerException("found null ByteString");
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }

    /* renamed from: b */
    public static MessageLite m55718b(MessageLite messageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        try {
            return messageLite.toBuilder().mergeFrom(byteString, extensionRegistryLite).build();
        } catch (InvalidProtocolBufferException unused) {
            return messageLite;
        }
    }

    public static LazyFieldLite fromValue(MessageLite messageLite) {
        LazyFieldLite lazyFieldLite = new LazyFieldLite();
        lazyFieldLite.setValue(messageLite);
        return lazyFieldLite;
    }

    public void clear() {
        this.f34835a = null;
        this.value = null;
        this.f34837c = null;
    }

    public boolean containsDefaultInstance() {
        ByteString byteString;
        ByteString byteString2 = this.f34837c;
        ByteString byteString3 = ByteString.EMPTY;
        if (byteString2 != byteString3 && (this.value != null || ((byteString = this.f34835a) != null && byteString != byteString3))) {
            return false;
        }
        return true;
    }

    public void ensureInitialized(MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.f34835a != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.f34835a, this.f34836b);
                    this.f34837c = this.f34835a;
                } else {
                    this.value = messageLite;
                    this.f34837c = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.value = messageLite;
                this.f34837c = ByteString.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.value;
        MessageLite messageLite2 = lazyFieldLite.value;
        if (messageLite == null && messageLite2 == null) {
            return toByteString().equals(lazyFieldLite.toByteString());
        }
        if (messageLite != null && messageLite2 != null) {
            return messageLite.equals(messageLite2);
        }
        if (messageLite != null) {
            return messageLite.equals(lazyFieldLite.getValue(messageLite.getDefaultInstanceForType()));
        }
        return getValue(messageLite2.getDefaultInstanceForType()).equals(messageLite2);
    }

    public int getSerializedSize() {
        if (this.f34837c != null) {
            return this.f34837c.size();
        }
        ByteString byteString = this.f34835a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(LazyFieldLite lazyFieldLite) {
        ByteString byteString;
        if (lazyFieldLite.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(lazyFieldLite);
            return;
        }
        if (this.f34836b == null) {
            this.f34836b = lazyFieldLite.f34836b;
        }
        ByteString byteString2 = this.f34835a;
        if (byteString2 != null && (byteString = lazyFieldLite.f34835a) != null) {
            this.f34835a = byteString2.concat(byteString);
        } else if (this.value == null && lazyFieldLite.value != null) {
            setValue(m55718b(lazyFieldLite.value, this.f34835a, this.f34836b));
        } else if (this.value != null && lazyFieldLite.value == null) {
            setValue(m55718b(this.value, lazyFieldLite.f34835a, lazyFieldLite.f34836b));
        } else {
            setValue(this.value.toBuilder().mergeFrom(lazyFieldLite.value).build());
        }
    }

    public void mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(codedInputStream.readBytes(), extensionRegistryLite);
            return;
        }
        if (this.f34836b == null) {
            this.f34836b = extensionRegistryLite;
        }
        ByteString byteString = this.f34835a;
        if (byteString != null) {
            setByteString(byteString.concat(codedInputStream.readBytes()), this.f34836b);
            return;
        }
        try {
            setValue(this.value.toBuilder().mergeFrom(codedInputStream, extensionRegistryLite).build());
        } catch (InvalidProtocolBufferException unused) {
        }
    }

    public void set(LazyFieldLite lazyFieldLite) {
        this.f34835a = lazyFieldLite.f34835a;
        this.value = lazyFieldLite.value;
        this.f34837c = lazyFieldLite.f34837c;
        ExtensionRegistryLite extensionRegistryLite = lazyFieldLite.f34836b;
        if (extensionRegistryLite != null) {
            this.f34836b = extensionRegistryLite;
        }
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        m55719a(extensionRegistryLite, byteString);
        this.f34835a = byteString;
        this.f34836b = extensionRegistryLite;
        this.value = null;
        this.f34837c = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.f34835a = null;
        this.f34837c = null;
        this.value = messageLite;
        return messageLite2;
    }

    public ByteString toByteString() {
        if (this.f34837c != null) {
            return this.f34837c;
        }
        ByteString byteString = this.f34835a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f34837c != null) {
                    return this.f34837c;
                }
                if (this.value == null) {
                    this.f34837c = ByteString.EMPTY;
                } else {
                    this.f34837c = this.value.toByteString();
                }
                return this.f34837c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LazyFieldLite() {
    }
}
