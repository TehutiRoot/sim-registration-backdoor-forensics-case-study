package com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes5.dex */
public enum PDTransitionDirection {
    LEFT_TO_RIGHT(0),
    BOTTOM_TO_TOP(90),
    RIGHT_TO_LEFT(BitmapUtil.IMAGE_180_DEGREE),
    TOP_TO_BOTTOM(BitmapUtil.IMAGE_270_DEGREE),
    TOP_LEFT_TO_BOTTOM_RIGHT(315),
    NONE(0) { // from class: com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.1
        @Override // com.tom_roush.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection
        public COSBase getCOSBase() {
            return COSName.NONE;
        }
    };
    
    private final int degrees;

    public COSBase getCOSBase() {
        return COSInteger.get(this.degrees);
    }

    PDTransitionDirection(int i) {
        this.degrees = i;
    }
}
