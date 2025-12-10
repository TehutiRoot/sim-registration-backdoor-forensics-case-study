package p000;

import org.bson.BsonUndefined;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: gH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20015gH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonUndefined bsonUndefined, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw("undefined");
    }
}
