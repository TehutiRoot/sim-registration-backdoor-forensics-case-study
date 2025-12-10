package p000;

import org.bson.BsonNull;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: qh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21861qh0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonNull bsonNull, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeNull();
    }
}