package p000;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.tom_roush.fontbox.afm.AFMParser;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.ArrayList;
import java.util.List;

/* renamed from: LL */
/* loaded from: classes5.dex */
public final class C0798LL {

    /* renamed from: a */
    public final List f3447a = new ArrayList();

    /* renamed from: b */
    public final List f3448b = new ArrayList();

    /* renamed from: a */
    public final void m67530a(int[] iArr, String str) {
        this.f3447a.add(iArr);
        this.f3448b.add(str);
    }

    /* renamed from: b */
    public final synchronized void m67529b() {
        if (!this.f3447a.isEmpty()) {
            return;
        }
        m67530a(new int[]{0, 19}, "US/CA");
        m67530a(new int[]{30, 39}, "US");
        m67530a(new int[]{60, 139}, "US/CA");
        m67530a(new int[]{300, 379}, "FR");
        m67530a(new int[]{380}, "BG");
        m67530a(new int[]{383}, "SI");
        m67530a(new int[]{385}, "HR");
        m67530a(new int[]{387}, "BA");
        m67530a(new int[]{400, 440}, "DE");
        m67530a(new int[]{450, 459}, "JP");
        m67530a(new int[]{460, 469}, "RU");
        m67530a(new int[]{471}, "TW");
        m67530a(new int[]{474}, "EE");
        m67530a(new int[]{475}, "LV");
        m67530a(new int[]{476}, "AZ");
        m67530a(new int[]{477}, "LT");
        m67530a(new int[]{478}, "UZ");
        m67530a(new int[]{479}, "LK");
        m67530a(new int[]{480}, "PH");
        m67530a(new int[]{481}, "BY");
        m67530a(new int[]{482}, "UA");
        m67530a(new int[]{484}, "MD");
        m67530a(new int[]{485}, "AM");
        m67530a(new int[]{486}, "GE");
        m67530a(new int[]{487}, "KZ");
        m67530a(new int[]{489}, "HK");
        m67530a(new int[]{490, 499}, "JP");
        m67530a(new int[]{500, 509}, "GB");
        m67530a(new int[]{520}, "GR");
        m67530a(new int[]{528}, ExpandedProductParsedResult.POUND);
        m67530a(new int[]{529}, "CY");
        m67530a(new int[]{531}, "MK");
        m67530a(new int[]{535}, "MT");
        m67530a(new int[]{539}, "IE");
        m67530a(new int[]{540, 549}, "BE/LU");
        m67530a(new int[]{560}, "PT");
        m67530a(new int[]{569}, "IS");
        m67530a(new int[]{570, 579}, "DK");
        m67530a(new int[]{590}, "PL");
        m67530a(new int[]{594}, "RO");
        m67530a(new int[]{599}, "HU");
        m67530a(new int[]{600, 601}, "ZA");
        m67530a(new int[]{TypedValues.MotionType.TYPE_EASING}, "GH");
        m67530a(new int[]{TypedValues.MotionType.TYPE_DRAW_PATH}, "BH");
        m67530a(new int[]{TypedValues.MotionType.TYPE_POLAR_RELATIVETO}, "MU");
        m67530a(new int[]{TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, "MA");
        m67530a(new int[]{613}, "DZ");
        m67530a(new int[]{616}, "KE");
        m67530a(new int[]{618}, "CI");
        m67530a(new int[]{619}, "TN");
        m67530a(new int[]{621}, "SY");
        m67530a(new int[]{622}, "EG");
        m67530a(new int[]{624}, "LY");
        m67530a(new int[]{625}, "JO");
        m67530a(new int[]{626}, "IR");
        m67530a(new int[]{627}, "KW");
        m67530a(new int[]{628}, "SA");
        m67530a(new int[]{629}, "AE");
        m67530a(new int[]{640, 649}, "FI");
        m67530a(new int[]{690, 695}, "CN");
        m67530a(new int[]{700, 709}, "NO");
        m67530a(new int[]{729}, "IL");
        m67530a(new int[]{730, 739}, "SE");
        m67530a(new int[]{740}, "GT");
        m67530a(new int[]{741}, "SV");
        m67530a(new int[]{742}, "HN");
        m67530a(new int[]{743}, "NI");
        m67530a(new int[]{744}, "CR");
        m67530a(new int[]{745}, "PA");
        m67530a(new int[]{746}, "DO");
        m67530a(new int[]{750}, "MX");
        m67530a(new int[]{754, 755}, "CA");
        m67530a(new int[]{759}, "VE");
        m67530a(new int[]{760, 769}, AFMParser.CHARMETRICS_CH);
        m67530a(new int[]{770}, "CO");
        m67530a(new int[]{773}, "UY");
        m67530a(new int[]{775}, "PE");
        m67530a(new int[]{777}, "BO");
        m67530a(new int[]{779}, "AR");
        m67530a(new int[]{780}, "CL");
        m67530a(new int[]{784}, "PY");
        m67530a(new int[]{785}, "PE");
        m67530a(new int[]{786}, "EC");
        m67530a(new int[]{789, 790}, "BR");
        m67530a(new int[]{800, 839}, "IT");
        m67530a(new int[]{840, 849}, "ES");
        m67530a(new int[]{850}, "CU");
        m67530a(new int[]{858}, "SK");
        m67530a(new int[]{859}, "CZ");
        m67530a(new int[]{860}, "YU");
        m67530a(new int[]{865}, "MN");
        m67530a(new int[]{867}, AFMParser.KERN_PAIR_KP);
        m67530a(new int[]{868, 869}, StandardStructureTypes.f60296TR);
        m67530a(new int[]{870, 879}, "NL");
        m67530a(new int[]{880}, "KR");
        m67530a(new int[]{885}, StandardStructureTypes.f60295TH);
        m67530a(new int[]{888}, "SG");
        m67530a(new int[]{890}, "IN");
        m67530a(new int[]{893}, "VN");
        m67530a(new int[]{896}, "PK");
        m67530a(new int[]{899}, OperatorName.BEGIN_INLINE_IMAGE_DATA);
        m67530a(new int[]{900, 919}, "AT");
        m67530a(new int[]{930, 939}, "AU");
        m67530a(new int[]{940, 949}, "AZ");
        m67530a(new int[]{955}, "MY");
        m67530a(new int[]{958}, "MO");
    }

    /* renamed from: c */
    public String m67528c(String str) {
        int[] iArr;
        int i;
        m67529b();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f3447a.size();
        for (int i2 = 0; i2 < size && parseInt >= (i = (iArr = (int[]) this.f3447a.get(i2))[0]); i2++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (parseInt <= i) {
                return (String) this.f3448b.get(i2);
            }
        }
        return null;
    }
}
