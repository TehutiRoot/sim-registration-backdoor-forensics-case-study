package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;
import org.bson.types.ObjectId;

/* renamed from: PT */
/* loaded from: classes4.dex */
public class C1100PT implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(ObjectId objectId, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeStartObject();
        strictJsonWriter.writeString("$oid", objectId.toHexString());
        strictJsonWriter.writeEndObject();
    }
}
