package p000;

import org.bson.BsonMaxKey;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: YH1 */
/* loaded from: classes4.dex */
public class YH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonMaxKey bsonMaxKey, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw("MaxKey");
    }
}