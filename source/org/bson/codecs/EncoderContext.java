package org.bson.codecs;

import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public final class EncoderContext {

    /* renamed from: b */
    public static final EncoderContext f75832b = builder().build();

    /* renamed from: a */
    public final boolean f75833a;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f75834a;

        public EncoderContext build() {
            return new EncoderContext(this);
        }

        public Builder isEncodingCollectibleDocument(boolean z) {
            this.f75834a = z;
            return this;
        }

        public Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public <T> void encodeWithChildContext(Encoder<T> encoder, BsonWriter bsonWriter, T t) {
        encoder.encode(bsonWriter, t, f75832b);
    }

    public EncoderContext getChildContext() {
        return f75832b;
    }

    public boolean isEncodingCollectibleDocument() {
        return this.f75833a;
    }

    public EncoderContext(Builder builder) {
        this.f75833a = builder.f75834a;
    }
}
