package org.bson.codecs.pojo;

import org.bson.codecs.Codec;

/* loaded from: classes6.dex */
public interface PropertyCodecRegistry {
    <T> Codec<T> get(TypeWithTypeParameters<T> typeWithTypeParameters);
}
