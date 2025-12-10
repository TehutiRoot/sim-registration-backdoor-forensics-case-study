package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import androidx.annotation.Nullable;
import com.airbnb.lottie.animation.content.ShapeModifierContent;
import com.airbnb.lottie.model.content.ShapeData;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.value.Keyframe;
import java.util.List;

/* loaded from: classes3.dex */
public class ShapeKeyframeAnimation extends BaseKeyframeAnimation<ShapeData, Path> {

    /* renamed from: g */
    public final ShapeData f41196g;

    /* renamed from: h */
    public final Path f41197h;

    /* renamed from: i */
    public List f41198i;

    public ShapeKeyframeAnimation(List<Keyframe<ShapeData>> list) {
        super(list);
        this.f41196g = new ShapeData();
        this.f41197h = new Path();
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public /* bridge */ /* synthetic */ Object getValue(Keyframe keyframe, float f) {
        return getValue((Keyframe<ShapeData>) keyframe, f);
    }

    public void setShapeModifiers(@Nullable List<ShapeModifierContent> list) {
        this.f41198i = list;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public Path getValue(Keyframe<ShapeData> keyframe, float f) {
        this.f41196g.interpolateBetween(keyframe.startValue, keyframe.endValue, f);
        ShapeData shapeData = this.f41196g;
        List list = this.f41198i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                shapeData = ((ShapeModifierContent) this.f41198i.get(size)).modifyShape(shapeData);
            }
        }
        MiscUtils.getPathFromData(shapeData, this.f41197h);
        return this.f41197h;
    }
}
