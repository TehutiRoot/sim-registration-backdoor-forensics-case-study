package p000;

import com.google.firebase.sessions.settings.RemoteSettings;
import org.bson.BsonRegularExpression;
import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

/* renamed from: bI1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19205bI1 implements Converter {
    @Override // org.bson.json.Converter
    /* renamed from: a */
    public void convert(BsonRegularExpression bsonRegularExpression, StrictJsonWriter strictJsonWriter) {
        String replace;
        if (bsonRegularExpression.getPattern().equals("")) {
            replace = "(?:)";
        } else {
            replace = bsonRegularExpression.getPattern().replace(RemoteSettings.FORWARD_SLASH_STRING, "\\/");
        }
        strictJsonWriter.writeRaw(RemoteSettings.FORWARD_SLASH_STRING + replace + RemoteSettings.FORWARD_SLASH_STRING + bsonRegularExpression.getOptions());
    }
}