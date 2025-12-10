package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.annotation.WorkerThread;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.mlkit.common.sdkinternal.Constants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.BufferedSource;
import okio.Okio;
import org.json.JSONObject;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes3.dex */
public class LottieCompositionFactory {

    /* renamed from: a */
    public static final Map f40931a = new HashMap();

    /* renamed from: b */
    public static final Set f40932b = new HashSet();

    /* renamed from: c */
    public static final byte[] f40933c = {80, 75, 3, 4};

    /* renamed from: A */
    public static /* synthetic */ LottieResult m50996A(WeakReference weakReference, Context context, int i, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i, str);
    }

    /* renamed from: B */
    public static /* synthetic */ LottieResult m50995B(Context context, String str, String str2) {
        LottieResult<LottieComposition> fetchSync = C5655L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    /* renamed from: D */
    public static void m50993D(boolean z) {
        ArrayList arrayList = new ArrayList(f40932b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((LottieTaskIdleListener) arrayList.get(i)).onIdleChanged(z);
        }
    }

    /* renamed from: E */
    public static String m50992E(Context context, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        if (m50975q(context)) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public static /* synthetic */ LottieResult m50991a(WeakReference weakReference, Context context, int i, String str) {
        return m50996A(weakReference, context, i, str);
    }

    /* renamed from: b */
    public static /* synthetic */ LottieResult m50990b(String str, String str2) {
        return fromJsonStringSync(str, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ LottieResult m50989c(Context context, String str, String str2) {
        return m50995B(context, str, str2);
    }

    public static void clearCache(Context context) {
        f40931a.clear();
        LottieCompositionCache.getInstance().clear();
        NetworkCache networkCache = C5655L.networkCache(context);
        if (networkCache != null) {
            networkCache.clear();
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m50988d(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        m50973s(str, atomicBoolean, th2);
    }

    /* renamed from: e */
    public static /* synthetic */ LottieResult m50987e(InputStream inputStream, String str) {
        return fromJsonInputStreamSync(inputStream, str);
    }

    /* renamed from: f */
    public static /* synthetic */ LottieResult m50986f(JSONObject jSONObject, String str) {
        return fromJsonSync(jSONObject, str);
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @Deprecated
    public static LottieTask<LottieComposition> fromJson(final JSONObject jSONObject, @Nullable final String str) {
        return m50980l(str, new Callable() { // from class: Um0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50986f(jSONObject, str);
            }
        });
    }

    public static LottieTask<LottieComposition> fromJsonInputStream(final InputStream inputStream, @Nullable final String str) {
        return m50980l(str, new Callable() { // from class: Tm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50987e(inputStream, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonInputStreamSync(InputStream inputStream, @Nullable String str) {
        return m50978n(inputStream, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonReader(final JsonReader jsonReader, @Nullable final String str) {
        return m50980l(str, new Callable() { // from class: Wm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50985g(JsonReader.this, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonReaderSync(JsonReader jsonReader, @Nullable String str) {
        return m50977o(jsonReader, str, true);
    }

    public static LottieTask<LottieComposition> fromJsonString(final String str, @Nullable final String str2) {
        return m50980l(str2, new Callable() { // from class: Vm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50990b(str, str2);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromJsonStringSync(String str, @Nullable String str2) {
        return fromJsonReaderSync(JsonReader.m50686of(Okio.buffer(Okio.source(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @WorkerThread
    @Deprecated
    public static LottieResult<LottieComposition> fromJsonSync(JSONObject jSONObject, @Nullable String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes int i) {
        return fromRawRes(context, i, m50992E(context, i));
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i) {
        return fromRawResSync(context, i, m50992E(context, i));
    }

    public static LottieTask<LottieComposition> fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static LottieTask<LottieComposition> fromZipStream(ZipInputStream zipInputStream, @Nullable String str) {
        return fromZipStream(null, zipInputStream, str);
    }

    public static LottieResult<LottieComposition> fromZipStreamSync(ZipInputStream zipInputStream, @Nullable String str) {
        return fromZipStreamSync(null, zipInputStream, str);
    }

    /* renamed from: g */
    public static /* synthetic */ LottieResult m50985g(JsonReader jsonReader, String str) {
        return fromJsonReaderSync(jsonReader, str);
    }

    /* renamed from: h */
    public static /* synthetic */ LottieResult m50984h(Context context, ZipInputStream zipInputStream, String str) {
        return fromZipStreamSync(context, zipInputStream, str);
    }

    /* renamed from: i */
    public static /* synthetic */ LottieResult m50983i(Context context, String str, String str2) {
        return fromAssetSync(context, str, str2);
    }

    /* renamed from: l */
    public static LottieTask m50980l(final String str, Callable callable) {
        final LottieComposition lottieComposition;
        if (str == null) {
            lottieComposition = null;
        } else {
            lottieComposition = LottieCompositionCache.getInstance().get(str);
        }
        if (lottieComposition != null) {
            return new LottieTask(new Callable() { // from class: an0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieResult m50972t;
                    m50972t = LottieCompositionFactory.m50972t(LottieComposition.this);
                    return m50972t;
                }
            });
        }
        if (str != null) {
            Map map = f40931a;
            if (map.containsKey(str)) {
                return (LottieTask) map.get(str);
            }
        }
        LottieTask lottieTask = new LottieTask(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            lottieTask.addListener(new LottieListener() { // from class: bn0
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    LottieCompositionFactory.m50971u(str, atomicBoolean, (LottieComposition) obj);
                }
            });
            lottieTask.addFailureListener(new LottieListener() { // from class: Sm0
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    LottieCompositionFactory.m50988d(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f40931a;
                map2.put(str, lottieTask);
                if (map2.size() == 1) {
                    m50993D(false);
                }
            }
        }
        return lottieTask;
    }

    /* renamed from: m */
    public static LottieImageAsset m50979m(LottieComposition lottieComposition, String str) {
        for (LottieImageAsset lottieImageAsset : lottieComposition.getImages().values()) {
            if (lottieImageAsset.getFileName().equals(str)) {
                return lottieImageAsset;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static LottieResult m50978n(InputStream inputStream, String str, boolean z) {
        try {
            return fromJsonReaderSync(JsonReader.m50686of(Okio.buffer(Okio.source(inputStream))), str);
        } finally {
            if (z) {
                Utils.closeQuietly(inputStream);
            }
        }
    }

    /* renamed from: o */
    public static LottieResult m50977o(JsonReader jsonReader, String str, boolean z) {
        try {
            try {
                LottieComposition parse = LottieCompositionMoshiParser.parse(jsonReader);
                if (str != null) {
                    LottieCompositionCache.getInstance().put(str, parse);
                }
                LottieResult lottieResult = new LottieResult(parse);
                if (z) {
                    Utils.closeQuietly(jsonReader);
                }
                return lottieResult;
            } catch (Exception e) {
                LottieResult lottieResult2 = new LottieResult((Throwable) e);
                if (z) {
                    Utils.closeQuietly(jsonReader);
                }
                return lottieResult2;
            }
        } catch (Throwable th2) {
            if (z) {
                Utils.closeQuietly(jsonReader);
            }
            throw th2;
        }
    }

    /* renamed from: p */
    public static LottieResult m50976p(Context context, ZipInputStream zipInputStream, String str) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            LottieComposition lottieComposition = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase(Constants.AUTOML_IMAGE_LABELING_MANIFEST_JSON_FILE_NAME)) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    lottieComposition = (LottieComposition) m50977o(JsonReader.m50686of(Okio.buffer(Okio.source(zipInputStream))), null, false).getValue();
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(BitmapUtil.IMAGE_JPG_EXTENSION) && !name.contains(".jpeg")) {
                        if (!name.contains(".ttf") && !name.contains(".otf")) {
                            zipInputStream.closeEntry();
                        }
                        String[] split = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                        String str2 = split[split.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface createFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            Logger.warning("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        hashMap2.put(str3, createFromFile);
                    }
                    String[] split2 = name.split(RemoteSettings.FORWARD_SLASH_STRING);
                    hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (lottieComposition == null) {
                return new LottieResult((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                LottieImageAsset m50979m = m50979m(lottieComposition, (String) entry.getKey());
                if (m50979m != null) {
                    m50979m.setBitmap(Utils.resizeBitmapIfNeeded((Bitmap) entry.getValue(), m50979m.getWidth(), m50979m.getHeight()));
                }
            }
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                boolean z = false;
                for (Font font : lottieComposition.getFonts().values()) {
                    if (font.getFamily().equals(entry2.getKey())) {
                        font.setTypeface((Typeface) entry2.getValue());
                        z = true;
                    }
                }
                if (!z) {
                    Logger.warning("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
                }
            }
            if (hashMap.isEmpty()) {
                for (Map.Entry<String, LottieImageAsset> entry3 : lottieComposition.getImages().entrySet()) {
                    LottieImageAsset value = entry3.getValue();
                    if (value == null) {
                        return null;
                    }
                    String fileName = value.getFileName();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = SyslogConstants.LOG_LOCAL4;
                    if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
                        try {
                            byte[] decode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                            value.setBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                        } catch (IllegalArgumentException e) {
                            Logger.warning("data URL did not have correct base64 format.", e);
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, LottieImageAsset> entry4 : lottieComposition.getImages().entrySet()) {
                if (entry4.getValue().getBitmap() == null) {
                    return new LottieResult((Throwable) new IllegalStateException("There is no image for " + entry4.getValue().getFileName()));
                }
            }
            if (str != null) {
                LottieCompositionCache.getInstance().put(str, lottieComposition);
            }
            return new LottieResult(lottieComposition);
        } catch (IOException e2) {
            return new LottieResult((Throwable) e2);
        }
    }

    /* renamed from: q */
    public static boolean m50975q(Context context) {
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static Boolean m50974r(BufferedSource bufferedSource) {
        try {
            BufferedSource peek = bufferedSource.peek();
            for (byte b : f40933c) {
                if (peek.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            Logger.error("Failed to check zip file header", e);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static void registerLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        boolean z;
        f40932b.add(lottieTaskIdleListener);
        if (f40931a.size() == 0) {
            z = true;
        } else {
            z = false;
        }
        lottieTaskIdleListener.onIdleChanged(z);
    }

    /* renamed from: s */
    public static /* synthetic */ void m50973s(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map map = f40931a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m50993D(true);
        }
    }

    public static void setMaxCacheSize(int i) {
        LottieCompositionCache.getInstance().resize(i);
    }

    /* renamed from: t */
    public static /* synthetic */ LottieResult m50972t(LottieComposition lottieComposition) {
        return new LottieResult(lottieComposition);
    }

    /* renamed from: u */
    public static /* synthetic */ void m50971u(String str, AtomicBoolean atomicBoolean, LottieComposition lottieComposition) {
        Map map = f40931a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            m50993D(true);
        }
    }

    public static void unregisterLottieTaskIdleListener(LottieTaskIdleListener lottieTaskIdleListener) {
        f40932b.remove(lottieTaskIdleListener);
    }

    public static LottieTask<LottieComposition> fromRawRes(Context context, @RawRes final int i, @Nullable final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m50980l(str, new Callable() { // from class: Zm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50991a(weakReference, applicationContext, i, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromRawResSync(Context context, @RawRes int i, @Nullable String str) {
        try {
            BufferedSource buffer = Okio.buffer(Okio.source(context.getResources().openRawResource(i)));
            if (m50974r(buffer).booleanValue()) {
                return fromZipStreamSync(context, new ZipInputStream(buffer.inputStream()), str);
            }
            return fromJsonInputStreamSync(buffer.inputStream(), str);
        } catch (Resources.NotFoundException e) {
            return new LottieResult<>(e);
        }
    }

    public static LottieTask<LottieComposition> fromUrl(final Context context, final String str, @Nullable final String str2) {
        return m50980l(str2, new Callable() { // from class: Rm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50989c(context, str, str2);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromUrlSync(Context context, String str, @Nullable String str2) {
        LottieResult<LottieComposition> fetchSync = C5655L.networkFetcher(context).fetchSync(context, str, str2);
        if (str2 != null && fetchSync.getValue() != null) {
            LottieCompositionCache.getInstance().put(str2, fetchSync.getValue());
        }
        return fetchSync;
    }

    public static LottieTask<LottieComposition> fromZipStream(final Context context, final ZipInputStream zipInputStream, @Nullable final String str) {
        return m50980l(str, new Callable() { // from class: Ym0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50984h(context, zipInputStream, str);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromZipStreamSync(@Nullable Context context, ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return m50976p(context, zipInputStream, str);
        } finally {
            Utils.closeQuietly(zipInputStream);
        }
    }

    public static LottieTask<LottieComposition> fromAsset(Context context, final String str, @Nullable final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return m50980l(str2, new Callable() { // from class: Xm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieCompositionFactory.m50983i(applicationContext, str, str2);
            }
        });
    }

    @WorkerThread
    public static LottieResult<LottieComposition> fromAssetSync(Context context, String str, @Nullable String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return fromJsonInputStreamSync(context.getAssets().open(str), str2);
            }
            return fromZipStreamSync(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            return new LottieResult<>(e);
        }
    }
}
