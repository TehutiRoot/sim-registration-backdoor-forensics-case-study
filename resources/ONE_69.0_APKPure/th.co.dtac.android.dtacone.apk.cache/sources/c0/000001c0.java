package p000;

import java.util.ArrayList;
import java.util.List;
import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.C12922b;
import org.bson.codecs.pojo.PropertyCodecProvider;
import org.bson.codecs.pojo.PropertyCodecRegistry;
import org.bson.codecs.pojo.TypeWithTypeParameters;

/* renamed from: Bp1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17393Bp1 implements PropertyCodecRegistry {

    /* renamed from: a */
    public final List f553a;

    public C17393Bp1(AbstractC18163Nl1 abstractC18163Nl1, CodecRegistry codecRegistry, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C10018cs());
        arrayList.add(new C12922b());
        arrayList.add(new C0729KS(codecRegistry));
        arrayList.add(new C5438cW(abstractC18163Nl1, codecRegistry));
        this.f553a = arrayList;
    }

    @Override // org.bson.codecs.pojo.PropertyCodecRegistry
    public Codec get(TypeWithTypeParameters typeWithTypeParameters) {
        for (PropertyCodecProvider propertyCodecProvider : this.f553a) {
            Codec codec = propertyCodecProvider.get(typeWithTypeParameters, this);
            if (codec != null) {
                return codec;
            }
        }
        return null;
    }
}