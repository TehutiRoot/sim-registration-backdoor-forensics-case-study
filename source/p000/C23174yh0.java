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

/* renamed from: yh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23174yh0 implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a */
    public C23174yh0 f108818a = null;

    /* renamed from: b */
    public boolean f108819b = true;

    /* renamed from: c */
    public final JsonWriter f108820c;

    /* renamed from: d */
    public final Map f108821d;

    /* renamed from: e */
    public final Map f108822e;

    /* renamed from: f */
    public final ObjectEncoder f108823f;

    /* renamed from: g */
    public final boolean f108824g;

    public C23174yh0(Writer writer, Map map, Map map2, ObjectEncoder objectEncoder, boolean z) {
        this.f108820c = new JsonWriter(writer);
        this.f108821d = map;
        this.f108822e = map2;
        this.f108823f = objectEncoder;
        this.f108824g = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: a */
    public C23174yh0 add(double d) {
        m209s();
        this.f108820c.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: b */
    public C23174yh0 add(float f) {
        m209s();
        this.f108820c.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: c */
    public C23174yh0 add(int i) {
        m209s();
        this.f108820c.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: d */
    public C23174yh0 add(long j) {
        m209s();
        this.f108820c.value(j);
        return this;
    }

    /* renamed from: e */
    public C23174yh0 m223e(Object obj, boolean z) {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && m214n(obj)) {
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            throw new EncodingException(String.format("%s cannot be encoded inline", cls));
        } else if (obj == null) {
            this.f108820c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f108820c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.f108820c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f108820c.value(iArr[i]);
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
                    this.f108820c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f108820c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m223e(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m223e(obj2, false);
                }
            }
            this.f108820c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f108820c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m223e(obj3, false);
            }
            this.f108820c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f108820c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f108820c.endObject();
            return this;
        } else {
            ObjectEncoder objectEncoder = (ObjectEncoder) this.f108821d.get(obj.getClass());
            if (objectEncoder != null) {
                return m212p(objectEncoder, obj, z);
            }
            ValueEncoder valueEncoder = (ValueEncoder) this.f108822e.get(obj.getClass());
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
                return m212p(this.f108823f, obj, z);
            }
        }
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: f */
    public C23174yh0 add(String str) {
        m209s();
        this.f108820c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: g */
    public C23174yh0 add(String str, double d) {
        m209s();
        this.f108820c.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: h */
    public C23174yh0 add(String str, int i) {
        m209s();
        this.f108820c.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: i */
    public C23174yh0 add(String str, long j) {
        m209s();
        this.f108820c.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext inline(Object obj) {
        return m223e(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: j */
    public C23174yh0 add(String str, Object obj) {
        if (this.f108824g) {
            return m210r(str, obj);
        }
        return m211q(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    /* renamed from: k */
    public C23174yh0 add(String str, boolean z) {
        m209s();
        this.f108820c.name(str);
        return add(z);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: l */
    public C23174yh0 add(boolean z) {
        m209s();
        this.f108820c.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    /* renamed from: m */
    public C23174yh0 add(byte[] bArr) {
        m209s();
        if (bArr == null) {
            this.f108820c.nullValue();
        } else {
            this.f108820c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    /* renamed from: n */
    public final boolean m214n(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public ObjectEncoderContext nested(String str) {
        m209s();
        this.f108818a = new C23174yh0(this);
        this.f108820c.name(str);
        this.f108820c.beginObject();
        return this.f108818a;
    }

    /* renamed from: o */
    public void m213o() {
        m209s();
        this.f108820c.flush();
    }

    /* renamed from: p */
    public C23174yh0 m212p(ObjectEncoder objectEncoder, Object obj, boolean z) {
        if (!z) {
            this.f108820c.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z) {
            this.f108820c.endObject();
        }
        return this;
    }

    /* renamed from: q */
    public final C23174yh0 m211q(String str, Object obj) {
        m209s();
        this.f108820c.name(str);
        if (obj == null) {
            this.f108820c.nullValue();
            return this;
        }
        return m223e(obj, false);
    }

    /* renamed from: r */
    public final C23174yh0 m210r(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        m209s();
        this.f108820c.name(str);
        return m223e(obj, false);
    }

    /* renamed from: s */
    public final void m209s() {
        if (this.f108819b) {
            C23174yh0 c23174yh0 = this.f108818a;
            if (c23174yh0 != null) {
                c23174yh0.m209s();
                this.f108818a.f108819b = false;
                this.f108818a = null;
                this.f108820c.endObject();
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

    public C23174yh0(C23174yh0 c23174yh0) {
        this.f108820c = c23174yh0.f108820c;
        this.f108821d = c23174yh0.f108821d;
        this.f108822e = c23174yh0.f108822e;
        this.f108823f = c23174yh0.f108823f;
        this.f108824g = c23174yh0.f108824g;
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
