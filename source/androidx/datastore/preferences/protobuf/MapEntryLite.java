package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a */
    public final C4386b f34843a;

    /* renamed from: b */
    public final Object f34844b;

    /* renamed from: c */
    public final Object f34845c;

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4385a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34846a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34846a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34846a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34846a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$b */
    /* loaded from: classes2.dex */
    public static class C4386b {

        /* renamed from: a */
        public final WireFormat.FieldType f34847a;

        /* renamed from: b */
        public final Object f34848b;

        /* renamed from: c */
        public final WireFormat.FieldType f34849c;

        /* renamed from: d */
        public final Object f34850d;

        public C4386b(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.f34847a = fieldType;
            this.f34848b = obj;
            this.f34849c = fieldType2;
            this.f34850d = obj2;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.f34843a = new C4386b(fieldType, obj, fieldType2, obj2);
        this.f34844b = obj;
        this.f34845c = obj2;
    }

    /* renamed from: a */
    public static int m55676a(C4386b c4386b, Object obj, Object obj2) {
        return FieldSet.m55799e(c4386b.f34847a, 1, obj) + FieldSet.m55799e(c4386b.f34849c, 2, obj2);
    }

    /* renamed from: c */
    public static Map.Entry m55674c(CodedInputStream codedInputStream, C4386b c4386b, ExtensionRegistryLite extensionRegistryLite) {
        Object obj = c4386b.f34848b;
        Object obj2 = c4386b.f34850d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.m55338a(1, c4386b.f34847a.getWireType())) {
                obj = m55673d(codedInputStream, extensionRegistryLite, c4386b.f34847a, obj);
            } else if (readTag == WireFormat.m55338a(2, c4386b.f34849c.getWireType())) {
                obj2 = m55673d(codedInputStream, extensionRegistryLite, c4386b.f34849c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: d */
    public static Object m55673d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, Object obj) {
        int i = C4385a.f34846a[fieldType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return FieldSet.m55810B(codedInputStream, fieldType, true);
                }
                throw new RuntimeException("Groups are not allowed in maps.");
            }
            return Integer.valueOf(codedInputStream.readEnum());
        }
        MessageLite.Builder builder = ((MessageLite) obj).toBuilder();
        codedInputStream.readMessage(builder, extensionRegistryLite);
        return builder.buildPartial();
    }

    /* renamed from: e */
    public static void m55672e(CodedOutputStream codedOutputStream, C4386b c4386b, Object obj, Object obj2) {
        FieldSet.m55806F(codedOutputStream, c4386b.f34847a, 1, obj);
        FieldSet.m55806F(codedOutputStream, c4386b.f34849c, 2, obj2);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: b */
    public C4386b m55675b() {
        return this.f34843a;
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56050d(m55676a(this.f34843a, k, v));
    }

    public K getKey() {
        return (K) this.f34844b;
    }

    public V getValue() {
        return (V) this.f34845c;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return m55674c(byteString.newCodedInput(), this.f34843a, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        C4386b c4386b = this.f34843a;
        Object obj = c4386b.f34848b;
        Object obj2 = c4386b.f34850d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.m55338a(1, this.f34843a.f34847a.getWireType())) {
                obj = m55673d(codedInputStream, extensionRegistryLite, this.f34843a.f34847a, obj);
            } else if (readTag == WireFormat.m55338a(2, this.f34843a.f34849c.getWireType())) {
                obj2 = m55673d(codedInputStream, extensionRegistryLite, this.f34843a.f34849c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(pushLimit);
        mapFieldLite.put(obj, obj2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(m55676a(this.f34843a, k, v));
        m55672e(codedOutputStream, this.f34843a, k, v);
    }
}
