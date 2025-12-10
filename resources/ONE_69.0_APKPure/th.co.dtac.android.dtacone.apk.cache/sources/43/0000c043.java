package com.tom_roush.fontbox.cff;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary;
import es.dmoral.toasty.BuildConfig;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.math.Primes;
import th.p047co.dtac.android.dtacone.adapter.report.DetailProfitReportAdapter;
import th.p047co.dtac.android.dtacone.util.MapLocation;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public final class CFFISOAdobeCharset extends CFFCharset {

    /* renamed from: g */
    public static final Object[][] f59268g;

    /* renamed from: h */
    public static final CFFISOAdobeCharset f59269h;

    static {
        Object[][] objArr = {new Object[]{0, ".notdef"}, new Object[]{1, "space"}, new Object[]{2, "exclam"}, new Object[]{3, "quotedbl"}, new Object[]{4, "numbersign"}, new Object[]{5, "dollar"}, new Object[]{6, "percent"}, new Object[]{7, "ampersand"}, new Object[]{8, "quoteright"}, new Object[]{9, "parenleft"}, new Object[]{10, "parenright"}, new Object[]{11, "asterisk"}, new Object[]{12, "plus"}, new Object[]{13, "comma"}, new Object[]{14, "hyphen"}, new Object[]{15, TypedValues.CycleType.S_WAVE_PERIOD}, new Object[]{16, "slash"}, new Object[]{17, "zero"}, new Object[]{18, "one"}, new Object[]{19, "two"}, new Object[]{20, "three"}, new Object[]{21, "four"}, new Object[]{22, "five"}, new Object[]{23, "six"}, new Object[]{24, "seven"}, new Object[]{25, "eight"}, new Object[]{26, "nine"}, new Object[]{27, "colon"}, new Object[]{28, "semicolon"}, new Object[]{29, "less"}, new Object[]{30, "equal"}, new Object[]{31, "greater"}, new Object[]{32, "question"}, new Object[]{33, "at"}, new Object[]{34, "A"}, new Object[]{35, "B"}, new Object[]{36, "C"}, new Object[]{37, "D"}, new Object[]{38, ExifInterface.LONGITUDE_EAST}, new Object[]{39, "F"}, new Object[]{40, OperatorName.STROKING_COLOR_GRAY}, new Object[]{41, "H"}, new Object[]{42, "I"}, new Object[]{43, OperatorName.SET_LINE_CAPSTYLE}, new Object[]{44, "K"}, new Object[]{45, "L"}, new Object[]{46, "M"}, new Object[]{47, "N"}, new Object[]{48, PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE}, new Object[]{49, "P"}, new Object[]{50, OperatorName.RESTORE}, new Object[]{51, "R"}, new Object[]{52, "S"}, new Object[]{53, "T"}, new Object[]{54, PDBorderStyleDictionary.STYLE_UNDERLINE}, new Object[]{55, ExifInterface.GPS_MEASUREMENT_INTERRUPTED}, new Object[]{56, "W"}, new Object[]{57, "X"}, new Object[]{58, "Y"}, new Object[]{59, "Z"}, new Object[]{60, "bracketleft"}, new Object[]{61, "backslash"}, new Object[]{62, "bracketright"}, new Object[]{63, "asciicircum"}, new Object[]{64, "underscore"}, new Object[]{65, "quoteleft"}, new Object[]{66, PDPageLabelRange.STYLE_LETTERS_LOWER}, new Object[]{67, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE}, new Object[]{68, OperatorName.CURVE_TO}, new Object[]{69, "d"}, new Object[]{70, "e"}, new Object[]{71, OperatorName.FILL_NON_ZERO}, new Object[]{72, OperatorName.NON_STROKING_GRAY}, new Object[]{73, OperatorName.CLOSE_PATH}, new Object[]{74, "i"}, new Object[]{75, OperatorName.SET_LINE_JOINSTYLE}, new Object[]{76, OperatorName.NON_STROKING_CMYK}, new Object[]{77, OperatorName.LINE_TO}, new Object[]{78, OperatorName.MOVE_TO}, new Object[]{79, OperatorName.ENDPATH}, new Object[]{80, "o"}, new Object[]{81, "p"}, new Object[]{82, OperatorName.SAVE}, new Object[]{83, PDPageLabelRange.STYLE_ROMAN_LOWER}, new Object[]{84, OperatorName.CLOSE_AND_STROKE}, new Object[]{85, "t"}, new Object[]{86, "u"}, new Object[]{87, OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT}, new Object[]{88, OperatorName.SET_LINE_WIDTH}, new Object[]{89, "x"}, new Object[]{90, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT}, new Object[]{91, "z"}, new Object[]{92, "braceleft"}, new Object[]{93, "bar"}, new Object[]{94, "braceright"}, new Object[]{95, "asciitilde"}, new Object[]{96, "exclamdown"}, new Object[]{97, "cent"}, new Object[]{98, "sterling"}, new Object[]{99, "fraction"}, new Object[]{100, "yen"}, new Object[]{101, "florin"}, new Object[]{102, "section"}, new Object[]{103, FirebaseAnalytics.Param.CURRENCY}, new Object[]{104, "quotesingle"}, new Object[]{105, "quotedblleft"}, new Object[]{106, "guillemotleft"}, new Object[]{107, "guilsinglleft"}, new Object[]{Integer.valueOf((int) AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR), "guilsinglright"}, new Object[]{109, "fi"}, new Object[]{110, "fl"}, new Object[]{111, "endash"}, new Object[]{112, "dagger"}, new Object[]{113, "daggerdbl"}, new Object[]{114, "periodcentered"}, new Object[]{115, "paragraph"}, new Object[]{116, "bullet"}, new Object[]{117, "quotesinglbase"}, new Object[]{118, "quotedblbase"}, new Object[]{119, "quotedblright"}, new Object[]{120, "guillemotright"}, new Object[]{121, "ellipsis"}, new Object[]{122, "perthousand"}, new Object[]{Integer.valueOf((int) CameraActivity.REQUEST_CODE), "questiondown"}, new Object[]{124, "grave"}, new Object[]{125, "acute"}, new Object[]{Integer.valueOf((int) WebSocketProtocol.PAYLOAD_SHORT), "circumflex"}, new Object[]{127, "tilde"}, new Object[]{128, "macron"}, new Object[]{129, "breve"}, new Object[]{Integer.valueOf((int) BuildConfig.VERSION_CODE), "dotaccent"}, new Object[]{131, "dieresis"}, new Object[]{132, "ring"}, new Object[]{133, "cedilla"}, new Object[]{134, "hungarumlaut"}, new Object[]{135, "ogonek"}, new Object[]{136, "caron"}, new Object[]{137, "emdash"}, new Object[]{138, "AE"}, new Object[]{139, "ordfeminine"}, new Object[]{Integer.valueOf((int) DetailProfitReportAdapter.ViewHolder.hiddenSubProdHeight), "Lslash"}, new Object[]{141, "Oslash"}, new Object[]{142, "OE"}, new Object[]{143, "ordmasculine"}, new Object[]{Integer.valueOf((int) SyslogConstants.LOG_LOCAL2), "ae"}, new Object[]{145, "dotlessi"}, new Object[]{146, "lslash"}, new Object[]{147, "oslash"}, new Object[]{148, "oe"}, new Object[]{149, "germandbls"}, new Object[]{150, "onesuperior"}, new Object[]{151, "logicalnot"}, new Object[]{Integer.valueOf((int) SyslogConstants.LOG_LOCAL3), "mu"}, new Object[]{153, "trademark"}, new Object[]{154, "Eth"}, new Object[]{155, "onehalf"}, new Object[]{156, "plusminus"}, new Object[]{157, "Thorn"}, new Object[]{158, "onequarter"}, new Object[]{159, "divide"}, new Object[]{Integer.valueOf((int) SyslogConstants.LOG_LOCAL4), "brokenbar"}, new Object[]{161, "degree"}, new Object[]{162, "thorn"}, new Object[]{163, "threequarters"}, new Object[]{164, "twosuperior"}, new Object[]{165, "registered"}, new Object[]{166, "minus"}, new Object[]{167, "eth"}, new Object[]{168, "multiply"}, new Object[]{169, "threesuperior"}, new Object[]{170, "copyright"}, new Object[]{171, "Aacute"}, new Object[]{172, "Acircumflex"}, new Object[]{173, "Adieresis"}, new Object[]{174, "Agrave"}, new Object[]{175, "Aring"}, new Object[]{Integer.valueOf((int) SyslogConstants.LOG_LOCAL6), "Atilde"}, new Object[]{177, "Ccedilla"}, new Object[]{178, "Eacute"}, new Object[]{179, "Ecircumflex"}, new Object[]{Integer.valueOf((int) BitmapUtil.IMAGE_180_DEGREE), "Edieresis"}, new Object[]{181, "Egrave"}, new Object[]{182, "Iacute"}, new Object[]{183, "Icircumflex"}, new Object[]{Integer.valueOf((int) SyslogConstants.LOG_LOCAL7), "Idieresis"}, new Object[]{185, "Igrave"}, new Object[]{186, "Ntilde"}, new Object[]{187, "Oacute"}, new Object[]{188, "Ocircumflex"}, new Object[]{189, "Odieresis"}, new Object[]{190, "Ograve"}, new Object[]{191, "Otilde"}, new Object[]{Integer.valueOf((int) CertificateHolderAuthorization.CVCA), "Scaron"}, new Object[]{193, "Uacute"}, new Object[]{194, "Ucircumflex"}, new Object[]{195, "Udieresis"}, new Object[]{196, "Ugrave"}, new Object[]{197, "Yacute"}, new Object[]{198, "Ydieresis"}, new Object[]{Integer.valueOf((int) MapLocation.REQUEST_LOCATION), "Zcaron"}, new Object[]{200, "aacute"}, new Object[]{201, "acircumflex"}, new Object[]{202, "adieresis"}, new Object[]{203, "agrave"}, new Object[]{204, "aring"}, new Object[]{205, "atilde"}, new Object[]{206, "ccedilla"}, new Object[]{207, "eacute"}, new Object[]{208, "ecircumflex"}, new Object[]{209, "edieresis"}, new Object[]{210, "egrave"}, new Object[]{Integer.valueOf((int) Primes.SMALL_FACTOR_LIMIT), "iacute"}, new Object[]{212, "icircumflex"}, new Object[]{213, "idieresis"}, new Object[]{214, "igrave"}, new Object[]{215, "ntilde"}, new Object[]{216, "oacute"}, new Object[]{217, "ocircumflex"}, new Object[]{218, "odieresis"}, new Object[]{219, "ograve"}, new Object[]{220, "otilde"}, new Object[]{221, "scaron"}, new Object[]{222, "uacute"}, new Object[]{223, "ucircumflex"}, new Object[]{224, "udieresis"}, new Object[]{225, "ugrave"}, new Object[]{226, "yacute"}, new Object[]{227, "ydieresis"}, new Object[]{228, "zcaron"}};
        f59268g = objArr;
        f59269h = new CFFISOAdobeCharset();
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object[] objArr2 = objArr[i];
            f59269h.addSID(i2, ((Integer) objArr2[0]).intValue(), objArr2[1].toString());
            i++;
            i2++;
        }
    }

    public CFFISOAdobeCharset() {
        super(false);
    }

    public static CFFISOAdobeCharset getInstance() {
        return f59269h;
    }
}