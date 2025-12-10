package p000;

import org.bson.codecs.pojo.PropertySerialization;

/* renamed from: Ho1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17750Ho1 implements PropertySerialization {
    @Override // org.bson.codecs.pojo.PropertySerialization
    public boolean shouldSerialize(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }
}
