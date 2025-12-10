package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.collection.SparseArrayCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.airbnb.lottie.C5655L;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.Keyframe;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;

/* renamed from: Oh0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18178Oh0 {

    /* renamed from: b */
    public static SparseArrayCompat f4462b;

    /* renamed from: a */
    public static final Interpolator f4461a = new LinearInterpolator();

    /* renamed from: c */
    public static JsonReader.Options f4463c = JsonReader.Options.m50685of("t", OperatorName.CLOSE_AND_STROKE, "e", "o", "i", OperatorName.CLOSE_PATH, TypedValues.TransitionType.S_TO, "ti");

    /* renamed from: d */
    public static JsonReader.Options f4464d = JsonReader.Options.m50685of("x", OperatorName.CURVE_TO_REPLICATE_FINAL_POINT);

    /* renamed from: a */
    public static WeakReference m67001a(int i) {
        WeakReference weakReference;
        synchronized (AbstractC18178Oh0.class) {
            weakReference = (WeakReference) m66995g().get(i);
        }
        return weakReference;
    }

    /* renamed from: b */
    public static Interpolator m67000b(PointF pointF, PointF pointF2) {
        WeakReference m67001a;
        Interpolator linearInterpolator;
        pointF.x = MiscUtils.clamp(pointF.x, -1.0f, 1.0f);
        pointF.y = MiscUtils.clamp(pointF.y, -100.0f, 100.0f);
        pointF2.x = MiscUtils.clamp(pointF2.x, -1.0f, 1.0f);
        float clamp = MiscUtils.clamp(pointF2.y, -100.0f, 100.0f);
        pointF2.y = clamp;
        int hashFor = Utils.hashFor(pointF.x, pointF.y, pointF2.x, clamp);
        Interpolator interpolator = null;
        if (C5655L.getDisablePathInterpolatorCache()) {
            m67001a = null;
        } else {
            m67001a = m67001a(hashFor);
        }
        if (m67001a != null) {
            interpolator = (Interpolator) m67001a.get();
        }
        if (m67001a == null || interpolator == null) {
            try {
                linearInterpolator = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    linearInterpolator = PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
                } else {
                    linearInterpolator = new LinearInterpolator();
                }
            }
            interpolator = linearInterpolator;
            if (!C5655L.getDisablePathInterpolatorCache()) {
                try {
                    m66994h(hashFor, new WeakReference(interpolator));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return interpolator;
    }

    /* renamed from: c */
    public static Keyframe m66999c(JsonReader jsonReader, LottieComposition lottieComposition, float f, N02 n02, boolean z, boolean z2) {
        if (z && z2) {
            return m66997e(lottieComposition, jsonReader, f, n02);
        }
        if (z) {
            return m66998d(lottieComposition, jsonReader, f, n02);
        }
        return m66996f(jsonReader, f, n02);
    }

    /* renamed from: d */
    public static Keyframe m66998d(LottieComposition lottieComposition, JsonReader jsonReader, float f, N02 n02) {
        Interpolator interpolator;
        Interpolator interpolator2;
        Object obj;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f4463c)) {
                case 0:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    obj3 = n02.parse(jsonReader, f);
                    break;
                case 2:
                    obj2 = n02.parse(jsonReader, f);
                    break;
                case 3:
                    pointF = AbstractC23002xh0.m411e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF2 = AbstractC23002xh0.m411e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 6:
                    pointF3 = AbstractC23002xh0.m411e(jsonReader, f);
                    break;
                case 7:
                    pointF4 = AbstractC23002xh0.m411e(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator2 = f4461a;
            obj = obj3;
        } else {
            if (pointF != null && pointF2 != null) {
                interpolator = m67000b(pointF, pointF2);
            } else {
                interpolator = f4461a;
            }
            interpolator2 = interpolator;
            obj = obj2;
        }
        Keyframe keyframe = new Keyframe(lottieComposition, obj3, obj, interpolator2, f2, null);
        keyframe.pathCp1 = pointF3;
        keyframe.pathCp2 = pointF4;
        return keyframe;
    }

    /* renamed from: e */
    public static Keyframe m66997e(LottieComposition lottieComposition, JsonReader jsonReader, float f, N02 n02) {
        Interpolator interpolator;
        Interpolator m67000b;
        Interpolator m67000b2;
        Object obj;
        PointF pointF;
        Keyframe keyframe;
        PointF pointF2;
        float f2;
        PointF pointF3;
        float f3;
        jsonReader.beginObject();
        PointF pointF4 = null;
        boolean z = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        Object obj2 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f4 = 0.0f;
        PointF pointF11 = null;
        Object obj3 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(f4463c)) {
                case 0:
                    pointF2 = pointF4;
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    pointF2 = pointF4;
                    obj2 = n02.parse(jsonReader, f);
                    break;
                case 2:
                    pointF2 = pointF4;
                    obj3 = n02.parse(jsonReader, f);
                    break;
                case 3:
                    pointF2 = pointF4;
                    f2 = f4;
                    PointF pointF12 = pointF11;
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        while (jsonReader.hasNext()) {
                            int selectName = jsonReader.selectName(f4464d);
                            if (selectName != 0) {
                                if (selectName != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek = jsonReader.peek();
                                    JsonReader.Token token = JsonReader.Token.NUMBER;
                                    if (peek == token) {
                                        f8 = (float) jsonReader.nextDouble();
                                        f6 = f8;
                                    } else {
                                        jsonReader.beginArray();
                                        f6 = (float) jsonReader.nextDouble();
                                        if (jsonReader.peek() == token) {
                                            f8 = (float) jsonReader.nextDouble();
                                        } else {
                                            f8 = f6;
                                        }
                                        jsonReader.endArray();
                                    }
                                }
                            } else {
                                JsonReader.Token peek2 = jsonReader.peek();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (peek2 == token2) {
                                    f7 = (float) jsonReader.nextDouble();
                                    f5 = f7;
                                } else {
                                    jsonReader.beginArray();
                                    f5 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token2) {
                                        f7 = (float) jsonReader.nextDouble();
                                    } else {
                                        f7 = f5;
                                    }
                                    jsonReader.endArray();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f5, f6);
                        PointF pointF14 = new PointF(f7, f8);
                        jsonReader.endObject();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f4 = f2;
                        break;
                    } else {
                        pointF5 = AbstractC23002xh0.m411e(jsonReader, f);
                        f4 = f2;
                        pointF11 = pointF12;
                        break;
                    }
                case 4:
                    if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.beginObject();
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (jsonReader.hasNext()) {
                            PointF pointF15 = pointF11;
                            int selectName2 = jsonReader.selectName(f4464d);
                            if (selectName2 != 0) {
                                pointF3 = pointF4;
                                if (selectName2 != 1) {
                                    jsonReader.skipValue();
                                } else {
                                    JsonReader.Token peek3 = jsonReader.peek();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (peek3 == token3) {
                                        f12 = (float) jsonReader.nextDouble();
                                        f4 = f4;
                                        f10 = f12;
                                    } else {
                                        float f13 = f4;
                                        jsonReader.beginArray();
                                        float nextDouble = (float) jsonReader.nextDouble();
                                        if (jsonReader.peek() == token3) {
                                            f3 = (float) jsonReader.nextDouble();
                                        } else {
                                            f3 = nextDouble;
                                        }
                                        jsonReader.endArray();
                                        f4 = f13;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f12 = f3;
                                        f10 = nextDouble;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f14 = f4;
                                JsonReader.Token peek4 = jsonReader.peek();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (peek4 == token4) {
                                    f11 = (float) jsonReader.nextDouble();
                                    f4 = f14;
                                    f9 = f11;
                                } else {
                                    jsonReader.beginArray();
                                    f9 = (float) jsonReader.nextDouble();
                                    if (jsonReader.peek() == token4) {
                                        f11 = (float) jsonReader.nextDouble();
                                    } else {
                                        f11 = f9;
                                    }
                                    jsonReader.endArray();
                                    f4 = f14;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f2 = f4;
                        PointF pointF16 = new PointF(f9, f10);
                        PointF pointF17 = new PointF(f11, f12);
                        jsonReader.endObject();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f4 = f2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = AbstractC23002xh0.m411e(jsonReader, f);
                        break;
                    }
                case 5:
                    if (jsonReader.nextInt() == 1) {
                        z = true;
                    } else {
                        z = false;
                        continue;
                    }
                case 6:
                    pointF11 = AbstractC23002xh0.m411e(jsonReader, f);
                    continue;
                case 7:
                    pointF4 = AbstractC23002xh0.m411e(jsonReader, f);
                    continue;
                default:
                    jsonReader.skipValue();
                    continue;
            }
            pointF4 = pointF2;
        }
        PointF pointF18 = pointF4;
        float f15 = f4;
        PointF pointF19 = pointF11;
        jsonReader.endObject();
        if (z) {
            interpolator = f4461a;
            obj = obj2;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = m67000b(pointF5, pointF6);
            } else if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                m67000b = m67000b(pointF7, pointF9);
                m67000b2 = m67000b(pointF8, pointF10);
                obj = obj3;
                interpolator = null;
                if (m67000b == null && m67000b2 != null) {
                    pointF = pointF19;
                    keyframe = new Keyframe(lottieComposition, obj2, obj, m67000b, m67000b2, f15, null);
                } else {
                    pointF = pointF19;
                    keyframe = new Keyframe(lottieComposition, obj2, obj, interpolator, f15, null);
                }
                keyframe.pathCp1 = pointF;
                keyframe.pathCp2 = pointF18;
                return keyframe;
            } else {
                interpolator = f4461a;
            }
            obj = obj3;
        }
        m67000b = null;
        m67000b2 = null;
        if (m67000b == null) {
        }
        pointF = pointF19;
        keyframe = new Keyframe(lottieComposition, obj2, obj, interpolator, f15, null);
        keyframe.pathCp1 = pointF;
        keyframe.pathCp2 = pointF18;
        return keyframe;
    }

    /* renamed from: f */
    public static Keyframe m66996f(JsonReader jsonReader, float f, N02 n02) {
        return new Keyframe(n02.parse(jsonReader, f));
    }

    /* renamed from: g */
    public static SparseArrayCompat m66995g() {
        if (f4462b == null) {
            f4462b = new SparseArrayCompat();
        }
        return f4462b;
    }

    /* renamed from: h */
    public static void m66994h(int i, WeakReference weakReference) {
        synchronized (AbstractC18178Oh0.class) {
            f4462b.put(i, weakReference);
        }
    }
}
