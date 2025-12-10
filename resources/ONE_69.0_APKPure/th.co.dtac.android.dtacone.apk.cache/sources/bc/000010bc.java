package p000;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_common.zzag;
import com.google.android.gms.internal.mlkit_vision_common.zzah;
import com.google.android.gms.internal.mlkit_vision_common.zzai;
import com.google.android.gms.internal.mlkit_vision_common.zzaj;
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

/* renamed from: Rc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18397Rc2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f5566f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f5567g;

    /* renamed from: h */
    public static final FieldDescriptor f5568h;

    /* renamed from: i */
    public static final ObjectEncoder f5569i;

    /* renamed from: a */
    public OutputStream f5570a;

    /* renamed from: b */
    public final Map f5571b;

    /* renamed from: c */
    public final Map f5572c;

    /* renamed from: d */
    public final ObjectEncoder f5573d;

    /* renamed from: e */
    public final C19602dd2 f5574e = new C19602dd2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f5567g = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f5568h = builder2.withProperty(zzaeVar2.zzb()).build();
        f5569i = zzaj.zza;
    }

    public C18397Rc2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f5570a = outputStream;
        this.f5571b = map;
        this.f5572c = map2;
        this.f5573d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m66619g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f5567g, entry.getKey());
        objectEncoderContext.add(f5568h, entry.getValue());
    }

    /* renamed from: h */
    private static int m66618h(FieldDescriptor fieldDescriptor) {
        zzai zzaiVar = (zzai) fieldDescriptor.getProperty(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: i */
    private final long m66617i(ObjectEncoder objectEncoder, Object obj) {
        C22713vc2 c22713vc2 = new C22713vc2();
        try {
            OutputStream outputStream = this.f5570a;
            this.f5570a = c22713vc2;
            objectEncoder.encode(obj, this);
            this.f5570a = outputStream;
            long m885b = c22713vc2.m885b();
            c22713vc2.close();
            return m885b;
        } catch (Throwable th2) {
            try {
                c22713vc2.close();
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
    public static zzai m66616j(FieldDescriptor fieldDescriptor) {
        zzai zzaiVar = (zzai) fieldDescriptor.getProperty(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private static ByteBuffer m66613m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private final void m66612n(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f5570a;
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
    private final void m66611o(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f5570a;
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
    public final ObjectEncoderContext m66625a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m66612n((m66618h(fieldDescriptor) << 3) | 1);
        this.f5570a.write(m66613m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m66625a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m66624b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m66612n((m66618h(fieldDescriptor) << 3) | 5);
        this.f5570a.write(m66613m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m66623c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m66612n((m66618h(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f5566f);
            m66612n(bytes.length);
            this.f5570a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m66623c(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m66615k(f5569i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m66625a(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m66624b(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m66621e(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m66622d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m66612n((m66618h(fieldDescriptor) << 3) | 2);
            m66612n(bArr.length);
            this.f5570a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f5571b.get(obj.getClass());
            if (objectEncoder != null) {
                m66615k(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f5572c.get(obj.getClass());
            if (valueEncoder != null) {
                m66614l(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzag) {
                m66622d(fieldDescriptor, ((zzag) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m66622d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m66615k(this.f5573d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* renamed from: d */
    public final C18397Rc2 m66622d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        zzai m66616j = m66616j(fieldDescriptor);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = m66616j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m66612n((m66616j.zza() << 3) | 5);
                    this.f5570a.write(m66613m(4).putInt(i).array());
                }
            } else {
                m66612n(m66616j.zza() << 3);
                m66612n((i + i) ^ (i >> 31));
            }
        } else {
            m66612n(m66616j.zza() << 3);
            m66612n(i);
        }
        return this;
    }

    /* renamed from: e */
    public final C18397Rc2 m66621e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        zzai m66616j = m66616j(fieldDescriptor);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = m66616j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m66612n((m66616j.zza() << 3) | 1);
                    this.f5570a.write(m66613m(8).putLong(j).array());
                }
            } else {
                m66612n(m66616j.zza() << 3);
                m66611o((j >> 63) ^ (j + j));
            }
        } else {
            m66612n(m66616j.zza() << 3);
            m66611o(j);
        }
        return this;
    }

    /* renamed from: f */
    public final C18397Rc2 m66620f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f5571b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m66620f(obj);
        return this;
    }

    /* renamed from: k */
    public final C18397Rc2 m66615k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m66617i = m66617i(objectEncoder, obj);
        if (z && m66617i == 0) {
            return this;
        }
        m66612n((m66618h(fieldDescriptor) << 3) | 2);
        m66611o(m66617i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C18397Rc2 m66614l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f5574e.m31796a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f5574e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m66624b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38754of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m66622d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m66621e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m66623c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m66622d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m66625a(FieldDescriptor.m38754of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m66622d(FieldDescriptor.m38754of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m66621e(FieldDescriptor.m38754of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m66623c(FieldDescriptor.m38754of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m66622d(FieldDescriptor.m38754of(str), z ? 1 : 0, true);
        return this;
    }
}