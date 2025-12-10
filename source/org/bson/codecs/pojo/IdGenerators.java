package org.bson.codecs.pojo;

import org.bson.BsonObjectId;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public final class IdGenerators {
    public static final IdGenerator<ObjectId> OBJECT_ID_GENERATOR = new C12917a();
    public static final IdGenerator<BsonObjectId> BSON_OBJECT_ID_GENERATOR = new C12918b();

    /* renamed from: org.bson.codecs.pojo.IdGenerators$a */
    /* loaded from: classes6.dex */
    public class C12917a implements IdGenerator {
        @Override // org.bson.codecs.pojo.IdGenerator
        /* renamed from: a */
        public ObjectId generate() {
            return new ObjectId();
        }

        @Override // org.bson.codecs.pojo.IdGenerator
        public Class getType() {
            return ObjectId.class;
        }
    }

    /* renamed from: org.bson.codecs.pojo.IdGenerators$b */
    /* loaded from: classes6.dex */
    public class C12918b implements IdGenerator {
        @Override // org.bson.codecs.pojo.IdGenerator
        /* renamed from: a */
        public BsonObjectId generate() {
            return new BsonObjectId();
        }

        @Override // org.bson.codecs.pojo.IdGenerator
        public Class getType() {
            return BsonObjectId.class;
        }
    }
}
