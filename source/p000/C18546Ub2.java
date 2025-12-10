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

/* renamed from: Ub2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18546Ub2 implements ObjectEncoderContext {

    /* renamed from: f */
    public static final Charset f6370f = Charset.forName("UTF-8");

    /* renamed from: g */
    public static final FieldDescriptor f6371g;

    /* renamed from: h */
    public static final FieldDescriptor f6372h;

    /* renamed from: i */
    public static final ObjectEncoder f6373i;

    /* renamed from: a */
    public OutputStream f6374a;

    /* renamed from: b */
    public final Map f6375b;

    /* renamed from: c */
    public final Map f6376c;

    /* renamed from: d */
    public final ObjectEncoder f6377d;

    /* renamed from: e */
    public final C20065gc2 f6378e = new C20065gc2(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder(Action.KEY_ATTRIBUTE);
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        f6371g = builder.withProperty(zzaeVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        f6372h = builder2.withProperty(zzaeVar2.zzb()).build();
        f6373i = zzaj.zza;
    }

    public C18546Ub2(OutputStream outputStream, Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f6374a = outputStream;
        this.f6375b = map;
        this.f6376c = map2;
        this.f6377d = objectEncoder;
    }

    /* renamed from: g */
    public static /* synthetic */ void m66010g(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(f6371g, entry.getKey());
        objectEncoderContext.add(f6372h, entry.getValue());
    }

    /* renamed from: h */
    private static int m66009h(FieldDescriptor fieldDescriptor) {
        zzai zzaiVar = (zzai) fieldDescriptor.getProperty(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: i */
    private final long m66008i(ObjectEncoder objectEncoder, Object obj) {
        C23158yb2 c23158yb2 = new C23158yb2();
        try {
            OutputStream outputStream = this.f6374a;
            this.f6374a = c23158yb2;
            objectEncoder.encode(obj, this);
            this.f6374a = outputStream;
            long m234b = c23158yb2.m234b();
            c23158yb2.close();
            return m234b;
        } catch (Throwable th2) {
            try {
                c23158yb2.close();
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
    public static zzai m66007j(FieldDescriptor fieldDescriptor) {
        zzai zzaiVar = (zzai) fieldDescriptor.getProperty(zzai.class);
        if (zzaiVar != null) {
            return zzaiVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: m */
    private static ByteBuffer m66004m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private final void m66003n(int i) {
        while (true) {
            int i2 = ((i & (-128)) > 0L ? 1 : ((i & (-128)) == 0L ? 0 : -1));
            OutputStream outputStream = this.f6374a;
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
    private final void m66002o(long j) {
        while (true) {
            int i = (((-128) & j) > 0L ? 1 : (((-128) & j) == 0L ? 0 : -1));
            OutputStream outputStream = this.f6374a;
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
    public final ObjectEncoderContext m66016a(FieldDescriptor fieldDescriptor, double d, boolean z) {
        if (z && d == 0.0d) {
            return this;
        }
        m66003n((m66009h(fieldDescriptor) << 3) | 1);
        this.f6374a.write(m66004m(8).putDouble(d).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        m66016a(fieldDescriptor, d, true);
        return this;
    }

    /* renamed from: b */
    public final ObjectEncoderContext m66015b(FieldDescriptor fieldDescriptor, float f, boolean z) {
        if (z && f == 0.0f) {
            return this;
        }
        m66003n((m66009h(fieldDescriptor) << 3) | 5);
        this.f6374a.write(m66004m(4).putFloat(f).array());
        return this;
    }

    /* renamed from: c */
    public final ObjectEncoderContext m66014c(FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m66003n((m66009h(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f6370f);
            m66003n(bytes.length);
            this.f6374a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m66014c(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m66006k(f6373i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            m66016a(fieldDescriptor, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            m66015b(fieldDescriptor, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            m66012e(fieldDescriptor, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            m66013d(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            m66003n((m66009h(fieldDescriptor) << 3) | 2);
            m66003n(bArr.length);
            this.f6374a.write(bArr);
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f6375b.get(obj.getClass());
            if (objectEncoder != null) {
                m66006k(objectEncoder, fieldDescriptor, obj, z);
                return this;
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f6376c.get(obj.getClass());
            if (valueEncoder != null) {
                m66005l(valueEncoder, fieldDescriptor, obj, z);
                return this;
            } else if (obj instanceof zzag) {
                m66013d(fieldDescriptor, ((zzag) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                m66013d(fieldDescriptor, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                m66006k(this.f6377d, fieldDescriptor, obj, z);
                return this;
            }
        }
    }

    /* renamed from: d */
    public final C18546Ub2 m66013d(FieldDescriptor fieldDescriptor, int i, boolean z) {
        if (z && i == 0) {
            return this;
        }
        zzai m66007j = m66007j(fieldDescriptor);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = m66007j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m66003n((m66007j.zza() << 3) | 5);
                    this.f6374a.write(m66004m(4).putInt(i).array());
                }
            } else {
                m66003n(m66007j.zza() << 3);
                m66003n((i + i) ^ (i >> 31));
            }
        } else {
            m66003n(m66007j.zza() << 3);
            m66003n(i);
        }
        return this;
    }

    /* renamed from: e */
    public final C18546Ub2 m66012e(FieldDescriptor fieldDescriptor, long j, boolean z) {
        if (z && j == 0) {
            return this;
        }
        zzai m66007j = m66007j(fieldDescriptor);
        zzah zzahVar = zzah.DEFAULT;
        int ordinal = m66007j.zzb().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m66003n((m66007j.zza() << 3) | 1);
                    this.f6374a.write(m66004m(8).putLong(j).array());
                }
            } else {
                m66003n(m66007j.zza() << 3);
                m66002o((j >> 63) ^ (j + j));
            }
        } else {
            m66003n(m66007j.zza() << 3);
            m66002o(j);
        }
        return this;
    }

    /* renamed from: f */
    public final C18546Ub2 m66011f(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder objectEncoder = (ObjectEncoder) this.f6375b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        m66011f(obj);
        return this;
    }

    /* renamed from: k */
    public final C18546Ub2 m66006k(ObjectEncoder objectEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        long m66008i = m66008i(objectEncoder, obj);
        if (z && m66008i == 0) {
            return this;
        }
        m66003n((m66009h(fieldDescriptor) << 3) | 2);
        m66002o(m66008i);
        objectEncoder.encode(obj, this);
        return this;
    }

    /* renamed from: l */
    public final C18546Ub2 m66005l(ValueEncoder valueEncoder, FieldDescriptor fieldDescriptor, Object obj, boolean z) {
        this.f6378e.m31078a(fieldDescriptor, z);
        valueEncoder.encode(obj, this.f6378e);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        m66015b(fieldDescriptor, f, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.m38762of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        m66013d(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        m66012e(fieldDescriptor, j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        m66014c(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        m66013d(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d) {
        m66016a(FieldDescriptor.m38762of(str), d, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        m66013d(FieldDescriptor.m38762of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j) {
        m66012e(FieldDescriptor.m38762of(str), j, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        m66014c(FieldDescriptor.m38762of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z) {
        m66013d(FieldDescriptor.m38762of(str), z ? 1 : 0, true);
        return this;
    }
}
