package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import kotlin.UShort;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public class FlexBuffers {
    public static final int FBT_BLOB = 25;
    public static final int FBT_BOOL = 26;
    public static final int FBT_FLOAT = 3;
    public static final int FBT_INDIRECT_FLOAT = 8;
    public static final int FBT_INDIRECT_INT = 6;
    public static final int FBT_INDIRECT_UINT = 7;
    public static final int FBT_INT = 1;
    public static final int FBT_KEY = 4;
    public static final int FBT_MAP = 9;
    public static final int FBT_NULL = 0;
    public static final int FBT_STRING = 5;
    public static final int FBT_UINT = 2;
    public static final int FBT_VECTOR = 10;
    public static final int FBT_VECTOR_BOOL = 36;
    public static final int FBT_VECTOR_FLOAT = 13;
    public static final int FBT_VECTOR_FLOAT2 = 18;
    public static final int FBT_VECTOR_FLOAT3 = 21;
    public static final int FBT_VECTOR_FLOAT4 = 24;
    public static final int FBT_VECTOR_INT = 11;
    public static final int FBT_VECTOR_INT2 = 16;
    public static final int FBT_VECTOR_INT3 = 19;
    public static final int FBT_VECTOR_INT4 = 22;
    public static final int FBT_VECTOR_KEY = 14;
    public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
    public static final int FBT_VECTOR_UINT = 12;
    public static final int FBT_VECTOR_UINT2 = 17;
    public static final int FBT_VECTOR_UINT3 = 20;
    public static final int FBT_VECTOR_UINT4 = 23;

    /* renamed from: a */
    public static final InterfaceC18699Vs1 f35321a = new ArrayReadWriteBuf(new byte[]{0}, 1);

    /* loaded from: classes2.dex */
    public static class Blob extends AbstractC4520b {

        /* renamed from: d */
        public static final Blob f35322d = new Blob(FlexBuffers.f35321a, 1, 1);

        public Blob(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
            super(interfaceC18699Vs1, i, i2);
        }

        public static Blob empty() {
            return f35322d;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f35335a.data());
            wrap.position(this.f35336b);
            wrap.limit(this.f35336b + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f35335a.get(this.f35336b + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f35335a.get(this.f35336b + i);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4520b
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public String toString() {
            return this.f35335a.getString(this.f35336b, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f35335a.getString(this.f35336b, size()));
            sb.append('\"');
            return sb;
        }
    }

    /* loaded from: classes2.dex */
    public static class FlexBufferException extends RuntimeException {
        public FlexBufferException(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public static class Key extends AbstractC4519a {

        /* renamed from: d */
        public static final Key f35323d = new Key(FlexBuffers.f35321a, 0, 0);

        public Key(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
            super(interfaceC18699Vs1, i, i2);
        }

        public static Key empty() {
            return f35323d;
        }

        /* renamed from: b */
        public int m54642b(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f35336b;
            int i2 = 0;
            do {
                b = this.f35335a.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (key.f35336b != this.f35336b || key.f35337c != this.f35337c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f35336b ^ this.f35337c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public String toString() {
            int i = this.f35336b;
            while (this.f35335a.get(i) != 0) {
                i++;
            }
            int i2 = this.f35336b;
            return this.f35335a.getString(i2, i - i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class KeyVector {

        /* renamed from: a */
        public final TypedVector f35324a;

        public KeyVector(TypedVector typedVector) {
            this.f35324a = typedVector;
        }

        public Key get(int i) {
            if (i >= size()) {
                return Key.f35323d;
            }
            TypedVector typedVector = this.f35324a;
            TypedVector typedVector2 = this.f35324a;
            InterfaceC18699Vs1 interfaceC18699Vs1 = typedVector2.f35335a;
            return new Key(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, typedVector.f35336b + (i * typedVector.f35337c), typedVector2.f35337c), 1);
        }

        public int size() {
            return this.f35324a.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i = 0; i < this.f35324a.size(); i++) {
                this.f35324a.get(i).m54639b(sb);
                if (i != this.f35324a.size() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class Map extends Vector {

        /* renamed from: e */
        public static final Map f35325e = new Map(FlexBuffers.f35321a, 1, 1);

        public Map(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
            super(interfaceC18699Vs1, i, i2);
        }

        public static Map empty() {
            return f35325e;
        }

        /* renamed from: a */
        public final int m54641a(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int m54642b = keyVector.get(i2).m54642b(bArr);
                if (m54642b < 0) {
                    i = i2 + 1;
                } else if (m54642b > 0) {
                    size = i2 - 1;
                } else {
                    return i2;
                }
            }
            return -(i + 1);
        }

        public Reference get(String str) {
            return get(str.getBytes(StandardCharsets.UTF_8));
        }

        public KeyVector keys() {
            int i = this.f35336b - (this.f35337c * 3);
            InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35335a;
            int m54653g = FlexBuffers.m54653g(interfaceC18699Vs1, i, this.f35337c);
            InterfaceC18699Vs1 interfaceC18699Vs12 = this.f35335a;
            int i2 = this.f35337c;
            return new KeyVector(new TypedVector(interfaceC18699Vs1, m54653g, FlexBuffers.m54648l(interfaceC18699Vs12, i + i2, i2), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public StringBuilder toString(StringBuilder sb) {
            sb.append("{ ");
            KeyVector keys = keys();
            int size = size();
            Vector values = values();
            for (int i = 0; i < size; i++) {
                sb.append('\"');
                sb.append(keys.get(i).toString());
                sb.append("\" : ");
                sb.append(values.get(i).toString());
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public Vector values() {
            return new Vector(this.f35335a, this.f35336b, this.f35337c);
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int m54641a = m54641a(keys, bArr);
            if (m54641a < 0 || m54641a >= size) {
                return Reference.f35326f;
            }
            return get(m54641a);
        }
    }

    /* loaded from: classes2.dex */
    public static class Reference {

        /* renamed from: f */
        public static final Reference f35326f = new Reference(FlexBuffers.f35321a, 0, 1, 0);

        /* renamed from: a */
        public InterfaceC18699Vs1 f35327a;

        /* renamed from: b */
        public int f35328b;

        /* renamed from: c */
        public int f35329c;

        /* renamed from: d */
        public int f35330d;

        /* renamed from: e */
        public int f35331e;

        public Reference(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2, int i3) {
            this(interfaceC18699Vs1, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
            return new Blob(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                if (this.f35327a.get(this.f35328b) == 0) {
                    return false;
                }
                return true;
            } else if (asUInt() == 0) {
                return false;
            } else {
                return true;
            }
        }

        public double asFloat() {
            int i = this.f35331e;
            if (i == 3) {
                return FlexBuffers.m54649k(this.f35327a, this.f35328b, this.f35329c);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 10) {
                                        if (i != 26) {
                                            return 0.0d;
                                        }
                                    } else {
                                        return asVector().size();
                                    }
                                } else {
                                    InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                                    return FlexBuffers.m54649k(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
                                }
                            } else {
                                InterfaceC18699Vs1 interfaceC18699Vs12 = this.f35327a;
                                return FlexBuffers.m54646n(interfaceC18699Vs12, FlexBuffers.m54653g(interfaceC18699Vs12, this.f35328b, this.f35329c), this.f35330d);
                            }
                        } else {
                            InterfaceC18699Vs1 interfaceC18699Vs13 = this.f35327a;
                            return FlexBuffers.m54648l(interfaceC18699Vs13, FlexBuffers.m54653g(interfaceC18699Vs13, this.f35328b, this.f35329c), this.f35330d);
                        }
                    } else {
                        return Double.parseDouble(asString());
                    }
                }
                return FlexBuffers.m54646n(this.f35327a, this.f35328b, this.f35329c);
            }
            return FlexBuffers.m54648l(this.f35327a, this.f35328b, this.f35329c);
        }

        public int asInt() {
            long m54646n;
            int i = this.f35331e;
            if (i == 1) {
                return FlexBuffers.m54648l(this.f35327a, this.f35328b, this.f35329c);
            }
            if (i == 2) {
                m54646n = FlexBuffers.m54646n(this.f35327a, this.f35328b, this.f35329c);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 10) {
                                    if (i == 26) {
                                        return FlexBuffers.m54648l(this.f35327a, this.f35328b, this.f35329c);
                                    }
                                    return 0;
                                }
                                return asVector().size();
                            }
                            InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                            return (int) FlexBuffers.m54649k(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
                        }
                        InterfaceC18699Vs1 interfaceC18699Vs12 = this.f35327a;
                        m54646n = FlexBuffers.m54646n(interfaceC18699Vs12, FlexBuffers.m54653g(interfaceC18699Vs12, this.f35328b, this.f35329c), this.f35329c);
                    } else {
                        InterfaceC18699Vs1 interfaceC18699Vs13 = this.f35327a;
                        return FlexBuffers.m54648l(interfaceC18699Vs13, FlexBuffers.m54653g(interfaceC18699Vs13, this.f35328b, this.f35329c), this.f35330d);
                    }
                } else {
                    return Integer.parseInt(asString());
                }
            } else {
                return (int) FlexBuffers.m54649k(this.f35327a, this.f35328b, this.f35329c);
            }
            return (int) m54646n;
        }

        public Key asKey() {
            if (isKey()) {
                InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                return new Key(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
            }
            return Key.empty();
        }

        public long asLong() {
            int i = this.f35331e;
            if (i == 1) {
                return FlexBuffers.m54647m(this.f35327a, this.f35328b, this.f35329c);
            }
            if (i == 2) {
                return FlexBuffers.m54646n(this.f35327a, this.f35328b, this.f35329c);
            }
            if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 10) {
                                    if (i != 26) {
                                        return 0L;
                                    }
                                    return FlexBuffers.m54648l(this.f35327a, this.f35328b, this.f35329c);
                                }
                                return asVector().size();
                            }
                            InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                            return (long) FlexBuffers.m54649k(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
                        }
                        InterfaceC18699Vs1 interfaceC18699Vs12 = this.f35327a;
                        return FlexBuffers.m54646n(interfaceC18699Vs12, FlexBuffers.m54653g(interfaceC18699Vs12, this.f35328b, this.f35329c), this.f35329c);
                    }
                    InterfaceC18699Vs1 interfaceC18699Vs13 = this.f35327a;
                    return FlexBuffers.m54647m(interfaceC18699Vs13, FlexBuffers.m54653g(interfaceC18699Vs13, this.f35328b, this.f35329c), this.f35330d);
                }
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            return (long) FlexBuffers.m54649k(this.f35327a, this.f35328b, this.f35329c);
        }

        public Map asMap() {
            if (isMap()) {
                InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                return new Map(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
            }
            return Map.empty();
        }

        public String asString() {
            if (isString()) {
                int m54653g = FlexBuffers.m54653g(this.f35327a, this.f35328b, this.f35329c);
                InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                int i = this.f35330d;
                return this.f35327a.getString(m54653g, (int) FlexBuffers.m54646n(interfaceC18699Vs1, m54653g - i, i));
            } else if (isKey()) {
                int m54653g2 = FlexBuffers.m54653g(this.f35327a, this.f35328b, this.f35330d);
                int i2 = m54653g2;
                while (this.f35327a.get(i2) != 0) {
                    i2++;
                }
                return this.f35327a.getString(m54653g2, i2 - m54653g2);
            } else {
                return "";
            }
        }

        public long asUInt() {
            int i = this.f35331e;
            if (i == 2) {
                return FlexBuffers.m54646n(this.f35327a, this.f35328b, this.f35329c);
            }
            if (i == 1) {
                return FlexBuffers.m54647m(this.f35327a, this.f35328b, this.f35329c);
            }
            if (i != 3) {
                if (i != 10) {
                    if (i != 26) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 8) {
                                        return 0L;
                                    }
                                    InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                                    return (long) FlexBuffers.m54649k(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35329c);
                                }
                                InterfaceC18699Vs1 interfaceC18699Vs12 = this.f35327a;
                                return FlexBuffers.m54646n(interfaceC18699Vs12, FlexBuffers.m54653g(interfaceC18699Vs12, this.f35328b, this.f35329c), this.f35330d);
                            }
                            InterfaceC18699Vs1 interfaceC18699Vs13 = this.f35327a;
                            return FlexBuffers.m54647m(interfaceC18699Vs13, FlexBuffers.m54653g(interfaceC18699Vs13, this.f35328b, this.f35329c), this.f35330d);
                        }
                        return Long.parseLong(asString());
                    }
                    return FlexBuffers.m54648l(this.f35327a, this.f35328b, this.f35329c);
                }
                return asVector().size();
            }
            return (long) FlexBuffers.m54649k(this.f35327a, this.f35328b, this.f35329c);
        }

        public Vector asVector() {
            if (isVector()) {
                InterfaceC18699Vs1 interfaceC18699Vs1 = this.f35327a;
                return new Vector(interfaceC18699Vs1, FlexBuffers.m54653g(interfaceC18699Vs1, this.f35328b, this.f35329c), this.f35330d);
            }
            int i = this.f35331e;
            if (i == 15) {
                InterfaceC18699Vs1 interfaceC18699Vs12 = this.f35327a;
                return new TypedVector(interfaceC18699Vs12, FlexBuffers.m54653g(interfaceC18699Vs12, this.f35328b, this.f35329c), this.f35330d, 4);
            } else if (FlexBuffers.m54651i(i)) {
                InterfaceC18699Vs1 interfaceC18699Vs13 = this.f35327a;
                return new TypedVector(interfaceC18699Vs13, FlexBuffers.m54653g(interfaceC18699Vs13, this.f35328b, this.f35329c), this.f35330d, FlexBuffers.m54644p(this.f35331e));
            } else {
                return Vector.empty();
            }
        }

        /* renamed from: b */
        public StringBuilder m54639b(StringBuilder sb) {
            int i = this.f35331e;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append(AbstractJsonLexerKt.NULL);
                        return sb;
                    case 1:
                    case 6:
                        sb.append(asLong());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(asUInt());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(asFloat());
                        return sb;
                    case 4:
                        Key asKey = asKey();
                        sb.append('\"');
                        StringBuilder key = asKey.toString(sb);
                        key.append('\"');
                        return key;
                    case 5:
                        sb.append('\"');
                        sb.append(asString());
                        sb.append('\"');
                        return sb;
                    case 9:
                        return asMap().toString(sb);
                    case 10:
                        return asVector().toString(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        throw new FlexBufferException("not_implemented:" + this.f35331e);
                    case 25:
                        return asBlob().toString(sb);
                    case 26:
                        sb.append(asBoolean());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(asVector());
            return sb;
        }

        public int getType() {
            return this.f35331e;
        }

        public boolean isBlob() {
            if (this.f35331e == 25) {
                return true;
            }
            return false;
        }

        public boolean isBoolean() {
            if (this.f35331e == 26) {
                return true;
            }
            return false;
        }

        public boolean isFloat() {
            int i = this.f35331e;
            if (i != 3 && i != 8) {
                return false;
            }
            return true;
        }

        public boolean isInt() {
            int i = this.f35331e;
            if (i == 1 || i == 6) {
                return true;
            }
            return false;
        }

        public boolean isIntOrUInt() {
            if (!isInt() && !isUInt()) {
                return false;
            }
            return true;
        }

        public boolean isKey() {
            if (this.f35331e == 4) {
                return true;
            }
            return false;
        }

        public boolean isMap() {
            if (this.f35331e == 9) {
                return true;
            }
            return false;
        }

        public boolean isNull() {
            if (this.f35331e == 0) {
                return true;
            }
            return false;
        }

        public boolean isNumeric() {
            if (!isIntOrUInt() && !isFloat()) {
                return false;
            }
            return true;
        }

        public boolean isString() {
            if (this.f35331e == 5) {
                return true;
            }
            return false;
        }

        public boolean isTypedVector() {
            return FlexBuffers.m54651i(this.f35331e);
        }

        public boolean isUInt() {
            int i = this.f35331e;
            if (i != 2 && i != 7) {
                return false;
            }
            return true;
        }

        public boolean isVector() {
            int i = this.f35331e;
            if (i != 10 && i != 9) {
                return false;
            }
            return true;
        }

        public String toString() {
            return m54639b(new StringBuilder(128)).toString();
        }

        public Reference(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2, int i3, int i4) {
            this.f35327a = interfaceC18699Vs1;
            this.f35328b = i;
            this.f35329c = i2;
            this.f35330d = i3;
            this.f35331e = i4;
        }
    }

    /* loaded from: classes2.dex */
    public static class TypedVector extends Vector {

        /* renamed from: f */
        public static final TypedVector f35332f = new TypedVector(FlexBuffers.f35321a, 1, 1, 1);

        /* renamed from: e */
        public final int f35333e;

        public TypedVector(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2, int i3) {
            super(interfaceC18699Vs1, i, i2);
            this.f35333e = i3;
        }

        public static TypedVector empty() {
            return f35332f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i) {
            if (i >= size()) {
                return Reference.f35326f;
            }
            return new Reference(this.f35335a, this.f35336b + (i * this.f35337c), this.f35337c, 1, this.f35333e);
        }

        public int getElemType() {
            return this.f35333e;
        }

        public boolean isEmptyVector() {
            if (this == f35332f) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Vector extends AbstractC4520b {

        /* renamed from: d */
        public static final Vector f35334d = new Vector(FlexBuffers.f35321a, 1, 1);

        public Vector(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
            super(interfaceC18699Vs1, i, i2);
        }

        public static Vector empty() {
            return f35334d;
        }

        public Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return Reference.f35326f;
            }
            return new Reference(this.f35335a, this.f35336b + (i * this.f35337c), this.f35337c, C4521c.m54638a(this.f35335a.get((int) (this.f35336b + (size * this.f35337c) + j))));
        }

        public boolean isEmpty() {
            if (this == f35334d) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4520b
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4519a
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).m54639b(sb);
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4519a {

        /* renamed from: a */
        public InterfaceC18699Vs1 f35335a;

        /* renamed from: b */
        public int f35336b;

        /* renamed from: c */
        public int f35337c;

        public AbstractC4519a(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
            this.f35335a = interfaceC18699Vs1;
            this.f35336b = i;
            this.f35337c = i2;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4520b extends AbstractC4519a {
        protected final int size;

        public AbstractC4520b(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
            super(interfaceC18699Vs1, i, i2);
            this.size = FlexBuffers.m54648l(this.f35335a, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$c */
    /* loaded from: classes2.dex */
    public static class C4521c {
        /* renamed from: a */
        public static int m54638a(byte b) {
            return b & 255;
        }

        /* renamed from: b */
        public static long m54637b(int i) {
            return i & BodyPartID.bodyIdMax;
        }

        /* renamed from: c */
        public static int m54636c(short s) {
            return s & UShort.MAX_VALUE;
        }
    }

    /* renamed from: g */
    public static int m54653g(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
        return (int) (i - m54646n(interfaceC18699Vs1, i, i2));
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* renamed from: h */
    public static boolean m54652h(int i) {
        return i <= 3 || i == 26;
    }

    /* renamed from: i */
    public static boolean m54651i(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* renamed from: j */
    public static boolean m54650j(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* renamed from: k */
    public static double m54649k(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
        if (i2 != 4) {
            if (i2 != 8) {
                return -1.0d;
            }
            return interfaceC18699Vs1.getDouble(i);
        }
        return interfaceC18699Vs1.getFloat(i);
    }

    /* renamed from: l */
    public static int m54648l(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
        return (int) m54647m(interfaceC18699Vs1, i, i2);
    }

    /* renamed from: m */
    public static long m54647m(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return -1L;
                    }
                    return interfaceC18699Vs1.getLong(i);
                }
                i3 = interfaceC18699Vs1.getInt(i);
            } else {
                i3 = interfaceC18699Vs1.getShort(i);
            }
        } else {
            i3 = interfaceC18699Vs1.get(i);
        }
        return i3;
    }

    /* renamed from: n */
    public static long m54646n(InterfaceC18699Vs1 interfaceC18699Vs1, int i, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return -1L;
                    }
                    return interfaceC18699Vs1.getLong(i);
                }
                return C4521c.m54637b(interfaceC18699Vs1.getInt(i));
            }
            return C4521c.m54636c(interfaceC18699Vs1.getShort(i));
        }
        return C4521c.m54638a(interfaceC18699Vs1.get(i));
    }

    /* renamed from: o */
    public static int m54645o(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return 0;
                    }
                    return i + 21;
                }
                return i + 18;
            }
            return i + 15;
        }
        return i + 10;
    }

    /* renamed from: p */
    public static int m54644p(int i) {
        return i - 10;
    }

    public static Reference getRoot(InterfaceC18699Vs1 interfaceC18699Vs1) {
        int limit = interfaceC18699Vs1.limit();
        byte b = interfaceC18699Vs1.get(limit - 1);
        int i = limit - 2;
        return new Reference(interfaceC18699Vs1, i - b, b, C4521c.m54638a(interfaceC18699Vs1.get(i)));
    }
}