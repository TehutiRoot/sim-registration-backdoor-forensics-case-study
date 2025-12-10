package p000;

import org.bson.BsonTimestamp;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: cI1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19378cI1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonTimestamp bsonTimestamp, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw(String.format("Timestamp(%d, %d)", Integer.valueOf(bsonTimestamp.getTime()), Integer.valueOf(bsonTimestamp.getInc())));
    }
}