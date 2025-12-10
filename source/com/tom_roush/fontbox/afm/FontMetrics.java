package com.tom_roush.fontbox.afm;

import com.tom_roush.fontbox.util.BoundingBox;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class FontMetrics {

    /* renamed from: A */
    public boolean f59187A;

    /* renamed from: B */
    public float f59188B;

    /* renamed from: C */
    public float f59189C;

    /* renamed from: a */
    public float f59197a;

    /* renamed from: c */
    public String f59199c;

    /* renamed from: d */
    public String f59200d;

    /* renamed from: e */
    public String f59201e;

    /* renamed from: f */
    public String f59202f;

    /* renamed from: g */
    public BoundingBox f59203g;

    /* renamed from: h */
    public String f59204h;

    /* renamed from: i */
    public String f59205i;

    /* renamed from: j */
    public String f59206j;

    /* renamed from: k */
    public int f59207k;

    /* renamed from: l */
    public int f59208l;

    /* renamed from: m */
    public String f59209m;

    /* renamed from: n */
    public int f59210n;

    /* renamed from: o */
    public boolean f59211o;

    /* renamed from: p */
    public float[] f59212p;

    /* renamed from: q */
    public boolean f59213q;

    /* renamed from: r */
    public float f59214r;

    /* renamed from: s */
    public float f59215s;

    /* renamed from: t */
    public float f59216t;

    /* renamed from: u */
    public float f59217u;

    /* renamed from: w */
    public float f59219w;

    /* renamed from: x */
    public float f59220x;

    /* renamed from: y */
    public float f59221y;

    /* renamed from: z */
    public float[] f59222z;

    /* renamed from: b */
    public int f59198b = 0;

    /* renamed from: v */
    public final List f59218v = new ArrayList();

    /* renamed from: D */
    public List f59190D = new ArrayList();

    /* renamed from: E */
    public Map f59191E = new HashMap();

    /* renamed from: F */
    public List f59192F = new ArrayList();

    /* renamed from: G */
    public List f59193G = new ArrayList();

    /* renamed from: H */
    public List f59194H = new ArrayList();

    /* renamed from: I */
    public List f59195I = new ArrayList();

    /* renamed from: J */
    public List f59196J = new ArrayList();

    public void addCharMetric(CharMetric charMetric) {
        this.f59190D.add(charMetric);
        this.f59191E.put(charMetric.getName(), charMetric);
    }

    public void addComment(String str) {
        this.f59218v.add(str);
    }

    public void addComposite(Composite composite) {
        this.f59193G.add(composite);
    }

    public void addKernPair(KernPair kernPair) {
        this.f59194H.add(kernPair);
    }

    public void addKernPair0(KernPair kernPair) {
        this.f59195I.add(kernPair);
    }

    public void addKernPair1(KernPair kernPair) {
        this.f59196J.add(kernPair);
    }

    public void addTrackKern(TrackKern trackKern) {
        this.f59192F.add(trackKern);
    }

    public float getAFMVersion() {
        return this.f59197a;
    }

    public float getAscender() {
        return this.f59216t;
    }

    public float getAverageCharacterWidth() {
        float f = 0.0f;
        float f2 = 0.0f;
        for (CharMetric charMetric : this.f59190D) {
            if (charMetric.getWx() > 0.0f) {
                f += charMetric.getWx();
                f2 += 1.0f;
            }
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        return f / f2;
    }

    public float getCapHeight() {
        return this.f59214r;
    }

    public List<CharMetric> getCharMetrics() {
        return Collections.unmodifiableList(this.f59190D);
    }

    public float[] getCharWidth() {
        return this.f59222z;
    }

    public float getCharacterHeight(String str) {
        CharMetric charMetric = (CharMetric) this.f59191E.get(str);
        if (charMetric == null) {
            return 0.0f;
        }
        float wy = charMetric.getWy();
        if (wy == 0.0f) {
            return charMetric.getBoundingBox().getHeight();
        }
        return wy;
    }

    public String getCharacterSet() {
        return this.f59209m;
    }

    public float getCharacterWidth(String str) {
        CharMetric charMetric = (CharMetric) this.f59191E.get(str);
        if (charMetric != null) {
            return charMetric.getWx();
        }
        return 0.0f;
    }

    public int getCharacters() {
        return this.f59210n;
    }

    public List<String> getComments() {
        return Collections.unmodifiableList(this.f59218v);
    }

    public List<Composite> getComposites() {
        return Collections.unmodifiableList(this.f59193G);
    }

    public float getDescender() {
        return this.f59217u;
    }

    public String getEncodingScheme() {
        return this.f59206j;
    }

    public int getEscChar() {
        return this.f59208l;
    }

    public String getFamilyName() {
        return this.f59201e;
    }

    public BoundingBox getFontBBox() {
        return this.f59203g;
    }

    public String getFontName() {
        return this.f59199c;
    }

    public String getFontVersion() {
        return this.f59204h;
    }

    public String getFullName() {
        return this.f59200d;
    }

    public float getItalicAngle() {
        return this.f59221y;
    }

    public List<KernPair> getKernPairs() {
        return Collections.unmodifiableList(this.f59194H);
    }

    public List<KernPair> getKernPairs0() {
        return Collections.unmodifiableList(this.f59195I);
    }

    public List<KernPair> getKernPairs1() {
        return Collections.unmodifiableList(this.f59196J);
    }

    public int getMappingScheme() {
        return this.f59207k;
    }

    public int getMetricSets() {
        return this.f59198b;
    }

    public String getNotice() {
        return this.f59205i;
    }

    public float getStandardHorizontalWidth() {
        return this.f59188B;
    }

    public float getStandardVerticalWidth() {
        return this.f59189C;
    }

    public List<TrackKern> getTrackKern() {
        return Collections.unmodifiableList(this.f59192F);
    }

    public float getUnderlinePosition() {
        return this.f59219w;
    }

    public float getUnderlineThickness() {
        return this.f59220x;
    }

    public float[] getVVector() {
        return this.f59212p;
    }

    public String getWeight() {
        return this.f59202f;
    }

    public float getXHeight() {
        return this.f59215s;
    }

    public boolean isBaseFont() {
        return this.f59211o;
    }

    public boolean isFixedPitch() {
        return this.f59187A;
    }

    public boolean isFixedV() {
        return this.f59213q;
    }

    public void setAFMVersion(float f) {
        this.f59197a = f;
    }

    public void setAscender(float f) {
        this.f59216t = f;
    }

    public void setCapHeight(float f) {
        this.f59214r = f;
    }

    public void setCharMetrics(List<CharMetric> list) {
        this.f59190D = list;
        this.f59191E = new HashMap(this.f59190D.size());
        for (CharMetric charMetric : list) {
            this.f59191E.put(charMetric.getName(), charMetric);
        }
    }

    public void setCharWidth(float[] fArr) {
        this.f59222z = fArr;
    }

    public void setCharacterSet(String str) {
        this.f59209m = str;
    }

    public void setCharacters(int i) {
        this.f59210n = i;
    }

    public void setComposites(List<Composite> list) {
        this.f59193G = list;
    }

    public void setDescender(float f) {
        this.f59217u = f;
    }

    public void setEncodingScheme(String str) {
        this.f59206j = str;
    }

    public void setEscChar(int i) {
        this.f59208l = i;
    }

    public void setFamilyName(String str) {
        this.f59201e = str;
    }

    public void setFixedPitch(boolean z) {
        this.f59187A = z;
    }

    public void setFontBBox(BoundingBox boundingBox) {
        this.f59203g = boundingBox;
    }

    public void setFontName(String str) {
        this.f59199c = str;
    }

    public void setFontVersion(String str) {
        this.f59204h = str;
    }

    public void setFullName(String str) {
        this.f59200d = str;
    }

    public void setIsBaseFont(boolean z) {
        this.f59211o = z;
    }

    public void setIsFixedV(boolean z) {
        this.f59213q = z;
    }

    public void setItalicAngle(float f) {
        this.f59221y = f;
    }

    public void setKernPairs(List<KernPair> list) {
        this.f59194H = list;
    }

    public void setKernPairs0(List<KernPair> list) {
        this.f59195I = list;
    }

    public void setKernPairs1(List<KernPair> list) {
        this.f59196J = list;
    }

    public void setMappingScheme(int i) {
        this.f59207k = i;
    }

    public void setMetricSets(int i) {
        if (i >= 0 && i <= 2) {
            this.f59198b = i;
            return;
        }
        throw new IllegalArgumentException("The metricSets attribute must be in the set {0,1,2} and not '" + i + OperatorName.SHOW_TEXT_LINE);
    }

    public void setNotice(String str) {
        this.f59205i = str;
    }

    public void setStandardHorizontalWidth(float f) {
        this.f59188B = f;
    }

    public void setStandardVerticalWidth(float f) {
        this.f59189C = f;
    }

    public void setTrackKern(List<TrackKern> list) {
        this.f59192F = list;
    }

    public void setUnderlinePosition(float f) {
        this.f59219w = f;
    }

    public void setUnderlineThickness(float f) {
        this.f59220x = f;
    }

    public void setVVector(float[] fArr) {
        this.f59212p = fArr;
    }

    public void setWeight(String str) {
        this.f59202f = str;
    }

    public void setXHeight(float f) {
        this.f59215s = f;
    }
}
