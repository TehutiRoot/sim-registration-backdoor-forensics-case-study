package com.tom_roush.fontbox.ttf;

import java.util.List;

/* loaded from: classes5.dex */
public class SubstitutingCmapLookup implements CmapLookup {

    /* renamed from: a */
    public final CmapSubtable f59580a;

    /* renamed from: b */
    public final GlyphSubstitutionTable f59581b;

    /* renamed from: c */
    public final List f59582c;

    public SubstitutingCmapLookup(CmapSubtable cmapSubtable, GlyphSubstitutionTable glyphSubstitutionTable, List<String> list) {
        this.f59580a = cmapSubtable;
        this.f59581b = glyphSubstitutionTable;
        this.f59582c = list;
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public List<Integer> getCharCodes(int i) {
        return this.f59580a.getCharCodes(this.f59581b.getUnsubstitution(i));
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public int getGlyphId(int i) {
        return this.f59581b.getSubstitution(this.f59580a.getGlyphId(i), OpenTypeScript.getScriptTags(i), this.f59582c);
    }
}
