package p000;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;

/* renamed from: O4 */
/* loaded from: classes5.dex */
public class C0978O4 {

    /* renamed from: a */
    public float[] f4355a = null;

    /* renamed from: b */
    public boolean f4356b = false;

    /* renamed from: c */
    public float f4357c = 0.0f;

    /* renamed from: a */
    public static C0978O4 m67156a(PDAnnotation pDAnnotation, PDBorderStyleDictionary pDBorderStyleDictionary) {
        C0978O4 c0978o4 = new C0978O4();
        if (pDBorderStyleDictionary == null) {
            COSArray border = pDAnnotation.getBorder();
            if (border.size() >= 3 && (border.getObject(2) instanceof COSNumber)) {
                c0978o4.f4357c = ((COSNumber) border.getObject(2)).floatValue();
            }
            if (border.size() > 3) {
                COSBase object = border.getObject(3);
                if (object instanceof COSArray) {
                    c0978o4.f4355a = ((COSArray) object).toFloatArray();
                }
            }
        } else {
            c0978o4.f4357c = pDBorderStyleDictionary.getWidth();
            if (pDBorderStyleDictionary.getStyle().equals("D")) {
                c0978o4.f4355a = pDBorderStyleDictionary.getDashStyle().getDashArray();
            }
            if (pDBorderStyleDictionary.getStyle().equals(PDBorderStyleDictionary.STYLE_UNDERLINE)) {
                c0978o4.f4356b = true;
            }
        }
        float[] fArr = c0978o4.f4355a;
        if (fArr != null) {
            int length = fArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (Float.compare(fArr[i], 0.0f) != 0) {
                        break;
                    }
                    i++;
                } else {
                    c0978o4.f4355a = null;
                    break;
                }
            }
        }
        return c0978o4;
    }
}