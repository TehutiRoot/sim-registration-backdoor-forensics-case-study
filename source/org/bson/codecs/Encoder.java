package org.bson.codecs;

import org.bson.BsonWriter;

/* loaded from: classes6.dex */
public interface Encoder<T> {
    void encode(BsonWriter bsonWriter, T t, EncoderContext encoderContext);

    Class<T> getEncoderClass();
}
