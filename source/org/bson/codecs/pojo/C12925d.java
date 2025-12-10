package org.bson.codecs.pojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.bson.BsonInvalidOperationException;
import org.bson.BsonReader;
import org.bson.BsonReaderMark;
import org.bson.BsonType;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.TypeData;
import org.bson.diagnostics.Logger;
import org.bson.diagnostics.Loggers;

/* renamed from: org.bson.codecs.pojo.d */
/* loaded from: classes6.dex */
public final class C12925d extends AbstractC18316Qk1 {

    /* renamed from: g */
    public static final Logger f75918g = Loggers.getLogger("PojoCodec");

    /* renamed from: a */
    public final ClassModel f75919a;

    /* renamed from: b */
    public final CodecRegistry f75920b;

    /* renamed from: c */
    public final PropertyCodecRegistry f75921c;

    /* renamed from: d */
    public final C10217fJ f75922d;

    /* renamed from: e */
    public final ConcurrentMap f75923e;

    /* renamed from: f */
    public final boolean f75924f;

    public C12925d(ClassModel classModel, CodecRegistry codecRegistry, List list, C10217fJ c10217fJ) {
        this.f75919a = classModel;
        CodecRegistry fromRegistries = CodecRegistries.fromRegistries(CodecRegistries.fromCodecs(this), codecRegistry);
        this.f75920b = fromRegistries;
        this.f75922d = c10217fJ;
        this.f75923e = new ConcurrentHashMap();
        this.f75921c = new C17558Eo1(this, fromRegistries, list);
        this.f75924f = m24211n(classModel);
        m24210o();
    }

    /* renamed from: n */
    public static boolean m24211n(ClassModel classModel) {
        if (!classModel.hasTypeParameters()) {
            return true;
        }
        for (Map.Entry entry : classModel.m24270d().entrySet()) {
            PropertyModel<?> propertyModel = classModel.getPropertyModel((String) entry.getKey());
            if (((C12928f) entry.getValue()).m24200c() && (propertyModel == null || propertyModel.getCodec() == null)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.AbstractC18316Qk1
    /* renamed from: a */
    public ClassModel mo42a() {
        return this.f75919a;
    }

    /* renamed from: b */
    public final void m24223b(PropertyModel propertyModel) {
        Codec m24209p;
        if (propertyModel.getCodec() != null) {
            m24209p = propertyModel.getCodec();
        } else {
            m24209p = m24209p(propertyModel);
        }
        propertyModel.m24260a(m24209p);
    }

    /* renamed from: c */
    public final boolean m24222c(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return true;
        }
        if (Collection.class.isAssignableFrom(cls) && Collection.class.isAssignableFrom(cls2)) {
            return true;
        }
        if (Map.class.isAssignableFrom(cls) && Map.class.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m24221d(BsonReader bsonReader, DecoderContext decoderContext, InstanceCreator instanceCreator) {
        bsonReader.readStartDocument();
        while (bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
            String readName = bsonReader.readName();
            if (this.f75919a.useDiscriminator() && this.f75919a.getDiscriminatorKey().equals(readName)) {
                bsonReader.readString();
            } else {
                m24220e(bsonReader, decoderContext, instanceCreator, readName, m24214k(this.f75919a, readName));
            }
        }
        bsonReader.readEndDocument();
    }

    @Override // org.bson.codecs.Decoder
    public Object decode(BsonReader bsonReader, DecoderContext decoderContext) {
        if (decoderContext.hasCheckedDiscriminator()) {
            if (this.f75924f) {
                InstanceCreator m24272b = this.f75919a.m24272b();
                m24221d(bsonReader, decoderContext, m24272b);
                return m24272b.getInstance();
            }
            throw new CodecConfigurationException(String.format("%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec.", this.f75919a.getName()));
        }
        return m24216i(bsonReader, this.f75919a.useDiscriminator(), this.f75919a.getDiscriminatorKey(), this.f75920b, this.f75922d, this).decode(bsonReader, DecoderContext.builder().checkedDiscriminator(true).build());
    }

    /* renamed from: e */
    public final void m24220e(BsonReader bsonReader, DecoderContext decoderContext, InstanceCreator instanceCreator, String str, PropertyModel propertyModel) {
        Object decodeWithChildContext;
        if (propertyModel != null) {
            try {
                if (bsonReader.getCurrentBsonType() == BsonType.NULL) {
                    bsonReader.readNull();
                    decodeWithChildContext = null;
                } else {
                    decodeWithChildContext = decoderContext.decodeWithChildContext(propertyModel.m24259b(), bsonReader);
                }
                if (propertyModel.isWritable()) {
                    instanceCreator.set(decodeWithChildContext, propertyModel);
                    return;
                }
                return;
            } catch (BsonInvalidOperationException e) {
                throw new CodecConfigurationException(String.format("Failed to decode '%s'. Decoding '%s' errored with: %s", this.f75919a.getName(), str, e.getMessage()), e);
            } catch (CodecConfigurationException e2) {
                throw new CodecConfigurationException(String.format("Failed to decode '%s'. Decoding '%s' errored with: %s", this.f75919a.getName(), str, e2.getMessage()), e2);
            }
        }
        Logger logger = f75918g;
        if (logger.isTraceEnabled()) {
            logger.trace(String.format("Found property not present in the ClassModel: %s", str));
        }
        bsonReader.skipValue();
    }

    @Override // org.bson.codecs.Encoder
    public void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        if (this.f75924f) {
            if (m24222c(obj.getClass(), this.f75919a.getType())) {
                bsonWriter.writeStartDocument();
                m24219f(bsonWriter, obj, encoderContext, this.f75919a.m24273a());
                if (this.f75919a.useDiscriminator()) {
                    bsonWriter.writeString(this.f75919a.getDiscriminatorKey(), this.f75919a.getDiscriminator());
                }
                for (PropertyModel<?> propertyModel : this.f75919a.getPropertyModels()) {
                    if (!propertyModel.equals(this.f75919a.getIdPropertyModel())) {
                        m24218g(bsonWriter, obj, encoderContext, propertyModel);
                    }
                }
                bsonWriter.writeEndDocument();
                return;
            }
            this.f75920b.get(obj.getClass()).encode(bsonWriter, obj, encoderContext);
            return;
        }
        throw new CodecConfigurationException(String.format("%s contains generic types that have not been specialised.%nTop level classes with generic types are not supported by the PojoCodec.", this.f75919a.getName()));
    }

    /* renamed from: f */
    public final void m24219f(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext, C17267Ac0 c17267Ac0) {
        if (c17267Ac0.m69062d() != null) {
            if (c17267Ac0.m69063c() == null) {
                m24218g(bsonWriter, obj, encoderContext, c17267Ac0.m69062d());
                return;
            }
            Object obj2 = c17267Ac0.m69062d().getPropertyAccessor().get(obj);
            if (obj2 == null && encoderContext.isEncodingCollectibleDocument()) {
                obj2 = c17267Ac0.m69063c().generate();
                try {
                    c17267Ac0.m69062d().getPropertyAccessor().set(obj, obj2);
                } catch (Exception unused) {
                }
            }
            m24217h(bsonWriter, encoderContext, c17267Ac0.m69062d(), obj2);
        }
    }

    /* renamed from: g */
    public final void m24218g(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext, PropertyModel propertyModel) {
        if (propertyModel != null && propertyModel.isReadable()) {
            m24217h(bsonWriter, encoderContext, propertyModel, propertyModel.getPropertyAccessor().get(obj));
        }
    }

    @Override // org.bson.codecs.Encoder
    public Class getEncoderClass() {
        return this.f75919a.getType();
    }

    /* renamed from: h */
    public final void m24217h(BsonWriter bsonWriter, EncoderContext encoderContext, PropertyModel propertyModel, Object obj) {
        if (propertyModel.shouldSerialize(obj)) {
            bsonWriter.writeName(propertyModel.getReadName());
            if (obj == null) {
                bsonWriter.writeNull();
                return;
            }
            try {
                encoderContext.encodeWithChildContext(propertyModel.m24259b(), bsonWriter, obj);
            } catch (CodecConfigurationException e) {
                throw new CodecConfigurationException(String.format("Failed to encode '%s'. Encoding '%s' errored with: %s", this.f75919a.getName(), propertyModel.getReadName(), e.getMessage()), e);
            }
        }
    }

    /* renamed from: i */
    public final Codec m24216i(BsonReader bsonReader, boolean z, String str, CodecRegistry codecRegistry, C10217fJ c10217fJ, Codec codec) {
        if (z) {
            BsonReaderMark mark = bsonReader.getMark();
            bsonReader.readStartDocument();
            boolean z2 = false;
            while (!z2 && bsonReader.readBsonType() != BsonType.END_OF_DOCUMENT) {
                if (str.equals(bsonReader.readName())) {
                    try {
                        codec = codecRegistry.get(c10217fJ.m31322c(bsonReader.readString()));
                        z2 = true;
                    } catch (Exception e) {
                        throw new CodecConfigurationException(String.format("Failed to decode '%s'. Decoding errored with: %s", this.f75919a.getName(), e.getMessage()), e);
                    }
                } else {
                    bsonReader.skipValue();
                }
            }
            mark.reset();
        }
        return codec;
    }

    /* renamed from: j */
    public final Codec m24215j(PropertyModel propertyModel) {
        try {
            return this.f75921c.get(propertyModel.getTypeData());
        } catch (CodecConfigurationException e) {
            return new C23177yi0(propertyModel.getTypeData().getType(), e);
        }
    }

    /* renamed from: k */
    public final PropertyModel m24214k(ClassModel classModel, String str) {
        for (PropertyModel<?> propertyModel : classModel.getPropertyModels()) {
            if (propertyModel.isWritable() && propertyModel.getWriteName().equals(str)) {
                return propertyModel;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final ClassModel m24213l(ClassModel classModel, PropertyModel propertyModel) {
        boolean booleanValue;
        boolean z;
        boolean useDiscriminator;
        if (propertyModel.useDiscriminator() == null) {
            booleanValue = classModel.useDiscriminator();
        } else {
            booleanValue = propertyModel.useDiscriminator().booleanValue();
        }
        boolean z2 = true;
        if (classModel.getDiscriminatorKey() != null && classModel.getDiscriminator() != null) {
            z = true;
        } else {
            z = false;
        }
        z2 = (booleanValue == classModel.useDiscriminator() || !z) ? false : false;
        if (propertyModel.getTypeData().getTypeParameters().isEmpty() && !z2) {
            return classModel;
        }
        ArrayList arrayList = new ArrayList(classModel.getPropertyModels());
        PropertyModel<?> idPropertyModel = classModel.getIdPropertyModel();
        List typeParameters = propertyModel.getTypeData().getTypeParameters();
        for (int i = 0; i < arrayList.size(); i++) {
            PropertyModel propertyModel2 = (PropertyModel) arrayList.get(i);
            String name = propertyModel2.getName();
            C12928f c12928f = (C12928f) classModel.m24270d().get(name);
            if (c12928f.m24200c()) {
                PropertyModel<?> m24212m = m24212m(propertyModel2, c12928f, typeParameters);
                arrayList.set(i, m24212m);
                if (idPropertyModel != null && idPropertyModel.getName().equals(name)) {
                    idPropertyModel = m24212m;
                }
            }
        }
        if (z2) {
            useDiscriminator = propertyModel.useDiscriminator().booleanValue();
        } else {
            useDiscriminator = classModel.useDiscriminator();
        }
        return new ClassModel(classModel.getType(), classModel.m24270d(), classModel.m24271c(), Boolean.valueOf(useDiscriminator), classModel.getDiscriminatorKey(), classModel.getDiscriminator(), C17267Ac0.m69064b(classModel, idPropertyModel), arrayList);
    }

    /* renamed from: m */
    public final PropertyModel m24212m(PropertyModel propertyModel, C12928f c12928f, List list) {
        TypeData build;
        Map m24201b = c12928f.m24201b();
        Integer num = (Integer) m24201b.get(-1);
        if (num != null) {
            build = (TypeData) list.get(num.intValue());
        } else {
            TypeData.Builder m24250b = TypeData.m24250b(propertyModel.getTypeData().getType());
            ArrayList arrayList = new ArrayList(propertyModel.getTypeData().getTypeParameters());
            for (int i = 0; i < arrayList.size(); i++) {
                for (Map.Entry entry : m24201b.entrySet()) {
                    if (((Integer) entry.getKey()).equals(Integer.valueOf(i))) {
                        arrayList.set(i, list.get(((Integer) entry.getValue()).intValue()));
                    }
                }
            }
            m24250b.addTypeParameters(arrayList);
            build = m24250b.build();
        }
        TypeData typeData = build;
        if (propertyModel.getTypeData().equals(typeData)) {
            return propertyModel;
        }
        return new PropertyModel(propertyModel.getName(), propertyModel.getReadName(), propertyModel.getWriteName(), typeData, null, propertyModel.m24257d(), propertyModel.useDiscriminator(), propertyModel.getPropertyAccessor(), propertyModel.m24258c());
    }

    /* renamed from: o */
    public final void m24210o() {
        if (this.f75924f) {
            this.f75923e.put(this.f75919a, this);
            for (PropertyModel<?> propertyModel : this.f75919a.getPropertyModels()) {
                m24223b(propertyModel);
            }
        }
    }

    /* renamed from: p */
    public final Codec m24209p(PropertyModel propertyModel) {
        Codec m24215j = m24215j(propertyModel);
        if (m24215j instanceof AbstractC18316Qk1) {
            ClassModel m24213l = m24213l(((AbstractC18316Qk1) m24215j).mo42a(), propertyModel);
            if (this.f75923e.containsKey(m24213l)) {
                return (Codec) this.f75923e.get(m24213l);
            }
            return new C23349zi0(m24213l, this.f75920b, this.f75921c, this.f75922d, this.f75923e);
        }
        return m24215j;
    }

    public String toString() {
        return String.format("PojoCodec<%s>", this.f75919a);
    }

    public C12925d(ClassModel classModel, CodecRegistry codecRegistry, PropertyCodecRegistry propertyCodecRegistry, C10217fJ c10217fJ, ConcurrentMap concurrentMap, boolean z) {
        this.f75919a = classModel;
        this.f75920b = CodecRegistries.fromRegistries(CodecRegistries.fromCodecs(this), codecRegistry);
        this.f75922d = c10217fJ;
        this.f75923e = concurrentMap;
        this.f75921c = propertyCodecRegistry;
        this.f75924f = z;
        m24210o();
    }
}
