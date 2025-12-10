package io.opencensus.resource;

import io.opencensus.internal.StringUtils;
import io.opencensus.internal.Utils;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Resource {

    /* renamed from: a */
    public static final String f63635a = m30543f(System.getenv("OC_RESOURCE_TYPE"));

    /* renamed from: b */
    public static final Map f63636b = m30544e(System.getenv("OC_RESOURCE_LABELS"));

    /* renamed from: a */
    public static Resource m30548a(String str, Map map) {
        return new C1272S8(str, map);
    }

    /* renamed from: b */
    public static boolean m30547b(String str) {
        if (str.length() <= 255 && StringUtils.isPrintableString(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m30546c(String str) {
        if (!str.isEmpty() && m30547b(str)) {
            return true;
        }
        return false;
    }

    public static Resource create(@Nullable String str, Map<String, String> map) {
        return m30548a(str, Collections.unmodifiableMap(new LinkedHashMap((Map) Utils.checkNotNull(map, "labels"))));
    }

    public static Resource createFromEnvironmentVariables() {
        return m30548a(f63635a, f63636b);
    }

    /* renamed from: d */
    public static Resource m30545d(Resource resource, Resource resource2) {
        String type;
        if (resource2 == null) {
            return resource;
        }
        if (resource == null) {
            return resource2;
        }
        if (resource.getType() != null) {
            type = resource.getType();
        } else {
            type = resource2.getType();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(resource2.getLabels());
        for (Map.Entry<String, String> entry : resource.getLabels().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return m30548a(type, Collections.unmodifiableMap(linkedHashMap));
    }

    /* renamed from: e */
    public static Map m30544e(String str) {
        if (str == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str2 : str.split(",", -1)) {
            String[] split = str2.split("=", -1);
            if (split.length == 2) {
                String trim = split[0].trim();
                String replaceAll = split[1].trim().replaceAll("^\"|\"$", "");
                Utils.checkArgument(m30546c(trim), "Label key should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
                Utils.checkArgument(m30547b(replaceAll), "Label value should be a ASCII string with a length not exceed 255 characters.");
                hashMap.put(trim, replaceAll);
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: f */
    public static String m30543f(String str) {
        if (str != null && !str.isEmpty()) {
            Utils.checkArgument(m30546c(str), "Type should be a ASCII string with a length greater than 0 and not exceed 255 characters.");
            return str.trim();
        }
        return str;
    }

    @Nullable
    public static Resource mergeResources(List<Resource> list) {
        Resource resource = null;
        for (Resource resource2 : list) {
            resource = m30545d(resource, resource2);
        }
        return resource;
    }

    public abstract Map<String, String> getLabels();

    @Nullable
    public abstract String getType();
}