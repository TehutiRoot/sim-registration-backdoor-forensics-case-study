package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.mlkit_vision_text_common.zzct;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcx;
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

/* renamed from: mh2 */
/* loaded from: classes3.dex */
public final class C21112mh2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f71999f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f72000g;

    /* renamed from: h */
    public static final FieldDescriptor f72001h;

    /* renamed from: i */
    public static final ObjectEncoder f72002i;

    /* renamed from: a */
    public OutputStream f72003a;

    /* renamed from: b */
    public final Map f72004b;

    /* renamed from: c */
    public final Map f72005c;

    /* renamed from: d */
    public final ObjectEncoder f72006d;

    /* renamed from: e */
    public final C19911fi2 f72007e = new C19911fi2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzct zzctVar = new zzct();
        zzctVar.zza(1);
        f72000g = builder.withProperty(zzctVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzct zzctVar2 = new zzct();
        zzctVar2.zza(2);
        f72001h = builder2.withProperty(zzctVar2.zzb()).build();
        f72002i = new ObjectEncoder() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzcy
            @Override // com.google.firebase.encoders.ObjectEncoder
            public final void encode(Object obj, Object obj2) {
                C21112mh2.m26218g((Map.Entry) obj, (ObjectEncoderContext) obj2);
            }
        };
    }

    public C21112mh2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f72003a = outputStream;
        this.f72004b = map;
        this.f72005c = map2;
        this.f72006d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m26218g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f72000g, entry.getKey());
        objectEncoderContext.add(f72001h, entry.getValue());
    }

    /* renamed from: h */
    private static int m26217h(FieldDescriptor fieldDescriptor) {
        zzcx zzcxVar = (zzcx) fieldDescriptor.getProperty(zzcx.class);
        if (zzcxVar != null) {
            return zzcxVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: i */
    private final long m26216i(ObjectEncoder objectEncoder, Object obj) {
        C18689Wg2 c18689Wg2 = new C18689Wg2();
        try {
            OutputStream outputStream = this.f72003a;
            this.f72003a = c18689Wg2;
            objectEncoder.encode(obj, this);
            this.f72003a = outputStream;
            long m65581b = c18689Wg2.m65581b();
            c18689Wg2.close();
            return m65581b;
        } catch (Throwable th2) {
            try {
                c18689Wg2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* renamed from: j */
    public static zzcx m26215j(FieldDescriptor fieldDescriptor) {
        zzcx zzcxVar = (zzcx) fieldDescriptor.getProperty(zzcx.class);
        if (zzcxVar != null) {
            return zzcxVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private static ByteBuffer m26212m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private final void m26211n(int i) {
        while (true) {
            int i2 = i & 127;
            if ((i & (-128)) != 0) {
                this.f72003a.write(i2 | 128);
                i >>>= 7;
            } else {
                this.f72003a.write(i2);
                return;
            }
        }
    }

    /* renamed from: o */
    private final void m26210o(long j) {
        while (true) {
            int i = ((int) j) & 127;
            if (((-128) & j) != 0) {
                this.f72003a.write(i | 128);
                j >>>= 7;
            } else {
                this.f72003a.write(i);
                return;
            }
        }
    }

    /* renamed from: a */
    public final ObjectEncoderContext m26224a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m26211n((m26217h(fieldDescriptor) << 3) | 1);
        this.f72003a.write(m26212m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m26224a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m26223b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m26211n((m26217h(fieldDescriptor) << 3) | 5);
        this.f72003a.write(m26212m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m26222c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z || charSequence.length() != 0) {
                    m26211n((m26217h(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f71999f);
                    m26211n(bytes.length);
                    this.f72003a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    m26222c(fieldDescriptor, obj2, false);
                }
            } else if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    m26214k(f72002i, fieldDescriptor, entry, false);
                }
            } else if (obj instanceof Double) {
                m26224a(fieldDescriptor, ((Double) obj).doubleValue(), z);
                return this;
            } else if (obj instanceof Float) {
                m26223b(fieldDescriptor, ((Float) obj).floatValue(), z);
                return this;
            } else if (obj instanceof Number) {
                m26220e(fieldDescriptor, ((Number) obj).longValue(), z);
                return this;
            } else if (obj instanceof Boolean) {
                m26221d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                return this;
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (!z || bArr.length != 0) {
                    m26211n((m26217h(fieldDescriptor) << 3) | 2);
                    m26211n(bArr.length);
                    this.f72003a.write(bArr);
                    return this;
                }
            } else {
                ObjectEncoder objectEncoder = (ObjectEncoder) this.f72004b.get(obj.getClass());
                if (objectEncoder != null) {
                    m26214k(objectEncoder, fieldDescriptor, obj, z);
                    return this;
                }
                ValueEncoder valueEncoder = (ValueEncoder) this.f72005c.get(obj.getClass());
                if (valueEncoder != null) {
                    m26213l(valueEncoder, fieldDescriptor, obj, z);
                    return this;
                } else if (obj instanceof zzcv) {
                    m26221d(fieldDescriptor, ((zzcv) obj).zza(), true);
                    return this;
                } else if (obj instanceof Enum) {
                    m26221d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                    return this;
                } else {
                    m26214k(this.f72006d, fieldDescriptor, obj, z);
                    return this;
                }
            }
        }
        return this;
    }

    /* renamed from: d */
    public final C21112mh2 m26221d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (!z || i != 0) {
            zzcx m26215j = m26215j(fieldDescriptor);
            int ordinal = m26215j.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        m26211n((m26215j.zza() << 3) | 5);
                        this.f72003a.write(m26212m(4).putInt(i).array());
                    }
                } else {
                    m26211n(m26215j.zza() << 3);
                    m26211n((i + i) ^ (i >> 31));
                }
            } else {
                m26211n(m26215j.zza() << 3);
                m26211n(i);
            }
        }
        return this;
    }

    /* renamed from: e */
    public final C21112mh2 m26220e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (!z || j != 0) {
            zzcx m26215j = m26215j(fieldDescriptor);
            int ordinal = m26215j.zzb().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        m26211n((m26215j.zza() << 3) | 1);
                        this.f72003a.write(m26212m(8).putLong(j).array());
                    }
                } else {
                    m26211n(m26215j.zza() << 3);
                    m26210o((j >> 63) ^ (j + j));
                }
            } else {
                m26211n(m26215j.zza() << 3);
                m26210o(j);
            }
        }
        return this;
    }

    /* renamed from: f */
    public final C21112mh2 m26219f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f72004b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m26219f(obj);
        return this;
    }

    /* renamed from: k */
    public final C21112mh2 m26214k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m26216i = m26216i(objectEncoder, obj);
        if (z && m26216i == 0) {
            return this;
        }
        m26211n((m26217h(fieldDescriptor) << 3) | 2);
        m26210o(m26216i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C21112mh2 m26213l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f72007e.m31263a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f72007e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m26223b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38762of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m26221d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m26220e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m26222c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m26221d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m26224a(FieldDescriptor.m38762of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m26221d(FieldDescriptor.m38762of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m26220e(FieldDescriptor.m38762of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m26222c(FieldDescriptor.m38762of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m26221d(FieldDescriptor.m38762of(str), z ? 1 : 0, true);
        return this;
    }
}
