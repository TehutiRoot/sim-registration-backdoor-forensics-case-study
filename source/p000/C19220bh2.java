package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.internal.mlkit_vision_face.zzcs;
import com.google.android.gms.internal.mlkit_vision_face.zzct;
import com.google.android.gms.internal.mlkit_vision_face.zzcu;
import com.google.android.gms.internal.mlkit_vision_face.zzcv;
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

/* renamed from: bh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19220bh2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f39149f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f39150g;

    /* renamed from: h */
    public static final FieldDescriptor f39151h;

    /* renamed from: i */
    public static final ObjectEncoder f39152i;

    /* renamed from: a */
    public OutputStream f39153a;

    /* renamed from: b */
    public final Map f39154b;

    /* renamed from: c */
    public final Map f39155c;

    /* renamed from: d */
    public final ObjectEncoder f39156d;

    /* renamed from: e */
    public final C18116Nh2 f39157e = new C18116Nh2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        f39150g = builder.withProperty(zzcqVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        f39151h = builder2.withProperty(zzcqVar2.zzb()).build();
        f39152i = zzcv.zza;
    }

    public C19220bh2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f39153a = outputStream;
        this.f39154b = map;
        this.f39155c = map2;
        this.f39156d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m51897g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f39150g, entry.getKey());
        objectEncoderContext.add(f39151h, entry.getValue());
    }

    /* renamed from: h */
    private static int m51896h(FieldDescriptor fieldDescriptor) {
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: i */
    private final long m51895i(ObjectEncoder objectEncoder, Object obj) {
        C17665Gg2 c17665Gg2 = new C17665Gg2();
        try {
            OutputStream outputStream = this.f39153a;
            this.f39153a = c17665Gg2;
            objectEncoder.encode(obj, this);
            this.f39153a = outputStream;
            long m68220b = c17665Gg2.m68220b();
            c17665Gg2.close();
            return m68220b;
        } catch (Throwable th2) {
            try {
                c17665Gg2.close();
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
    public static zzcu m51894j(FieldDescriptor fieldDescriptor) {
        zzcu zzcuVar = (zzcu) fieldDescriptor.getProperty(zzcu.class);
        if (zzcuVar != null) {
            return zzcuVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private static ByteBuffer m51891m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private final void m51890n(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f39153a;
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
    private final void m51889o(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f39153a;
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
    public final ObjectEncoderContext m51903a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m51890n((m51896h(fieldDescriptor) << 3) | 1);
        this.f39153a.write(m51891m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m51903a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m51902b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m51890n((m51896h(fieldDescriptor) << 3) | 5);
        this.f39153a.write(m51891m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m51901c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m51890n((m51896h(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f39149f);
            m51890n(bytes.length);
            this.f39153a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m51901c(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m51893k(f39152i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m51903a(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m51902b(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m51899e(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m51900d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m51890n((m51896h(fieldDescriptor) << 3) | 2);
            m51890n(bArr.length);
            this.f39153a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f39154b.get(obj.getClass());
            if (objectEncoder != null) {
                m51893k(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f39155c.get(obj.getClass());
            if (valueEncoder != null) {
                m51892l(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzcs) {
                m51900d(fieldDescriptor, ((zzcs) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m51900d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m51893k(this.f39156d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* renamed from: d */
    public final C19220bh2 m51900d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        zzcu m51894j = m51894j(fieldDescriptor);
        zzct zzctVar = zzct.DEFAULT;
        int ordinal = m51894j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m51890n((m51894j.zza() << 3) | 5);
                    this.f39153a.write(m51891m(4).putInt(i).array());
                }
            } else {
                m51890n(m51894j.zza() << 3);
                m51890n((i + i) ^ (i >> 31));
            }
        } else {
            m51890n(m51894j.zza() << 3);
            m51890n(i);
        }
        return this;
    }

    /* renamed from: e */
    public final C19220bh2 m51899e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        zzcu m51894j = m51894j(fieldDescriptor);
        zzct zzctVar = zzct.DEFAULT;
        int ordinal = m51894j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m51890n((m51894j.zza() << 3) | 1);
                    this.f39153a.write(m51891m(8).putLong(j).array());
                }
            } else {
                m51890n(m51894j.zza() << 3);
                m51889o((j >> 63) ^ (j + j));
            }
        } else {
            m51890n(m51894j.zza() << 3);
            m51889o(j);
        }
        return this;
    }

    /* renamed from: f */
    public final C19220bh2 m51898f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f39154b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m51898f(obj);
        return this;
    }

    /* renamed from: k */
    public final C19220bh2 m51893k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m51895i = m51895i(objectEncoder, obj);
        if (z && m51895i == 0) {
            return this;
        }
        m51890n((m51896h(fieldDescriptor) << 3) | 2);
        m51889o(m51895i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C19220bh2 m51892l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f39157e.m67201a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f39157e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m51902b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38762of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m51900d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m51899e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m51901c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m51900d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m51903a(FieldDescriptor.m38762of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m51900d(FieldDescriptor.m38762of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m51899e(FieldDescriptor.m38762of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m51901c(FieldDescriptor.m38762of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m51900d(FieldDescriptor.m38762of(str), z ? 1 : 0, true);
        return this;
    }
}
