package p000;

import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: Xg0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18751Xg0 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(Boolean bool, StrictJsonWriter strictJsonWriter) {
        strictJsonWriter.writeBoolean(bool.booleanValue());
    }
}
