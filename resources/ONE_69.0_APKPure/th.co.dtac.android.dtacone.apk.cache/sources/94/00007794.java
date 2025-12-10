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

/* renamed from: ap2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19119ap2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f38912f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f38913g;

    /* renamed from: h */
    public static final FieldDescriptor f38914h;

    /* renamed from: i */
    public static final ObjectEncoder f38915i;

    /* renamed from: a */
    public OutputStream f38916a;

    /* renamed from: b */
    public final Map f38917b;

    /* renamed from: c */
    public final Map f38918c;

    /* renamed from: d */
    public final ObjectEncoder f38919d;

    /* renamed from: e */
    public final C23271yp2 f38920e = new C23271yp2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzfc zzfcVar = new zzfc();
        zzfcVar.zza(1);
        f38913g = builder.withProperty(zzfcVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzfc zzfcVar2 = new zzfc();
        zzfcVar2.zza(2);
        f38914h = builder2.withProperty(zzfcVar2.zzb()).build();
        f38915i = zzfh.zza;
    }

    public C19119ap2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f38916a = outputStream;
        this.f38917b = map;
        this.f38918c = map2;
        this.f38919d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m52066g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f38913g, entry.getKey());
        objectEncoderContext.add(f38914h, entry.getValue());
    }

    /* renamed from: h */
    private static int m52065h(FieldDescriptor fieldDescriptor) {
        zzfg zzfgVar = (zzfg) fieldDescriptor.getProperty(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: i */
    private final long m52064i(ObjectEncoder objectEncoder, Object obj) {
        C22749vo2 c22749vo2 = new C22749vo2();
        try {
            OutputStream outputStream = this.f38916a;
            this.f38916a = c22749vo2;
            objectEncoder.encode(obj, this);
            this.f38916a = outputStream;
            long m845b = c22749vo2.m845b();
            c22749vo2.close();
            return m845b;
        } catch (Throwable th2) {
            try {
                c22749vo2.close();
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
    public static zzfg m52063j(FieldDescriptor fieldDescriptor) {
        zzfg zzfgVar = (zzfg) fieldDescriptor.getProperty(zzfg.class);
        if (zzfgVar != null) {
            return zzfgVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private static ByteBuffer m52060m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private final void m52059n(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f38916a;
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
    private final void m52058o(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f38916a;
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
    public final ObjectEncoderContext m52072a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m52059n((m52065h(fieldDescriptor) << 3) | 1);
        this.f38916a.write(m52060m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m52072a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m52071b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m52059n((m52065h(fieldDescriptor) << 3) | 5);
        this.f38916a.write(m52060m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m52070c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m52059n((m52065h(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f38912f);
            m52059n(bytes.length);
            this.f38916a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m52070c(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m52062k(f38915i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m52072a(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m52071b(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m52068e(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m52069d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m52059n((m52065h(fieldDescriptor) << 3) | 2);
            m52059n(bArr.length);
            this.f38916a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f38917b.get(obj.getClass());
            if (objectEncoder != null) {
                m52062k(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f38918c.get(obj.getClass());
            if (valueEncoder != null) {
                m52061l(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzfe) {
                m52069d(fieldDescriptor, ((zzfe) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m52069d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m52062k(this.f38919d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* renamed from: d */
    public final C19119ap2 m52069d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        zzfg m52063j = m52063j(fieldDescriptor);
        zzff zzffVar = zzff.DEFAULT;
        int ordinal = m52063j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m52059n((m52063j.zza() << 3) | 5);
                    this.f38916a.write(m52060m(4).putInt(i).array());
                }
            } else {
                m52059n(m52063j.zza() << 3);
                m52059n((i + i) ^ (i >> 31));
            }
        } else {
            m52059n(m52063j.zza() << 3);
            m52059n(i);
        }
        return this;
    }

    /* renamed from: e */
    public final C19119ap2 m52068e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        zzfg m52063j = m52063j(fieldDescriptor);
        zzff zzffVar = zzff.DEFAULT;
        int ordinal = m52063j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m52059n((m52063j.zza() << 3) | 1);
                    this.f38916a.write(m52060m(8).putLong(j).array());
                }
            } else {
                m52059n(m52063j.zza() << 3);
                m52058o((j >> 63) ^ (j + j));
            }
        } else {
            m52059n(m52063j.zza() << 3);
            m52058o(j);
        }
        return this;
    }

    /* renamed from: f */
    public final C19119ap2 m52067f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f38917b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m52067f(obj);
        return this;
    }

    /* renamed from: k */
    public final C19119ap2 m52062k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m52064i = m52064i(objectEncoder, obj);
        if (z && m52064i == 0) {
            return this;
        }
        m52059n((m52065h(fieldDescriptor) << 3) | 2);
        m52058o(m52064i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C19119ap2 m52061l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f38920e.m242a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f38920e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m52071b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38754of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m52069d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m52068e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m52070c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m52069d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m52072a(FieldDescriptor.m38754of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m52069d(FieldDescriptor.m38754of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m52068e(FieldDescriptor.m38754of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m52070c(FieldDescriptor.m38754of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m52069d(FieldDescriptor.m38754of(str), z ? 1 : 0, true);
        return this;
    }
}