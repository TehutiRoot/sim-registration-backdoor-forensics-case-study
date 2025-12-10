package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;

/* loaded from: classes6.dex */
public class Caverphone1 extends AbstractCaverphone {
    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null || str.isEmpty()) {
            return "111111";
        }
        String replace = str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replace("cq", "2q").replace("ci", "si").replace("ce", "se").replace("cy", "sy").replace("tch", "2ch").replace(OperatorName.CURVE_TO, OperatorName.NON_STROKING_CMYK).replace(OperatorName.SAVE, OperatorName.NON_STROKING_CMYK).replace("x", OperatorName.NON_STROKING_CMYK).replace(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.FILL_NON_ZERO).replace("dg", "2g").replace("tio", "sio").replace("tia", "sia").replace("d", "t").replace("ph", "fh").replace(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "p").replace(OperatorName.SHADING_FILL, "s2").replace("z", OperatorName.CLOSE_AND_STROKE).replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", ExifInterface.GPS_MEASUREMENT_3D).replace("3gh3", "3kh3").replace("gh", "22").replace(OperatorName.NON_STROKING_GRAY, OperatorName.NON_STROKING_CMYK).replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replace("w3", "W3").replace("wy", "Wy").replace("wh3", "Wh3").replace("why", "Why").replace(OperatorName.SET_LINE_WIDTH, "2").replaceAll("^h", "A").replace(OperatorName.CLOSE_PATH, "2").replace("r3", "R3").replace("ry", "Ry").replace(PDPageLabelRange.STYLE_ROMAN_LOWER, "2").replace("l3", "L3").replace("ly", "Ly").replace(OperatorName.LINE_TO, "2").replace(OperatorName.SET_LINE_JOINSTYLE, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT).replace("y3", "Y3").replace(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, "2").replace("2", "").replace(ExifInterface.GPS_MEASUREMENT_3D, "");
        return (replace + "111111").substring(0, 6);
    }
}
