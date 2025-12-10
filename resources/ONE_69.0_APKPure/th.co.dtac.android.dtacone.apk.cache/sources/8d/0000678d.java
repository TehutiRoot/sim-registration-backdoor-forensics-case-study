package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import org.apache.commons.cli.HelpFormatter;
import org.apache.http.message.TokenParser;

/* loaded from: classes2.dex */
public class CLElement {
    protected static int BASE_INDENT = 2;
    protected static int MAX_LINE = 80;

    /* renamed from: a */
    public final char[] f32381a;

    /* renamed from: b */
    public int f32382b;
    protected CLContainer mContainer;
    protected long start = -1;
    protected long end = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.f32381a = cArr;
    }

    public void addIndent(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(TokenParser.f74644SP);
        }
    }

    public String content() {
        String str = new String(this.f32381a);
        long j = this.end;
        if (j != Long.MAX_VALUE) {
            long j2 = this.start;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.start;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        if (CLParser.f32388d) {
            return getStrClass() + " -> ";
        }
        return "";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.f32382b;
    }

    public long getStart() {
        return this.start;
    }

    public String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        if (this.end != Long.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public boolean isStarted() {
        if (this.start > -1) {
            return true;
        }
        return false;
    }

    public boolean notStarted() {
        if (this.start == -1) {
            return true;
        }
        return false;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j;
        if (CLParser.f32388d) {
            PrintStream printStream = System.out;
            printStream.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i) {
        this.f32382b = i;
    }

    public void setStart(long j) {
        this.start = j;
    }

    public String toFormattedJSON(int i, int i2) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j = this.start;
        long j2 = this.end;
        if (j <= j2 && j2 != Long.MAX_VALUE) {
            String substring = new String(this.f32381a).substring((int) this.start, ((int) this.end) + 1);
            return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + substring + ">>";
        }
        return getClass() + " (INVALID, " + this.start + HelpFormatter.DEFAULT_OPT_PREFIX + this.end + ")";
    }
}