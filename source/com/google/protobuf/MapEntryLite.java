package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MapEntryLite<K, V> {

    /* renamed from: a */
    public final C8897b f57384a;

    /* renamed from: b */
    public final Object f57385b;

    /* renamed from: c */
    public final Object f57386c;

    /* renamed from: com.google.protobuf.MapEntryLite$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8896a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57387a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57387a = iArr;
            try {
                iArr[WireFormat.FieldType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57387a[WireFormat.FieldType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57387a[WireFormat.FieldType.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.google.protobuf.MapEntryLite$b */
    /* loaded from: classes4.dex */
    public static class C8897b {

        /* renamed from: a */
        public final WireFormat.FieldType f57388a;

        /* renamed from: b */
        public final Object f57389b;

        /* renamed from: c */
        public final WireFormat.FieldType f57390c;

        /* renamed from: d */
        public final Object f57391d;

        public C8897b(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
            this.f57388a = fieldType;
            this.f57389b = obj;
            this.f57390c = fieldType2;
            this.f57391d = obj2;
        }
    }

    public MapEntryLite(WireFormat.FieldType fieldType, Object obj, WireFormat.FieldType fieldType2, Object obj2) {
        this.f57384a = new C8897b(fieldType, obj, fieldType2, obj2);
        this.f57385b = obj;
        this.f57386c = obj2;
    }

    /* renamed from: a */
    public static int m35738a(C8897b c8897b, Object obj, Object obj2) {
        return FieldSet.m35868e(c8897b.f57388a, 1, obj) + FieldSet.m35868e(c8897b.f57390c, 2, obj2);
    }

    /* renamed from: c */
    public static Map.Entry m35736c(CodedInputStream codedInputStream, C8897b c8897b, ExtensionRegistryLite extensionRegistryLite) {
        Object obj = c8897b.f57389b;
        Object obj2 = c8897b.f57391d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.m35424a(1, c8897b.f57388a.getWireType())) {
                obj = m35735d(codedInputStream, extensionRegistryLite, c8897b.f57388a, obj);
            } else if (readTag == WireFormat.m35424a(2, c8897b.f57390c.getWireType())) {
                obj2 = m35735d(codedInputStream, extensionRegistryLite, c8897b.f57390c, obj2);
            } else if (!codedInputStream.skipField(readTag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    /* renamed from: d */
    public static Object m35735d(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, Object obj) {
        int i = C8896a.f57387a[fieldType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return FieldSet.m35879C(codedInputStream, fieldType, true);
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
    public static void m35734e(CodedOutputStream codedOutputStream, C8897b c8897b, Object obj, Object obj2) {
        FieldSet.m35875G(codedOutputStream, c8897b.f57388a, 1, obj);
        FieldSet.m35875G(codedOutputStream, c8897b.f57390c, 2, obj2);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    /* renamed from: b */
    public C8897b m35737b() {
        return this.f57384a;
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeTagSize(i) + CodedOutputStream.m37007d(m35738a(this.f57384a, k, v));
    }

    public K getKey() {
        return (K) this.f57385b;
    }

    public V getValue() {
        return (V) this.f57386c;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return m35736c(byteString.newCodedInput(), this.f57384a, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int pushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        C8897b c8897b = this.f57384a;
        Object obj = c8897b.f57389b;
        Object obj2 = c8897b.f57391d;
        while (true) {
            int readTag = codedInputStream.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == WireFormat.m35424a(1, this.f57384a.f57388a.getWireType())) {
                obj = m35735d(codedInputStream, extensionRegistryLite, this.f57384a.f57388a, obj);
            } else if (readTag == WireFormat.m35424a(2, this.f57384a.f57390c.getWireType())) {
                obj2 = m35735d(codedInputStream, extensionRegistryLite, this.f57384a.f57390c, obj2);
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
        codedOutputStream.writeUInt32NoTag(m35738a(this.f57384a, k, v));
        m35734e(codedOutputStream, this.f57384a, k, v);
    }
}
