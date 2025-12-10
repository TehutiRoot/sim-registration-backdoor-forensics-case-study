package io.fotoapparat.view;

import android.graphics.Rect;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.fotoapparat.parameter.Resolution;
import io.fotoapparat.parameter.ScaleType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m28850d2 = {"Landroid/view/ViewGroup;", "Lio/fotoapparat/parameter/Resolution;", "previewResolution", "Lio/fotoapparat/parameter/ScaleType;", "scaleType", "", "d", "(Landroid/view/ViewGroup;Lio/fotoapparat/parameter/Resolution;Lio/fotoapparat/parameter/ScaleType;)Lkotlin/Unit;", Promotion.ACTION_VIEW, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lio/fotoapparat/parameter/Resolution;Landroid/view/ViewGroup;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "e", "Landroid/graphics/Rect;", "rect", OperatorName.CURVE_TO, "(Landroid/view/ViewGroup;Landroid/graphics/Rect;)V", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCameraView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraView.kt\nio/fotoapparat/view/CameraViewKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 CameraView.kt\nio/fotoapparat/view/CameraViewKt\n*L\n156#1:166,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CameraViewKt {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes5.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScaleType.values().length];
            try {
                iArr[ScaleType.CenterInside.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScaleType.CenterCrop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScaleType.TopCrop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: a */
    public static final void m30470a(Resolution resolution, ViewGroup viewGroup) {
        float max = Math.max(viewGroup.getMeasuredWidth() / resolution.width, viewGroup.getMeasuredHeight() / resolution.height);
        int i = (int) (resolution.width * max);
        int i2 = (int) (resolution.height * max);
        int max2 = Math.max(0, i - viewGroup.getMeasuredWidth());
        int max3 = Math.max(0, i2 - viewGroup.getMeasuredHeight());
        m30468c(viewGroup, new Rect((-max2) / 2, (-max3) / 2, i - (max2 / 2), i2 - (max3 / 2)));
    }

    /* renamed from: b */
    public static final void m30469b(Resolution resolution, ViewGroup viewGroup) {
        float min = Math.min(viewGroup.getMeasuredWidth() / resolution.width, viewGroup.getMeasuredHeight() / resolution.height);
        int i = (int) (resolution.width * min);
        int i2 = (int) (resolution.height * min);
        int max = Math.max(0, viewGroup.getMeasuredWidth() - i) / 2;
        int max2 = Math.max(0, viewGroup.getMeasuredHeight() - i2) / 2;
        m30468c(viewGroup, new Rect(max, max2, i + max, i2 + max2));
    }

    /* renamed from: c */
    public static final void m30468c(ViewGroup viewGroup, Rect rect) {
        Iterator<Integer> it = AbstractC11719c.until(0, viewGroup.getChildCount()).iterator();
        while (it.hasNext()) {
            viewGroup.getChildAt(((IntIterator) it).nextInt()).layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    /* renamed from: d */
    public static final Unit m30467d(ViewGroup viewGroup, Resolution resolution, ScaleType scaleType) {
        int i;
        if (scaleType == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || resolution == null) {
                    return null;
                }
                m30466e(resolution, viewGroup);
                return Unit.INSTANCE;
            } else if (resolution == null) {
                return null;
            } else {
                m30470a(resolution, viewGroup);
                return Unit.INSTANCE;
            }
        } else if (resolution == null) {
            return null;
        } else {
            m30469b(resolution, viewGroup);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public static final void m30466e(Resolution resolution, ViewGroup viewGroup) {
        float max = Math.max(viewGroup.getMeasuredWidth() / resolution.width, viewGroup.getMeasuredHeight() / resolution.height);
        int i = (int) (resolution.width * max);
        int max2 = Math.max(0, i - viewGroup.getMeasuredWidth());
        m30468c(viewGroup, new Rect((-max2) / 2, 0, i - (max2 / 2), (int) (resolution.height * max)));
    }
}
