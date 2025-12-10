package p000;

import com.tom_roush.fontbox.cmap.CMap;
import com.tom_roush.fontbox.cmap.CMapParser;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hg */
/* loaded from: classes5.dex */
public abstract class AbstractC10381hg {

    /* renamed from: a */
    public static Map f62574a = Collections.synchronizedMap(new HashMap());

    /* renamed from: a */
    public static CMap m31137a(String str) {
        CMap cMap = (CMap) f62574a.get(str);
        if (cMap != null) {
            return cMap;
        }
        CMap parsePredefined = new CMapParser().parsePredefined(str);
        f62574a.put(parsePredefined.getName(), parsePredefined);
        return parsePredefined;
    }

    /* renamed from: b */
    public static CMap m31136b(InputStream inputStream) {
        if (inputStream != null) {
            return new CMapParser(true).parse(inputStream);
        }
        return null;
    }
}