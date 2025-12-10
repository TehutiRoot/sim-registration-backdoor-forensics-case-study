package p000;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.NumberedEnum;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* renamed from: Eh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17565Eh0 implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a */
    public C17565Eh0 f1420a = null;

    /* renamed from: b */
    public boolean f1421b = true;

    /* renamed from: c */
    public final JsonWriter f1422c;

    /* renamed from: d */
    public final Map f1423d;

    /* renamed from: e */
    public final Map f1424e;

    /* renamed from: f */
    public final ObjectEncoder f1425f;

    /* renamed from: g */
    public final boolean f1426g;

    public C17565Eh0(Writer writer, Map map, Map map2, ObjectEncoder objectEncoder, boolean z) {
        this.f1422c = new JsonWriter(writer);
        this.f1423d = map;
        this.f1424e = map2;
        this.f1425f = objectEncoder;
        this.f1426g = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: a */
    public C17565Eh0 add(double d) {
        m68595s();
        this.f1422c.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: b */
    public C17565Eh0 add(float f) {
        m68595s();
        this.f1422c.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: c */
    public C17565Eh0 add(int i) {
        m68595s();
        this.f1422c.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: d */
    public C17565Eh0 add(long j) {
        m68595s();
        this.f1422c.value(j);
        return this;
    }

    /* renamed from: e */
    public C17565Eh0 m68609e(Object obj, boolean z) {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && m68600n(obj)) {
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            throw new EncodingException(String.format("%s cannot be encoded inline", cls));
        } else if (obj == null) {
            this.f1422c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f1422c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.f1422c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f1422c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    add(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f1422c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f1422c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m68609e(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m68609e(obj2, false);
                }
            }
            this.f1422c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f1422c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m68609e(obj3, false);
            }
            this.f1422c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f1422c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f1422c.endObject();
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f1423d.get(obj.getClass());
            if (objectEncoder != null) {
                return m68598p(objectEncoder, obj, z);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f1424e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                if (obj instanceof NumberedEnum) {
                    add(((NumberedEnum) obj).getNumber());
                } else {
                    add(((Enum) obj).name());
                }
                return this;
            } else {
                return m68598p(this.f1425f, obj, z);
            }
        }
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: f */
    public C17565Eh0 add(String str) {
        m68595s();
        this.f1422c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: g */
    public C17565Eh0 add(String str, double d) {
        m68595s();
        this.f1422c.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: h */
    public C17565Eh0 add(String str, int i) {
        m68595s();
        this.f1422c.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: i */
    public C17565Eh0 add(String str, long j) {
        m68595s();
        this.f1422c.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext inline(Object obj) {
        return m68609e(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: j */
    public C17565Eh0 add(String str, Object obj) {
        if (this.f1426g) {
            return m68596r(str, obj);
        }
        return m68597q(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: k */
    public C17565Eh0 add(String str, boolean z) {
        m68595s();
        this.f1422c.name(str);
        return add(z);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: l */
    public C17565Eh0 add(boolean z) {
        m68595s();
        this.f1422c.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: m */
    public C17565Eh0 add(byte[] bArr) {
        m68595s();
        if (bArr == null) {
            this.f1422c.nullValue();
        } else {
            this.f1422c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: n */
    public final boolean m68600n(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(String str) {
        m68595s();
        this.f1420a = new C17565Eh0(this);
        this.f1422c.name(str);
        this.f1422c.beginObject();
        return this.f1420a;
    }

    /* renamed from: o */
    public void m68599o() {
        m68595s();
        this.f1422c.flush();
    }

    /* renamed from: p */
    public C17565Eh0 m68598p(ObjectEncoder objectEncoder, Object obj, boolean z) {
        if (!z) {
            this.f1422c.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z) {
            this.f1422c.endObject();
        }
        return this;
    }

    /* renamed from: q */
    public final C17565Eh0 m68597q(String str, Object obj) {
        m68595s();
        this.f1422c.name(str);
        if (obj == null) {
            this.f1422c.nullValue();
            return this;
        }
        return m68609e(obj, false);
    }

    /* renamed from: r */
    public final C17565Eh0 m68596r(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m68595s();
        this.f1422c.name(str);
        return m68609e(obj, false);
    }

    /* renamed from: s */
    public final void m68595s() {
        if (this.f1421b) {
            C17565Eh0 c17565Eh0 = this.f1420a;
            if (c17565Eh0 != null) {
                c17565Eh0.m68595s();
                this.f1420a.f1421b = false;
                this.f1420a = null;
                this.f1422c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        return nested(fieldDescriptor.getName());
    }

    public C17565Eh0(C17565Eh0 c17565Eh0) {
        this.f1422c = c17565Eh0.f1422c;
        this.f1423d = c17565Eh0.f1423d;
        this.f1424e = c17565Eh0.f1424e;
        this.f1425f = c17565Eh0.f1425f;
        this.f1426g = c17565Eh0.f1426g;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        return add(fieldDescriptor.getName(), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f) {
        return add(fieldDescriptor.getName(), f);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d) {
        return add(fieldDescriptor.getName(), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        return add(fieldDescriptor.getName(), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j) {
        return add(fieldDescriptor.getName(), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z) {
        return add(fieldDescriptor.getName(), z);
    }
}