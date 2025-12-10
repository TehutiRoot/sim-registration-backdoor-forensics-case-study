package org.bson.codecs.configuration;

import org.bson.codecs.Codec;

/* loaded from: classes6.dex */
public interface CodecProvider {
    <T> Codec<T> get(Class<T> cls, CodecRegistry codecRegistry);
}
