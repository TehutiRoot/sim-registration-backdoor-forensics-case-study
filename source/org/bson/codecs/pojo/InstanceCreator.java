package org.bson.codecs.pojo;

/* loaded from: classes6.dex */
public interface InstanceCreator<T> {
    T getInstance();

    <S> void set(S s, PropertyModel<S> propertyModel);
}
