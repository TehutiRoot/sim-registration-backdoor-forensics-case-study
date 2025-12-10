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

/* renamed from: af2 */
/* loaded from: classes3.dex */
public final class C19084af2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f8465f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f8466g;

    /* renamed from: h */
    public static final FieldDescriptor f8467h;

    /* renamed from: i */
    public static final ObjectEncoder f8468i;

    /* renamed from: a */
    public OutputStream f8469a;

    /* renamed from: b */
    public final Map f8470b;

    /* renamed from: c */
    public final Map f8471c;

    /* renamed from: d */
    public final ObjectEncoder f8472d;

    /* renamed from: e */
    public final C21338nf2 f8473e = new C21338nf2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzay zzayVar = new zzay();
        zzayVar.zza(1);
        f8466g = builder.withProperty(zzayVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzay zzayVar2 = new zzay();
        zzayVar2.zza(2);
        f8467h = builder2.withProperty(zzayVar2.zzb()).build();
        f8468i = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_common.zzbd
            @Override // com.google.firebase.encoders.ObjectEncoder
            public final void encode(Object obj, Object obj2) {
                C19084af2.m65085g((Map.Entry) obj, (ObjectEncoderContext) obj2);
            }
        };
    }

    public C19084af2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f8469a = outputStream;
        this.f8470b = map;
        this.f8471c = map2;
        this.f8472d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m65085g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f8466g, entry.getKey());
        objectEncoderContext.add(f8467h, entry.getValue());
    }

    /* renamed from: h */
    public static int m65084h(FieldDescriptor fieldDescriptor) {
        zzbc zzbcVar = (zzbc) fieldDescriptor.getProperty(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: j */
    public static zzbc m65082j(FieldDescriptor fieldDescriptor) {
        zzbc zzbcVar = (zzbc) fieldDescriptor.getProperty(zzbc.class);
        if (zzbcVar != null) {
            return zzbcVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    public static ByteBuffer m65079m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: a */
    public final ObjectEncoderContext m65091a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m65078n((m65084h(fieldDescriptor) << 3) | 1);
        this.f8469a.write(m65079m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m65091a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m65090b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m65078n((m65084h(fieldDescriptor) << 3) | 5);
        this.f8469a.write(m65079m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m65089c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    m65078n((m65084h(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f8465f);
                    m65078n(bytes.length);
                    this.f8469a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    m65089c(fieldDescriptor, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    m65081k(f8468i, fieldDescriptor, entry, false);
                }
            } else if (obj instanceof Double) {
                m65091a(fieldDescriptor, ((Double) obj).doubleValue(), z);
                return this;
            } else if (obj instanceof Float) {
                m65090b(fieldDescriptor, ((Float) obj).floatValue(), z);
                return this;
            } else if (obj instanceof Number) {
                m65087e(fieldDescriptor, ((Number) obj).longValue(), z);
                return this;
            } else if (obj instanceof Boolean) {
                m65088d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return this;
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    m65078n((m65084h(fieldDescriptor) << 3) | 2);
                    m65078n(bArr.length);
                    this.f8469a.write(bArr);
                    return this;
                }
            } else {
                ObjectEncoder objectEncoder = (ObjectEncoder) this.f8470b.get(obj.getClass());
                if (objectEncoder != null) {
                    m65081k(objectEncoder, fieldDescriptor, obj, z);
                    return this;
                }
                ValueEncoder valueEncoder = (ValueEncoder) this.f8471c.get(obj.getClass());
                if (valueEncoder != null) {
                    m65080l(valueEncoder, fieldDescriptor, obj, z);
                    return this;
                } else if (obj instanceof zzba) {
                    m65088d(fieldDescriptor, ((zzba) obj).zza(), true);
                    return this;
                } else if (obj instanceof Enum) {
                    m65088d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                    return this;
                } else {
                    m65081k(this.f8472d, fieldDescriptor, obj, z);
                    return this;
                }
            }
        }
        return this;
    }

    /* renamed from: d */
    public final C19084af2 m65088d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (!z || i != 0) {
            zzbc m65082j = m65082j(fieldDescriptor);
            int ordinal = m65082j.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        m65078n((m65082j.zza() << 3) | 5);
                        this.f8469a.write(m65079m(4).putInt(i).array());
                    }
                } else {
                    m65078n(m65082j.zza() << 3);
                    m65078n((i + i) ^ (i >> 31));
                }
            } else {
                m65078n(m65082j.zza() << 3);
                m65078n(i);
            }
        }
        return this;
    }

    /* renamed from: e */
    public final C19084af2 m65087e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (!z || j != 0) {
            zzbc m65082j = m65082j(fieldDescriptor);
            int ordinal = m65082j.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        m65078n((m65082j.zza() << 3) | 1);
                        this.f8469a.write(m65079m(8).putLong(j).array());
                    }
                } else {
                    m65078n(m65082j.zza() << 3);
                    m65077o((j >> 63) ^ (j + j));
                }
            } else {
                m65078n(m65082j.zza() << 3);
                m65077o(j);
            }
        }
        return this;
    }

    /* renamed from: f */
    public final C19084af2 m65086f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f8470b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    /* renamed from: i */
    public final long m65083i(ObjectEncoder objectEncoder, Object obj) {
        C20124ge2 c20124ge2 = new C20124ge2();
        try {
            OutputStream outputStream = this.f8469a;
            this.f8469a = c20124ge2;
            objectEncoder.encode(obj, this);
            this.f8469a = outputStream;
            long m31367b = c20124ge2.m31367b();
            c20124ge2.close();
            return m31367b;
        } catch (Throwable th2) {
            try {
                c20124ge2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m65086f(obj);
        return this;
    }

    /* renamed from: k */
    public final C19084af2 m65081k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m65083i = m65083i(objectEncoder, obj);
        if (z && m65083i == 0) {
            return this;
        }
        m65078n((m65084h(fieldDescriptor) << 3) | 2);
        m65077o(m65083i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C19084af2 m65080l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f8473e.m26278a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f8473e);
        return this;
    }

    /* renamed from: n */
    public final void m65078n(int i) {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) != 0) {
                this.f8469a.write(i2 | 128);
                i >>>= 7;
            } else {
                this.f8469a.write(i2);
                return;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    /* renamed from: o */
    public final void m65077o(long j) {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) != 0) {
                this.f8469a.write(i | 128);
                j >>>= 7;
            } else {
                this.f8469a.write(i);
                return;
            }
        }
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m65090b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38754of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m65088d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m65087e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m65089c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m65088d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m65091a(FieldDescriptor.m38754of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m65088d(FieldDescriptor.m38754of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m65087e(FieldDescriptor.m38754of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m65089c(FieldDescriptor.m38754of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m65088d(FieldDescriptor.m38754of(str), z ? 1 : 0, true);
        return this;
    }
}