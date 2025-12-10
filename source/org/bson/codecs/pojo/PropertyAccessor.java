package org.bson.codecs.pojo;

/* loaded from: classes6.dex */
public interface PropertyAccessor<T> {
    <S> T get(S s);

    <S> void set(S s, T t);
}
