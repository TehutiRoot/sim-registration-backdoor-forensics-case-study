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
    public interface InterfaceC3673a {
        int get(int i);
    }

    /* renamed from: androidx.constraintlayout.core.motion.parse.KeyParser$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC3674b {
        int get(String str);
    }

    /* renamed from: a */
    public static TypedBundle m58739a(String str, InterfaceC3674b interfaceC3674b, InterfaceC3673a interfaceC3673a) {
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject parse = CLParser.parse(str);
            int size = parse.size();
            for (int i = 0; i < size; i++) {
                CLKey cLKey = (CLKey) parse.get(i);
                String content = cLKey.content();
                CLElement value = cLKey.getValue();
                int i2 = interfaceC3674b.get(content);
                if (i2 == -1) {
                    PrintStream printStream = System.err;
                    printStream.println("unknown type " + content);
                } else {
                    int i3 = interfaceC3673a.get(i2);
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
        return m58739a(str, new InterfaceC3674b() { // from class: Gh0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.InterfaceC3674b
            public final int get(String str2) {
                return AbstractC20566jW1.m29207a(str2);
            }
        }, new InterfaceC3673a() { // from class: Hh0
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.InterfaceC3673a
            public final int get(int i) {
                return AbstractC20566jW1.m29206b(i);
            }
        });
    }
}
