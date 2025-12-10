package com.airbnb.lottie.parser;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.Marker;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import io.realm.CollectionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class LottieCompositionMoshiParser {

    /* renamed from: a */
    public static final JsonReader.Options f41547a = JsonReader.Options.m50685of(OperatorName.SET_LINE_WIDTH, OperatorName.CLOSE_PATH, "ip", "op", "fr", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    public static JsonReader.Options f41548b = JsonReader.Options.m50685of("id", "layers", OperatorName.SET_LINE_WIDTH, OperatorName.CLOSE_PATH, "p", "u");

    /* renamed from: c */
    public static final JsonReader.Options f41549c = JsonReader.Options.m50685of(CollectionUtils.LIST_TYPE);

    /* renamed from: d */
    public static final JsonReader.Options f41550d = JsonReader.Options.m50685of(OperatorName.CONCAT, "tm", "dr");

    /* renamed from: a */
    public static void m50696a(JsonReader jsonReader, LottieComposition lottieComposition, Map map, Map map2) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(f41548b);
                if (selectName != 0) {
                    if (selectName != 1) {
                        if (selectName != 2) {
                            if (selectName != 3) {
                                if (selectName != 4) {
                                    if (selectName != 5) {
                                        jsonReader.skipName();
                                        jsonReader.skipValue();
                                    } else {
                                        str3 = jsonReader.nextString();
                                    }
                                } else {
                                    str2 = jsonReader.nextString();
                                }
                            } else {
                                i2 = jsonReader.nextInt();
                            }
                        } else {
                            i = jsonReader.nextInt();
                        }
                    } else {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
                            longSparseArray.put(parse.getId(), parse);
                            arrayList.add(parse);
                        }
                        jsonReader.endArray();
                    }
                } else {
                    str = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            if (str2 != null) {
                LottieImageAsset lottieImageAsset = new LottieImageAsset(i, i2, str, str2, str3);
                map2.put(lottieImageAsset.getId(), lottieImageAsset);
            } else {
                map.put(str, arrayList);
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: b */
    public static void m50695b(JsonReader jsonReader, LottieComposition lottieComposition, SparseArrayCompat sparseArrayCompat) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            FontCharacter m65692a = W30.m65692a(jsonReader, lottieComposition);
            sparseArrayCompat.put(m65692a.hashCode(), m65692a);
        }
        jsonReader.endArray();
    }

    /* renamed from: c */
    public static void m50694c(JsonReader jsonReader, Map map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f41549c) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    Font m65269a = Z30.m65269a(jsonReader);
                    map.put(m65269a.getName(), m65269a);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: d */
    public static void m50693d(JsonReader jsonReader, LottieComposition lottieComposition, List list, LongSparseArray longSparseArray) {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            Layer parse = LayerParser.parse(jsonReader, lottieComposition);
            if (parse.getLayerType() == Layer.LayerType.IMAGE) {
                i++;
            }
            list.add(parse);
            longSparseArray.put(parse.getId(), parse);
            if (i > 4) {
                Logger.warning("You have " + i + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        jsonReader.endArray();
    }

    /* renamed from: e */
    public static void m50692e(JsonReader jsonReader, List list) {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float f = 0.0f;
            String str = null;
            float f2 = 0.0f;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(f41550d);
                if (selectName != 0) {
                    if (selectName != 1) {
                        if (selectName != 2) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            f2 = (float) jsonReader.nextDouble();
                        }
                    } else {
                        f = (float) jsonReader.nextDouble();
                    }
                } else {
                    str = jsonReader.nextString();
                }
            }
            jsonReader.endObject();
            list.add(new Marker(str, f, f2));
        }
        jsonReader.endArray();
    }

    public static LottieComposition parse(JsonReader jsonReader) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        JsonReader jsonReader2 = jsonReader;
        float dpScale = Utils.dpScale();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<FontCharacter> sparseArrayCompat = new SparseArrayCompat<>();
        LottieComposition lottieComposition = new LottieComposition();
        jsonReader.beginObject();
        int i = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = 0;
        while (jsonReader.hasNext()) {
            switch (jsonReader2.selectName(f41547a)) {
                case 0:
                    i = jsonReader.nextInt();
                    continue;
                    jsonReader2 = jsonReader;
                case 1:
                    i2 = jsonReader.nextInt();
                    continue;
                    jsonReader2 = jsonReader;
                case 2:
                    f = (float) jsonReader.nextDouble();
                    continue;
                    jsonReader2 = jsonReader;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 5:
                    String[] split = jsonReader.nextString().split("\\.");
                    if (!Utils.isAtLeastVersion(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        lottieComposition.addWarning("Lottie only supports bodymovin >= 4.4.0");
                        continue;
                    }
                    jsonReader2 = jsonReader;
                case 6:
                    m50693d(jsonReader2, lottieComposition, arrayList2, longSparseArray);
                    continue;
                    jsonReader2 = jsonReader;
                case 7:
                    m50696a(jsonReader2, lottieComposition, hashMap2, hashMap3);
                    continue;
                    jsonReader2 = jsonReader;
                case 8:
                    m50694c(jsonReader2, hashMap4);
                    continue;
                    jsonReader2 = jsonReader;
                case 9:
                    m50695b(jsonReader2, lottieComposition, sparseArrayCompat);
                    continue;
                    jsonReader2 = jsonReader;
                case 10:
                    m50692e(jsonReader2, arrayList3);
                    continue;
                    jsonReader2 = jsonReader;
                default:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                    jsonReader2 = jsonReader;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            jsonReader2 = jsonReader;
        }
        lottieComposition.init(new Rect(0, 0, (int) (i * dpScale), (int) (i2 * dpScale)), f, f2, f3, arrayList2, longSparseArray, hashMap2, hashMap3, sparseArrayCompat, hashMap4, arrayList3);
        return lottieComposition;
    }
}
