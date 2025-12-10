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

/* renamed from: ws0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22932ws0 {

    /* renamed from: b */
    public static final Charset f108582b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final FileStore f108583a;

    /* renamed from: ws0$a */
    /* loaded from: classes4.dex */
    public class C17011a extends JSONObject {

        /* renamed from: a */
        public final /* synthetic */ String f108584a;

        public C17011a(String str) {
            this.f108584a = str;
            put("userId", str);
        }
    }

    public C22932ws0(FileStore fileStore) {
        this.f108583a = fileStore;
    }

    /* renamed from: e */
    public static Map m643e(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m632p(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: f */
    public static List m642f(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.m38912a(string));
            } catch (Exception e) {
                Logger logger = Logger.getLogger();
                logger.m39123w("Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static String m640h(Map map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: l */
    public static String m636l(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (JSONException e) {
                Logger.getLogger().m39123w("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: m */
    public static void m635m(File file) {
        if (file.exists() && file.delete()) {
            Logger logger = Logger.getLogger();
            logger.m39128i("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: n */
    public static void m634n(File file, String str) {
        if (file.exists() && file.delete()) {
            Logger.getLogger().m39128i(String.format("Deleted corrupt file: %s\nReason: %s", file.getAbsolutePath(), str));
        }
    }

    /* renamed from: o */
    public static String m633o(String str) {
        return new C17011a(str).toString();
    }

    /* renamed from: p */
    public static String m632p(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    /* renamed from: a */
    public File m647a(String str) {
        return this.f108583a.getSessionFile(str, UserMetadata.INTERNAL_KEYDATA_FILENAME);
    }

    /* renamed from: b */
    public File m646b(String str) {
        return this.f108583a.getSessionFile(str, UserMetadata.KEYDATA_FILENAME);
    }

    /* renamed from: c */
    public File m645c(String str) {
        return this.f108583a.getSessionFile(str, UserMetadata.ROLLOUTS_STATE_FILENAME);
    }

    /* renamed from: d */
    public File m644d(String str) {
        return this.f108583a.getSessionFile(str, UserMetadata.USERDATA_FILENAME);
    }

    /* renamed from: g */
    public final String m641g(String str) {
        return m632p(new JSONObject(str), "userId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [long] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable] */
    /* renamed from: i */
    public Map m639i(String str, boolean z) {
        File m646b;
        Throwable th2;
        FileInputStream fileInputStream;
        Exception e;
        if (z) {
            m646b = m647a(str);
        } else {
            m646b = m646b(str);
        }
        if (m646b.exists()) {
            ?? length = m646b.length();
            if (length != 0) {
                try {
                    try {
                        fileInputStream = new FileInputStream(m646b);
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
                        Map m643e = m643e(CommonUtils.streamToString(fileInputStream));
                        CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                        return m643e;
                    } catch (Exception e3) {
                        e = e3;
                        Logger.getLogger().m39123w("Error deserializing user metadata.", e);
                        m635m(m646b);
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
        m634n(m646b, "The file has a length of zero for session: " + str);
        return Collections.emptyMap();
    }

    /* renamed from: j */
    public List m638j(String str) {
        File m645c = m645c(str);
        if (m645c.exists() && m645c.length() != 0) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(m645c);
                    try {
                        List m642f = m642f(CommonUtils.streamToString(fileInputStream2));
                        Logger logger = Logger.getLogger();
                        logger.m39132d("Loaded rollouts state:\n" + m642f + "\nfor session " + str);
                        CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                        return m642f;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        Logger.getLogger().m39123w("Error deserializing rollouts state.", e);
                        m635m(m645c);
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
            m634n(m645c, "The file has a length of zero for session: " + str);
            return Collections.emptyList();
        }
    }

    /* renamed from: k */
    public String m637k(String str) {
        FileInputStream fileInputStream;
        File m644d = m644d(str);
        FileInputStream fileInputStream2 = null;
        if (m644d.exists() && m644d.length() != 0) {
            try {
                fileInputStream = new FileInputStream(m644d);
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
                    String m641g = m641g(CommonUtils.streamToString(fileInputStream));
                    Logger.getLogger().m39132d("Loaded userId " + m641g + " for session " + str);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return m641g;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Logger.getLogger().m39123w("Error deserializing user metadata.", e);
                m635m(m644d);
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return null;
            }
        }
        Logger.getLogger().m39132d("No userId set for session " + str);
        m635m(m644d);
        return null;
    }

    /* renamed from: q */
    public void m631q(String str, Map map) {
        m630r(str, map, false);
    }

    /* renamed from: r */
    public void m630r(String str, Map map, boolean z) {
        File m646b;
        if (z) {
            m646b = m647a(str);
        } else {
            m646b = m646b(str);
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m640h = m640h(map);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m646b), f108582b));
                try {
                    bufferedWriter2.write(m640h);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m39123w("Error serializing key/value metadata.", e);
                    m635m(m646b);
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
    public void m629s(String str, List list) {
        Throwable th2;
        BufferedWriter bufferedWriter;
        Exception e;
        String m636l;
        File m645c = m645c(str);
        ?? isEmpty = list.isEmpty();
        if (isEmpty != 0) {
            m634n(m645c, "Rollout state is empty for session: " + str);
            return;
        }
        try {
            try {
                m636l = m636l(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m645c), f108582b));
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
                bufferedWriter.write(m636l);
                bufferedWriter.flush();
                isEmpty = bufferedWriter;
            } catch (Exception e3) {
                e = e3;
                Logger.getLogger().m39123w("Error serializing rollouts state.", e);
                m635m(m645c);
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
    public void m628t(String str, String str2) {
        File m644d = m644d(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String m633o = m633o(str2);
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(m644d), f108582b));
                try {
                    bufferedWriter2.write(m633o);
                    bufferedWriter2.flush();
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.getLogger().m39123w("Error serializing user metadata.", e);
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