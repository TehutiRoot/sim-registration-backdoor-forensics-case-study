package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes6.dex */
public class LazyFieldLite {

    /* renamed from: a */
    public ByteString f69750a;

    /* renamed from: b */
    public ExtensionRegistryLite f69751b;

    /* renamed from: c */
    public volatile boolean f69752c;
    protected volatile MessageLite value;

    public void ensureInitialized(MessageLite messageLite) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.f69750a != null) {
                    this.value = messageLite.getParserForType().parseFrom(this.f69750a, this.f69751b);
                } else {
                    this.value = messageLite;
                }
            } catch (IOException unused) {
            }
        }
    }

    public int getSerializedSize() {
        if (this.f69752c) {
            return this.value.getSerializedSize();
        }
        return this.f69750a.size();
    }

    public MessageLite getValue(MessageLite messageLite) {
        ensureInitialized(messageLite);
        return this.value;
    }

    public MessageLite setValue(MessageLite messageLite) {
        MessageLite messageLite2 = this.value;
        this.value = messageLite;
        this.f69750a = null;
        this.f69752c = true;
        return messageLite2;
    }
}
