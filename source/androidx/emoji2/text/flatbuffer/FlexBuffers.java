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
    public static final InterfaceC18844Yr1 f35233a = new ArrayReadWriteBuf(new byte[]{0}, 1);

    /* loaded from: classes2.dex */
    public static class Blob extends AbstractC4538b {

        /* renamed from: d */
        public static final Blob f35234d = new Blob(FlexBuffers.f35233a, 1, 1);

        public Blob(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
            super(interfaceC18844Yr1, i, i2);
        }

        public static Blob empty() {
            return f35234d;
        }

        public ByteBuffer data() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f35247a.data());
            wrap.position(this.f35248b);
            wrap.limit(this.f35248b + size());
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte get(int i) {
            return this.f35247a.get(this.f35248b + i);
        }

        public byte[] getBytes() {
            int size = size();
            byte[] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = this.f35247a.get(this.f35248b + i);
            }
            return bArr;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4538b
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
        public String toString() {
            return this.f35247a.getString(this.f35248b, size());
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
        public StringBuilder toString(StringBuilder sb) {
            sb.append('\"');
            sb.append(this.f35247a.getString(this.f35248b, size()));
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
    public static class Key extends AbstractC4537a {

        /* renamed from: d */
        public static final Key f35235d = new Key(FlexBuffers.f35233a, 0, 0);

        public Key(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
            super(interfaceC18844Yr1, i, i2);
        }

        public static Key empty() {
            return f35235d;
        }

        /* renamed from: b */
        public int m54692b(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f35248b;
            int i2 = 0;
            do {
                b = this.f35247a.get(i);
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
            if (key.f35248b != this.f35248b || key.f35249c != this.f35249c) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f35248b ^ this.f35249c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
        public StringBuilder toString(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
        public String toString() {
            int i = this.f35248b;
            while (this.f35247a.get(i) != 0) {
                i++;
            }
            int i2 = this.f35248b;
            return this.f35247a.getString(i2, i - i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class KeyVector {

        /* renamed from: a */
        public final TypedVector f35236a;

        public KeyVector(TypedVector typedVector) {
            this.f35236a = typedVector;
        }

        public Key get(int i) {
            if (i >= size()) {
                return Key.f35235d;
            }
            TypedVector typedVector = this.f35236a;
            TypedVector typedVector2 = this.f35236a;
            InterfaceC18844Yr1 interfaceC18844Yr1 = typedVector2.f35247a;
            return new Key(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, typedVector.f35248b + (i * typedVector.f35249c), typedVector2.f35249c), 1);
        }

        public int size() {
            return this.f35236a.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            for (int i = 0; i < this.f35236a.size(); i++) {
                this.f35236a.get(i).m54689b(sb);
                if (i != this.f35236a.size() - 1) {
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
        public static final Map f35237e = new Map(FlexBuffers.f35233a, 1, 1);

        public Map(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
            super(interfaceC18844Yr1, i, i2);
        }

        public static Map empty() {
            return f35237e;
        }

        /* renamed from: a */
        public final int m54691a(KeyVector keyVector, byte[] bArr) {
            int size = keyVector.size() - 1;
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) >>> 1;
                int m54692b = keyVector.get(i2).m54692b(bArr);
                if (m54692b < 0) {
                    i = i2 + 1;
                } else if (m54692b > 0) {
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
            int i = this.f35248b - (this.f35249c * 3);
            InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35247a;
            int m54703g = FlexBuffers.m54703g(interfaceC18844Yr1, i, this.f35249c);
            InterfaceC18844Yr1 interfaceC18844Yr12 = this.f35247a;
            int i2 = this.f35249c;
            return new KeyVector(new TypedVector(interfaceC18844Yr1, m54703g, FlexBuffers.m54698l(interfaceC18844Yr12, i + i2, i2), 4));
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector, androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
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
            return new Vector(this.f35247a, this.f35248b, this.f35249c);
        }

        public Reference get(byte[] bArr) {
            KeyVector keys = keys();
            int size = keys.size();
            int m54691a = m54691a(keys, bArr);
            if (m54691a < 0 || m54691a >= size) {
                return Reference.f35238f;
            }
            return get(m54691a);
        }
    }

    /* loaded from: classes2.dex */
    public static class Reference {

        /* renamed from: f */
        public static final Reference f35238f = new Reference(FlexBuffers.f35233a, 0, 1, 0);

        /* renamed from: a */
        public InterfaceC18844Yr1 f35239a;

        /* renamed from: b */
        public int f35240b;

        /* renamed from: c */
        public int f35241c;

        /* renamed from: d */
        public int f35242d;

        /* renamed from: e */
        public int f35243e;

        public Reference(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2, int i3) {
            this(interfaceC18844Yr1, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public Blob asBlob() {
            if (!isBlob() && !isString()) {
                return Blob.empty();
            }
            InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
            return new Blob(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
        }

        public boolean asBoolean() {
            if (isBoolean()) {
                if (this.f35239a.get(this.f35240b) == 0) {
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
            int i = this.f35243e;
            if (i == 3) {
                return FlexBuffers.m54699k(this.f35239a, this.f35240b, this.f35241c);
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
                                    InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                                    return FlexBuffers.m54699k(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
                                }
                            } else {
                                InterfaceC18844Yr1 interfaceC18844Yr12 = this.f35239a;
                                return FlexBuffers.m54696n(interfaceC18844Yr12, FlexBuffers.m54703g(interfaceC18844Yr12, this.f35240b, this.f35241c), this.f35242d);
                            }
                        } else {
                            InterfaceC18844Yr1 interfaceC18844Yr13 = this.f35239a;
                            return FlexBuffers.m54698l(interfaceC18844Yr13, FlexBuffers.m54703g(interfaceC18844Yr13, this.f35240b, this.f35241c), this.f35242d);
                        }
                    } else {
                        return Double.parseDouble(asString());
                    }
                }
                return FlexBuffers.m54696n(this.f35239a, this.f35240b, this.f35241c);
            }
            return FlexBuffers.m54698l(this.f35239a, this.f35240b, this.f35241c);
        }

        public int asInt() {
            long m54696n;
            int i = this.f35243e;
            if (i == 1) {
                return FlexBuffers.m54698l(this.f35239a, this.f35240b, this.f35241c);
            }
            if (i == 2) {
                m54696n = FlexBuffers.m54696n(this.f35239a, this.f35240b, this.f35241c);
            } else if (i != 3) {
                if (i != 5) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 8) {
                                if (i != 10) {
                                    if (i == 26) {
                                        return FlexBuffers.m54698l(this.f35239a, this.f35240b, this.f35241c);
                                    }
                                    return 0;
                                }
                                return asVector().size();
                            }
                            InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                            return (int) FlexBuffers.m54699k(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
                        }
                        InterfaceC18844Yr1 interfaceC18844Yr12 = this.f35239a;
                        m54696n = FlexBuffers.m54696n(interfaceC18844Yr12, FlexBuffers.m54703g(interfaceC18844Yr12, this.f35240b, this.f35241c), this.f35241c);
                    } else {
                        InterfaceC18844Yr1 interfaceC18844Yr13 = this.f35239a;
                        return FlexBuffers.m54698l(interfaceC18844Yr13, FlexBuffers.m54703g(interfaceC18844Yr13, this.f35240b, this.f35241c), this.f35242d);
                    }
                } else {
                    return Integer.parseInt(asString());
                }
            } else {
                return (int) FlexBuffers.m54699k(this.f35239a, this.f35240b, this.f35241c);
            }
            return (int) m54696n;
        }

        public Key asKey() {
            if (isKey()) {
                InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                return new Key(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
            }
            return Key.empty();
        }

        public long asLong() {
            int i = this.f35243e;
            if (i == 1) {
                return FlexBuffers.m54697m(this.f35239a, this.f35240b, this.f35241c);
            }
            if (i == 2) {
                return FlexBuffers.m54696n(this.f35239a, this.f35240b, this.f35241c);
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
                                    return FlexBuffers.m54698l(this.f35239a, this.f35240b, this.f35241c);
                                }
                                return asVector().size();
                            }
                            InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                            return (long) FlexBuffers.m54699k(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
                        }
                        InterfaceC18844Yr1 interfaceC18844Yr12 = this.f35239a;
                        return FlexBuffers.m54696n(interfaceC18844Yr12, FlexBuffers.m54703g(interfaceC18844Yr12, this.f35240b, this.f35241c), this.f35241c);
                    }
                    InterfaceC18844Yr1 interfaceC18844Yr13 = this.f35239a;
                    return FlexBuffers.m54697m(interfaceC18844Yr13, FlexBuffers.m54703g(interfaceC18844Yr13, this.f35240b, this.f35241c), this.f35242d);
                }
                try {
                    return Long.parseLong(asString());
                } catch (NumberFormatException unused) {
                    return 0L;
                }
            }
            return (long) FlexBuffers.m54699k(this.f35239a, this.f35240b, this.f35241c);
        }

        public Map asMap() {
            if (isMap()) {
                InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                return new Map(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
            }
            return Map.empty();
        }

        public String asString() {
            if (isString()) {
                int m54703g = FlexBuffers.m54703g(this.f35239a, this.f35240b, this.f35241c);
                InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                int i = this.f35242d;
                return this.f35239a.getString(m54703g, (int) FlexBuffers.m54696n(interfaceC18844Yr1, m54703g - i, i));
            } else if (isKey()) {
                int m54703g2 = FlexBuffers.m54703g(this.f35239a, this.f35240b, this.f35242d);
                int i2 = m54703g2;
                while (this.f35239a.get(i2) != 0) {
                    i2++;
                }
                return this.f35239a.getString(m54703g2, i2 - m54703g2);
            } else {
                return "";
            }
        }

        public long asUInt() {
            int i = this.f35243e;
            if (i == 2) {
                return FlexBuffers.m54696n(this.f35239a, this.f35240b, this.f35241c);
            }
            if (i == 1) {
                return FlexBuffers.m54697m(this.f35239a, this.f35240b, this.f35241c);
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
                                    InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                                    return (long) FlexBuffers.m54699k(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35241c);
                                }
                                InterfaceC18844Yr1 interfaceC18844Yr12 = this.f35239a;
                                return FlexBuffers.m54696n(interfaceC18844Yr12, FlexBuffers.m54703g(interfaceC18844Yr12, this.f35240b, this.f35241c), this.f35242d);
                            }
                            InterfaceC18844Yr1 interfaceC18844Yr13 = this.f35239a;
                            return FlexBuffers.m54697m(interfaceC18844Yr13, FlexBuffers.m54703g(interfaceC18844Yr13, this.f35240b, this.f35241c), this.f35242d);
                        }
                        return Long.parseLong(asString());
                    }
                    return FlexBuffers.m54698l(this.f35239a, this.f35240b, this.f35241c);
                }
                return asVector().size();
            }
            return (long) FlexBuffers.m54699k(this.f35239a, this.f35240b, this.f35241c);
        }

        public Vector asVector() {
            if (isVector()) {
                InterfaceC18844Yr1 interfaceC18844Yr1 = this.f35239a;
                return new Vector(interfaceC18844Yr1, FlexBuffers.m54703g(interfaceC18844Yr1, this.f35240b, this.f35241c), this.f35242d);
            }
            int i = this.f35243e;
            if (i == 15) {
                InterfaceC18844Yr1 interfaceC18844Yr12 = this.f35239a;
                return new TypedVector(interfaceC18844Yr12, FlexBuffers.m54703g(interfaceC18844Yr12, this.f35240b, this.f35241c), this.f35242d, 4);
            } else if (FlexBuffers.m54701i(i)) {
                InterfaceC18844Yr1 interfaceC18844Yr13 = this.f35239a;
                return new TypedVector(interfaceC18844Yr13, FlexBuffers.m54703g(interfaceC18844Yr13, this.f35240b, this.f35241c), this.f35242d, FlexBuffers.m54694p(this.f35243e));
            } else {
                return Vector.empty();
            }
        }

        /* renamed from: b */
        public StringBuilder m54689b(StringBuilder sb) {
            int i = this.f35243e;
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
                        throw new FlexBufferException("not_implemented:" + this.f35243e);
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
            return this.f35243e;
        }

        public boolean isBlob() {
            if (this.f35243e == 25) {
                return true;
            }
            return false;
        }

        public boolean isBoolean() {
            if (this.f35243e == 26) {
                return true;
            }
            return false;
        }

        public boolean isFloat() {
            int i = this.f35243e;
            if (i != 3 && i != 8) {
                return false;
            }
            return true;
        }

        public boolean isInt() {
            int i = this.f35243e;
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
            if (this.f35243e == 4) {
                return true;
            }
            return false;
        }

        public boolean isMap() {
            if (this.f35243e == 9) {
                return true;
            }
            return false;
        }

        public boolean isNull() {
            if (this.f35243e == 0) {
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
            if (this.f35243e == 5) {
                return true;
            }
            return false;
        }

        public boolean isTypedVector() {
            return FlexBuffers.m54701i(this.f35243e);
        }

        public boolean isUInt() {
            int i = this.f35243e;
            if (i != 2 && i != 7) {
                return false;
            }
            return true;
        }

        public boolean isVector() {
            int i = this.f35243e;
            if (i != 10 && i != 9) {
                return false;
            }
            return true;
        }

        public String toString() {
            return m54689b(new StringBuilder(128)).toString();
        }

        public Reference(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2, int i3, int i4) {
            this.f35239a = interfaceC18844Yr1;
            this.f35240b = i;
            this.f35241c = i2;
            this.f35242d = i3;
            this.f35243e = i4;
        }
    }

    /* loaded from: classes2.dex */
    public static class TypedVector extends Vector {

        /* renamed from: f */
        public static final TypedVector f35244f = new TypedVector(FlexBuffers.f35233a, 1, 1, 1);

        /* renamed from: e */
        public final int f35245e;

        public TypedVector(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2, int i3) {
            super(interfaceC18844Yr1, i, i2);
            this.f35245e = i3;
        }

        public static TypedVector empty() {
            return f35244f;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
        public Reference get(int i) {
            if (i >= size()) {
                return Reference.f35238f;
            }
            return new Reference(this.f35247a, this.f35248b + (i * this.f35249c), this.f35249c, 1, this.f35245e);
        }

        public int getElemType() {
            return this.f35245e;
        }

        public boolean isEmptyVector() {
            if (this == f35244f) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class Vector extends AbstractC4538b {

        /* renamed from: d */
        public static final Vector f35246d = new Vector(FlexBuffers.f35233a, 1, 1);

        public Vector(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
            super(interfaceC18844Yr1, i, i2);
        }

        public static Vector empty() {
            return f35246d;
        }

        public Reference get(int i) {
            long size = size();
            long j = i;
            if (j >= size) {
                return Reference.f35238f;
            }
            return new Reference(this.f35247a, this.f35248b + (i * this.f35249c), this.f35249c, C4539c.m54688a(this.f35247a.get((int) (this.f35248b + (size * this.f35249c) + j))));
        }

        public boolean isEmpty() {
            if (this == f35246d) {
                return true;
            }
            return false;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4538b
        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.AbstractC4537a
        public StringBuilder toString(StringBuilder sb) {
            sb.append("[ ");
            int size = size();
            for (int i = 0; i < size; i++) {
                get(i).m54689b(sb);
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
    public static abstract class AbstractC4537a {

        /* renamed from: a */
        public InterfaceC18844Yr1 f35247a;

        /* renamed from: b */
        public int f35248b;

        /* renamed from: c */
        public int f35249c;

        public AbstractC4537a(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
            this.f35247a = interfaceC18844Yr1;
            this.f35248b = i;
            this.f35249c = i2;
        }

        public String toString() {
            return toString(new StringBuilder(128)).toString();
        }

        public abstract StringBuilder toString(StringBuilder sb);
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC4538b extends AbstractC4537a {
        protected final int size;

        public AbstractC4538b(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
            super(interfaceC18844Yr1, i, i2);
            this.size = FlexBuffers.m54698l(this.f35247a, i - i2, i2);
        }

        public int size() {
            return this.size;
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.FlexBuffers$c */
    /* loaded from: classes2.dex */
    public static class C4539c {
        /* renamed from: a */
        public static int m54688a(byte b) {
            return b & 255;
        }

        /* renamed from: b */
        public static long m54687b(int i) {
            return i & BodyPartID.bodyIdMax;
        }

        /* renamed from: c */
        public static int m54686c(short s) {
            return s & UShort.MAX_VALUE;
        }
    }

    /* renamed from: g */
    public static int m54703g(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
        return (int) (i - m54696n(interfaceC18844Yr1, i, i2));
    }

    @Deprecated
    public static Reference getRoot(ByteBuffer byteBuffer) {
        return getRoot(byteBuffer.hasArray() ? new ArrayReadWriteBuf(byteBuffer.array(), byteBuffer.limit()) : new ByteBufferReadWriteBuf(byteBuffer));
    }

    /* renamed from: h */
    public static boolean m54702h(int i) {
        return i <= 3 || i == 26;
    }

    /* renamed from: i */
    public static boolean m54701i(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    /* renamed from: j */
    public static boolean m54700j(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    /* renamed from: k */
    public static double m54699k(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
        if (i2 != 4) {
            if (i2 != 8) {
                return -1.0d;
            }
            return interfaceC18844Yr1.getDouble(i);
        }
        return interfaceC18844Yr1.getFloat(i);
    }

    /* renamed from: l */
    public static int m54698l(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
        return (int) m54697m(interfaceC18844Yr1, i, i2);
    }

    /* renamed from: m */
    public static long m54697m(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return -1L;
                    }
                    return interfaceC18844Yr1.getLong(i);
                }
                i3 = interfaceC18844Yr1.getInt(i);
            } else {
                i3 = interfaceC18844Yr1.getShort(i);
            }
        } else {
            i3 = interfaceC18844Yr1.get(i);
        }
        return i3;
    }

    /* renamed from: n */
    public static long m54696n(InterfaceC18844Yr1 interfaceC18844Yr1, int i, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return -1L;
                    }
                    return interfaceC18844Yr1.getLong(i);
                }
                return C4539c.m54687b(interfaceC18844Yr1.getInt(i));
            }
            return C4539c.m54686c(interfaceC18844Yr1.getShort(i));
        }
        return C4539c.m54688a(interfaceC18844Yr1.get(i));
    }

    /* renamed from: o */
    public static int m54695o(int i, int i2) {
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
    public static int m54694p(int i) {
        return i - 10;
    }

    public static Reference getRoot(InterfaceC18844Yr1 interfaceC18844Yr1) {
        int limit = interfaceC18844Yr1.limit();
        byte b = interfaceC18844Yr1.get(limit - 1);
        int i = limit - 2;
        return new Reference(interfaceC18844Yr1, i - b, b, C4539c.m54688a(interfaceC18844Yr1.get(i)));
    }
}
