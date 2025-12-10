package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzff;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfh;
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

/* renamed from: do2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19585do2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f61317f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f61318g;

    /* renamed from: h */
    public static final FieldDescriptor f61319h;

    /* renamed from: i */
    public static final ObjectEncoder f61320i;

    /* renamed from: a */
    public OutputStream f61321a;

    /* renamed from: b */
    public final Map f61322b;

    /* renamed from: c */
    public final Map f61323c;

    /* renamed from: d */
    public final ObjectEncoder f61324d;

    /* renamed from: e */
    public final Bo2 f61325e = new Bo2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f61318g = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f61319h = builder2.withProperty(zzfcVar2.zzb()).build();
        f61320i = zzfh.zza;
    }

    public C19585do2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f61321a = outputStream;
        this.f61322b = map;
        this.f61323c = map2;
        this.f61324d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m31685g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f61318g, entry.getKey());
        objectEncoderContext.add(f61319h, entry.getValue());
    }

    /* renamed from: h */
    private static int m31684h(FieldDescriptor fieldDescriptor) {
        zzfg zzfgVar = (zzfg) fieldDescriptor.getProperty(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: i */
    private final long m31683i(ObjectEncoder objectEncoder, Object obj) {
        C23194yn2 c23194yn2 = new C23194yn2();
        try {
            OutputStream outputStream = this.f61321a;
            this.f61321a = c23194yn2;
            objectEncoder.encode(obj, this);
            this.f61321a = outputStream;
            long m184b = c23194yn2.m184b();
            c23194yn2.close();
            return m184b;
        } catch (Throwable th2) {
            try {
                c23194yn2.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: j */
    public static zzfg m31682j(FieldDescriptor fieldDescriptor) {
        zzfg zzfgVar = (zzfg) fieldDescriptor.getProperty(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private static ByteBuffer m31679m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private final void m31678n(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f61321a;
            if (i2 != 0) {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    /* renamed from: o */
    private final void m31677o(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f61321a;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    /* renamed from: a */
    public final ObjectEncoderContext m31691a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m31678n((m31684h(fieldDescriptor) << 3) | 1);
        this.f61321a.write(m31679m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m31691a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m31690b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m31678n((m31684h(fieldDescriptor) << 3) | 5);
        this.f61321a.write(m31679m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m31689c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m31678n((m31684h(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f61317f);
            m31678n(bytes.length);
            this.f61321a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m31689c(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m31681k(f61320i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m31691a(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m31690b(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m31687e(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m31688d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m31678n((m31684h(fieldDescriptor) << 3) | 2);
            m31678n(bArr.length);
            this.f61321a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f61322b.get(obj.getClass());
            if (objectEncoder != null) {
                m31681k(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f61323c.get(obj.getClass());
            if (valueEncoder != null) {
                m31680l(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzfe) {
                m31688d(fieldDescriptor, ((zzfe) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m31688d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m31681k(this.f61324d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* renamed from: d */
    public final C19585do2 m31688d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        zzfg m31682j = m31682j(fieldDescriptor);
        zzff zzffVar = zzff.DEFAULT;
        int ordinal = m31682j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m31678n((m31682j.zza() << 3) | 5);
                    this.f61321a.write(m31679m(4).putInt(i).array());
                }
            } else {
                m31678n(m31682j.zza() << 3);
                m31678n((i + i) ^ (i >> 31));
            }
        } else {
            m31678n(m31682j.zza() << 3);
            m31678n(i);
        }
        return this;
    }

    /* renamed from: e */
    public final C19585do2 m31687e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        zzfg m31682j = m31682j(fieldDescriptor);
        zzff zzffVar = zzff.DEFAULT;
        int ordinal = m31682j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m31678n((m31682j.zza() << 3) | 1);
                    this.f61321a.write(m31679m(8).putLong(j).array());
                }
            } else {
                m31678n(m31682j.zza() << 3);
                m31677o((j >> 63) ^ (j + j));
            }
        } else {
            m31678n(m31682j.zza() << 3);
            m31677o(j);
        }
        return this;
    }

    /* renamed from: f */
    public final C19585do2 m31686f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f61322b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m31686f(obj);
        return this;
    }

    /* renamed from: k */
    public final C19585do2 m31681k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m31683i = m31683i(objectEncoder, obj);
        if (z && m31683i == 0) {
            return this;
        }
        m31678n((m31684h(fieldDescriptor) << 3) | 2);
        m31677o(m31683i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C19585do2 m31680l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f61325e.m68877a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f61325e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m31690b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38762of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m31688d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m31687e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m31689c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m31688d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m31691a(FieldDescriptor.m38762of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m31688d(FieldDescriptor.m38762of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m31687e(FieldDescriptor.m38762of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m31689c(FieldDescriptor.m38762of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m31688d(FieldDescriptor.m38762of(str), z ? 1 : 0, true);
        return this;
    }
}
