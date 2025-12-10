package ch.qos.logback.core.pattern.parser;

import java.util.List;

/* loaded from: classes.dex */
public class SimpleKeywordNode extends FormattingNode {

    /* renamed from: e */
    public List f39998e;

    public SimpleKeywordNode(int i, Object obj) {
        super(i, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof SimpleKeywordNode)) {
            List list = this.f39998e;
            List list2 = ((SimpleKeywordNode) obj).f39998e;
            return list != null ? list.equals(list2) : list2 == null;
        }
        return false;
    }

    public List<String> getOptions() {
        return this.f39998e;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.f39998e = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        if (this.f39998e == null) {
            sb = new StringBuilder();
            sb.append("KeyWord(");
            sb.append(this.f39988b);
            sb.append(",");
            obj = this.f39986d;
        } else {
            sb = new StringBuilder();
            sb.append("KeyWord(");
            sb.append(this.f39988b);
            sb.append(", ");
            sb.append(this.f39986d);
            sb.append(",");
            obj = this.f39998e;
        }
        sb.append(obj);
        sb.append(")");
        sb2.append(sb.toString());
        sb2.append(m51432a());
        return sb2.toString();
    }

    public SimpleKeywordNode(Object obj) {
        super(1, obj);
    }
}
