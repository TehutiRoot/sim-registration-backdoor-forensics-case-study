package org.apache.commons.codec.language;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.bouncycastle.asn1.eac.EACTags;
import th.p047co.dtac.android.dtacone.view.fragment.customerenquiry.CustomerEnquiry700MhzFragment;

/* loaded from: classes6.dex */
public class Metaphone implements StringEncoder {

    /* renamed from: a */
    public int f73150a = 4;

    /* renamed from: a */
    public final boolean m25518a(int i, int i2) {
        return i2 + 1 == i;
    }

    /* renamed from: b */
    public final boolean m25517b(StringBuilder sb, int i, char c) {
        if (i < 0 || i >= sb.length() - 1 || sb.charAt(i + 1) != c) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m25516c(StringBuilder sb, int i, char c) {
        if (i <= 0 || i >= sb.length() || sb.charAt(i - 1) != c) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean m25515d(StringBuilder sb, int i) {
        if ("AEIOU".indexOf(sb.charAt(i)) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m25514e(StringBuilder sb, int i, String str) {
        if (i >= 0 && (str.length() + i) - 1 < sb.length()) {
            return sb.substring(i, str.length() + i).equals(str);
        }
        return false;
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return metaphone((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public int getMaxCodeLen() {
        return this.f73150a;
    }

    public boolean isMetaphoneEqual(String str, String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    public String metaphone(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            if (length == 1) {
                return str.toUpperCase(Locale.ENGLISH);
            }
            char[] charArray = str.toUpperCase(Locale.ENGLISH).toCharArray();
            StringBuilder sb = new StringBuilder(40);
            StringBuilder sb2 = new StringBuilder(10);
            int i = 0;
            char c = charArray[0];
            if (c != 'A') {
                if (c != 'G' && c != 'K' && c != 'P') {
                    if (c != 'W') {
                        if (c != 'X') {
                            sb.append(charArray);
                        } else {
                            charArray[0] = 'S';
                            sb.append(charArray);
                        }
                    } else {
                        char c2 = charArray[1];
                        if (c2 == 'R') {
                            sb.append(charArray, 1, charArray.length - 1);
                        } else if (c2 == 'H') {
                            sb.append(charArray, 1, charArray.length - 1);
                            sb.setCharAt(0, 'W');
                        } else {
                            sb.append(charArray);
                        }
                    }
                } else if (charArray[1] == 'N') {
                    sb.append(charArray, 1, charArray.length - 1);
                } else {
                    sb.append(charArray);
                }
            } else if (charArray[1] == 'E') {
                sb.append(charArray, 1, charArray.length - 1);
            } else {
                sb.append(charArray);
            }
            int length2 = sb.length();
            while (sb2.length() < getMaxCodeLen() && i < length2) {
                char charAt = sb.charAt(i);
                if (charAt == 'C' || !m25516c(sb, i, charAt)) {
                    switch (charAt) {
                        case EACTags.ELEMENT_LIST /* 65 */:
                        case EACTags.DISPLAY_IMAGE /* 69 */:
                        case 'I':
                        case 'O':
                        case CustomerEnquiry700MhzFragment.hiddenSubProdHeight /* 85 */:
                            if (i == 0) {
                                sb2.append(charAt);
                                break;
                            }
                            break;
                        case EACTags.ADDRESS /* 66 */:
                            if (!m25516c(sb, i, 'M') || !m25518a(length2, i)) {
                                sb2.append(charAt);
                                break;
                            }
                            break;
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            if (!m25516c(sb, i, 'S') || m25518a(length2, i) || "EIY".indexOf(sb.charAt(i + 1)) < 0) {
                                if (m25514e(sb, i, "CIA")) {
                                    sb2.append('X');
                                    break;
                                } else if (!m25518a(length2, i) && "EIY".indexOf(sb.charAt(i + 1)) >= 0) {
                                    sb2.append('S');
                                    break;
                                } else if (m25516c(sb, i, 'S') && m25517b(sb, i, 'H')) {
                                    sb2.append('K');
                                    break;
                                } else if (m25517b(sb, i, 'H') && (i != 0 || length2 < 3 || !m25515d(sb, 2))) {
                                    sb2.append('X');
                                    break;
                                } else {
                                    sb2.append('K');
                                    break;
                                }
                            }
                            break;
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            if (!m25518a(length2, i + 1) && m25517b(sb, i, 'G')) {
                                int i2 = i + 2;
                                if ("EIY".indexOf(sb.charAt(i2)) >= 0) {
                                    sb2.append('J');
                                    i = i2;
                                    break;
                                }
                            }
                            sb2.append('T');
                            break;
                        case 'F':
                        case 'J':
                        case 'L':
                        case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                        case 'N':
                        case EACTags.HISTORICAL_BYTES /* 82 */:
                            sb2.append(charAt);
                            break;
                        case EACTags.MESSAGE_REFERENCE /* 71 */:
                            int i3 = i + 1;
                            if ((!m25518a(length2, i3) || !m25517b(sb, i, 'H')) && ((m25518a(length2, i3) || !m25517b(sb, i, 'H') || m25515d(sb, i + 2)) && (i <= 0 || (!m25514e(sb, i, "GN") && !m25514e(sb, i, "GNED"))))) {
                                boolean m25516c = m25516c(sb, i, 'G');
                                if (!m25518a(length2, i) && "EIY".indexOf(sb.charAt(i3)) >= 0 && !m25516c) {
                                    sb2.append('J');
                                    break;
                                } else {
                                    sb2.append('K');
                                    break;
                                }
                            }
                            break;
                        case 'H':
                            if (!m25518a(length2, i) && ((i <= 0 || "CSPTG".indexOf(sb.charAt(i - 1)) < 0) && m25515d(sb, i + 1))) {
                                sb2.append('H');
                                break;
                            }
                            break;
                        case 'K':
                            if (i > 0) {
                                if (!m25516c(sb, i, 'C')) {
                                    sb2.append(charAt);
                                    break;
                                }
                            } else {
                                sb2.append(charAt);
                                break;
                            }
                            break;
                        case 'P':
                            if (m25517b(sb, i, 'H')) {
                                sb2.append('F');
                                break;
                            } else {
                                sb2.append(charAt);
                                break;
                            }
                        case EACTags.ANSWER_TO_RESET /* 81 */:
                            sb2.append('K');
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 83 */:
                            if (!m25514e(sb, i, "SH") && !m25514e(sb, i, "SIO") && !m25514e(sb, i, "SIA")) {
                                sb2.append('S');
                                break;
                            } else {
                                sb2.append('X');
                                break;
                            }
                        case 'T':
                            if (!m25514e(sb, i, "TIA") && !m25514e(sb, i, "TIO")) {
                                if (!m25514e(sb, i, "TCH")) {
                                    if (m25514e(sb, i, StandardStructureTypes.f60295TH)) {
                                        sb2.append('0');
                                        break;
                                    } else {
                                        sb2.append('T');
                                        break;
                                    }
                                }
                            } else {
                                sb2.append('X');
                                break;
                            }
                            break;
                        case 'V':
                            sb2.append('F');
                            break;
                        case 'W':
                        case 'Y':
                            if (!m25518a(length2, i) && m25515d(sb, i + 1)) {
                                sb2.append(charAt);
                                break;
                            }
                            break;
                        case SyslogConstants.LOG_FTP /* 88 */:
                            sb2.append('K');
                            sb2.append('S');
                            break;
                        case 'Z':
                            sb2.append('S');
                            break;
                    }
                }
                i++;
                if (sb2.length() > getMaxCodeLen()) {
                    sb2.setLength(getMaxCodeLen());
                }
            }
            return sb2.toString();
        }
        return "";
    }

    public void setMaxCodeLen(int i) {
        this.f73150a = i;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return metaphone(str);
    }
}
