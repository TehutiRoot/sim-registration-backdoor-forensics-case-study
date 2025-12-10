package p000;

import org.bson.BsonMinKey;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: ZH1 */
/* loaded from: classes4.dex */
public class ZH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonMinKey bsonMinKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw("MinKey");
    }
}