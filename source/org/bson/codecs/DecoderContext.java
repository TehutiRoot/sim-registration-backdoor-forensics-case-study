package org.bson.codecs;

import org.bson.BsonReader;

/* loaded from: classes6.dex */
public final class DecoderContext {

    /* renamed from: b */
    public static final DecoderContext f75819b = builder().build();

    /* renamed from: a */
    public final boolean f75820a;

    /* loaded from: classes6.dex */
    public static final class Builder {

        /* renamed from: a */
        public boolean f75821a;

        public DecoderContext build() {
            return new DecoderContext(this);
        }

        public Builder checkedDiscriminator(boolean z) {
            this.f75821a = z;
            return this;
        }

        public boolean hasCheckedDiscriminator() {
            return this.f75821a;
        }

        public Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public <T> T decodeWithChildContext(Decoder<T> decoder, BsonReader bsonReader) {
        return decoder.decode(bsonReader, f75819b);
    }

    public boolean hasCheckedDiscriminator() {
        return this.f75820a;
    }

    public DecoderContext(Builder builder) {
        this.f75820a = builder.hasCheckedDiscriminator();
    }
}
