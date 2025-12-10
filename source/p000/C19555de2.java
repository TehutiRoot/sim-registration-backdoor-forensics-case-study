package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_common.zzba;
import com.google.android.gms.internal.mlkit_common.zzbc;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* renamed from: de2 */
/* loaded from: classes3.dex */
public final class C19555de2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f61226f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f61227g;

    /* renamed from: h */
    public static final FieldDescriptor f61228h;

    /* renamed from: i */
    public static final ObjectEncoder f61229i;

    /* renamed from: a */
    public OutputStream f61230a;

    /* renamed from: b */
    public final Map f61231b;

    /* renamed from: c */
    public final Map f61232c;

    /* renamed from: d */
    public final ObjectEncoder f61233d;

    /* renamed from: e */
    public final C21791qe2 f61234e = new C21791qe2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f61227g = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f61228h = builder2.withProperty(zzayVar2.zzb()).build();
        f61229i = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbd
            @Override // com.google.firebase.encoders.ObjectEncoder
            public final void encode(Object obj, Object obj2) {
                C19555de2.m31819g((Map.Entry) obj, (ObjectEncoderContext) obj2);
            }
        };
    }

    public C19555de2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f61230a = outputStream;
        this.f61231b = map;
        this.f61232c = map2;
        this.f61233d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m31819g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f61227g, entry.getKey());
        objectEncoderContext.add(f61228h, entry.getValue());
    }

    /* renamed from: h */
    public static int m31818h(FieldDescriptor fieldDescriptor) {
        zzbc zzbcVar = (zzbc) fieldDescriptor.getProperty(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: j */
    public static zzbc m31816j(FieldDescriptor fieldDescriptor) {
        zzbc zzbcVar = (zzbc) fieldDescriptor.getProperty(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    public static ByteBuffer m31813m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final ObjectEncoderContext m31825a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m31812n((m31818h(fieldDescriptor) << 3) | 1);
        this.f61230a.write(m31813m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m31825a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m31824b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m31812n((m31818h(fieldDescriptor) << 3) | 5);
        this.f61230a.write(m31813m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m31823c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    m31812n((m31818h(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f61226f);
                    m31812n(bytes.length);
                    this.f61230a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    m31823c(fieldDescriptor, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    m31815k(f61229i, fieldDescriptor, entry, false);
                }
            } else if (obj instanceof Double) {
                m31825a(fieldDescriptor, ((Double) obj).doubleValue(), z);
                return this;
            } else if (obj instanceof Float) {
                m31824b(fieldDescriptor, ((Float) obj).floatValue(), z);
                return this;
            } else if (obj instanceof Number) {
                m31821e(fieldDescriptor, ((Number) obj).longValue(), z);
                return this;
            } else if (obj instanceof Boolean) {
                m31822d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return this;
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    m31812n((m31818h(fieldDescriptor) << 3) | 2);
                    m31812n(bArr.length);
                    this.f61230a.write(bArr);
                    return this;
                }
            } else {
                ObjectEncoder objectEncoder = (ObjectEncoder) this.f61231b.get(obj.getClass());
                if (objectEncoder != null) {
                    m31815k(objectEncoder, fieldDescriptor, obj, z);
                    return this;
                }
                ValueEncoder valueEncoder = (ValueEncoder) this.f61232c.get(obj.getClass());
                if (valueEncoder != null) {
                    m31814l(valueEncoder, fieldDescriptor, obj, z);
                    return this;
                } else if (obj instanceof zzba) {
                    m31822d(fieldDescriptor, ((zzba) obj).zza(), true);
                    return this;
                } else if (obj instanceof Enum) {
                    m31822d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                    return this;
                } else {
                    m31815k(this.f61233d, fieldDescriptor, obj, z);
                    return this;
                }
            }
        }
        return this;
    }

    /* renamed from: d */
    public final C19555de2 m31822d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (!z || i != 0) {
            zzbc m31816j = m31816j(fieldDescriptor);
            int ordinal = m31816j.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        m31812n((m31816j.zza() << 3) | 5);
                        this.f61230a.write(m31813m(4).putInt(i).array());
                    }
                } else {
                    m31812n(m31816j.zza() << 3);
                    m31812n((i + i) ^ (i >> 31));
                }
            } else {
                m31812n(m31816j.zza() << 3);
                m31812n(i);
            }
        }
        return this;
    }

    /* renamed from: e */
    public final C19555de2 m31821e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (!z || j != 0) {
            zzbc m31816j = m31816j(fieldDescriptor);
            int ordinal = m31816j.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        m31812n((m31816j.zza() << 3) | 1);
                        this.f61230a.write(m31813m(8).putLong(j).array());
                    }
                } else {
                    m31812n(m31816j.zza() << 3);
                    m31811o((j >> 63) ^ (j + j));
                }
            } else {
                m31812n(m31816j.zza() << 3);
                m31811o(j);
            }
        }
        return this;
    }

    /* renamed from: f */
    public final C19555de2 m31820f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f61231b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: i */
    public final long m31817i(ObjectEncoder objectEncoder, Object obj) {
        C20584jd2 c20584jd2 = new C20584jd2();
        try {
            OutputStream outputStream = this.f61230a;
            this.f61230a = c20584jd2;
            objectEncoder.encode(obj, this);
            this.f61230a = outputStream;
            long m29164b = c20584jd2.m29164b();
            c20584jd2.close();
            return m29164b;
        } catch (Throwable th2) {
            try {
                c20584jd2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m31820f(obj);
        return this;
    }

    /* renamed from: k */
    public final C19555de2 m31815k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m31817i = m31817i(objectEncoder, obj);
        if (z && m31817i == 0) {
            return this;
        }
        m31812n((m31818h(fieldDescriptor) << 3) | 2);
        m31811o(m31817i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C19555de2 m31814l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f61234e.m23463a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f61234e);
        return this;
    }

    /* renamed from: n */
    public final void m31812n(int i) {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) != 0) {
                this.f61230a.write(i2 | 128);
                i >>>= 7;
            } else {
                this.f61230a.write(i2);
                return;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    /* renamed from: o */
    public final void m31811o(long j) {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) != 0) {
                this.f61230a.write(i | 128);
                j >>>= 7;
            } else {
                this.f61230a.write(i);
                return;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m31824b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38762of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m31822d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m31821e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m31823c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m31822d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m31825a(FieldDescriptor.m38762of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m31822d(FieldDescriptor.m38762of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m31821e(FieldDescriptor.m38762of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m31823c(FieldDescriptor.m38762of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m31822d(FieldDescriptor.m38762of(str), z ? 1 : 0, true);
        return this;
    }
}
