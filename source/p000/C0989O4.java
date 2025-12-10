package p000;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSNumber;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;

/* renamed from: O4 */
/* loaded from: classes5.dex */
public class C0989O4 {

    /* renamed from: a */
    public float[] f4290a = null;

    /* renamed from: b */
    public boolean f4291b = false;

    /* renamed from: c */
    public float f4292c = 0.0f;

    /* renamed from: a */
    public static C0989O4 m67130a(PDAnnotation pDAnnotation, PDBorderStyleDictionary pDBorderStyleDictionary) {
        C0989O4 c0989o4 = new C0989O4();
        if (pDBorderStyleDictionary == null) {
            COSArray border = pDAnnotation.getBorder();
            if (border.size() >= 3 && (border.getObject(2) instanceof COSNumber)) {
                c0989o4.f4292c = ((COSNumber) border.getObject(2)).floatValue();
            }
            if (border.size() > 3) {
                COSBase object = border.getObject(3);
                if (object instanceof COSArray) {
                    c0989o4.f4290a = ((COSArray) object).toFloatArray();
                }
            }
        } else {
            c0989o4.f4292c = pDBorderStyleDictionary.getWidth();
            if (pDBorderStyleDictionary.getStyle().equals("D")) {
                c0989o4.f4290a = pDBorderStyleDictionary.getDashStyle().getDashArray();
            }
            if (pDBorderStyleDictionary.getStyle().equals(PDBorderStyleDictionary.STYLE_UNDERLINE)) {
                c0989o4.f4291b = true;
            }
        }
        float[] fArr = c0989o4.f4290a;
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
                    c0989o4.f4290a = null;
                    break;
                }
            }
        }
        return c0989o4;
    }
}
