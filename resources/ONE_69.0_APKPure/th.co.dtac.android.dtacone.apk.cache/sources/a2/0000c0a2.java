package com.tom_roush.fontbox.ttf;

import com.tom_roush.fontbox.util.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class NamingTable extends TTFTable {
    public static final String TAG = "name";

    /* renamed from: e */
    public List f59536e;

    /* renamed from: f */
    public Map f59537f;

    /* renamed from: g */
    public String f59538g;

    /* renamed from: h */
    public String f59539h;

    /* renamed from: i */
    public String f59540i;

    public NamingTable(TrueTypeFont trueTypeFont) {
        super(trueTypeFont);
        this.f59538g = null;
        this.f59539h = null;
        this.f59540i = null;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFTable
    /* renamed from: a */
    public void mo32840a(TrueTypeFont trueTypeFont, AbstractC22342tR1 abstractC22342tR1) {
        abstractC22342tR1.mo22679t();
        int mo22679t = abstractC22342tR1.mo22679t();
        abstractC22342tR1.mo22679t();
        this.f59536e = new ArrayList(mo22679t);
        for (int i = 0; i < mo22679t; i++) {
            NameRecord nameRecord = new NameRecord();
            nameRecord.m32889a(trueTypeFont, abstractC22342tR1);
            this.f59536e.add(nameRecord);
        }
        for (NameRecord nameRecord2 : this.f59536e) {
            if (nameRecord2.getStringOffset() > getLength()) {
                nameRecord2.setString(null);
            } else {
                abstractC22342tR1.seek(getOffset() + 6 + (mo22679t * 12) + nameRecord2.getStringOffset());
                int platformId = nameRecord2.getPlatformId();
                int platformEncodingId = nameRecord2.getPlatformEncodingId();
                Charset charset = Charsets.ISO_8859_1;
                if (platformId == 3 && (platformEncodingId == 0 || platformEncodingId == 1)) {
                    charset = Charsets.UTF_16;
                } else if (platformId == 0) {
                    charset = Charsets.UTF_16;
                } else if (platformId == 2) {
                    if (platformEncodingId != 0) {
                        if (platformEncodingId == 1) {
                            charset = Charsets.ISO_10646;
                        }
                    } else {
                        charset = Charsets.US_ASCII;
                    }
                }
                nameRecord2.setString(abstractC22342tR1.m22684o(nameRecord2.getStringLength(), charset));
            }
        }
        this.f59537f = new HashMap(this.f59536e.size());
        for (NameRecord nameRecord3 : this.f59536e) {
            Map map = (Map) this.f59537f.get(Integer.valueOf(nameRecord3.getNameId()));
            if (map == null) {
                map = new HashMap();
                this.f59537f.put(Integer.valueOf(nameRecord3.getNameId()), map);
            }
            Map map2 = (Map) map.get(Integer.valueOf(nameRecord3.getPlatformId()));
            if (map2 == null) {
                map2 = new HashMap();
                map.put(Integer.valueOf(nameRecord3.getPlatformId()), map2);
            }
            Map map3 = (Map) map2.get(Integer.valueOf(nameRecord3.getPlatformEncodingId()));
            if (map3 == null) {
                map3 = new HashMap();
                map2.put(Integer.valueOf(nameRecord3.getPlatformEncodingId()), map3);
            }
            map3.put(Integer.valueOf(nameRecord3.getLanguageId()), nameRecord3.getString());
        }
        this.f59538g = m32888f(1);
        this.f59539h = m32888f(2);
        String name = getName(6, 1, 0, 0);
        this.f59540i = name;
        if (name == null) {
            this.f59540i = getName(6, 3, 1, 1033);
        }
        String str = this.f59540i;
        if (str != null) {
            this.f59540i = str.trim();
        }
        this.initialized = true;
    }

    /* renamed from: f */
    public final String m32888f(int i) {
        for (int i2 = 4; i2 >= 0; i2--) {
            String name = getName(i, 0, i2, 0);
            if (name != null) {
                return name;
            }
        }
        String name2 = getName(i, 3, 1, 1033);
        if (name2 != null) {
            return name2;
        }
        return getName(i, 1, 0, 0);
    }

    public String getFontFamily() {
        return this.f59538g;
    }

    public String getFontSubFamily() {
        return this.f59539h;
    }

    public String getName(int i, int i2, int i3, int i4) {
        Map map;
        Map map2;
        Map map3 = (Map) this.f59537f.get(Integer.valueOf(i));
        if (map3 == null || (map = (Map) map3.get(Integer.valueOf(i2))) == null || (map2 = (Map) map.get(Integer.valueOf(i3))) == null) {
            return null;
        }
        return (String) map2.get(Integer.valueOf(i4));
    }

    public List<NameRecord> getNameRecords() {
        return this.f59536e;
    }

    public String getPostScriptName() {
        return this.f59540i;
    }
}