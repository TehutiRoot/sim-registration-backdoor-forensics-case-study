package com.google.firebase.encoders.proto;

import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.C8498a;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.firebase.encoders.proto.a */
/* loaded from: classes4.dex */
public final class C8498a implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f55436f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f55437g = FieldDescriptor.builder(Action.KEY_ATTRIBUTE).withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* renamed from: h */
    public static final FieldDescriptor f55438h = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();

    /* renamed from: i */
    public static final ObjectEncoder f55439i = new ObjectEncoder() { // from class: Lo1
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            C8498a.m38748a((Map.Entry) obj, (ObjectEncoderContext) obj2);
        }
    };

    /* renamed from: a */
    public OutputStream f55440a;

    /* renamed from: b */
    public final Map f55441b;

    /* renamed from: c */
    public final Map f55442c;

    /* renamed from: d */
    public final ObjectEncoder f55443d;

    /* renamed from: e */
    public final C18134No1 f55444e = new C18134No1(this);

    /* renamed from: com.google.firebase.encoders.proto.a$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8499a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f55445a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f55445a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55445a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55445a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C8498a(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f55440a = outputStream;
        this.f55441b = map;
        this.f55442c = map2;
        this.f55443d = objectEncoder;
    }

    /* renamed from: a */
    public static /* synthetic */ void m38748a(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        m38731r(entry, objectEncoderContext);
    }

    /* renamed from: k */
    public static ByteBuffer m38738k(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: p */
    public static Protobuf m38733p(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: q */
    public static int m38732q(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: r */
    public static /* synthetic */ void m38731r(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f55437g, entry.getKey());
        objectEncoderContext.add(f55438h, entry.getValue());
    }

    /* renamed from: b */
    public ObjectEncoderContext m38747b(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m38730s((m38732q(fieldDescriptor) << 3) | 1);
        this.f55440a.write(m38738k(8).putDouble(d).array());
        return this;
    }

    /* renamed from: c */
    public ObjectEncoderContext m38746c(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m38730s((m38732q(fieldDescriptor) << 3) | 5);
        this.f55440a.write(m38738k(4).putFloat(f).array());
        return this;
    }

    /* renamed from: d */
    public ObjectEncoderContext m38745d(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m38730s((m38732q(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f55436f);
            m38730s(bytes.length);
            this.f55440a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m38745d(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m38736m(f55439i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m38747b(fieldDescriptor, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m38746c(fieldDescriptor, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m38741h(fieldDescriptor, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m38739j(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m38730s((m38732q(fieldDescriptor) << 3) | 2);
                m38730s(bArr.length);
                this.f55440a.write(bArr);
                return this;
            }
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f55441b.get(obj.getClass());
            if (objectEncoder != null) {
                return m38736m(objectEncoder, fieldDescriptor, obj, z);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f55442c.get(obj.getClass());
            if (valueEncoder != null) {
                return m38735n(valueEncoder, fieldDescriptor, obj, z);
            }
            if (obj instanceof ProtoEnum) {
                return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return add(fieldDescriptor, ((Enum) obj).ordinal());
            }
            return m38736m(this.f55443d, fieldDescriptor, obj, z);
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: e */
    public C8498a add(FieldDescriptor fieldDescriptor, int i) {
        return m38743f(fieldDescriptor, i, true);
    }

    /* renamed from: f */
    public C8498a m38743f(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        Protobuf m38733p = m38733p(fieldDescriptor);
        int i2 = C8499a.f55445a[m38733p.intEncoding().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    m38730s((m38733p.tag() << 3) | 5);
                    this.f55440a.write(m38738k(4).putInt(i).array());
                }
            } else {
                m38730s(m38733p.tag() << 3);
                m38730s((i << 1) ^ (i >> 31));
            }
        } else {
            m38730s(m38733p.tag() << 3);
            m38730s(i);
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: g */
    public C8498a add(FieldDescriptor fieldDescriptor, long j) {
        return m38741h(fieldDescriptor, j, true);
    }

    /* renamed from: h */
    public C8498a m38741h(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        Protobuf m38733p = m38733p(fieldDescriptor);
        int i = C8499a.f55445a[m38733p.intEncoding().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m38730s((m38733p.tag() << 3) | 1);
                    this.f55440a.write(m38738k(8).putLong(j).array());
                }
            } else {
                m38730s(m38733p.tag() << 3);
                m38729t((j >> 63) ^ (j << 1));
            }
        } else {
            m38730s(m38733p.tag() << 3);
            m38729t(j);
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: i */
    public C8498a add(FieldDescriptor fieldDescriptor, boolean z) {
        return m38739j(fieldDescriptor, z, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext inline(Object obj) {
        return m38734o(obj);
    }

    /* renamed from: j */
    public C8498a m38739j(FieldDescriptor fieldDescriptor, boolean z, boolean z2) {
        return m38743f(fieldDescriptor, z ? 1 : 0, z2);
    }

    /* renamed from: l */
    public final long m38737l(ObjectEncoder objectEncoder, Object obj) {
        C17733Hi0 c17733Hi0 = new C17733Hi0();
        try {
            OutputStream outputStream = this.f55440a;
            this.f55440a = c17733Hi0;
            objectEncoder.encode(obj, this);
            this.f55440a = outputStream;
            long m68048b = c17733Hi0.m68048b();
            c17733Hi0.close();
            return m68048b;
        } catch (Throwable th2) {
            try {
                c17733Hi0.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: m */
    public final C8498a m38736m(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m38737l = m38737l(objectEncoder, obj);
        if (z && m38737l == 0) {
            return this;
        }
        m38730s((m38732q(fieldDescriptor) << 3) | 2);
        m38729t(m38737l);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: n */
    public final C8498a m38735n(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f55444e.m67169b(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f55444e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38762of(str));
    }

    /* renamed from: o */
    public C8498a m38734o(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f55441b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    /* renamed from: s */
    public final void m38730s(int i) {
        while ((i & (-128)) != 0) {
            this.f55440a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f55440a.write(i & 127);
    }

    /* renamed from: t */
    public final void m38729t(long j) {
        while (((-128) & j) != 0) {
            this.f55440a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f55440a.write(((int) j) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, Object obj) {
        return add(FieldDescriptor.m38762of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, double d) {
        return add(FieldDescriptor.m38762of(str), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, int i) {
        return add(FieldDescriptor.m38762of(str), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, long j) {
        return add(FieldDescriptor.m38762of(str), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(String str, boolean z) {
        return add(FieldDescriptor.m38762of(str), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        return m38745d(fieldDescriptor, obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        return m38747b(fieldDescriptor, d, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        return m38746c(fieldDescriptor, f, true);
    }
}
