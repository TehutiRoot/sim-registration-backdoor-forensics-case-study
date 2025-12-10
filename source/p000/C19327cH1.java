package p000;

import org.bson.BsonMinKey;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: cH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19327cH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonMinKey bsonMinKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw("MinKey");
    }
}
