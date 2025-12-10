package p000;

import org.bson.codecs.pojo.PropertySerialization;

/* renamed from: Ep1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17588Ep1 implements PropertySerialization {
    @Override // org.bson.codecs.pojo.PropertySerialization
    public boolean shouldSerialize(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }
}