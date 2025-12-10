package p000;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qs0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21831qs0 {

    /* renamed from: b */
    public static final Charset f77092b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final FileStore f77093a;

    /* renamed from: qs0$a */
    /* loaded from: classes4.dex */
    public class C13213a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f77094a;

        public C13213a(String str) {
            this.f77094a = str;
            put("userId", str);
        }
    }

    public C21831qs0(FileStore fileStore) {
        this.f77093a = fileStore;
    }

    /* renamed from: e */
    public static Map m23423e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m23412p(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static List m23422f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.m38920a(string));
            } catch (Exception e) {
                Logger logger = Logger.getLogger();
                logger.m39131w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static String m23420h(Map map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: l */
    public static String m23416l(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (JSONException e) {
                Logger.getLogger().m39131w("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: m */
    public static void m23415m(File file) {
        if (file.exists() && file.delete()) {
            Logger logger = Logger.getLogger();
            logger.m39136i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: n */
    public static void m23414n(File file, String str) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().m39136i(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    /* renamed from: o */
    public static String m23413o(String str) {
        return new C13213a(str).toString();
    }

    /* renamed from: p */
    public static String m23412p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m23427a(String str) {
        return this.f77093a.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    /* renamed from: b */
    public File m23426b(String str) {
        return this.f77093a.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    /* renamed from: c */
    public File m23425c(String str) {
        return this.f77093a.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    /* renamed from: d */
    public File m23424d(String str) {
        return this.f77093a.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    /* renamed from: g */
    public final String m23421g(String str) {
        return m23412p(new JSONObject(str), "userId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* renamed from: i */
    public Map m23419i(String str, boolean z) {
        File m23426b;
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e;
        if (z) {
            m23426b = m23427a(str);
        } else {
            m23426b = m23426b(str);
        }
        if (m23426b.exists()) {
            ?? length = m23426b.length();
            if (length != 0) {
                try {
                    try {
                        fileInputStream = new FileInputStream(m23426b);
                    } catch (Exception e2) {
                        fileInputStream = null;
                        e = e2;
                    } catch (Throwable th3) {
                        length = 0;
                        th2 = th3;
                        CommonUtils.closeOrLog(length, "Failed to close user metadata file.");
                        throw th2;
                    }
                    try {
                        Map m23423e = m23423e(CommonUtils.streamToString(fileInputStream));
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                        return m23423e;
                    } catch (Exception e3) {
                        e = e3;
                        Logger.getLogger().m39131w("Error deserializing user metadata.", e);
                        m23415m(m23426b);
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                        return Collections.emptyMap();
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    CommonUtils.closeOrLog(length, "Failed to close user metadata file.");
                    throw th2;
                }
            }
        }
        m23414n(m23426b, "The file has a length of zero for session: " + str);
        return Collections.emptyMap();
    }

    /* renamed from: j */
    public List m23418j(String str) {
        File m23425c = m23425c(str);
        if (m23425c.exists() && m23425c.length() != 0) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(m23425c);
                    try {
                        List m23422f = m23422f(CommonUtils.streamToString(fileInputStream2));
                        Logger logger = Logger.getLogger();
                        logger.m39140d("Loaded rollouts state:\n" + m23422f + "\nfor session " + str);
                        CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                        return m23422f;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        Logger.getLogger().m39131w("Error deserializing rollouts state.", e);
                        m23415m(m23425c);
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                        return Collections.emptyList();
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } else {
            m23414n(m23425c, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
    }

    /* renamed from: k */
    public String m23417k(String str) {
        FileInputStream fileInputStream;
        File m23424d = m23424d(str);
        FileInputStream fileInputStream2 = null;
        if (m23424d.exists() && m23424d.length() != 0) {
            try {
                fileInputStream = new FileInputStream(m23424d);
            } catch (Exception e) {
                e = e;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
            try {
                try {
                    String m23421g = m23421g(CommonUtils.streamToString(fileInputStream));
                    Logger.getLogger().m39140d("Loaded userId " + m23421g + " for session " + str);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return m23421g;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Logger.getLogger().m39131w("Error deserializing user metadata.", e);
                m23415m(m23424d);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        Logger.getLogger().m39140d("No userId set for session " + str);
        m23415m(m23424d);
        return null;
    }

    /* renamed from: q */
    public void m23411q(String str, Map map) {
        m23410r(str, map, false);
    }

    /* renamed from: r */
    public void m23410r(String str, Map map, boolean z) {
        File m23426b;
        if (z) {
            m23426b = m23427a(str);
        } else {
            m23426b = m23426b(str);
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m23420h = m23420h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m23426b), f77092b));
                try {
                    bufferedWriter2.write(m23420h);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m39131w("Error serializing key/value metadata.", e);
                    m23415m(m23426b);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: s */
    public void m23409s(String str, List list) {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e;
        String m23416l;
        File m23425c = m23425c(str);
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            m23414n(m23425c, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                m23416l = m23416l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m23425c), f77092b));
            } catch (Exception e2) {
                bufferedWriter = null;
                e = e2;
            } catch (Throwable th3) {
                isEmpty = 0;
                th2 = th3;
                CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
                throw th2;
            }
            try {
                bufferedWriter.write(m23416l);
                bufferedWriter.flush();
                isEmpty = bufferedWriter;
            } catch (Exception e3) {
                e = e3;
                Logger.getLogger().m39131w("Error serializing rollouts state.", e);
                m23415m(m23425c);
                isEmpty = bufferedWriter;
                CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
            }
            CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
        } catch (Throwable th4) {
            th2 = th4;
            CommonUtils.closeOrLog(isEmpty, "Failed to close rollouts state file.");
            throw th2;
        }
    }

    /* renamed from: t */
    public void m23408t(String str, String str2) {
        File m23424d = m23424d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m23413o = m23413o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m23424d), f77092b));
                try {
                    bufferedWriter2.write(m23413o);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m39131w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
