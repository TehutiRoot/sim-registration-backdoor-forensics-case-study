package p000;

import org.bson.BsonBinary;
import org.bson.internal.Base64;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: UH1 */
/* loaded from: classes4.dex */
public class UH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonBinary bsonBinary, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw(String.format("new BinData(%s, \"%s\")", Integer.toString(bsonBinary.getType() & 255), Base64.encode(bsonBinary.getData())));
    }
}