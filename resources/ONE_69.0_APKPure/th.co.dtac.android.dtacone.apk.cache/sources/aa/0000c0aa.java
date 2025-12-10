package com.tom_roush.fontbox.ttf;

import java.util.List;

/* loaded from: classes5.dex */
public class SubstitutingCmapLookup implements CmapLookup {

    /* renamed from: a */
    public final CmapSubtable f59592a;

    /* renamed from: b */
    public final GlyphSubstitutionTable f59593b;

    /* renamed from: c */
    public final List f59594c;

    public SubstitutingCmapLookup(CmapSubtable cmapSubtable, GlyphSubstitutionTable glyphSubstitutionTable, List<String> list) {
        this.f59592a = cmapSubtable;
        this.f59593b = glyphSubstitutionTable;
        this.f59594c = list;
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public List<Integer> getCharCodes(int i) {
        return this.f59592a.getCharCodes(this.f59593b.getUnsubstitution(i));
    }

    @Override // com.tom_roush.fontbox.ttf.CmapLookup
    public int getGlyphId(int i) {
        return this.f59593b.getSubstitution(this.f59592a.getGlyphId(i), OpenTypeScript.getScriptTags(i), this.f59594c);
    }
}