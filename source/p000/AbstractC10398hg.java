package p000;

import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.cmap.CMapParser;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hg */
/* loaded from: classes5.dex */
public abstract class AbstractC10398hg {

    /* renamed from: a */
    public static Map f62546a = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static CMap m30791a(String str) {
        CMap cMap = (CMap) f62546a.get(str);
        if (cMap != null) {
            return cMap;
        }
        CMap parsePredefined = new CMapParser().parsePredefined(str);
        f62546a.put(parsePredefined.getName(), parsePredefined);
        return parsePredefined;
    }

    /* renamed from: b */
    public static CMap m30790b(InputStream inputStream) {
        if (inputStream != null) {
            return new CMapParser(true).parse(inputStream);
        }
        return null;
    }
}
