package p000;

import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ta */
/* loaded from: classes3.dex */
public abstract class AbstractC14009ta implements AnimatableValue {

    /* renamed from: a */
    public final List f80142a;

    public AbstractC14009ta(Object obj) {
        this(Collections.singletonList(new Keyframe(obj)));
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List getKeyframes() {
        return this.f80142a;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        if (this.f80142a.isEmpty()) {
            return true;
        }
        if (this.f80142a.size() == 1 && ((Keyframe) this.f80142a.get(0)).isStatic()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f80142a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f80142a.toArray()));
        }
        return sb.toString();
    }

    public AbstractC14009ta(List list) {
        this.f80142a = list;
    }
}
