package org.bson.codecs.pojo;

/* loaded from: classes6.dex */
public interface IdGenerator<T> {
    T generate();

    Class<T> getType();
}
