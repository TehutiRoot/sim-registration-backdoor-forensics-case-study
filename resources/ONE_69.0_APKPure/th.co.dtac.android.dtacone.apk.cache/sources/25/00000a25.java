package p000;

import org.bson.BsonBinary;
import org.bson.internal.Base64;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: Ki0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17958Ki0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonBinary bsonBinary, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeString("$binary", Base64.encode(bsonBinary.getData()));
        strictJsonWriter.writeString("$type", String.format("%02X", Byte.valueOf(bsonBinary.getType())));
        strictJsonWriter.writeEndObject();
    }
}