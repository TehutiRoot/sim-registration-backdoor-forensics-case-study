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
    public final Map f55441a;

    /* renamed from: b */
    public final Map f55442b;

    /* renamed from: c */
    public final ObjectEncoder f55443c;

    public ProtobufEncoder(Map map, Map map2, ObjectEncoder objectEncoder) {
        this.f55441a = map;
        this.f55442b = map2;
        this.f55443c = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new C8487a(outputStream, this.f55441a, this.f55442b, this.f55443c).m38726o(obj);
    }

    /* loaded from: classes4.dex */
    public static final class Builder implements EncoderConfig<Builder> {

        /* renamed from: d */
        public static final ObjectEncoder f55444d = new ObjectEncoder() { // from class: Jp1
            @Override // com.google.firebase.encoders.ObjectEncoder
            public final void encode(Object obj, Object obj2) {
                ProtobufEncoder.Builder.m38742a(obj, (ObjectEncoderContext) obj2);
            }
        };

        /* renamed from: a */
        public final Map f55445a = new HashMap();

        /* renamed from: b */
        public final Map f55446b = new HashMap();

        /* renamed from: c */
        public ObjectEncoder f55447c = f55444d;

        /* renamed from: a */
        public static /* synthetic */ void m38742a(Object obj, ObjectEncoderContext objectEncoderContext) {
            m38741b(obj, objectEncoderContext);
        }

        /* renamed from: b */
        public static /* synthetic */ void m38741b(Object obj, ObjectEncoderContext objectEncoderContext) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.f55445a), new HashMap(this.f55446b), this.f55447c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.f55447c = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.f55445a.put(cls, objectEncoder);
            this.f55446b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.f55446b.put(cls, valueEncoder);
            this.f55445a.remove(cls);
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