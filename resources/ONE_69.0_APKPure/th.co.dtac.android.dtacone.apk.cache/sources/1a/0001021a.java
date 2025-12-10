package org.bson.codecs.pojo;

import java.util.List;

/* loaded from: classes6.dex */
public interface TypeWithTypeParameters<T> {
    Class<T> getType();

    List<? extends TypeWithTypeParameters<?>> getTypeParameters();
}