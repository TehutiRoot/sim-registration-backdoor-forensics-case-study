package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public class LazyFieldLite {

    /* renamed from: d */
    public static final ExtensionRegistryLite f57375d = ExtensionRegistryLite.getEmptyRegistry();

    /* renamed from: a */
    public ByteString f57376a;

    /* renamed from: b */
    public ExtensionRegistryLite f57377b;

    /* renamed from: c */
    public volatile ByteString f57378c;
    protected volatile MessageLite value;

    public LazyFieldLite(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        m35775a(extensionRegistryLite, byteString);
        this.f57377b = extensionRegistryLite;
        this.f57376a = byteString;
    }

    /* renamed from: a */
    public static void m35775a(ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        if (extensionRegistryLite != null) {
            if (byteString != null) {
                return;
            }
            throw new NullPointerException("found null ByteString");
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }

    /* renamed from: b */
    public static MessageLite m35774b(MessageLite messageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
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
        this.f57376a = null;
        this.value = null;
        this.f57378c = null;
    }

    public boolean containsDefaultInstance() {
        ByteString byteString;
        ByteString byteString2 = this.f57378c;
        ByteString byteString3 = ByteString.EMPTY;
        if (byteString2 != byteString3 && (this.value != null || ((byteString = this.f57376a) != null && byteString != byteString3))) {
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
                if (this.f57376a != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.f57376a, this.f57377b);
                    this.f57378c = this.f57376a;
                } else {
                    this.value = messageLite;
                    this.f57378c = ByteString.EMPTY;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.value = messageLite;
                this.f57378c = ByteString.EMPTY;
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
        if (this.f57378c != null) {
            return this.f57378c.size();
        }
        ByteString byteString = this.f57376a;
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
        if (this.f57377b == null) {
            this.f57377b = lazyFieldLite.f57377b;
        }
        ByteString byteString2 = this.f57376a;
        if (byteString2 != null && (byteString = lazyFieldLite.f57376a) != null) {
            this.f57376a = byteString2.concat(byteString);
        } else if (this.value == null && lazyFieldLite.value != null) {
            setValue(m35774b(lazyFieldLite.value, this.f57376a, this.f57377b));
        } else if (this.value != null && lazyFieldLite.value == null) {
            setValue(m35774b(this.value, lazyFieldLite.f57376a, lazyFieldLite.f57377b));
        } else {
            setValue(this.value.toBuilder().mergeFrom(lazyFieldLite.value).build());
        }
    }

    public void mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(codedInputStream.readBytes(), extensionRegistryLite);
            return;
        }
        if (this.f57377b == null) {
            this.f57377b = extensionRegistryLite;
        }
        ByteString byteString = this.f57376a;
        if (byteString != null) {
            setByteString(byteString.concat(codedInputStream.readBytes()), this.f57377b);
            return;
        }
        try {
            setValue(this.value.toBuilder().mergeFrom(codedInputStream, extensionRegistryLite).build());
        } catch (InvalidProtocolBufferException unused) {
        }
    }

    public void set(LazyFieldLite lazyFieldLite) {
        this.f57376a = lazyFieldLite.f57376a;
        this.value = lazyFieldLite.value;
        this.f57378c = lazyFieldLite.f57378c;
        ExtensionRegistryLite extensionRegistryLite = lazyFieldLite.f57377b;
        if (extensionRegistryLite != null) {
            this.f57377b = extensionRegistryLite;
        }
    }

    public void setByteString(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        m35775a(extensionRegistryLite, byteString);
        this.f57376a = byteString;
        this.f57377b = extensionRegistryLite;
        this.value = null;
        this.f57378c = null;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.f57376a = null;
        this.f57378c = null;
        this.value = messageLite;
        return messageLite2;
    }

    public ByteString toByteString() {
        if (this.f57378c != null) {
            return this.f57378c;
        }
        ByteString byteString = this.f57376a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            try {
                if (this.f57378c != null) {
                    return this.f57378c;
                }
                if (this.value == null) {
                    this.f57378c = ByteString.EMPTY;
                } else {
                    this.f57378c = this.value.toByteString();
                }
                return this.f57378c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LazyFieldLite() {
    }
}
