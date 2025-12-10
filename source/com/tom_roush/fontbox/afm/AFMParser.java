package com.tom_roush.fontbox.afm;

import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.fontbox.util.Charsets;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
public class AFMParser {
    public static final String ASCENDER = "Ascender";
    public static final String CAP_HEIGHT = "CapHeight";

    /* renamed from: CC */
    public static final String f59166CC = "CC";
    public static final String CHARACTERS = "Characters";
    public static final String CHARACTER_SET = "CharacterSet";
    public static final String CHARMETRICS_B = "B";
    public static final String CHARMETRICS_C = "C";
    public static final String CHARMETRICS_CH = "CH";
    public static final String CHARMETRICS_L = "L";
    public static final String CHARMETRICS_N = "N";
    public static final String CHARMETRICS_VV = "VV";
    public static final String CHARMETRICS_W = "W";
    public static final String CHARMETRICS_W0 = "W0";
    public static final String CHARMETRICS_W0X = "W0X";
    public static final String CHARMETRICS_W0Y = "W0Y";
    public static final String CHARMETRICS_W1 = "W1";
    public static final String CHARMETRICS_W1X = "W1X";
    public static final String CHARMETRICS_W1Y = "W1Y";
    public static final String CHARMETRICS_WX = "WX";
    public static final String CHARMETRICS_WY = "WY";
    public static final String CHAR_WIDTH = "CharWidth";
    public static final String COMMENT = "Comment";
    public static final String DESCENDER = "Descender";
    public static final String ENCODING_SCHEME = "EncodingScheme";
    public static final String END_CHAR_METRICS = "EndCharMetrics";
    public static final String END_COMPOSITES = "EndComposites";
    public static final String END_FONT_METRICS = "EndFontMetrics";
    public static final String END_KERN_DATA = "EndKernData";
    public static final String END_KERN_PAIRS = "EndKernPairs";
    public static final String END_TRACK_KERN = "EndTrackKern";
    public static final String ESC_CHAR = "EscChar";
    public static final String FAMILY_NAME = "FamilyName";
    public static final String FONT_BBOX = "FontBBox";
    public static final String FONT_NAME = "FontName";
    public static final String FULL_NAME = "FullName";
    public static final String IS_BASE_FONT = "IsBaseFont";
    public static final String IS_FIXED_PITCH = "IsFixedPitch";
    public static final String IS_FIXED_V = "IsFixedV";
    public static final String ITALIC_ANGLE = "ItalicAngle";
    public static final String KERN_PAIR_KP = "KP";
    public static final String KERN_PAIR_KPH = "KPH";
    public static final String KERN_PAIR_KPX = "KPX";
    public static final String KERN_PAIR_KPY = "KPY";
    public static final String MAPPING_SCHEME = "MappingScheme";
    public static final String NOTICE = "Notice";
    public static final String PCC = "PCC";
    public static final String START_CHAR_METRICS = "StartCharMetrics";
    public static final String START_COMPOSITES = "StartComposites";
    public static final String START_FONT_METRICS = "StartFontMetrics";
    public static final String START_KERN_DATA = "StartKernData";
    public static final String START_KERN_PAIRS = "StartKernPairs";
    public static final String START_KERN_PAIRS0 = "StartKernPairs0";
    public static final String START_KERN_PAIRS1 = "StartKernPairs1";
    public static final String START_TRACK_KERN = "StartTrackKern";
    public static final String STD_HW = "StdHW";
    public static final String STD_VW = "StdVW";
    public static final String UNDERLINE_POSITION = "UnderlinePosition";
    public static final String UNDERLINE_THICKNESS = "UnderlineThickness";
    public static final String VERSION = "Version";
    public static final String V_VECTOR = "VVector";
    public static final String WEIGHT = "Weight";
    public static final String X_HEIGHT = "XHeight";

    /* renamed from: a */
    public final InputStream f59167a;

    public AFMParser(InputStream inputStream) {
        this.f59167a = inputStream;
    }

    /* renamed from: a */
    public final String m33158a(String str) {
        if (str.length() >= 2) {
            if (str.charAt(0) == '<' && str.charAt(str.length() - 1) == '>') {
                String substring = str.substring(1, str.length() - 1);
                byte[] bArr = new byte[substring.length() / 2];
                for (int i = 0; i < substring.length(); i += 2) {
                    try {
                        bArr[i / 2] = (byte) Integer.parseInt(Character.toString(substring.charAt(i)) + substring.charAt(i + 1), 16);
                    } catch (NumberFormatException e) {
                        throw new IOException("Error parsing AFM file:" + e);
                    }
                }
                return new String(bArr, Charsets.ISO_8859_1);
            }
            throw new IOException("String should be enclosed by angle brackets '" + str + OperatorName.SHOW_TEXT_LINE);
        }
        throw new IOException("Error: Expected hex string of length >= 2 not='" + str);
    }

    /* renamed from: b */
    public final boolean m33157b(int i) {
        return i == 13 || i == 10;
    }

    /* renamed from: c */
    public final boolean m33156c(int i) {
        return i == 32 || i == 9 || i == 13 || i == 10;
    }

    /* renamed from: d */
    public final CharMetric m33155d() {
        CharMetric charMetric = new CharMetric();
        StringTokenizer stringTokenizer = new StringTokenizer(m33147l());
        while (stringTokenizer.hasMoreTokens()) {
            try {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.equals("C")) {
                    charMetric.setCharacterCode(Integer.parseInt(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_CH)) {
                    charMetric.setCharacterCode(Integer.parseInt(stringTokenizer.nextToken(), 16));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_WX)) {
                    charMetric.setWx(Float.parseFloat(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W0X)) {
                    charMetric.setW0x(Float.parseFloat(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W1X)) {
                    charMetric.setW1x(Float.parseFloat(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_WY)) {
                    charMetric.setWy(Float.parseFloat(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W0Y)) {
                    charMetric.setW0y(Float.parseFloat(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W1Y)) {
                    charMetric.setW1y(Float.parseFloat(stringTokenizer.nextToken()));
                    m33145n(stringTokenizer);
                } else if (nextToken.equals("W")) {
                    charMetric.setW(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W0)) {
                    charMetric.setW0(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_W1)) {
                    charMetric.setW1(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    m33145n(stringTokenizer);
                } else if (nextToken.equals(CHARMETRICS_VV)) {
                    charMetric.setVv(new float[]{Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken())});
                    m33145n(stringTokenizer);
                } else if (nextToken.equals("N")) {
                    charMetric.setName(stringTokenizer.nextToken());
                    m33145n(stringTokenizer);
                } else if (nextToken.equals("B")) {
                    BoundingBox boundingBox = new BoundingBox();
                    boundingBox.setLowerLeftX(Float.parseFloat(stringTokenizer.nextToken()));
                    boundingBox.setLowerLeftY(Float.parseFloat(stringTokenizer.nextToken()));
                    boundingBox.setUpperRightX(Float.parseFloat(stringTokenizer.nextToken()));
                    boundingBox.setUpperRightY(Float.parseFloat(stringTokenizer.nextToken()));
                    charMetric.setBoundingBox(boundingBox);
                    m33145n(stringTokenizer);
                } else if (nextToken.equals("L")) {
                    Ligature ligature = new Ligature();
                    ligature.setSuccessor(stringTokenizer.nextToken());
                    ligature.setLigature(stringTokenizer.nextToken());
                    charMetric.addLigature(ligature);
                    m33145n(stringTokenizer);
                } else {
                    throw new IOException("Unknown CharMetrics command '" + nextToken + OperatorName.SHOW_TEXT_LINE);
                }
            } catch (NumberFormatException e) {
                throw new IOException("Error: Corrupt AFM document:" + e);
            }
        }
        return charMetric;
    }

    /* renamed from: e */
    public final Composite m33154e() {
        Composite composite = new Composite();
        StringTokenizer stringTokenizer = new StringTokenizer(m33147l(), " ;");
        String nextToken = stringTokenizer.nextToken();
        if (nextToken.equals(f59166CC)) {
            composite.setName(stringTokenizer.nextToken());
            try {
                int parseInt = Integer.parseInt(stringTokenizer.nextToken());
                for (int i = 0; i < parseInt; i++) {
                    CompositePart compositePart = new CompositePart();
                    String nextToken2 = stringTokenizer.nextToken();
                    if (nextToken2.equals(PCC)) {
                        String nextToken3 = stringTokenizer.nextToken();
                        try {
                            int parseInt2 = Integer.parseInt(stringTokenizer.nextToken());
                            int parseInt3 = Integer.parseInt(stringTokenizer.nextToken());
                            compositePart.setName(nextToken3);
                            compositePart.setXDisplacement(parseInt2);
                            compositePart.setYDisplacement(parseInt3);
                            composite.addPart(compositePart);
                        } catch (NumberFormatException e) {
                            throw new IOException("Error parsing AFM document:" + e);
                        }
                    } else {
                        throw new IOException("Expected 'PCC' actual='" + nextToken2 + OperatorName.SHOW_TEXT_LINE);
                    }
                }
                return composite;
            } catch (NumberFormatException e2) {
                throw new IOException("Error parsing AFM document:" + e2);
            }
        }
        throw new IOException("Expected 'CC' actual='" + nextToken + OperatorName.SHOW_TEXT_LINE);
    }

    /* renamed from: f */
    public final FontMetrics m33153f(boolean z) {
        String m33146m;
        FontMetrics fontMetrics = new FontMetrics();
        String m33146m2 = m33146m();
        if (START_FONT_METRICS.equals(m33146m2)) {
            fontMetrics.setAFMVersion(m33149j());
            boolean z2 = false;
            while (true) {
                m33146m = m33146m();
                if (END_FONT_METRICS.equals(m33146m)) {
                    break;
                } else if (FONT_NAME.equals(m33146m)) {
                    fontMetrics.setFontName(m33147l());
                } else if (FULL_NAME.equals(m33146m)) {
                    fontMetrics.setFullName(m33147l());
                } else if (FAMILY_NAME.equals(m33146m)) {
                    fontMetrics.setFamilyName(m33147l());
                } else if (WEIGHT.equals(m33146m)) {
                    fontMetrics.setWeight(m33147l());
                } else if (FONT_BBOX.equals(m33146m)) {
                    BoundingBox boundingBox = new BoundingBox();
                    boundingBox.setLowerLeftX(m33149j());
                    boundingBox.setLowerLeftY(m33149j());
                    boundingBox.setUpperRightX(m33149j());
                    boundingBox.setUpperRightY(m33149j());
                    fontMetrics.setFontBBox(boundingBox);
                } else if (VERSION.equals(m33146m)) {
                    fontMetrics.setFontVersion(m33147l());
                } else if (NOTICE.equals(m33146m)) {
                    fontMetrics.setNotice(m33147l());
                } else if (ENCODING_SCHEME.equals(m33146m)) {
                    fontMetrics.setEncodingScheme(m33147l());
                } else if (MAPPING_SCHEME.equals(m33146m)) {
                    fontMetrics.setMappingScheme(m33148k());
                } else if (ESC_CHAR.equals(m33146m)) {
                    fontMetrics.setEscChar(m33148k());
                } else if (CHARACTER_SET.equals(m33146m)) {
                    fontMetrics.setCharacterSet(m33147l());
                } else if (CHARACTERS.equals(m33146m)) {
                    fontMetrics.setCharacters(m33148k());
                } else if (IS_BASE_FONT.equals(m33146m)) {
                    fontMetrics.setIsBaseFont(m33150i());
                } else if (V_VECTOR.equals(m33146m)) {
                    fontMetrics.setVVector(new float[]{m33149j(), m33149j()});
                } else if (IS_FIXED_V.equals(m33146m)) {
                    fontMetrics.setIsFixedV(m33150i());
                } else if (CAP_HEIGHT.equals(m33146m)) {
                    fontMetrics.setCapHeight(m33149j());
                } else if (X_HEIGHT.equals(m33146m)) {
                    fontMetrics.setXHeight(m33149j());
                } else if (ASCENDER.equals(m33146m)) {
                    fontMetrics.setAscender(m33149j());
                } else if (DESCENDER.equals(m33146m)) {
                    fontMetrics.setDescender(m33149j());
                } else if (STD_HW.equals(m33146m)) {
                    fontMetrics.setStandardHorizontalWidth(m33149j());
                } else if (STD_VW.equals(m33146m)) {
                    fontMetrics.setStandardVerticalWidth(m33149j());
                } else if ("Comment".equals(m33146m)) {
                    fontMetrics.addComment(m33147l());
                } else if (UNDERLINE_POSITION.equals(m33146m)) {
                    fontMetrics.setUnderlinePosition(m33149j());
                } else if (UNDERLINE_THICKNESS.equals(m33146m)) {
                    fontMetrics.setUnderlineThickness(m33149j());
                } else if (ITALIC_ANGLE.equals(m33146m)) {
                    fontMetrics.setItalicAngle(m33149j());
                } else if (CHAR_WIDTH.equals(m33146m)) {
                    fontMetrics.setCharWidth(new float[]{m33149j(), m33149j()});
                } else if (IS_FIXED_PITCH.equals(m33146m)) {
                    fontMetrics.setFixedPitch(m33150i());
                } else if (START_CHAR_METRICS.equals(m33146m)) {
                    int m33148k = m33148k();
                    ArrayList arrayList = new ArrayList(m33148k);
                    for (int i = 0; i < m33148k; i++) {
                        arrayList.add(m33155d());
                    }
                    String m33146m3 = m33146m();
                    if (m33146m3.equals(END_CHAR_METRICS)) {
                        fontMetrics.setCharMetrics(arrayList);
                        z2 = true;
                    } else {
                        throw new IOException("Error: Expected 'EndCharMetrics' actual '" + m33146m3 + OperatorName.SHOW_TEXT_LINE);
                    }
                } else if (!z && START_COMPOSITES.equals(m33146m)) {
                    int m33148k2 = m33148k();
                    for (int i2 = 0; i2 < m33148k2; i2++) {
                        fontMetrics.addComposite(m33154e());
                    }
                    String m33146m4 = m33146m();
                    if (!m33146m4.equals(END_COMPOSITES)) {
                        throw new IOException("Error: Expected 'EndComposites' actual '" + m33146m4 + OperatorName.SHOW_TEXT_LINE);
                    }
                } else if (z || !START_KERN_DATA.equals(m33146m)) {
                    break;
                } else {
                    m33152g(fontMetrics);
                }
            }
            if (!z || !z2) {
                throw new IOException("Unknown AFM key '" + m33146m + OperatorName.SHOW_TEXT_LINE);
            }
            return fontMetrics;
        }
        throw new IOException("Error: The AFM file should start with StartFontMetrics and not '" + m33146m2 + OperatorName.SHOW_TEXT_LINE);
    }

    /* renamed from: g */
    public final void m33152g(FontMetrics fontMetrics) {
        while (true) {
            String m33146m = m33146m();
            if (!m33146m.equals(END_KERN_DATA)) {
                int i = 0;
                if (START_TRACK_KERN.equals(m33146m)) {
                    int m33148k = m33148k();
                    while (i < m33148k) {
                        TrackKern trackKern = new TrackKern();
                        trackKern.setDegree(m33148k());
                        trackKern.setMinPointSize(m33149j());
                        trackKern.setMinKern(m33149j());
                        trackKern.setMaxPointSize(m33149j());
                        trackKern.setMaxKern(m33149j());
                        fontMetrics.addTrackKern(trackKern);
                        i++;
                    }
                    String m33146m2 = m33146m();
                    if (!m33146m2.equals(END_TRACK_KERN)) {
                        throw new IOException("Error: Expected 'EndTrackKern' actual '" + m33146m2 + OperatorName.SHOW_TEXT_LINE);
                    }
                } else if (START_KERN_PAIRS.equals(m33146m)) {
                    int m33148k2 = m33148k();
                    while (i < m33148k2) {
                        fontMetrics.addKernPair(m33151h());
                        i++;
                    }
                    String m33146m3 = m33146m();
                    if (!m33146m3.equals(END_KERN_PAIRS)) {
                        throw new IOException("Error: Expected 'EndKernPairs' actual '" + m33146m3 + OperatorName.SHOW_TEXT_LINE);
                    }
                } else if (START_KERN_PAIRS0.equals(m33146m)) {
                    int m33148k3 = m33148k();
                    while (i < m33148k3) {
                        fontMetrics.addKernPair0(m33151h());
                        i++;
                    }
                    String m33146m4 = m33146m();
                    if (!m33146m4.equals(END_KERN_PAIRS)) {
                        throw new IOException("Error: Expected 'EndKernPairs' actual '" + m33146m4 + OperatorName.SHOW_TEXT_LINE);
                    }
                } else if (START_KERN_PAIRS1.equals(m33146m)) {
                    int m33148k4 = m33148k();
                    while (i < m33148k4) {
                        fontMetrics.addKernPair1(m33151h());
                        i++;
                    }
                    String m33146m5 = m33146m();
                    if (!m33146m5.equals(END_KERN_PAIRS)) {
                        throw new IOException("Error: Expected 'EndKernPairs' actual '" + m33146m5 + OperatorName.SHOW_TEXT_LINE);
                    }
                } else {
                    throw new IOException("Unknown kerning data type '" + m33146m + OperatorName.SHOW_TEXT_LINE);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public final KernPair m33151h() {
        KernPair kernPair = new KernPair();
        String m33146m = m33146m();
        if (KERN_PAIR_KP.equals(m33146m)) {
            kernPair.setFirstKernCharacter(m33146m());
            kernPair.setSecondKernCharacter(m33146m());
            kernPair.setX(m33149j());
            kernPair.setY(m33149j());
        } else if (KERN_PAIR_KPH.equals(m33146m)) {
            kernPair.setFirstKernCharacter(m33158a(m33146m()));
            kernPair.setSecondKernCharacter(m33158a(m33146m()));
            kernPair.setX(m33149j());
            kernPair.setY(m33149j());
        } else if (KERN_PAIR_KPX.equals(m33146m)) {
            kernPair.setFirstKernCharacter(m33146m());
            kernPair.setSecondKernCharacter(m33146m());
            kernPair.setX(m33149j());
            kernPair.setY(0.0f);
        } else if (KERN_PAIR_KPY.equals(m33146m)) {
            kernPair.setFirstKernCharacter(m33146m());
            kernPair.setSecondKernCharacter(m33146m());
            kernPair.setX(0.0f);
            kernPair.setY(m33149j());
        } else {
            throw new IOException("Error expected kern pair command actual='" + m33146m + OperatorName.SHOW_TEXT_LINE);
        }
        return kernPair;
    }

    /* renamed from: i */
    public final boolean m33150i() {
        return Boolean.parseBoolean(m33146m());
    }

    /* renamed from: j */
    public final float m33149j() {
        return Float.parseFloat(m33146m());
    }

    /* renamed from: k */
    public final int m33148k() {
        try {
            return Integer.parseInt(m33146m());
        } catch (NumberFormatException e) {
            throw new IOException("Error parsing AFM document:" + e);
        }
    }

    /* renamed from: l */
    public final String m33147l() {
        StringBuilder sb = new StringBuilder(60);
        int read = this.f59167a.read();
        while (m33156c(read)) {
            read = this.f59167a.read();
        }
        sb.append((char) read);
        int read2 = this.f59167a.read();
        while (read2 != -1 && !m33157b(read2)) {
            sb.append((char) read2);
            read2 = this.f59167a.read();
        }
        return sb.toString();
    }

    /* renamed from: m */
    public final String m33146m() {
        StringBuilder sb = new StringBuilder(24);
        int read = this.f59167a.read();
        while (m33156c(read)) {
            read = this.f59167a.read();
        }
        sb.append((char) read);
        int read2 = this.f59167a.read();
        while (read2 != -1 && !m33156c(read2)) {
            sb.append((char) read2);
            read2 = this.f59167a.read();
        }
        return sb.toString();
    }

    /* renamed from: n */
    public final void m33145n(StringTokenizer stringTokenizer) {
        if (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (";".equals(nextToken)) {
                return;
            }
            throw new IOException("Error: Expected semicolon in stream actual='" + nextToken + OperatorName.SHOW_TEXT_LINE);
        }
        throw new IOException("CharMetrics is missing a semicolon after a command");
    }

    public FontMetrics parse() throws IOException {
        return m33153f(false);
    }

    public FontMetrics parse(boolean z) throws IOException {
        return m33153f(z);
    }
}
