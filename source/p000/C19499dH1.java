package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;
import org.bson.types.ObjectId;

/* renamed from: dH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19499dH1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(ObjectId objectId, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeRaw(String.format("ObjectId(\"%s\")", objectId.toHexString()));
    }
}
