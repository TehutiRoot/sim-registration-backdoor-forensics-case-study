package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CLKey extends CLContainer {

    /* renamed from: d */
    public static ArrayList f32295d;

    static {
        ArrayList arrayList = new ArrayList();
        f32295d = arrayList;
        arrayList.add("ConstraintSets");
        f32295d.add("Variables");
        f32295d.add("Generate");
        f32295d.add(TypedValues.TransitionType.NAME);
        f32295d.add("KeyFrames");
        f32295d.add(TypedValues.AttributesType.NAME);
        f32295d.add("KeyPositions");
        f32295d.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLKey(cArr);
    }

    public String getName() {
        return content();
    }

    public CLElement getValue() {
        if (this.f32292c.size() > 0) {
            return (CLElement) this.f32292c.get(0);
        }
        return null;
    }

    public void set(CLElement cLElement) {
        if (this.f32292c.size() > 0) {
            this.f32292c.set(0, cLElement);
        } else {
            this.f32292c.add(cLElement);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder(getDebugName());
        addIndent(sb, i);
        String content = content();
        if (this.f32292c.size() > 0) {
            sb.append(content);
            sb.append(": ");
            if (f32295d.contains(content)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(((CLElement) this.f32292c.get(0)).toFormattedJSON(i, i2 - 1));
            } else {
                String json = ((CLElement) this.f32292c.get(0)).toJSON();
                if (json.length() + i < CLElement.MAX_LINE) {
                    sb.append(json);
                } else {
                    sb.append(((CLElement) this.f32292c.get(0)).toFormattedJSON(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        return content + ": <> ";
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        if (this.f32292c.size() > 0) {
            return getDebugName() + content() + ": " + ((CLElement) this.f32292c.get(0)).toJSON();
        }
        return getDebugName() + content() + ": <> ";
    }

    public static CLElement allocate(String str, CLElement cLElement) {
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }
}
