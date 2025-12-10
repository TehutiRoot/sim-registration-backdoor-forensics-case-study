package p000;

import org.bson.BsonObjectId;
import org.bson.codecs.pojo.ClassModelBuilder;
import org.bson.codecs.pojo.Convention;
import org.bson.codecs.pojo.IdGenerators;
import org.bson.codecs.pojo.PropertyModelBuilder;
import org.bson.types.ObjectId;

/* renamed from: py */
/* loaded from: classes6.dex */
public final class C13150py implements Convention {
    @Override // org.bson.codecs.pojo.Convention
    public void apply(ClassModelBuilder classModelBuilder) {
        PropertyModelBuilder<?> property;
        if (classModelBuilder.getIdGenerator() == null && classModelBuilder.getIdPropertyName() != null && (property = classModelBuilder.getProperty(classModelBuilder.getIdPropertyName())) != null) {
            Class type = property.m24255a().getType();
            if (classModelBuilder.getIdGenerator() == null && type.equals(ObjectId.class)) {
                classModelBuilder.idGenerator(IdGenerators.OBJECT_ID_GENERATOR);
            } else if (classModelBuilder.getIdGenerator() == null && type.equals(BsonObjectId.class)) {
                classModelBuilder.idGenerator(IdGenerators.BSON_OBJECT_ID_GENERATOR);
            }
        }
    }
}
