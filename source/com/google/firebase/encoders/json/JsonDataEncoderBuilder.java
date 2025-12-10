package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* renamed from: e */
    public static final ObjectEncoder f55415e = new ObjectEncoder() { // from class: Zg0
        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void encode(Object obj, Object obj2) {
            JsonDataEncoderBuilder.m38754h(obj, (ObjectEncoderContext) obj2);
        }
    };

    /* renamed from: f */
    public static final ValueEncoder f55416f = new ValueEncoder() { // from class: ah0
        @Override // com.google.firebase.encoders.ValueEncoder
        public final void encode(Object obj, Object obj2) {
            ((ValueEncoderContext) obj2).add((String) obj);
        }
    };

    /* renamed from: g */
    public static final ValueEncoder f55417g = new ValueEncoder() { // from class: bh0
        @Override // com.google.firebase.encoders.ValueEncoder
        public final void encode(Object obj, Object obj2) {
            JsonDataEncoderBuilder.m38752j((Boolean) obj, (ValueEncoderContext) obj2);
        }
    };

    /* renamed from: h */
    public static final C8495b f55418h = new C8495b(null);

    /* renamed from: a */
    public final Map f55419a = new HashMap();

    /* renamed from: b */
    public final Map f55420b = new HashMap();

    /* renamed from: c */
    public ObjectEncoder f55421c = f55415e;

    /* renamed from: d */
    public boolean f55422d = false;

    /* renamed from: com.google.firebase.encoders.json.JsonDataEncoderBuilder$b */
    /* loaded from: classes4.dex */
    public static final class C8495b implements ValueEncoder {

        /* renamed from: a */
        public static final DateFormat f55424a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f55424a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public C8495b() {
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        /* renamed from: a */
        public void encode(Date date, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.add(f55424a.format(date));
        }

        public /* synthetic */ C8495b(C8494a c8494a) {
            this();
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, f55416f);
        registerEncoder(Boolean.class, f55417g);
        registerEncoder(Date.class, (ValueEncoder) f55418h);
    }

    /* renamed from: h */
    public static /* synthetic */ void m38754h(Object obj, ObjectEncoderContext objectEncoderContext) {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: j */
    public static /* synthetic */ void m38752j(Boolean bool, ValueEncoderContext valueEncoderContext) {
        valueEncoderContext.add(bool.booleanValue());
    }

    @NonNull
    public DataEncoder build() {
        return new C8494a();
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.f55422d = z;
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.f55421c = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.f55419a.put(cls, objectEncoder);
        this.f55420b.remove(cls);
        return this;
    }

    /* renamed from: com.google.firebase.encoders.json.JsonDataEncoderBuilder$a */
    /* loaded from: classes4.dex */
    public class C8494a implements DataEncoder {
        public C8494a() {
            JsonDataEncoderBuilder.this = r1;
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public void encode(Object obj, Writer writer) {
            C23174yh0 c23174yh0 = new C23174yh0(writer, JsonDataEncoderBuilder.this.f55419a, JsonDataEncoderBuilder.this.f55420b, JsonDataEncoderBuilder.this.f55421c, JsonDataEncoderBuilder.this.f55422d);
            c23174yh0.m223e(obj, false);
            c23174yh0.m213o();
        }

        @Override // com.google.firebase.encoders.DataEncoder
        public String encode(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                encode(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.f55420b.put(cls, valueEncoder);
        this.f55419a.remove(cls);
        return this;
    }
}
