package org.bson.codecs;

import org.bson.UuidRepresentation;

/* loaded from: classes6.dex */
public interface OverridableUuidRepresentationCodec<T> {
    Codec<T> withUuidRepresentation(UuidRepresentation uuidRepresentation);
}