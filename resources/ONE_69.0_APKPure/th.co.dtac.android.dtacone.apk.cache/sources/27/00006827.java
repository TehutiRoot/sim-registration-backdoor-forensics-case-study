package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class KeyFrames {
    public static final int UNSET = -1;

    /* renamed from: b */
    public static HashMap f32820b;

    /* renamed from: a */
    public HashMap f32821a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f32820b = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            f32820b.put(TypedValues.PositionType.NAME, KeyPosition.class.getConstructor(null));
            f32820b.put(TypedValues.CycleType.NAME, KeyCycle.class.getConstructor(null));
            f32820b.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            f32820b.put(TypedValues.TriggerType.NAME, KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public KeyFrames() {
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList arrayList = (ArrayList) this.f32821a.get(-1);
        if (arrayList != null) {
            motionController.m58350a(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList arrayList = (ArrayList) this.f32821a.get(Integer.valueOf(motionController.f32890c));
        if (arrayList != null) {
            motionController.m58350a(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f32821a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Key key = (Key) it.next();
                if (key.m58486a(((ConstraintLayout.LayoutParams) motionController.f32889b.getLayoutParams()).constraintTag)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    public void addKey(Key key) {
        if (!this.f32821a.containsKey(Integer.valueOf(key.f32778b))) {
            this.f32821a.put(Integer.valueOf(key.f32778b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) this.f32821a.get(Integer.valueOf(key.f32778b));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i) {
        return (ArrayList) this.f32821a.get(Integer.valueOf(i));
    }

    public Set<Integer> getKeys() {
        return this.f32821a.keySet();
    }

    public KeyFrames(Context context, XmlPullParser xmlPullParser) {
        HashMap hashMap;
        HashMap hashMap2;
        try {
            int eventType = xmlPullParser.getEventType();
            Key key = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && ViewTransition.KEY_FRAME_SET_TAG.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f32820b.containsKey(name)) {
                        try {
                            Constructor constructor = (Constructor) f32820b.get(name);
                            if (constructor != null) {
                                Key key2 = (Key) constructor.newInstance(null);
                                try {
                                    key2.load(context, Xml.asAttributeSet(xmlPullParser));
                                    addKey(key2);
                                } catch (Exception unused) {
                                }
                                key = key2;
                                continue;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                                break;
                            }
                        } catch (Exception unused2) {
                            continue;
                        }
                    } else if (name.equalsIgnoreCase(ViewTransition.CUSTOM_ATTRIBUTE)) {
                        if (key != null && (hashMap2 = key.f32780d) != null) {
                            ConstraintAttribute.parse(context, xmlPullParser, hashMap2);
                            continue;
                        }
                    } else if (name.equalsIgnoreCase(ViewTransition.CUSTOM_METHOD) && key != null && (hashMap = key.f32780d) != null) {
                        ConstraintAttribute.parse(context, xmlPullParser, hashMap);
                        continue;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}