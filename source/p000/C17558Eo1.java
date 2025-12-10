package p000;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.C12922b;
import org.bson.codecs.pojo.PropertyCodecProvider;
import org.bson.codecs.pojo.PropertyCodecRegistry;
import org.bson.codecs.pojo.TypeWithTypeParameters;

/* renamed from: Eo1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17558Eo1 implements PropertyCodecRegistry {

    /* renamed from: a */
    public final List f1421a;

    public C17558Eo1(AbstractC18316Qk1 abstractC18316Qk1, CodecRegistry codecRegistry, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C10029cs());
        arrayList.add(new C12922b());
        arrayList.add(new C0456GS(codecRegistry));
        arrayList.add(new C1761YV(abstractC18316Qk1, codecRegistry));
        this.f1421a = arrayList;
    }

    @Override // org.bson.codecs.pojo.PropertyCodecRegistry
    public Codec get(TypeWithTypeParameters typeWithTypeParameters) {
        for (PropertyCodecProvider propertyCodecProvider : this.f1421a) {
            Codec codec = propertyCodecProvider.get(typeWithTypeParameters, this);
            if (codec != null) {
                return codec;
            }
        }
        return null;
    }
}
