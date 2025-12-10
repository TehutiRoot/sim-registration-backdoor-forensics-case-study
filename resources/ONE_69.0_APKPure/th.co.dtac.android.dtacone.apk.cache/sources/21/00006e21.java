package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a */
    public final C4368b f34931a;

    /* renamed from: b */
    public final Object f34932b;

    /* renamed from: c */
    public final Object f34933c;

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4367a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34934a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34934a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34934a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34934a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.MapEntryLite$b */
    /* loaded from: classes2.dex */
    public static class C4368b {

        /* renamed from: a */
        public final WireFormat.FieldType f34935a;

        /* renamed from: b */
        public final Object f34936b;

        /* renamed from: c */
        public final WireFormat.FieldType f34937c;

        /* renamed from: d */
        public final Object f34938d;

        public C4368b(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.f34935a = fieldType;
            this.f34936b = obj;
            this.f34937c = fieldType2;
            this.f34938d = obj2;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.f34931a = new C4368b(fieldType, obj, fieldType2, obj2);
        this.f34932b = obj;
        this.f34933c = obj2;
    }

    /* renamed from: a */
    public static int m55626a(C4368b c4368b, Object obj, Object obj2) {
        return FieldSet.m55749e(c4368b.f34935a, 1, obj) + FieldSet.m55749e(c4368b.f34937c, 2, obj2);
    }

    /* renamed from: c */
    public static Map.Entry m55624c(CodedInputStream codedInputStream, C4368b c4368b, ExtensionRegistryLite extensionRegistryLite) {
        Object obj = c4368b.f34936b;
        Object obj2 = c4368b.f34938d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.m55288a(1, c4368b.f34935a.getWireType())) {
                obj = m55623d(codedInputStream, extensionRegistryLite, c4368b.f34935a, obj);
            } else if (readTag == WireFormat.m55288a(2, c4368b.f34937c.getWireType())) {
                obj2 = m55623d(codedInputStream, extensionRegistryLite, c4368b.f34937c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: d */
    public static Object m55623d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, Object obj) {
        int i = C4367a.f34934a[fieldType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return FieldSet.m55760B(codedInputStream, fieldType, true);
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
    public static void m55622e(CodedOutputStream codedOutputStream, C4368b c4368b, Object obj, Object obj2) {
        FieldSet.m55756F(codedOutputStream, c4368b.f34935a, 1, obj);
        FieldSet.m55756F(codedOutputStream, c4368b.f34937c, 2, obj2);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: b */
    public C4368b m55625b() {
        return this.f34931a;
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m56000d(m55626a(this.f34931a, k, v));
    }

    public K getKey() {
        return (K) this.f34932b;
    }

    public V getValue() {
        return (V) this.f34933c;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return m55624c(byteString.newCodedInput(), this.f34931a, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        C4368b c4368b = this.f34931a;
        Object obj = c4368b.f34936b;
        Object obj2 = c4368b.f34938d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.m55288a(1, this.f34931a.f34935a.getWireType())) {
                obj = m55623d(codedInputStream, extensionRegistryLite, this.f34931a.f34935a, obj);
            } else if (readTag == WireFormat.m55288a(2, this.f34931a.f34937c.getWireType())) {
                obj2 = m55623d(codedInputStream, extensionRegistryLite, this.f34931a.f34937c, obj2);
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
        codedOutputStream.writeUInt32NoTag(m55626a(this.f34931a, k, v));
        m55622e(codedOutputStream, this.f34931a, k, v);
    }
}