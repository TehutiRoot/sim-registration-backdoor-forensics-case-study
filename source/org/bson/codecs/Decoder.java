package org.bson.codecs;

import org.bson.BsonReader;

/* loaded from: classes6.dex */
public interface Decoder<T> {
    T decode(BsonReader bsonReader, DecoderContext decoderContext);
}
