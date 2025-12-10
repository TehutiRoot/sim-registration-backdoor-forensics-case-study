package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;

/* loaded from: classes2.dex */
public class KeyParser {

    /* renamed from: androidx.constraintlayout.core.motion.parse.KeyParser$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3655a {
        int get(int i);
    }

    /* renamed from: androidx.constraintlayout.core.motion.parse.KeyParser$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3656b {
        int get(String str);
    }

    /* renamed from: a */
    public static TypedBundle m58689a(String str, InterfaceC3656b interfaceC3656b, InterfaceC3655a interfaceC3655a) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject parse = CLParser.parse(str);
            int size = parse.size();
            for (int i = 0; i < size; i++) {
                CLKey cLKey = (CLKey) parse.get(i);
                String content = cLKey.content();
                CLElement value = cLKey.getValue();
                int i2 = interfaceC3656b.get(content);
                if (i2 == -1) {
                    PrintStream printStream = System.err;
                    printStream.println("unknown type " + content);
                } else {
                    int i3 = interfaceC3655a.get(i2);
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 4) {
                                if (i3 == 8) {
                                    typedBundle.add(i2, value.content());
                                    PrintStream printStream2 = System.out;
                                    printStream2.println("parse " + content + " STRING_MASK > " + value.content());
                                }
                            } else {
                                typedBundle.add(i2, value.getFloat());
                                PrintStream printStream3 = System.out;
                                printStream3.println("parse " + content + " FLOAT_MASK > " + value.getFloat());
                            }
                        } else {
                            typedBundle.add(i2, value.getInt());
                            PrintStream printStream4 = System.out;
                            printStream4.println("parse " + content + " INT_MASK > " + value.getInt());
                        }
                    } else {
                        typedBundle.add(i2, parse.getBoolean(i));
                    }
                }
            }
        } catch (CLParsingException e) {
            e.printStackTrace();
        }
        return typedBundle;
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    public static TypedBundle parseAttributes(String str) {
        return m58689a(str, new InterfaceC3656b() { // from class: Mh0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.InterfaceC3656b
            public final int get(String str2) {
                return AbstractC20105gX1.m31378a(str2);
            }
        }, new InterfaceC3655a() { // from class: Nh0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.InterfaceC3655a
            public final int get(int i) {
                return AbstractC20105gX1.m31377b(i);
            }
        });
    }
}