package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.tom_roush.fontbox.FontBoxFont;
import com.tom_roush.fontbox.util.BoundingBox;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class TrueTypeFont implements FontBoxFont, Closeable {

    /* renamed from: a */
    public float f59600a;

    /* renamed from: d */
    public final AbstractC22790wQ1 f59603d;

    /* renamed from: e */
    public Map f59604e;

    /* renamed from: b */
    public int f59601b = -1;

    /* renamed from: c */
    public int f59602c = -1;
    protected Map<String, TTFTable> tables = new HashMap();

    /* renamed from: f */
    public final List f59605f = new ArrayList();

    public TrueTypeFont(AbstractC22790wQ1 abstractC22790wQ1) {
        this.f59603d = abstractC22790wQ1;
    }

    /* renamed from: b */
    public void m32854b(TTFTable tTFTable) {
        this.tables.put(tTFTable.getTag(), tTFTable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59603d.close();
    }

    /* renamed from: d */
    public final CmapSubtable m32853d(boolean z) {
        CmapTable cmap = getCmap();
        if (cmap == null) {
            if (!z) {
                return null;
            }
            throw new IOException("The TrueType font " + getName() + " does not contain a 'cmap' table");
        }
        CmapSubtable subtable = cmap.getSubtable(0, 4);
        if (subtable == null) {
            subtable = cmap.getSubtable(3, 10);
        }
        if (subtable == null) {
            subtable = cmap.getSubtable(0, 3);
        }
        if (subtable == null) {
            subtable = cmap.getSubtable(3, 1);
        }
        if (subtable == null) {
            subtable = cmap.getSubtable(3, 0);
        }
        if (subtable == null) {
            if (!z) {
                if (cmap.getCmaps().length > 0) {
                    return cmap.getCmaps()[0];
                }
                return subtable;
            }
            throw new IOException("The TrueType font does not contain a Unicode cmap");
        }
        return subtable;
    }

    public void disableGsubFeature(String str) {
        this.f59605f.remove(str);
    }

    public void enableGsubFeature(String str) {
        this.f59605f.add(str);
    }

    public void enableVerticalSubstitutions() {
        enableGsubFeature("vrt2");
        enableGsubFeature("vert");
    }

    public void finalize() throws Throwable {
        super.finalize();
        close();
    }

    /* renamed from: g */
    public final int m32852g(String str) {
        if (str.startsWith("uni") && str.length() == 7) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i = 3;
            while (true) {
                int i2 = i + 4;
                if (i2 > length) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt(str.substring(i, i2), 16);
                    if (parseInt <= 55295 || parseInt >= 57344) {
                        sb.append((char) parseInt);
                    }
                    i = i2;
                } catch (NumberFormatException unused) {
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() == 0) {
                return -1;
            }
            return sb2.codePointAt(0);
        }
        return -1;
    }

    public int getAdvanceHeight(int i) throws IOException {
        VerticalMetricsTable verticalMetrics = getVerticalMetrics();
        if (verticalMetrics != null) {
            return verticalMetrics.getAdvanceHeight(i);
        }
        return ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    public int getAdvanceWidth(int i) throws IOException {
        HorizontalMetricsTable horizontalMetrics = getHorizontalMetrics();
        if (horizontalMetrics != null) {
            return horizontalMetrics.getAdvanceWidth(i);
        }
        return ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    public CmapTable getCmap() throws IOException {
        return (CmapTable) getTable(CmapTable.TAG);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public BoundingBox getFontBBox() throws IOException {
        HeaderTable header = getHeader();
        short xMin = header.getXMin();
        short xMax = header.getXMax();
        short yMin = header.getYMin();
        short yMax = header.getYMax();
        float unitsPerEm = 1000.0f / getUnitsPerEm();
        return new BoundingBox(xMin * unitsPerEm, yMin * unitsPerEm, xMax * unitsPerEm, yMax * unitsPerEm);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public List<Number> getFontMatrix() throws IOException {
        float unitsPerEm = (1000.0f / getUnitsPerEm()) * 0.001f;
        return Arrays.asList(Float.valueOf(unitsPerEm), 0, 0, Float.valueOf(unitsPerEm), 0, 0);
    }

    public GlyphTable getGlyph() throws IOException {
        return (GlyphTable) getTable(GlyphTable.TAG);
    }

    public GlyphSubstitutionTable getGsub() throws IOException {
        return (GlyphSubstitutionTable) getTable(GlyphSubstitutionTable.TAG);
    }

    public HeaderTable getHeader() throws IOException {
        return (HeaderTable) getTable(HeaderTable.TAG);
    }

    public HorizontalHeaderTable getHorizontalHeader() throws IOException {
        return (HorizontalHeaderTable) getTable(HorizontalHeaderTable.TAG);
    }

    public HorizontalMetricsTable getHorizontalMetrics() throws IOException {
        return (HorizontalMetricsTable) getTable(HorizontalMetricsTable.TAG);
    }

    public IndexToLocationTable getIndexToLocation() throws IOException {
        return (IndexToLocationTable) getTable(IndexToLocationTable.TAG);
    }

    public KerningTable getKerning() throws IOException {
        return (KerningTable) getTable(KerningTable.TAG);
    }

    public MaximumProfileTable getMaximumProfile() throws IOException {
        return (MaximumProfileTable) getTable(MaximumProfileTable.TAG);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public String getName() throws IOException {
        NamingTable naming = getNaming();
        if (naming != null) {
            return naming.getPostScriptName();
        }
        return null;
    }

    public NamingTable getNaming() throws IOException {
        return (NamingTable) getTable("name");
    }

    public int getNumberOfGlyphs() throws IOException {
        if (this.f59601b == -1) {
            MaximumProfileTable maximumProfile = getMaximumProfile();
            if (maximumProfile != null) {
                this.f59601b = maximumProfile.getNumGlyphs();
            } else {
                this.f59601b = 0;
            }
        }
        return this.f59601b;
    }

    public OS2WindowsMetricsTable getOS2Windows() throws IOException {
        return (OS2WindowsMetricsTable) getTable(OS2WindowsMetricsTable.TAG);
    }

    public InputStream getOriginalData() throws IOException {
        return this.f59603d.mo857d();
    }

    public long getOriginalDataSize() {
        return this.f59603d.mo856g();
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public Path getPath(String str) throws IOException {
        GlyphData glyph = getGlyph().getGlyph(nameToGID(str));
        if (glyph == null) {
            return new Path();
        }
        return glyph.getPath();
    }

    public PostScriptTable getPostScript() throws IOException {
        return (PostScriptTable) getTable(PostScriptTable.TAG);
    }

    public synchronized TTFTable getTable(String str) throws IOException {
        TTFTable tTFTable;
        tTFTable = this.tables.get(str);
        if (tTFTable != null && !tTFTable.getInitialized()) {
            m32850j(tTFTable);
        }
        return tTFTable;
    }

    public synchronized byte[] getTableBytes(TTFTable tTFTable) throws IOException {
        byte[] m855i;
        long mo858b = this.f59603d.mo858b();
        this.f59603d.seek(tTFTable.getOffset());
        m855i = this.f59603d.m855i((int) tTFTable.getLength());
        this.f59603d.seek(mo858b);
        return m855i;
    }

    public Map<String, TTFTable> getTableMap() {
        return this.tables;
    }

    public Collection<TTFTable> getTables() {
        return this.tables.values();
    }

    @Deprecated
    public CmapSubtable getUnicodeCmap() throws IOException {
        return getUnicodeCmap(true);
    }

    public CmapLookup getUnicodeCmapLookup() throws IOException {
        return getUnicodeCmapLookup(true);
    }

    public int getUnitsPerEm() throws IOException {
        if (this.f59602c == -1) {
            HeaderTable header = getHeader();
            if (header != null) {
                this.f59602c = header.getUnitsPerEm();
            } else {
                this.f59602c = 0;
            }
        }
        return this.f59602c;
    }

    public float getVersion() {
        return this.f59600a;
    }

    public VerticalHeaderTable getVerticalHeader() throws IOException {
        return (VerticalHeaderTable) getTable(VerticalHeaderTable.TAG);
    }

    public VerticalMetricsTable getVerticalMetrics() throws IOException {
        return (VerticalMetricsTable) getTable(VerticalMetricsTable.TAG);
    }

    public VerticalOriginTable getVerticalOrigin() throws IOException {
        return (VerticalOriginTable) getTable(VerticalOriginTable.TAG);
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public float getWidth(String str) throws IOException {
        return getAdvanceWidth(nameToGID(str));
    }

    @Override // com.tom_roush.fontbox.FontBoxFont
    public boolean hasGlyph(String str) throws IOException {
        if (nameToGID(str) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final synchronized void m32851i() {
        try {
            if (this.f59604e == null && getPostScript() != null) {
                String[] glyphNames = getPostScript().getGlyphNames();
                if (glyphNames != null) {
                    this.f59604e = new HashMap(glyphNames.length);
                    for (int i = 0; i < glyphNames.length; i++) {
                        this.f59604e.put(glyphNames[i], Integer.valueOf(i));
                    }
                } else {
                    this.f59604e = new HashMap();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    public void m32850j(TTFTable tTFTable) {
        synchronized (this.f59603d) {
            long mo858b = this.f59603d.mo858b();
            this.f59603d.seek(tTFTable.getOffset());
            tTFTable.mo32848a(this, this.f59603d);
            this.f59603d.seek(mo858b);
        }
    }

    /* renamed from: k */
    public void mo32849k(float f) {
        this.f59600a = f;
    }

    public int nameToGID(String str) throws IOException {
        Integer num;
        m32851i();
        Map map = this.f59604e;
        if (map != null && (num = (Integer) map.get(str)) != null && num.intValue() > 0 && num.intValue() < getMaximumProfile().getNumGlyphs()) {
            return num.intValue();
        }
        int m32852g = m32852g(str);
        if (m32852g <= -1) {
            return 0;
        }
        return getUnicodeCmapLookup(false).getGlyphId(m32852g);
    }

    public String toString() {
        try {
            NamingTable naming = getNaming();
            if (naming != null) {
                return naming.getPostScriptName();
            }
            return "(null)";
        } catch (IOException e) {
            return "(null - " + e.getMessage() + ")";
        }
    }

    @Deprecated
    public CmapSubtable getUnicodeCmap(boolean z) throws IOException {
        return m32853d(z);
    }

    public CmapLookup getUnicodeCmapLookup(boolean z) throws IOException {
        GlyphSubstitutionTable gsub;
        CmapSubtable m32853d = m32853d(z);
        return (this.f59605f.isEmpty() || (gsub = getGsub()) == null) ? m32853d : new SubstitutingCmapLookup(m32853d, gsub, Collections.unmodifiableList(this.f59605f));
    }
}
