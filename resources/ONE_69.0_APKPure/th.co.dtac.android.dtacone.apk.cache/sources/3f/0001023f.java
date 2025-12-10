package org.bson.json;

/* loaded from: classes4.dex */
public interface Converter<T> {
    void convert(T t, StrictJsonWriter strictJsonWriter);
}