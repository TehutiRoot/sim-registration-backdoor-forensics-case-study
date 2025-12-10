package org.bson.codecs.configuration;

import org.bson.codecs.Codec;

/* loaded from: classes6.dex */
public interface CodecRegistry {
    <T> Codec<T> get(Class<T> cls);
}