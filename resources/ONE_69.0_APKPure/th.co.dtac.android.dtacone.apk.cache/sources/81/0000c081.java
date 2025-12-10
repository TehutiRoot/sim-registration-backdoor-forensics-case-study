package com.tom_roush.fontbox.ttf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class GlyfCompositeDescript extends GlyfDescript {

    /* renamed from: c */
    public final List f59409c;

    /* renamed from: d */
    public final Map f59410d;

    /* renamed from: e */
    public GlyphTable f59411e;

    /* renamed from: f */
    public boolean f59412f;

    /* renamed from: g */
    public boolean f59413g;

    /* renamed from: h */
    public int f59414h;

    /* renamed from: i */
    public int f59415i;

    public GlyfCompositeDescript(AbstractC22342tR1 abstractC22342tR1, GlyphTable glyphTable) {
        super((short) -1, abstractC22342tR1);
        GlyfCompositeComp glyfCompositeComp;
        this.f59409c = new ArrayList();
        this.f59410d = new HashMap();
        this.f59412f = false;
        this.f59413g = false;
        this.f59414h = -1;
        this.f59415i = -1;
        this.f59411e = glyphTable;
        do {
            glyfCompositeComp = new GlyfCompositeComp(abstractC22342tR1);
            this.f59409c.add(glyfCompositeComp);
        } while ((glyfCompositeComp.getFlags() & 32) != 0);
        if ((glyfCompositeComp.getFlags() & OS2WindowsMetricsTable.FSTYPE_NO_SUBSETTING) != 0) {
            m32925a(abstractC22342tR1, abstractC22342tR1.mo22679t());
        }
        m32926d();
    }

    /* renamed from: b */
    public final GlyfCompositeComp m32928b(int i) {
        for (GlyfCompositeComp glyfCompositeComp : this.f59409c) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59410d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyfCompositeComp.getFirstIndex() <= i && glyphDescription != null && i < glyfCompositeComp.getFirstIndex() + glyphDescription.getPointCount()) {
                return glyfCompositeComp;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final GlyfCompositeComp m32927c(int i) {
        for (GlyfCompositeComp glyfCompositeComp : this.f59409c) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59410d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyfCompositeComp.getFirstContour() <= i && glyphDescription != null && i < glyfCompositeComp.getFirstContour() + glyphDescription.getContourCount()) {
                return glyfCompositeComp;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m32926d() {
        for (GlyfCompositeComp glyfCompositeComp : this.f59409c) {
            try {
                int glyphIndex = glyfCompositeComp.getGlyphIndex();
                GlyphData glyph = this.f59411e.getGlyph(glyphIndex);
                if (glyph != null) {
                    this.f59410d.put(Integer.valueOf(glyphIndex), glyph.getDescription());
                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    public int getComponentCount() {
        return this.f59409c.size();
    }

    @Override // com.tom_roush.fontbox.ttf.GlyfDescript, com.tom_roush.fontbox.ttf.GlyphDescription
    public int getContourCount() {
        if (this.f59415i < 0) {
            List list = this.f59409c;
            GlyfCompositeComp glyfCompositeComp = (GlyfCompositeComp) list.get(list.size() - 1);
            this.f59415i = glyfCompositeComp.getFirstContour() + ((GlyphDescription) this.f59410d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()))).getContourCount();
        }
        return this.f59415i;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getEndPtOfContours(int i) {
        GlyfCompositeComp m32927c = m32927c(i);
        if (m32927c != null) {
            return ((GlyphDescription) this.f59410d.get(Integer.valueOf(m32927c.getGlyphIndex()))).getEndPtOfContours(i - m32927c.getFirstContour()) + m32927c.getFirstIndex();
        }
        return 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public byte getFlags(int i) {
        GlyfCompositeComp m32928b = m32928b(i);
        if (m32928b != null) {
            return ((GlyphDescription) this.f59410d.get(Integer.valueOf(m32928b.getGlyphIndex()))).getFlags(i - m32928b.getFirstIndex());
        }
        return (byte) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public int getPointCount() {
        if (this.f59414h < 0) {
            List list = this.f59409c;
            GlyfCompositeComp glyfCompositeComp = (GlyfCompositeComp) list.get(list.size() - 1);
            GlyphDescription glyphDescription = (GlyphDescription) this.f59410d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyphDescription == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("GlyphDescription for index ");
                sb.append(glyfCompositeComp.getGlyphIndex());
                sb.append(" is null, returning 0");
                this.f59414h = 0;
            } else {
                this.f59414h = glyfCompositeComp.getFirstIndex() + glyphDescription.getPointCount();
            }
        }
        return this.f59414h;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getXCoordinate(int i) {
        GlyfCompositeComp m32928b = m32928b(i);
        if (m32928b != null) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59410d.get(Integer.valueOf(m32928b.getGlyphIndex()));
            int firstIndex = i - m32928b.getFirstIndex();
            return (short) (((short) m32928b.scaleX(glyphDescription.getXCoordinate(firstIndex), glyphDescription.getYCoordinate(firstIndex))) + m32928b.getXTranslate());
        }
        return (short) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public short getYCoordinate(int i) {
        GlyfCompositeComp m32928b = m32928b(i);
        if (m32928b != null) {
            GlyphDescription glyphDescription = (GlyphDescription) this.f59410d.get(Integer.valueOf(m32928b.getGlyphIndex()));
            int firstIndex = i - m32928b.getFirstIndex();
            return (short) (((short) m32928b.scaleY(glyphDescription.getXCoordinate(firstIndex), glyphDescription.getYCoordinate(firstIndex))) + m32928b.getYTranslate());
        }
        return (short) 0;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyphDescription
    public boolean isComposite() {
        return true;
    }

    @Override // com.tom_roush.fontbox.ttf.GlyfDescript, com.tom_roush.fontbox.ttf.GlyphDescription
    public void resolve() {
        if (this.f59413g || this.f59412f) {
            return;
        }
        this.f59412f = true;
        int i = 0;
        int i2 = 0;
        for (GlyfCompositeComp glyfCompositeComp : this.f59409c) {
            glyfCompositeComp.setFirstIndex(i);
            glyfCompositeComp.setFirstContour(i2);
            GlyphDescription glyphDescription = (GlyphDescription) this.f59410d.get(Integer.valueOf(glyfCompositeComp.getGlyphIndex()));
            if (glyphDescription != null) {
                glyphDescription.resolve();
                i += glyphDescription.getPointCount();
                i2 += glyphDescription.getContourCount();
            }
        }
        this.f59413g = true;
        this.f59412f = false;
    }
}