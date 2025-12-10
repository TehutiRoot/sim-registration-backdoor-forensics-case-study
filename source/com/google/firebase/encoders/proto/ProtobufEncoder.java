package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ProtobufEncoder {

    /* renamed from: a */
    public final Map f55429a;

    /* renamed from: b */
    public final Map f55430b;

    /* renamed from: c */
    public final ObjectEncoder f55431c;

    public ProtobufEncoder(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f55429a = map;
        this.f55430b = map2;
        this.f55431c = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new C8498a(outputStream, this.f55429a, this.f55430b, this.f55431c).m38734o(obj);
    }

    /* loaded from: classes4.dex */
    public static final class Builder implements EncoderConfig<Builder> {

        /* renamed from: d */
        public static final ObjectEncoder f55432d = new ObjectEncoder() { // from class: Mo1
            @Override // com.google.firebase.encoders.ObjectEncoder
            public final void encode(Object obj, Object obj2) {
                ProtobufEncoder.Builder.m38750a(obj, (ObjectEncoderContext) obj2);
            }
        };

        /* renamed from: a */
        public final Map f55433a = new HashMap();

        /* renamed from: b */
        public final Map f55434b = new HashMap();

        /* renamed from: c */
        public ObjectEncoder f55435c = f55432d;

        /* renamed from: a */
        public static /* synthetic */ void m38750a(Object obj, ObjectEncoderContext objectEncoderContext) {
            m38749b(obj, objectEncoderContext);
        }

        /* renamed from: b */
        public static /* synthetic */ void m38749b(Object obj, ObjectEncoderContext objectEncoderContext) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.f55433a), new HashMap(this.f55434b), this.f55435c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.f55435c = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.f55433a.put(cls, objectEncoder);
            this.f55434b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.f55434b.put(cls, valueEncoder);
            this.f55433a.remove(cls);
            return this;
        }
    }

    @NonNull
    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
