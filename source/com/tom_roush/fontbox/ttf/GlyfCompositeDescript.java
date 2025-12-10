package com.tom_roush.fontbox.ttf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class GlyfCompositeDescript extends GlyfDescript {

    /* renamed from: c */
    public final List f59397c;

    /* renamed from: d */
    public final Map f59398d;

    /* renamed from: e */
    public GlyphTable f59399e;

    /* renamed from: f */
    public boolean f59400f;

    /* renamed from: g */
    public boolean f59401g;

    /* renamed from: h */
    public int f59402h;

    /* renamed from: i */
    public int f59403i;

    public GlyfCompositeDescript(AbstractC22790wQ1 abstractC22790wQ1, GlyphTable glyphTable) {
        super((short) -1, abstractC22790wQ1);
        GlyfCompositeComp glyfCompositeComp;
        this.f59397c = new ArrayList();
        this.f59398d = new HashMap();
        this.f59400f = false;
        this.f59401g = false;
        this.f59402h = -1;
        this.f59403i = -1;
        this.f59399e = glyphTable;
        do {
            glyfCompositeComp = new GlyfCompositeComp(abstractC22790wQ1);
            this.f59397c.add(glyfCompositeComp);
        } while ((glyfCompositeComp.getFlags() & 32) != 0);
        if ((glyfCompositeComp.getFlags() & OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING) != 0) {
            m32933a(abstractC22790wQ1, abstractC22790wQ1.mo844t());
        }
        m32934d();
    }

    /* renamed from: b */
    public final GlyfCompositeComp m32936b(int i) {
        for (GlyfCompositeComp glyfCompositeComp : this.f59397c) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59398d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyfCompositeComp.getFirstIndex() <= i && glyphDescription != null && i < glyfCompositeComp.getFirstIndex() + glyphDescription.getPointCount()) {
                return glyfCompositeComp;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final GlyfCompositeComp m32935c(int i) {
        for (GlyfCompositeComp glyfCompositeComp : this.f59397c) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59398d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyfCompositeComp.getFirstContour() <= i && glyphDescription != null && i < glyfCompositeComp.getFirstContour() + glyphDescription.getContourCount()) {
                return glyfCompositeComp;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m32934d() {
        for (GlyfCompositeComp glyfCompositeComp : this.f59397c) {
            try {
                int glyphIndex = glyfCompositeComp.getGlyphIndex();
                GlyphData glyph = this.f59399e.getGlyph(glyphIndex);
                if (glyph != null) {
                    this.f59398d.put(Integer.valueOf(glyphIndex), glyph.getDescription());
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    public int getComponentCount() {
        return this.f59397c.size();
    }

    @Override // com.tom_roush.fontbox.ttf.GlyfDescript, com.tom_roush.fontbox.ttf.GlyphDescription
    public int getContourCount() {
        if (this.f59403i < 0) {
            List list = this.f59397c;
            GlyfCompositeComp glyfCompositeComp = (GlyfCompositeComp) list.get(list.size() - 1);
            this.f59403i = glyfCompositeComp.getFirstContour() + ((GlyphDescription) this.f59398d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()))).getContourCount();
        }
        return this.f59403i;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getEndPtOfContours(int i) {
        GlyfCompositeComp m32935c = m32935c(i);
        if (m32935c != null) {
            return ((GlyphDescription) this.f59398d.get(Integer.valueOf(m32935c.getGlyphIndex()))).getEndPtOfContours(i - m32935c.getFirstContour()) + m32935c.getFirstIndex();
        }
        return 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public byte getFlags(int i) {
        GlyfCompositeComp m32936b = m32936b(i);
        if (m32936b != null) {
            return ((GlyphDescription) this.f59398d.get(Integer.valueOf(m32936b.getGlyphIndex()))).getFlags(i - m32936b.getFirstIndex());
        }
        return (byte) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getPointCount() {
        if (this.f59402h < 0) {
            List list = this.f59397c;
            GlyfCompositeComp glyfCompositeComp = (GlyfCompositeComp) list.get(list.size() - 1);
            GlyphDescription glyphDescription = (GlyphDescription) this.f59398d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyphDescription == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("GlyphDescription for index ");
                sb.append(glyfCompositeComp.getGlyphIndex());
                sb.append(" is null, returning 0");
                this.f59402h = 0;
            } else {
                this.f59402h = glyfCompositeComp.getFirstIndex() + glyphDescription.getPointCount();
            }
        }
        return this.f59402h;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getXCoordinate(int i) {
        GlyfCompositeComp m32936b = m32936b(i);
        if (m32936b != null) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59398d.get(Integer.valueOf(m32936b.getGlyphIndex()));
            int firstIndex = i - m32936b.getFirstIndex();
            return (short) (((short) m32936b.scaleX(glyphDescription.getXCoordinate(firstIndex), glyphDescription.getYCoordinate(firstIndex))) + m32936b.getXTranslate());
        }
        return (short) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getYCoordinate(int i) {
        GlyfCompositeComp m32936b = m32936b(i);
        if (m32936b != null) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59398d.get(Integer.valueOf(m32936b.getGlyphIndex()));
            int firstIndex = i - m32936b.getFirstIndex();
            return (short) (((short) m32936b.scaleY(glyphDescription.getXCoordinate(firstIndex), glyphDescription.getYCoordinate(firstIndex))) + m32936b.getYTranslate());
        }
        return (short) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public boolean isComposite() {
        return true;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyfDescript, com.tom_roush.fontbox.ttf.GlyphDescription
    public void resolve() {
        if (this.f59401g || this.f59400f) {
            return;
        }
        this.f59400f = true;
        int i = 0;
        int i2 = 0;
        for (GlyfCompositeComp glyfCompositeComp : this.f59397c) {
            glyfCompositeComp.setFirstIndex(i);
            glyfCompositeComp.setFirstContour(i2);
            GlyphDescription glyphDescription = (GlyphDescription) this.f59398d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyphDescription != null) {
                glyphDescription.resolve();
                i += glyphDescription.getPointCount();
                i2 += glyphDescription.getContourCount();
            }
        }
        this.f59401g = true;
        this.f59400f = false;
    }
}
