package org.bson.codecs;

import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class ObjectIdGenerator implements IdGenerator {
    @Override // org.bson.codecs.IdGenerator
    public Object generate() {
        return new ObjectId();
    }
}
